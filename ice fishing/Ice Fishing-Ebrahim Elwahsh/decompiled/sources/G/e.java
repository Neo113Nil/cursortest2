package G;

import D.y;
import android.graphics.Insets;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f1150e = new e(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1151a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1152b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1153c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1154d;

    public e(int i, int i4, int i9, int i10) {
        this.f1151a = i;
        this.f1152b = i4;
        this.f1153c = i9;
        this.f1154d = i10;
    }

    public static e a(e eVar, e eVar2) {
        return b(Math.max(eVar.f1151a, eVar2.f1151a), Math.max(eVar.f1152b, eVar2.f1152b), Math.max(eVar.f1153c, eVar2.f1153c), Math.max(eVar.f1154d, eVar2.f1154d));
    }

    public static e b(int i, int i4, int i9, int i10) {
        return (i == 0 && i4 == 0 && i9 == 0 && i10 == 0) ? f1150e : new e(i, i4, i9, i10);
    }

    public static e c(Insets insets) {
        int i;
        int i4;
        int i9;
        int i10;
        i = insets.left;
        i4 = insets.top;
        i9 = insets.right;
        i10 = insets.bottom;
        return b(i, i4, i9, i10);
    }

    public final Insets d() {
        return d.a(this.f1151a, this.f1152b, this.f1153c, this.f1154d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f1154d == eVar.f1154d && this.f1151a == eVar.f1151a && this.f1153c == eVar.f1153c && this.f1152b == eVar.f1152b;
    }

    public final int hashCode() {
        return (((((this.f1151a * 31) + this.f1152b) * 31) + this.f1153c) * 31) + this.f1154d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f1151a);
        sb.append(", top=");
        sb.append(this.f1152b);
        sb.append(", right=");
        sb.append(this.f1153c);
        sb.append(", bottom=");
        return y.m(sb, this.f1154d, '}');
    }
}
