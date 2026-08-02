package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ubf extends fq5 {
    public final String c;
    public final Object d;
    public final Object e;

    public ubf(String str, Object obj, Object obj2, pyc pycVar) {
        super(pycVar, lhb.v0);
        this.c = str;
        this.d = obj;
        this.e = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ubf)) {
            return false;
        }
        ubf ubfVar = (ubf) obj;
        return this.c.equals(ubfVar.c) && this.d.equals(ubfVar.d) && Intrinsics.d(this.e, ubfVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        Object obj = this.e;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
