package ru.yandex.taxi.superapp.address;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddressDatumType;
import defpackage.atd0;
import defpackage.f0t;
import defpackage.h1p;
import defpackage.i0t;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.qq80;
import defpackage.rvf0;
import defpackage.tkf;
import defpackage.tpr;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class j {
    public final rvf0 a;
    public final atd0 b;

    public j(rvf0 rvf0Var, atd0 atd0Var) {
        this.a = rvf0Var;
        this.b = atd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(h1p h1pVar, zzs zzsVar, ContinuationImpl continuationImpl) {
        SuperAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1 superAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1;
        int i;
        tpr g;
        h1p h1pVar2;
        if (continuationImpl instanceof SuperAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1) {
            superAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1 = (SuperAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1) continuationImpl;
            int i2 = superAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g = ((ru.yandex.taxi.search.suggest.i) this.b).g(zzsVar, null, new tkf(h1pVar.getValue()), true, false, qq80.b, null);
                    superAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1.L$0 = h1pVar;
                    superAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1.L$1 = null;
                    superAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(g, superAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    h1pVar2 = h1pVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h1pVar2 = (h1p) superAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1.L$0;
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
                i0t i0tVar = new i0t(new f0t(d, d2, d3, D1, uri, J1, e0, H1, e2, n0, favoriteId, datumType != null ? datumType.getEatsKitWireName() : null, address.c2()));
                this.a.a.put(h1pVar2, i0tVar);
                return i0tVar;
            }
        }
        superAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1 = new SuperAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1(this, continuationImpl);
        Object obj2 = superAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDeeplinkGeoPositionInteractorImpl$resolveGeoPosition$1.label;
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
        i0t i0tVar2 = new i0t(new f0t(d4, d22, d32, D12, uri2, J12, e02, H12, e22, n02, favoriteId2, datumType2 != null ? datumType2.getEatsKitWireName() : null, address2.c2()));
        this.a.a.put(h1pVar2, i0tVar2);
        return i0tVar2;
    }
}
