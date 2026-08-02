package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class aki implements fki {
    public final jd1 a;
    public final u51 b;
    public final w70 c;

    public aki(jd1 jd1Var, u51 u51Var, w70 w70Var) {
        w70Var.getClass();
        this.a = jd1Var;
        this.b = u51Var;
        this.c = w70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aki)) {
            return false;
        }
        aki akiVar = (aki) obj;
        return this.a.equals(akiVar.a) && this.b.equals(akiVar.b) && Intrinsics.d(this.c, akiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Artist(uiData=" + this.a + ", artistDomainItem=" + this.b + ", analyticsEntityPosition=" + this.c + ")";
    }
}
