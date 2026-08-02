package ru.yandex.taxi.am;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.am.UpgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2", f = "UpgradeAccountRouterImpl.kt", l = {217}, m = "emit", v = 2)
/* loaded from: classes5.dex */
public final class UpgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ q0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeAccountRouterImpl$startUpgradeAccountActivity$2$invokeSuspend$$inlined$map$1$2$1(q0 q0Var, Continuation continuation) {
        super(continuation);
        this.this$0 = q0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
