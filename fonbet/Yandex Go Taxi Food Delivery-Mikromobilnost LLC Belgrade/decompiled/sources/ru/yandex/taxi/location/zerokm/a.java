package ru.yandex.taxi.location.zerokm;

import defpackage.avj0;
import defpackage.gc61;
import defpackage.h3y;
import defpackage.jst;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.y810;
import defpackage.yxh0;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;

/* loaded from: classes9.dex */
public final class a {
    public final ru.yandex.taxi.location.zerokm.datasource.a a;
    public final h3y b;
    public final y810 c;
    public final zuj0 d;

    public a(ru.yandex.taxi.location.zerokm.datasource.a aVar, h3y h3yVar, y810 y810Var, zuj0 zuj0Var) {
        this.a = aVar;
        this.b = h3yVar;
        this.c = y810Var;
        this.d = zuj0Var;
    }

    public final zzs a() {
        int i = yxh0.lat;
        avj0 avj0Var = (avj0) this.d;
        return new zzs(Double.parseDouble(avj0Var.h(i)), Double.parseDouble(avj0Var.h(yxh0.lon)), 0, CoordinateProvider$Source.ZERO_KM.toString(), null, 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ZeroKmRepository$getFromDefaultSourceAndUpdateDb$1 zeroKmRepository$getFromDefaultSourceAndUpdateDb$1;
        Object obj;
        int i;
        Map map;
        Map map2;
        gc61 gc61Var;
        if (continuationImpl instanceof ZeroKmRepository$getFromDefaultSourceAndUpdateDb$1) {
            zeroKmRepository$getFromDefaultSourceAndUpdateDb$1 = (ZeroKmRepository$getFromDefaultSourceAndUpdateDb$1) continuationImpl;
            int i2 = zeroKmRepository$getFromDefaultSourceAndUpdateDb$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zeroKmRepository$getFromDefaultSourceAndUpdateDb$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = zeroKmRepository$getFromDefaultSourceAndUpdateDb$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zeroKmRepository$getFromDefaultSourceAndUpdateDb$1.label;
                if (i != 0) {
                    b.b(obj2);
                    ru.yandex.taxi.location.zerokm.datasource.b bVar = (ru.yandex.taxi.location.zerokm.datasource.b) this.b.get();
                    zeroKmRepository$getFromDefaultSourceAndUpdateDb$1.L$0 = str;
                    zeroKmRepository$getFromDefaultSourceAndUpdateDb$1.label = 1;
                    obj2 = bVar.a(zeroKmRepository$getFromDefaultSourceAndUpdateDb$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        map2 = (Map) zeroKmRepository$getFromDefaultSourceAndUpdateDb$1.L$1;
                        str = (String) zeroKmRepository$getFromDefaultSourceAndUpdateDb$1.L$0;
                        b.b(obj2);
                        gc61Var = (gc61) map2.get(str);
                        if (gc61Var == null) {
                            return gc61Var;
                        }
                        ny61.g(oyr.p("Zero kilometer by mcc '", str, "' is not found"));
                        return null;
                    }
                    str = (String) zeroKmRepository$getFromDefaultSourceAndUpdateDb$1.L$0;
                    b.b(obj2);
                }
                map = (Map) obj2;
                zeroKmRepository$getFromDefaultSourceAndUpdateDb$1.L$0 = str;
                zeroKmRepository$getFromDefaultSourceAndUpdateDb$1.L$1 = map;
                zeroKmRepository$getFromDefaultSourceAndUpdateDb$1.label = 2;
                if (e(map, zeroKmRepository$getFromDefaultSourceAndUpdateDb$1) != obj) {
                    map2 = map;
                    gc61Var = (gc61) map2.get(str);
                    if (gc61Var == null) {
                    }
                }
                return obj;
            }
        }
        zeroKmRepository$getFromDefaultSourceAndUpdateDb$1 = new ZeroKmRepository$getFromDefaultSourceAndUpdateDb$1(this, continuationImpl);
        Object obj22 = zeroKmRepository$getFromDefaultSourceAndUpdateDb$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zeroKmRepository$getFromDefaultSourceAndUpdateDb$1.label;
        if (i != 0) {
        }
        map = (Map) obj22;
        zeroKmRepository$getFromDefaultSourceAndUpdateDb$1.L$0 = str;
        zeroKmRepository$getFromDefaultSourceAndUpdateDb$1.L$1 = map;
        zeroKmRepository$getFromDefaultSourceAndUpdateDb$1.label = 2;
        if (e(map, zeroKmRepository$getFromDefaultSourceAndUpdateDb$1) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|8|(1:(1:(4:12|13|14|15)(2:17|18))(2:19|20))(3:23|24|(2:26|27))|21|14|15))|37|6|7|8|(0)(0)|21|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        if ((r0 instanceof ru.yandex.taxi.location.zerokm.datasource.ZeroKmDbSource$NoSuchMccException) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        r12.L$0 = null;
        r12.L$1 = null;
        r12.L$2 = null;
        r12.label = 2;
        r0 = b(r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (r0 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        ZeroKmRepository$getGeoPointByMcc$1 zeroKmRepository$getGeoPointByMcc$1;
        int i;
        gc61 gc61Var;
        if (continuationImpl instanceof ZeroKmRepository$getGeoPointByMcc$1) {
            zeroKmRepository$getGeoPointByMcc$1 = (ZeroKmRepository$getGeoPointByMcc$1) continuationImpl;
            int i2 = zeroKmRepository$getGeoPointByMcc$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zeroKmRepository$getGeoPointByMcc$1.label = i2 - Integer.MIN_VALUE;
                ZeroKmRepository$getGeoPointByMcc$1 zeroKmRepository$getGeoPointByMcc$12 = zeroKmRepository$getGeoPointByMcc$1;
                Object obj = zeroKmRepository$getGeoPointByMcc$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zeroKmRepository$getGeoPointByMcc$12.label;
                if (i != 0) {
                    b.b(obj);
                    ru.yandex.taxi.location.zerokm.datasource.a aVar = this.a;
                    zeroKmRepository$getGeoPointByMcc$12.L$0 = str;
                    zeroKmRepository$getGeoPointByMcc$12.label = 1;
                    obj = aVar.a(str, zeroKmRepository$getGeoPointByMcc$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        gc61Var = (gc61) obj;
                        return new zzs(gc61Var.a(), gc61Var.b(), 0, CoordinateProvider$Source.ZERO_KM.toString(), null, 16);
                    }
                    str = (String) zeroKmRepository$getGeoPointByMcc$12.L$0;
                    b.b(obj);
                }
                gc61Var = (gc61) obj;
                return new zzs(gc61Var.a(), gc61Var.b(), 0, CoordinateProvider$Source.ZERO_KM.toString(), null, 16);
            }
        }
        zeroKmRepository$getGeoPointByMcc$1 = new ZeroKmRepository$getGeoPointByMcc$1(this, continuationImpl);
        ZeroKmRepository$getGeoPointByMcc$1 zeroKmRepository$getGeoPointByMcc$122 = zeroKmRepository$getGeoPointByMcc$1;
        Object obj3 = zeroKmRepository$getGeoPointByMcc$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zeroKmRepository$getGeoPointByMcc$122.label;
        if (i != 0) {
        }
        gc61Var = (gc61) obj3;
        return new zzs(gc61Var.a(), gc61Var.b(), 0, CoordinateProvider$Source.ZERO_KM.toString(), null, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ZeroKmRepository$getZeroKm$1 zeroKmRepository$getZeroKm$1;
        int i;
        try {
            if (continuationImpl instanceof ZeroKmRepository$getZeroKm$1) {
                zeroKmRepository$getZeroKm$1 = (ZeroKmRepository$getZeroKm$1) continuationImpl;
                int i2 = zeroKmRepository$getZeroKm$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zeroKmRepository$getZeroKm$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = zeroKmRepository$getZeroKm$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = zeroKmRepository$getZeroKm$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    b.b(obj);
                    String a = this.c.a();
                    if (a.equals("-1")) {
                        return a();
                    }
                    zeroKmRepository$getZeroKm$1.L$0 = null;
                    zeroKmRepository$getZeroKm$1.label = 1;
                    Object c = c(a, zeroKmRepository$getZeroKm$1);
                    return c == obj2 ? obj2 : c;
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return a();
        }
        zeroKmRepository$getZeroKm$1 = new ZeroKmRepository$getZeroKm$1(this, continuationImpl);
        Object obj3 = zeroKmRepository$getZeroKm$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zeroKmRepository$getZeroKm$1.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|27|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        defpackage.unr0.C(new java.lang.Object[]{r5.getMessage()}, 1, "Zero km db table is NOT updated due %s", defpackage.jst.e);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Map map, ContinuationImpl continuationImpl) {
        ZeroKmRepository$saveInDb$1 zeroKmRepository$saveInDb$1;
        int i;
        if (continuationImpl instanceof ZeroKmRepository$saveInDb$1) {
            zeroKmRepository$saveInDb$1 = (ZeroKmRepository$saveInDb$1) continuationImpl;
            int i2 = zeroKmRepository$saveInDb$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zeroKmRepository$saveInDb$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zeroKmRepository$saveInDb$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zeroKmRepository$saveInDb$1.label;
                if (i != 0) {
                    b.b(obj);
                    ru.yandex.taxi.location.zerokm.datasource.a aVar = this.a;
                    Collection unmodifiableCollection = Collections.unmodifiableCollection(map.values());
                    zeroKmRepository$saveInDb$1.L$0 = null;
                    zeroKmRepository$saveInDb$1.label = 1;
                    if (aVar.b(unmodifiableCollection, zeroKmRepository$saveInDb$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                jst.e.getClass();
                return zy11.a;
            }
        }
        zeroKmRepository$saveInDb$1 = new ZeroKmRepository$saveInDb$1(this, continuationImpl);
        Object obj2 = zeroKmRepository$saveInDb$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zeroKmRepository$saveInDb$1.label;
        if (i != 0) {
        }
        jst.e.getClass();
        return zy11.a;
    }
}
