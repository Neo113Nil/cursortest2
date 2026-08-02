package ru.yandex.taxi.masstransit.mapper;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yandex.mapkit.geometry.Point;
import defpackage.ck40;
import defpackage.cwa1;
import defpackage.dk40;
import defpackage.ds30;
import defpackage.ek40;
import defpackage.fc30;
import defpackage.fk40;
import defpackage.h640;
import defpackage.hj40;
import defpackage.hz30;
import defpackage.nk40;
import defpackage.ny61;
import defpackage.obm;
import defpackage.sk40;
import defpackage.su30;
import defpackage.w511;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class g {
    public final Context a;
    public final d b;
    public final h640 c;
    public final c d;

    public g(Context context, d dVar, h640 h640Var, c cVar) {
        this.a = context;
        this.b = dVar;
        this.c = h640Var;
        this.d = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d9, code lost:
    
        if (r13 == r0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sk40 sk40Var, fc30 fc30Var, ContinuationImpl continuationImpl) {
        MtViewOnMapOverlayUiStateMapper$mapUiState$1 mtViewOnMapOverlayUiStateMapper$mapUiState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        float f;
        Object a;
        sk40 sk40Var2;
        ds30 ds30Var;
        float f2;
        fk40 fk40Var;
        hj40 a2;
        ds30 ds30Var2;
        if (continuationImpl instanceof MtViewOnMapOverlayUiStateMapper$mapUiState$1) {
            mtViewOnMapOverlayUiStateMapper$mapUiState$1 = (MtViewOnMapOverlayUiStateMapper$mapUiState$1) continuationImpl;
            int i2 = mtViewOnMapOverlayUiStateMapper$mapUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtViewOnMapOverlayUiStateMapper$mapUiState$1.label = i2 - Integer.MIN_VALUE;
                MtViewOnMapOverlayUiStateMapper$mapUiState$1 mtViewOnMapOverlayUiStateMapper$mapUiState$12 = mtViewOnMapOverlayUiStateMapper$mapUiState$1;
                Object obj = mtViewOnMapOverlayUiStateMapper$mapUiState$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtViewOnMapOverlayUiStateMapper$mapUiState$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Iterator it = sk40Var.a.a.iterator();
                    if (!it.hasNext()) {
                        ny61.p();
                        return null;
                    }
                    int b = ((hz30) it.next()).b();
                    while (it.hasNext()) {
                        int b2 = ((hz30) it.next()).b();
                        if (b < b2) {
                            b = b2;
                        }
                    }
                    f = b;
                    Point d = cwa1.d(sk40Var.a.g.a.d);
                    obm obmVar = fc30Var.a;
                    Drawable drawable = obmVar != null ? obmVar.b : null;
                    mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$0 = sk40Var;
                    mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$1 = null;
                    mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$2 = null;
                    mtViewOnMapOverlayUiStateMapper$mapUiState$12.F$0 = f;
                    mtViewOnMapOverlayUiStateMapper$mapUiState$12.label = 1;
                    obj = this.b.f(d, f, drawable, null, mtViewOnMapOverlayUiStateMapper$mapUiState$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ds30Var2 = (ds30) mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$5;
                            ds30Var = (ds30) mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$3;
                            kotlin.b.b(obj);
                            return new nk40(ds30Var, ds30Var2, (List) obj);
                        }
                        float f3 = mtViewOnMapOverlayUiStateMapper$mapUiState$12.F$0;
                        ds30 ds30Var3 = (ds30) mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$3;
                        sk40Var2 = (sk40) mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$0;
                        kotlin.b.b(obj);
                        f2 = f3;
                        ds30Var = ds30Var3;
                        ds30 ds30Var4 = (ds30) obj;
                        mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$0 = null;
                        mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$1 = null;
                        mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$2 = null;
                        mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$3 = ds30Var;
                        mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$4 = null;
                        mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$5 = ds30Var4;
                        mtViewOnMapOverlayUiStateMapper$mapUiState$12.F$0 = f2;
                        mtViewOnMapOverlayUiStateMapper$mapUiState$12.label = 3;
                        fk40Var = sk40Var2.b;
                        if (!fk40Var.equals(ck40.a)) {
                            a2 = null;
                        } else if (fk40Var instanceof dk40) {
                            a2 = ((dk40) fk40Var).a.a;
                        } else {
                            if (!(fk40Var instanceof ek40)) {
                                w511.b();
                                return null;
                            }
                            a2 = ((ek40) fk40Var).a.a();
                        }
                        su30 su30Var = sk40Var2.a;
                        obj = this.b.d(su30Var.a, su30Var.b, f2, new MtViewOnMapOverlayUiStateMapper$mapOverlaySections$2(this, a2, f2, null), new MtViewOnMapOverlayUiStateMapper$mapOverlaySections$3(this, null), mtViewOnMapOverlayUiStateMapper$mapUiState$12);
                        if (obj != coroutineSingletons) {
                            ds30Var2 = ds30Var4;
                            return new nk40(ds30Var, ds30Var2, (List) obj);
                        }
                        return coroutineSingletons;
                    }
                    float f4 = mtViewOnMapOverlayUiStateMapper$mapUiState$12.F$0;
                    sk40 sk40Var3 = (sk40) mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$0;
                    kotlin.b.b(obj);
                    f = f4;
                    sk40Var = sk40Var3;
                }
                ds30 ds30Var5 = (ds30) obj;
                Point d2 = cwa1.d(sk40Var.a.g.b.d);
                mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$0 = sk40Var;
                mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$1 = null;
                mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$2 = null;
                mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$3 = ds30Var5;
                mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$4 = null;
                mtViewOnMapOverlayUiStateMapper$mapUiState$12.F$0 = f;
                mtViewOnMapOverlayUiStateMapper$mapUiState$12.label = 2;
                a = this.b.a(d2, f, mtViewOnMapOverlayUiStateMapper$mapUiState$12);
                if (a != coroutineSingletons) {
                    sk40Var2 = sk40Var;
                    ds30Var = ds30Var5;
                    f2 = f;
                    obj = a;
                    ds30 ds30Var42 = (ds30) obj;
                    mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$0 = null;
                    mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$1 = null;
                    mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$2 = null;
                    mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$3 = ds30Var;
                    mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$4 = null;
                    mtViewOnMapOverlayUiStateMapper$mapUiState$12.L$5 = ds30Var42;
                    mtViewOnMapOverlayUiStateMapper$mapUiState$12.F$0 = f2;
                    mtViewOnMapOverlayUiStateMapper$mapUiState$12.label = 3;
                    fk40Var = sk40Var2.b;
                    if (!fk40Var.equals(ck40.a)) {
                    }
                    su30 su30Var2 = sk40Var2.a;
                    obj = this.b.d(su30Var2.a, su30Var2.b, f2, new MtViewOnMapOverlayUiStateMapper$mapOverlaySections$2(this, a2, f2, null), new MtViewOnMapOverlayUiStateMapper$mapOverlaySections$3(this, null), mtViewOnMapOverlayUiStateMapper$mapUiState$12);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        mtViewOnMapOverlayUiStateMapper$mapUiState$1 = new MtViewOnMapOverlayUiStateMapper$mapUiState$1(this, continuationImpl);
        MtViewOnMapOverlayUiStateMapper$mapUiState$1 mtViewOnMapOverlayUiStateMapper$mapUiState$122 = mtViewOnMapOverlayUiStateMapper$mapUiState$1;
        Object obj2 = mtViewOnMapOverlayUiStateMapper$mapUiState$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtViewOnMapOverlayUiStateMapper$mapUiState$122.label;
        if (i != 0) {
        }
        ds30 ds30Var52 = (ds30) obj2;
        Point d22 = cwa1.d(sk40Var.a.g.b.d);
        mtViewOnMapOverlayUiStateMapper$mapUiState$122.L$0 = sk40Var;
        mtViewOnMapOverlayUiStateMapper$mapUiState$122.L$1 = null;
        mtViewOnMapOverlayUiStateMapper$mapUiState$122.L$2 = null;
        mtViewOnMapOverlayUiStateMapper$mapUiState$122.L$3 = ds30Var52;
        mtViewOnMapOverlayUiStateMapper$mapUiState$122.L$4 = null;
        mtViewOnMapOverlayUiStateMapper$mapUiState$122.F$0 = f;
        mtViewOnMapOverlayUiStateMapper$mapUiState$122.label = 2;
        a = this.b.a(d22, f, mtViewOnMapOverlayUiStateMapper$mapUiState$122);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
