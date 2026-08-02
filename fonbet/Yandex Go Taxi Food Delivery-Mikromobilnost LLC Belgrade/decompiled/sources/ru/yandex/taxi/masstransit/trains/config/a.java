package ru.yandex.taxi.masstransit.trains.config;

import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import defpackage.be01;
import defpackage.d6z;
import defpackage.e9s;
import defpackage.enm0;
import defpackage.g4z0;
import defpackage.ny61;
import defpackage.oov0;
import defpackage.pd01;
import defpackage.td01;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class a {
    public final o a;
    public final be01 b;

    public a(o oVar, be01 be01Var) {
        this.a = oVar;
        this.b = be01Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        TrainsFlowRepository$awaitTrainsConfig$1 trainsFlowRepository$awaitTrainsConfig$1;
        int i;
        Zone g;
        pd01 d;
        if (continuationImpl instanceof TrainsFlowRepository$awaitTrainsConfig$1) {
            trainsFlowRepository$awaitTrainsConfig$1 = (TrainsFlowRepository$awaitTrainsConfig$1) continuationImpl;
            int i2 = trainsFlowRepository$awaitTrainsConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trainsFlowRepository$awaitTrainsConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trainsFlowRepository$awaitTrainsConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trainsFlowRepository$awaitTrainsConfig$1.label;
                if (i != 0) {
                    b.b(obj);
                    g = this.a.g();
                    if (g == null) {
                        TrainsFlowRepository$awaitTrainsConfig$zone$1 trainsFlowRepository$awaitTrainsConfig$zone$1 = new TrainsFlowRepository$awaitTrainsConfig$zone$1(this, null);
                        trainsFlowRepository$awaitTrainsConfig$1.label = 1;
                        obj = kotlinx.coroutines.a.w(5000L, trainsFlowRepository$awaitTrainsConfig$zone$1, trainsFlowRepository$awaitTrainsConfig$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return (g != null || (d = d(g)) == null) ? pd01.e : d;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                g = (Zone) obj;
                if (g != null) {
                }
            }
        }
        trainsFlowRepository$awaitTrainsConfig$1 = new TrainsFlowRepository$awaitTrainsConfig$1(this, continuationImpl);
        Object obj2 = trainsFlowRepository$awaitTrainsConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trainsFlowRepository$awaitTrainsConfig$1.label;
        if (i != 0) {
        }
        g = (Zone) obj2;
        if (g != null) {
        }
    }

    public final pd01 b() {
        pd01 d;
        Zone g = this.a.g();
        if (g != null && (d = d(g)) != null) {
            return d;
        }
        pd01 pd01Var = pd01.e;
        return pd01.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        TrainsFlowRepository$isTrainsConfigEnabledAwait$1 trainsFlowRepository$isTrainsConfigEnabledAwait$1;
        int i;
        if (continuationImpl instanceof TrainsFlowRepository$isTrainsConfigEnabledAwait$1) {
            trainsFlowRepository$isTrainsConfigEnabledAwait$1 = (TrainsFlowRepository$isTrainsConfigEnabledAwait$1) continuationImpl;
            int i2 = trainsFlowRepository$isTrainsConfigEnabledAwait$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trainsFlowRepository$isTrainsConfigEnabledAwait$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trainsFlowRepository$isTrainsConfigEnabledAwait$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trainsFlowRepository$isTrainsConfigEnabledAwait$1.label;
                if (i != 0) {
                    b.b(obj);
                    trainsFlowRepository$isTrainsConfigEnabledAwait$1.label = 1;
                    obj = a(trainsFlowRepository$isTrainsConfigEnabledAwait$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return Boolean.valueOf(((pd01) obj).a);
            }
        }
        trainsFlowRepository$isTrainsConfigEnabledAwait$1 = new TrainsFlowRepository$isTrainsConfigEnabledAwait$1(this, continuationImpl);
        Object obj3 = trainsFlowRepository$isTrainsConfigEnabledAwait$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trainsFlowRepository$isTrainsConfigEnabledAwait$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((pd01) obj3).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    public final pd01 d(Zone zone) {
        oov0 oov0Var;
        pd01.b bVar;
        pd01.a aVar;
        pd01.a aVar2;
        List list;
        ?? r7;
        td01 td01Var = (td01) zone.z.a(td01.class);
        if (td01Var == null || !td01Var.c) {
            td01Var = null;
        }
        if (td01Var == null) {
            return null;
        }
        this.b.getClass();
        boolean z = td01Var.c;
        td01.a aVar3 = td01Var.f;
        td01.d dVar = td01Var.d;
        if (dVar != null) {
            g4z0 g4z0Var = new g4z0(dVar.a, e9s.b(dVar.b, td01Var));
            enm0 enm0Var = new enm0(e9s.b(dVar.c, td01Var));
            EmptyList emptyList = EmptyList.a;
            if (aVar3 == null || (list = aVar3.a) == null) {
                list = emptyList;
            }
            if (aVar3 != null && (r7 = aVar3.b) != 0) {
                emptyList = r7;
            }
            oov0Var = new oov0(g4z0Var, enm0Var, list, emptyList);
        } else {
            oov0Var = null;
        }
        td01.c cVar = td01Var.e;
        if (cVar != null) {
            td01.b bVar2 = cVar.a;
            if (bVar2 != null) {
                String str = bVar2.a;
                if (str == null) {
                    str = null;
                } else if (d6z.Z(td01Var, str)) {
                    str = d6z.Y(td01Var, str);
                }
                String str2 = bVar2.b;
                if (str2 == null) {
                    str2 = null;
                } else if (d6z.Z(td01Var, str2)) {
                    str2 = d6z.Y(td01Var, str2);
                }
                aVar = new pd01.a(str, str2, bVar2.c);
            } else {
                aVar = null;
            }
            td01.b bVar3 = cVar.b;
            if (bVar3 != null) {
                String str3 = bVar3.a;
                if (str3 == null) {
                    str3 = null;
                } else if (d6z.Z(td01Var, str3)) {
                    str3 = d6z.Y(td01Var, str3);
                }
                String str4 = bVar3.b;
                if (str4 == null) {
                    str4 = null;
                } else if (d6z.Z(td01Var, str4)) {
                    str4 = d6z.Y(td01Var, str4);
                }
                aVar2 = new pd01.a(str3, str4, bVar3.c);
            } else {
                aVar2 = null;
            }
            String str5 = cVar.c;
            bVar = new pd01.b(aVar, aVar2, str5 != null ? d6z.Z(td01Var, str5) ? d6z.Y(td01Var, str5) : str5 : null);
        } else {
            bVar = null;
        }
        return new pd01(z, oov0Var, bVar, aVar3 != null ? aVar3.c : true, 8);
    }
}
