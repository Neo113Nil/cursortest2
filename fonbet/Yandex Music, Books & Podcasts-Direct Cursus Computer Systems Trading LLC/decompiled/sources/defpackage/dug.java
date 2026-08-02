package defpackage;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dug {
    public final ja a;
    public final j02 b;
    public final HashSet c;
    public final HashSet d;

    public dug(ja jaVar, j02 j02Var, HashSet hashSet, HashSet hashSet2) {
        this.a = jaVar;
        this.b = j02Var;
        this.c = hashSet;
        this.d = hashSet2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dug)) {
            return false;
        }
        dug dugVar = (dug) obj;
        return this.a.equals(dugVar.a) && Intrinsics.d(this.b, dugVar.b) && this.c.equals(dugVar.c) && this.d.equals(dugVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j02 j02Var = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (j02Var != null ? j02Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "LoginResult(accessToken=" + this.a + ", authenticationToken=" + this.b + ", recentlyGrantedPermissions=" + this.c + ", recentlyDeniedPermissions=" + this.d + ")";
    }
}
