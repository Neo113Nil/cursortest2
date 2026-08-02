package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class o1e extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ v2s k;
    public /* synthetic */ re l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1e(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        v2s v2sVar = (v2s) obj;
        re reVar = (re) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                o1e o1eVar = new o1e(3, 0, continuation);
                o1eVar.k = v2sVar;
                o1eVar.l = reVar;
                return o1eVar.invokeSuspend(Unit.a);
            case 1:
                o1e o1eVar2 = new o1e(3, 1, continuation);
                o1eVar2.k = v2sVar;
                o1eVar2.l = reVar;
                return o1eVar2.invokeSuspend(Unit.a);
            default:
                o1e o1eVar3 = new o1e(3, 2, continuation);
                o1eVar3.k = v2sVar;
                o1eVar3.l = reVar;
                return o1eVar3.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        m2s a;
        switch (this.j) {
            case 0:
                v2s v2sVar = this.k;
                re reVar = this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return new Pair(v2sVar, reVar);
            case 1:
                v2s v2sVar2 = this.k;
                re reVar2 = this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (reVar2 != null) {
                    return reVar2.a.c.c.a;
                }
                if (v2sVar2 == null || (a = v2sVar2.a.a()) == null) {
                    return null;
                }
                return a.a.a;
            default:
                v2s v2sVar3 = this.k;
                re reVar3 = this.l;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return reVar3 != null ? new k2s(reVar3.b, sqq.a(reVar3.a)) : l2s.a(v2sVar3);
        }
    }
}
