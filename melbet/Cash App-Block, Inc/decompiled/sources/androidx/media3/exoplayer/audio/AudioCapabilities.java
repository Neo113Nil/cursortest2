package androidx.media3.exoplayer.audio;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.compose.ui.window.Api33Impl;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableList;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.squareup.cash.NavigationModule$Companion;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes3.dex */
public final class AudioCapabilities {
    public static final RegularImmutableMap ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS;
    public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES;
    public static final RegularImmutableList DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS;
    public static final RegularImmutableList EXTERNAL_SURROUND_SOUND_ENCODINGS;
    public final SparseArray encodingToAudioProfile = new SparseArray();
    public final int maxChannelCount;
    public final ImmutableList spatializerChannelMasks;
    public final ImmutableList speakerLayoutChannelMasks;

    static {
        RegularImmutableList of = ImmutableList.of((Object) 12);
        DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS = of;
        DEFAULT_AUDIO_CAPABILITIES = new AudioCapabilities(ImmutableList.of((Object) AudioProfile.DEFAULT_AUDIO_PROFILE), of, RegularImmutableList.EMPTY);
        EXTERNAL_SURROUND_SOUND_ENCODINGS = ImmutableList.of((Object) 2, (Object) 5, (Object) 6);
        StatusLine statusLine = new StatusLine(4);
        statusLine.put(5, 6);
        statusLine.put(17, 6);
        statusLine.put(7, 6);
        statusLine.put(30, 10);
        statusLine.put(18, 6);
        statusLine.put(6, 8);
        statusLine.put(8, 8);
        statusLine.put(14, 8);
        ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS = statusLine.build(true);
    }

    public AudioCapabilities(RegularImmutableList regularImmutableList, List list, List list2) {
        for (int i = 0; i < regularImmutableList.size; i++) {
            AudioProfile audioProfile = (AudioProfile) regularImmutableList.get(i);
            this.encodingToAudioProfile.put(audioProfile.f878encoding, audioProfile);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.encodingToAudioProfile.size(); i3++) {
            i2 = Math.max(i2, ((AudioProfile) this.encodingToAudioProfile.valueAt(i3)).maxChannelCount);
        }
        this.maxChannelCount = i2;
        this.speakerLayoutChannelMasks = ImmutableList.copyOf((Collection) list);
        this.spatializerChannelMasks = ImmutableList.copyOf((Collection) list2);
    }

    public static RegularImmutableList getAudioProfiles(int i, int[] iArr) {
        ImmutableList.Builder builder = ImmutableList.builder();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            builder.m2032add((Object) new AudioProfile(i2, i));
        }
        return builder.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
    
