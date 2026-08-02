package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ddb implements fdb {
    public final boolean a;
    public final boolean b;
    public final yxc c;

    public ddb(boolean z, boolean z2, yxc yxcVar) {
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
        if (!(obj instanceof ddb)) {
            return false;
        }
        ddb ddbVar = (ddb) obj;
        return this.a == ddbVar.a && this.b == ddbVar.b && Intrinsics.d(this.c, ddbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder j = eta.j("ReadyToSync(shouldShowMainScreen=", this.a, ", isOnboardingShown=", this.b, ", userInfo=");
        j.append(this.c);
        j.append(")");
        return j.toString();
    }
}
