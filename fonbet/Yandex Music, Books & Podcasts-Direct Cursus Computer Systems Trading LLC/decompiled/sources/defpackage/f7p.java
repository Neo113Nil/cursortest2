package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f7p extends j7p implements kzo {
    public final pzo a;
    public final mqs b;
    public final e4p c;
    public final String d;

    public f7p(pzo pzoVar, mqs mqsVar, e4p e4pVar, String str) {
        mqsVar.getClass();
        str.getClass();
        this.a = pzoVar;
        this.b = mqsVar;
        this.c = e4pVar;
        this.d = str;
    }

    @Override // defpackage.kzo
    public final mqs a() {
        return this.b;
    }

    @Override // defpackage.y7p
    public final e4p b() {
        return this.c;
    }

    @Override // defpackage.j7p
    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7p)) {
            return false;
        }
        f7p f7pVar = (f7p) obj;
        return this.a.equals(f7pVar.a) && Intrinsics.d(this.b, f7pVar.b) && this.c == f7pVar.c && Intrinsics.d(this.d, f7pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b.a)) * 31);
    }

    public final String toString() {
        return "Track(uiData=" + this.a + ", track=" + this.b + ", source=" + this.c + ", id=" + this.d + ")";
    }
}
