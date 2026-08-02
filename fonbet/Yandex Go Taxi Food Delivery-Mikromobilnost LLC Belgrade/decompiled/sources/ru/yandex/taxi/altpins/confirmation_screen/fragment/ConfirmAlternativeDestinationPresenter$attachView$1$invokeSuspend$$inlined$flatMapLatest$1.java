package ru.yandex.taxi.altpins.confirmation_screen.fragment;

import com.yandex.go.address.models.Address;
import defpackage.f4e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.scc;
import defpackage.t2e;
import defpackage.tpr;
import defpackage.v2e;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.altpins.models.OptionType;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.confirmation_screen.fragment.ConfirmAlternativeDestinationPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1", f = "ConfirmAlternativeDestinationPresenter.kt", l = {215, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class ConfirmAlternativeDestinationPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ v2e $receiver$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmAlternativeDestinationPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, v2e v2eVar) {
        super(3, continuation);
        this.$receiver$inlined = v2eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ConfirmAlternativeDestinationPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1 confirmAlternativeDestinationPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1 = new ConfirmAlternativeDestinationPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1((Continuation) obj3, this.$receiver$inlined);
        confirmAlternativeDestinationPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        confirmAlternativeDestinationPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = obj2;
        return confirmAlternativeDestinationPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b2, code lost:
    
        if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r11, r0, r10) == r2) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Address address;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            OptionType optionType = (OptionType) obj2;
            v2e v2eVar = this.$receiver$inlined;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            v2eVar.getClass();
            rol0 rol0Var = new rol0(new ConfirmAlternativeDestinationPresenter$screenModelFlow$1(v2eVar, optionType, null));
            f4e f4eVar = v2eVar.x;
            int i2 = t2e.a[optionType.ordinal()];
            if (i2 == 1) {
                address = f4eVar.b;
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                address = f4eVar.c;
            }
            tpr rol0Var2 = new rol0(new ConfirmAlternativeDestinationPresenter$drivingRouteFlow$drivingFlow$1(v2eVar, scc.g(f4eVar.d.B(), address.B()), optionType, null));
            if (v2eVar.E.isEmpty()) {
                rol0Var2 = new n(rol0Var2, new ConfirmAlternativeDestinationPresenter$drivingRouteFlow$1(2, null));
            }
            m0 m0Var = new m0(rol0Var, rol0Var2, ConfirmAlternativeDestinationPresenter$updateStateFlow$2.a);
            if (m0Var != coroutineSingletons) {
                obj = m0Var;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vprVar = (vpr) this.L$2;
        b.b(obj);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
