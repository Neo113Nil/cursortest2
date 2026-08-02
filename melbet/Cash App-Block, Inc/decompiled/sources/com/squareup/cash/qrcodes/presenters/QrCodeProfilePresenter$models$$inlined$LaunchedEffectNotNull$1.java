package com.squareup.cash.qrcodes.presenters;

import com.squareup.cash.profile.screens.ProfileScreens;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class QrCodeProfilePresenter$models$$inlined$LaunchedEffectNotNull$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $t1;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ QrCodeProfilePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QrCodeProfilePresenter$models$$inlined$LaunchedEffectNotNull$1(Object obj, Continuation continuation, QrCodeProfilePresenter qrCodeProfilePresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$t1 = obj;
        this.this$0 = qrCodeProfilePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        QrCodeProfilePresenter qrCodeProfilePresenter = this.this$0;
        Object obj2 = this.$t1;
        switch (i) {
            case 0:
                QrCodeProfilePresenter$models$$inlined$LaunchedEffectNotNull$1 qrCodeProfilePresenter$models$$inlined$LaunchedEffectNotNull$1 = new QrCodeProfilePresenter$models$$inlined$LaunchedEffectNotNull$1(obj2, continuation, qrCodeProfilePresenter, 0);
                qrCodeProfilePresenter$models$$inlined$LaunchedEffectNotNull$1.L$0 = obj;
                return qrCodeProfilePresenter$models$$inlined$LaunchedEffectNotNull$1;
            default:
                QrCodeProfilePresenter$models$$inlined$LaunchedEffectNotNull$1 qrCodeProfilePresenter$models$$inlined$LaunchedEffectNotNull$12 = new QrCodeProfilePresenter$models$$inlined$LaunchedEffectNotNull$1(obj2, continuation, qrCodeProfilePresenter, 1);
                qrCodeProfilePresenter$models$$inlined$LaunchedEffectNotNull$12.L$0 = obj;
                return qrCodeProfilePresenter$models$$inlined$LaunchedEffectNotNull$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((QrCodeProfilePresenter$models$$inlined$LaunchedEffectNotNull$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        QrCodeProfilePresenter qrCodeProfilePresenter = this.this$0;
        Object obj2 = this.$t1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                qrCodeProfilePresenter.navigator.goTo(new ProfileScreens.ErrorScreen((String) obj2, null, 14));
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                qrCodeProfilePresenter.navigator.goTo(new ProfileScreens.ErrorScreen((String) obj2, null, 14));
                break;
        }
        return Unit.INSTANCE;
    }
}
