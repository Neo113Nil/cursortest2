package ru.yandex.taxi.main_screen_custom.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.main_screen_custom.domain.PromoConfigMapper", f = "PromoConfigMapper.kt", l = {91}, m = "loadLottieRemoteAnimation", v = 2)
/* loaded from: classes5.dex */
final class PromoConfigMapper$loadLottieRemoteAnimation$1 extends ContinuationImpl {
    double D$0;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoConfigMapper$loadLottieRemoteAnimation$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, 0, 0.0d, 0, this);
    }
}
