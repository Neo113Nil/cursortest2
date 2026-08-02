package ru.yandex.taxi.viewholder;

import androidx.lifecycle.Lifecycle;
import defpackage.mbs;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.rt00;
import defpackage.tje;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.p;

/* loaded from: classes10.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MapViewHolder$special$$inlined$safeCollectIn$1$2$1 mapViewHolder$special$$inlined$safeCollectIn$1$2$1;
        int i;
        TaxiMapView d;
        if (continuation instanceof MapViewHolder$special$$inlined$safeCollectIn$1$2$1) {
            mapViewHolder$special$$inlined$safeCollectIn$1$2$1 = (MapViewHolder$special$$inlined$safeCollectIn$1$2$1) continuation;
            int i2 = mapViewHolder$special$$inlined$safeCollectIn$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapViewHolder$special$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mapViewHolder$special$$inlined$safeCollectIn$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapViewHolder$special$$inlined$safeCollectIn$1$2$1.label;
                b bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    switch (rt00.a[((Lifecycle.Event) obj).ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                            break;
                        case 4:
                            bVar.c().setOnTouchListener(new MapViewHolder$CoverTouchListener(bVar, bVar.c().getContext()));
                            bVar.g.a(new mbs(7, bVar), "MapActivityLifecycleListener");
                            p pVar = bVar.b;
                            mapViewHolder$special$$inlined$safeCollectIn$1$2$1.L$0 = null;
                            mapViewHolder$special$$inlined$safeCollectIn$1$2$1.L$1 = null;
                            mapViewHolder$special$$inlined$safeCollectIn$1$2$1.L$2 = null;
                            mapViewHolder$special$$inlined$safeCollectIn$1$2$1.label = 1;
                            if (pVar.c(mapViewHolder$special$$inlined$safeCollectIn$1$2$1) == coroutineSingletons) {
                            }
                            break;
                        case 5:
                            bVar.t = tje.N(bVar.e, null, null, new MapViewHolder$1$2(bVar, null), 3);
                            break;
                        case 6:
                            pzt0 pzt0Var = bVar.t;
                            if (pzt0Var != null) {
                                pzt0Var.a(null);
                            }
                            bVar.t = null;
                            bVar.g.d();
                            break;
                        case 7:
                            bVar.c().setOnTouchListener(null);
                            TaxiMapView d2 = bVar.d();
                            if (d2 != null) {
                                d2.onStop();
                                bVar.i.f(false, new MapViewHolder$onStop$1$1());
                            }
                            break;
                        default:
                            w511.b();
                            break;
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj2);
                d = bVar.d();
                if (d != null) {
                    bVar.i.f(true, new MapViewHolder$onStart$1$1(2, null));
                    d.onStart();
                }
                return zy11.a;
            }
        }
        mapViewHolder$special$$inlined$safeCollectIn$1$2$1 = new MapViewHolder$special$$inlined$safeCollectIn$1$2$1(this, continuation);
        Object obj22 = mapViewHolder$special$$inlined$safeCollectIn$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapViewHolder$special$$inlined$safeCollectIn$1$2$1.label;
        b bVar2 = this.a;
        if (i != 0) {
        }
        d = bVar2.d();
        if (d != null) {
        }
        return zy11.a;
    }
}
