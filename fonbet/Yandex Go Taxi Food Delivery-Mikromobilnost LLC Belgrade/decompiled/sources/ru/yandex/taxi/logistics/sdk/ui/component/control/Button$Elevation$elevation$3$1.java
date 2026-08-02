package ru.yandex.taxi.logistics.sdk.ui.component.control;

import defpackage.ck11;
import defpackage.g8w;
import defpackage.jxe0;
import defpackage.jy6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oy6;
import defpackage.s9m;
import defpackage.tse;
import defpackage.wls;
import defpackage.y7m;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.control.Button$Elevation$elevation$3$1", f = "Button.kt", l = {303}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class Button$Elevation$elevation$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.animation.core.a $animatable;
    final /* synthetic */ g8w $interaction;
    final /* synthetic */ float $target;
    Object L$0;
    int label;
    final /* synthetic */ jy6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Button$Elevation$elevation$3$1(androidx.compose.animation.core.a aVar, jy6 jy6Var, float f, g8w g8wVar, Continuation continuation) {
        super(2, continuation);
        this.$animatable = aVar;
        this.this$0 = jy6Var;
        this.$target = f;
        this.$interaction = g8wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Button$Elevation$elevation$3$1(this.$animatable, this.this$0, this.$target, this.$interaction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Button$Elevation$elevation$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ck11 ck11Var;
        Object f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        ck11 ck11Var2 = null;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        float f2 = ((y7m) this.$animatable.f.getValue()).a;
        this.this$0.getClass();
        jxe0 jxe0Var = y7m.b(f2, 2.0f) ? new jxe0(0L) : null;
        ck11 ck11Var3 = oy6.a;
        androidx.compose.animation.core.a aVar = this.$animatable;
        float f3 = this.$target;
        g8w g8wVar = this.$interaction;
        this.L$0 = null;
        this.label = 1;
        ck11 ck11Var4 = oy6.b;
        ck11 ck11Var5 = oy6.a;
        if (g8wVar != null) {
            if ((g8wVar instanceof jxe0) || (g8wVar instanceof s9m)) {
                ck11Var2 = ck11Var5;
            }
        } else if (jxe0Var != null) {
            ck11Var = ck11Var4;
            if (ck11Var != null ? (f = aVar.f(new y7m(f3), this)) != coroutineSingletons : (f = androidx.compose.animation.core.a.d(aVar, new y7m(f3), ck11Var, null, null, this, 12)) != coroutineSingletons) {
                f = zy11Var;
            }
            return f == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        ck11Var = ck11Var2;
        if (ck11Var != null) {
            f = zy11Var;
            if (f == coroutineSingletons) {
            }
        } else {
            f = zy11Var;
            if (f == coroutineSingletons) {
            }
        }
    }
}
