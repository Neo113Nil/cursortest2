package defpackage;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class vgn0 implements wgn0 {
    public final ArrayList a;
    public final int b;
    public final boolean c;

    public vgn0(int i, ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vgn0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        vgn0 vgn0Var = (vgn0) obj;
        return this.b == vgn0Var.b && this.c == vgn0Var.c && this.a.equals(vgn0Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + unr0.e(this.b * 31, 31, this.c);
    }
}
