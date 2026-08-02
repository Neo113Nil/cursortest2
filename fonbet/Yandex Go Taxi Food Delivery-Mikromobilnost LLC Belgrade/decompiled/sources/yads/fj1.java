package yads;

import defpackage.aq61;
import defpackage.qd81;

/* loaded from: classes7.dex */
public final class fj1 extends Exception {
    public final String b;
    public final boolean c;
    public final aq61 d;
    public final String e;

    public fj1(qd81 qd81Var, lj1 lj1Var, int i) {
        this("Decoder init failed: [" + i + "], " + qd81Var, lj1Var, qd81Var.E, false, null, "com.monetization.ads.exoplayer2.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public fj1(String str, Throwable th, String str2, boolean z, aq61 aq61Var, String str3) {
        super(str, th);
        this.b = str2;
        this.c = z;
        this.d = aq61Var;
        this.e = str3;
    }
}
