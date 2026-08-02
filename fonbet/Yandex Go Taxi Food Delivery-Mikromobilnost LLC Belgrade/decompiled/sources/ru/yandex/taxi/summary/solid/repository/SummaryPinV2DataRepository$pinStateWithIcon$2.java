package ru.yandex.taxi.summary.solid.repository;

import android.graphics.drawable.BitmapDrawable;
import defpackage.b0c0;
import defpackage.c0c0;
import defpackage.lub0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lf0c0;", "<anonymous>", "(Ltse;)Lf0c0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.repository.SummaryPinV2DataRepository$pinStateWithIcon$2", f = "SummaryPinV2DataRepository.kt", l = {139}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryPinV2DataRepository$pinStateWithIcon$2 extends SuspendLambda implements wls {
    final /* synthetic */ lub0 $appearanceOverride;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPinV2DataRepository$pinStateWithIcon$2(f fVar, lub0 lub0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$appearanceOverride = lub0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryPinV2DataRepository$pinStateWithIcon$2(this.this$0, this.$appearanceOverride, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryPinV2DataRepository$pinStateWithIcon$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.utils.e eVar = this.this$0.i;
            String str = this.$appearanceOverride.a;
            this.label = 1;
            obj = ru.yandex.taxi.widget.utils.e.f(eVar, str, null, this, 6);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        f fVar = this.this$0;
        if (bitmapDrawable == null) {
            return fVar.d.h();
        }
        Integer c = fVar.i.c(this.$appearanceOverride.b);
        Integer p = this.this$0.i.p(this.$appearanceOverride.c);
        if (p != null) {
            bitmapDrawable.mutate().setTint(p.intValue());
        }
        return c != null ? new b0c0(bitmapDrawable, c.intValue()) : new c0c0(bitmapDrawable);
    }
}
