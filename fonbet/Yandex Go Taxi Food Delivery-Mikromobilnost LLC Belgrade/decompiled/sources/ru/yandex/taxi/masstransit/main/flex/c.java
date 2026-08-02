package ru.yandex.taxi.masstransit.main.flex;

import com.yandex.go.address.models.Address;
import defpackage.jst;
import defpackage.lz30;
import defpackage.m6a0;
import defpackage.mo21;
import defpackage.nu30;
import defpackage.ny61;
import defpackage.po21;
import defpackage.u1m;
import defpackage.wnt;
import defpackage.wu30;
import defpackage.xnt;
import defpackage.zzs;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.preorder.source.userposition.e;
import ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException;

/* loaded from: classes6.dex */
public final class c {
    public final wnt a;
    public final wu30 b;
    public final po21 c;
    public final lz30 d;

    public c(wnt wntVar, wu30 wu30Var, po21 po21Var, lz30 lz30Var) {
        this.a = wntVar;
        this.b = wu30Var;
        this.c = po21Var;
        this.d = lz30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MtQueryFactory$createGeoParams$1 mtQueryFactory$createGeoParams$1;
        int i;
        zzs B;
        if (continuationImpl instanceof MtQueryFactory$createGeoParams$1) {
            mtQueryFactory$createGeoParams$1 = (MtQueryFactory$createGeoParams$1) continuationImpl;
            int i2 = mtQueryFactory$createGeoParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtQueryFactory$createGeoParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtQueryFactory$createGeoParams$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtQueryFactory$createGeoParams$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Address h = this.b.h();
                    if (h != null) {
                        B = h.B();
                        m6a0 a = this.d.a();
                        return ((xnt) this.a).f(new nu30(B, (a != null ? a.a : null) == PaymentMethod$Type.TRANSPORT_CARD ? a.b : null), nu30.Companion.serializer());
                    }
                    mtQueryFactory$createGeoParams$1.L$0 = null;
                    mtQueryFactory$createGeoParams$1.label = 1;
                    obj = c(mtQueryFactory$createGeoParams$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                mo21 mo21Var = (mo21) obj;
                B = new zzs(mo21Var.a, mo21Var.b, 0, null, null, 28);
                m6a0 a2 = this.d.a();
                return ((xnt) this.a).f(new nu30(B, (a2 != null ? a2.a : null) == PaymentMethod$Type.TRANSPORT_CARD ? a2.b : null), nu30.Companion.serializer());
            }
        }
        mtQueryFactory$createGeoParams$1 = new MtQueryFactory$createGeoParams$1(this, continuationImpl);
        Object obj3 = mtQueryFactory$createGeoParams$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtQueryFactory$createGeoParams$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj3;
        B = new zzs(mo21Var2.a, mo21Var2.b, 0, null, null, 28);
        m6a0 a22 = this.d.a();
        return ((xnt) this.a).f(new nu30(B, (a22 != null ? a22.a : null) == PaymentMethod$Type.TRANSPORT_CARD ? a22.b : null), nu30.Companion.serializer());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MtQueryFactory$createQuery$1 mtQueryFactory$createQuery$1;
        int i;
        if (continuationImpl instanceof MtQueryFactory$createQuery$1) {
            mtQueryFactory$createQuery$1 = (MtQueryFactory$createQuery$1) continuationImpl;
            int i2 = mtQueryFactory$createQuery$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtQueryFactory$createQuery$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtQueryFactory$createQuery$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtQueryFactory$createQuery$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mtQueryFactory$createQuery$1.label = 1;
                    obj = a(mtQueryFactory$createQuery$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new u1m(kotlin.collections.b.f(), "bdui/v1/masstransit/main", (Map) obj);
            }
        }
        mtQueryFactory$createQuery$1 = new MtQueryFactory$createQuery$1(this, continuationImpl);
        Object obj3 = mtQueryFactory$createQuery$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtQueryFactory$createQuery$1.label;
        if (i != 0) {
        }
        return new u1m(kotlin.collections.b.f(), "bdui/v1/masstransit/main", (Map) obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        MtQueryFactory$getUserLocation$1 mtQueryFactory$getUserLocation$1;
        int i;
        try {
            if (continuationImpl instanceof MtQueryFactory$getUserLocation$1) {
                mtQueryFactory$getUserLocation$1 = (MtQueryFactory$getUserLocation$1) continuationImpl;
                int i2 = mtQueryFactory$getUserLocation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mtQueryFactory$getUserLocation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mtQueryFactory$getUserLocation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mtQueryFactory$getUserLocation$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        po21 po21Var = this.c;
                        mtQueryFactory$getUserLocation$1.label = 1;
                        obj = ((e) po21Var).f(mtQueryFactory$getUserLocation$1);
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
                    return (mo21) obj;
                }
            }
            if (i != 0) {
            }
            return (mo21) obj;
        } catch (LocationRequirementsException e) {
            jst.e.k(e, "Can't get location for masstransit flex query");
            mo21 fallbackUserLocation = e.getFallbackUserLocation();
            if (fallbackUserLocation != null) {
                return fallbackUserLocation;
            }
            throw e;
        } catch (Exception e2) {
            throw e2;
        }
        mtQueryFactory$getUserLocation$1 = new MtQueryFactory$getUserLocation$1(this, continuationImpl);
        Object obj2 = mtQueryFactory$getUserLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtQueryFactory$getUserLocation$1.label;
    }
}
