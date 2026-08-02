package ru.yandex.taxi.masstransit.deeplink;

import com.yandex.mapkit.transport.masstransit.Stop;
import defpackage.igu0;
import defpackage.ny61;
import defpackage.o140;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.masstransit.api.model.OpenReason;

/* loaded from: classes9.dex */
public final class f {
    public final ru.yandex.taxi.masstransit.datasource.schedule.b a;

    public f(ru.yandex.taxi.masstransit.datasource.schedule.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        if (r4 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Double d, Double d2, String str2, ContinuationImpl continuationImpl) {
        MasstransitStopDeeplinkResolver$resolveStopModel$1 masstransitStopDeeplinkResolver$resolveStopModel$1;
        int i;
        Double d3;
        Double d4;
        Object obj;
        String str3;
        o140 o140Var;
        zzs zzsVar;
        Stop b;
        String name;
        String str4;
        String str5 = str;
        if (continuationImpl instanceof MasstransitStopDeeplinkResolver$resolveStopModel$1) {
            masstransitStopDeeplinkResolver$resolveStopModel$1 = (MasstransitStopDeeplinkResolver$resolveStopModel$1) continuationImpl;
            int i2 = masstransitStopDeeplinkResolver$resolveStopModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitStopDeeplinkResolver$resolveStopModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = masstransitStopDeeplinkResolver$resolveStopModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitStopDeeplinkResolver$resolveStopModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    masstransitStopDeeplinkResolver$resolveStopModel$1.L$0 = str5;
                    d3 = d;
                    masstransitStopDeeplinkResolver$resolveStopModel$1.L$1 = d3;
                    d4 = d2;
                    masstransitStopDeeplinkResolver$resolveStopModel$1.L$2 = d4;
                    masstransitStopDeeplinkResolver$resolveStopModel$1.L$3 = str2;
                    masstransitStopDeeplinkResolver$resolveStopModel$1.label = 1;
                    Object b2 = this.a.b(str5, masstransitStopDeeplinkResolver$resolveStopModel$1);
                    if (b2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b2;
                    str3 = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) masstransitStopDeeplinkResolver$resolveStopModel$1.L$3;
                    Double d5 = (Double) masstransitStopDeeplinkResolver$resolveStopModel$1.L$2;
                    Double d6 = (Double) masstransitStopDeeplinkResolver$resolveStopModel$1.L$1;
                    String str6 = (String) masstransitStopDeeplinkResolver$resolveStopModel$1.L$0;
                    kotlin.b.b(obj2);
                    d4 = d5;
                    str5 = str6;
                    obj = obj2;
                    d3 = d6;
                }
                o140Var = (o140) obj;
                if (o140Var != null && (zzsVar = o140Var.a()) != null) {
                    if (zzsVar.equals(zzs.f)) {
                        zzsVar = null;
                    }
                }
                zzsVar = (d3 != null || d4 == null) ? null : new zzs(d3.doubleValue(), d4.doubleValue(), 0, null, null, 28);
                if (zzsVar == null) {
                    return null;
                }
                if (o140Var != null && (b = o140Var.b()) != null && (name = b.getName()) != null) {
                    str4 = name.length() != 0 ? name : null;
                    if (str4 != null) {
                        str3 = str4;
                        return new igu0(str5, zzsVar, str3, OpenReason.STOP_CARD);
                    }
                }
                if (str3 == null) {
                    str3 = "";
                }
                return new igu0(str5, zzsVar, str3, OpenReason.STOP_CARD);
            }
        }
        masstransitStopDeeplinkResolver$resolveStopModel$1 = new MasstransitStopDeeplinkResolver$resolveStopModel$1(this, continuationImpl);
        Object obj22 = masstransitStopDeeplinkResolver$resolveStopModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitStopDeeplinkResolver$resolveStopModel$1.label;
        if (i != 0) {
        }
        o140Var = (o140) obj;
        if (o140Var != null) {
            if (zzsVar.equals(zzs.f)) {
            }
        }
        if (d3 != null) {
        }
        if (zzsVar == null) {
        }
        if (o140Var != null) {
            if (name.length() != 0) {
            }
            if (str4 != null) {
            }
        }
        if (str3 == null) {
        }
        return new igu0(str5, zzsVar, str3, OpenReason.STOP_CARD);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        MasstransitStopDeeplinkResolver$resolveStopPoint$1 masstransitStopDeeplinkResolver$resolveStopPoint$1;
        int i;
        o140 o140Var;
        zzs a;
        if (continuationImpl instanceof MasstransitStopDeeplinkResolver$resolveStopPoint$1) {
            masstransitStopDeeplinkResolver$resolveStopPoint$1 = (MasstransitStopDeeplinkResolver$resolveStopPoint$1) continuationImpl;
            int i2 = masstransitStopDeeplinkResolver$resolveStopPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitStopDeeplinkResolver$resolveStopPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = masstransitStopDeeplinkResolver$resolveStopPoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitStopDeeplinkResolver$resolveStopPoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    masstransitStopDeeplinkResolver$resolveStopPoint$1.L$0 = null;
                    masstransitStopDeeplinkResolver$resolveStopPoint$1.label = 1;
                    obj = this.a.b(str, masstransitStopDeeplinkResolver$resolveStopPoint$1);
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
                o140Var = (o140) obj;
                if (o140Var != null || (a = o140Var.a()) == null || a.equals(zzs.f)) {
                    return null;
                }
                return a;
            }
        }
        masstransitStopDeeplinkResolver$resolveStopPoint$1 = new MasstransitStopDeeplinkResolver$resolveStopPoint$1(this, continuationImpl);
        Object obj2 = masstransitStopDeeplinkResolver$resolveStopPoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitStopDeeplinkResolver$resolveStopPoint$1.label;
        if (i != 0) {
        }
        o140Var = (o140) obj2;
        if (o140Var != null) {
        }
        return null;
    }
}
