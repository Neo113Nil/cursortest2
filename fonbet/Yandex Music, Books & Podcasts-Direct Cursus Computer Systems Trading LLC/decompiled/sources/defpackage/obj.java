package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class obj implements pbj {
    public final cvl a;
    public final mqs b;
    public final zc5 c;

    public obj(cvl cvlVar, mqs mqsVar) {
        cvlVar.getClass();
        this.a = cvlVar;
        this.b = mqsVar;
        drt drtVar = cvlVar.c;
        String str = drtVar.c;
        this.c = new zc5(str.length() == 0 ? drtVar.b : str, cvlVar.a);
    }

    @Override // defpackage.pbj
    public final mqs a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obj)) {
            return false;
        }
        obj objVar = (obj) obj;
        return Intrinsics.d(this.a, objVar.a) && this.b.equals(objVar.b);
    }

    @Override // defpackage.pbj
    public final a0q getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistEntity(playlistHeader=" + this.a + ", track=" + this.b + ")";
    }
}
