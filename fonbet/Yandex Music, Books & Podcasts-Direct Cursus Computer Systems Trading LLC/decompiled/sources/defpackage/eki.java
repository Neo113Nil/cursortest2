package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class eki implements fki {
    public final euu a;
    public final klu b;
    public final dou c;
    public final w70 d;

    public eki(euu euuVar, klu kluVar, dou douVar, w70 w70Var) {
        douVar.getClass();
        w70Var.getClass();
        this.a = euuVar;
        this.b = kluVar;
        this.c = douVar;
        this.d = w70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eki)) {
            return false;
        }
        eki ekiVar = (eki) obj;
        return this.a.equals(ekiVar.a) && Intrinsics.d(this.b, ekiVar.b) && Intrinsics.d(this.c, ekiVar.c) && Intrinsics.d(this.d, ekiVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        klu kluVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (kluVar == null ? 0 : kluVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Wave(uiData=" + this.a + ", agentUiData=" + this.b + ", wave=" + this.c + ", analyticsEntityPosition=" + this.d + ")";
    }
}
