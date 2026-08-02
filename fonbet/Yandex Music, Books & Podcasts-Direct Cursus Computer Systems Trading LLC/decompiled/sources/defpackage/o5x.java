package defpackage;

/* loaded from: classes.dex */
public final class o5x extends q5x {
    public final transient int e;
    public final transient int f;
    public final /* synthetic */ q5x g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5x(q5x q5xVar, int i, int i2) {
        super(0);
        this.g = q5xVar;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.r4x
    public final int g() {
        return this.g.n() + this.e + this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        gdg.Q(i, this.f);
        return this.g.get(i + this.e);
    }

    @Override // defpackage.r4x
    public final int n() {
        return this.g.n() + this.e;
    }

    @Override // defpackage.r4x
    public final Object[] q() {
        return this.g.q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }

    @Override // defpackage.q5x, java.util.List
    /* renamed from: t */
    public final q5x subList(int i, int i2) {
        gdg.R(i, i2, this.f);
        int i3 = this.e;
        return this.g.subList(i + i3, i2 + i3);
    }
}
