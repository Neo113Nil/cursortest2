package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x6p extends j7p implements kzo {
    public final raj a;
    public final mqs b;
    public final e4p c;
    public final String d;

    public x6p(raj rajVar, mqs mqsVar, e4p e4pVar, String str) {
        mqsVar.getClass();
        str.getClass();
        this.a = rajVar;
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
        if (!(obj instanceof x6p)) {
            return false;
        }
        x6p x6pVar = (x6p) obj;
        return this.a.equals(x6pVar.a) && Intrinsics.d(this.b, x6pVar.b) && this.c == x6pVar.c && Intrinsics.d(this.d, x6pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b.a)) * 31);
    }

    public final String toString() {
        return "BookChapter(uiData=" + this.a + ", track=" + this.b + ", source=" + this.c + ", id=" + this.d + ")";
    }
}
