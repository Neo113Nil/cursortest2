package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class sii implements zii {
    public final dou a;
    public final String b;

    public sii(dou douVar, String str) {
        this.a = douVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sii)) {
            return false;
        }
        sii siiVar = (sii) obj;
        return this.a.equals(siiVar.a) && Intrinsics.d(this.b, siiVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // defpackage.zii
    public final boolean r() {
        return true;
    }

    public final String toString() {
        return "Multiwave(domainModel=" + this.a + ", foregroundImage=" + this.b + ")";
    }
}
