package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.rover;

import defpackage.hjh;
import defpackage.jw40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qej;
import defpackage.rzh0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xgl0;
import defpackage.ygl0;
import defpackage.yuj0;
import defpackage.zgl0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.rover.RoverStateHolder$submitRoverAction$1", f = "RoverStateHolder.kt", l = {HProv.PP_REBOOT}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class RoverStateHolder$submitRoverAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $action;
    final /* synthetic */ Object $payload;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoverStateHolder$submitRoverAction$1(d dVar, Object obj, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$payload = obj;
        this.$action = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoverStateHolder$submitRoverAction$1(this.this$0, this.$payload, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoverStateHolder$submitRoverAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            ru.yandex.taxi.logistics.sdk.tracking.impl.rover.a aVar = dVar.c;
            String str = dVar.a;
            Object obj2 = this.$payload;
            String str2 = this.$action;
            this.label = 1;
            obj = aVar.a(obj2, str, str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        zgl0 zgl0Var = (zgl0) obj;
        hjh hjhVar = this.this$0.d;
        hjhVar.getClass();
        com.yandex.delivery.utils.dialogmanager.impl.b bVar = hjhVar.b;
        if (zgl0Var instanceof xgl0) {
            jw40 jw40Var = ((xgl0) zgl0Var).a;
            if (jw40Var != null) {
                bVar.b(new qej(jw40Var.a, jw40Var.b, jw40Var.c.a, null, null, false, jw40Var.f, null, 184));
            } else {
                yuj0 yuj0Var = hjhVar.a;
                bVar.b(new qej(yuj0Var.a(rzh0.logistics_unknown_error, new Object[0]), null, yuj0Var.a(rzh0.logistics_ok_button, new Object[0]), null, null, false, null, null, 184));
            }
        } else if (!(zgl0Var instanceof ygl0)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
