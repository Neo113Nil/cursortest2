package com.gamericefishpro.space.j0;

import android.view.autofill.AutofillValue;
import com.gamericefishpro.space.b0.i;
import com.gamericefishpro.space.i1.e;
import com.gamericefishpro.space.i1.j;
import com.gamericefishpro.space.o2.h;
import com.gamericefishpro.space.o2.k;
import com.gamericefishpro.space.o2.s;
import com.gamericefishpro.space.o2.u;
import com.gamericefishpro.space.o2.v;
import com.gamericefishpro.space.o2.w;
import com.gamericefishpro.space.y.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends z {
    public boolean d0;
    public Function1 e0;
    public final com.gamericefishpro.space.a3.b f0;

    public d(final boolean z, i iVar, boolean z2, h hVar, final Function1 function1) {
        super(iVar, false, z2, hVar, new Function0() { // from class: com.gamericefishpro.space.j0.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                function1.invoke(Boolean.valueOf(!z));
                return Unit.a;
            }
        });
        this.d0 = z;
        this.e0 = function1;
        this.f0 = new com.gamericefishpro.space.a3.b(11, this);
    }

    @Override // com.gamericefishpro.space.y.z
    public final void D0(w wVar) {
        com.gamericefishpro.space.q2.a aVar = this.d0 ? com.gamericefishpro.space.q2.a.d : com.gamericefishpro.space.q2.a.e;
        com.gamericefishpro.space.ki.d[] dVarArr = u.a;
        v vVar = s.H;
        com.gamericefishpro.space.ki.d[] dVarArr2 = u.a;
        com.gamericefishpro.space.ki.d dVar = dVarArr2[25];
        wVar.b(vVar, aVar);
        v vVar2 = s.r;
        com.gamericefishpro.space.ki.d dVar2 = dVarArr2[9];
        wVar.b(vVar2, j.b);
        e eVar = new e(AutofillValue.forToggle(this.d0));
        v vVar3 = s.s;
        com.gamericefishpro.space.ki.d dVar3 = dVarArr2[10];
        wVar.b(vVar3, eVar);
        wVar.b(k.h, new com.gamericefishpro.space.o2.a(null, new com.gamericefishpro.space.a7.c(12, wVar)));
    }
}
