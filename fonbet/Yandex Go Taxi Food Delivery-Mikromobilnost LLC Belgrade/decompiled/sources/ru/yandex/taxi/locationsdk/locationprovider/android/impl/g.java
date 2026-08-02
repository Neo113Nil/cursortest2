package ru.yandex.taxi.locationsdk.locationprovider.android.impl;

import android.location.Location;
import defpackage.ca2;
import defpackage.fa2;
import defpackage.ha2;
import defpackage.k7z;
import defpackage.na2;
import defpackage.ny61;
import defpackage.rcz;
import defpackage.tpr;
import defpackage.zbz;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationProviderType;

/* loaded from: classes9.dex */
public final class g implements zbz {
    public final ru.yandex.taxi.locationsdk.locationprovider.android.a a;
    public final AndroidLocationProviderType b;
    public final fa2 c;
    public final rcz d;

    public g(ru.yandex.taxi.locationsdk.locationprovider.android.a aVar, AndroidLocationProviderType androidLocationProviderType, fa2 fa2Var, rcz rczVar) {
        this.a = aVar;
        this.b = androidLocationProviderType;
        this.c = fa2Var;
        this.d = rczVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.zbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        AndroidLocationProviderImpl$getLastKnownLocation$1 androidLocationProviderImpl$getLastKnownLocation$1;
        int i;
        Location location;
        if (continuation instanceof AndroidLocationProviderImpl$getLastKnownLocation$1) {
            androidLocationProviderImpl$getLastKnownLocation$1 = (AndroidLocationProviderImpl$getLastKnownLocation$1) continuation;
            int i2 = androidLocationProviderImpl$getLastKnownLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidLocationProviderImpl$getLastKnownLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidLocationProviderImpl$getLastKnownLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidLocationProviderImpl$getLastKnownLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ca2 ca2Var = new ca2(this.b);
                    androidLocationProviderImpl$getLastKnownLocation$1.label = 1;
                    obj = this.a.a(ca2Var, androidLocationProviderImpl$getLastKnownLocation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                location = (Location) obj;
                if (location == null) {
                    return c(location);
                }
                return null;
            }
        }
        androidLocationProviderImpl$getLastKnownLocation$1 = new AndroidLocationProviderImpl$getLastKnownLocation$1(this, (ContinuationImpl) continuation);
        Object obj2 = androidLocationProviderImpl$getLastKnownLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidLocationProviderImpl$getLastKnownLocation$1.label;
        if (i != 0) {
        }
        location = (Location) obj2;
        if (location == null) {
        }
    }

    @Override // defpackage.zbz
    public final tpr b(Object obj) {
        return new ha2(0, this.a.b((na2) obj, this.b), this);
    }

    public final k7z c(Location location) {
        Object failure;
        try {
            failure = this.c.a(location);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        ru.yandex.taxi.locationsdk.core.utils.a.d(failure, this.d, "AndroidSourceLocationProvider", new Pair("provider", this.b.name()));
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (k7z) failure;
    }
}
