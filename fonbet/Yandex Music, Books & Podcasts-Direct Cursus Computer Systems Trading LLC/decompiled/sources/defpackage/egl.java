package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class egl {
    public static final egl e;
    public static final egl f;
    public final long a;
    public final cgl b;
    public final cgl c;
    public final dgl d;

    static {
        cgl cglVar = cgl.c;
        e = new egl(0L, cglVar, cglVar, dgl.b);
        cgl cglVar2 = cgl.d;
        f = new egl(Long.MAX_VALUE, cglVar2, cglVar2, dgl.c);
    }

    public egl(long j, cgl cglVar, cgl cglVar2, dgl dglVar) {
        cglVar.getClass();
        cglVar2.getClass();
        this.a = j;
        this.b = cglVar;
        this.c = cglVar2;
        this.d = dglVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egl)) {
            return false;
        }
        egl eglVar = (egl) obj;
        return this.a == eglVar.a && Intrinsics.d(this.b, eglVar.b) && Intrinsics.d(this.c, eglVar.c) && this.d.equals(eglVar.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d.a) + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PlayerInformersRestrictions(capTotal=" + this.a + ", concertRestrictions=" + this.b + ", donationRestrictions=" + this.c + ", commonRestrictions=" + this.d + ")";
    }
}
