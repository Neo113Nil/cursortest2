package ru.yandex.taxi.layers.presentation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.layers.presentation.GravityConvinienciesKt", f = "GravityConviniencies.kt", l = {37, 54}, m = "resolveGravityWhileGesture", v = 2)
/* loaded from: classes9.dex */
final class GravityConvinienciesKt$resolveGravityWhileGesture$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.d(null, null, null, null, this);
    }
}
