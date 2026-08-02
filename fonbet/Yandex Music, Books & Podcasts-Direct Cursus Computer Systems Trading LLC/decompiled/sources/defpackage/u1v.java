package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u1v implements w1v {
    public final String a;
    public final Integer b;
    public final avo c;
    public final w2v d;
    public final j2v e;

    public u1v(String str, Integer num, avo avoVar) {
        str.getClass();
        this.a = str;
        this.b = num;
        this.c = avoVar;
        this.d = new w2v(str);
        this.e = j2v.c;
    }

    @Override // defpackage.w1v
    public final /* bridge */ /* synthetic */ co6 a() {
        return null;
    }

    @Override // defpackage.w1v
    public final j2v b() {
        return this.e;
    }

    @Override // defpackage.w1v
    public final avo c() {
        return this.c;
    }

    @Override // defpackage.w1v
    public final x2v d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1v)) {
            return false;
        }
        u1v u1vVar = (u1v) obj;
        return Intrinsics.d(this.a, u1vVar.a) && Intrinsics.d(this.b, u1vVar.b) && this.c.equals(u1vVar.c);
    }

    @Override // defpackage.w1v
    public final Integer getBackgroundColor() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "Stream(streamName=" + this.a + ", backgroundColor=" + this.b + ", domainObject=" + this.c + ")";
    }
}
