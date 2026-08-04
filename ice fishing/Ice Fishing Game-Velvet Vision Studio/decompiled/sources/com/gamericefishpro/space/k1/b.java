package com.gamericefishpro.space.k1;

import android.view.DragEvent;
import android.view.View;
import com.gamericefishpro.space.b2.d0;
import com.gamericefishpro.space.ei.w;
import com.gamericefishpro.space.h2.b2;
import com.gamericefishpro.space.h2.k;
import com.gamericefishpro.space.o4.i;
import com.gamericefishpro.space.t.f;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnDragListener, c {
    public final e a;
    public final f b;
    public final a c;

    public b() {
        e eVar = new e();
        eVar.J = 0L;
        this.a = eVar;
        this.b = new f(0);
        this.c = new a(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        com.gamericefishpro.space.vb.c cVar = new com.gamericefishpro.space.vb.c(25, dragEvent);
        int action = dragEvent.getAction();
        f fVar = this.b;
        e eVar = this.a;
        switch (action) {
            case 1:
                w wVar = new w();
                d0 d0Var = new d0(cVar, eVar, wVar);
                if (d0Var.invoke(eVar) == b2.d) {
                    k.x(eVar, d0Var);
                }
                boolean z = wVar.d;
                fVar.getClass();
                com.gamericefishpro.space.t.a aVar = new com.gamericefishpro.space.t.a(fVar);
                while (aVar.hasNext()) {
                    ((e) aVar.next()).E0(cVar);
                }
                return z;
            case 2:
                eVar.D0(cVar);
                return false;
            case 3:
                return eVar.A0(cVar);
            case 4:
                d0 d0Var2 = new d0(13, cVar);
                if (d0Var2.invoke(eVar) == b2.d) {
                    k.x(eVar, d0Var2);
                }
                fVar.clear();
                return false;
            case i.STRING_FIELD_NUMBER /* 5 */:
                eVar.B0(cVar);
                return false;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                eVar.C0(cVar);
                return false;
            default:
                return false;
        }
    }
}
