package defpackage;

/* loaded from: classes.dex */
public final class fcx extends hcx {
    public final transient int e;
    public final transient int f;
    public final /* synthetic */ hcx g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcx(hcx hcxVar, int i, int i2) {
        super(1);
        this.g = hcxVar;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.r4x
    public final int g() {
        return this.g.n() + this.e + this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        tyf.P(i, this.f);
        return this.g.get(i + this.e);
    }

    @Override // defpackage.r4x
    public final int n() {
        return this.g.n() + this.e;
    }

    @Override // defpackage.r4x
    public final Object[] r() {
        return this.g.r();
    }

    @Override // defpackage.hcx, java.util.List
    /* renamed from: s */
    public final hcx subList(int i, int i2) {
        tyf.R(i, i2, this.f);
        int i3 = this.e;
        return this.g.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
