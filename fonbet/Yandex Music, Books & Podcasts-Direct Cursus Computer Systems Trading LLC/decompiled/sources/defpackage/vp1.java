package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vp1 implements wp1 {
    public final String a;
    public final u51 b;
    public final ArrayList c;
    public final mwk d;

    public vp1(String str, u51 u51Var, ArrayList arrayList, mwk mwkVar) {
        mwkVar.getClass();
        this.a = str;
        this.b = u51Var;
        this.c = arrayList;
        this.d = mwkVar;
    }

    @Override // defpackage.wp1
    public final mwk a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp1)) {
            return false;
        }
        vp1 vp1Var = (vp1) obj;
        return Intrinsics.d(this.a, vp1Var.a) && this.b.equals(vp1Var.b) && this.c.equals(vp1Var.c) && Intrinsics.d(this.d, vp1Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + dfi.b(this.c, (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31);
    }

    public final String toString() {
        return "SingleArtist(headerTitle=" + this.a + ", artistDomainItem=" + this.b + ", concerts=" + this.c + ", playable=" + this.d + ")";
    }
}
