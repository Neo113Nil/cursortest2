package com.gamericefishpro.space.ti;

import kotlin.Unit;
import kotlin.collections.IndexedValue;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements com.gamericefishpro.space.si.f {
    public final /* synthetic */ com.gamericefishpro.space.ri.e d;
    public final /* synthetic */ int e;

    public m(com.gamericefishpro.space.ri.e eVar, int i) {
        this.d = eVar;
        this.e = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (com.gamericefishpro.space.pi.a0.G(r0) == r1) goto L21;
     */
    @Override // com.gamericefishpro.space.si.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, com.gamericefishpro.space.th.a aVar) {
        l lVar;
        if (aVar instanceof l) {
            lVar = (l) aVar;
            int i = lVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar.i = i - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, aVar);
            }
        } else {
            lVar = new l(this, aVar);
        }
        Object obj2 = lVar.d;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = lVar.i;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj2);
            IndexedValue indexedValue = new IndexedValue(this.e, obj);
            lVar.i = 1;
            if (this.d.d(lVar, indexedValue) != aVar2) {
            }
            return aVar2;
        }
        if (i2 == 1) {
            com.gamericefishpro.space.wa.b.P(obj2);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj2);
        }
        return Unit.a;
        lVar.i = 2;
    }
}
