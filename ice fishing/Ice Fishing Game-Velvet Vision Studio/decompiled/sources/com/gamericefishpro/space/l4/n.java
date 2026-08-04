package com.gamericefishpro.space.l4;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends com.gamericefishpro.space.vh.i implements com.gamericefishpro.space.di.c {
    public final /* synthetic */ int d;
    public int e;
    public /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, int i2, com.gamericefishpro.space.th.a aVar) {
        super(i, aVar);
        this.d = i2;
    }

    @Override // com.gamericefishpro.space.di.c
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new n((c0) this.i, (com.gamericefishpro.space.th.a) obj3).invokeSuspend(Unit.a);
            case 1:
                ((Boolean) obj2).getClass();
                n nVar = new n(3, 1, (com.gamericefishpro.space.th.a) obj3);
                nVar.i = (f0) obj;
                return nVar.invokeSuspend(Unit.a);
            default:
                int iIntValue = ((Number) obj2).intValue();
                n nVar2 = new n(3, 2, (com.gamericefishpro.space.th.a) obj3);
                nVar2.i = (List) obj;
                nVar2.e = iIntValue;
                return nVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    c0 c0Var = (c0) this.i;
                    this.e = 1;
                    if (c0.a(c0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case 1:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i2 = this.e;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                    return obj;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                f0 f0Var = (f0) this.i;
                this.e = 1;
                f0Var.getClass();
                Object objA = f0.a(f0Var, this);
                return objA == aVar2 ? aVar2 : objA;
            default:
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                List list = (List) this.i;
                int i3 = this.e;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    com.gamericefishpro.space.d7.d dVar = (com.gamericefishpro.space.d7.d) obj2;
                    if (!dVar.c && dVar.d > 0) {
                        arrayList.add(obj2);
                    }
                }
                int size = arrayList.size();
                int size2 = arrayList.size();
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i5 < size2) {
                    Object obj3 = arrayList.get(i5);
                    i5++;
                    i4 += ((com.gamericefishpro.space.d7.d) obj3).d;
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    Integer num2 = new Integer(((com.gamericefishpro.space.d7.d) it.next()).a);
                    while (it.hasNext()) {
                        Integer num3 = new Integer(((com.gamericefishpro.space.d7.d) it.next()).a);
                        if (num2.compareTo(num3) < 0) {
                            num2 = num3;
                        }
                    }
                    num = num2;
                } else {
                    num = null;
                }
                int iIntValue = num != null ? num.intValue() : 0;
                if (!arrayList.isEmpty()) {
                    int size3 = arrayList.size();
                    int i7 = 0;
                    while (i7 < size3) {
                        Object obj4 = arrayList.get(i7);
                        i7++;
                        if (((com.gamericefishpro.space.d7.d) obj4).d >= 3 && (i6 = i6 + 1) < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
                }
                return new com.gamericefishpro.space.u7.b(size, i4, i3, iIntValue, i6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c0 c0Var, com.gamericefishpro.space.th.a aVar) {
        super(3, aVar);
        this.d = 0;
        this.i = c0Var;
    }
}
