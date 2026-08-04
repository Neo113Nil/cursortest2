package com.gamericefishpro.space.f1;

import java.util.Arrays;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c {
    public final c o;
    public boolean p;

    public d(long j, m mVar, Function1 function1, Function1 function2, c cVar) {
        super(j, mVar, function1, function2);
        this.o = cVar;
        cVar.k();
    }

    @Override // com.gamericefishpro.space.f1.c, com.gamericefishpro.space.f1.g
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

    @Override // com.gamericefishpro.space.f1.c
    public final v w() throws Throwable {
        d dVar;
        c cVar = this.o;
        if (cVar.m || cVar.c) {
            return new i(this);
        }
        com.gamericefishpro.space.t.i0 elements = this.h;
        long j = this.b;
        HashMap mapB = elements != null ? p.b(cVar.g(), this, this.o.d()) : null;
        Object obj = p.c;
        synchronized (obj) {
            try {
                p.c(this);
                try {
                    if (elements == null || elements.d == 0) {
                        dVar = this;
                        a();
                        Unit unit = Unit.a;
                    } else {
                        dVar = this;
                        v vVarZ = dVar.z(this.o.g(), elements, mapB, this.o.d());
                        if (!vVarZ.equals(j.b)) {
                            return vVarZ;
                        }
                        com.gamericefishpro.space.t.i0 i0VarX = dVar.o.x();
                        if (i0VarX != null) {
                            Intrinsics.checkNotNullParameter(elements, "elements");
                            i0VarX.j(elements);
                        } else {
                            dVar.o.B(elements);
                            dVar.h = null;
                        }
                    }
                    if (Intrinsics.e(dVar.o.g(), j) < 0) {
                        dVar.o.v();
                    }
                    c cVar2 = dVar.o;
                    cVar2.r(cVar2.d().c(j).b(dVar.j));
                    dVar.o.A(j);
                    c cVar3 = dVar.o;
                    int i = dVar.d;
                    dVar.d = -1;
                    if (i >= 0) {
                        int[] iArr = cVar3.k;
                        Intrinsics.checkNotNullParameter(iArr, "<this>");
                        int length = iArr.length;
                        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                        iArrCopyOf[length] = i;
                        cVar3.k = iArrCopyOf;
                    } else {
                        cVar3.getClass();
                    }
                    c cVar4 = dVar.o;
                    m mVar = dVar.j;
                    cVar4.getClass();
                    synchronized (obj) {
                        cVar4.j = cVar4.j.f(mVar);
                        Unit unit2 = Unit.a;
                        c cVar5 = dVar.o;
                        int[] elements2 = dVar.k;
                        cVar5.getClass();
                        if (elements2.length != 0) {
                            int[] iArr2 = cVar5.k;
                            if (iArr2.length != 0) {
                                Intrinsics.checkNotNullParameter(iArr2, "<this>");
                                Intrinsics.checkNotNullParameter(elements2, "elements");
                                int length2 = iArr2.length;
                                int length3 = elements2.length;
                                int[] iArrCopyOf2 = Arrays.copyOf(iArr2, length2 + length3);
                                System.arraycopy(elements2, 0, iArrCopyOf2, length2, length3);
                                Intrinsics.b(iArrCopyOf2);
                                elements2 = iArrCopyOf2;
                            }
                            cVar5.k = elements2;
                        }
                    }
                    dVar.m = true;
                    if (!dVar.p) {
                        dVar.p = true;
                        dVar.o.l();
                    }
                    return j.b;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
