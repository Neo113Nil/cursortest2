package ru.yandex.taxi.banners.presentation.fullscreen;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPage", f = "FullScreenBannerPage.kt", l = {405}, m = "tryToSetVideoBackground", v = 2)
/* loaded from: classes5.dex */
public final class FullScreenBannerPage$tryToSetVideoBackground$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FullScreenBannerPage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenBannerPage$tryToSetVideoBackground$1(FullScreenBannerPage fullScreenBannerPage, Continuation continuation) {
        super(continuation);
        this.this$0 = fullScreenBannerPage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object tryToSetVideoBackground;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        tryToSetVideoBackground = this.this$0.tryToSetVideoBackground(null, this);
        return tryToSetVideoBackground;
    }
}
