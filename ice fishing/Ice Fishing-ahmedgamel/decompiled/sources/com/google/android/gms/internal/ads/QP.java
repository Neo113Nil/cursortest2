package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class QP extends Exception {

    /* renamed from: n, reason: collision with root package name */
    public final String f27811n;

    /* renamed from: u, reason: collision with root package name */
    public final PP f27812u;

    /* renamed from: v, reason: collision with root package name */
    public final String f27813v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public QP(DP dp, UP up, int i) {
        this(r5, up, dp.f25176o, null, D.x.k(r13, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", new StringBuilder(String.valueOf(r13).length() + 60)));
        String dp2 = dp.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25 + dp2.length());
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(dp2);
        String sb2 = sb.toString();
        int abs = Math.abs(i);
    }

    public QP(String str, Throwable th, String str2, PP pp, String str3) {
        super(str, th);
        this.f27811n = str2;
        this.f27812u = pp;
        this.f27813v = str3;
    }
}
