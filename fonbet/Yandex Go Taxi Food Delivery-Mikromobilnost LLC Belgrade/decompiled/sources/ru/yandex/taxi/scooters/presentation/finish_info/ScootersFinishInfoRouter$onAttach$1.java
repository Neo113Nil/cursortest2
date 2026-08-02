package ru.yandex.taxi.scooters.presentation.finish_info;

import defpackage.cnn0;
import defpackage.hwo0;
import defpackage.iqm0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p1j0;
import defpackage.tse;
import defpackage.uso0;
import defpackage.wls;
import defpackage.xpm0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.data.z;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoRouter$onAttach$1", f = "ScootersFinishInfoRouter.kt", l = {102, 103}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersFinishInfoRouter$onAttach$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoRouter$onAttach$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersFinishInfoRouter$onAttach$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoRouter$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (com.yandex.go.navigation.base.a.a(r0, (defpackage.m950) r0.L.get(), new defpackage.lzn0(new defpackage.hzn0(com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuActionDialogOpenReason.FINISH_SCREEN)), new defpackage.u6n0(2), r4, r17) == r6) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        uso0 uso0Var;
        hwo0 hwo0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        p1j0 p1j0Var = p1j0.a;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        e eVar2 = this.this$0;
        this.label = 2;
        z zVar = eVar2.J.a;
        boolean z = zVar.c;
        zVar.c = false;
        return ((z && (uso0Var = zVar.b) != null && (hwo0Var = uso0Var.b) != null) ? com.yandex.go.navigation.base.a.a(eVar2, (m950) eVar2.T.get(), new iqm0(null, (String) hwo0Var.b, (FormattedText) hwo0Var.c, (FormattedText) hwo0Var.w, new xpm0((FormattedText) hwo0Var.x, null), null, 169), new cnn0(), p1j0Var, this) : zy11Var) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
