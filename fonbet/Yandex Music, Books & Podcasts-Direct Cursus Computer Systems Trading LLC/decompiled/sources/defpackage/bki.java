package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bki implements fki {
    public final rhi a;
    public final dou b;
    public final w70 c;

    public bki(rhi rhiVar, dou douVar, w70 w70Var) {
        w70Var.getClass();
        this.a = rhiVar;
        this.b = douVar;
        this.c = w70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bki)) {
            return false;
        }
        bki bkiVar = (bki) obj;
        return this.a.equals(bkiVar.a) && this.b.equals(bkiVar.b) && Intrinsics.d(this.c, bkiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Multiwave(uiData=" + this.a + ", wave=" + this.b + ", analyticsEntityPosition=" + this.c + ")";
    }
}
