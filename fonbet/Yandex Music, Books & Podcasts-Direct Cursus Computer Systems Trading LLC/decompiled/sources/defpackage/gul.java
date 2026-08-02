package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class gul extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ Set k;
    public /* synthetic */ List l;
    public final /* synthetic */ jul m;
    public final /* synthetic */ mqs n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gul(jul julVar, mqs mqsVar, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.m = julVar;
        this.n = mqsVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Set set = (Set) obj;
        List list = (List) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                gul gulVar = new gul(this.m, this.n, continuation, 0);
                gulVar.k = set;
                gulVar.l = list;
                return gulVar.invokeSuspend(Unit.a);
            default:
                gul gulVar2 = new gul(this.m, this.n, continuation, 1);
                gulVar2.k = set;
                gulVar2.l = list;
                return gulVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        mqs mqsVar = this.n;
        jul julVar = this.m;
        switch (i) {
            case 0:
                Set set = this.k;
                List list = this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return jul.a(julVar, mqsVar, set, list);
            default:
                Set set2 = this.k;
                List list2 = this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return jul.a(julVar, mqsVar, set2, list2);
        }
    }
}
