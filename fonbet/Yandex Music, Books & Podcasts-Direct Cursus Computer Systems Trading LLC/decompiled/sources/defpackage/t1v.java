package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t1v implements w1v {
    public final x2v a;
    public final String b;
    public final co6 c;
    public final Integer d;
    public final bzs e;
    public final jzb f;
    public final avo g;
    public final j2v h;

    public t1v(x2v x2vVar, String str, co6 co6Var, Integer num, bzs bzsVar, jzb jzbVar, avo avoVar, j2v j2vVar) {
        str.getClass();
        co6Var.getClass();
        this.a = x2vVar;
        this.b = str;
        this.c = co6Var;
        this.d = num;
        this.e = bzsVar;
        this.f = jzbVar;
        this.g = avoVar;
        this.h = j2vVar;
    }

    @Override // defpackage.w1v
    public final co6 a() {
        return this.c;
    }

    @Override // defpackage.w1v
    public final j2v b() {
        return this.h;
    }

    @Override // defpackage.w1v
    public final avo c() {
        return this.g;
    }

    @Override // defpackage.w1v
    public final x2v d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1v)) {
            return false;
        }
        t1v t1vVar = (t1v) obj;
        return this.a.equals(t1vVar.a) && Intrinsics.d(this.b, t1vVar.b) && Intrinsics.d(this.c, t1vVar.c) && Intrinsics.d(this.d, t1vVar.d) && Intrinsics.d(this.e, t1vVar.e) && this.f == t1vVar.f && this.g.equals(t1vVar.g) && this.h == t1vVar.h;
    }

    @Override // defpackage.w1v
    public final Integer getBackgroundColor() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        bzs bzsVar = this.e;
        int hashCode3 = (hashCode2 + (bzsVar == null ? 0 : bzsVar.hashCode())) * 31;
        jzb jzbVar = this.f;
        return this.h.hashCode() + ((this.g.hashCode() + ((hashCode3 + (jzbVar != null ? jzbVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Simple(waveScreenPrimaryEntity=" + this.a + ", title=" + this.b + ", coverMeta=" + this.c + ", backgroundColor=" + this.d + ", trackParameters=" + this.e + ", explicitType=" + this.f + ", domainObject=" + this.g + ", waveScreenPlayableType=" + this.h + ")";
    }
}
