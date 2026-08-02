package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o86 {
    public int b;
    public boolean c;
    public final aa6 d;
    public final int e;
    public o86 f;
    public i3r i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public o86(aa6 aa6Var, int i) {
        this.d = aa6Var;
        this.e = i;
    }

    public final void a(o86 o86Var, int i) {
        b(o86Var, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(o86 o86Var, int i, int i2, boolean z) {
        if (o86Var == null) {
            j();
            return true;
        }
        if (!z && !i(o86Var)) {
            return false;
        }
        this.f = o86Var;
        if (o86Var.a == null) {
            o86Var.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, mmv mmvVar, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                xv7.x(((o86) it.next()).d, i, arrayList, mmvVar);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        o86 o86Var;
        if (this.d.i0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (o86Var = this.f) == null || o86Var.d.i0 != 8) ? this.g : i;
    }

    public final o86 f() {
        int i = this.e;
        int D = ouj.D(i);
        aa6 aa6Var = this.d;
        switch (D) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return aa6Var.L;
            case 2:
                return aa6Var.M;
            case 3:
                return aa6Var.J;
            case 4:
                return aa6Var.K;
            default:
                xq0.w(su4.x(i));
                return null;
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((o86) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(o86 o86Var) {
        if (o86Var != null) {
            aa6 aa6Var = o86Var.d;
            int i = o86Var.e;
            int i2 = this.e;
            if (i != i2) {
                switch (ouj.D(i2)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(aa6Var instanceof grd)) {
                            return z;
                        }
                        if (z || i == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(aa6Var instanceof grd)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
                        }
                        break;
                    case 5:
                        if (i == 2 || i == 4) {
                        }
                        break;
                    case 6:
                        if (i == 6 || i == 8 || i == 9) {
                        }
                        break;
                    default:
                        xq0.w(su4.x(i2));
                        return false;
                }
            } else if (i2 != 6 || (aa6Var.E && this.d.E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        o86 o86Var = this.f;
        if (o86Var != null && (hashSet = o86Var.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        i3r i3rVar = this.i;
        if (i3rVar == null) {
            this.i = new i3r(1);
        } else {
            i3rVar.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.k0 + StringUtils.PROCESS_POSTFIX_DELIMITER + su4.x(this.e);
    }
}
