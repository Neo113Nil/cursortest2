package ru.yandex.taxi.surge.interactor;

import defpackage.avw0;
import defpackage.bdc;
import defpackage.kow0;
import defpackage.low0;
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
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.yandex.taxi.common_models.ui.TextStyle;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lmy6;", "Llow0;", "<anonymous>", "(Ltse;)Lmy6;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.interactor.SurgePriceComplainStateInteractor$mapButtons$buttons$1$1$1", f = "SurgePriceComplainStateInteractor.kt", l = {JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, 183}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgePriceComplainStateInteractor$mapButtons$buttons$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ pye0 $button;
    final /* synthetic */ boolean $hasCommentOrSelection;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isShimmering;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgePriceComplainStateInteractor$mapButtons$buttons$1$1$1(pye0 pye0Var, r rVar, boolean z, boolean z2, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.$button = pye0Var;
        this.this$0 = rVar;
        this.$isEnabled = z;
        this.$hasCommentOrSelection = z2;
        this.$isShimmering = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgePriceComplainStateInteractor$mapButtons$buttons$1$1$1(this.$button, this.this$0, this.$isEnabled, this.$hasCommentOrSelection, this.$isShimmering, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgePriceComplainStateInteractor$mapButtons$buttons$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0038, code lost:
    
        if (r12 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (r12 == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = avw0.a[this.$button.c.ordinal()];
            if (i2 == 1) {
                r rVar = this.this$0;
                pye0 pye0Var = this.$button;
                this.label = 1;
                obj = r.a(rVar, pye0Var, this);
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                r rVar2 = this.this$0;
                pye0 pye0Var2 = this.$button;
                this.label = 2;
                obj = r.a(rVar2, pye0Var2, this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            CharSequence charSequence = (CharSequence) obj;
            low0 low0Var = this.$button.a;
            bdc bdcVar = new bdc(xng0.textOnControl);
            bdc bdcVar2 = new bdc(xng0.controlMain);
            TextStyle textStyle = TextStyle.ACCENT;
            boolean z = this.$isEnabled;
            if (z && (low0Var instanceof kow0)) {
                z = this.$hasCommentOrSelection;
            }
            return new my6(charSequence, bdcVar, bdcVar2, textStyle, low0Var, null, null, z, this.$isShimmering, 7076);
        }
        if (i != 2) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        CharSequence charSequence2 = (CharSequence) obj;
        low0 low0Var2 = this.$button.a;
        bdc bdcVar3 = new bdc(xng0.textOnControlMinor);
        bdc bdcVar4 = new bdc(xng0.controlMinor);
        TextStyle textStyle2 = TextStyle.DEFAULT;
        boolean z2 = this.$isEnabled;
        if (z2 && (low0Var2 instanceof kow0)) {
            z2 = this.$hasCommentOrSelection;
        }
        return new my6(charSequence2, bdcVar3, bdcVar4, textStyle2, low0Var2, null, null, z2, this.$isShimmering, 7076);
    }
}
