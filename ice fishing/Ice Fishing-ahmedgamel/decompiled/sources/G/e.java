package G;

import D.x;
import android.graphics.Insets;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f1030e = new e(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1031a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1032b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1033c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1034d;

    public e(int i, int i4, int i6, int i9) {
        this.f1031a = i;
        this.f1032b = i4;
        this.f1033c = i6;
        this.f1034d = i9;
    }

    public static e a(e eVar, e eVar2) {
        return b(Math.max(eVar.f1031a, eVar2.f1031a), Math.max(eVar.f1032b, eVar2.f1032b), Math.max(eVar.f1033c, eVar2.f1033c), Math.max(eVar.f1034d, eVar2.f1034d));
    }

    public static e b(int i, int i4, int i6, int i9) {
        return (i == 0 && i4 == 0 && i6 == 0 && i9 == 0) ? f1030e : new e(i, i4, i6, i9);
    }

    public static e c(Insets insets) {
        int i;
        int i4;
        int i6;
        int i9;
        i = insets.left;
        i4 = insets.top;
        i6 = insets.right;
        i9 = insets.bottom;
        return b(i, i4, i6, i9);
    }

    public final Insets d() {
        return d.a(this.f1031a, this.f1032b, this.f1033c, this.f1034d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f1034d == eVar.f1034d && this.f1031a == eVar.f1031a && this.f1033c == eVar.f1033c && this.f1032b == eVar.f1032b;
    }

    public final int hashCode() {
        return (((((this.f1031a * 31) + this.f1032b) * 31) + this.f1033c) * 31) + this.f1034d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f1031a);
        sb.append(", top=");
        sb.append(this.f1032b);
        sb.append(", right=");
        sb.append(this.f1033c);
        sb.append(", bottom=");
        return x.n(sb, this.f1034d, '}');
    }
}
