package flex.core.action.remote.executor;

import defpackage.dez;
import defpackage.hwn;
import defpackage.hx;
import defpackage.hy;
import defpackage.ny61;
import defpackage.ox;
import defpackage.s8o;
import defpackage.tje;
import defpackage.xv;
import defpackage.ywl;
import defpackage.zjr;
import flex.core.loader.network.f;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class a implements xv, dez {
    public final hy a;
    public final List b;
    public final zjr c = new zjr(new hwn(), EmptyList.a);

    public a(hy hyVar, List list) {
        this.a = hyVar;
        this.b = list;
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(hx hxVar, ywl ywlVar, ContinuationImpl continuationImpl) {
        DefaultActionExecutor$performActionRequest$1 defaultActionExecutor$performActionRequest$1;
        int i;
        hy hyVar;
        if (continuationImpl instanceof DefaultActionExecutor$performActionRequest$1) {
            defaultActionExecutor$performActionRequest$1 = (DefaultActionExecutor$performActionRequest$1) continuationImpl;
            int i2 = defaultActionExecutor$performActionRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultActionExecutor$performActionRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultActionExecutor$performActionRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultActionExecutor$performActionRequest$1.label;
                if (i != 0) {
                    b.b(obj);
                    hy hyVar2 = this.a;
                    s8o.S(this, hyVar2);
                    ox oxVar = new ox(hxVar);
                    defaultActionExecutor$performActionRequest$1.L$0 = null;
                    defaultActionExecutor$performActionRequest$1.L$1 = ywlVar;
                    defaultActionExecutor$performActionRequest$1.L$2 = hyVar2;
                    defaultActionExecutor$performActionRequest$1.L$3 = hxVar;
                    defaultActionExecutor$performActionRequest$1.label = 1;
                    Object a = f.a(this.b, ywlVar, oxVar, defaultActionExecutor$performActionRequest$1);
                    if (a != coroutineSingletons) {
                        hyVar = hyVar2;
                        obj = a;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                hxVar = (hx) defaultActionExecutor$performActionRequest$1.L$3;
                hy hyVar3 = (hy) defaultActionExecutor$performActionRequest$1.L$2;
                ywlVar = (ywl) defaultActionExecutor$performActionRequest$1.L$1;
                b.b(obj);
                hyVar = hyVar3;
                hx hxVar2 = hxVar;
                ywl ywlVar2 = ywlVar;
                defaultActionExecutor$performActionRequest$1.L$0 = null;
                defaultActionExecutor$performActionRequest$1.L$1 = null;
                defaultActionExecutor$performActionRequest$1.L$2 = null;
                defaultActionExecutor$performActionRequest$1.L$3 = null;
                defaultActionExecutor$performActionRequest$1.label = 2;
                Object k0 = tje.k0(hyVar.c, new ActionService$performAction$2(ywlVar2, hyVar, hxVar2, (Map) obj, null), defaultActionExecutor$performActionRequest$1);
                return k0 != coroutineSingletons ? coroutineSingletons : k0;
            }
        }
        defaultActionExecutor$performActionRequest$1 = new DefaultActionExecutor$performActionRequest$1(this, continuationImpl);
        Object obj2 = defaultActionExecutor$performActionRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultActionExecutor$performActionRequest$1.label;
        if (i != 0) {
        }
        hx hxVar22 = hxVar;
        ywl ywlVar22 = ywlVar;
        defaultActionExecutor$performActionRequest$1.L$0 = null;
        defaultActionExecutor$performActionRequest$1.L$1 = null;
        defaultActionExecutor$performActionRequest$1.L$2 = null;
        defaultActionExecutor$performActionRequest$1.L$3 = null;
        defaultActionExecutor$performActionRequest$1.label = 2;
        Object k02 = tje.k0(hyVar.c, new ActionService$performAction$2(ywlVar22, hyVar, hxVar22, (Map) obj2, null), defaultActionExecutor$performActionRequest$1);
        if (k02 != coroutineSingletons2) {
        }
    }
}
