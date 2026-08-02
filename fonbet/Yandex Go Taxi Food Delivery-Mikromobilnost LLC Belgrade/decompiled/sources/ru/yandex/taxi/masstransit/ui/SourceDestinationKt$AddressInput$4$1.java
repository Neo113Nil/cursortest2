package ru.yandex.taxi.masstransit.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.SourceDestinationKt$AddressInput$4$1", f = "SourceDestination.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SourceDestinationKt$AddressInput$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isFocused;
    final /* synthetic */ sls $onFocusGained;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceDestinationKt$AddressInput$4$1(boolean z, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$isFocused = z;
        this.$onFocusGained = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SourceDestinationKt$AddressInput$4$1(this.$isFocused, this.$onFocusGained, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SourceDestinationKt$AddressInput$4$1 sourceDestinationKt$AddressInput$4$1 = (SourceDestinationKt$AddressInput$4$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        sourceDestinationKt$AddressInput$4$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (this.$isFocused) {
            this.$onFocusGained.invoke();
        }
        return zy11.a;
    }
}
