package ru.yandex.taxi.map_common.map;

import android.content.Context;
import defpackage.bvf0;
import defpackage.el00;
import defpackage.fva0;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.qhq0;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class p implements i3y {
    public final Context a;
    public final h3y b;
    public final fva0 c;
    public final h3y w;
    public final i3y x = kotlin.a.a(new qhq0(29, this));
    public final r0 y = bvf0.c(null);
    public final AtomicBoolean z = new AtomicBoolean(false);

    public p(Context context, h3y h3yVar, fva0 fva0Var, h3y h3yVar2) {
        this.a = context;
        this.b = h3yVar;
        this.c = fva0Var;
        this.w = h3yVar2;
    }

    @Override // defpackage.i3y
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final TaxiMapView getValue() {
        TaxiMapView taxiMapView = (TaxiMapView) this.y.getValue();
        return taxiMapView == null ? (TaxiMapView) this.x.getValue() : taxiMapView;
    }

    public final void b(MapViewInflateStrategy mapViewInflateStrategy, String str) {
        if (this.z.getAndSet(true)) {
            return;
        }
        ((el00) this.b.get()).f(true, new TaxiMapViewInitializerImpl$initialize$1(this, mapViewInflateStrategy, str, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        TaxiMapViewInitializerImpl$waitForInitialization$1 taxiMapViewInitializerImpl$waitForInitialization$1;
        int i;
        if (continuationImpl instanceof TaxiMapViewInitializerImpl$waitForInitialization$1) {
            taxiMapViewInitializerImpl$waitForInitialization$1 = (TaxiMapViewInitializerImpl$waitForInitialization$1) continuationImpl;
            int i2 = taxiMapViewInitializerImpl$waitForInitialization$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiMapViewInitializerImpl$waitForInitialization$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiMapViewInitializerImpl$waitForInitialization$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiMapViewInitializerImpl$waitForInitialization$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    TaxiMapViewInitializerImpl$waitForInitialization$2 taxiMapViewInitializerImpl$waitForInitialization$2 = new TaxiMapViewInitializerImpl$waitForInitialization$2(2, null);
                    taxiMapViewInitializerImpl$waitForInitialization$1.label = 1;
                    if (kotlinx.coroutines.flow.e.x(this.y, taxiMapViewInitializerImpl$waitForInitialization$2, taxiMapViewInitializerImpl$waitForInitialization$1) == coroutineSingletons) {
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
        taxiMapViewInitializerImpl$waitForInitialization$1 = new TaxiMapViewInitializerImpl$waitForInitialization$1(this, continuationImpl);
        Object obj2 = taxiMapViewInitializerImpl$waitForInitialization$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiMapViewInitializerImpl$waitForInitialization$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    @Override // defpackage.i3y
    public final boolean isInitialized() {
        return this.y.getValue() != null;
    }
}
