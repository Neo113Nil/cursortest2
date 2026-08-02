package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hds {
    public final c4r a;
    public final c4r b;
    public final c4r c;
    public final c4r d;

    public hds(c4r c4rVar, c4r c4rVar2, c4r c4rVar3, c4r c4rVar4) {
        this.a = c4rVar;
        this.b = c4rVar2;
        this.c = c4rVar3;
        this.d = c4rVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hds)) {
            return false;
        }
        hds hdsVar = (hds) obj;
        return Intrinsics.d(this.a, hdsVar.a) && Intrinsics.d(this.b, hdsVar.b) && Intrinsics.d(this.c, hdsVar.c) && Intrinsics.d(this.d, hdsVar.d);
    }

    public final int hashCode() {
        c4r c4rVar = this.a;
        int hashCode = (c4rVar != null ? c4rVar.hashCode() : 0) * 31;
        c4r c4rVar2 = this.b;
        int hashCode2 = (hashCode + (c4rVar2 != null ? c4rVar2.hashCode() : 0)) * 31;
        c4r c4rVar3 = this.c;
        int hashCode3 = (hashCode2 + (c4rVar3 != null ? c4rVar3.hashCode() : 0)) * 31;
        c4r c4rVar4 = this.d;
        return hashCode3 + (c4rVar4 != null ? c4rVar4.hashCode() : 0);
    }
}
