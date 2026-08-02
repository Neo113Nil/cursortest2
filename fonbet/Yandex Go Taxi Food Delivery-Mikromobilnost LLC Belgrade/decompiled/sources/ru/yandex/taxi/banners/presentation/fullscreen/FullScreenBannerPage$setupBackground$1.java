package ru.yandex.taxi.banners.presentation.fullscreen;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPage", f = "FullScreenBannerPage.kt", l = {323, 323}, m = "setupBackground", v = 2)
/* loaded from: classes5.dex */
public final class FullScreenBannerPage$setupBackground$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FullScreenBannerPage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenBannerPage$setupBackground$1(FullScreenBannerPage fullScreenBannerPage, Continuation continuation) {
        super(continuation);
        this.this$0 = fullScreenBannerPage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        obj2 = this.this$0.setupBackground(null, this);
        return obj2;
    }
}
