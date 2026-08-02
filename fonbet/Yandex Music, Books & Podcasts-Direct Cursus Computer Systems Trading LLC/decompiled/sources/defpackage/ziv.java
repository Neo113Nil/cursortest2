package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ziv implements bjv {
    public final jjv a;
    public final String b;
    public final String c;
    public final u9b d;

    public ziv(jjv jjvVar, String str, String str2, u9b u9bVar) {
        this.a = jjvVar;
        this.b = str;
        this.c = str2;
        this.d = u9bVar;
    }

    @Override // defpackage.bjv
    public final jjv a() {
        return this.a;
    }

    @Override // defpackage.bjv
    public final int b() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ziv)) {
            return false;
        }
        ziv zivVar = (ziv) obj;
        return this.a.equals(zivVar.a) && this.b.equals(zivVar.b) && this.c.equals(zivVar.c) && Intrinsics.d(this.d, zivVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        u9b u9bVar = this.d;
        return c + (u9bVar == null ? 0 : u9bVar.hashCode());
    }

    public final String toString() {
        return "Settings(style=" + this.a + ", feedbackId=" + this.b + ", title=" + this.c + ", cover=" + this.d + ")";
    }
}
