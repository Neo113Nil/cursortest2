package ru.yandex.taxi.masstransit.ui;

import androidx.compose.runtime.f;
import defpackage.fr5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qor;
import defpackage.rol0;
import defpackage.t24;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.BottomSheetExtensionsKt$rememberMtBottomSheetScrim$1$1", f = "BottomSheetExtensions.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class BottomSheetExtensionsKt$rememberMtBottomSheetScrim$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onScrimValueChanged;
    final /* synthetic */ qor $visibilityOffset;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetExtensionsKt$rememberMtBottomSheetScrim$1$1(qor qorVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$visibilityOffset = qorVar;
        this.$onScrimValueChanged = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BottomSheetExtensionsKt$rememberMtBottomSheetScrim$1$1(this.$visibilityOffset, this.$onScrimValueChanged, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BottomSheetExtensionsKt$rememberMtBottomSheetScrim$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            rol0 o = f.o(new fr5(this.$visibilityOffset, 1));
            t24 t24Var = new t24(2, this.$onScrimValueChanged);
            this.label = 1;
            if (o.collect(t24Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
