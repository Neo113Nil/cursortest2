package ru.yandex.taxi.surge.interactor;

import defpackage.bdc;
import defpackage.mpw0;
import defpackage.mvg;
import defpackage.my6;
import defpackage.ny61;
import defpackage.pye0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.ui.TextStyle;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lmy6;", "Llow0;", "<anonymous>", "(Ltse;)Lmy6;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.interactor.SurgeFeedbackSentStateInteractor$mapButtons$buttons$1$1$1", f = "SurgeFeedbackSentStateInteractor.kt", l = {59, 69}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeFeedbackSentStateInteractor$mapButtons$buttons$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ pye0 $button;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeFeedbackSentStateInteractor$mapButtons$buttons$1$1$1(pye0 pye0Var, p pVar, Continuation continuation) {
        super(2, continuation);
        this.$button = pye0Var;
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgeFeedbackSentStateInteractor$mapButtons$buttons$1$1$1(this.$button, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeFeedbackSentStateInteractor$mapButtons$buttons$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r12 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r12 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return new my6((CharSequence) obj, new bdc(xng0.textOnControl), new bdc(xng0.controlMain), TextStyle.ACCENT, this.$button.a, null, null, false, false, 16292);
            }
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return new my6((CharSequence) obj, new bdc(xng0.textOnControlMinor), new bdc(xng0.controlMinor), TextStyle.DEFAULT, this.$button.a, null, null, false, false, 16292);
        }
        kotlin.b.b(obj);
        int i2 = mpw0.a[this.$button.c.ordinal()];
        if (i2 == 1) {
            p pVar = this.this$0;
            pye0 pye0Var = this.$button;
            this.label = 1;
            obj = p.a(pVar, pye0Var, this);
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            p pVar2 = this.this$0;
            pye0 pye0Var2 = this.$button;
            this.label = 2;
            obj = p.a(pVar2, pye0Var2, this);
        }
        return coroutineSingletons;
    }
}
