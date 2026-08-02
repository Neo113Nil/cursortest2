package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w1u {
    public final String a;
    public final qbu b;
    public final ak2 c;
    public final boolean d;

    public w1u(String str, qbu qbuVar, ak2 ak2Var, boolean z) {
        str.getClass();
        ak2Var.getClass();
        this.a = str;
        this.b = qbuVar;
        this.c = ak2Var;
        this.d = z;
    }

    public static w1u a(w1u w1uVar, qbu qbuVar, int i) {
        String str = w1uVar.a;
        if ((i & 2) != 0) {
            qbuVar = w1uVar.b;
        }
        ak2 ak2Var = w1uVar.c;
        boolean z = (i & 8) != 0 ? w1uVar.d : true;
        w1uVar.getClass();
        str.getClass();
        ak2Var.getClass();
        return new w1u(str, qbuVar, ak2Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1u)) {
            return false;
        }
        w1u w1uVar = (w1u) obj;
        return Intrinsics.d(this.a, w1uVar.a) && this.b == w1uVar.b && Intrinsics.d(this.c, w1uVar.c) && this.d == w1uVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VideoBackgroundState(slideId=" + this.a + ", playbackState=" + this.b + ", backgroundUiData=" + this.c + ", isShown=" + this.d + ")";
    }
}
