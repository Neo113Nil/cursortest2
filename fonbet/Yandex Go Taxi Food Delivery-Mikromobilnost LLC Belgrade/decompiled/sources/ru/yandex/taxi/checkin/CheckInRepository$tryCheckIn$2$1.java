package ru.yandex.taxi.checkin;

import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xfb;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.yandex.taxi.checkin.api.CheckInApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.checkin.CheckInRepository$tryCheckIn$2$1", f = "CheckInRepository.kt", l = {JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CheckInRepository$tryCheckIn$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    final /* synthetic */ String $pickupLineId;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckInRepository$tryCheckIn$2$1(d dVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$orderId = str;
        this.$pickupLineId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckInRepository$tryCheckIn$2$1(this.this$0, this.$orderId, this.$pickupLineId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckInRepository$tryCheckIn$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            CheckInApi checkInApi = (CheckInApi) this.this$0.d.getValue();
            String str = this.$orderId;
            String str2 = this.$pickupLineId;
            if (str2 == null) {
                str2 = "";
            }
            cmt<zy11> a = checkInApi.a(new xfb(str, str2));
            this.label = 1;
            if (ru.yandex.taxi.network.api.a.a(a, null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
