package ru.yandex.taxi.cashback.sdk;

import defpackage.hkd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "zoneName", "Lzzs;", "pinPosition", "Lhkd0;", "<anonymous>", "(Ljava/lang/String;Lzzs;)Lhkd0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.cashback.sdk.PlusSdkDataRepository$preorderAddressFlow$3", f = "PlusSdkDataRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PlusSdkDataRepository$preorderAddressFlow$3 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlusSdkDataRepository$preorderAddressFlow$3 plusSdkDataRepository$preorderAddressFlow$3 = new PlusSdkDataRepository$preorderAddressFlow$3(3, (Continuation) obj3);
        plusSdkDataRepository$preorderAddressFlow$3.L$0 = (String) obj;
        plusSdkDataRepository$preorderAddressFlow$3.L$1 = (zzs) obj2;
        return plusSdkDataRepository$preorderAddressFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        zzs zzsVar = (zzs) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new hkd0(zzsVar, str);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
