package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zfe {
    public final vdr a;
    public final cce b;
    public final q8r c;

    public zfe(vdr vdrVar, cce cceVar, q8r q8rVar) {
        vdrVar.getClass();
        this.a = vdrVar;
        this.b = cceVar;
        this.c = q8rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfe)) {
            return false;
        }
        zfe zfeVar = (zfe) obj;
        return Intrinsics.d(this.a, zfeVar.a) && this.b.equals(zfeVar.b) && this.c.equals(zfeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InAppRestoreScreenThemeConfig(isDarkThemeFlow=" + this.a + ", imageLoader=" + this.b + ", spoolImageLoader=" + this.c + ")";
    }
}
