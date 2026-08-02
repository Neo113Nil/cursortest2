package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gjl {
    public final pkl a;
    public final int b;
    public final fcc c;
    public final jyr d;

    public gjl(pkl pklVar, int i, fcc fccVar) {
        pklVar.getClass();
        this.a = pklVar;
        this.b = i;
        this.c = fccVar;
        this.d = btf.b(new ril(2, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjl)) {
            return false;
        }
        gjl gjlVar = (gjl) obj;
        return Intrinsics.d(this.a, gjlVar.a) && this.b == gjlVar.b && Intrinsics.d(this.c, gjlVar.c);
    }

    public final int hashCode() {
        int a = f1d.a(this.b, this.a.hashCode() * 31, 31);
        fcc fccVar = this.c;
        return a + (fccVar == null ? 0 : fccVar.hashCode());
    }

    public final String toString() {
        return "PlayerScreenBlockAnalyticsPayload(playerScreenInfo=" + this.a + ", objectsCount=" + this.b + ", filterInfo=" + this.c + ")";
    }

    public /* synthetic */ gjl(pkl pklVar, int i, int i2) {
        this(pklVar, (i2 & 2) != 0 ? 0 : i, (fcc) null);
    }
}
