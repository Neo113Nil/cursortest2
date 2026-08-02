package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dmp {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final z97 e;
    public final String f;
    public final String g;

    public dmp(String str, String str2, int i, long j, z97 z97Var, String str3, String str4) {
        eta.r(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = z97Var;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmp)) {
            return false;
        }
        dmp dmpVar = (dmp) obj;
        return Intrinsics.d(this.a, dmpVar.a) && Intrinsics.d(this.b, dmpVar.b) && this.c == dmpVar.c && this.d == dmpVar.d && this.e.equals(dmpVar.e) && Intrinsics.d(this.f, dmpVar.f) && Intrinsics.d(this.g, dmpVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + k5r.c((this.e.hashCode() + tlm.c(this.d, f1d.a(this.c, k5r.c(this.a.hashCode() * 31, 31, this.b), 31), 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return dfi.i(sb, this.g, ')');
    }
}
