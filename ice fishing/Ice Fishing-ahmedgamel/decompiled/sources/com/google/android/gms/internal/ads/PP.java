package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class PP extends Exception {

    /* renamed from: n, reason: collision with root package name */
    public final String f26815n;

    /* renamed from: u, reason: collision with root package name */
    public final OP f26816u;

    /* renamed from: v, reason: collision with root package name */
    public final String f26817v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PP(DP dp, TP tp, int i) {
        this(r5, tp, dp.f24431o, null, D.y.m(r13, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", new StringBuilder(String.valueOf(r13).length() + 60)));
        String dp2 = dp.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25 + dp2.length());
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(dp2);
        String sb2 = sb.toString();
        int abs = Math.abs(i);
    }

    public PP(String str, Throwable th, String str2, OP op, String str3) {
        super(str, th);
        this.f26815n = str2;
        this.f26816u = op;
        this.f26817v = str3;
    }
}
