package ru.yandex.taxi.masstransit.detailedroute.mapper;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yandex.mapkit.geometry.Point;
import defpackage.cwa1;
import defpackage.ds30;
import defpackage.fay0;
import defpackage.fc30;
import defpackage.gf30;
import defpackage.hf30;
import defpackage.hj40;
import defpackage.hz30;
import defpackage.if30;
import defpackage.jf30;
import defpackage.jl40;
import defpackage.m2j;
import defpackage.ny61;
import defpackage.obm;
import defpackage.su30;
import defpackage.w511;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.masstransit.mapper.c;
import ru.yandex.taxi.masstransit.mapper.d;

/* loaded from: classes6.dex */
public final class a {
    public final Context a;
    public final d b;
    public final c c;

    public a(Context context, d dVar, c cVar) {
        this.a = context;
        this.b = dVar;
        this.c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(su30 su30Var, jf30 jf30Var, fc30 fc30Var, fay0 fay0Var, ContinuationImpl continuationImpl) {
        MtDetailedRouteMapUiStateMapper$mapUiState$1 mtDetailedRouteMapUiStateMapper$mapUiState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        float f;
        jf30 jf30Var2;
        Object obj;
        fay0 fay0Var2;
        Object a;
        su30 su30Var2;
        jf30 jf30Var3;
        float f2;
        ds30 ds30Var;
        hj40 a2;
        hj40 hj40Var;
        ds30 ds30Var2;
        ds30 ds30Var3;
        su30 su30Var3 = su30Var;
        if (continuationImpl instanceof MtDetailedRouteMapUiStateMapper$mapUiState$1) {
            mtDetailedRouteMapUiStateMapper$mapUiState$1 = (MtDetailedRouteMapUiStateMapper$mapUiState$1) continuationImpl;
            int i2 = mtDetailedRouteMapUiStateMapper$mapUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtDetailedRouteMapUiStateMapper$mapUiState$1.label = i2 - Integer.MIN_VALUE;
                MtDetailedRouteMapUiStateMapper$mapUiState$1 mtDetailedRouteMapUiStateMapper$mapUiState$12 = mtDetailedRouteMapUiStateMapper$mapUiState$1;
                Object obj2 = mtDetailedRouteMapUiStateMapper$mapUiState$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDetailedRouteMapUiStateMapper$mapUiState$12.label;
                if (i != 0) {
                    b.b(obj2);
                    Iterator it = su30Var3.a.iterator();
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
                    Point d = cwa1.d(su30Var3.g.a.d);
                    obm obmVar = fc30Var.a;
                    Drawable drawable = obmVar != null ? obmVar.b : null;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$0 = su30Var3;
                    jf30Var2 = jf30Var;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$1 = jf30Var2;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$2 = null;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$3 = fay0Var;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$4 = null;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.F$0 = f;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.label = 1;
                    Object f3 = this.b.f(d, f, drawable, fay0Var, mtDetailedRouteMapUiStateMapper$mapUiState$12);
                    if (f3 != coroutineSingletons) {
                        obj = f3;
                        fay0Var2 = fay0Var;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ds30Var3 = (ds30) mtDetailedRouteMapUiStateMapper$mapUiState$12.L$7;
                        ds30Var2 = (ds30) mtDetailedRouteMapUiStateMapper$mapUiState$12.L$5;
                        b.b(obj2);
                        return new m2j(ds30Var2, ds30Var3, (List) obj2);
                    }
                    float f4 = mtDetailedRouteMapUiStateMapper$mapUiState$12.F$0;
                    ds30 ds30Var4 = (ds30) mtDetailedRouteMapUiStateMapper$mapUiState$12.L$5;
                    fay0 fay0Var3 = (fay0) mtDetailedRouteMapUiStateMapper$mapUiState$12.L$3;
                    jf30 jf30Var4 = (jf30) mtDetailedRouteMapUiStateMapper$mapUiState$12.L$1;
                    su30Var2 = (su30) mtDetailedRouteMapUiStateMapper$mapUiState$12.L$0;
                    b.b(obj2);
                    f2 = f4;
                    jf30Var3 = jf30Var4;
                    ds30Var = ds30Var4;
                    fay0Var2 = fay0Var3;
                    ds30 ds30Var5 = (ds30) obj2;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$0 = null;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$1 = null;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$2 = null;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$3 = null;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$4 = null;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$5 = ds30Var;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$6 = null;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$7 = ds30Var5;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.F$0 = f2;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.label = 3;
                    if (jl40.l(jf30Var3, gf30.a)) {
                        if (jf30Var3 instanceof hf30) {
                            a2 = ((hf30) jf30Var3).a.a;
                        } else {
                            if (!(jf30Var3 instanceof if30)) {
                                w511.b();
                                return null;
                            }
                            a2 = ((if30) jf30Var3).a.a();
                        }
                        hj40Var = a2;
                    } else {
                        hj40Var = null;
                    }
                    obj2 = this.b.d(su30Var2.a, su30Var2.b, f2, new MtDetailedRouteMapUiStateMapper$mapOverlaySections$2(su30Var2, fay0Var2, this, hj40Var, f2, null), new MtDetailedRouteMapUiStateMapper$mapOverlaySections$3(this, null), mtDetailedRouteMapUiStateMapper$mapUiState$12);
                    if (obj2 != coroutineSingletons) {
                        ds30Var2 = ds30Var;
                        ds30Var3 = ds30Var5;
                        return new m2j(ds30Var2, ds30Var3, (List) obj2);
                    }
                    return coroutineSingletons;
                }
                float f5 = mtDetailedRouteMapUiStateMapper$mapUiState$12.F$0;
                fay0Var2 = (fay0) mtDetailedRouteMapUiStateMapper$mapUiState$12.L$3;
                jf30 jf30Var5 = (jf30) mtDetailedRouteMapUiStateMapper$mapUiState$12.L$1;
                su30 su30Var4 = (su30) mtDetailedRouteMapUiStateMapper$mapUiState$12.L$0;
                b.b(obj2);
                obj = obj2;
                jf30Var2 = jf30Var5;
                f = f5;
                su30Var3 = su30Var4;
                ds30 ds30Var6 = (ds30) obj;
                Point d2 = cwa1.d(su30Var3.g.b.d);
                mtDetailedRouteMapUiStateMapper$mapUiState$12.L$0 = su30Var3;
                mtDetailedRouteMapUiStateMapper$mapUiState$12.L$1 = jf30Var2;
                mtDetailedRouteMapUiStateMapper$mapUiState$12.L$2 = null;
                mtDetailedRouteMapUiStateMapper$mapUiState$12.L$3 = fay0Var2;
                mtDetailedRouteMapUiStateMapper$mapUiState$12.L$4 = null;
                mtDetailedRouteMapUiStateMapper$mapUiState$12.L$5 = ds30Var6;
                mtDetailedRouteMapUiStateMapper$mapUiState$12.L$6 = null;
                mtDetailedRouteMapUiStateMapper$mapUiState$12.F$0 = f;
                mtDetailedRouteMapUiStateMapper$mapUiState$12.label = 2;
                a = this.b.a(d2, f, mtDetailedRouteMapUiStateMapper$mapUiState$12);
                if (a != coroutineSingletons) {
                    float f6 = f;
                    su30Var2 = su30Var3;
                    jf30Var3 = jf30Var2;
                    obj2 = a;
                    f2 = f6;
                    ds30Var = ds30Var6;
                    ds30 ds30Var52 = (ds30) obj2;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$0 = null;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$1 = null;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$2 = null;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$3 = null;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$4 = null;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$5 = ds30Var;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$6 = null;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.L$7 = ds30Var52;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.F$0 = f2;
                    mtDetailedRouteMapUiStateMapper$mapUiState$12.label = 3;
                    if (jl40.l(jf30Var3, gf30.a)) {
                    }
                    obj2 = this.b.d(su30Var2.a, su30Var2.b, f2, new MtDetailedRouteMapUiStateMapper$mapOverlaySections$2(su30Var2, fay0Var2, this, hj40Var, f2, null), new MtDetailedRouteMapUiStateMapper$mapOverlaySections$3(this, null), mtDetailedRouteMapUiStateMapper$mapUiState$12);
                    if (obj2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        mtDetailedRouteMapUiStateMapper$mapUiState$1 = new MtDetailedRouteMapUiStateMapper$mapUiState$1(this, continuationImpl);
        MtDetailedRouteMapUiStateMapper$mapUiState$1 mtDetailedRouteMapUiStateMapper$mapUiState$122 = mtDetailedRouteMapUiStateMapper$mapUiState$1;
        Object obj22 = mtDetailedRouteMapUiStateMapper$mapUiState$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDetailedRouteMapUiStateMapper$mapUiState$122.label;
        if (i != 0) {
        }
        ds30 ds30Var62 = (ds30) obj;
        Point d22 = cwa1.d(su30Var3.g.b.d);
        mtDetailedRouteMapUiStateMapper$mapUiState$122.L$0 = su30Var3;
        mtDetailedRouteMapUiStateMapper$mapUiState$122.L$1 = jf30Var2;
        mtDetailedRouteMapUiStateMapper$mapUiState$122.L$2 = null;
        mtDetailedRouteMapUiStateMapper$mapUiState$122.L$3 = fay0Var2;
        mtDetailedRouteMapUiStateMapper$mapUiState$122.L$4 = null;
        mtDetailedRouteMapUiStateMapper$mapUiState$122.L$5 = ds30Var62;
        mtDetailedRouteMapUiStateMapper$mapUiState$122.L$6 = null;
        mtDetailedRouteMapUiStateMapper$mapUiState$122.F$0 = f;
        mtDetailedRouteMapUiStateMapper$mapUiState$122.label = 2;
        a = this.b.a(d22, f, mtDetailedRouteMapUiStateMapper$mapUiState$122);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
