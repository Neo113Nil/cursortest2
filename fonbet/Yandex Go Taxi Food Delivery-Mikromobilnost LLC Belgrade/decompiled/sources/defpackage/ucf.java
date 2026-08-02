package defpackage;

import android.media.MediaCodec;

/* loaded from: classes10.dex */
public final class ucf {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final tcf j;

    public ucf() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = tw21.a >= 24 ? new tcf(0, cryptoInfo) : null;
    }
}
