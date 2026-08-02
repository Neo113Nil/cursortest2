package ru.yandex.taxi.communications.data;

import defpackage.ep21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.vng;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes9.dex */
public final class b {
    public final po21 a;
    public final com.yandex.go.route.interactor.b b;

    public b(po21 po21Var, com.yandex.go.route.interactor.b bVar) {
        this.a = po21Var;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        CommunicationsGeoRepositoryImpl$getUserLocation$1 communicationsGeoRepositoryImpl$getUserLocation$1;
        int i;
        if (continuationImpl instanceof CommunicationsGeoRepositoryImpl$getUserLocation$1) {
            communicationsGeoRepositoryImpl$getUserLocation$1 = (CommunicationsGeoRepositoryImpl$getUserLocation$1) continuationImpl;
            int i2 = communicationsGeoRepositoryImpl$getUserLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                communicationsGeoRepositoryImpl$getUserLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = communicationsGeoRepositoryImpl$getUserLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = communicationsGeoRepositoryImpl$getUserLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    communicationsGeoRepositoryImpl$getUserLocation$1.label = 1;
                    obj = ((e) this.a).m(communicationsGeoRepositoryImpl$getUserLocation$1);
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
                return vng.A((ep21) obj);
            }
        }
        communicationsGeoRepositoryImpl$getUserLocation$1 = new CommunicationsGeoRepositoryImpl$getUserLocation$1(this, continuationImpl);
        Object obj2 = communicationsGeoRepositoryImpl$getUserLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = communicationsGeoRepositoryImpl$getUserLocation$1.label;
        if (i != 0) {
        }
        return vng.A((ep21) obj2);
    }
}
