package defpackage;

/* loaded from: classes8.dex */
public final class whs0 implements pyl0 {
    public final int a;
    public final long b;
    public int c;
    public final int d;

    public whs0(int i, int i2, long j, int i3) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = i3;
    }

    @Override // defpackage.pyl0
    public final boolean a() {
        return this.d != Integer.MIN_VALUE;
    }

    @Override // defpackage.pyl0
    public final int b() {
        return this.d;
    }

    @Override // defpackage.pyl0
    public final int c() {
        return this.a;
    }

    @Override // defpackage.pyl0
    public final boolean d() {
        return this.c == 0;
    }

    @Override // defpackage.pyl0
    public final long e() {
        return this.b;
    }

    @Override // defpackage.pyl0
    public final int getCount() {
        return this.c;
    }

    @Override // defpackage.pyl0
    public final void next() {
        this.c = 0;
    }
}
