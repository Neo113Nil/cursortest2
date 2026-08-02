package ru.yandex.taxi.altpins.source.modal;

import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.taxi.order.api.change.source.interactor.SourcePointChangeReason;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.jl40;
import defpackage.jx1;
import defpackage.kx1;
import defpackage.lx1;
import defpackage.mvg;
import defpackage.mx1;
import defpackage.ny61;
import defpackage.tg9;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xx1;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.source.modal.AlternativeSourceModalViewPresenter$handleAction$1", f = "AlternativeSourceModalViewPresenter.kt", l = {67, 70, CalendarDayView.DISABLED_DAY_ALPHA, HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class AlternativeSourceModalViewPresenter$handleAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ mx1 $action;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlternativeSourceModalViewPresenter$handleAction$1(mx1 mx1Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$action = mx1Var;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AlternativeSourceModalViewPresenter$handleAction$1(this.$action, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AlternativeSourceModalViewPresenter$handleAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (((com.yandex.go.taxi.order.change.source.interactor.j) r1).a(r8, r9, r10, r11, r12) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (r3 == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AlternativeSourceModalViewPresenter$handleAction$1 alternativeSourceModalViewPresenter$handleAction$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            mx1 mx1Var = this.$action;
            if (!(mx1Var instanceof jx1)) {
                if (jl40.l(mx1Var, kx1.a)) {
                    d dVar = this.this$0;
                    this.label = 4;
                    if (d.Kg(dVar, this) == coroutineSingletons) {
                    }
                } else if (!jl40.l(mx1Var, lx1.a)) {
                    w511.b();
                    return null;
                }
            }
            r0 r0Var = this.this$0.F;
            Boolean bool = Boolean.TRUE;
            this.label = 1;
            r0Var.emit(bool, this);
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                alternativeSourceModalViewPresenter$handleAction$1 = this;
                d dVar2 = alternativeSourceModalViewPresenter$handleAction$1.this$0;
                alternativeSourceModalViewPresenter$handleAction$1.label = 3;
                return d.Kg(dVar2, alternativeSourceModalViewPresenter$handleAction$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            if (i == 3) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i == 4) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((com.yandex.go.clarify_address.a) this.this$0.C).c(true, AddressClarificationReason.Map);
        d dVar3 = this.this$0;
        tg9 tg9Var = dVar3.D;
        String str = dVar3.G;
        xx1 xx1Var = dVar3.z;
        String str2 = xx1Var.a;
        zzs zzsVar = xx1Var.c;
        SourcePointChangeReason sourcePointChangeReason = SourcePointChangeReason.ALTPIN_SUGGEST;
        this.label = 2;
        alternativeSourceModalViewPresenter$handleAction$1 = this;
    }
}
