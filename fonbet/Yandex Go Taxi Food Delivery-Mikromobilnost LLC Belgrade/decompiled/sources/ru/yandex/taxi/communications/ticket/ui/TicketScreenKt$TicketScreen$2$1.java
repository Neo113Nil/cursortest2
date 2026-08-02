package ru.yandex.taxi.communications.ticket.ui;

import com.yandex.go.design.compose.haptic.HapticEffect;
import defpackage.fgd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x3z0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.api.dto.ticket.TicketOnShowFeature;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.ticket.ui.TicketScreenKt$TicketScreen$2$1", f = "TicketScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TicketScreenKt$TicketScreen$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ fgd $haptic;
    final /* synthetic */ x3z0 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketScreenKt$TicketScreen$2$1(x3z0 x3z0Var, fgd fgdVar, Continuation continuation) {
        super(2, continuation);
        this.$state = x3z0Var;
        this.$haptic = fgdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketScreenKt$TicketScreen$2$1(this.$state, this.$haptic, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TicketScreenKt$TicketScreen$2$1 ticketScreenKt$TicketScreen$2$1 = (TicketScreenKt$TicketScreen$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        ticketScreenKt$TicketScreen$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (this.$state.h.contains(new TicketOnShowFeature(TicketOnShowFeature.TicketOnShowFeatureType.VIBRATION))) {
            this.$haptic.a(HapticEffect.PromoAppear);
        }
        return zy11.a;
    }
}
