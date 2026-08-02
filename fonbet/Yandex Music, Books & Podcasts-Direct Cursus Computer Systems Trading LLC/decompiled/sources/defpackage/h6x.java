package defpackage;

/* loaded from: classes.dex */
public final class h6x extends i6x {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ i6x e;

    public h6x(i6x i6xVar, int i, int i2) {
        this.e = i6xVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.a6x
    public final int g() {
        return this.e.n() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hag.L(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.a6x
    public final int n() {
        return this.e.n() + this.c;
    }

    @Override // defpackage.a6x
    public final boolean q() {
        return true;
    }

    @Override // defpackage.a6x
    public final Object[] r() {
        return this.e.r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.i6x, java.util.List
    /* renamed from: t */
    public final i6x subList(int i, int i2) {
        hag.N(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }
}
