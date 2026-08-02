package app.cash.local.presenters.pos;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LocalPosCheckInPresenter$models$cameraPermissionDenial$2$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ int I$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocalPosCheckInPresenter$models$cameraPermissionDenial$2$1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        Number number = (Number) obj;
        switch (this.$r8$classId) {
            case 0:
                int intValue = number.intValue();
                LocalPosCheckInPresenter$models$cameraPermissionDenial$2$1 localPosCheckInPresenter$models$cameraPermissionDenial$2$1 = new LocalPosCheckInPresenter$models$cameraPermissionDenial$2$1(i, (Continuation) obj3, 0);
                localPosCheckInPresenter$models$cameraPermissionDenial$2$1.I$0 = intValue;
                return localPosCheckInPresenter$models$cameraPermissionDenial$2$1.invokeSuspend(Unit.INSTANCE);
            default:
                int intValue2 = number.intValue();
                LocalPosCheckInPresenter$models$cameraPermissionDenial$2$1 localPosCheckInPresenter$models$cameraPermissionDenial$2$12 = new LocalPosCheckInPresenter$models$cameraPermissionDenial$2$1(i, (Continuation) obj3, 1);
                localPosCheckInPresenter$models$cameraPermissionDenial$2$12.I$0 = intValue2;
                return localPosCheckInPresenter$models$cameraPermissionDenial$2$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.I$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
        }
        return new Integer(i2 + 1);
    }
}
