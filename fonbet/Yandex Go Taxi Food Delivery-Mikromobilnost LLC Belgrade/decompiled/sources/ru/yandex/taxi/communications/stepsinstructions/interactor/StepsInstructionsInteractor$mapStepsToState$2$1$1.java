package ru.yandex.taxi.communications.stepsinstructions.interactor;

import android.graphics.drawable.BitmapDrawable;
import defpackage.mau0;
import defpackage.mvg;
import defpackage.nau0;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.scc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.stepsinstructions.model.LoadingState;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lnau0;", "<anonymous>", "(Ltse;)Lnau0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.stepsinstructions.interactor.StepsInstructionsInteractor$mapStepsToState$2$1$1", f = "StepsInstructionsInteractor.kt", l = {106, 108}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class StepsInstructionsInteractor$mapStepsToState$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $index;
    final /* synthetic */ mau0 $step;
    final /* synthetic */ List<mau0> $steps;
    final /* synthetic */ ThemeType $themeType;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepsInstructionsInteractor$mapStepsToState$2$1$1(mau0 mau0Var, c cVar, ThemeType themeType, int i, List list, Continuation continuation) {
        super(2, continuation);
        this.$step = mau0Var;
        this.this$0 = cVar;
        this.$themeType = themeType;
        this.$index = i;
        this.$steps = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StepsInstructionsInteractor$mapStepsToState$2$1$1(this.$step, this.this$0, this.$themeType, this.$index, this.$steps, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StepsInstructionsInteractor$mapStepsToState$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r13 == r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        BitmapDrawable bitmapDrawable;
        Object f;
        BitmapDrawable bitmapDrawable2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            str = this.$step.c;
            if (str == null) {
                bitmapDrawable = null;
                e eVar = this.this$0.a;
                String str2 = this.$step.d;
                this.L$0 = str;
                this.L$1 = bitmapDrawable;
                this.label = 2;
                f = e.f(eVar, str2, null, this, 6);
                if (f != coroutineSingletons) {
                    bitmapDrawable2 = bitmapDrawable;
                    obj = f;
                    BitmapDrawable bitmapDrawable3 = (BitmapDrawable) obj;
                    mau0 mau0Var = this.$step;
                    return new nau0(mau0Var.a, mau0Var.b, pkf.g(bitmapDrawable3, this.$step.d, this.$themeType), str != null ? pkf.g(bitmapDrawable2, str, null) : null, LoadingState.READY, this.$index == scc.f(this.$steps));
                }
                return coroutineSingletons;
            }
            e eVar2 = this.this$0.a;
            this.L$0 = str;
            this.L$1 = null;
            this.label = 1;
            obj = e.k(eVar2, str, null, this, 14);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bitmapDrawable2 = (BitmapDrawable) this.L$1;
                str = (String) this.L$0;
                kotlin.b.b(obj);
                BitmapDrawable bitmapDrawable32 = (BitmapDrawable) obj;
                mau0 mau0Var2 = this.$step;
                return new nau0(mau0Var2.a, mau0Var2.b, pkf.g(bitmapDrawable32, this.$step.d, this.$themeType), str != null ? pkf.g(bitmapDrawable2, str, null) : null, LoadingState.READY, this.$index == scc.f(this.$steps));
            }
            str = (String) this.L$0;
            kotlin.b.b(obj);
        }
        bitmapDrawable = (BitmapDrawable) obj;
        e eVar3 = this.this$0.a;
        String str22 = this.$step.d;
        this.L$0 = str;
        this.L$1 = bitmapDrawable;
        this.label = 2;
        f = e.f(eVar3, str22, null, this, 6);
        if (f != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
