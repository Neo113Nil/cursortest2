package com.yandex.plus.home.feature.webviews.internal.stories.list.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.plus.home.feature.webviews.internal.stories.list.j;
import com.yandex.plus.home.feature.webviews.internal.stories.p;
import defpackage.opn;
import defpackage.qon;
import defpackage.v50;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class b extends qon {
    public final Function1 d;
    public final ArrayList e;
    public v50 f;
    public boolean g;

    public b(Function1 function1) {
        function1.getClass();
        this.d = function1;
        this.e = new ArrayList();
    }

    @Override // defpackage.qon
    public final int c() {
        return this.e.size();
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        a aVar = (a) opnVar;
        j jVar = (j) CollectionsKt.S(this.e, i);
        if (jVar != null) {
            p pVar = (p) aVar.v.invoke(jVar);
            FrameLayout frameLayout = aVar.u;
            frameLayout.removeAllViews();
            frameLayout.addView(pVar);
            pVar.setTag(Integer.valueOf(jVar.hashCode()));
            if (aVar.w.g) {
                pVar.onResume();
            } else {
                pVar.a();
            }
        }
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return new a(this, frameLayout, this.d);
    }

    @Override // defpackage.qon
    public final void o(opn opnVar) {
        a aVar = (a) opnVar;
        v50 v50Var = this.f;
        if (v50Var != null) {
            v50Var.invoke(Integer.valueOf(aVar.c()));
        }
    }
}
