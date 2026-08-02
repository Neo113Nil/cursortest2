package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class PP {

    /* renamed from: a, reason: collision with root package name */
    public final String f27597a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27598b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27599c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f27600d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27601e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27602f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27603g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27604h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f27605j;

    /* renamed from: k, reason: collision with root package name */
    public int f27606k;

    /* renamed from: l, reason: collision with root package name */
    public float f27607l;

    public PP(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z9, boolean z10, boolean z11) {
        str.getClass();
        this.f27597a = str;
        this.f27598b = str2;
        this.f27599c = str3;
        this.f27600d = codecCapabilities;
        this.f27603g = z6;
        this.f27601e = z9;
        this.f27602f = z10;
        this.f27604h = z11;
        this.i = H4.b(str2);
        this.f27607l = -3.4028235E38f;
        this.f27605j = -1;
        this.f27606k = -1;
    }

    public static PP a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z9) {
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z10;
        boolean z11;
        String str6;
        boolean z12 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z13 = z9 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals("OPPO") && !str7.equals("realme") && !str7.equals("motorola") && !str7.equals("LENOVO") && !str7.equals("Fairphone")) {
                str6 = str2;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z10 = z6;
                z11 = true;
                str4 = str;
                return new PP(str4, str6, str5, codecCapabilities2, z10, z12, z13, z11);
            }
        }
        str4 = str;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z10 = z6;
        z11 = false;
        str6 = str2;
        return new PP(str4, str6, str5, codecCapabilities2, z10, z12, z13, z11);
    }

    public static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i4, double d9) {
        Point j6 = j(videoCapabilities, i, i4);
        int i6 = j6.x;
        int i9 = j6.y;
        if (d9 == -1.0d || d9 < 1.0d) {
            return videoCapabilities.isSizeSupported(i6, i9);
        }
        double floor = Math.floor(d9);
        if (!videoCapabilities.areSizeAndRateSupported(i6, i9, floor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i6, i9);
        return achievableFrameRatesFor == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
    }

    public static Point j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i4) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = AbstractC3182eu.f30782a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i4 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean b(Context context, DP dp) {
        int i;
        String str = dp.f25176o;
        String str2 = this.f27598b;
        if (!(str2.equals(str) || str2.equals(ZP.d(dp))) || !f(context, dp, true) || !g(dp)) {
            return false;
        }
        if (this.i) {
            int i4 = dp.f25183v;
            if (i4 > 0 && (i = dp.f25184w) > 0) {
                return e(i4, i, dp.f25187z);
            }
        } else {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f27600d;
            int i6 = dp.J;
            if (i6 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i6)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 20);
                    sb.append("sampleRate.support, ");
                    sb.append(i6);
                    h(sb.toString());
                    return false;
                }
            }
            int i9 = dp.f25154H;
            if (i9 != -1) {
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
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !com.anythink.basead.exoplayer.k.o.f9248t.equals(str2) && !com.anythink.basead.exoplayer.k.o.f9214I.equals(str2) && !com.anythink.basead.exoplayer.k.o.J.equals(str2) && !com.anythink.basead.exoplayer.k.o.f9246r.equals(str2) && !com.anythink.basead.exoplayer.k.o.f9212G.equals(str2) && !com.anythink.basead.exoplayer.k.o.f9213H.equals(str2) && !com.anythink.basead.exoplayer.k.o.f9251w.equals(str2) && !com.anythink.basead.exoplayer.k.o.f9215K.equals(str2) && !com.anythink.basead.exoplayer.k.o.f9252x.equals(str2) && !com.anythink.basead.exoplayer.k.o.f9253y.equals(str2) && !com.anythink.basead.exoplayer.k.o.f9217M.equals(str2))) {
                    int i10 = com.anythink.basead.exoplayer.k.o.f9254z.equals(str2) ? 6 : com.anythink.basead.exoplayer.k.o.f9206A.equals(str2) ? 16 : 30;
                    String str3 = this.f27597a;
                    StringBuilder sb2 = new StringBuilder(AbstractC5128c.j(String.valueOf(maxInputChannelCount).length() + str3.length() + 32 + 4, 1, String.valueOf(i10)));
                    sb2.append("AssumedMaxChannelAdjustment: ");
                    sb2.append(str3);
                    sb2.append(", [");
                    sb2.append(maxInputChannelCount);
                    sb2.append(" to ");
                    sb2.append(i10);
                    sb2.append("]");
                    AbstractC2991bG.y(com.anythink.basead.exoplayer.f.a.f7982a, sb2.toString());
                    maxInputChannelCount = i10;
                }
                if (maxInputChannelCount < i9) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i9).length() + 22);
                    sb3.append("channelCount.support, ");
                    sb3.append(i9);
                    h(sb3.toString());
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(DP dp) {
        boolean z6;
        if (this.i) {
            return this.f27601e;
        }
        C3550lm d9 = AbstractC4305zm.d(dp);
        if (d9 == null || !(z6 = d9.f32625b)) {
            return false;
        }
        AbstractC2792Sd.H(z6);
        return d9.f32624a == 42;
    }

    public final C4235yN d(DP dp, DP dp2) {
        DP dp3;
        DP dp4;
        int i;
        String str = dp.f25176o;
        String str2 = dp2.f25176o;
        int i4 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (dp.f25147A != dp2.f25147A) {
                i4 |= 1024;
            }
            boolean z6 = (dp.f25183v == dp2.f25183v && dp.f25184w == dp2.f25184w) ? false : true;
            if (!this.f27601e && z6) {
                i4 |= 512;
            }
            KJ kj = dp.f25152F;
            boolean a9 = KJ.a(kj);
            KJ kj2 = dp2.f25152F;
            if ((!a9 || !KJ.a(kj2)) && !Objects.equals(kj, kj2)) {
                i4 |= 2048;
            }
            boolean startsWith = Build.MODEL.startsWith("SM-T230");
            String str3 = this.f27597a;
            if (startsWith && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !dp.b(dp2)) {
                i4 |= 2;
            }
            int i6 = dp.f25185x;
            if (i6 != -1 && (i = dp.f25186y) != -1 && i6 == dp2.f25185x && i == dp2.f25186y && z6) {
                i4 |= 2;
            }
            if (i4 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair c9 = AbstractC4305zm.c(dp);
                Pair c10 = AbstractC4305zm.c(dp2);
                if (c9 == null || c10 == null || !((Integer) c9.first).equals(c10.first)) {
                    i4 = 2;
                }
            }
            if (i4 == 0) {
                return new C4235yN(str3, dp, dp2, true == dp.b(dp2) ? 3 : 2, 0);
            }
            dp3 = dp;
            dp4 = dp2;
        } else {
            dp3 = dp;
            dp4 = dp2;
            if (dp3.f25154H != dp4.f25154H) {
                i4 |= 4096;
            }
            if (dp3.J != dp4.J) {
                i4 |= 8192;
            }
            if (dp3.f25156K != dp4.f25156K) {
                i4 |= 16384;
            }
            String str4 = this.f27598b;
            if (i4 == 0 && (str4.equals(com.anythink.basead.exoplayer.k.o.f9246r) || str4.equals("audio/ac4"))) {
                Pair c11 = AbstractC4305zm.c(dp3);
                Pair c12 = AbstractC4305zm.c(dp4);
                if (c11 != null && c12 != null) {
                    int intValue = ((Integer) c11.first).intValue();
                    int intValue2 = ((Integer) c12.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C4235yN(this.f27597a, dp3, dp4, 3, 0);
                    }
                    if (str4.equals("audio/ac4") && c11.equals(c12)) {
                        return new C4235yN(this.f27597a, dp3, dp4, 3, 0);
                    }
                }
            }
            if (i4 == 0 && (str4.equals(com.anythink.basead.exoplayer.k.o.f9207B) || str4.equals(com.anythink.basead.exoplayer.k.o.f9206A))) {
                return new C4235yN(this.f27597a, dp3, dp4, 3, 0);
            }
            if (!dp3.b(dp4)) {
                i4 |= 32;
            }
            if (com.anythink.basead.exoplayer.k.o.f9213H.equals(str4)) {
                i4 |= 2;
            }
            if (i4 == 0) {
                return new C4235yN(this.f27597a, dp3, dp4, 1, 0);
            }
        }
        return new C4235yN(this.f27597a, dp3, dp4, 0, i4);
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
    public final boolean e(int i, int i4, double d9) {
        char c9;
        Boolean bool;
        List supportedPerformancePoints;
        boolean z6;
        boolean covers;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f27600d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            if (i6 >= 29 && (((bool = WC.f29122a) == null || !bool.booleanValue()) && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty())) {
                MediaCodecInfo.VideoCapabilities.PerformancePoint d10 = P.e.d(i, i4, (int) d9);
                int i9 = 0;
                while (true) {
                    if (i9 >= supportedPerformancePoints.size()) {
                        c9 = 1;
                        break;
                    }
                    covers = P.e.e(supportedPerformancePoints.get(i9)).covers(d10);
                    if (covers) {
                        c9 = 2;
                        break;
                    }
                    i9++;
                }
                if (c9 == 1 && WC.f29122a == null) {
                    if (i6 < 37) {
                        int j6 = C2944aN.j(true);
                        if (i6 < 35 ? C2944aN.j(false) != 2 || j6 == 1 : j6 == 1) {
                            z6 = true;
                            WC.f29122a = Boolean.valueOf(z6);
                        }
                    }
                    z6 = false;
                    WC.f29122a = Boolean.valueOf(z6);
                }
                if (c9 != 2) {
                    if (c9 == 1) {
                        StringBuilder sb = new StringBuilder(AbstractC5128c.j(String.valueOf(i).length() + 20, 1, String.valueOf(i4)) + String.valueOf(d9).length());
                        AbstractC5128c.g(sb, "sizeAndRate.cover, ", i, "x", i4);
                        sb.append("@");
                        sb.append(d9);
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
        if (!i(videoCapabilities, i, i4, d9)) {
            if (i < i4) {
                String str = this.f27597a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && i(videoCapabilities, i4, i, d9)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + Wv.b(i, 22) + 1 + String.valueOf(d9).length());
                    AbstractC5128c.g(sb2, "sizeAndRate.rotated, ", i, "x", i4);
                    sb2.append("@");
                    sb2.append(d9);
                    String sb3 = sb2.toString();
                    int length = str.length();
                    String str2 = AbstractC3182eu.f30782a;
                    String str3 = this.f27598b;
                    StringBuilder sb4 = new StringBuilder(sb3.length() + 19 + length + 2 + String.valueOf(str3).length() + 3 + String.valueOf(str2).length() + 1);
                    sb4.append("AssumedSupport [");
                    sb4.append(sb3);
                    sb4.append("] [");
                    sb4.append(str);
                    AbstractC5128c.h(sb4, ", ", str3, "] [", str2);
                    sb4.append("]");
                    AbstractC2991bG.k(com.anythink.basead.exoplayer.f.a.f7982a, sb4.toString());
                    return true;
                }
            }
            StringBuilder sb5 = new StringBuilder(String.valueOf(i4).length() + Wv.b(i, 22) + 1 + String.valueOf(d9).length());
            AbstractC5128c.g(sb5, "sizeAndRate.support, ", i, "x", i4);
            sb5.append("@");
            sb5.append(d9);
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
    public final boolean f(Context context, DP dp, boolean z6) {
        int i;
        int i4;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        C3550lm d9 = AbstractC4305zm.d(dp);
        String str = this.f27599c;
        char c9 = 65535;
        String str2 = dp.f25176o;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String h3 = H4.h(str);
            if (!h3.equals("video/mv-hevc")) {
                if (h3.equals(com.anythink.basead.exoplayer.k.o.i)) {
                    HashMap hashMap = ZP.f29665a;
                    String T8 = SK.T(dp.f25179r);
                    if (T8 == null) {
                        d9 = null;
                    } else {
                        String trim = T8.trim();
                        String str3 = AbstractC3182eu.f30782a;
                        d9 = AbstractC4305zm.e(T8, trim.split("\\.", -1), dp.f25152F);
                    }
                }
            }
            return true;
        }
        if (d9 != null) {
            boolean z9 = d9.f32625b;
            if (!z9) {
                return false;
            }
            AbstractC2792Sd.H(z9);
            AbstractC2792Sd.H(z9);
            boolean equals = "video/dolby-vision".equals(str2);
            String str4 = this.f27598b;
            int i6 = 8;
            if (equals) {
                int hashCode = str4.hashCode();
                if (hashCode != -1662735862) {
                    if (hashCode != -1662541442) {
                        if (hashCode == 1331836730 && str4.equals(com.anythink.basead.exoplayer.k.o.f9237h)) {
                            c9 = 0;
                        }
                    } else if (str4.equals(com.anythink.basead.exoplayer.k.o.i)) {
                        c9 = 1;
                    }
                } else if (str4.equals("video/av01")) {
                    c9 = 2;
                }
                if (c9 == 0) {
                    i4 = 0;
                    i = 8;
                } else if (c9 == 1 || c9 == 2) {
                    i4 = 0;
                    i = 2;
                }
                if (!this.i || str4.equals("audio/ac4") || i == 42) {
                    codecCapabilities = this.f27600d;
                    if (codecCapabilities != null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (str4.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
                        if (codecCapabilities != null && (audioCapabilities = codecCapabilities.getAudioCapabilities()) != null && audioCapabilities.getMaxInputChannelCount() > 18) {
                            i6 = 16;
                        }
                        codecProfileLevelArr = !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new MediaCodecInfo.CodecProfileLevel[]{ZP.c(1026, i6)} : new MediaCodecInfo.CodecProfileLevel[]{ZP.c(257, i6), ZP.c(513, i6), ZP.c(514, i6), ZP.c(1026, i6), ZP.c(1028, i6)};
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                        if (codecProfileLevel.profile == i && (codecProfileLevel.level >= i4 || !z6)) {
                            if (com.anythink.basead.exoplayer.k.o.i.equals(str4) && i == 2) {
                                String str5 = Build.DEVICE;
                                if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                                }
                            }
                        }
                    }
                    String str6 = dp.f25172k;
                    h(com.IceFishing.LiveIceFishing.k.r(new StringBuilder(str.length() + String.valueOf(str6).length() + 22), "codec.profileLevel, ", str6, ", ", str));
                    return false;
                }
            }
            i = d9.f32624a;
            i4 = d9.f32626c;
            if (!this.i) {
            }
            codecCapabilities = this.f27600d;
            if (codecCapabilities != null) {
            }
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            if (str4.equals("audio/ac4")) {
                if (codecCapabilities != null) {
                    i6 = 16;
                }
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                }
            }
            while (r5 < r13) {
            }
            String str62 = dp.f25172k;
            h(com.IceFishing.LiveIceFishing.k.r(new StringBuilder(str.length() + String.valueOf(str62).length() + 22), "codec.profileLevel, ", str62, ", ", str));
            return false;
        }
        return true;
    }

    public final boolean g(DP dp) {
        return (Objects.equals(dp.f25176o, com.anythink.basead.exoplayer.k.o.f9215K) && dp.f25156K == 22 && Build.VERSION.SDK_INT < 34 && this.f27597a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final void h(String str) {
        String str2 = AbstractC3182eu.f30782a;
        String str3 = this.f27598b;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length() + 14;
        String str4 = this.f27597a;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 2 + length + 3 + length2 + 1);
        AbstractC5128c.h(sb, "NoSupport [", str, "] [", str4);
        AbstractC5128c.h(sb, ", ", str3, "] [", str2);
        sb.append("]");
        AbstractC2991bG.k(com.anythink.basead.exoplayer.f.a.f7982a, sb.toString());
    }

    public final String toString() {
        return this.f27597a;
    }
}
