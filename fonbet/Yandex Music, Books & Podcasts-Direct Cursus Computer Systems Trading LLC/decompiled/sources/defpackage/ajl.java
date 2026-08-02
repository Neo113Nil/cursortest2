package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ajl {
    public static final ajl d;
    public final zil a;
    public final String b;
    public tgl c;

    static {
        zil zilVar = zil.f;
        l1j l1jVar = aaw.e;
        zilVar.getClass();
        ajl ajlVar = new ajl(zilVar, "");
        ajlVar.c = l1jVar;
        d = ajlVar;
    }

    public ajl(zil zilVar, String str) {
        this.a = zilVar;
        this.b = str;
    }

    public final yil a(vil vilVar, cvo cvoVar) {
        vilVar.getClass();
        cvoVar.getClass();
        tgl tglVar = this.c;
        if (tglVar != null) {
            return tglVar.a(vilVar, cvoVar);
        }
        Intrinsics.j("playerParametersCreator");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajl)) {
            return false;
        }
        ajl ajlVar = (ajl) obj;
        return Intrinsics.d(this.a, ajlVar.a) && this.b.equals(ajlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayerScreenAnalyticsState(queueState=" + this.a + ", skeletonId=" + this.b + ")";
    }
}
