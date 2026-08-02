package ru.yandex.taxi.masstransit.ui;

import defpackage.eja1;
import defpackage.hoy0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.SourceDestinationKt$AddressInput$3$1", f = "SourceDestination.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SourceDestinationKt$AddressInput$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $text;
    final /* synthetic */ oz40 $textState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceDestinationKt$AddressInput$3$1(oz40 oz40Var, String str, Continuation continuation) {
        super(2, continuation);
        this.$textState = oz40Var;
        this.$text = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SourceDestinationKt$AddressInput$3$1(this.$textState, this.$text, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SourceDestinationKt$AddressInput$3$1 sourceDestinationKt$AddressInput$3$1 = (SourceDestinationKt$AddressInput$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        sourceDestinationKt$AddressInput$3$1.invokeSuspend(zy11Var);
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
        oz40 oz40Var = this.$textState;
        String str = this.$text;
        int length = str.length();
        oz40Var.setValue(new hoy0(str, eja1.c(length, length), 4));
        return zy11.a;
    }
}
