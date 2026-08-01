package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class KO {

    /* renamed from: e, reason: collision with root package name */
    public static final C3500lC f25915e;

    /* renamed from: f, reason: collision with root package name */
    public static final KO f25916f;

    /* renamed from: g, reason: collision with root package name */
    public static final C3500lC f25917g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3770qC f25918h;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f25919a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f25920b;

    /* renamed from: c, reason: collision with root package name */
    public final RB f25921c;

    /* renamed from: d, reason: collision with root package name */
    public final RB f25922d;

    static {
        C3500lC j6 = RB.j(12);
        f25915e = j6;
        f25916f = new KO(RB.j(JO.f25679d), j6, C3500lC.f31745x);
        Object[] objArr = {2, 5, 6};
        AbstractC2772Sd.j(objArr, 3);
        f25917g = RB.p(objArr, 3);
        C3493l5 c3493l5 = new C3493l5(4);
        c3493l5.e(5, 6);
        c3493l5.e(17, 6);
        c3493l5.e(7, 6);
        c3493l5.e(30, 10);
        c3493l5.e(18, 6);
        c3493l5.e(6, 8);
        c3493l5.e(8, 8);
        c3493l5.e(14, 8);
        f25918h = c3493l5.s(true);
    }

    public KO(C3500lC c3500lC, RB rb, List list) {
        for (int i = 0; i < c3500lC.f31747w; i++) {
            JO jo = (JO) c3500lC.get(i);
            this.f25919a.put(jo.f25680a, jo);
        }
        int i6 = 0;
        for (int i9 = 0; i9 < this.f25919a.size(); i9++) {
            i6 = Math.max(i6, ((JO) this.f25919a.valueAt(i9)).f25681b);
        }
        this.f25920b = i6;
        this.f25921c = RB.n(rb);
        this.f25922d = RB.n(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x021a, code lost:
    
        if (r1.equals("Xiaomi") == false) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static KO a(Context context, Intent intent, C2744Qj c2744Qj, AudioDeviceInfo audioDeviceInfo, List list) {
        int i;
        boolean isDirectPlaybackSupported;
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        List audioDevicesForAttributes;
        AudioManager b9 = AbstractC2639Kg.b(context);
        int i6 = 0;
        if (audioDeviceInfo == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                audioDevicesForAttributes = b9.getAudioDevicesForAttributes(c2744Qj.a());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo = (AudioDeviceInfo) audioDevicesForAttributes.get(0);
                }
            }
            audioDeviceInfo = null;
        }
        RB a9 = audioDeviceInfo != null ? AbstractC4106wP.a(audioDeviceInfo) : f25915e;
        int i9 = Build.VERSION.SDK_INT;
        C3770qC c3770qC = f25918h;
        if (i9 >= 33 && (AbstractC3159eu.j(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            directProfilesForAttributes = b9.getDirectProfilesForAttributes(c2744Qj.a());
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(UC.o(12)));
            for (int i10 = 0; i10 < directProfilesForAttributes.size(); i10++) {
                AudioProfile f3 = GO.f(directProfilesForAttributes.get(i10));
                encapsulationType = f3.getEncapsulationType();
                if (encapsulationType != 1) {
                    format = f3.getFormat();
                    if (AbstractC3159eu.d(format) || c3770qC.containsKey(Integer.valueOf(format))) {
                        Integer valueOf = Integer.valueOf(format);
                        if (hashMap.containsKey(valueOf)) {
                            Set set = (Set) hashMap.get(valueOf);
                            set.getClass();
                            channelMasks2 = f3.getChannelMasks();
                            set.addAll(UC.o(channelMasks2));
                        } else {
                            channelMasks = f3.getChannelMasks();
                            hashMap.put(valueOf, new HashSet(UC.o(channelMasks)));
                        }
                    }
                }
            }
            PB pb = RB.f27177u;
            MA.q(4, "initialCapacity");
            Object[] objArr = new Object[4];
            for (Map.Entry entry : hashMap.entrySet()) {
                JO jo = new JO(((Integer) entry.getKey()).intValue(), (Set) entry.getValue());
                int length = objArr.length;
                int i11 = i6 + 1;
                int d2 = MB.d(length, i11);
                if (d2 > length) {
                    objArr = Arrays.copyOf(objArr, d2);
                }
                objArr[i6] = jo;
                i6 = i11;
            }
            return new KO(RB.p(objArr, i6), a9, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? b9.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (UC.d(audioDeviceInfo2.getType())) {
                return new KO(RB.j(JO.f25679d), a9, list);
            }
        }
        WB wb = new WB(4);
        wb.f(2);
        if (Build.VERSION.SDK_INT < 29 || !(AbstractC3159eu.j(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            ContentResolver contentResolver = context.getContentResolver();
            boolean z3 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
            if (!z3) {
                String str = Build.MANUFACTURER;
                if (!str.equals("Amazon")) {
                }
            }
            if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                wb.g(f25917g);
            }
            if (intent == null || z3 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
                return new KO(c(UC.n(wb.h()), 10), a9, list);
            }
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                wb.g(UC.o(intArrayExtra));
            }
            return new KO(c(UC.n(wb.h()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), a9, list);
        }
        PB pb2 = RB.f27177u;
        OB ob = new OB(4);
        C3662oC c3662oC = c3770qC.f33211u;
        if (c3662oC == null) {
            C3662oC c3662oC2 = new C3662oC(c3770qC, new C3716pC(c3770qC.f33214x, 0, c3770qC.f33215y));
            c3770qC.f33211u = c3662oC2;
            c3662oC = c3662oC2;
        }
        AbstractC4255zC a10 = c3662oC.a();
        while (a10.hasNext()) {
            Integer num = (Integer) a10.next();
            int intValue = num.intValue();
            switch (intValue) {
                case 2:
                case 3:
                    i = 3;
                    break;
                case 4:
                case 5:
                case 6:
                    i = 21;
                    break;
                case 7:
                case 8:
                    i = 23;
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                    i = 28;
                    break;
                case 13:
                case 19:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                default:
                    i = Integer.MAX_VALUE;
                    break;
                case 14:
                    i = 25;
                    break;
                case 20:
                    i = 30;
                    break;
                case 21:
                case 22:
                    i = 31;
                    break;
                case 30:
                case 31:
                    i = 34;
                    break;
            }
            if (Build.VERSION.SDK_INT >= i) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), c2744Qj.a());
                if (isDirectPlaybackSupported) {
                    ob.a(num);
                }
            }
        }
        ob.a(2);
        wb.g(ob.f());
        return new KO(c(UC.n(wb.h()), 10), a9, list);
    }

    public static C3500lC c(int[] iArr, int i) {
        PB pb = RB.f27177u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i6 = 0;
        if (iArr == null) {
            iArr = new int[0];
        }
        int i9 = 0;
        while (i6 < iArr.length) {
            JO jo = new JO(iArr[i6], i);
            int length = objArr.length;
            int i10 = i9 + 1;
            int d2 = MB.d(length, i10);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i9] = jo;
            i6++;
            i9 = i10;
        }
        return RB.p(objArr, i9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0046, code lost:
    
        if (r5.indexOfKey(30) < 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair b(DP dp, C2744Qj c2744Qj) {
        boolean isDirectPlaybackSupported;
        int i;
        String str = dp.f24431o;
        str.getClass();
        int g4 = H4.g(str, dp.f24427k);
        Integer valueOf = Integer.valueOf(g4);
        C3770qC c3770qC = f25918h;
        if (!c3770qC.containsKey(valueOf)) {
            return null;
        }
        SparseArray sparseArray = this.f25919a;
        if (g4 == 18) {
            if (sparseArray.indexOfKey(18) >= 0) {
                g4 = 18;
            } else {
                g4 = 6;
                if (sparseArray.indexOfKey(g4) < 0) {
                    return null;
                }
                JO jo = (JO) sparseArray.get(g4);
                jo.getClass();
                int i6 = 0;
                r11 = false;
                boolean contains = false;
                int i9 = 10;
                int i10 = dp.f24410I;
                int i11 = dp.f24409H;
                int i12 = jo.f25681b;
                XB xb = jo.f25682c;
                if (i11 == -1 || g4 == 18) {
                    int i13 = dp.J;
                    if (i13 == -1) {
                        i13 = 48000;
                    }
                    if (xb != null) {
                        i6 = i12;
                    } else {
                        int i14 = Build.VERSION.SDK_INT;
                        int i15 = jo.f25680a;
                        if (i14 >= 29) {
                            while (true) {
                                if (i9 <= 0) {
                                    break;
                                }
                                int e9 = AbstractC3159eu.e(i9);
                                if (e9 != 0) {
                                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i15).setSampleRate(i13).setChannelMask(e9).build(), c2744Qj.a());
                                    if (isDirectPlaybackSupported) {
                                        i6 = i9;
                                        break;
                                    }
                                }
                                i9--;
                            }
                        } else {
                            Object obj = c3770qC.get(Integer.valueOf(i15));
                            i6 = ((Integer) (obj != null ? obj : 0)).intValue();
                        }
                    }
                } else {
                    if (!str.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                        if (xb != null) {
                            int e10 = i10 != -1 ? i10 : AbstractC3159eu.e(i11);
                            if (e10 != 0) {
                                contains = xb.contains(Integer.valueOf(e10));
                            }
                        } else if (i11 <= i12) {
                            contains = true;
                        }
                        if (!contains) {
                            return null;
                        }
                    } else if (i11 > 10) {
                        return null;
                    }
                    i6 = i11;
                }
                int i16 = Build.VERSION.SDK_INT;
                if (i16 <= 28) {
                    if (i6 == 7) {
                        i = 8;
                    } else if (i6 == 3 || i6 == 4 || i6 == 5) {
                        i = 6;
                    }
                    if (i16 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
                        i = 2;
                    }
                    if (i10 != -1 || i11 != i) {
                        i10 = AbstractC3159eu.e(i);
                    }
                    if (i10 == 0) {
                        return Pair.create(Integer.valueOf(g4), Integer.valueOf(i10));
                    }
                    return null;
                }
                i = i6;
                if (i16 <= 26) {
                    i = 2;
                }
                if (i10 != -1) {
                }
                i10 = AbstractC3159eu.e(i);
                if (i10 == 0) {
                }
            }
        }
        if (g4 == 8) {
            if (sparseArray.indexOfKey(8) >= 0) {
                g4 = 8;
            }
            g4 = 7;
            if (sparseArray.indexOfKey(g4) < 0) {
            }
        }
        if (g4 == 30) {
        }
        if (sparseArray.indexOfKey(g4) < 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r1 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean contentEquals;
        if (this != obj) {
            if (obj instanceof KO) {
                KO ko = (KO) obj;
                SparseArray sparseArray = this.f25919a;
                SparseArray sparseArray2 = ko.f25919a;
                String str = AbstractC3159eu.f29993a;
                if (Build.VERSION.SDK_INT >= 31) {
                    contentEquals = sparseArray.contentEquals(sparseArray2);
                } else {
                    int size = sparseArray.size();
                    if (size == sparseArray2.size()) {
                        for (int i = 0; i < size; i++) {
                            if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                                break;
                            }
                        }
                        if (this.f25920b != ko.f25920b || !Objects.equals(this.f25921c, ko.f25921c) || !Objects.equals(this.f25922d, ko.f25922d)) {
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str = AbstractC3159eu.f29993a;
        int i6 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.f25919a;
        if (i6 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i9 = 17;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                i9 = Objects.hashCode(sparseArray.valueAt(i10)) + ((sparseArray.keyAt(i10) + (i9 * 31)) * 31);
            }
            i = i9;
        }
        return Objects.hashCode(this.f25922d) + ((Objects.hashCode(this.f25921c) + (((this.f25920b * 31) + i) * 31)) * 31);
    }

    public final String toString() {
        String obj = this.f25919a.toString();
        String valueOf = String.valueOf(this.f25921c);
        String valueOf2 = String.valueOf(this.f25922d);
        int i = this.f25920b;
        int length = String.valueOf(i).length();
        int length2 = obj.length();
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 28 + valueOf.length() + 26 + valueOf2.length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", audioProfiles=");
        sb.append(obj);
        u1.h.i(sb, ", speakerLayoutChannelMasks=", valueOf, ", spatializerChannelMasks=", valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
