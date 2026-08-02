package flex.engine.state.actor;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.i3y;
import defpackage.me7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oju0;
import defpackage.r0m;
import defpackage.s0j0;
import defpackage.s7s0;
import defpackage.t0m;
import defpackage.tjr;
import defpackage.txl;
import defpackage.tzl;
import defpackage.u1m;
import defpackage.unr0;
import defpackage.uzl;
import defpackage.vzl;
import defpackage.w511;
import defpackage.wls;
import defpackage.wzl;
import defpackage.x0m;
import defpackage.xzl;
import defpackage.zjr;
import defpackage.zy11;
import flex.logger.FlexLogLevel;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls0j0;", "Lwzl;", "Lflex/engine/state/actor/RepeatableTaskOutput;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Ls0j0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.engine.state.actor.DocumentLoadingActor$fetchDocument$onDocumentFetchSuccess$1", f = "DocumentLoadingActor.kt", l = {300, 306, 306}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class DocumentLoadingActor$fetchDocument$onDocumentFetchSuccess$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $modifyFetchOutput;
    final /* synthetic */ u1m $query;
    final /* synthetic */ boolean $retriedAfterError;
    final /* synthetic */ oju0 $store;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentLoadingActor$fetchDocument$onDocumentFetchSuccess$1(a aVar, u1m u1mVar, boolean z, oju0 oju0Var, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$query = u1mVar;
        this.$retriedAfterError = z;
        this.$store = oju0Var;
        this.$modifyFetchOutput = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DocumentLoadingActor$fetchDocument$onDocumentFetchSuccess$1 documentLoadingActor$fetchDocument$onDocumentFetchSuccess$1 = new DocumentLoadingActor$fetchDocument$onDocumentFetchSuccess$1(this.this$0, this.$query, this.$retriedAfterError, this.$store, this.$modifyFetchOutput, continuation);
        documentLoadingActor$fetchDocument$onDocumentFetchSuccess$1.L$0 = obj;
        return documentLoadingActor$fetchDocument$onDocumentFetchSuccess$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DocumentLoadingActor$fetchDocument$onDocumentFetchSuccess$1) create((s0j0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
    
        if (r0 == r7) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0144  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wzl wzlVar;
        oju0 oju0Var;
        Object invoke;
        u1m u1mVar;
        oju0 oju0Var2;
        u1m u1mVar2;
        Object invoke2;
        StackTraceElement stackTraceElement;
        String str;
        Object c;
        oju0 oju0Var3;
        s0j0 s0j0Var = (s0j0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                u1m u1mVar3 = (u1m) this.L$3;
                oju0Var2 = (oju0) this.L$2;
                b.b(obj);
                u1mVar2 = u1mVar3;
                invoke2 = obj;
                oju0Var2.b(new x0m((xzl) invoke2, u1mVar2));
                return zy11.a;
            }
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u1m u1mVar4 = (u1m) this.L$3;
                oju0Var3 = (oju0) this.L$2;
                b.b(obj);
                u1mVar = u1mVar4;
                c = obj;
                oju0Var3.b(new x0m((xzl) c, u1mVar));
                return zy11.a;
            }
            u1m u1mVar5 = (u1m) this.L$3;
            oju0Var = (oju0) this.L$2;
            wzl wzlVar2 = (wzl) this.L$1;
            b.b(obj);
            u1mVar = u1mVar5;
            wzlVar = wzlVar2;
            invoke = obj;
            oju0 oju0Var4 = oju0Var;
            String str2 = this.$query.a;
            a aVar = this.this$0;
            List list = aVar.x;
            me7 me7Var = aVar.z;
            List a = ((vzl) wzlVar).a();
            txl txlVar = this.this$0.a.b;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = oju0Var4;
            this.L$3 = u1mVar;
            this.label = 3;
            c = flex.engine.state.actor.internal.a.c((xzl) invoke, str2, list, me7Var, a, txlVar, this);
            if (c != coroutineSingletons) {
                oju0Var3 = oju0Var4;
                oju0Var3.b(new x0m((xzl) c, u1mVar));
                return zy11.a;
            }
            return coroutineSingletons;
        }
        b.b(obj);
        this.this$0.h(this.$query, s0j0Var, this.$retriedAfterError);
        zjr zjrVar = this.this$0.E;
        i3y a2 = kotlin.a.a(r0m.a);
        s7s0 s7s0Var = zjrVar.c.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        tjr tjrVar = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            Integer num = new Integer(stackTraceElement.getLineNumber());
            if (num.intValue() <= 0) {
                num = null;
            }
            if (num == null || (str = num.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str);
        }
        zjrVar.d(FlexLogLevel.DEBUG, "Document successfully obtained by loading actor", a2, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
        wzlVar = (wzl) s0j0Var.a;
        if (wzlVar instanceof xzl) {
            oju0Var2 = this.$store;
            u1mVar2 = this.$query;
            wls wlsVar = this.$modifyFetchOutput;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = oju0Var2;
            this.L$3 = u1mVar2;
            this.label = 1;
            invoke2 = wlsVar.invoke(wzlVar, this);
        } else {
            if (!(wzlVar instanceof vzl)) {
                if (wzlVar instanceof tzl) {
                    this.$store.b(new t0m(this.$query, ((tzl) wzlVar).a()));
                } else if (!(wzlVar instanceof uzl)) {
                    w511.b();
                    return null;
                }
                return zy11.a;
            }
            oju0Var = this.$store;
            u1m u1mVar6 = this.$query;
            wls wlsVar2 = this.$modifyFetchOutput;
            xzl b = ((vzl) wzlVar).b();
            this.L$0 = null;
            this.L$1 = wzlVar;
            this.L$2 = oju0Var;
            this.L$3 = u1mVar6;
            this.label = 2;
            invoke = wlsVar2.invoke(b, this);
            if (invoke != coroutineSingletons) {
                u1mVar = u1mVar6;
                oju0 oju0Var42 = oju0Var;
                String str22 = this.$query.a;
                a aVar2 = this.this$0;
                List list2 = aVar2.x;
                me7 me7Var2 = aVar2.z;
                List a3 = ((vzl) wzlVar).a();
                txl txlVar2 = this.this$0.a.b;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = oju0Var42;
                this.L$3 = u1mVar;
                this.label = 3;
                c = flex.engine.state.actor.internal.a.c((xzl) invoke, str22, list2, me7Var2, a3, txlVar2, this);
                if (c != coroutineSingletons) {
                }
            }
        }
        return coroutineSingletons;
    }
}
