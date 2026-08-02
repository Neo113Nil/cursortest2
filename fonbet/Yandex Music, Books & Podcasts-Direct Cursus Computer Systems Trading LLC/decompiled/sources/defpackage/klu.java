package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class klu {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final elu f;

    public klu(String str, String str2, String str3, String str4, int i, elu eluVar) {
        str.getClass();
        str4.getClass();
        eluVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = eluVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klu)) {
            return false;
        }
        klu kluVar = (klu) obj;
        return Intrinsics.d(this.a, kluVar.a) && Intrinsics.d(this.b, kluVar.b) && Intrinsics.d(this.c, kluVar.c) && Intrinsics.d(this.d, kluVar.d) && this.e == kluVar.e && this.f == kluVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.f.hashCode() + f1d.a(this.e, k5r.c((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WaveAgentUiData(name=", this.a, ", description=", this.b, ", coverUrl=");
        su4.v(m, this.c, ", animationUrl=", this.d, ", color=");
        m.append(this.e);
        m.append(", entityType=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
