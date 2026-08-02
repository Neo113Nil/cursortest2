package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.grid_layout_widget;

import defpackage.c3x;
import defpackage.e1u;
import defpackage.j6s;
import defpackage.k1u;
import defpackage.l1u;
import defpackage.m1u;
import defpackage.n1u;
import defpackage.n351;
import defpackage.ny61;
import defpackage.o1u;
import defpackage.o690;
import defpackage.x2s;
import defpackage.y0s0;
import defpackage.y2x;
import defpackage.z0u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.shortcut_widget.a a;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a b;

    public a(ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.shortcut_widget.a aVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r22v0, types: [ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.grid_layout_widget.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ae -> B:10:0x00b3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(m1u m1uVar, j6s j6sVar, ContinuationImpl continuationImpl) {
        GridLayoutMapper$map$1 gridLayoutMapper$map$1;
        int i;
        m1u m1uVar2;
        Iterator it;
        int i2;
        int i3;
        ArrayList arrayList;
        GridLayoutMapper$map$1 gridLayoutMapper$map$12;
        int i4;
        j6s j6sVar2;
        if (continuationImpl instanceof GridLayoutMapper$map$1) {
            gridLayoutMapper$map$1 = (GridLayoutMapper$map$1) continuationImpl;
            int i5 = gridLayoutMapper$map$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                gridLayoutMapper$map$1.label = i5 - Integer.MIN_VALUE;
                Object obj = gridLayoutMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gridLayoutMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m1uVar2 = m1uVar;
                    ArrayList arrayList2 = m1uVar2.c;
                    ArrayList arrayList3 = new ArrayList();
                    it = arrayList2.iterator();
                    i2 = 0;
                    i3 = 0;
                    arrayList = arrayList3;
                    gridLayoutMapper$map$12 = gridLayoutMapper$map$1;
                    i4 = 0;
                    j6sVar2 = j6sVar;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = gridLayoutMapper$map$1.I$2;
                    int i7 = gridLayoutMapper$map$1.I$1;
                    int i8 = gridLayoutMapper$map$1.I$0;
                    Iterator it2 = (Iterator) gridLayoutMapper$map$1.L$6;
                    ?? r11 = (Collection) gridLayoutMapper$map$1.L$4;
                    j6s j6sVar3 = (j6s) gridLayoutMapper$map$1.L$1;
                    m1u m1uVar3 = (m1u) gridLayoutMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    gridLayoutMapper$map$12 = gridLayoutMapper$map$1;
                    j6sVar2 = j6sVar3;
                    arrayList = r11;
                    it = it2;
                    i3 = i8;
                    i2 = i7;
                    i4 = i6;
                    e1u e1uVar = (e1u) obj;
                    if (e1uVar != null) {
                        arrayList.add(e1uVar);
                    }
                    m1uVar2 = m1uVar3;
                    if (it.hasNext()) {
                        z0u z0uVar = (z0u) it.next();
                        gridLayoutMapper$map$12.L$0 = m1uVar2;
                        gridLayoutMapper$map$12.L$1 = j6sVar2;
                        gridLayoutMapper$map$12.L$2 = null;
                        gridLayoutMapper$map$12.L$3 = null;
                        gridLayoutMapper$map$12.L$4 = arrayList;
                        gridLayoutMapper$map$12.L$5 = null;
                        gridLayoutMapper$map$12.L$6 = it;
                        gridLayoutMapper$map$12.L$7 = null;
                        gridLayoutMapper$map$12.L$8 = null;
                        gridLayoutMapper$map$12.L$9 = null;
                        gridLayoutMapper$map$12.I$0 = i3;
                        gridLayoutMapper$map$12.I$1 = i2;
                        gridLayoutMapper$map$12.I$2 = i4;
                        gridLayoutMapper$map$12.I$3 = 0;
                        gridLayoutMapper$map$12.I$4 = 0;
                        gridLayoutMapper$map$12.label = 1;
                        Object b = b(z0uVar, j6sVar2, gridLayoutMapper$map$12);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        m1uVar3 = m1uVar2;
                        obj = b;
                        e1u e1uVar2 = (e1u) obj;
                        if (e1uVar2 != null) {
                        }
                        m1uVar2 = m1uVar3;
                        if (it.hasNext()) {
                            float f = m1uVar2.d;
                            float f2 = m1uVar2.e;
                            o1u o1uVar = m1uVar2.b;
                            n1u n1uVar = new n1u(o1uVar.a, o1uVar.b);
                            o690 o690Var = m1uVar2.f;
                            this.b.getClass();
                            return new k1u(arrayList, f, f2, n1uVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.i(o690Var), new x2s(m1uVar2.g, null));
                        }
                    }
                }
            }
        }
        gridLayoutMapper$map$1 = new GridLayoutMapper$map$1(this, continuationImpl);
        Object obj2 = gridLayoutMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gridLayoutMapper$map$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(z0u z0uVar, j6s j6sVar, ContinuationImpl continuationImpl) {
        GridLayoutMapper$mapGridItem$1 gridLayoutMapper$mapGridItem$1;
        int i;
        n351 n351Var;
        if (continuationImpl instanceof GridLayoutMapper$mapGridItem$1) {
            gridLayoutMapper$mapGridItem$1 = (GridLayoutMapper$mapGridItem$1) continuationImpl;
            int i2 = gridLayoutMapper$mapGridItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gridLayoutMapper$mapGridItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gridLayoutMapper$mapGridItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gridLayoutMapper$mapGridItem$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    y0s0 y0s0Var = z0uVar.c;
                    gridLayoutMapper$mapGridItem$1.L$0 = z0uVar;
                    gridLayoutMapper$mapGridItem$1.L$1 = null;
                    gridLayoutMapper$mapGridItem$1.label = 1;
                    Object a = this.a.a(y0s0Var, j6sVar, gridLayoutMapper$mapGridItem$1);
                    if (a != coroutineSingletons) {
                        a = (n351) a;
                    }
                    obj = a;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z0uVar = (z0u) gridLayoutMapper$mapGridItem$1.L$0;
                    kotlin.b.b(obj);
                }
                n351Var = (n351) obj;
                if (n351Var != null) {
                    return null;
                }
                l1u l1uVar = z0uVar.a;
                y2x y2xVar = new y2x(l1uVar.a, l1uVar.b);
                o1u o1uVar = z0uVar.b;
                return new e1u(new c3x(o1uVar != null ? o1uVar.a : 1, o1uVar != null ? o1uVar.b : 1), y2xVar, n351Var);
            }
        }
        gridLayoutMapper$mapGridItem$1 = new GridLayoutMapper$mapGridItem$1(this, continuationImpl);
        Object obj2 = gridLayoutMapper$mapGridItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gridLayoutMapper$mapGridItem$1.label;
        if (i != 0) {
        }
        n351Var = (n351) obj2;
        if (n351Var != null) {
        }
    }
}
