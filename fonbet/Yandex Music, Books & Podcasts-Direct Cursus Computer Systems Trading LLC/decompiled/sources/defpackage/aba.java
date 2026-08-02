package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class aba extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ mmo l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aba(mmo mmoVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = mmoVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new aba(this.l, continuation, 0);
            default:
                return new aba(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 0:
                ((aba) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
            default:
                ((aba) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return nm6.a;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                mmo mmoVar = this.l;
                arf arfVar = (arf) mmoVar.b;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    LinkedHashMap linkedHashMap = ((fba) ((kij) arfVar.getValue()).c.a.getValue()).a;
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((mqs) ((Map.Entry) it.next()).getKey()).a);
                    }
                    z75.t((LinkedHashSet) mmoVar.e, arrayList);
                    z75.y((LinkedHashSet) mmoVar.f, arrayList);
                    z75.y((LinkedHashSet) mmoVar.g, arrayList);
                    mmoVar.B0();
                    dkn dknVar = ((kij) arfVar.getValue()).e;
                    zaa zaaVar = new zaa(mmoVar, 0);
                    this.k = 1;
                    if (dknVar.a.collect(zaaVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                mmo mmoVar2 = this.l;
                x0q x0qVar = ((taa) ((raa) ((arf) mmoVar2.c).getValue())).c.j;
                zaa zaaVar2 = new zaa(mmoVar2, 1);
                this.k = 1;
                x0qVar.getClass();
                x0q.m(x0qVar, zaaVar2, this);
                return nm6Var2;
        }
    }
}
