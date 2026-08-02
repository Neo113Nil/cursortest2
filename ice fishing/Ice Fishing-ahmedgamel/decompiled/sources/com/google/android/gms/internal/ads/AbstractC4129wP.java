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

/* renamed from: com.google.android.gms.internal.ads.wP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4129wP {

    /* renamed from: a, reason: collision with root package name */
    public static final C3523lC f35605a = RB.j(12);

    public static RB a(AudioDeviceInfo audioDeviceInfo) {
        int type;
        List audioDescriptors;
        RB rb;
        int standard;
        byte[] descriptor;
        List audioDescriptors2;
        int speakerLayoutChannelMask;
        boolean d9 = UC.d(audioDeviceInfo.getType());
        C3523lC c3523lC = f35605a;
        if (!d9) {
            if (audioDeviceInfo.getType() == 1) {
                return RB.j(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return RB.j(Integer.valueOf(speakerLayoutChannelMask));
                }
                AbstractC2991bG.y("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return c3523lC;
            }
            int i = Build.VERSION.SDK_INT;
            if (i < 31 || audioDeviceInfo.getType() != 10) {
                if (i >= 31) {
                    int type2 = audioDeviceInfo.getType();
                    if (i >= 31 && type2 == 29) {
                        RB b9 = b(audioDeviceInfo);
                        if (!b9.isEmpty()) {
                            return b9;
                        }
                        audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i >= 34) {
                            if (i < 34 || audioDescriptors == null) {
                                rb = C3523lC.f32525x;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                Iterator it = audioDescriptors.iterator();
                                while (it.hasNext()) {
                                    AudioDescriptor e9 = GO.e(it.next());
                                    standard = e9.getStandard();
                                    if (standard == 2) {
                                        descriptor = e9.getDescriptor();
                                        int length = descriptor.length;
                                        if (length != 3) {
                                            com.IceFishing.LiveIceFishing.k.t(length, "Invalid SADB length: ", "AudioDescriptorUtil", new StringBuilder(String.valueOf(length).length() + 21));
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
                                                if ((b10 & com.anythink.core.common.s.a.c.f17103a) != 0) {
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
                                                if ((b11 & com.anythink.core.common.s.a.c.f17104b) != 0) {
                                                    r9 |= 6144;
                                                }
                                                if ((b11 & com.anythink.core.common.s.a.c.f17103a) != 0) {
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
                                arrayList.sort(C3027c.J);
                                rb = RB.n(arrayList);
                            }
                            if (!rb.isEmpty()) {
                                return rb;
                            }
                        }
                        RB b13 = QC.b(audioDescriptors);
                        if (!b13.isEmpty()) {
                            return b13;
                        }
                    }
                }
                if (i >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i >= 31 && type == 22))) {
                    RB b14 = b(audioDeviceInfo);
                    if (!b14.isEmpty()) {
                        return b14;
                    }
                }
            } else {
                RB b15 = b(audioDeviceInfo);
                if (!b15.isEmpty()) {
                    return b15;
                }
                audioDescriptors2 = audioDeviceInfo.getAudioDescriptors();
                RB b16 = QC.b(audioDescriptors2);
                if (!b16.isEmpty()) {
                    return b16;
                }
            }
        }
        return c3523lC;
    }

    public static RB b(AudioDeviceInfo audioDeviceInfo) {
        List audioProfiles;
        int encapsulationType;
        int format;
        int[] channelMasks;
        audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(NO.f27271c).reversed());
        Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile f2 = GO.f(it.next());
            encapsulationType = f2.getEncapsulationType();
            if (encapsulationType != 1) {
                format = f2.getFormat();
                if (AbstractC3182eu.d(format)) {
                    channelMasks = f2.getChannelMasks();
                    for (int i : channelMasks) {
                        treeSet.add(Integer.valueOf(i));
                    }
                }
            }
        }
        return RB.n(treeSet);
    }
}
