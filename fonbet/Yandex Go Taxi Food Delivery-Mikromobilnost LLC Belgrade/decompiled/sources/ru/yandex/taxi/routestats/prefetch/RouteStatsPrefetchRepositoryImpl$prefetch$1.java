package ru.yandex.taxi.routestats.prefetch;

import defpackage.cbl0;
import defpackage.g050;
import defpackage.jne0;
import defpackage.lbl0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pbl0;
import defpackage.qoh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routestats.prefetch.RouteStatsPrefetchRepositoryImpl$prefetch$1", f = "RouteStatsPrefetchRepositoryImpl.kt", l = {HProv.PP_ENUM_LOG, 149}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteStatsPrefetchRepositoryImpl$prefetch$1 extends SuspendLambda implements wls {
    final /* synthetic */ jne0 $key;
    final /* synthetic */ lbl0 $param;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteStatsPrefetchRepositoryImpl$prefetch$1(m mVar, jne0 jne0Var, lbl0 lbl0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$key = jne0Var;
        this.$param = lbl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RouteStatsPrefetchRepositoryImpl$prefetch$1 routeStatsPrefetchRepositoryImpl$prefetch$1 = new RouteStatsPrefetchRepositoryImpl$prefetch$1(this.this$0, this.$key, this.$param, continuation);
        routeStatsPrefetchRepositoryImpl$prefetch$1.L$0 = obj;
        return routeStatsPrefetchRepositoryImpl$prefetch$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteStatsPrefetchRepositoryImpl$prefetch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        jne0 jne0Var;
        m mVar;
        g050 g050Var2;
        m mVar2;
        noh nohVar;
        jne0 jne0Var2;
        lbl0 lbl0Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                m mVar3 = this.this$0;
                g050Var = mVar3.f;
                jne0Var = this.$key;
                this.L$0 = tseVar;
                this.L$1 = g050Var;
                this.L$2 = mVar3;
                this.L$3 = jne0Var;
                this.label = 1;
                if (g050Var.a(this) != coroutineSingletons) {
                    mVar = mVar3;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lbl0Var = (lbl0) this.L$5;
                jne0Var2 = (jne0) this.L$4;
                mVar2 = (m) this.L$3;
                g050Var2 = (g050) this.L$2;
                nohVar = (noh) this.L$1;
                kotlin.b.b(obj);
                try {
                    mVar2.g.add(new pbl0(jne0Var2, nohVar, lbl0Var));
                    return zy11Var;
                } finally {
                    g050Var2.d(null);
                }
            }
            jne0Var = (jne0) this.L$3;
            mVar = (m) this.L$2;
            g050Var = (g050) this.L$1;
            kotlin.b.b(obj);
            ArrayList arrayList = mVar.g;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((cbl0) jne0Var).a(((pbl0) it.next()).a).b) {
                        return zy11Var;
                    }
                }
            }
            g050Var2.d(null);
            this.this$0.b.getClass();
            sjh sjhVar = uyj.a;
            qoh h = tje.h(tseVar, mdh.b, null, new RouteStatsPrefetchRepositoryImpl$prefetch$1$deferred$1(this.$param, this.this$0, null), 2);
            mVar2 = this.this$0;
            kotlinx.coroutines.sync.a aVar = mVar2.f;
            jne0 jne0Var3 = this.$key;
            lbl0 lbl0Var2 = this.$param;
            this.L$0 = null;
            this.L$1 = h;
            this.L$2 = aVar;
            this.L$3 = mVar2;
            this.L$4 = jne0Var3;
            this.L$5 = lbl0Var2;
            this.label = 2;
            if (aVar.a(this) != coroutineSingletons) {
                nohVar = h;
                g050Var2 = aVar;
                jne0Var2 = jne0Var3;
                lbl0Var = lbl0Var2;
                mVar2.g.add(new pbl0(jne0Var2, nohVar, lbl0Var));
                return zy11Var;
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            throw th;
        }
    }
}
