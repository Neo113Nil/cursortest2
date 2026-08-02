package androidx.media3.exoplayer.audio;

import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.exoplayer.util.SpatializerWrapper;
import androidx.media3.extractor.Id3Peeker$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.time.zzbq;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class AudioCapabilitiesReceiver {
    public AudioAttributes audioAttributes;
    public AudioCapabilities audioCapabilities;
    public final AudioDeviceCallback audioDeviceCallback;
    public final Context context;
    public final ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver;
    public final Handler handler;
    public final zzbq hdmiAudioPlugBroadcastReceiver;
    public final ExoPlayerImplInternal$$ExternalSyntheticLambda2 listener;
    public boolean registered;
    public AudioDeviceInfo routedDevice;
    public SpatializerWrapper spatializer;

    public final class AudioDeviceCallback extends android.media.AudioDeviceCallback {
        public AudioDeviceCallback() {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioCapabilitiesReceiver.this.updateCurrentAudioCapabilities();
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            AudioDeviceInfo audioDeviceInfo = audioCapabilitiesReceiver.routedDevice;
            String str = Util.DEVICE_DEBUG_INFO;
            int length = audioDeviceInfoArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (Objects.equals(audioDeviceInfoArr[i], audioDeviceInfo)) {
                    audioCapabilitiesReceiver.routedDevice = null;
                    break;
                }
                i++;
            }
            audioCapabilitiesReceiver.updateCurrentAudioCapabilities();
        }
    }

    public final class ExternalSurroundSoundSettingObserver extends ContentObserver {
        public final ContentResolver resolver;
        public final Uri settingUri;

        public ExternalSurroundSoundSettingObserver(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.resolver = contentResolver;
            this.settingUri = uri;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            AudioCapabilitiesReceiver.this.updateCurrentAudioCapabilities();
        }
    }

    public AudioCapabilitiesReceiver(Context context, ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2, AudioAttributes audioAttributes, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.listener = exoPlayerImplInternal$$ExternalSyntheticLambda2;
        this.audioAttributes = audioAttributes;
        this.routedDevice = audioDeviceInfo;
        String str = Util.DEVICE_DEBUG_INFO;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.handler = handler;
        this.audioDeviceCallback = new AudioDeviceCallback();
        this.hdmiAudioPlugBroadcastReceiver = new zzbq(this, 3);
        RegularImmutableList regularImmutableList = AudioCapabilities.DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.externalSurroundSoundSettingObserver = uriFor != null ? new ExternalSurroundSoundSettingObserver(handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List getSpatializerChannelMasks() {
        SpatializerWrapper spatializerWrapper;
        if (Build.VERSION.SDK_INT >= 32 && (spatializerWrapper = this.spatializer) != null) {
            return spatializerWrapper.getSpatializedChannelMasks();
        }
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        return RegularImmutableList.EMPTY;
    }

    public final void onNewAudioCapabilities(AudioCapabilities audioCapabilities) {
        if (!this.registered || audioCapabilities.equals(this.audioCapabilities)) {
            return;
        }
        this.audioCapabilities = audioCapabilities;
        AudioTrackAudioOutputProvider audioTrackAudioOutputProvider = (AudioTrackAudioOutputProvider) this.listener.f$0;
        audioTrackAudioOutputProvider.verifySinglePlaybackLooper();
        AudioCapabilities audioCapabilities2 = audioTrackAudioOutputProvider.audioCapabilities;
        if (audioCapabilities2 == null || audioCapabilities.equals(audioCapabilities2)) {
            return;
        }
        audioTrackAudioOutputProvider.audioCapabilities = audioCapabilities;
        ListenerSet listenerSet = audioTrackAudioOutputProvider.listeners;
        if (listenerSet != null) {
            listenerSet.sendEvent(-1, new Id3Peeker$$ExternalSyntheticBUOutline0(11));
        }
    }

    public final void updateCurrentAudioCapabilities() {
        List spatializerChannelMasks = getSpatializerChannelMasks();
        AudioAttributes audioAttributes = this.audioAttributes;
        AudioDeviceInfo audioDeviceInfo = this.routedDevice;
        RegularImmutableList regularImmutableList = AudioCapabilities.DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.context;
        onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(context, context.registerReceiver(null, intentFilter), audioAttributes, audioDeviceInfo, spatializerChannelMasks));
    }
}
