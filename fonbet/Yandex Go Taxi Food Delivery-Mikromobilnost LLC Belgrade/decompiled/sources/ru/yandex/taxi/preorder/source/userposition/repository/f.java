package ru.yandex.taxi.preorder.source.userposition.repository;

import android.location.Location;
import defpackage.ai4;
import defpackage.ccz;
import defpackage.eci0;
import defpackage.hbp0;
import defpackage.hcz;
import defpackage.hsx;
import defpackage.jqr;
import defpackage.jst;
import defpackage.ppr;
import defpackage.rol0;
import defpackage.wsr0;
import defpackage.xsr0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.o;

/* loaded from: classes9.dex */
public final class f implements hcz {
    public final hsx a;
    public final ai4 b;
    public final ru.yandex.taxi.map_common.map.d c;
    public final ccz d;
    public volatile Location e;
    public final eci0 f = kotlinx.coroutines.flow.e.O(new o(new jqr(kotlinx.coroutines.flow.e.X(new rol0(new LocationRepositoryMapKitImpl$locationFlow$1(null, this)), new LocationRepositoryMapKitImpl$special$$inlined$flatMapLatest$1(null, this)), new LocationRepositoryMapKitImpl$locationFlow$3(null, this), 3), new LocationRepositoryMapKitImpl$locationFlow$4(null, this)), (hbp0) kotlin.a.a(new ppr(28, this)).getValue(), wsr0.a(xsr0.a, 3), 0);

    public f(hsx hsxVar, ai4 ai4Var, ru.yandex.taxi.map_common.map.d dVar, ccz cczVar) {
        this.a = hsxVar;
        this.b = ai4Var;
        this.c = dVar;
        this.d = cczVar;
    }

    @Override // defpackage.hcz
    public final Object a(ContinuationImpl continuationImpl) {
        return new jqr(com.yandex.go.coroutines.b.d(this.f, new LocationRepositoryMapKitImpl$requestLocationUpdates$2()), new LocationRepositoryMapKitImpl$requestLocationUpdates$3(null, this), 3);
    }

    @Override // defpackage.hcz
    public final Object b(ContinuationImpl continuationImpl) {
        Location location = this.e;
        if (location == null) {
            jst.e.getClass();
            location = this.a.a();
        }
        this.b.a("MapKit::getLocationImmediately", new Object[0]);
        if (location != null) {
            return location;
        }
        throw new LocationRepository$LocationUnknownException();
    }
}
