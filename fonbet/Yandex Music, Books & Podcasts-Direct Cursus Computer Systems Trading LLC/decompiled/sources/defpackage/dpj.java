package defpackage;

/* loaded from: classes5.dex */
public final class dpj {
    public final hi3 a;
    public int b;
    public int c;

    public dpj(hi3 hi3Var, int i) {
        this.a = hi3Var;
        this.b = i;
    }

    public final void a(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
        this.b -= i2;
        this.c += i2;
    }
}
