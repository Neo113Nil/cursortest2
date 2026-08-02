package com.yandex.passport.internal.ui.bouncer.chooser;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.passport.internal.report.p5;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.model.n1;
import com.yandex.passport.internal.ui.bouncer.model.y0;
import defpackage.orq;
import defpackage.r13;
import defpackage.v75;
import defpackage.wn5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class h extends orq implements r13 {
    public final com.yandex.passport.internal.ui.bouncer.s k;
    public final a l;
    public final com.yandex.passport.internal.report.reporters.q m;
    public final ComposeView n;
    public ArrayList o;

    public h(BouncerActivity bouncerActivity, com.yandex.passport.internal.ui.bouncer.s sVar, a aVar, com.yandex.passport.internal.report.reporters.q qVar) {
        bouncerActivity.getClass();
        sVar.getClass();
        aVar.getClass();
        qVar.getClass();
        this.k = sVar;
        this.l = aVar;
        this.m = qVar;
        this.n = new ComposeView(bouncerActivity, null, 0, 6, null);
    }

    @Override // defpackage.r13
    public final void e(Object obj) {
        n1 n1Var = (n1) obj;
        n1Var.getClass();
        List list = n1Var.b;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((y0) it.next()).a);
        }
        this.o = arrayList;
        this.n.setContent(new wn5(new g(this, n1Var, 0), -1237476288, true));
    }

    @Override // defpackage.orq
    public final View h() {
        return this.n;
    }

    @Override // defpackage.orq
    public final void i(Bundle bundle) {
        ArrayList arrayList = this.o;
        if (bundle != null || arrayList == null) {
            return;
        }
        com.yandex.passport.internal.report.reporters.q qVar = this.m;
        qVar.getClass();
        qVar.n(p5.d, new com.yandex.passport.internal.report.a(arrayList.size(), 20), new ve(arrayList, 2));
    }
}
