package ru.yandex.taxi.tariffs.interactor;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.image.domain.requests.g;
import defpackage.bvf0;
import defpackage.hit;
import defpackage.jgv;
import defpackage.jst;
import defpackage.lz60;
import defpackage.ny61;
import defpackage.pav;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.woe0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public final class f implements lz60 {
    public final hit a;
    public final tt2 b;
    public final jgv c;
    public final ru.yandex.taxi.preorder.source.cars.a d;
    public final pav e;
    public final Lifecycle f;
    public final tse g;
    public final r0 h = bvf0.c(woe0.a);
    public final String i = "TariffImagesPreloadInteractor";

    public f(hit hitVar, tt2 tt2Var, jgv jgvVar, ru.yandex.taxi.preorder.source.cars.a aVar, pav pavVar, Lifecycle lifecycle, tse tseVar) {
        this.a = hitVar;
        this.b = tt2Var;
        this.c = jgvVar;
        this.d = aVar;
        this.e = pavVar;
        this.f = lifecycle;
        this.g = tseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(f fVar, String str, String str2, ContinuationImpl continuationImpl) {
        TariffImagesPreloadInteractor$preloadSafely$1 tariffImagesPreloadInteractor$preloadSafely$1;
        int i;
        Object e;
        fVar.getClass();
        if (continuationImpl instanceof TariffImagesPreloadInteractor$preloadSafely$1) {
            tariffImagesPreloadInteractor$preloadSafely$1 = (TariffImagesPreloadInteractor$preloadSafely$1) continuationImpl;
            int i2 = tariffImagesPreloadInteractor$preloadSafely$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffImagesPreloadInteractor$preloadSafely$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffImagesPreloadInteractor$preloadSafely$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffImagesPreloadInteractor$preloadSafely$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = (g) fVar.e.e();
                    gVar.c(str);
                    tariffImagesPreloadInteractor$preloadSafely$1.L$0 = null;
                    tariffImagesPreloadInteractor$preloadSafely$1.L$1 = str2;
                    tariffImagesPreloadInteractor$preloadSafely$1.label = 1;
                    e = ru.yandex.taxi.utils.a.e(gVar, tariffImagesPreloadInteractor$preloadSafely$1);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    e = ((Result) obj).getValue();
                }
                if (Result.a(e) != null) {
                    jst.e.getClass();
                }
                return zy11.a;
            }
        }
        tariffImagesPreloadInteractor$preloadSafely$1 = new TariffImagesPreloadInteractor$preloadSafely$1(fVar, continuationImpl);
        Object obj2 = tariffImagesPreloadInteractor$preloadSafely$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffImagesPreloadInteractor$preloadSafely$1.label;
        if (i != 0) {
        }
        if (Result.a(e) != null) {
        }
        return zy11.a;
    }

    @Override // defpackage.lz60
    public final void g() {
        tje.N(this.g, null, null, new TariffImagesPreloadInteractor$onLargestContentfulPaint$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return this.i;
    }
}
