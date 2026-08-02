package ru.yandex.taxi.superapp.address;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddressDatumType;
import defpackage.f0t;
import defpackage.i0t;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tpr;
import defpackage.z7l0;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;

/* loaded from: classes6.dex */
public final class a {
    public final ru.yandex.taxi.search.suggest.i a;

    public a(ru.yandex.taxi.search.suggest.i iVar) {
        this.a = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zzs zzsVar, z7l0 z7l0Var, PositionInitAction positionInitAction, ContinuationImpl continuationImpl) {
        CoreGeoPositionRequestInteractor$requestAddressInfo$1 coreGeoPositionRequestInteractor$requestAddressInfo$1;
        int i;
        if (continuationImpl instanceof CoreGeoPositionRequestInteractor$requestAddressInfo$1) {
            coreGeoPositionRequestInteractor$requestAddressInfo$1 = (CoreGeoPositionRequestInteractor$requestAddressInfo$1) continuationImpl;
            int i2 = coreGeoPositionRequestInteractor$requestAddressInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coreGeoPositionRequestInteractor$requestAddressInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = coreGeoPositionRequestInteractor$requestAddressInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coreGeoPositionRequestInteractor$requestAddressInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr q = this.a.q(false, zzsVar, z7l0Var, true, false, "geo", null, positionInitAction);
                    coreGeoPositionRequestInteractor$requestAddressInfo$1.L$0 = null;
                    coreGeoPositionRequestInteractor$requestAddressInfo$1.L$1 = null;
                    coreGeoPositionRequestInteractor$requestAddressInfo$1.L$2 = null;
                    coreGeoPositionRequestInteractor$requestAddressInfo$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(q, coreGeoPositionRequestInteractor$requestAddressInfo$1);
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
                Address address = ((pv0) obj).a;
                double d = address.B().a;
                double d2 = address.B().b;
                String d3 = address.d();
                String D1 = address.D1();
                String uri = address.getUri();
                String J1 = address.J1();
                String e0 = address.e0();
                String H1 = address.H1();
                String e2 = address.e2();
                String n0 = address.n0();
                String favoriteId = address.getFavoriteId();
                FavoriteAddressDatumType datumType = address.getDatumType();
                return new i0t(new f0t(d, d2, d3, D1, uri, J1, e0, H1, e2, n0, favoriteId, datumType != null ? datumType.getEatsKitWireName() : null, address.c2()));
            }
        }
        coreGeoPositionRequestInteractor$requestAddressInfo$1 = new CoreGeoPositionRequestInteractor$requestAddressInfo$1(this, continuationImpl);
        Object obj2 = coreGeoPositionRequestInteractor$requestAddressInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coreGeoPositionRequestInteractor$requestAddressInfo$1.label;
        if (i != 0) {
        }
        Address address2 = ((pv0) obj2).a;
        double d4 = address2.B().a;
        double d22 = address2.B().b;
        String d32 = address2.d();
        String D12 = address2.D1();
        String uri2 = address2.getUri();
        String J12 = address2.J1();
        String e02 = address2.e0();
        String H12 = address2.H1();
        String e22 = address2.e2();
        String n02 = address2.n0();
        String favoriteId2 = address2.getFavoriteId();
        FavoriteAddressDatumType datumType2 = address2.getDatumType();
        return new i0t(new f0t(d4, d22, d32, D12, uri2, J12, e02, H12, e22, n02, favoriteId2, datumType2 != null ? datumType2.getEatsKitWireName() : null, address2.c2()));
    }
}
