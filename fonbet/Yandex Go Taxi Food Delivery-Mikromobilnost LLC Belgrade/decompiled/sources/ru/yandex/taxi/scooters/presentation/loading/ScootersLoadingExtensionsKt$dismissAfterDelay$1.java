package ru.yandex.taxi.scooters.presentation.loading;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.presentation.loading.ScootersLoadingExtensionsKt", f = "ScootersLoadingExtensions.kt", l = {6}, m = "dismissAfterDelay", v = 2)
/* loaded from: classes6.dex */
final class ScootersLoadingExtensionsKt$dismissAfterDelay$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(null, 0L, this);
    }
}
