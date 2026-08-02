package ru.yandex.taxi.preorder.interactor;

import com.yandex.go.address.models.ZoneAddress;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.interactor.MakeAccurateSourcePointInteractor$updateAddressWhenOpenSummary$1", f = "MakeAccurateSourcePointInteractor.kt", l = {HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MakeAccurateSourcePointInteractor$updateAddressWhenOpenSummary$1 extends SuspendLambda implements tls {
    final /* synthetic */ ZoneAddress $originalAddress;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MakeAccurateSourcePointInteractor$updateAddressWhenOpenSummary$1(g gVar, ZoneAddress zoneAddress, Continuation continuation) {
        super(1, continuation);
        this.this$0 = gVar;
        this.$originalAddress = zoneAddress;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MakeAccurateSourcePointInteractor$updateAddressWhenOpenSummary$1(this.this$0, this.$originalAddress, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MakeAccurateSourcePointInteractor$updateAddressWhenOpenSummary$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0;
            ZoneAddress zoneAddress = this.$originalAddress;
            this.label = 1;
            obj = g.a(gVar, zoneAddress, this);
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
        ZoneAddress zoneAddress2 = (ZoneAddress) obj;
        if (zoneAddress2 != null) {
            this.this$0.g.m(zoneAddress2, null);
        }
        return zy11.a;
    }
}
