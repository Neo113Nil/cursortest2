package ru.yandex.taxi.layers.presentation.optimalview;

import com.yandex.go.layers.api.model.params.Mode;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.layers.source.j;

/* loaded from: classes5.dex */
public final class b implements tpr {
    public final /* synthetic */ j a;
    public final /* synthetic */ Mode b;

    public b(j jVar, Mode mode) {
        this.a = jVar;
        this.b = mode;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MapObservationPresenter$attachView$$inlined$filter$1$1 mapObservationPresenter$attachView$$inlined$filter$1$1;
        int i;
        if (continuation instanceof MapObservationPresenter$attachView$$inlined$filter$1$1) {
            mapObservationPresenter$attachView$$inlined$filter$1$1 = (MapObservationPresenter$attachView$$inlined$filter$1$1) continuation;
            int i2 = mapObservationPresenter$attachView$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObservationPresenter$attachView$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapObservationPresenter$attachView$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObservationPresenter$attachView$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    mapObservationPresenter$attachView$$inlined$filter$1$1.L$0 = null;
                    mapObservationPresenter$attachView$$inlined$filter$1$1.L$1 = null;
                    mapObservationPresenter$attachView$$inlined$filter$1$1.L$2 = null;
                    mapObservationPresenter$attachView$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(aVar, mapObservationPresenter$attachView$$inlined$filter$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        mapObservationPresenter$attachView$$inlined$filter$1$1 = new MapObservationPresenter$attachView$$inlined$filter$1$1(this, continuation);
        Object obj2 = mapObservationPresenter$attachView$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObservationPresenter$attachView$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
