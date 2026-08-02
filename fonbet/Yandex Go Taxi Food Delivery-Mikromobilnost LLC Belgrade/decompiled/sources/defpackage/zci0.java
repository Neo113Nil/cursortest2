package defpackage;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class zci0 implements m8w {
    public final nci0 a;
    public final ArrayList b;
    public final int c;
    public final q66 d;
    public final d5j0 e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public zci0(nci0 nci0Var, ArrayList arrayList, int i, q66 q66Var, d5j0 d5j0Var, int i2, int i3, int i4) {
        this.a = nci0Var;
        this.b = arrayList;
        this.c = i;
        this.d = q66Var;
        this.e = d5j0Var;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static zci0 a(zci0 zci0Var, int i, q66 q66Var, d5j0 d5j0Var, int i2) {
        if ((i2 & 1) != 0) {
            i = zci0Var.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            q66Var = zci0Var.d;
        }
        q66 q66Var2 = q66Var;
        if ((i2 & 4) != 0) {
            d5j0Var = zci0Var.e;
        }
        int i4 = zci0Var.f;
        int i5 = zci0Var.g;
        int i6 = zci0Var.h;
        return new zci0(zci0Var.a, zci0Var.b, i3, q66Var2, d5j0Var, i4, i5, i6);
    }

    public final kvj0 b(d5j0 d5j0Var) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            ny61.r("Check failed.");
            return null;
        }
        this.i++;
        q66 q66Var = this.d;
        if (q66Var != null) {
            gdi0 l = ((qjo) q66Var.w).l();
            kwu kwuVar = d5j0Var.a;
            kwu kwuVar2 = l.i.h;
            if (kwuVar.e != kwuVar2.e || !jl40.l(kwuVar.d, kwuVar2.d)) {
                yci0.n("network interceptor ", arrayList.get(i - 1), " must retain the same host and port");
                return null;
            }
            if (this.i != 1) {
                yci0.n("network interceptor ", arrayList.get(i - 1), " must call proceed() exactly once");
                return null;
            }
        }
        int i2 = i + 1;
        zci0 a = a(this, i2, null, d5j0Var, 58);
        p8w p8wVar = (p8w) arrayList.get(i);
        kvj0 intercept = p8wVar.intercept(a);
        if (intercept == null) {
            throw new NullPointerException("interceptor " + p8wVar + " returned null");
        }
        if (q66Var == null || i2 >= arrayList.size() || a.i == 1) {
            return intercept;
        }
        yci0.n("network interceptor ", p8wVar, " must call proceed() exactly once");
        return null;
    }
}
