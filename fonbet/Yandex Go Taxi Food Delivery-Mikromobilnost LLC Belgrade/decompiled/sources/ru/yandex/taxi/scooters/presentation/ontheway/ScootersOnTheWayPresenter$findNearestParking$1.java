package ru.yandex.taxi.scooters.presentation.ontheway;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import defpackage.a5o0;
import defpackage.b5o0;
import defpackage.byx;
import defpackage.c430;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.r7p0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zuo0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.json.JsonNull;
import ru.yandex.taxi.scooters.data.ScootersParkingSelectionMode;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.ScootersOnTheWayPresenter$findNearestParking$1", f = "ScootersOnTheWayPresenter.kt", l = {506}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersOnTheWayPresenter$findNearestParking$1 extends SuspendLambda implements wls {
    final /* synthetic */ zuo0 $scootersSessionState;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOnTheWayPresenter$findNearestParking$1(f fVar, zuo0 zuo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$scootersSessionState = zuo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersOnTheWayPresenter$findNearestParking$1(this.this$0, this.$scootersSessionState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersOnTheWayPresenter$findNearestParking$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String sessionId;
        b5o0 b5o0Var;
        r7p0 r7p0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b5o0 b5o0Var2 = this.this$0.J;
            sessionId = this.$scootersSessionState.getSessionId();
            r7p0 number = this.$scootersSessionState.getNumber();
            po21 po21Var = this.this$0.z;
            this.L$0 = b5o0Var2;
            this.L$1 = sessionId;
            this.L$2 = number;
            this.label = 1;
            Object h = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(this);
            if (h == coroutineSingletons) {
                return coroutineSingletons;
            }
            b5o0Var = b5o0Var2;
            obj = h;
            r7p0Var = number;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7p0 r7p0Var2 = (r7p0) this.L$2;
            sessionId = (String) this.L$1;
            b5o0 b5o0Var3 = (b5o0) this.L$0;
            kotlin.b.b(obj);
            r7p0Var = r7p0Var2;
            b5o0Var = b5o0Var3;
        }
        String str = sessionId;
        zzs a = ((mo21) obj).a();
        ScootersParkingSelectionMode scootersParkingSelectionMode = ScootersParkingSelectionMode.FINISH_RIDE_NEAREST;
        b5o0Var.getClass();
        this.this$0.D.b(new byx(Screen.TOTW, new c430(Mode.SCOOTERS, (kotlinx.serialization.json.b) null, new a5o0(str, r7p0Var, a, b5o0Var, scootersParkingSelectionMode, false, JsonNull.INSTANCE))));
        return zy11.a;
    }
}
