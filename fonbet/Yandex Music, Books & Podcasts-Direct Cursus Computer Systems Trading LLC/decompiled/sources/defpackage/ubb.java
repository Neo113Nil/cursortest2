package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ubb {
    public final kcq a;
    public final wbq b;
    public final cdq c;

    public ubb(kcq kcqVar, wbq wbqVar, cdq cdqVar) {
        this.a = kcqVar;
        this.b = wbqVar;
        this.c = cdqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubb)) {
            return false;
        }
        ubb ubbVar = (ubb) obj;
        return this.a.equals(ubbVar.a) && Intrinsics.d(this.b, ubbVar.b) && Intrinsics.d(this.c, ubbVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        wbq wbqVar = this.b;
        int hashCode2 = (hashCode + (wbqVar == null ? 0 : wbqVar.hashCode())) * 31;
        cdq cdqVar = this.c;
        return hashCode2 + (cdqVar != null ? cdqVar.hashCode() : 0);
    }

    public final String toString() {
        return "EntitySheetButtonsUiData(likeAction=" + this.a + ", cacheAction=" + this.b + ", trailerAction=" + this.c + ")";
    }
}
