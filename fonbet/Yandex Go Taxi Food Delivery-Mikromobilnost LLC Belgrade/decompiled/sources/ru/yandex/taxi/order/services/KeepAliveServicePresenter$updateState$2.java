package ru.yandex.taxi.order.services;

import defpackage.dxq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rgx;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldxq0;", "foregroundState", "Lzy11;", "<anonymous>", "(Ldxq0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.services.KeepAliveServicePresenter$updateState$2", f = "KeepAliveServicePresenter.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL, HProv.PP_CONTAINER_DEFAULT}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class KeepAliveServicePresenter$updateState$2 extends SuspendLambda implements wls {
    final /* synthetic */ rgx $service;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeepAliveServicePresenter$updateState$2(d dVar, rgx rgxVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$service = rgxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        KeepAliveServicePresenter$updateState$2 keepAliveServicePresenter$updateState$2 = new KeepAliveServicePresenter$updateState$2(this.this$0, this.$service, continuation);
        keepAliveServicePresenter$updateState$2.L$0 = obj;
        return keepAliveServicePresenter$updateState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KeepAliveServicePresenter$updateState$2) create((dxq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (defpackage.bb1.l0(r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (ru.yandex.taxi.order.services.d.a(r7, r2, r0, r6) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        dxq0 dxq0Var = (dxq0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            rgx rgxVar = this.$service;
            this.L$0 = null;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
    }
}
