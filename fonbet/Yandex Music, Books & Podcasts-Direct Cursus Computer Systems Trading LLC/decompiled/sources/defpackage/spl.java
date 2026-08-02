package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class spl {
    public final String a;
    public final cds b;
    public final jzb c;

    public spl(String str, cds cdsVar, jzb jzbVar) {
        str.getClass();
        this.a = str;
        this.b = cdsVar;
        this.c = jzbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spl)) {
            return false;
        }
        spl splVar = (spl) obj;
        return Intrinsics.d(this.a, splVar.a) && this.b.equals(splVar.b) && this.c == splVar.c;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        jzb jzbVar = this.c;
        return hashCode + (jzbVar == null ? 0 : jzbVar.hashCode());
    }

    public final String toString() {
        return "PlayerTitleState(title=" + this.a + ", textLayoutResult=" + this.b + ", explicitType=" + this.c + ")";
    }
}
