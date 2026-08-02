package defpackage;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class nv6 {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final le3 j;

    public nv6() {
        le3 le3Var;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        if (dvt.a >= 24) {
            le3Var = new le3();
            le3Var.a = cryptoInfo;
            le3Var.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        } else {
            le3Var = null;
        }
        this.j = le3Var;
    }
}
