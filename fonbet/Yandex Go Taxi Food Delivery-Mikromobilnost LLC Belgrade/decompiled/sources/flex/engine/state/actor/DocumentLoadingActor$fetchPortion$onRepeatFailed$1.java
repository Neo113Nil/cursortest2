package flex.engine.state.actor;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.dyi0;
import defpackage.e3m;
import defpackage.jse;
import defpackage.kq90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1m;
import defpackage.oju0;
import defpackage.s0j0;
import defpackage.tbe0;
import defpackage.txl;
import defpackage.u1m;
import defpackage.uzl;
import defpackage.wbe0;
import defpackage.wls;
import defpackage.wzl;
import defpackage.xzl;
import defpackage.ywl;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls0j0;", "Lwzl;", "Lflex/engine/state/actor/RepeatableTaskOutput;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Ls0j0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.engine.state.actor.DocumentLoadingActor$fetchPortion$onRepeatFailed$1", f = "DocumentLoadingActor.kt", l = {225}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class DocumentLoadingActor$fetchPortion$onRepeatFailed$1 extends SuspendLambda implements wls {
    final /* synthetic */ wbe0 $params;
    final /* synthetic */ kq90 $patchParams;
    final /* synthetic */ u1m $query;
    final /* synthetic */ oju0 $store;
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentLoadingActor$fetchPortion$onRepeatFailed$1(u1m u1mVar, kq90 kq90Var, wbe0 wbe0Var, oju0 oju0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$store = oju0Var;
        this.$query = u1mVar;
        this.$params = wbe0Var;
        this.this$0 = aVar;
        this.$patchParams = kq90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        oju0 oju0Var = this.$store;
        DocumentLoadingActor$fetchPortion$onRepeatFailed$1 documentLoadingActor$fetchPortion$onRepeatFailed$1 = new DocumentLoadingActor$fetchPortion$onRepeatFailed$1(this.$query, this.$patchParams, this.$params, oju0Var, this.this$0, continuation);
        documentLoadingActor$fetchPortion$onRepeatFailed$1.L$0 = obj;
        return documentLoadingActor$fetchPortion$onRepeatFailed$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DocumentLoadingActor$fetchPortion$onRepeatFailed$1) create((s0j0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        oju0 oju0Var;
        Object b;
        u1m u1mVar;
        xzl xzlVar;
        s0j0 s0j0Var = (s0j0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            xzl b2 = ((e3m) this.$store.a).b();
            wzl wzlVar = (wzl) s0j0Var.a;
            if (wzlVar instanceof uzl) {
                uzl uzlVar = (uzl) wzlVar;
                this.$store.b(new tbe0(this.$query, this.$params, uzlVar.a));
                if (b2 != null) {
                    a aVar = this.this$0;
                    kq90 kq90Var = this.$patchParams;
                    u1m u1mVar2 = this.$query;
                    oju0Var = this.$store;
                    txl txlVar = aVar.a.b;
                    Throwable th = uzlVar.a;
                    ywl ywlVar = b2.a;
                    List list = aVar.x;
                    List singletonList = Collections.singletonList(kq90Var);
                    jse jseVar = aVar.w;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = u1mVar2;
                    this.L$4 = oju0Var;
                    this.L$5 = b2;
                    this.I$0 = 0;
                    this.label = 1;
                    b = flex.engine.state.actor.internal.a.b(u1mVar2, ywlVar, th, list, singletonList, jseVar, txlVar, this);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    u1mVar = u1mVar2;
                    xzlVar = b2;
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xzlVar = (xzl) this.L$5;
        oju0 oju0Var2 = (oju0) this.L$4;
        u1mVar = (u1m) this.L$3;
        b.b(obj);
        oju0Var = oju0Var2;
        b = obj;
        oju0Var.b(new o1m(new dyi0(xzl.a(xzlVar, (ywl) b), u1mVar)));
        return zy11.a;
    }
}
