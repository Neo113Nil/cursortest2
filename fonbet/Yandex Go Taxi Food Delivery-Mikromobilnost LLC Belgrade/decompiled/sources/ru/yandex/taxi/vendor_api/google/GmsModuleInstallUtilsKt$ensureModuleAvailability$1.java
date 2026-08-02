package ru.yandex.taxi.vendor_api.google;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.vendor_api.google.GmsModuleInstallUtilsKt", f = "GmsModuleInstallUtils.kt", l = {14, 50}, m = "ensureModuleAvailability", v = 2)
/* loaded from: classes6.dex */
final class GmsModuleInstallUtilsKt$ensureModuleAvailability$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(null, null, this);
    }
}
