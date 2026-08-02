package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j5f extends v6f {
    public final boolean a;
    public final mhp b;
    public final String c;

    public j5f(Object obj, boolean z, mhp mhpVar) {
        obj.getClass();
        this.a = z;
        this.b = mhpVar;
        this.c = obj.toString();
        if (mhpVar == null || mhpVar.isInline()) {
            return;
        }
        xq0.x("Failed requirement.");
        throw null;
    }

    @Override // defpackage.v6f
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j5f.class != obj.getClass()) {
            return false;
        }
        j5f j5fVar = (j5f) obj;
        return this.a == j5fVar.a && Intrinsics.d(this.c, j5fVar.c);
    }

    @Override // defpackage.v6f
    public final boolean g() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.v6f
    public final String toString() {
        boolean z = this.a;
        String str = this.c;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        pkr.a(str, sb);
        return sb.toString();
    }
}
