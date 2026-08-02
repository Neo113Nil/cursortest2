package ru.yandex.taxi.logistics.sdk.tracking.domain.impl;

import defpackage.cc7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.vng;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.domain.impl.UpdateEmitter$updateFlow$1", f = "UpdateEmitter.kt", l = {48, 49, 50}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class UpdateEmitter$updateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $deliveryId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateEmitter$updateFlow$1(h hVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$deliveryId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpdateEmitter$updateFlow$1 updateEmitter$updateFlow$1 = new UpdateEmitter$updateFlow$1(this.this$0, this.$deliveryId, continuation);
        updateEmitter$updateFlow$1.L$0 = obj;
        return updateEmitter$updateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateEmitter$updateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
    
        if (kotlinx.coroutines.flow.e.y(r13, r12) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        if (ru.yandex.taxi.logistics.sdk.ui.a.a(r13, r12) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        if (r0.emit(r4, r12) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0082 -> B:7:0x0085). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            if (kotlinx.coroutines.a.p(get_context())) {
            }
        } else if (i == 1) {
            kotlin.b.b(obj);
            AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl = this.this$0.a;
            this.L$0 = vprVar;
            this.label = 2;
        } else if (i == 2) {
            kotlin.b.b(obj);
            this.L$0 = vprVar;
            this.label = 3;
        } else {
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.this$0.c = vng.I();
            if (kotlinx.coroutines.a.p(get_context())) {
                return zy11Var;
            }
            h hVar = this.this$0;
            hVar.getClass();
            rol0 rol0Var = new rol0(new UpdateEmitter$delayFlow$1(hVar, null));
            h hVar2 = this.this$0;
            kotlinx.coroutines.flow.internal.h K = kotlinx.coroutines.flow.e.K(rol0Var, hVar2.d, new cc7(hVar2.e, this.$deliveryId, 14));
            this.L$0 = vprVar;
            this.label = 1;
        }
    }
}
