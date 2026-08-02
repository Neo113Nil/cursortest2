package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes10.dex */
public final class sb10 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public sb10(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.k = z7;
        this.l = eh20.p(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(tw21.f(i, widthAlignment) * widthAlignment, tw21.f(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static sb10 j(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z7;
        boolean z8;
        boolean z9;
        String str6;
        String str7;
        if (codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (tw21.a <= 22) {
                String str8 = Build.MODEL;
                if (!"ODROID-XU3".equals(str8)) {
                }
                if (!"OMX.Exynos.AVC.Decoder".equals(str)) {
                }
            }
            z5 = true;
            boolean z10 = codecCapabilities == null && codecCapabilities.isFeatureSupported("tunneled-playback");
            boolean z11 = !z4 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
            if (tw21.a >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
                str7 = Build.MANUFACTURER;
                if (!str7.equals("Xiaomi") && !str7.equals("OPPO")) {
                    z6 = true;
                    str6 = str;
                    str5 = str3;
                    codecCapabilities2 = codecCapabilities;
                    z7 = z;
                    z8 = z2;
                    z9 = z3;
                    str4 = str2;
                    return new sb10(str6, str4, str5, codecCapabilities2, z7, z8, z9, z5, z10, z11, z6);
                }
            }
            z6 = false;
            str4 = str2;
            str5 = str3;
            codecCapabilities2 = codecCapabilities;
            z7 = z;
            z8 = z2;
            z9 = z3;
            str6 = str;
            return new sb10(str6, str4, str5, codecCapabilities2, z7, z8, z9, z5, z10, z11, z6);
        }
        z5 = false;
        if (codecCapabilities == null) {
        }
        if (z4) {
        }
        if (tw21.a >= 35) {
            str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi")) {
                z6 = true;
                str6 = str;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z7 = z;
                z8 = z2;
                z9 = z3;
                str4 = str2;
                return new sb10(str6, str4, str5, codecCapabilities2, z7, z8, z9, z5, z10, z11, z6);
            }
        }
        z6 = false;
        str4 = str2;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z7 = z;
        z8 = z2;
        z9 = z3;
        str6 = str;
        return new sb10(str6, str4, str5, codecCapabilities2, z7, z8, z9, z5, z10, z11, z6);
    }

    public final qyg b(a aVar, a aVar2) {
        a aVar3;
        a aVar4;
        String str = aVar.n;
        kfc kfcVar = aVar.B;
        String str2 = aVar2.n;
        kfc kfcVar2 = aVar2.B;
        int i = !Objects.equals(str, str2) ? 8 : 0;
        if (this.l) {
            if (aVar.x != aVar2.x) {
                i |= 1024;
            }
            if (!this.e && (aVar.u != aVar2.u || aVar.v != aVar2.v)) {
                i |= 512;
            }
            if ((!kfc.e(kfcVar) || !kfc.e(kfcVar2)) && !Objects.equals(kfcVar, kfcVar2)) {
                i |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !aVar.b(aVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new qyg(this.a, aVar, aVar2, aVar.b(aVar2) ? 3 : 2, 0);
            }
            aVar3 = aVar;
            aVar4 = aVar2;
        } else {
            aVar3 = aVar;
            aVar4 = aVar2;
            if (aVar3.D != aVar4.D) {
                i |= 4096;
            }
            if (aVar3.E != aVar4.E) {
                i |= 8192;
            }
            if (aVar3.F != aVar4.F) {
                i |= 16384;
            }
            String str3 = this.b;
            if (i == 0 && "audio/mp4a-latm".equals(str3)) {
                Pair d = fd10.d(aVar3);
                Pair d2 = fd10.d(aVar4);
                if (d != null && d2 != null) {
                    int intValue = ((Integer) d.first).intValue();
                    int intValue2 = ((Integer) d2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new qyg(this.a, aVar3, aVar4, 3, 0);
                    }
                }
            }
            if (!aVar3.b(aVar4)) {
                i |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i |= 2;
            }
            if (i == 0) {
                return new qyg(this.a, aVar3, aVar4, 1, 0);
            }
        }
        return new qyg(this.a, aVar3, aVar4, 0, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x012d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(a aVar, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pair;
        String str;
        int i;
        Pair d = fd10.d(aVar);
        String str2 = aVar.n;
        int i2 = 4;
        String str3 = this.c;
        int i3 = 1;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String q = eh20.q(str3);
            if (q.equals("video/mv-hevc")) {
                return true;
            }
            if (q.equals("video/hevc")) {
                List list = aVar.q;
                int i4 = 0;
                loop0: while (true) {
                    if (i4 >= list.size()) {
                        pair = null;
                        str = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i4);
                    int length = bArr.length;
                    int i5 = 3;
                    if (length > 3) {
                        boolean[] zArr = new boolean[3];
                        piv pivVar = ImmutableList.b;
                        ImmutableList.a aVar2 = new ImmutableList.a();
                        int i6 = 0;
                        while (i6 < bArr.length) {
                            int b = l150.b(bArr, i6, bArr.length, zArr);
                            if (b != bArr.length) {
                                aVar2.a(Integer.valueOf(b));
                            }
                            i6 = b + 3;
                        }
                        ImmutableList g = aVar2.g();
                        int i7 = 0;
                        while (i7 < g.size()) {
                            if (((Integer) g.get(i7)).intValue() + i5 < length) {
                                a69 a69Var = new a69(((Integer) g.get(i7)).intValue() + i5, length, i3, bArr);
                                kb e = l150.e(a69Var);
                                if (e.a == 33 && e.b == 0) {
                                    a69Var.u(4);
                                    int p = a69Var.p(3);
                                    a69Var.t();
                                    pair = null;
                                    e150 f = l150.f(a69Var, true, p, null);
                                    str = bac.b(f.a, f.b, f.c, f.d, f.e, f.f);
                                    break loop0;
                                }
                                i = 3;
                            } else {
                                i = i5;
                            }
                            i7++;
                            i5 = i;
                            i3 = 1;
                        }
                    }
                    i4++;
                    i3 = 1;
                }
                if (str != null) {
                    String trim = str.trim();
                    int i8 = tw21.a;
                    d = bac.c(str, trim.split("\\.", -1), aVar.B);
                    if (d != null) {
                        int intValue = ((Integer) d.first).intValue();
                        int intValue2 = ((Integer) d.second).intValue();
                        boolean equals = "video/dolby-vision".equals(str2);
                        String str4 = this.b;
                        if (equals) {
                            str4.getClass();
                            switch (str4) {
                                case "video/av01":
                                case "video/hevc":
                                    intValue = 2;
                                    intValue2 = 0;
                                    break;
                                case "video/avc":
                                    intValue = 8;
                                    intValue2 = 0;
                                    break;
                            }
                        }
                        if (this.l || intValue == 42) {
                            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                            }
                            if (tw21.a <= 23 && "video/x-vnd.on2.vp9".equals(str4) && codecProfileLevelArr.length == 0) {
                                int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                                if (intValue3 >= 180000000) {
                                    i2 = 1024;
                                } else if (intValue3 >= 120000000) {
                                    i2 = 512;
                                } else if (intValue3 >= 60000000) {
                                    i2 = 256;
                                } else if (intValue3 >= 30000000) {
                                    i2 = 128;
                                } else if (intValue3 >= 18000000) {
                                    i2 = 64;
                                } else if (intValue3 >= 12000000) {
                                    i2 = 32;
                                } else if (intValue3 >= 7200000) {
                                    i2 = 16;
                                } else if (intValue3 >= 3600000) {
                                    i2 = 8;
                                } else if (intValue3 < 1800000) {
                                    i2 = intValue3 >= 800000 ? 2 : 1;
                                }
                                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                                codecProfileLevel.profile = 1;
                                codecProfileLevel.level = i2;
                                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                            }
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                                if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z)) {
                                    if ("video/hevc".equals(str4) && 2 == intValue) {
                                        String str5 = Build.DEVICE;
                                        if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                                        }
                                    }
                                }
                            }
                            i("codec.profileLevel, " + aVar.k + Extension.FIX_SPACE + str3);
                            return false;
                        }
                    }
                    return true;
                }
                d = pair;
            }
        }
        if (d != null) {
        }
        return true;
    }

    public final boolean d(a aVar) {
        return (Objects.equals(aVar.n, "audio/flac") && aVar.F == 22 && tw21.a < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(a aVar) {
        int i;
        String str = aVar.n;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(fd10.b(aVar))) || !c(aVar, true) || !d(aVar)) {
            return false;
        }
        if (this.l) {
            int i2 = aVar.u;
            if (i2 > 0 && (i = aVar.v) > 0) {
                return h(i2, i, aVar.w);
            }
        } else {
            int i3 = aVar.E;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i3 != -1) {
                if (codecCapabilities == null) {
                    i("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    i("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    i("sampleRate.support, " + i3);
                    return false;
                }
            }
            int i4 = aVar.D;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    i("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    i("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((tw21.a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    StringBuilder u = b64.u(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.a, ", [", " to ");
                    u.append(i5);
                    u.append("]");
                    lk91.j(u.toString());
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    i("channelCount.support, " + i4);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (tw21.a >= 29 && "video/x-vnd.on2.vp9".equals(this.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g(a aVar) {
        if (this.l) {
            return this.e;
        }
        Pair d = fd10.d(aVar);
        return d != null && ((Integer) d.first).intValue() == 42;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
    
        if (r2 == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i, int i2, double d) {
        char c;
        Boolean bool;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        boolean z;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            i("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            i("sizeAndRate.vCaps");
            return false;
        }
        int i3 = tw21.a;
        if (i3 >= 29) {
            if (i3 >= 29 && (((bool = ckb1.a) == null || !bool.booleanValue()) && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty())) {
                MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
                int i4 = 0;
                while (true) {
                    if (i4 >= supportedPerformancePoints.size()) {
                        c = 1;
                        break;
                    }
                    if (supportedPerformancePoints.get(i4).covers(performancePoint)) {
                        c = 2;
                        break;
                    }
                    i4++;
                }
                if (c == 1 && ckb1.a == null) {
                    if (i3 < 35) {
                        int d2 = akb1.d(false);
                        int d3 = akb1.d(true);
                        if (d2 == 0 || (d3 != 0 ? d2 != 2 || d3 != 2 : d2 != 2)) {
                            z = true;
                            ckb1.a = Boolean.valueOf(z);
                        }
                    }
                    z = false;
                    ckb1.a = Boolean.valueOf(z);
                }
                if (c != 2) {
                    if (c == 1) {
                        StringBuilder s = b64.s(i, i2, "sizeAndRate.cover, ", RemoteBioParameters.X, "@");
                        s.append(d);
                        i(s.toString());
                        return false;
                    }
                }
                return true;
            }
            c = 0;
            if (c != 2) {
            }
            return true;
        }
        if (!a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i2, i, d)) {
                    StringBuilder s2 = b64.s(i, i2, "sizeAndRate.rotated, ", RemoteBioParameters.X, "@");
                    s2.append(d);
                    StringBuilder v = b64.v("AssumedSupport [", s2.toString(), "] [", str, Extension.FIX_SPACE);
                    v.append(this.b);
                    v.append("] [");
                    v.append(tw21.b);
                    v.append("]");
                    lk91.d(v.toString());
                    return true;
                }
            }
            StringBuilder s3 = b64.s(i, i2, "sizeAndRate.support, ", RemoteBioParameters.X, "@");
            s3.append(d);
            i(s3.toString());
            return false;
        }
        return true;
    }

    public final void i(String str) {
        StringBuilder x = unr0.x("NoSupport [", str, "] [");
        x.append(this.a);
        x.append(Extension.FIX_SPACE);
        x.append(this.b);
        x.append("] [");
        x.append(tw21.b);
        x.append("]");
        lk91.d(x.toString());
    }

    public final String toString() {
        return this.a;
    }
}
