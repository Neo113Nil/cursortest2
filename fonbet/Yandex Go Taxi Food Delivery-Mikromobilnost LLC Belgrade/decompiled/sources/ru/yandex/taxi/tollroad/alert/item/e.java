package ru.yandex.taxi.tollroad.alert.item;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class e implements tpr {
    public final /* synthetic */ b a;
    public final /* synthetic */ c b;

    public e(b bVar, c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TollRoadRideInfoPresenter$attachView$$inlined$map$1$1 tollRoadRideInfoPresenter$attachView$$inlined$map$1$1;
        int i;
        if (continuation instanceof TollRoadRideInfoPresenter$attachView$$inlined$map$1$1) {
            tollRoadRideInfoPresenter$attachView$$inlined$map$1$1 = (TollRoadRideInfoPresenter$attachView$$inlined$map$1$1) continuation;
            int i2 = tollRoadRideInfoPresenter$attachView$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tollRoadRideInfoPresenter$attachView$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tollRoadRideInfoPresenter$attachView$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tollRoadRideInfoPresenter$attachView$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    tollRoadRideInfoPresenter$attachView$$inlined$map$1$1.L$0 = null;
                    tollRoadRideInfoPresenter$attachView$$inlined$map$1$1.L$1 = null;
                    tollRoadRideInfoPresenter$attachView$$inlined$map$1$1.L$2 = null;
                    tollRoadRideInfoPresenter$attachView$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, tollRoadRideInfoPresenter$attachView$$inlined$map$1$1) == coroutineSingletons) {
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
        tollRoadRideInfoPresenter$attachView$$inlined$map$1$1 = new TollRoadRideInfoPresenter$attachView$$inlined$map$1$1(this, continuation);
        Object obj2 = tollRoadRideInfoPresenter$attachView$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tollRoadRideInfoPresenter$attachView$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
