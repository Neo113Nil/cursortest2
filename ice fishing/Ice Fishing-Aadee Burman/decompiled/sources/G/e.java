package G;

import D.y;
import android.graphics.Insets;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f1004e = new e(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1005a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1006b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1007c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1008d;

    public e(int i, int i6, int i9, int i10) {
        this.f1005a = i;
        this.f1006b = i6;
        this.f1007c = i9;
        this.f1008d = i10;
    }

    public static e a(e eVar, e eVar2) {
        return b(Math.max(eVar.f1005a, eVar2.f1005a), Math.max(eVar.f1006b, eVar2.f1006b), Math.max(eVar.f1007c, eVar2.f1007c), Math.max(eVar.f1008d, eVar2.f1008d));
    }

    public static e b(int i, int i6, int i9, int i10) {
        return (i == 0 && i6 == 0 && i9 == 0 && i10 == 0) ? f1004e : new e(i, i6, i9, i10);
    }

    public static e c(Insets insets) {
        int i;
        int i6;
        int i9;
        int i10;
        i = insets.left;
        i6 = insets.top;
        i9 = insets.right;
        i10 = insets.bottom;
        return b(i, i6, i9, i10);
    }

    public final Insets d() {
        return d.a(this.f1005a, this.f1006b, this.f1007c, this.f1008d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f1008d == eVar.f1008d && this.f1005a == eVar.f1005a && this.f1007c == eVar.f1007c && this.f1006b == eVar.f1006b;
    }

    public final int hashCode() {
        return (((((this.f1005a * 31) + this.f1006b) * 31) + this.f1007c) * 31) + this.f1008d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f1005a);
        sb.append(", top=");
        sb.append(this.f1006b);
        sb.append(", right=");
        sb.append(this.f1007c);
        sb.append(", bottom=");
        return y.q(sb, this.f1008d, '}');
    }
}
