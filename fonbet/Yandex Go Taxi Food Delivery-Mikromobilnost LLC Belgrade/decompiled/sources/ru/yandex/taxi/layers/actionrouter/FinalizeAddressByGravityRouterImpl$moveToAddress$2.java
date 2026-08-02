package ru.yandex.taxi.layers.actionrouter;

import defpackage.dvw;
import defpackage.gh00;
import defpackage.h7r;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.actionrouter.FinalizeAddressByGravityRouterImpl$moveToAddress$2", f = "FinalizeAddressByGravityRouterImpl.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FinalizeAddressByGravityRouterImpl$moveToAddress$2 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $position;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinalizeAddressByGravityRouterImpl$moveToAddress$2(a aVar, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$position = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FinalizeAddressByGravityRouterImpl$moveToAddress$2(this.this$0, this.$position, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FinalizeAddressByGravityRouterImpl$moveToAddress$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            zzs zzsVar = this.$position;
            this.L$0 = aVar;
            this.L$1 = zzsVar;
            this.label = 1;
            j18 j18Var = new j18(1, dvw.b(this));
            j18Var.u();
            ((gh00) aVar.a).E(ru.yandex.taxi.map.utils.a.F(zzsVar), 300.0f, new h7r(aVar, j18Var));
            if (j18Var.s() == coroutineSingletons) {
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
