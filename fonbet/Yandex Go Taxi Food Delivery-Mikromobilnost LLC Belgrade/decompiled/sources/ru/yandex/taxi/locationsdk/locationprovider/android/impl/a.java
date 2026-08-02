package ru.yandex.taxi.locationsdk.locationprovider.android.impl;

import android.location.Location;
import defpackage.la2;
import defpackage.ny61;
import defpackage.sls;
import defpackage.vpr;
import defpackage.zy11;
import java.text.DecimalFormat;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ la2 b;
    public final /* synthetic */ sls c;

    public a(vpr vprVar, la2 la2Var, sls slsVar) {
        this.a = vprVar;
        this.b = la2Var;
        this.c = slsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AndroidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1 androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof AndroidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1) {
            androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1 = (AndroidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Location location = (Location) obj;
                    DecimalFormat decimalFormat = e.a;
                    long longValue = ((Number) this.c.invoke()).longValue();
                    Iterator<E> it = AndroidLocationDiscardReason.a().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((AndroidLocationDiscardReason) obj2).b(location, longValue, this.b)) {
                            break;
                        }
                    }
                    Pair pair = new Pair((AndroidLocationDiscardReason) obj2, location);
                    androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1.I$0 = 0;
                    androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1 = new AndroidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj32 = androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
