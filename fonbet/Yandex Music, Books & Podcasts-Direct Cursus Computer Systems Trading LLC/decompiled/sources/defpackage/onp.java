package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class onp implements i1b {
    public final mn0 a;
    public final int b;

    public onp(String str, int i) {
        this.a = new mn0(str);
        this.b = i;
    }

    @Override // defpackage.i1b
    public final void a(bh3 bh3Var) {
        int i = bh3Var.d;
        mn0 mn0Var = this.a;
        if (i != -1) {
            int i2 = bh3Var.e;
            String str = mn0Var.b;
            String str2 = mn0Var.b;
            bh3Var.h(i, i2, str);
            if (str2.length() > 0) {
                bh3Var.j(i, str2.length() + i);
            }
        } else {
            int i3 = bh3Var.b;
            int i4 = bh3Var.c;
            String str3 = mn0Var.b;
            String str4 = mn0Var.b;
            bh3Var.h(i3, i4, str3);
            if (str4.length() > 0) {
                bh3Var.j(i3, str4.length() + i3);
            }
        }
        int i5 = bh3Var.b;
        int i6 = bh3Var.c;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.b;
        int d = yhn.d(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - mn0Var.b.length(), 0, ((ah3) bh3Var.f).r());
        bh3Var.l(d, d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onp)) {
            return false;
        }
        onp onpVar = (onp) obj;
        return Intrinsics.d(this.a.b, onpVar.a.b) && this.b == onpVar.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.b);
        sb.append("', newCursorPosition=");
        return vz1.r(sb, this.b, ')');
    }
}
