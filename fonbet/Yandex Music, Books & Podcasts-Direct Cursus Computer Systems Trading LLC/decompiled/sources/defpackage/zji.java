package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zji implements fki {
    public final ru a;
    public final lt b;
    public final w70 c;

    public zji(ru ruVar, lt ltVar, w70 w70Var) {
        w70Var.getClass();
        this.a = ruVar;
        this.b = ltVar;
        this.c = w70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zji)) {
            return false;
        }
        zji zjiVar = (zji) obj;
        return this.a.equals(zjiVar.a) && this.b.equals(zjiVar.b) && Intrinsics.d(this.c, zjiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Album(uiData=" + this.a + ", albumDomainItem=" + this.b + ", analyticsEntityPosition=" + this.c + ")";
    }
}
