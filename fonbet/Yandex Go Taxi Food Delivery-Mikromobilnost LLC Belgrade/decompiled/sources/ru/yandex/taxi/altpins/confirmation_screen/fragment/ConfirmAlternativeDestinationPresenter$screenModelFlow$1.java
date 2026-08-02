package ru.yandex.taxi.altpins.confirmation_screen.fragment;

import defpackage.f4e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.v2e;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.altpins.models.OptionType;
import ru.yandex.taxi.altpins.models.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru/yandex/taxi/altpins/models/b;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.confirmation_screen.fragment.ConfirmAlternativeDestinationPresenter$screenModelFlow$1", f = "ConfirmAlternativeDestinationPresenter.kt", l = {109, 110}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ConfirmAlternativeDestinationPresenter$screenModelFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ OptionType $type;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ v2e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmAlternativeDestinationPresenter$screenModelFlow$1(v2e v2eVar, OptionType optionType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = v2eVar;
        this.$type = optionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ConfirmAlternativeDestinationPresenter$screenModelFlow$1 confirmAlternativeDestinationPresenter$screenModelFlow$1 = new ConfirmAlternativeDestinationPresenter$screenModelFlow$1(this.this$0, this.$type, continuation);
        confirmAlternativeDestinationPresenter$screenModelFlow$1.L$0 = obj;
        return confirmAlternativeDestinationPresenter$screenModelFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmAlternativeDestinationPresenter$screenModelFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r0.emit((ru.yandex.taxi.altpins.models.b) r8, r7) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r8 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            v2e v2eVar = this.this$0;
            a aVar = v2eVar.y;
            f4e f4eVar = v2eVar.x;
            OptionType optionType = this.$type;
            this.L$0 = vprVar;
            this.label = 1;
            obj = aVar.g(f4eVar, optionType, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
