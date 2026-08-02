package defpackage;

/* loaded from: classes.dex */
public final class ny1 extends Exception {
    public final int a;
    public final boolean b;
    public final dsc c;

    public ny1(int i, dsc dscVar, boolean z) {
        super(k5r.i(i, "AudioTrack write failed: "));
        this.b = z;
        this.a = i;
        this.c = dscVar;
    }
}
