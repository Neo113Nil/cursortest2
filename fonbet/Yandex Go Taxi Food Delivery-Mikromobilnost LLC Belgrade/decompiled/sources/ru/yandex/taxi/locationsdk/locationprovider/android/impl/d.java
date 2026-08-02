package ru.yandex.taxi.locationsdk.locationprovider.android.impl;

import android.location.Location;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AndroidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1 androidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof AndroidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1) {
            androidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1 = (AndroidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = androidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = androidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    AndroidLocationDiscardReason androidLocationDiscardReason = (AndroidLocationDiscardReason) pair.getFirst();
                    Pair pair2 = androidLocationDiscardReason != null ? new Pair(androidLocationDiscardReason, (Location) pair.getSecond()) : null;
                    if (pair2 != null) {
                        androidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1.L$0 = null;
                        androidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1.L$1 = null;
                        androidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1.L$2 = null;
                        androidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1.L$3 = null;
                        androidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1.L$4 = null;
                        androidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        androidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(pair2, androidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        androidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1 = new AndroidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = androidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidDiscardedLocationFiltrationAndLogging$logDiscarded$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
