package defpackage;

/* loaded from: classes.dex */
public final class oih extends Exception {
    public final String a;
    public final boolean b;
    public final mih c;
    public final String d;

    public oih(dsc dscVar, wjh wjhVar, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + dscVar, wjhVar, dscVar.n, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public oih(String str, Throwable th, String str2, boolean z, mih mihVar, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = mihVar;
        this.d = str3;
    }
}
