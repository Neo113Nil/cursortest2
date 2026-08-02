package defpackage;

import android.graphics.Rect;

/* loaded from: classes11.dex */
public final class xlm0 {
    public final String a;
    public final Rect b;

    public xlm0(String str, Rect rect) {
        this.a = str;
        this.b = rect;
    }

    public final Rect a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlm0)) {
            return false;
        }
        xlm0 xlm0Var = (xlm0) obj;
        return this.a.equals(xlm0Var.a) && jl40.l(this.b, xlm0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Rect rect = this.b;
        return Boolean.hashCode(true) + ((hashCode + (rect == null ? 0 : rect.hashCode())) * 31);
    }

    public final String toString() {
        return "ScanResult(result=" + this.a + ", bounds=" + this.b + ", shouldCheckBounds=true)";
    }
}
