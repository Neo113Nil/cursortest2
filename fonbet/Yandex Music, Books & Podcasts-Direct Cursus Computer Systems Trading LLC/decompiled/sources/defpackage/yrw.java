package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yrw implements zrw {
    public final cd5 a;
    public final tyt b;

    public yrw(cd5 cd5Var, tyt tytVar) {
        tytVar.getClass();
        this.a = cd5Var;
        this.b = tytVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrw)) {
            return false;
        }
        yrw yrwVar = (yrw) obj;
        return this.a.equals(yrwVar.a) && Intrinsics.d(this.b, yrwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "VariousContentId(contentId=" + this.a + ", subtype=" + this.b + ")";
    }
}
