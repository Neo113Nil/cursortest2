package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w9f implements u9f {
    public final u9f a;

    public w9f(u9f u9fVar) {
        u9fVar.getClass();
        this.a = u9fVar;
    }

    @Override // defpackage.u9f
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.u9f
    public final f9f d() {
        return this.a.d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        w9f w9fVar = obj instanceof w9f ? (w9f) obj : null;
        u9f u9fVar = w9fVar != null ? w9fVar.a : null;
        u9f u9fVar2 = this.a;
        if (!Intrinsics.d(u9fVar2, u9fVar)) {
            return false;
        }
        f9f d = u9fVar2.d();
        if (!(d instanceof f9f)) {
            return false;
        }
        u9f u9fVar3 = obj instanceof u9f ? (u9f) obj : null;
        f9f d2 = u9fVar3 != null ? u9fVar3.d() : null;
        if (d2 == null || !(d2 instanceof f9f)) {
            return false;
        }
        return leu.P(d).equals(leu.P(d2));
    }

    @Override // defpackage.u9f
    public final List g() {
        return this.a.g();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}
