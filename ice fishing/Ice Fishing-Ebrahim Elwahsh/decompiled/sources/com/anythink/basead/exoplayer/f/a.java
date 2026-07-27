package com.anythink.basead.exoplayer.f;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.o;
import com.google.android.gms.internal.ads.CL;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7353a = "MediaCodecInfo";

    /* renamed from: b, reason: collision with root package name */
    public static final int f7354b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final String f7355c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7356d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f7357e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7358f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7359g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7360h;
    public final boolean i;

    private a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z8, boolean z9, boolean z10) {
        this.f7355c = (String) C0544a.a(str);
        this.f7356d = str2;
        this.f7357e = codecCapabilities;
        this.i = z8;
        boolean z11 = false;
        this.f7358f = !z9 && codecCapabilities != null && af.f8503a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.f7359g = codecCapabilities != null && af.f8503a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (z10 || (codecCapabilities != null && af.f8503a >= 21 && codecCapabilities.isFeatureSupported("secure-playback"))) {
            z11 = true;
        }
        this.f7360h = z11;
    }

    public static a a(String str) {
        return new a(str, null, null, true, false, false);
    }

    private int b() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (af.f8503a < 23 || (codecCapabilities = this.f7357e) == null) {
            return -1;
        }
        return codecCapabilities.getMaxSupportedInstances();
    }

    private void c(String str) {
        StringBuilder m8 = CL.m("NoSupport [", str, "] [");
        m8.append(this.f7355c);
        m8.append(", ");
        m8.append(this.f7356d);
        m8.append("] [");
        m8.append(af.f8507e);
        m8.append("]");
        Log.d(f7353a, m8.toString());
    }

    private void d(String str) {
        StringBuilder m8 = CL.m("AssumedSupport [", str, "] [");
        m8.append(this.f7355c);
        m8.append(", ");
        m8.append(this.f7356d);
        m8.append("] [");
        m8.append(af.f8507e);
        m8.append("]");
        Log.d(f7353a, m8.toString());
    }

    private static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return af.f8503a >= 21 && codecCapabilities.isFeatureSupported("secure-playback");
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

    public static a a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z8, boolean z9) {
        return new a(str, str2, codecCapabilities, false, z8, z9);
    }

    public final boolean b(String str) {
        String c4;
        if (str == null || this.f7356d == null || (c4 = o.c(str)) == null) {
            return true;
        }
        if (!this.f7356d.equals(c4)) {
            c("codec.mime " + str + ", " + c4);
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
        c("codec.profileLevel, " + str + ", " + c4);
        return false;
    }

    public final MediaCodecInfo.CodecProfileLevel[] a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7357e;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean a(int i, int i4, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7357e;
        if (codecCapabilities == null) {
            c("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            c("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i, i4, d2)) {
            return true;
        }
        if (i < i4 && a(videoCapabilities, i4, i, d2)) {
            StringBuilder h9 = AbstractC5051n.h(i, i4, "sizeAndRate.rotated, ", "x", "x");
            h9.append(d2);
            StringBuilder m8 = CL.m("AssumedSupport [", h9.toString(), "] [");
            m8.append(this.f7355c);
            m8.append(", ");
            m8.append(this.f7356d);
            m8.append("] [");
            m8.append(af.f8507e);
            m8.append("]");
            Log.d(f7353a, m8.toString());
            return true;
        }
        StringBuilder h10 = AbstractC5051n.h(i, i4, "sizeAndRate.support, ", "x", "x");
        h10.append(d2);
        c(h10.toString());
        return false;
    }

    private static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return af.f8503a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public final boolean b(int i) {
        int i4;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7357e;
        if (codecCapabilities == null) {
            c("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            c("channelCount.aCaps");
            return false;
        }
        String str = this.f7355c;
        String str2 = this.f7356d;
        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((af.f8503a < 26 || maxInputChannelCount <= 0) && !o.f8619t.equals(str2) && !o.f8585I.equals(str2) && !o.J.equals(str2) && !o.f8617r.equals(str2) && !o.f8583G.equals(str2) && !o.f8584H.equals(str2) && !o.f8622w.equals(str2) && !o.f8586K.equals(str2) && !o.f8623x.equals(str2) && !o.f8624y.equals(str2) && !o.f8588M.equals(str2))) {
            if (o.f8625z.equals(str2)) {
                i4 = 6;
            } else {
                i4 = o.f8577A.equals(str2) ? 16 : 30;
            }
            Log.w(f7353a, "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i4 + "]");
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
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7357e;
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
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7357e;
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
        if (i > 1 || ((af.f8503a >= 26 && i > 0) || o.f8619t.equals(str2) || o.f8585I.equals(str2) || o.J.equals(str2) || o.f8617r.equals(str2) || o.f8583G.equals(str2) || o.f8584H.equals(str2) || o.f8622w.equals(str2) || o.f8586K.equals(str2) || o.f8623x.equals(str2) || o.f8624y.equals(str2) || o.f8588M.equals(str2))) {
            return i;
        }
        if (o.f8625z.equals(str2)) {
            i4 = 6;
        } else {
            i4 = o.f8577A.equals(str2) ? 16 : 30;
        }
        Log.w(f7353a, "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i4 + "]");
        return i4;
    }

    private static boolean a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return af.f8503a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i4, double d2) {
        if (d2 != -1.0d && d2 > 0.0d) {
            return videoCapabilities.areSizeAndRateSupported(i, i4, d2);
        }
        return videoCapabilities.isSizeSupported(i, i4);
    }
}
