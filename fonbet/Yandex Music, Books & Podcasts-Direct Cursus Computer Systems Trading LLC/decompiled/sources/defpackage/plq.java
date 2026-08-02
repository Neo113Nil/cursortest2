package defpackage;

/* loaded from: classes5.dex */
public final class plq implements uno {
    public final int a;
    public final long b;
    public int c;
    public final int d;

    public plq(int i, int i2, long j, int i3) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = i3;
    }

    @Override // defpackage.uno
    public final long B() {
        return this.b;
    }

    @Override // defpackage.uno
    public final boolean g() {
        return this.d != Integer.MIN_VALUE;
    }

    @Override // defpackage.uno
    public final int getCount() {
        return this.c;
    }

    @Override // defpackage.uno
    public final void next() {
        this.c = 0;
    }

    @Override // defpackage.uno
    public final int s() {
        return this.d;
    }

    @Override // defpackage.uno
    public final int t() {
        return this.a;
    }

    @Override // defpackage.uno
    public final boolean u() {
        return this.c == 0;
    }
}
