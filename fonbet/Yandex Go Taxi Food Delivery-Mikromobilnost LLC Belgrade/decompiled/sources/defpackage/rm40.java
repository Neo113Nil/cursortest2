package defpackage;

import androidx.compose.foundation.text.selection.CrossStatus;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes10.dex */
public final class rm40 implements rkq0 {
    public final ey40 a;
    public final List b;
    public final int c;
    public final int d;
    public final boolean e;
    public final ckq0 f;

    public rm40(ey40 ey40Var, List list, int i, int i2, boolean z, ckq0 ckq0Var) {
        this.a = ey40Var;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = ckq0Var;
        if (list.size() > 1) {
            return;
        }
        lxv.c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    public static void m(gy40 gy40Var, ckq0 ckq0Var, dfq0 dfq0Var, int i, int i2) {
        ckq0 ckq0Var2;
        if (ckq0Var.c) {
            ckq0Var2 = new ckq0(dfq0Var.a(i2), dfq0Var.a(i), i2 > i);
        } else {
            ckq0Var2 = new ckq0(dfq0Var.a(i), dfq0Var.a(i2), i > i2);
        }
        if (i > i2) {
            lxv.c("minOffset should be less than or equal to maxOffset: " + ckq0Var2);
        }
        long j = dfq0Var.a;
        int c = gy40Var.c(j);
        Object[] objArr = gy40Var.c;
        Object obj = objArr[c];
        gy40Var.b[c] = j;
        objArr[c] = ckq0Var2;
    }

    @Override // defpackage.rkq0
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.rkq0
    public final dfq0 b() {
        return this.e ? f() : e();
    }

    @Override // defpackage.rkq0
    public final CrossStatus c() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return CrossStatus.NOT_CROSSED;
        }
        if (i > i2) {
            return CrossStatus.CROSSED;
        }
        return ((dfq0) this.b.get(i / 2)).b();
    }

    @Override // defpackage.rkq0
    public final ckq0 d() {
        return this.f;
    }

    @Override // defpackage.rkq0
    public final dfq0 e() {
        return (dfq0) this.b.get(o(this.d, false));
    }

    @Override // defpackage.rkq0
    public final dfq0 f() {
        return (dfq0) this.b.get(o(this.c, true));
    }

    @Override // defpackage.rkq0
    public final int g() {
        return this.c;
    }

    @Override // defpackage.rkq0
    public final int getSize() {
        return this.b.size();
    }

    @Override // defpackage.rkq0
    public final boolean h(rkq0 rkq0Var) {
        if (this.f != null && rkq0Var != null && (rkq0Var instanceof rm40)) {
            rm40 rm40Var = (rm40) rkq0Var;
            List list = rm40Var.b;
            if (this.e == rm40Var.e && this.c == rm40Var.c && this.d == rm40Var.d) {
                List list2 = this.b;
                if (list2.size() == list.size()) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        dfq0 dfq0Var = (dfq0) list2.get(i);
                        dfq0 dfq0Var2 = (dfq0) list.get(i);
                        if (dfq0Var.a != dfq0Var2.a || dfq0Var.c != dfq0Var2.c || dfq0Var.d != dfq0Var2.d) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.rkq0
    public final void i(tls tlsVar) {
        int n = n(j().a);
        int n2 = n((c() == CrossStatus.CROSSED ? f() : e()).a);
        int i = n + 1;
        if (i >= n2) {
            return;
        }
        while (i < n2) {
            tlsVar.invoke(this.b.get(i));
            i++;
        }
    }

    @Override // defpackage.rkq0
    public final dfq0 j() {
        return c() == CrossStatus.CROSSED ? e() : f();
    }

    @Override // defpackage.rkq0
    public final int k() {
        return this.d;
    }

    @Override // defpackage.rkq0
    public final gy40 l(ckq0 ckq0Var) {
        bkq0 bkq0Var = ckq0Var.a;
        boolean z = ckq0Var.c;
        long j = bkq0Var.c;
        int i = bkq0Var.b;
        bkq0 bkq0Var2 = ckq0Var.b;
        long j2 = bkq0Var2.c;
        int i2 = bkq0Var2.b;
        if (j != j2) {
            gy40 a = zlz.a();
            m(a, ckq0Var, j(), (z ? bkq0Var2 : bkq0Var).b, j().f.a.a.b.length());
            i(new t130(this, a, ckq0Var));
            if (!z) {
                bkq0Var = bkq0Var2;
            }
            m(a, ckq0Var, c() == CrossStatus.CROSSED ? f() : e(), 0, bkq0Var.b);
            return a;
        }
        if ((!z || i < i2) && (z || i > i2)) {
            lxv.c("unexpectedly miss-crossed selection: " + ckq0Var);
        }
        long j3 = bkq0Var.c;
        gy40 gy40Var = zlz.a;
        gy40 gy40Var2 = new gy40((Object) null);
        gy40Var2.h(j3, ckq0Var);
        return gy40Var2;
    }

    public final int n(long j) {
        try {
            return this.a.c(j);
        } catch (NoSuchElementException e) {
            ny61.h(qv10.j(j, "Invalid selectableId: "), e);
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int o(int i, boolean z) {
        int i2 = qm40.a[c().ordinal()];
        int i3 = z;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    w511.b();
                    return 0;
                }
                if (z != 0) {
                    i3 = 0;
                }
            }
            return (i - (i3 ^ 1)) / 2;
        }
        i3 = 1;
        return (i - (i3 ^ 1)) / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.e);
        sb.append(", startPosition=");
        boolean z = true;
        sb.append((this.c + 1) / 2.0f);
        sb.append(", endPosition=");
        sb.append((this.d + 1) / 2.0f);
        sb.append(", crossed=");
        sb.append(c());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            dfq0 dfq0Var = (dfq0) list.get(i);
            if (z) {
                z = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i++;
            sb3.append(i);
            sb3.append(" -> ");
            sb3.append(dfq0Var);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        sb.append(sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
