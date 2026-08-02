package com.anythink.basead.exoplayer.f;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.o;
import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7982a = "MediaCodecInfo";

    /* renamed from: b, reason: collision with root package name */
    public static final int f7983b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final String f7984c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7985d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f7986e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7987f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7988g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7989h;
    public final boolean i;

    private a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z9, boolean z10) {
        this.f7984c = (String) com.anythink.basead.exoplayer.k.a.a(str);
        this.f7985d = str2;
        this.f7986e = codecCapabilities;
        this.i = z6;
        boolean z11 = false;
        this.f7987f = !z9 && codecCapabilities != null && af.f9132a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.f7988g = codecCapabilities != null && af.f9132a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (z10 || (codecCapabilities != null && af.f9132a >= 21 && codecCapabilities.isFeatureSupported("secure-playback"))) {
            z11 = true;
        }
        this.f7989h = z11;
    }

    public static a a(String str) {
        return new a(str, null, null, true, false, false);
    }

    private int b() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (af.f9132a < 23 || (codecCapabilities = this.f7986e) == null) {
            return -1;
        }
        return codecCapabilities.getMaxSupportedInstances();
    }

    private void c(String str) {
        StringBuilder l9 = Wv.l("NoSupport [", str, "] [");
        l9.append(this.f7984c);
        l9.append(", ");
        l9.append(this.f7985d);
        l9.append("] [");
        l9.append(af.f9136e);
        l9.append("]");
        Log.d(f7982a, l9.toString());
    }

    private void d(String str) {
        StringBuilder l9 = Wv.l("AssumedSupport [", str, "] [");
        l9.append(this.f7984c);
        l9.append(", ");
        l9.append(this.f7985d);
        l9.append("] [");
        l9.append(af.f9136e);
        l9.append("]");
        Log.d(f7982a, l9.toString());
    }

    private static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return af.f9132a >= 21 && codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static int g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    private static a a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return new a(str, str2, codecCapabilities, false, false, false);
    }

    public static a a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z9) {
        return new a(str, str2, codecCapabilities, false, z6, z9);
    }

    public final boolean b(String str) {
        String c9;
        if (str == null || this.f7985d == null || (c9 = o.c(str)) == null) {
            return true;
        }
        if (!this.f7985d.equals(c9)) {
            c("codec.mime " + str + ", " + c9);
            return false;
        }
        Pair<Integer, Integer> a9 = d.a(str);
        if (a9 == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a()) {
            if (codecProfileLevel.profile == ((Integer) a9.first).intValue() && codecProfileLevel.level >= ((Integer) a9.second).intValue()) {
                return true;
            }
        }
        c("codec.profileLevel, " + str + ", " + c9);
        return false;
    }

    public final MediaCodecInfo.CodecProfileLevel[] a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7986e;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean a(int i, int i4, double d9) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7986e;
        if (codecCapabilities == null) {
            c("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            c("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i, i4, d9)) {
            return true;
        }
        if (i < i4 && a(videoCapabilities, i4, i, d9)) {
            StringBuilder j6 = Wv.j(i, i4, "sizeAndRate.rotated, ", "x", "x");
            j6.append(d9);
            StringBuilder l9 = Wv.l("AssumedSupport [", j6.toString(), "] [");
            l9.append(this.f7984c);
            l9.append(", ");
            l9.append(this.f7985d);
            l9.append("] [");
            l9.append(af.f9136e);
            l9.append("]");
            Log.d(f7982a, l9.toString());
            return true;
        }
        StringBuilder j9 = Wv.j(i, i4, "sizeAndRate.support, ", "x", "x");
        j9.append(d9);
        c(j9.toString());
        return false;
    }

    private static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return af.f9132a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public final boolean b(int i) {
        int i4;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7986e;
        if (codecCapabilities == null) {
            c("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            c("channelCount.aCaps");
            return false;
        }
        String str = this.f7984c;
        String str2 = this.f7985d;
        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((af.f9132a < 26 || maxInputChannelCount <= 0) && !o.f9248t.equals(str2) && !o.f9214I.equals(str2) && !o.J.equals(str2) && !o.f9246r.equals(str2) && !o.f9212G.equals(str2) && !o.f9213H.equals(str2) && !o.f9251w.equals(str2) && !o.f9215K.equals(str2) && !o.f9252x.equals(str2) && !o.f9253y.equals(str2) && !o.f9217M.equals(str2))) {
            if (o.f9254z.equals(str2)) {
                i4 = 6;
            } else {
                i4 = o.f9206A.equals(str2) ? 16 : 30;
            }
            Log.w(f7982a, "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i4 + "]");
            maxInputChannelCount = i4;
        }
        if (maxInputChannelCount >= i) {
            return true;
        }
        c("channelCount.support, ".concat(String.valueOf(i)));
        return false;
    }

    private static boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public final Point a(int i, int i4) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7986e;
        if (codecCapabilities == null) {
            c("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            c("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(af.a(i, widthAlignment) * widthAlignment, af.a(i4, heightAlignment) * heightAlignment);
    }

    public final boolean a(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7986e;
        if (codecCapabilities == null) {
            c("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            c("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        c("sampleRate.support, ".concat(String.valueOf(i)));
        return false;
    }

    private static int a(String str, String str2, int i) {
        int i4;
        if (i > 1 || ((af.f9132a >= 26 && i > 0) || o.f9248t.equals(str2) || o.f9214I.equals(str2) || o.J.equals(str2) || o.f9246r.equals(str2) || o.f9212G.equals(str2) || o.f9213H.equals(str2) || o.f9251w.equals(str2) || o.f9215K.equals(str2) || o.f9252x.equals(str2) || o.f9253y.equals(str2) || o.f9217M.equals(str2))) {
            return i;
        }
        if (o.f9254z.equals(str2)) {
            i4 = 6;
        } else {
            i4 = o.f9206A.equals(str2) ? 16 : 30;
        }
        Log.w(f7982a, "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i4 + "]");
        return i4;
    }

    private static boolean a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return af.f9132a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i4, double d9) {
        if (d9 != -1.0d && d9 > 0.0d) {
            return videoCapabilities.areSizeAndRateSupported(i, i4, d9);
        }
        return videoCapabilities.isSizeSupported(i, i4);
    }
}
