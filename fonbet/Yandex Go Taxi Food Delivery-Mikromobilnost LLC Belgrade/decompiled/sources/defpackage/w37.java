package defpackage;

import com.yandex.go.due_timetable.presentation.state.ButtonType;

/* loaded from: classes12.dex */
public final class w37 implements a47 {
    public final bdc a;
    public final bdc b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final ButtonType f;

    public w37(bdc bdcVar, bdc bdcVar2, boolean z, boolean z2, String str, ButtonType buttonType) {
        this.a = bdcVar;
        this.b = bdcVar2;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = buttonType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w37)) {
            return false;
        }
        w37 w37Var = (w37) obj;
        return this.a.equals(w37Var.a) && this.b.equals(w37Var.b) && this.c == w37Var.c && this.d == w37Var.d && jl40.l(this.e, w37Var.e) && this.f == w37Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b(unr0.e(unr0.e(oyr.b(this.b.a, Integer.hashCode(this.a.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }
}
