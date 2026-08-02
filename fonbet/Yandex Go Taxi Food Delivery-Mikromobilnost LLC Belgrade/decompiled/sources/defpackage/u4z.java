package defpackage;

/* loaded from: classes4.dex */
public final class u4z implements f7, va {
    public final oz2 a;

    public u4z(oz2 oz2Var) {
        this.a = oz2Var;
    }

    @Override // defpackage.va
    public final void c(s7s s7sVar) {
        this.a.a(s7sVar);
    }

    @Override // defpackage.f7
    public final oz2 j() {
        return this.a;
    }

    @Override // defpackage.f7
    public final f7 o() {
        return new u4z(new oz2());
    }
}
