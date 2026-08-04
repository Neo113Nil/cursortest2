package com.gamericefishpro.space.l4;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends com.gamericefishpro.space.vh.i implements Function1 {
    public final /* synthetic */ c0 A;
    public final /* synthetic */ com.gamericefishpro.space.u6.i B;
    public Object d;
    public Serializable e;
    public Object i;
    public Object v;
    public Iterator w;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c0 c0Var, com.gamericefishpro.space.u6.i iVar, com.gamericefishpro.space.th.a aVar) {
        super(1, aVar);
        this.A = c0Var;
        this.B = iVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
        return new k(this.A, this.B, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((k) create((com.gamericefishpro.space.th.a) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00da  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:40:0x0102  */
    /* JADX WARN: Code duplicated, block: B:49:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x00a1->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.xi.a cVar;
        com.gamericefishpro.space.ei.w wVar;
        com.gamericefishpro.space.ei.a0 a0Var;
        com.gamericefishpro.space.ei.a0 a0Var2;
        com.gamericefishpro.space.xi.a aVar;
        Iterator it;
        com.gamericefishpro.space.xi.a aVar2;
        com.gamericefishpro.space.ei.w wVar2;
        com.gamericefishpro.space.ei.a0 a0Var3;
        j jVar;
        com.gamericefishpro.space.ei.a0 a0Var4;
        com.gamericefishpro.space.ei.w wVar3;
        Function2 function2;
        Object obj2;
        int iHashCode;
        Integer numA;
        int i;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = this.z;
        com.gamericefishpro.space.u6.i iVar = this.B;
        c0 c0Var = this.A;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            cVar = new com.gamericefishpro.space.xi.c();
            wVar = new com.gamericefishpro.space.ei.w();
            a0Var = new com.gamericefishpro.space.ei.a0();
            this.d = cVar;
            this.e = wVar;
            this.i = a0Var;
            this.v = a0Var;
            this.z = 1;
            obj = c0.e(c0Var, true, this);
            if (obj != aVar3) {
                a0Var2 = a0Var;
            }
            return aVar3;
        }
        if (i2 == 1) {
            a0Var = (com.gamericefishpro.space.ei.a0) this.v;
            a0Var2 = (com.gamericefishpro.space.ei.a0) this.i;
            wVar = (com.gamericefishpro.space.ei.w) this.e;
            cVar = (com.gamericefishpro.space.xi.a) this.d;
            com.gamericefishpro.space.wa.b.P(obj);
        } else {
            if (i2 == 2) {
                it = this.w;
                jVar = (j) this.v;
                a0Var3 = (com.gamericefishpro.space.ei.a0) this.i;
                wVar2 = (com.gamericefishpro.space.ei.w) this.e;
                aVar2 = (com.gamericefishpro.space.xi.a) this.d;
                com.gamericefishpro.space.wa.b.P(obj);
                while (it.hasNext()) {
                    function2 = (Function2) it.next();
                    this.d = aVar2;
                    this.e = wVar2;
                    this.i = a0Var3;
                    this.v = jVar;
                    this.w = it;
                    this.z = 2;
                    if (function2.invoke(jVar, this) == aVar3) {
                        return aVar3;
                    }
                }
                a0Var2 = a0Var3;
                wVar = wVar2;
                aVar = aVar2;
                iVar.c = null;
                this.d = wVar;
                this.e = a0Var2;
                this.i = aVar;
                this.v = null;
                this.w = null;
                this.z = 3;
                if (aVar.c(this) != aVar3) {
                    a0Var4 = a0Var2;
                    wVar3 = wVar;
                    wVar3.d = true;
                    Unit unit = Unit.a;
                    aVar.b(null);
                    obj2 = a0Var4.d;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    t0 t0VarF = c0Var.f();
                    this.d = obj2;
                    this.e = null;
                    this.i = null;
                    this.y = iHashCode;
                    this.z = 4;
                    numA = t0VarF.a();
                    if (numA != aVar3) {
                        i = iHashCode;
                        obj = numA;
                    }
                }
                return aVar3;
            }
            if (i2 == 3) {
                aVar = (com.gamericefishpro.space.xi.a) this.i;
                a0Var4 = (com.gamericefishpro.space.ei.a0) this.e;
                wVar3 = (com.gamericefishpro.space.ei.w) this.d;
                com.gamericefishpro.space.wa.b.P(obj);
                try {
                    wVar3.d = true;
                    Unit unit2 = Unit.a;
                    aVar.b(null);
                    obj2 = a0Var4.d;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    t0 t0VarF2 = c0Var.f();
                    this.d = obj2;
                    this.e = null;
                    this.i = null;
                    this.y = iHashCode;
                    this.z = 4;
                    numA = t0VarF2.a();
                    if (numA != aVar3) {
                        i = iHashCode;
                        obj = numA;
                    }
                    return aVar3;
                } catch (Throwable th) {
                    aVar.b(null);
                    throw th;
                }
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.y;
            obj2 = this.d;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return new d(i, ((Number) obj).intValue(), obj2);
        a0Var.d = ((d) obj).b;
        j jVar2 = new j(cVar, wVar, a0Var2, c0Var);
        List list = (List) iVar.c;
        if (list != null) {
            it = list.iterator();
            aVar2 = cVar;
            wVar2 = wVar;
            a0Var3 = a0Var2;
            jVar = jVar2;
            while (it.hasNext()) {
                function2 = (Function2) it.next();
                this.d = aVar2;
                this.e = wVar2;
                this.i = a0Var3;
                this.v = jVar;
                this.w = it;
                this.z = 2;
                if (function2.invoke(jVar, this) == aVar3) {
                    return aVar3;
                }
            }
            a0Var2 = a0Var3;
            wVar = wVar2;
            aVar = aVar2;
        } else {
            aVar = cVar;
        }
        iVar.c = null;
        this.d = wVar;
        this.e = a0Var2;
        this.i = aVar;
        this.v = null;
        this.w = null;
        this.z = 3;
        if (aVar.c(this) != aVar3) {
            a0Var4 = a0Var2;
            wVar3 = wVar;
            wVar3.d = true;
            Unit unit3 = Unit.a;
            aVar.b(null);
            obj2 = a0Var4.d;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            t0 t0VarF3 = c0Var.f();
            this.d = obj2;
            this.e = null;
            this.i = null;
            this.y = iHashCode;
            this.z = 4;
            numA = t0VarF3.a();
            if (numA != aVar3) {
                i = iHashCode;
                obj = numA;
                return new d(i, ((Number) obj).intValue(), obj2);
            }
        }
        return aVar3;
    }
}
