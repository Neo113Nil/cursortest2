package ru.yandex.taxi.tariffs.model;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.srq0;
import defpackage.wls;
import defpackage.yw01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsrq0;", "Lpex0;", "Lzy11;", "<anonymous>", "(Lsrq0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.tariffs.model.TariffDescriptionExtensionsKt$optionsSequence$1", f = "TariffDescriptionExtensions.kt", l = {186, 187}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class TariffDescriptionExtensionsKt$optionsSequence$1 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ pex0 $this_optionsSequence;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffDescriptionExtensionsKt$optionsSequence$1(pex0 pex0Var, Continuation continuation) {
        super(2, continuation);
        this.$this_optionsSequence = pex0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TariffDescriptionExtensionsKt$optionsSequence$1 tariffDescriptionExtensionsKt$optionsSequence$1 = new TariffDescriptionExtensionsKt$optionsSequence$1(this.$this_optionsSequence, continuation);
        tariffDescriptionExtensionsKt$optionsSequence$1.L$0 = obj;
        return tariffDescriptionExtensionsKt$optionsSequence$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffDescriptionExtensionsKt$optionsSequence$1) create((srq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r0.d(new defpackage.xw01(r7), r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r0.a(r7, r6) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        srq0 srq0Var = (srq0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pex0 pex0Var = this.$this_optionsSequence;
            this.L$0 = srq0Var;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        yw01 d = this.$this_optionsSequence.t0.d();
        this.L$0 = null;
        this.label = 2;
        srq0Var.getClass();
    }
}
