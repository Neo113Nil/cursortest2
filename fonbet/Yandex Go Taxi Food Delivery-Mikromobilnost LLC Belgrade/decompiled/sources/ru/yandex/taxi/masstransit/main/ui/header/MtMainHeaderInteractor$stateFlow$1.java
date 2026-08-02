package ru.yandex.taxi.masstransit.main.ui.header;

import com.yandex.go.address.models.ZoneAddress;
import defpackage.bms;
import defpackage.bvf0;
import defpackage.d6z;
import defpackage.k110;
import defpackage.km30;
import defpackage.l9u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.uu30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lk110;", "exp", "Luu30;", "addr", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lkm30;", "<anonymous>", "(Lk110;Luu30;Lru/yandex/taxi/theme/ThemeType;)Lkm30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.main.ui.header.MtMainHeaderInteractor$stateFlow$1", f = "MtMainHeaderInteractor.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtMainHeaderInteractor$stateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtMainHeaderInteractor$stateFlow$1(a aVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        MtMainHeaderInteractor$stateFlow$1 mtMainHeaderInteractor$stateFlow$1 = new MtMainHeaderInteractor$stateFlow$1(this.this$0, (Continuation) obj4);
        mtMainHeaderInteractor$stateFlow$1.L$0 = (k110) obj;
        mtMainHeaderInteractor$stateFlow$1.L$1 = (uu30) obj2;
        return mtMainHeaderInteractor$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        k110 k110Var = (k110) this.L$0;
        uu30 uu30Var = (uu30) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        aVar.getClass();
        l9u l9uVar = k110Var != null ? k110Var.m : null;
        ZoneAddress zoneAddress = uu30Var.a;
        Object n = (l9uVar == null || !l9uVar.a) ? km30.e : bvf0.n(new MtMainHeaderInteractor$mapUiState$2(l9uVar.b, d6z.Y(k110Var, k110Var.m.c), q5z.F(zoneAddress != null ? zoneAddress.a : null), aVar, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
