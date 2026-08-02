package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class uxi extends ypi {
    public final ypi o;
    public boolean p;

    public uxi(long j, f2r f2rVar, Function1 function1, Function1 function12, ypi ypiVar) {
        super(j, f2rVar, function1, function12);
        this.o = ypiVar;
        ypiVar.k();
    }

    @Override // defpackage.ypi, defpackage.b2r
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.ypi
    public final bzf w() {
        uxi uxiVar;
        ypi ypiVar = this.o;
        if (ypiVar.m || ypiVar.c) {
            return new c2r(this);
        }
        upi upiVar = this.h;
        long j = this.b;
        HashMap c = upiVar != null ? g2r.c(ypiVar.g(), this, this.o.d()) : null;
        Object obj = g2r.b;
        synchronized (obj) {
            try {
                g2r.d(this);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (upiVar == null || upiVar.d == 0) {
                    uxiVar = this;
                    a();
                } else {
                    uxiVar = this;
                    bzf z = uxiVar.z(this.o.g(), upiVar, c, this.o.d());
                    if (!z.equals(d2r.b)) {
                        return z;
                    }
                    upi x = uxiVar.o.x();
                    if (x != null) {
                        x.k(upiVar);
                    } else {
                        uxiVar.o.B(upiVar);
                        uxiVar.h = null;
                    }
                }
                if (uxiVar.o.g() < j) {
                    uxiVar.o.v();
                }
                ypi ypiVar2 = uxiVar.o;
                ypiVar2.r(ypiVar2.d().g(j).a(uxiVar.j));
                uxiVar.o.A(j);
                ypi ypiVar3 = uxiVar.o;
                int i = uxiVar.d;
                uxiVar.d = -1;
                if (i >= 0) {
                    int[] iArr = ypiVar3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i;
                    ypiVar3.k = copyOf;
                } else {
                    ypiVar3.getClass();
                }
                ypi ypiVar4 = uxiVar.o;
                f2r f2rVar = uxiVar.j;
                ypiVar4.getClass();
                synchronized (obj) {
                    ypiVar4.j = ypiVar4.j.o(f2rVar);
                    ypi ypiVar5 = uxiVar.o;
                    int[] iArr2 = uxiVar.k;
                    ypiVar5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = ypiVar5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                            iArr2 = copyOf2;
                        }
                        ypiVar5.k = iArr2;
                    }
                }
                uxiVar.m = true;
                if (!uxiVar.p) {
                    uxiVar.p = true;
                    uxiVar.o.l();
                }
                return d2r.b;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
