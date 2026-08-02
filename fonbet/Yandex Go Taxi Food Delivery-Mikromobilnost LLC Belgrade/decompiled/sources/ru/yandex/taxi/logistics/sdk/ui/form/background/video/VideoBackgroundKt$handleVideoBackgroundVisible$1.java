package ru.yandex.taxi.logistics.sdk.ui.form.background.video;

import defpackage.mvg;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.form.background.video.VideoBackgroundKt", f = "VideoBackground.kt", l = {BuildConfig.API_LEVEL}, m = "handleVideoBackgroundVisible", v = 2)
/* loaded from: classes5.dex */
final class VideoBackgroundKt$handleVideoBackgroundVisible$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.c(null, null, null, this);
    }
}
