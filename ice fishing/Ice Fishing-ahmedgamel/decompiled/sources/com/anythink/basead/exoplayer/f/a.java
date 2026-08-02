package com.anythink.basead.exoplayer.f;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.o;
import com.icefishingapp.icefishing.AbstractC4404f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7196a = "MediaCodecInfo";

    /* renamed from: b, reason: collision with root package name */
    public static final int f7197b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final String f7198c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7199d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f7200e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7201f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7202g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7203h;
    public final boolean i;

    private a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z3, boolean z6, boolean z9) {
        this.f7198c = (String) com.anythink.basead.exoplayer.k.a.a(str);
        this.f7199d = str2;
        this.f7200e = codecCapabilities;
        this.i = z3;
        boolean z10 = false;
        this.f7201f = !z6 && codecCapabilities != null && af.f8346a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.f7202g = codecCapabilities != null && af.f8346a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (z9 || (codecCapabilities != null && af.f8346a >= 21 && codecCapabilities.isFeatureSupported("secure-playback"))) {
            z10 = true;
        }
        this.f7203h = z10;
    }

    public static a a(String str) {
        return new a(str, null, null, true, false, false);
    }

    private int b() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (af.f8346a < 23 || (codecCapabilities = this.f7200e) == null) {
            return -1;
        }
        return codecCapabilities.getMaxSupportedInstances();
    }

    private void c(String str) {
        StringBuilder j6 = AbstractC4404f.j("NoSupport [", str, "] [");
        j6.append(this.f7198c);
        j6.append(", ");
        j6.append(this.f7199d);
        j6.append("] [");
        j6.append(af.f8350e);
        j6.append("]");
        Log.d(f7196a, j6.toString());
    }

    private void d(String str) {
        StringBuilder j6 = AbstractC4404f.j("AssumedSupport [", str, "] [");
        j6.append(this.f7198c);
        j6.append(", ");
        j6.append(this.f7199d);
        j6.append("] [");
        j6.append(af.f8350e);
        j6.append("]");
        Log.d(f7196a, j6.toString());
    }

    private static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return af.f8346a >= 21 && codecCapabilities.isFeatureSupported("secure-playback");
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

    public static a a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z3, boolean z6) {
        return new a(str, str2, codecCapabilities, false, z3, z6);
    }

    public final boolean b(String str) {
        String c9;
        if (str == null || this.f7199d == null || (c9 = o.c(str)) == null) {
            return true;
        }
        if (!this.f7199d.equals(c9)) {
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
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7200e;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean a(int i, int i6, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7200e;
        if (codecCapabilities == null) {
            c("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            c("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i, i6, d2)) {
            return true;
        }
        if (i < i6 && a(videoCapabilities, i6, i, d2)) {
            StringBuilder h9 = AbstractC4404f.h(i, i6, "sizeAndRate.rotated, ", "x", "x");
            h9.append(d2);
            StringBuilder j6 = AbstractC4404f.j("AssumedSupport [", h9.toString(), "] [");
            j6.append(this.f7198c);
            j6.append(", ");
            j6.append(this.f7199d);
            j6.append("] [");
            j6.append(af.f8350e);
            j6.append("]");
            Log.d(f7196a, j6.toString());
            return true;
        }
        StringBuilder h10 = AbstractC4404f.h(i, i6, "sizeAndRate.support, ", "x", "x");
        h10.append(d2);
        c(h10.toString());
        return false;
    }

    private static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return af.f8346a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public final boolean b(int i) {
        int i6;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7200e;
        if (codecCapabilities == null) {
            c("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            c("channelCount.aCaps");
            return false;
        }
        String str = this.f7198c;
        String str2 = this.f7199d;
        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((af.f8346a < 26 || maxInputChannelCount <= 0) && !o.f8462t.equals(str2) && !o.f8428I.equals(str2) && !o.J.equals(str2) && !o.f8460r.equals(str2) && !o.f8426G.equals(str2) && !o.f8427H.equals(str2) && !o.f8465w.equals(str2) && !o.f8429K.equals(str2) && !o.f8466x.equals(str2) && !o.f8467y.equals(str2) && !o.f8431M.equals(str2))) {
            if (o.f8468z.equals(str2)) {
                i6 = 6;
            } else {
                i6 = o.f8420A.equals(str2) ? 16 : 30;
            }
            Log.w(f7196a, "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i6 + "]");
            maxInputChannelCount = i6;
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

    public final Point a(int i, int i6) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7200e;
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
        return new Point(af.a(i, widthAlignment) * widthAlignment, af.a(i6, heightAlignment) * heightAlignment);
    }

    public final boolean a(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7200e;
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
        int i6;
        if (i > 1 || ((af.f8346a >= 26 && i > 0) || o.f8462t.equals(str2) || o.f8428I.equals(str2) || o.J.equals(str2) || o.f8460r.equals(str2) || o.f8426G.equals(str2) || o.f8427H.equals(str2) || o.f8465w.equals(str2) || o.f8429K.equals(str2) || o.f8466x.equals(str2) || o.f8467y.equals(str2) || o.f8431M.equals(str2))) {
            return i;
        }
        if (o.f8468z.equals(str2)) {
            i6 = 6;
        } else {
            i6 = o.f8420A.equals(str2) ? 16 : 30;
        }
        Log.w(f7196a, "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i6 + "]");
        return i6;
    }

    private static boolean a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return af.f8346a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i6, double d2) {
        if (d2 != -1.0d && d2 > 0.0d) {
            return videoCapabilities.areSizeAndRateSupported(i, i6, d2);
        }
        return videoCapabilities.isSizeSupported(i, i6);
    }
}
