package ru.yandex.taxi.utils;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.utils.ImageLoaderExtenstionsKt", f = "ImageLoaderExtenstions.kt", l = {15}, m = "safeSuspend", v = 2)
/* loaded from: classes10.dex */
final class ImageLoaderExtenstionsKt$safeSuspend$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.b(null, this);
    }
}
