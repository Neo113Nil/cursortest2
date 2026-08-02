package ru.yandex.taxi.superapp;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddressDatumType;
import defpackage.abf0;
import defpackage.ezs;
import defpackage.f0t;
import defpackage.ffx;
import defpackage.h1p;
import defpackage.h3y;
import defpackage.i0t;
import defpackage.jbh;
import defpackage.jc00;
import defpackage.jst;
import defpackage.lz40;
import defpackage.m2c0;
import defpackage.ny61;
import defpackage.p0;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tkf;
import defpackage.yu0;
import defpackage.z7l0;
import defpackage.zaf0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;

/* loaded from: classes6.dex */
public final class e {
    public final com.yandex.go.shortcuts.impl.interactors.m a;
    public final com.yandex.go.navigation.screen.c b;
    public final jc00 c;
    public final abf0 d;
    public final h3y e;
    public final m2c0 f;
    public final t1b0 g;
    public final n0 h = ffx.b(1, 0, BufferOverflow.DROP_OLDEST);
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();
    public final HashMap k = new HashMap();

    public e(rqo rqoVar, com.yandex.go.shortcuts.impl.interactors.m mVar, com.yandex.go.navigation.screen.c cVar, jc00 jc00Var, abf0 abf0Var, h3y h3yVar, m2c0 m2c0Var) {
        this.a = mVar;
        this.b = cVar;
        this.c = jc00Var;
        this.d = abf0Var;
        this.e = h3yVar;
        this.f = m2c0Var;
        this.g = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.STICK_TO_EATS_ADDRESS);
    }

    public static i0t c(Address address) {
        if (address == null) {
            return null;
        }
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

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(5:11|12|13|14|15)(2:18|19))(3:20|21|22))(4:41|42|(1:44)|25)|23|(4:26|13|14|15)|25))|48|6|7|(0)(0)|23|(0)|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0039, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(h1p h1pVar, ContinuationImpl continuationImpl) {
        AddressGeoPositionProvider$forceUpdatePosition$1 addressGeoPositionProvider$forceUpdatePosition$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        h1p h1pVar2;
        z7l0 z7l0Var;
        try {
            if (continuationImpl instanceof AddressGeoPositionProvider$forceUpdatePosition$1) {
                addressGeoPositionProvider$forceUpdatePosition$1 = (AddressGeoPositionProvider$forceUpdatePosition$1) continuationImpl;
                int i2 = addressGeoPositionProvider$forceUpdatePosition$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    addressGeoPositionProvider$forceUpdatePosition$1.label = i2 - Integer.MIN_VALUE;
                    obj = addressGeoPositionProvider$forceUpdatePosition$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = addressGeoPositionProvider$forceUpdatePosition$1.label;
                    HashMap hashMap = this.j;
                    i0t i0tVar = null;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        tkf tkfVar = new tkf(h1pVar.getValue());
                        n0 n0Var = this.h;
                        addressGeoPositionProvider$forceUpdatePosition$1.L$0 = h1pVar;
                        addressGeoPositionProvider$forceUpdatePosition$1.L$1 = tkfVar;
                        addressGeoPositionProvider$forceUpdatePosition$1.label = 1;
                        Object y = kotlinx.coroutines.flow.e.y(n0Var, addressGeoPositionProvider$forceUpdatePosition$1);
                        if (y != coroutineSingletons) {
                            h1pVar2 = h1pVar;
                            z7l0Var = tkfVar;
                            obj = y;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h1pVar = (h1p) addressGeoPositionProvider$forceUpdatePosition$1.L$0;
                        kotlin.b.b(obj);
                        i0t i0tVar2 = (i0t) obj;
                        hashMap.put(h1pVar, i0tVar2);
                        b(h1pVar).g(i0tVar2);
                        return zy11.a;
                    }
                    z7l0Var = (z7l0) addressGeoPositionProvider$forceUpdatePosition$1.L$1;
                    h1pVar2 = (h1p) addressGeoPositionProvider$forceUpdatePosition$1.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th) {
                        th = th;
                        h1pVar = h1pVar2;
                        lz40 b = b(h1pVar);
                        i0t i0tVar3 = (i0t) hashMap.get(h1pVar);
                        if (!d() || i0tVar3 == null) {
                            i0t i0tVar4 = (i0t) this.k.get(h1pVar);
                            if (i0tVar4 != null) {
                                i0tVar = i0tVar4;
                            } else {
                                ezs ezsVar = (ezs) ((zaf0) this.d.a.getValue()).b.getValue();
                                if (ezsVar != null) {
                                    i0tVar = c(ezsVar.a);
                                }
                            }
                        } else {
                            i0tVar = i0tVar3;
                        }
                        b.g(i0tVar);
                        jst.e.k(th, "update position failed");
                        return zy11.a;
                    }
                    ru.yandex.taxi.superapp.address.a aVar = (ru.yandex.taxi.superapp.address.a) this.e.get();
                    PositionInitAction positionInitAction = PositionInitAction.CACHE;
                    addressGeoPositionProvider$forceUpdatePosition$1.L$0 = h1pVar2;
                    addressGeoPositionProvider$forceUpdatePosition$1.L$1 = null;
                    addressGeoPositionProvider$forceUpdatePosition$1.L$2 = null;
                    addressGeoPositionProvider$forceUpdatePosition$1.label = 2;
                    obj = aVar.a((zzs) obj, z7l0Var, positionInitAction, addressGeoPositionProvider$forceUpdatePosition$1);
                    if (obj != coroutineSingletons) {
                        h1pVar = h1pVar2;
                        i0t i0tVar22 = (i0t) obj;
                        hashMap.put(h1pVar, i0tVar22);
                        b(h1pVar).g(i0tVar22);
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            ru.yandex.taxi.superapp.address.a aVar2 = (ru.yandex.taxi.superapp.address.a) this.e.get();
            PositionInitAction positionInitAction2 = PositionInitAction.CACHE;
            addressGeoPositionProvider$forceUpdatePosition$1.L$0 = h1pVar2;
            addressGeoPositionProvider$forceUpdatePosition$1.L$1 = null;
            addressGeoPositionProvider$forceUpdatePosition$1.L$2 = null;
            addressGeoPositionProvider$forceUpdatePosition$1.label = 2;
            obj = aVar2.a((zzs) obj, z7l0Var, positionInitAction2, addressGeoPositionProvider$forceUpdatePosition$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        }
        addressGeoPositionProvider$forceUpdatePosition$1 = new AddressGeoPositionProvider$forceUpdatePosition$1(this, continuationImpl);
        obj = addressGeoPositionProvider$forceUpdatePosition$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressGeoPositionProvider$forceUpdatePosition$1.label;
        HashMap hashMap2 = this.j;
        i0t i0tVar5 = null;
    }

    public final lz40 b(h1p h1pVar) {
        return (lz40) this.i.computeIfAbsent(h1pVar, new yu0(0, new p0(28)));
    }

    public final boolean d() {
        return !this.f.a && ((Boolean) this.g.c()).booleanValue();
    }
}
