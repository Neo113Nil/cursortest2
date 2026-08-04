package com.gamericefishpro.space.i1;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.i2.t;
import com.gamericefishpro.space.m1.u;
import com.gamericefishpro.space.o2.q;
import com.gamericefishpro.space.t.h0;
import com.gamericefishpro.space.t.x;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h implements com.gamericefishpro.space.m1.f {
    public boolean A;
    public final com.gamericefishpro.space.vb.c d;
    public final q e;
    public final t i;
    public final com.gamericefishpro.space.p2.b v;
    public final String w;
    public final AutofillId y;
    public final x z;

    public b(com.gamericefishpro.space.vb.c cVar, q qVar, t tVar, com.gamericefishpro.space.p2.b bVar, String str) {
        this.d = cVar;
        this.e = qVar;
        this.i = tVar;
        this.v = bVar;
        this.w = str;
        new Rect();
        tVar.setImportantForAutofill(1);
        AutofillId autofillId = tVar.getAutofillId();
        if (autofillId == null) {
            throw com.gamericefishpro.space.m5.a.e("Required value was null.");
        }
        this.y = autofillId;
        this.z = new x();
    }

    @Override // com.gamericefishpro.space.m1.f
    public final void a(u uVar, u uVar2) {
        f0 f0VarS;
        com.gamericefishpro.space.o2.l lVarX;
        f0 f0VarS2;
        com.gamericefishpro.space.o2.l lVarX2;
        if (uVar != null && (f0VarS2 = com.gamericefishpro.space.h2.k.s(uVar)) != null && (lVarX2 = f0VarS2.x()) != null) {
            h0 h0Var = lVarX2.d;
            if (h0Var.b(com.gamericefishpro.space.o2.k.g) || h0Var.b(com.gamericefishpro.space.o2.k.h)) {
                ((AutofillManager) this.d.e).notifyViewExited(this.i, f0VarS2.e);
            }
        }
        if (uVar2 == null || (f0VarS = com.gamericefishpro.space.h2.k.s(uVar2)) == null || (lVarX = f0VarS.x()) == null) {
            return;
        }
        h0 h0Var2 = lVarX.d;
        if (h0Var2.b(com.gamericefishpro.space.o2.k.g) || h0Var2.b(com.gamericefishpro.space.o2.k.h)) {
            int i = f0VarS.e;
            this.v.a.m(i, new a(this, i));
        }
    }
}
