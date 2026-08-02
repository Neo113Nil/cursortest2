package defpackage;

/* loaded from: classes.dex */
public final class ky1 extends Exception {
    public final int a;
    public final boolean b;
    public final dsc c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ky1(int i, int i2, int i3, int i4, dsc dscVar, boolean z, RuntimeException runtimeException) {
        super(r5.toString(), runtimeException);
        StringBuilder l = dfi.l("AudioTrack init failed ", i, i2, " Config(", ", ");
        hrg.w(i3, i4, ", ", ") ", l);
        l.append(dscVar);
        l.append(z ? " (recoverable)" : "");
        this.a = i;
        this.b = z;
        this.c = dscVar;
    }
}
