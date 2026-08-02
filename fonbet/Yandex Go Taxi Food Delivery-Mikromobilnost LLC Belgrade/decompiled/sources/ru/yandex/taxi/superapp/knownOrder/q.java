package ru.yandex.taxi.superapp.knownOrder;

import com.yandex.go.shortcuts.dto.request.WayPoint;
import com.yandex.go.shortcuts.dto.request.WayType;
import defpackage.gwk0;
import defpackage.h1p;
import defpackage.kx70;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.w2p;
import defpackage.ycc;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class q implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ u b;

    public q(vpr vprVar, u uVar) {
        this.a = vprVar;
        this.b = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        KnownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1 knownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof KnownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1) {
            knownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1 = (KnownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1) continuation;
            int i2 = knownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                knownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = knownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = knownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        h1p h1pVar = (h1p) entry.getKey();
                        Set<w2p> set = (Set) entry.getValue();
                        ArrayList arrayList2 = new ArrayList(tcc.n(set, 10));
                        for (w2p w2pVar : set) {
                            this.b.h.getClass();
                            ListBuilder a = rcc.a();
                            zzs e = w2pVar.e();
                            if (e != null) {
                                a.add(new WayPoint(WayType.A, e));
                            }
                            zzs b = w2pVar.b();
                            if (b != null) {
                                a.add(new WayPoint(WayType.B, b));
                            }
                            arrayList2.add(new kx70(w2pVar.c(), gwk0.t(h1pVar.getValue()), a.j(), null, w2pVar.d(), w2pVar.a(), null, 72));
                        }
                        ycc.r(arrayList2, arrayList);
                    }
                    knownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1.L$0 = null;
                    knownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1.L$1 = null;
                    knownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1.L$2 = null;
                    knownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1.L$3 = null;
                    knownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, knownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        knownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1 = new KnownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1(this, continuation);
        Object obj22 = knownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = knownOrdersRepositoryImpl$superAppKnownOrdersInfo$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
