package com.gamericefishpro.space.c7;

import android.content.Context;
import com.gamericefishpro.space.b0.o;
import com.gamericefishpro.space.ei.w;
import com.gamericefishpro.space.i9.y3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final Context a;
    public final e b;
    public final e c;
    public final e d;
    public final e e;

    public m(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = new e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(context)).e).j(), 1);
        this.c = new e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(context)).e).j(), 2);
        this.d = new e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(context)).e).j(), 3);
        this.e = new e(((com.gamericefishpro.space.l4.g) ((com.gamericefishpro.space.m.d) n.a(context)).e).j(), 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, com.gamericefishpro.space.vh.c cVar) {
        l lVar;
        w wVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i2 = lVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.v = i2 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object obj = lVar.e;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i3 = lVar.v;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            w wVar2 = new w();
            com.gamericefishpro.space.l4.g gVarA = n.a(this.a);
            o oVar = new o(i, wVar2, (com.gamericefishpro.space.th.a) null);
            lVar.d = wVar2;
            lVar.v = 1;
            if (y3.u(gVarA, oVar, lVar) == aVar) {
                return aVar;
            }
            wVar = wVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = lVar.d;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return Boolean.valueOf(wVar.d);
    }
}
