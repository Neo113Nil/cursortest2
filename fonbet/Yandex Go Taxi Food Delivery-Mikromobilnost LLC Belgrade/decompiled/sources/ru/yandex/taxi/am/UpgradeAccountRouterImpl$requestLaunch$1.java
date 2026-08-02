package ru.yandex.taxi.am;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.am.UpgradeAccountRouterImpl", f = "UpgradeAccountRouterImpl.kt", l = {105, 106}, m = "requestLaunch", v = 2)
/* loaded from: classes5.dex */
final class UpgradeAccountRouterImpl$requestLaunch$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeAccountRouterImpl$requestLaunch$1(s0 s0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = s0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(this);
    }
}
