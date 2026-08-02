package ru.yandex.taxi.vendor_api.impl.implementations;

import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8x;
import defpackage.tse;
import defpackage.w631;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.vendor_api.impl.implementations.VendorApiGlobalInitializerImpl$onAppConfiguration$1", f = "VendorApiGlobalInitializerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class VendorApiGlobalInitializerImpl$onAppConfiguration$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VendorApiGlobalInitializerImpl$onAppConfiguration$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VendorApiGlobalInitializerImpl$onAppConfiguration$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        VendorApiGlobalInitializerImpl$onAppConfiguration$1 vendorApiGlobalInitializerImpl$onAppConfiguration$1 = (VendorApiGlobalInitializerImpl$onAppConfiguration$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        vendorApiGlobalInitializerImpl$onAppConfiguration$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.google.firebase.a.i(this.this$0.a);
        FirebaseAnalytics.getInstance(this.this$0.a);
        s8x s8xVar = w631.a;
        zy11 zy11Var = zy11.a;
        s8xVar.T(zy11Var);
        return zy11Var;
    }
}
