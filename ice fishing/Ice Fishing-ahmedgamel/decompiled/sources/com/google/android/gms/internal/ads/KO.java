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
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class KO {

    /* renamed from: e, reason: collision with root package name */
    public static final C3523lC f26667e;

    /* renamed from: f, reason: collision with root package name */
    public static final KO f26668f;

    /* renamed from: g, reason: collision with root package name */
    public static final C3523lC f26669g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3793qC f26670h;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f26671a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f26672b;

    /* renamed from: c, reason: collision with root package name */
    public final RB f26673c;

    /* renamed from: d, reason: collision with root package name */
    public final RB f26674d;

    static {
        C3523lC j6 = RB.j(12);
        f26667e = j6;
        f26668f = new KO(RB.j(JO.f26432d), j6, C3523lC.f32525x);
        Object[] objArr = {2, 5, 6};
        AbstractC2792Sd.j(objArr, 3);
        f26669g = RB.p(objArr, 3);
        C3516l5 c3516l5 = new C3516l5(4);
        c3516l5.e(5, 6);
        c3516l5.e(17, 6);
        c3516l5.e(7, 6);
        c3516l5.e(30, 10);
        c3516l5.e(18, 6);
        c3516l5.e(6, 8);
        c3516l5.e(8, 8);
        c3516l5.e(14, 8);
        f26670h = c3516l5.s(true);
    }

    public KO(C3523lC c3523lC, RB rb, List list) {
        for (int i = 0; i < c3523lC.f32527w; i++) {
            JO jo = (JO) c3523lC.get(i);
            this.f26671a.put(jo.f26433a, jo);
        }
        int i4 = 0;
        for (int i6 = 0; i6 < this.f26671a.size(); i6++) {
            i4 = Math.max(i4, ((JO) this.f26671a.valueAt(i6)).f26434b);
        }
        this.f26672b = i4;
        this.f26673c = RB.n(rb);
        this.f26674d = RB.n(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x021a, code lost:
    
        if (r1.equals("Xiaomi") == false) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static KO a(Context context, Intent intent, C2764Qj c2764Qj, AudioDeviceInfo audioDeviceInfo, List list) {
        int i;
        boolean isDirectPlaybackSupported;
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        List audioDevicesForAttributes;
        AudioManager b9 = AbstractC2659Kg.b(context);
        int i4 = 0;
        if (audioDeviceInfo == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                audioDevicesForAttributes = b9.getAudioDevicesForAttributes(c2764Qj.a());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo = (AudioDeviceInfo) audioDevicesForAttributes.get(0);
                }
            }
            audioDeviceInfo = null;
        }
        RB a9 = audioDeviceInfo != null ? AbstractC4129wP.a(audioDeviceInfo) : f26667e;
        int i6 = Build.VERSION.SDK_INT;
        C3793qC c3793qC = f26670h;
        if (i6 >= 33 && (AbstractC3182eu.j(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            directProfilesForAttributes = b9.getDirectProfilesForAttributes(c2764Qj.a());
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(UC.o(12)));
            for (int i9 = 0; i9 < directProfilesForAttributes.size(); i9++) {
                AudioProfile f2 = GO.f(directProfilesForAttributes.get(i9));
                encapsulationType = f2.getEncapsulationType();
                if (encapsulationType != 1) {
                    format = f2.getFormat();
                    if (AbstractC3182eu.d(format) || c3793qC.containsKey(Integer.valueOf(format))) {
                        Integer valueOf = Integer.valueOf(format);
                        if (hashMap.containsKey(valueOf)) {
                            Set set = (Set) hashMap.get(valueOf);
                            set.getClass();
                            channelMasks2 = f2.getChannelMasks();
                            set.addAll(UC.o(channelMasks2));
                        } else {
                            channelMasks = f2.getChannelMasks();
                            hashMap.put(valueOf, new HashSet(UC.o(channelMasks)));
                        }
                    }
                }
            }
            PB pb = RB.f27933u;
            MA.q(4, "initialCapacity");
            Object[] objArr = new Object[4];
            for (Map.Entry entry : hashMap.entrySet()) {
                JO jo = new JO(((Integer) entry.getKey()).intValue(), (Set) entry.getValue());
                int length = objArr.length;
                int i10 = i4 + 1;
                int d9 = MB.d(length, i10);
                if (d9 > length) {
                    objArr = Arrays.copyOf(objArr, d9);
                }
                objArr[i4] = jo;
                i4 = i10;
            }
            return new KO(RB.p(objArr, i4), a9, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? b9.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (UC.d(audioDeviceInfo2.getType())) {
                return new KO(RB.j(JO.f26432d), a9, list);
            }
        }
        WB wb = new WB(4);
        wb.f(2);
        if (Build.VERSION.SDK_INT < 29 || !(AbstractC3182eu.j(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            ContentResolver contentResolver = context.getContentResolver();
            boolean z6 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
            if (!z6) {
                String str = Build.MANUFACTURER;
                if (!str.equals("Amazon")) {
                }
            }
            if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                wb.g(f26669g);
            }
            if (intent == null || z6 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
                return new KO(c(UC.n(wb.h()), 10), a9, list);
            }
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                wb.g(UC.o(intArrayExtra));
            }
            return new KO(c(UC.n(wb.h()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), a9, list);
        }
        PB pb2 = RB.f27933u;
        OB ob = new OB(4);
        C3685oC c3685oC = c3793qC.f33995u;
        if (c3685oC == null) {
            C3685oC c3685oC2 = new C3685oC(c3793qC, new C3739pC(c3793qC.f33998x, 0, c3793qC.f33999y));
            c3793qC.f33995u = c3685oC2;
            c3685oC = c3685oC2;
        }
        AbstractC4278zC a10 = c3685oC.a();
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
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), c2764Qj.a());
                if (isDirectPlaybackSupported) {
                    ob.a(num);
                }
            }
        }
        ob.a(2);
        wb.g(ob.f());
        return new KO(c(UC.n(wb.h()), 10), a9, list);
    }

    public static C3523lC c(int[] iArr, int i) {
        PB pb = RB.f27933u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i4 = 0;
        if (iArr == null) {
            iArr = new int[0];
        }
        int i6 = 0;
        while (i4 < iArr.length) {
            JO jo = new JO(iArr[i4], i);
            int length = objArr.length;
            int i9 = i6 + 1;
            int d9 = MB.d(length, i9);
            if (d9 > length) {
                objArr = Arrays.copyOf(objArr, d9);
            }
            objArr[i6] = jo;
            i4++;
            i6 = i9;
        }
        return RB.p(objArr, i6);
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
    public final Pair b(DP dp, C2764Qj c2764Qj) {
        boolean isDirectPlaybackSupported;
        int i;
        String str = dp.f25176o;
        str.getClass();
        int g9 = H4.g(str, dp.f25172k);
        Integer valueOf = Integer.valueOf(g9);
        C3793qC c3793qC = f26670h;
        if (!c3793qC.containsKey(valueOf)) {
            return null;
        }
        SparseArray sparseArray = this.f26671a;
        if (g9 == 18) {
            if (sparseArray.indexOfKey(18) >= 0) {
                g9 = 18;
            } else {
                g9 = 6;
                if (sparseArray.indexOfKey(g9) < 0) {
                    return null;
                }
                JO jo = (JO) sparseArray.get(g9);
                jo.getClass();
                int i4 = 0;
                r11 = false;
                boolean contains = false;
                int i6 = 10;
                int i9 = dp.f25155I;
                int i10 = dp.f25154H;
                int i11 = jo.f26434b;
                XB xb = jo.f26435c;
                if (i10 == -1 || g9 == 18) {
                    int i12 = dp.J;
                    if (i12 == -1) {
                        i12 = 48000;
                    }
                    if (xb != null) {
                        i4 = i11;
                    } else {
                        int i13 = Build.VERSION.SDK_INT;
                        int i14 = jo.f26433a;
                        if (i13 >= 29) {
                            while (true) {
                                if (i6 <= 0) {
                                    break;
                                }
                                int e9 = AbstractC3182eu.e(i6);
                                if (e9 != 0) {
                                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i14).setSampleRate(i12).setChannelMask(e9).build(), c2764Qj.a());
                                    if (isDirectPlaybackSupported) {
                                        i4 = i6;
                                        break;
                                    }
                                }
                                i6--;
                            }
                        } else {
                            Object obj = c3793qC.get(Integer.valueOf(i14));
                            i4 = ((Integer) (obj != null ? obj : 0)).intValue();
                        }
                    }
                } else {
                    if (!str.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                        if (xb != null) {
                            int e10 = i9 != -1 ? i9 : AbstractC3182eu.e(i10);
                            if (e10 != 0) {
                                contains = xb.contains(Integer.valueOf(e10));
                            }
                        } else if (i10 <= i11) {
                            contains = true;
                        }
                        if (!contains) {
                            return null;
                        }
                    } else if (i10 > 10) {
                        return null;
                    }
                    i4 = i10;
                }
                int i15 = Build.VERSION.SDK_INT;
                if (i15 <= 28) {
                    if (i4 == 7) {
                        i = 8;
                    } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                        i = 6;
                    }
                    if (i15 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
                        i = 2;
                    }
                    if (i9 != -1 || i10 != i) {
                        i9 = AbstractC3182eu.e(i);
                    }
                    if (i9 == 0) {
                        return Pair.create(Integer.valueOf(g9), Integer.valueOf(i9));
                    }
                    return null;
                }
                i = i4;
                if (i15 <= 26) {
                    i = 2;
                }
                if (i9 != -1) {
                }
                i9 = AbstractC3182eu.e(i);
                if (i9 == 0) {
                }
            }
        }
        if (g9 == 8) {
            if (sparseArray.indexOfKey(8) >= 0) {
                g9 = 8;
            }
            g9 = 7;
            if (sparseArray.indexOfKey(g9) < 0) {
            }
        }
        if (g9 == 30) {
        }
        if (sparseArray.indexOfKey(g9) < 0) {
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
                SparseArray sparseArray = this.f26671a;
                SparseArray sparseArray2 = ko.f26671a;
                String str = AbstractC3182eu.f30782a;
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
                        if (this.f26672b != ko.f26672b || !Objects.equals(this.f26673c, ko.f26673c) || !Objects.equals(this.f26674d, ko.f26674d)) {
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
        String str = AbstractC3182eu.f30782a;
        int i4 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.f26671a;
        if (i4 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i6 = 17;
            for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                i6 = Objects.hashCode(sparseArray.valueAt(i9)) + ((sparseArray.keyAt(i9) + (i6 * 31)) * 31);
            }
            i = i6;
        }
        return Objects.hashCode(this.f26674d) + ((Objects.hashCode(this.f26673c) + (((this.f26672b * 31) + i) * 31)) * 31);
    }

    public final String toString() {
        String obj = this.f26671a.toString();
        String valueOf = String.valueOf(this.f26673c);
        String valueOf2 = String.valueOf(this.f26674d);
        int i = this.f26672b;
        int length = String.valueOf(i).length();
        int length2 = obj.length();
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 28 + valueOf.length() + 26 + valueOf2.length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", audioProfiles=");
        sb.append(obj);
        AbstractC5128c.h(sb, ", speakerLayoutChannelMasks=", valueOf, ", spatializerChannelMasks=", valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
