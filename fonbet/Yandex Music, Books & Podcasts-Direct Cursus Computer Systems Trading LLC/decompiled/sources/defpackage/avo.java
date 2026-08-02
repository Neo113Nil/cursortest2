package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class avo {
    public static final avo c = new avo(pkb.NonApplicable, "non_applicable");
    public final pkb a;
    public final String b;

    public avo(pkb pkbVar, String str) {
        pkbVar.getClass();
        str.getClass();
        this.a = pkbVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avo)) {
            return false;
        }
        avo avoVar = (avo) obj;
        return this.a == avoVar.a && Intrinsics.d(this.b, avoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ScreenDomainObject(type=" + this.a + ", id=" + this.b + ")";
    }
}
