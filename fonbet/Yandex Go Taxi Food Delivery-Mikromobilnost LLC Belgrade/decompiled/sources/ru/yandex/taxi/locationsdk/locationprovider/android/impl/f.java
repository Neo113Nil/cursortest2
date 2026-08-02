package ru.yandex.taxi.locationsdk.locationprovider.android.impl;

import android.location.Location;
import defpackage.k7z;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;

    public f(vpr vprVar, g gVar) {
        this.a = vprVar;
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AndroidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1 androidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof AndroidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1) {
            androidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1 = (AndroidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = androidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = androidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    k7z c = this.b.c((Location) obj);
                    if (c != null) {
                        androidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1.L$0 = null;
                        androidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1.L$1 = null;
                        androidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1.L$2 = null;
                        androidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1.L$3 = null;
                        androidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1.L$4 = null;
                        androidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        androidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(c, androidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        androidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1 = new AndroidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = androidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidLocationProviderImpl$requestLocationUpdates$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
