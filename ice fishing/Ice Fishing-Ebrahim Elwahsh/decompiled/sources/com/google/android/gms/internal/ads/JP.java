package com.google.android.gms.internal.ads;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public abstract class JP {

    /* renamed from: a, reason: collision with root package name */
    public static final C3675oC f25768a = UB.j(12);

    public static UB a(AudioDeviceInfo audioDeviceInfo) {
        int type;
        List audioDescriptors;
        UB ub;
        int standard;
        byte[] descriptor;
        List audioDescriptors2;
        int speakerLayoutChannelMask;
        boolean d2 = AbstractC4161xD.d(audioDeviceInfo.getType());
        C3675oC c3675oC = f25768a;
        if (!d2) {
            if (audioDeviceInfo.getType() == 1) {
                return UB.j(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return UB.j(Integer.valueOf(speakerLayoutChannelMask));
                }
                AbstractC3217fl.I("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return c3675oC;
            }
            int i = Build.VERSION.SDK_INT;
            if (i < 31 || audioDeviceInfo.getType() != 10) {
                if (i >= 31) {
                    int type2 = audioDeviceInfo.getType();
                    if (i >= 31 && type2 == 29) {
                        UB b9 = b(audioDeviceInfo);
                        if (!b9.isEmpty()) {
                            return b9;
                        }
                        audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i >= 34) {
                            if (i < 34 || audioDescriptors == null) {
                                ub = C3675oC.f33115x;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                Iterator it = audioDescriptors.iterator();
                                while (it.hasNext()) {
                                    AudioDescriptor e6 = TO.e(it.next());
                                    standard = e6.getStandard();
                                    if (standard == 2) {
                                        descriptor = e6.getDescriptor();
                                        int length = descriptor.length;
                                        if (length != 3) {
                                            com.anythink.basead.b.c.i.s(length, "Invalid SADB length: ", "AudioDescriptorUtil", new StringBuilder(String.valueOf(length).length() + 21));
                                        } else {
                                            if (Build.VERSION.SDK_INT >= 34) {
                                                byte b10 = descriptor[0];
                                                r9 = 1 == (b10 & 1) ? 12 : 0;
                                                if ((b10 & 2) != 0) {
                                                    r9 |= 32;
                                                }
                                                if ((b10 & 4) != 0) {
                                                    r9 |= 16;
                                                }
                                                if ((b10 & 8) != 0) {
                                                    r9 |= 192;
                                                }
                                                if ((b10 & 16) != 0) {
                                                    r9 |= 1024;
                                                }
                                                if ((b10 & 32) != 0) {
                                                    r9 |= 768;
                                                }
                                                if ((b10 & com.anythink.core.common.s.a.c.f16474a) != 0) {
                                                    r9 |= 201326592;
                                                }
                                                byte b11 = descriptor[1];
                                                if ((b11 & 1) != 0) {
                                                    r9 |= 81920;
                                                }
                                                if ((b11 & 2) != 0) {
                                                    r9 |= 8192;
                                                }
                                                if ((b11 & 4) != 0) {
                                                    r9 |= 32768;
                                                }
                                                if ((b11 & 8) != 0) {
                                                    r9 |= 6144;
                                                }
                                                if ((b11 & 16) != 0) {
                                                    r9 |= 33554432;
                                                }
                                                if ((b11 & 32) != 0) {
                                                    r9 |= 262144;
                                                }
                                                if ((b11 & com.anythink.core.common.s.a.c.f16475b) != 0) {
                                                    r9 |= 6144;
                                                }
                                                if ((b11 & com.anythink.core.common.s.a.c.f16474a) != 0) {
                                                    r9 |= 3145728;
                                                }
                                                byte b12 = descriptor[2];
                                                if ((b12 & 1) != 0) {
                                                    r9 |= 655360;
                                                }
                                                if ((b12 & 2) != 0) {
                                                    r9 = 8388608 | r9;
                                                }
                                                if ((b12 & 4) != 0) {
                                                    r9 |= 20971520;
                                                }
                                            }
                                            arrayList.add(Integer.valueOf(r9));
                                        }
                                    }
                                }
                                arrayList.sort(C2959b.f29364I);
                                ub = UB.n(arrayList);
                            }
                            if (!ub.isEmpty()) {
                                return ub;
                            }
                        }
                        UB b13 = AbstractC3406jD.b(audioDescriptors);
                        if (!b13.isEmpty()) {
                            return b13;
                        }
                    }
                }
                if (i >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i >= 31 && type == 22))) {
                    UB b14 = b(audioDeviceInfo);
                    if (!b14.isEmpty()) {
                        return b14;
                    }
                }
            } else {
                UB b15 = b(audioDeviceInfo);
                if (!b15.isEmpty()) {
                    return b15;
                }
                audioDescriptors2 = audioDeviceInfo.getAudioDescriptors();
                UB b16 = AbstractC3406jD.b(audioDescriptors2);
                if (!b16.isEmpty()) {
                    return b16;
                }
            }
        }
        return c3675oC;
    }

    public static UB b(AudioDeviceInfo audioDeviceInfo) {
        List audioProfiles;
        int encapsulationType;
        int format;
        int[] channelMasks;
        audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(C2930aP.f29204c).reversed());
        Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile f6 = TO.f(it.next());
            encapsulationType = f6.getEncapsulationType();
            if (encapsulationType != 1) {
                format = f6.getFormat();
                if (AbstractC3548lu.d(format)) {
                    channelMasks = f6.getChannelMasks();
                    for (int i : channelMasks) {
                        treeSet.add(Integer.valueOf(i));
                    }
                }
            }
        }
        return UB.n(treeSet);
    }
}
