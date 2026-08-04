package com.gamericefishpro.space.o2;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.t.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final f0 a;
    public final e b;
    public final com.gamericefishpro.space.t.l c;
    public final d0 d = new d0(2);

    public q(f0 f0Var, e eVar, com.gamericefishpro.space.t.w wVar) {
        this.a = f0Var;
        this.b = eVar;
        this.c = wVar;
    }

    public final o a() {
        return new o(this.b, false, this.a, new l());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    public final void b(f0 f0Var, l lVar) {
        String str;
        String str2;
        com.gamericefishpro.space.q2.a aVar;
        com.gamericefishpro.space.q2.a aVar2;
        com.gamericefishpro.space.i1.e eVar;
        com.gamericefishpro.space.i1.e eVar2;
        d0 d0Var = this.d;
        Object[] objArr = d0Var.a;
        int i = d0Var.b;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            com.gamericefishpro.space.i1.b bVar = (com.gamericefishpro.space.i1.b) objArr[i2];
            com.gamericefishpro.space.t.x xVar = bVar.z;
            com.gamericefishpro.space.i2.t tVar = bVar.i;
            com.gamericefishpro.space.vb.c cVar = bVar.d;
            AutofillManager autofillManager = (AutofillManager) cVar.e;
            l lVarX = f0Var.x();
            int i3 = f0Var.e;
            if (lVar != null) {
                Object objG = lVar.d.g(s.D);
                if (objG == null) {
                    objG = null;
                }
                com.gamericefishpro.space.r2.e eVar3 = (com.gamericefishpro.space.r2.e) objG;
                if (eVar3 != null) {
                    str = eVar3.e;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            if (lVarX != null) {
                Object objG2 = lVarX.d.g(s.D);
                if (objG2 == null) {
                    objG2 = null;
                }
                com.gamericefishpro.space.r2.e eVar4 = (com.gamericefishpro.space.r2.e) objG2;
                if (eVar4 != null) {
                    str2 = eVar4.e;
                } else {
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            if (str != str2) {
                if (str == null) {
                    cVar.n(tVar, i3, true);
                } else if (str2 == null) {
                    cVar.n(tVar, i3, z);
                } else if (Intrinsics.a((com.gamericefishpro.space.i1.c) r.d(lVarX, s.r), com.gamericefishpro.space.i1.j.a)) {
                    autofillManager.notifyValueChanged(tVar, i3, AutofillValue.forText(str2));
                }
            }
            if (lVar != null) {
                Object objG3 = lVar.d.g(s.H);
                if (objG3 == null) {
                    objG3 = null;
                }
                aVar = (com.gamericefishpro.space.q2.a) objG3;
            } else {
                aVar = null;
            }
            if (lVarX != null) {
                Object objG4 = lVarX.d.g(s.H);
                if (objG4 == null) {
                    objG4 = null;
                }
                aVar2 = (com.gamericefishpro.space.q2.a) objG4;
            } else {
                aVar2 = null;
            }
            if (aVar != aVar2) {
                if (aVar == null) {
                    cVar.n(tVar, i3, true);
                } else if (aVar2 == null) {
                    cVar.n(tVar, i3, false);
                } else if (Intrinsics.a((com.gamericefishpro.space.i1.c) r.d(lVarX, s.r), com.gamericefishpro.space.i1.j.b)) {
                    int iOrdinal = aVar2.ordinal();
                    Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        autofillManager.notifyValueChanged(tVar, i3, AutofillValue.forToggle(bool.booleanValue()));
                    }
                }
            }
            if (lVar != null) {
                Object objG5 = lVar.d.g(s.s);
                if (objG5 == null) {
                    objG5 = null;
                }
                eVar = (com.gamericefishpro.space.i1.e) objG5;
            } else {
                eVar = null;
            }
            if (lVarX != null) {
                Object objG6 = lVarX.d.g(s.s);
                if (objG6 == null) {
                    objG6 = null;
                }
                eVar2 = (com.gamericefishpro.space.i1.e) objG6;
            } else {
                eVar2 = null;
            }
            if (Intrinsics.a(eVar, eVar2)) {
                z = false;
            } else if (eVar == null) {
                cVar.n(tVar, i3, true);
                z = false;
            } else if (eVar2 == null) {
                z = false;
                cVar.n(tVar, i3, false);
            } else {
                z = false;
                autofillManager.notifyValueChanged(tVar, i3, eVar2.a);
            }
            boolean z2 = (lVar == null || !lVar.d.b(s.q)) ? z : true;
            boolean z3 = (lVarX == null || !lVarX.d.b(s.q)) ? z : true;
            if (z2 != z3) {
                if (z3) {
                    xVar.a(i3);
                } else {
                    xVar.e(i3);
                }
            }
        }
    }
}
