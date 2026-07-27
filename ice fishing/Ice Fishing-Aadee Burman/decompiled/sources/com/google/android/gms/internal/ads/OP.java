package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class OP {

    /* renamed from: a, reason: collision with root package name */
    public final String f26604a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26605b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26606c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f26607d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26608e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f26609f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f26610g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26611h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f26612j;

    /* renamed from: k, reason: collision with root package name */
    public int f26613k;

    /* renamed from: l, reason: collision with root package name */
    public float f26614l;

    public OP(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z3, boolean z6, boolean z9, boolean z10) {
        str.getClass();
        this.f26604a = str;
        this.f26605b = str2;
        this.f26606c = str3;
        this.f26607d = codecCapabilities;
        this.f26610g = z3;
        this.f26608e = z6;
        this.f26609f = z9;
        this.f26611h = z10;
        this.i = H4.b(str2);
        this.f26614l = -3.4028235E38f;
        this.f26612j = -1;
        this.f26613k = -1;
    }

    public static OP a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z3, boolean z6) {
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z9;
        boolean z10;
        String str6;
        boolean z11 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z12 = z6 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals("OPPO") && !str7.equals("realme") && !str7.equals("motorola") && !str7.equals("LENOVO") && !str7.equals("Fairphone")) {
                str6 = str2;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z9 = z3;
                z10 = true;
                str4 = str;
                return new OP(str4, str6, str5, codecCapabilities2, z9, z11, z12, z10);
            }
        }
        str4 = str;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z9 = z3;
        z10 = false;
        str6 = str2;
        return new OP(str4, str6, str5, codecCapabilities2, z9, z11, z12, z10);
    }

    public static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i6, double d2) {
        Point j6 = j(videoCapabilities, i, i6);
        int i9 = j6.x;
        int i10 = j6.y;
        if (d2 == -1.0d || d2 < 1.0d) {
            return videoCapabilities.isSizeSupported(i9, i10);
        }
        double floor = Math.floor(d2);
        if (!videoCapabilities.areSizeAndRateSupported(i9, i10, floor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i9, i10);
        return achievableFrameRatesFor == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
    }

    public static Point j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i6) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = AbstractC3159eu.f29993a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i6 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean b(Context context, DP dp) {
        int i;
        String str = dp.f24431o;
        String str2 = this.f26605b;
        if (!(str2.equals(str) || str2.equals(WP.d(dp))) || !f(context, dp, true) || !g(dp)) {
            return false;
        }
        if (this.i) {
            int i6 = dp.f24438v;
            if (i6 > 0 && (i = dp.f24439w) > 0) {
                return e(i6, i, dp.f24442z);
            }
        } else {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f26607d;
            int i9 = dp.J;
            if (i9 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i9)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 20);
                    sb.append("sampleRate.support, ");
                    sb.append(i9);
                    h(sb.toString());
                    return false;
                }
            }
            int i10 = dp.f24409H;
            if (i10 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !com.anythink.basead.exoplayer.k.o.f8462t.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8428I.equals(str2) && !com.anythink.basead.exoplayer.k.o.J.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8460r.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8426G.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8427H.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8465w.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8429K.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8466x.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8467y.equals(str2) && !com.anythink.basead.exoplayer.k.o.f8431M.equals(str2))) {
                    int i11 = com.anythink.basead.exoplayer.k.o.f8468z.equals(str2) ? 6 : com.anythink.basead.exoplayer.k.o.f8420A.equals(str2) ? 16 : 30;
                    String str3 = this.f26604a;
                    StringBuilder sb2 = new StringBuilder(u1.h.a(String.valueOf(maxInputChannelCount).length() + str3.length() + 32 + 4, 1, String.valueOf(i11)));
                    sb2.append("AssumedMaxChannelAdjustment: ");
                    sb2.append(str3);
                    sb2.append(", [");
                    sb2.append(maxInputChannelCount);
                    sb2.append(" to ");
                    sb2.append(i11);
                    sb2.append("]");
                    AbstractC2968bG.y(com.anythink.basead.exoplayer.f.a.f7196a, sb2.toString());
                    maxInputChannelCount = i11;
                }
                if (maxInputChannelCount < i10) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 22);
                    sb3.append("channelCount.support, ");
                    sb3.append(i10);
                    h(sb3.toString());
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(DP dp) {
        boolean z3;
        if (this.i) {
            return this.f26608e;
        }
        C3473km d2 = AbstractC4228ym.d(dp);
        if (d2 == null || !(z3 = d2.f31627b)) {
            return false;
        }
        AbstractC2772Sd.H(z3);
        return d2.f31626a == 42;
    }

    public final C4212yN d(DP dp, DP dp2) {
        DP dp3;
        DP dp4;
        int i;
        String str = dp.f24431o;
        String str2 = dp2.f24431o;
        int i6 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (dp.f24402A != dp2.f24402A) {
                i6 |= 1024;
            }
            boolean z3 = (dp.f24438v == dp2.f24438v && dp.f24439w == dp2.f24439w) ? false : true;
            if (!this.f26608e && z3) {
                i6 |= 512;
            }
            KJ kj = dp.f24407F;
            boolean a9 = KJ.a(kj);
            KJ kj2 = dp2.f24407F;
            if ((!a9 || !KJ.a(kj2)) && !Objects.equals(kj, kj2)) {
                i6 |= 2048;
            }
            boolean startsWith = Build.MODEL.startsWith("SM-T230");
            String str3 = this.f26604a;
            if (startsWith && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !dp.b(dp2)) {
                i6 |= 2;
            }
            int i9 = dp.f24440x;
            if (i9 != -1 && (i = dp.f24441y) != -1 && i9 == dp2.f24440x && i == dp2.f24441y && z3) {
                i6 |= 2;
            }
            if (i6 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair c9 = AbstractC4228ym.c(dp);
                Pair c10 = AbstractC4228ym.c(dp2);
                if (c9 == null || c10 == null || !((Integer) c9.first).equals(c10.first)) {
                    i6 = 2;
                }
            }
            if (i6 == 0) {
                return new C4212yN(str3, dp, dp2, true == dp.b(dp2) ? 3 : 2, 0);
            }
            dp3 = dp;
            dp4 = dp2;
        } else {
            dp3 = dp;
            dp4 = dp2;
            if (dp3.f24409H != dp4.f24409H) {
                i6 |= 4096;
            }
            if (dp3.J != dp4.J) {
                i6 |= 8192;
            }
            if (dp3.f24411K != dp4.f24411K) {
                i6 |= 16384;
            }
            String str4 = this.f26605b;
            if (i6 == 0 && (str4.equals(com.anythink.basead.exoplayer.k.o.f8460r) || str4.equals("audio/ac4"))) {
                Pair c11 = AbstractC4228ym.c(dp3);
                Pair c12 = AbstractC4228ym.c(dp4);
                if (c11 != null && c12 != null) {
                    int intValue = ((Integer) c11.first).intValue();
                    int intValue2 = ((Integer) c12.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C4212yN(this.f26604a, dp3, dp4, 3, 0);
                    }
                    if (str4.equals("audio/ac4") && c11.equals(c12)) {
                        return new C4212yN(this.f26604a, dp3, dp4, 3, 0);
                    }
                }
            }
            if (i6 == 0 && (str4.equals(com.anythink.basead.exoplayer.k.o.f8421B) || str4.equals(com.anythink.basead.exoplayer.k.o.f8420A))) {
                return new C4212yN(this.f26604a, dp3, dp4, 3, 0);
            }
            if (!dp3.b(dp4)) {
                i6 |= 32;
            }
            if (com.anythink.basead.exoplayer.k.o.f8427H.equals(str4)) {
                i6 |= 2;
            }
            if (i6 == 0) {
                return new C4212yN(this.f26604a, dp3, dp4, 1, 0);
            }
        }
        return new C4212yN(this.f26604a, dp3, dp4, 0, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r5 = r1.getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(int i, int i6, double d2) {
        char c9;
        Boolean bool;
        List supportedPerformancePoints;
        boolean z3;
        boolean covers;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f26607d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            if (i9 >= 29 && (((bool = WC.f28324a) == null || !bool.booleanValue()) && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty())) {
                MediaCodecInfo.VideoCapabilities.PerformancePoint d9 = P.e.d(i, i6, (int) d2);
                int i10 = 0;
                while (true) {
                    if (i10 >= supportedPerformancePoints.size()) {
                        c9 = 1;
                        break;
                    }
                    covers = P.e.e(supportedPerformancePoints.get(i10)).covers(d9);
                    if (covers) {
                        c9 = 2;
                        break;
                    }
                    i10++;
                }
                if (c9 == 1 && WC.f28324a == null) {
                    if (i9 < 37) {
                        int j6 = C2921aN.j(true);
                        if (i9 < 35 ? C2921aN.j(false) != 2 || j6 == 1 : j6 == 1) {
                            z3 = true;
                            WC.f28324a = Boolean.valueOf(z3);
                        }
                    }
                    z3 = false;
                    WC.f28324a = Boolean.valueOf(z3);
                }
                if (c9 != 2) {
                    if (c9 == 1) {
                        StringBuilder sb = new StringBuilder(u1.h.a(String.valueOf(i).length() + 20, 1, String.valueOf(i6)) + String.valueOf(d2).length());
                        u1.h.h(sb, "sizeAndRate.cover, ", i, "x", i6);
                        sb.append("@");
                        sb.append(d2);
                        h(sb.toString());
                        return false;
                    }
                }
                return true;
            }
            c9 = 0;
            if (c9 != 2) {
            }
            return true;
        }
        if (!i(videoCapabilities, i, i6, d2)) {
            if (i < i6) {
                String str = this.f26604a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && i(videoCapabilities, i6, i, d2)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + AbstractC4404f.b(i, 22) + 1 + String.valueOf(d2).length());
                    u1.h.h(sb2, "sizeAndRate.rotated, ", i, "x", i6);
                    sb2.append("@");
                    sb2.append(d2);
                    String sb3 = sb2.toString();
                    int length = str.length();
                    String str2 = AbstractC3159eu.f29993a;
                    String str3 = this.f26605b;
                    StringBuilder sb4 = new StringBuilder(sb3.length() + 19 + length + 2 + String.valueOf(str3).length() + 3 + String.valueOf(str2).length() + 1);
                    sb4.append("AssumedSupport [");
                    sb4.append(sb3);
                    sb4.append("] [");
                    sb4.append(str);
                    u1.h.i(sb4, ", ", str3, "] [", str2);
                    sb4.append("]");
                    AbstractC2968bG.k(com.anythink.basead.exoplayer.f.a.f7196a, sb4.toString());
                    return true;
                }
            }
            StringBuilder sb5 = new StringBuilder(String.valueOf(i6).length() + AbstractC4404f.b(i, 22) + 1 + String.valueOf(d2).length());
            u1.h.h(sb5, "sizeAndRate.support, ", i, "x", i6);
            sb5.append("@");
            sb5.append(d2);
            h(sb5.toString());
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(Context context, DP dp, boolean z3) {
        int i;
        int i6;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        C3473km d2 = AbstractC4228ym.d(dp);
        String str = this.f26606c;
        char c9 = 65535;
        String str2 = dp.f24431o;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String h9 = H4.h(str);
            if (!h9.equals("video/mv-hevc")) {
                if (h9.equals(com.anythink.basead.exoplayer.k.o.i)) {
                    HashMap hashMap = WP.f28354a;
                    String T8 = SK.T(dp.f24434r);
                    if (T8 == null) {
                        d2 = null;
                    } else {
                        String trim = T8.trim();
                        String str3 = AbstractC3159eu.f29993a;
                        d2 = AbstractC4228ym.e(T8, trim.split("\\.", -1), dp.f24407F);
                    }
                }
            }
            return true;
        }
        if (d2 != null) {
            boolean z6 = d2.f31627b;
            if (!z6) {
                return false;
            }
            AbstractC2772Sd.H(z6);
            AbstractC2772Sd.H(z6);
            boolean equals = "video/dolby-vision".equals(str2);
            String str4 = this.f26605b;
            int i9 = 8;
            if (equals) {
                int hashCode = str4.hashCode();
                if (hashCode != -1662735862) {
                    if (hashCode != -1662541442) {
                        if (hashCode == 1331836730 && str4.equals(com.anythink.basead.exoplayer.k.o.f8451h)) {
                            c9 = 0;
                        }
                    } else if (str4.equals(com.anythink.basead.exoplayer.k.o.i)) {
                        c9 = 1;
                    }
                } else if (str4.equals("video/av01")) {
                    c9 = 2;
                }
                if (c9 == 0) {
                    i6 = 0;
                    i = 8;
                } else if (c9 == 1 || c9 == 2) {
                    i6 = 0;
                    i = 2;
                }
                if (!this.i || str4.equals("audio/ac4") || i == 42) {
                    codecCapabilities = this.f26607d;
                    if (codecCapabilities != null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (str4.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
                        if (codecCapabilities != null && (audioCapabilities = codecCapabilities.getAudioCapabilities()) != null && audioCapabilities.getMaxInputChannelCount() > 18) {
                            i9 = 16;
                        }
                        codecProfileLevelArr = !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new MediaCodecInfo.CodecProfileLevel[]{WP.c(1026, i9)} : new MediaCodecInfo.CodecProfileLevel[]{WP.c(257, i9), WP.c(513, i9), WP.c(514, i9), WP.c(1026, i9), WP.c(1028, i9)};
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                        if (codecProfileLevel.profile == i && (codecProfileLevel.level >= i6 || !z3)) {
                            if (com.anythink.basead.exoplayer.k.o.i.equals(str4) && i == 2) {
                                String str5 = Build.DEVICE;
                                if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                                }
                            }
                        }
                    }
                    String str6 = dp.f24427k;
                    h(com.anythink.basead.exoplayer.f.f.o(new StringBuilder(str.length() + String.valueOf(str6).length() + 22), "codec.profileLevel, ", str6, ", ", str));
                    return false;
                }
            }
            i = d2.f31626a;
            i6 = d2.f31628c;
            if (!this.i) {
            }
            codecCapabilities = this.f26607d;
            if (codecCapabilities != null) {
            }
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            if (str4.equals("audio/ac4")) {
                if (codecCapabilities != null) {
                    i9 = 16;
                }
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                }
            }
            while (r5 < r13) {
            }
            String str62 = dp.f24427k;
            h(com.anythink.basead.exoplayer.f.f.o(new StringBuilder(str.length() + String.valueOf(str62).length() + 22), "codec.profileLevel, ", str62, ", ", str));
            return false;
        }
        return true;
    }

    public final boolean g(DP dp) {
        return (Objects.equals(dp.f24431o, com.anythink.basead.exoplayer.k.o.f8429K) && dp.f24411K == 22 && Build.VERSION.SDK_INT < 34 && this.f26604a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final void h(String str) {
        String str2 = AbstractC3159eu.f29993a;
        String str3 = this.f26605b;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length() + 14;
        String str4 = this.f26604a;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 2 + length + 3 + length2 + 1);
        u1.h.i(sb, "NoSupport [", str, "] [", str4);
        u1.h.i(sb, ", ", str3, "] [", str2);
        sb.append("]");
        AbstractC2968bG.k(com.anythink.basead.exoplayer.f.a.f7196a, sb.toString());
    }

    public final String toString() {
        return this.f26604a;
    }
}
