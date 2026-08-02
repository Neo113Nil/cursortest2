package ru.yandex.taxi.preorder.suggested;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.g92;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sw41;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lntj0;", "Lic61;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.suggested.ZeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1", f = "ZeroSuggestInteractorImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, 72}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ZeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $clarify;
    final /* synthetic */ tpr $reactiveFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1(i iVar, tpr tprVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$reactiveFlow = tprVar;
        this.$clarify = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ZeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1 zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1 = new ZeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1(this.this$0, this.$reactiveFlow, this.$clarify, continuation);
        zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1.L$0 = obj;
        return zeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r9, r0, r8) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r9 == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.address.search.perf.c cVar = this.this$0.j;
            this.L$0 = vprVar;
            this.label = 1;
            obj = cVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(((Boolean) obj).booleanValue() ? kotlinx.coroutines.flow.e.s(kotlinx.coroutines.flow.e.K(new f(new g92(2, this.this$0.d.c())), this.$reactiveFlow), new sw41(6)) : this.$reactiveFlow, new ZeroSuggestInteractorImpl$offerDestinationZeroSuggestBySourcePointChangeFlow$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0, this.$clarify));
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
