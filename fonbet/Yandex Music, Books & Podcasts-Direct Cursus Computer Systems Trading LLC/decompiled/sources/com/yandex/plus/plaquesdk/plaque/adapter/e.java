package com.yandex.plus.plaquesdk.plaque.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.yandex.plus.plaquesdk.plaque.api.models.display.t;
import com.yandex.plus.plaquesdk.plaque.api.models.display.u;
import com.yandex.plus.plaquesdk.plaque.api.models.display.v;
import com.yandex.plus.plaquesdk.plaque.api.models.display.w;
import com.yandex.plus.plaquesdk.plaque.api.models.r;
import com.yandex.plus.plaquesdk.plaque.api.models.x;
import defpackage.b6e;
import defpackage.bw1;
import defpackage.c5b;
import defpackage.d7g;
import defpackage.rj7;
import defpackage.t75;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class e extends j {
    public final Function1 b;
    public final LinearLayoutCompat c;
    public final bw1 d;

    public e(Context context, com.yandex.plus.plaquesdk.plaque.api.dependencies.b bVar, Function1 function1) {
        context.getClass();
        bVar.getClass();
        function1.getClass();
        this.b = function1;
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(context);
        this.c = linearLayoutCompat;
        this.d = new bw1((ViewGroup) linearLayoutCompat, bVar, function1, false);
        linearLayoutCompat.setClipChildren(false);
        linearLayoutCompat.setClipToPadding(false);
        linearLayoutCompat.setTransitionName("plaque_group_widget_transition_name");
    }

    public static int f(w wVar, Context context) {
        if (wVar instanceof t) {
            return -1;
        }
        if (wVar instanceof u) {
            return -2;
        }
        if (!(wVar instanceof v)) {
            b6e.s();
            return 0;
        }
        com.yandex.plus.core.android.extensions.e eVar = ((v) wVar).a;
        context.getClass();
        Resources resources = context.getResources();
        resources.getClass();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        displayMetrics.getClass();
        return com.yandex.plus.core.android.extensions.e.c(eVar.a, displayMetrics).intValue();
    }

    public static int g(w wVar, Context context) {
        if (wVar instanceof t) {
            return 0;
        }
        if (wVar instanceof u) {
            return -2;
        }
        if (!(wVar instanceof v)) {
            b6e.s();
            return 0;
        }
        com.yandex.plus.core.android.extensions.e eVar = ((v) wVar).a;
        context.getClass();
        Resources resources = context.getResources();
        resources.getClass();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        displayMetrics.getClass();
        return com.yandex.plus.core.android.extensions.e.c(eVar.a, displayMetrics).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.ArrayList] */
    @Override // com.yandex.plus.plaquesdk.plaque.adapter.j
    public final void b(x xVar) {
        ?? r4;
        ViewGroup.LayoutParams d7gVar;
        r rVar = (r) xVar;
        int i = rVar.d.c;
        LinearLayoutCompat linearLayoutCompat = this.c;
        linearLayoutCompat.setGravity(i);
        int i2 = rVar.f;
        linearLayoutCompat.setOrientation(i2);
        List list = rVar.e;
        this.d.v(list);
        if (linearLayoutCompat.getChildCount() > 0) {
            View childAt = linearLayoutCompat.getChildAt(0);
            if (childAt == null) {
                rj7.m();
                return;
            }
            if (1 < linearLayoutCompat.getChildCount()) {
                r4 = new ArrayList();
                r4.add(childAt);
                int i3 = 1;
                while (i3 < linearLayoutCompat.getChildCount()) {
                    int i4 = i3 + 1;
                    View childAt2 = linearLayoutCompat.getChildAt(i3);
                    if (childAt2 == null) {
                        rj7.m();
                        return;
                    } else {
                        r4.add(childAt2);
                        i3 = i4;
                    }
                }
            } else {
                r4 = t75.c(childAt);
            }
        } else {
            r4 = c5b.a;
        }
        Iterable iterable = (Iterable) r4;
        List list2 = list;
        Iterator it = iterable.iterator();
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(v75.o(iterable, 10), v75.o(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            x xVar2 = (x) it2.next();
            View view = (View) next;
            float f = 1.0f;
            u uVar = u.a;
            if (i2 == 0) {
                w wVar = xVar2.c().b;
                Context context = linearLayoutCompat.getContext();
                context.getClass();
                int g = g(wVar, context);
                xVar2.c().getClass();
                Context context2 = linearLayoutCompat.getContext();
                context2.getClass();
                int f2 = f(uVar, context2);
                w wVar2 = xVar2.c().b;
                if (!(wVar2 instanceof t)) {
                    if (!(wVar2 instanceof u) && !(wVar2 instanceof v)) {
                        b6e.s();
                        return;
                    }
                    f = 0.0f;
                }
                d7gVar = new d7g(g, f2, f);
            } else if (i2 != 1) {
                d7gVar = view.getLayoutParams();
            } else {
                w wVar3 = xVar2.c().b;
                Context context3 = linearLayoutCompat.getContext();
                context3.getClass();
                int f3 = f(wVar3, context3);
                xVar2.c().getClass();
                Context context4 = linearLayoutCompat.getContext();
                context4.getClass();
                int g2 = g(uVar, context4);
                xVar2.c().getClass();
                d7gVar = new d7g(f3, g2, 0.0f);
            }
            view.setLayoutParams(d7gVar);
            arrayList.add(Unit.a);
        }
    }

    @Override // com.yandex.plus.plaquesdk.plaque.adapter.j
    public final Function1 c() {
        return this.b;
    }

    @Override // com.yandex.plus.plaquesdk.plaque.adapter.j
    public final View d() {
        return this.c;
    }

    public final String toString() {
        return "Line";
    }
}
