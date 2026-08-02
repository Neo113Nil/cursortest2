package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class edb implements fdb {
    public final boolean a;
    public final boolean b;
    public final yxc c;

    public edb(boolean z, boolean z2, yxc yxcVar) {
        yxcVar.getClass();
        this.a = z;
        this.b = z2;
        this.c = yxcVar;
    }

    @Override // defpackage.hdb
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.fdb
    public final yxc b() {
        return this.c;
    }

    @Override // defpackage.hdb
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edb)) {
            return false;
        }
        edb edbVar = (edb) obj;
        return this.a == edbVar.a && this.b == edbVar.b && Intrinsics.d(this.c, edbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder j = eta.j("Synced(shouldShowMainScreen=", this.a, ", isOnboardingShown=", this.b, ", userInfo=");
        j.append(this.c);
        j.append(")");
        return j.toString();
    }
}
