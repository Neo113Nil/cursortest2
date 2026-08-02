package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qkm {
    public final String a;
    public final String b;
    public final pkm c;

    public qkm(String str, String str2, pkm pkmVar) {
        str.getClass();
        str2.getClass();
        pkmVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = pkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkm)) {
            return false;
        }
        qkm qkmVar = (qkm) obj;
        return Intrinsics.d(this.a, qkmVar.a) && Intrinsics.d(this.b, qkmVar.b) && this.c == qkmVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PreSaveOperation(preSaveId=", this.a, ", artistId=", this.b, ", type=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
