package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.Objects;

/* loaded from: classes.dex */
public final class mih {
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

    public mih(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
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
        this.l = l5i.o(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(dvt.f(i, widthAlignment) * widthAlignment, dvt.f(i2, heightAlignment) * heightAlignment);
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
    public static mih j(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
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
            if (dvt.a <= 22) {
                String str8 = Build.MODEL;
                if (!"ODROID-XU3".equals(str8)) {
                }
                if (!"OMX.Exynos.AVC.Decoder".equals(str)) {
                }
            }
            z5 = true;
            boolean z10 = codecCapabilities == null && codecCapabilities.isFeatureSupported("tunneled-playback");
            boolean z11 = !z4 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
            if (dvt.a >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
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
                    return new mih(str6, str4, str5, codecCapabilities2, z7, z8, z9, z5, z10, z11, z6);
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
            return new mih(str6, str4, str5, codecCapabilities2, z7, z8, z9, z5, z10, z11, z6);
        }
        z5 = false;
        if (codecCapabilities == null) {
        }
        if (z4) {
        }
        if (dvt.a >= 35) {
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
                return new mih(str6, str4, str5, codecCapabilities2, z7, z8, z9, z5, z10, z11, z6);
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
        return new mih(str6, str4, str5, codecCapabilities2, z7, z8, z9, z5, z10, z11, z6);
    }

    public final tg7 b(dsc dscVar, dsc dscVar2) {
        dsc dscVar3;
        dsc dscVar4;
        String str = dscVar.n;
        q85 q85Var = dscVar.B;
        String str2 = dscVar2.n;
        q85 q85Var2 = dscVar2.B;
        int i = !Objects.equals(str, str2) ? 8 : 0;
        if (this.l) {
            if (dscVar.x != dscVar2.x) {
                i |= 1024;
            }
            if (!this.e && (dscVar.u != dscVar2.u || dscVar.v != dscVar2.v)) {
                i |= RemoteCameraConfig.Mic.BUFFER_SIZE;
            }
            if ((!q85.e(q85Var) || !q85.e(q85Var2)) && !Objects.equals(q85Var, q85Var2)) {
                i |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !dscVar.b(dscVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new tg7(this.a, dscVar, dscVar2, dscVar.b(dscVar2) ? 3 : 2, 0);
            }
            dscVar3 = dscVar;
            dscVar4 = dscVar2;
        } else {
            dscVar3 = dscVar;
            dscVar4 = dscVar2;
            if (dscVar3.D != dscVar4.D) {
                i |= 4096;
            }
            if (dscVar3.E != dscVar4.E) {
                i |= RemoteCameraConfig.Notification.ID;
            }
            if (dscVar3.F != dscVar4.F) {
                i |= 16384;
            }
            String str3 = this.b;
            if (i == 0 && "audio/mp4a-latm".equals(str3)) {
                Pair d = zjh.d(dscVar3);
                Pair d2 = zjh.d(dscVar4);
                if (d != null && d2 != null) {
                    int intValue = ((Integer) d.first).intValue();
                    int intValue2 = ((Integer) d2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new tg7(this.a, dscVar3, dscVar4, 3, 0);
                    }
                }
            }
            if (!dscVar3.b(dscVar4)) {
                i |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i |= 2;
            }
            if (i == 0) {
                return new tg7(this.a, dscVar3, dscVar4, 1, 0);
            }
        }
        return new tg7(this.a, dscVar3, dscVar4, 0, i);
    }

    public final boolean c(dsc dscVar, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair d = zjh.d(dscVar);
        String str = dscVar.n;
        String str2 = this.c;
        if (str != null && str.equals("video/mv-hevc")) {
            String p = l5i.p(str2);
            if (!p.equals("video/mv-hevc")) {
                if (p.equals("video/hevc")) {
                    String C = zc4.C(dscVar.q);
                    if (C == null) {
                        d = null;
                    } else {
                        String trim = C.trim();
                        int i = dvt.a;
                        d = ir4.c(C, trim.split("\\.", -1), dscVar.B);
                    }
                }
            }
            return true;
        }
        if (d != null) {
            int intValue = ((Integer) d.first).intValue();
            int intValue2 = ((Integer) d.second).intValue();
            boolean equals = "video/dolby-vision".equals(str);
            int i2 = 8;
            String str3 = this.b;
            if (equals) {
                str3.getClass();
                switch (str3) {
                    case "video/av01":
                    case "video/hevc":
                        intValue = 2;
                        break;
                    case "video/avc":
                        intValue = 8;
                        break;
                }
                intValue2 = 0;
            }
            if (this.l || intValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (dvt.a <= 23 && "video/x-vnd.on2.vp9".equals(str3) && codecProfileLevelArr.length == 0) {
                    int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                    if (intValue3 >= 180000000) {
                        i2 = 1024;
                    } else if (intValue3 >= 120000000) {
                        i2 = RemoteCameraConfig.Mic.BUFFER_SIZE;
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
                    } else if (intValue3 < 3600000) {
                        i2 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i2;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z)) {
                        if ("video/hevc".equals(str3) && 2 == intValue) {
                            String str4 = Build.DEVICE;
                            if (!"sailfish".equals(str4) && !"marlin".equals(str4)) {
                            }
                        }
                    }
                }
                i("codec.profileLevel, " + dscVar.k + ", " + str2);
                return false;
            }
        }
        return true;
    }

    public final boolean d(dsc dscVar) {
        return (Objects.equals(dscVar.n, "audio/flac") && dscVar.F == 22 && dvt.a < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(dsc dscVar) {
        int i;
        String str = dscVar.n;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(zjh.b(dscVar))) || !c(dscVar, true) || !d(dscVar)) {
            return false;
        }
        if (this.l) {
            int i2 = dscVar.u;
            if (i2 > 0 && (i = dscVar.v) > 0) {
                return h(dscVar.w, i2, i);
            }
        } else {
            int i3 = dscVar.E;
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
            int i4 = dscVar.D;
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
                if (maxInputChannelCount <= 1 && ((dvt.a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    StringBuilder l = f1d.l(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.a, ", [", " to ");
                    l.append(i5);
                    l.append("]");
                    vq1.n0("MediaCodecInfo", l.toString());
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
        if (dvt.a >= 29 && "video/x-vnd.on2.vp9".equals(this.b)) {
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

    public final boolean g(dsc dscVar) {
        if (this.l) {
            return this.e;
        }
        Pair d = zjh.d(dscVar);
        return d != null && ((Integer) d.first).intValue() == 42;
    }

    public final boolean h(double d, int i, int i2) {
        Boolean bool;
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
        int i3 = dvt.a;
        if (i3 >= 29) {
            int a = (i3 < 29 || ((bool = cb0.a) != null && bool.booleanValue())) ? 0 : mi.a(videoCapabilities, i, i2, d);
            if (a != 2) {
                if (a == 1) {
                    StringBuilder l = dfi.l("sizeAndRate.cover, ", i, i2, "x", "@");
                    l.append(d);
                    i(l.toString());
                    return false;
                }
            }
            return true;
        }
        if (!a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i2, i, d)) {
                    StringBuilder l2 = dfi.l("sizeAndRate.rotated, ", i, i2, "x", "@");
                    l2.append(d);
                    StringBuilder m = f1d.m("AssumedSupport [", l2.toString(), "] [", str, ", ");
                    m.append(this.b);
                    m.append("] [");
                    m.append(dvt.b);
                    m.append("]");
                    vq1.H("MediaCodecInfo", m.toString());
                    return true;
                }
            }
            StringBuilder l3 = dfi.l("sizeAndRate.support, ", i, i2, "x", "@");
            l3.append(d);
            i(l3.toString());
            return false;
        }
        return true;
    }

    public final void i(String str) {
        StringBuilder u = ouj.u("NoSupport [", str, "] [");
        u.append(this.a);
        u.append(", ");
        u.append(this.b);
        u.append("] [");
        u.append(dvt.b);
        u.append("]");
        vq1.H("MediaCodecInfo", u.toString());
    }

    public final String toString() {
        return this.a;
    }
}
