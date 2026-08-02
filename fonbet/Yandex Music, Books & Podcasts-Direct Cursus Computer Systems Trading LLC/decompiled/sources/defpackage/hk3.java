package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hk3 {
    public final vdr a;
    public final cce b;
    public final q8r c;

    public hk3(vdr vdrVar, cce cceVar, q8r q8rVar) {
        vdrVar.getClass();
        this.a = vdrVar;
        this.b = cceVar;
        this.c = q8rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk3)) {
            return false;
        }
        hk3 hk3Var = (hk3) obj;
        return Intrinsics.d(this.a, hk3Var.a) && this.b.equals(hk3Var.b) && this.c.equals(hk3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BullfinchScreenThemeConfig(isDarkThemeFlow=" + this.a + ", imageLoader=" + this.b + ", spoolImageLoader=" + this.c + ")";
    }
}
