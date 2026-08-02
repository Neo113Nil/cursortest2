package defpackage;

/* loaded from: classes.dex */
public final class lfi {
    public final fxq a;

    public lfi(fxq fxqVar) {
        this.a = fxqVar;
    }

    public static final void a(oxq oxqVar, int i) {
        while (oxqVar.v >= 0 && oxqVar.u <= i) {
            oxqVar.L();
            oxqVar.i();
        }
    }

    public final tpi b(nw0 nw0Var, gpi gpiVar) {
        fxq fxqVar;
        int i;
        Object[] objArr = gpiVar.a;
        int i2 = gpiVar.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            fxqVar = this.a;
            if (i4 >= i2) {
                break;
            }
            if (fxqVar.q(((mfi) objArr[i4]).e)) {
                i4++;
            } else {
                gpi gpiVar2 = new gpi();
                Object[] objArr2 = gpiVar.a;
                int i5 = gpiVar.b;
                for (int i6 = 0; i6 < i5; i6++) {
                    Object obj = objArr2[i6];
                    if (fxqVar.q(((mfi) obj).e)) {
                        gpiVar2.a(obj);
                    }
                }
                gpiVar = gpiVar2;
            }
        }
        ybg ybgVar = new ybg(9, this);
        if (gpiVar.b > 1) {
            Comparable comparable = (Comparable) ybgVar.invoke(gpiVar.e(0));
            int i7 = gpiVar.b;
            int i8 = 1;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                Comparable comparable2 = (Comparable) ybgVar.invoke(gpiVar.e(i8));
                if (comparable.compareTo(comparable2) > 0) {
                    gpi gpiVar3 = new gpi(gpiVar.b);
                    Object[] objArr3 = gpiVar.a;
                    int i9 = gpiVar.b;
                    for (int i10 = 0; i10 < i9; i10++) {
                        gpiVar3.a(objArr3[i10]);
                    }
                    epi epiVar = gpiVar3.c;
                    if (epiVar == null) {
                        epiVar = new epi(i3, gpiVar3);
                        gpiVar3.c = epiVar;
                    }
                    if (((gpi) epiVar.b).b > 1) {
                        y75.s(epiVar, new eh(7, ybgVar));
                    }
                    gpiVar = gpiVar3;
                } else {
                    i8++;
                    comparable = comparable2;
                }
            }
        }
        if (gpiVar.g()) {
            tpi tpiVar = vso.b;
            tpiVar.getClass();
            return tpiVar;
        }
        long[] jArr = vso.a;
        tpi tpiVar2 = new tpi();
        oxq o = fxqVar.o();
        try {
            Object[] objArr4 = gpiVar.a;
            int i11 = gpiVar.b;
            for (int i12 = 0; i12 < i11; i12++) {
                mfi mfiVar = (mfi) objArr4[i12];
                int c = o.c(mfiVar.e);
                int E = o.E(o.b, c);
                a(o, E);
                a(o, E);
                while (true) {
                    i = o.t;
                    if (i == E || i == o.u) {
                        break;
                    }
                    if (E < o.s(i) + i) {
                        o.P();
                    } else {
                        o.K();
                    }
                }
                if (i != E) {
                    pq5.c("Unexpected slot table structure");
                }
                o.P();
                o.a(c - o.t);
                tpiVar2.m(mfiVar, pq5.f(mfiVar.c, mfiVar, o, nw0Var));
            }
            a(o, Integer.MAX_VALUE);
            o.e(true);
            return tpiVar2;
        } catch (Throwable th) {
            o.e(false);
            throw th;
        }
    }
}
