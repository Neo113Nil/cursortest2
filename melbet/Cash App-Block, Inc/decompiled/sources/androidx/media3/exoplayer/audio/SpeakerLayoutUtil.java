package androidx.media3.exoplayer.audio;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import androidx.core.view.DisplayCompat;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Id3Peeker$$ExternalSyntheticBUOutline0;
import bo.app.ng$$ExternalSyntheticLambda0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import net.idrnd.face.iad.capture.internal.d4$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class SpeakerLayoutUtil {
    public static final RegularImmutableList DEFAULT_CHANNEL_MASK = ImmutableList.of((Object) 12);

    public static ImmutableList getChannelMasksFromPcmAudioProfiles(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(new d4$$ExternalSyntheticLambda0(1)).reversed());
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && Util.isEncodingLinearPcm(audioProfile.getFormat())) {
                for (int i : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return ImmutableList.copyOf((Collection) treeSet);
    }

    public static ImmutableList getLoudspeakerLayoutChannelMasks(AudioDeviceInfo audioDeviceInfo) {
        int type2;
        ImmutableList immutableList;
        int speakerLayoutChannelMask;
        boolean isBluetoothDevice = DeviceTypeUtil.isBluetoothDevice(audioDeviceInfo.getType());
        RegularImmutableList regularImmutableList = DEFAULT_CHANNEL_MASK;
        if (!isBluetoothDevice) {
            if (audioDeviceInfo.getType() == 1) {
                return ImmutableList.of((Object) 4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return ImmutableList.of((Object) Integer.valueOf(speakerLayoutChannelMask));
                }
                Log.w("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return regularImmutableList;
            }
            int i = Build.VERSION.SDK_INT;
            if (i < 31 || audioDeviceInfo.getType() != 10) {
                if (i >= 31) {
                    int type3 = audioDeviceInfo.getType();
                    if (i >= 31 && type3 == 29) {
                        ImmutableList channelMasksFromPcmAudioProfiles = getChannelMasksFromPcmAudioProfiles(audioDeviceInfo);
                        if (!channelMasksFromPcmAudioProfiles.isEmpty()) {
                            return channelMasksFromPcmAudioProfiles;
                        }
                        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i >= 34) {
                            if (i < 34 || audioDescriptors == null) {
                                ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                                immutableList = RegularImmutableList.EMPTY;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                Iterator<AudioDescriptor> it = audioDescriptors.iterator();
                                while (it.hasNext()) {
                                    AudioDescriptor m = Id3Peeker$$ExternalSyntheticBUOutline0.m(it.next());
                                    if (m.getStandard() == 2) {
                                        byte[] descriptor = m.getDescriptor();
                                        if (descriptor.length != 3) {
                                            Log.w("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                        } else {
                                            if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                                byte b = descriptor[0];
                                                r10 = (b & 1) != 0 ? 12 : 0;
                                                if ((b & 2) != 0) {
                                                    r10 |= 32;
                                                }
                                                if ((b & 4) != 0) {
                                                    r10 |= 16;
                                                }
                                                if ((b & 8) != 0) {
                                                    r10 |= 192;
                                                }
                                                if ((b & 16) != 0) {
                                                    r10 |= 1024;
                                                }
                                                if ((b & PnmConstants.PNM_SEPARATOR) != 0) {
                                                    r10 |= 768;
                                                }
                                                if ((b & 128) != 0) {
                                                    r10 |= 201326592;
                                                }
                                                byte b2 = descriptor[1];
                                                if ((b2 & 1) != 0) {
                                                    r10 |= 81920;
                                                }
                                                if ((b2 & 2) != 0) {
                                                    r10 |= PKIFailureInfo.certRevoked;
                                                }
                                                if ((b2 & 4) != 0) {
                                                    r10 |= 32768;
                                                }
                                                if ((b2 & 8) != 0) {
                                                    r10 |= 6144;
                                                }
                                                if ((b2 & 16) != 0) {
                                                    r10 |= 33554432;
                                                }
                                                if ((b2 & PnmConstants.PNM_SEPARATOR) != 0) {
                                                    r10 |= PKIFailureInfo.transactionIdInUse;
                                                }
                                                if ((b2 & 64) != 0) {
                                                    r10 |= 6144;
                                                }
                                                if ((b2 & 128) != 0) {
                                                    r10 |= 3145728;
                                                }
                                                byte b3 = descriptor[2];
                                                if ((b3 & 1) != 0) {
                                                    r10 |= 655360;
                                                }
                                                if ((b3 & 2) != 0) {
                                                    r10 = 8388608 | r10;
                                                }
                                                if ((b3 & 4) != 0) {
                                                    r10 |= 20971520;
                                                }
                                            }
                                            arrayList.add(Integer.valueOf(r10));
                                        }
                                    }
                                }
                                arrayList.sort(new ng$$ExternalSyntheticLambda0(6));
                                immutableList = ImmutableList.copyOf((Collection) arrayList);
                            }
                            if (!immutableList.isEmpty()) {
                                return immutableList;
                            }
                        }
                        ImmutableList allLpcmChannelMasksFromPcmSads = DisplayCompat.getAllLpcmChannelMasksFromPcmSads(audioDescriptors);
                        if (!allLpcmChannelMasksFromPcmSads.isEmpty()) {
                            return allLpcmChannelMasksFromPcmSads;
                        }
                    }
                }
                if (i >= 31 && ((type2 = audioDeviceInfo.getType()) == 11 || type2 == 12 || (i >= 31 && type2 == 22))) {
                    ImmutableList channelMasksFromPcmAudioProfiles2 = getChannelMasksFromPcmAudioProfiles(audioDeviceInfo);
                    if (!channelMasksFromPcmAudioProfiles2.isEmpty()) {
                        return channelMasksFromPcmAudioProfiles2;
                    }
                }
            } else {
                ImmutableList channelMasksFromPcmAudioProfiles3 = getChannelMasksFromPcmAudioProfiles(audioDeviceInfo);
                if (!channelMasksFromPcmAudioProfiles3.isEmpty()) {
                    return channelMasksFromPcmAudioProfiles3;
                }
                ImmutableList allLpcmChannelMasksFromPcmSads2 = DisplayCompat.getAllLpcmChannelMasksFromPcmSads(audioDeviceInfo.getAudioDescriptors());
                if (!allLpcmChannelMasksFromPcmSads2.isEmpty()) {
                    return allLpcmChannelMasksFromPcmSads2;
                }
            }
        }
        return regularImmutableList;
    }
}