        if (r0.equals("Xiaomi") == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AudioCapabilities getCapabilitiesInternal(Context context, Intent intent, AudioAttributes audioAttributes, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioManager audioManager = NavigationModule$Companion.getAudioManager(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? Api33Impl.getDefaultRoutedDeviceForAttributes(audioManager, audioAttributes) : null;
        }
        ImmutableList loudspeakerLayoutChannelMasks = audioDeviceInfo != null ? SpeakerLayoutUtil.getLoudspeakerLayoutChannelMasks(audioDeviceInfo) : DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS;
        if (Build.VERSION.SDK_INT >= 33 && (Util.isTv(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return Api33Impl.getCapabilitiesInternalForDirectPlayback(audioManager, audioAttributes, loudspeakerLayoutChannelMasks, list);
        }
        AudioDeviceInfo[] devices = audioDeviceInfo == null ? audioManager.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo};
        for (AudioDeviceInfo audioDeviceInfo2 : devices) {
            if (DeviceTypeUtil.isBluetoothDevice(audioDeviceInfo2.getType())) {
                return new AudioCapabilities(ImmutableList.of((Object) AudioProfile.DEFAULT_AUDIO_PROFILE), loudspeakerLayoutChannelMasks, list);
            }
        }
        ImmutableSet.Builder builder = new ImmutableSet.Builder(4);
        builder.m2032add((Object) 2);
        if (Util.isTv(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            ImmutableList.Builder builder2 = ImmutableList.builder();
            UnmodifiableIterator it = ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                if (Build.VERSION.SDK_INT >= Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), audioAttributes.getPlatformAudioAttributes())) {
                    builder2.m2032add((Object) num);
                }
            }
            builder2.m2032add((Object) 2);
            RegularImmutableList build = builder2.build();
            build.getClass();
            builder.addAll(build);
            return new AudioCapabilities(getAudioProfiles(10, CompositeException.WrappedPrintStream.toArray(builder.build())), loudspeakerLayoutChannelMasks, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (!str.equals("Amazon")) {
            }
        }
        if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            RegularImmutableList regularImmutableList = EXTERNAL_SURROUND_SOUND_ENCODINGS;
            regularImmutableList.getClass();
            builder.addAll(regularImmutableList);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new AudioCapabilities(getAudioProfiles(10, CompositeException.WrappedPrintStream.toArray(builder.build())), loudspeakerLayoutChannelMasks, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List asList = CompositeException.WrappedPrintStream.asList(intArrayExtra);
            asList.getClass();
            builder.addAll(asList);
        }
        return new AudioCapabilities(getAudioProfiles(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), CompositeException.WrappedPrintStream.toArray(builder.build())), loudspeakerLayoutChannelMasks, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
        return Util.contentEquals(this.encodingToAudioProfile, audioCapabilities.encodingToAudioProfile) && this.maxChannelCount == audioCapabilities.maxChannelCount && Objects.equals(this.speakerLayoutChannelMasks, audioCapabilities.speakerLayoutChannelMasks) && Objects.equals(this.spatializerChannelMasks, audioCapabilities.spatializerChannelMasks);
    }

    public final Pair getEncodingAndChannelConfigForPassthrough(AudioAttributes audioAttributes, Format format2) {
        String str = format2.sampleMimeType;
        str.getClass();
        int encoding2 = MimeTypes.getEncoding(str, format2.codecs);
        if (!ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(encoding2))) {
            return null;
        }
        SparseArray sparseArray = this.encodingToAudioProfile;
        if (encoding2 == 18 && !Util.contains(sparseArray, 18)) {
            encoding2 = 6;
        } else if ((encoding2 == 8 && !Util.contains(sparseArray, 8)) || (encoding2 == 30 && !Util.contains(sparseArray, 30))) {
            encoding2 = 7;
        }
        if (!Util.contains(sparseArray, encoding2)) {
            return null;
        }
        AudioProfile audioProfile = (AudioProfile) sparseArray.get(encoding2);
        audioProfile.getClass();
        int i = audioProfile.maxChannelCount;
        ImmutableSet immutableSet = audioProfile.channelMasks;
        int i2 = format2.channelCount;
        boolean z = false;
        if (i2 == -1 || encoding2 == 18) {
            int i3 = format2.sampleRate;
            if (i3 == -1) {
                i3 = 48000;
            }
            if (immutableSet == null) {
                int i4 = audioProfile.f878encoding;
                i = 10;
                while (true) {
                    if (i <= 0) {
                        i = 0;
                        break;
                    }
                    int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(i);
                    if (audioTrackChannelConfig != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i4).setSampleRate(i3).setChannelMask(audioTrackChannelConfig).build(), audioAttributes.getPlatformAudioAttributes())) {
                        break;
                    }
                    i--;
                }
            }
            i2 = i;
        } else if (!format2.sampleMimeType.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (immutableSet != null) {
                int audioTrackChannelConfig2 = Util.getAudioTrackChannelConfig(i2);
                if (audioTrackChannelConfig2 != 0) {
                    z = immutableSet.contains(Integer.valueOf(audioTrackChannelConfig2));
                }
            } else if (i2 <= i) {
                z = true;
            }
            if (!z) {
                return null;
            }
        } else if (i2 > 10) {
            return null;
        }
        int audioTrackChannelConfig3 = Util.getAudioTrackChannelConfig(i2);
        if (audioTrackChannelConfig3 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(encoding2), Integer.valueOf(audioTrackChannelConfig3));
    }

    public final int hashCode() {
        return Objects.hashCode(this.spatializerChannelMasks) + ((Objects.hashCode(this.speakerLayoutChannelMasks) + ((Util.contentHashCode(this.encodingToAudioProfile) + (this.maxChannelCount * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.maxChannelCount + ", audioProfiles=" + this.encodingToAudioProfile + ", speakerLayoutChannelMasks=" + this.speakerLayoutChannelMasks + ", spatializerChannelMasks=" + this.spatializerChannelMasks + "]";
    }

    public final class AudioProfile {
        public static final AudioProfile DEFAULT_AUDIO_PROFILE;
        public final ImmutableSet channelMasks;

        /* renamed from: encoding, reason: collision with root package name */
        public final int f878encoding;
        public final int maxChannelCount;

        static {
            AudioProfile audioProfile;
            if (Build.VERSION.SDK_INT >= 33) {
                ImmutableSet.Builder builder = new ImmutableSet.Builder(4);
                for (int i = 1; i <= 10; i++) {
                    builder.m2032add((Object) Integer.valueOf(Util.getAudioTrackChannelConfig(i)));
                }
                audioProfile = new AudioProfile(2, builder.build());
            } else {
                audioProfile = new AudioProfile(2, 10);
            }
            DEFAULT_AUDIO_PROFILE = audioProfile;
        }

        public AudioProfile(int i, Set set) {
            this.f878encoding = i;
            ImmutableSet copyOf = ImmutableSet.copyOf((Collection) set);
            this.channelMasks = copyOf;
            UnmodifiableIterator it = copyOf.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.maxChannelCount = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioProfile)) {
                return false;
            }
            AudioProfile audioProfile = (AudioProfile) obj;
            return this.f878encoding == audioProfile.f878encoding && this.maxChannelCount == audioProfile.maxChannelCount && Objects.equals(this.channelMasks, audioProfile.channelMasks);
        }

        public final int hashCode() {
            int i = ((this.f878encoding * 31) + this.maxChannelCount) * 31;
            ImmutableSet immutableSet = this.channelMasks;
            return i + (immutableSet == null ? 0 : immutableSet.hashCode());
        }

        public final String toString() {
            return "AudioProfile[format=" + this.f878encoding + ", maxChannelCount=" + this.maxChannelCount + ", channelMasks=" + this.channelMasks + "]";
        }

        public AudioProfile(int i, int i2) {
            this.f878encoding = i;
            this.maxChannelCount = i2;
            this.channelMasks = null;
        }
    }
}
