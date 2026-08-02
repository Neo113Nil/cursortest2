package ru.yandex.taxi.main.map;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.main.map.MainScreenUserLocationTracker", f = "MainScreenUserLocationTracker.kt", l = {226, 260, 288}, m = "needUpdateCurrentLocation", v = 2)
/* loaded from: classes9.dex */
final class MainScreenUserLocationTracker$needUpdateCurrentLocation$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenUserLocationTracker$needUpdateCurrentLocation$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, null, this);
    }
}
