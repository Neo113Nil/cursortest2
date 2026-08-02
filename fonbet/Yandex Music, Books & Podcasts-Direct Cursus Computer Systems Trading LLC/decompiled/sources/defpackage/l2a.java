package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l2a {
    public final md a;
    public final md b;
    public final md c;
    public final md d;
    public final md e;
    public final md f;

    public l2a(md mdVar, md mdVar2, md mdVar3, md mdVar4, md mdVar5, md mdVar6) {
        this.a = mdVar;
        this.b = mdVar2;
        this.c = mdVar3;
        this.d = mdVar4;
        this.e = mdVar5;
        this.f = mdVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l2a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        l2a l2aVar = (l2a) obj;
        return Intrinsics.d(this.a, l2aVar.a) && Intrinsics.d(this.b, l2aVar.b) && Intrinsics.d(this.c, l2aVar.c) && Intrinsics.d(this.d, l2aVar.d) && Intrinsics.d(this.e, l2aVar.e) && Intrinsics.d(this.f, l2aVar.f);
    }

    public final int hashCode() {
        md mdVar = this.a;
        int hashCode = (mdVar != null ? mdVar.hashCode() : 0) * 31;
        md mdVar2 = this.b;
        int hashCode2 = (hashCode + (mdVar2 != null ? mdVar2.hashCode() : 0)) * 31;
        md mdVar3 = this.c;
        int hashCode3 = (hashCode2 + (mdVar3 != null ? mdVar3.hashCode() : 0)) * 31;
        md mdVar4 = this.d;
        int hashCode4 = (hashCode3 + (mdVar4 != null ? mdVar4.hashCode() : 0)) * 31;
        md mdVar5 = this.e;
        int hashCode5 = (hashCode4 + (mdVar5 != null ? mdVar5.hashCode() : 0)) * 31;
        md mdVar6 = this.f;
        return hashCode5 + (mdVar6 != null ? mdVar6.hashCode() : 0);
    }

    public final String toString() {
        return "Actions(onAwake=" + this.a + ", onApply=" + this.b + ", onError=" + this.c + ", onReload=" + this.d + ", onFinish=" + this.e + ", onReloadingFailed=" + this.f + ")";
    }
}
