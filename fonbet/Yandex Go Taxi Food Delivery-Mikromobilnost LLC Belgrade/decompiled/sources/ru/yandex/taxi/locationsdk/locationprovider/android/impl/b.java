package ru.yandex.taxi.locationsdk.locationprovider.android.impl;

import android.location.Location;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AndroidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1 androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof AndroidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
            androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (AndroidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    AndroidLocationDiscardReason androidLocationDiscardReason = (AndroidLocationDiscardReason) pair.getFirst();
                    Location location = (Location) pair.getSecond();
                    if (androidLocationDiscardReason != null) {
                        location = null;
                    }
                    if (location != null) {
                        androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = null;
                        androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$1 = null;
                        androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$2 = null;
                        androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3 = null;
                        androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$4 = null;
                        androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(location, androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new AndroidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidDiscardedLocationFiltrationAndLogging$filterAndLogDiscarded$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
