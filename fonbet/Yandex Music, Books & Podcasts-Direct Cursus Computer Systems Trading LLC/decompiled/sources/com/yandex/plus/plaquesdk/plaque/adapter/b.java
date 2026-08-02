package com.yandex.plus.plaquesdk.plaque.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.plus.plaquesdk.plaque.api.models.display.t;
import com.yandex.plus.plaquesdk.plaque.api.models.display.u;
import com.yandex.plus.plaquesdk.plaque.api.models.display.v;
import com.yandex.plus.plaquesdk.plaque.api.models.display.w;
import com.yandex.plus.plaquesdk.plaque.api.models.m;
import com.yandex.plus.plaquesdk.plaque.api.models.x;
import defpackage.b6e;
import defpackage.bw1;
import defpackage.c5b;
import defpackage.rj7;
import defpackage.t75;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class b extends j {
    public final Function1 b;
    public final FrameLayout c;
    public final bw1 d;

    public b(Context context, com.yandex.plus.plaquesdk.plaque.api.dependencies.b bVar, Function1 function1) {
        context.getClass();
        bVar.getClass();
        function1.getClass();
        this.b = function1;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        this.d = new bw1((ViewGroup) frameLayout, bVar, function1, false);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTransitionName("plaque_group_widget_transition_name");
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    @Override // com.yandex.plus.plaquesdk.plaque.adapter.j
    public final void b(x xVar) {
        ?? r3;
        List list = ((m) xVar).e;
        this.d.v(list);
        FrameLayout frameLayout = this.c;
        if (frameLayout.getChildCount() > 0) {
            View childAt = frameLayout.getChildAt(0);
            if (childAt == null) {
                rj7.m();
                return;
            }
            int i = 1;
            if (1 < frameLayout.getChildCount()) {
                r3 = new ArrayList();
                r3.add(childAt);
                while (i < frameLayout.getChildCount()) {
                    int i2 = i + 1;
                    View childAt2 = frameLayout.getChildAt(i);
                    if (childAt2 == null) {
                        rj7.m();
                        return;
                    } else {
                        r3.add(childAt2);
                        i = i2;
                    }
                }
            } else {
                r3 = t75.c(childAt);
            }
        } else {
            r3 = c5b.a;
        }
        Iterable iterable = (Iterable) r3;
        List list2 = list;
        Iterator it = iterable.iterator();
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(v75.o(iterable, 10), v75.o(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            x xVar2 = (x) it2.next();
            w wVar = xVar2.c().b;
            Context context = frameLayout.getContext();
            context.getClass();
            int f = f(wVar, context);
            xVar2.c().getClass();
            Context context2 = frameLayout.getContext();
            context2.getClass();
            ((View) next).setLayoutParams(new FrameLayout.LayoutParams(f, f(u.a, context2), 0));
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
        return "Box";
    }
}
