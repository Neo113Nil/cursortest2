package ru.yandex.taxi.address.repository;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.fnx0;
import defpackage.h3y;
import defpackage.kb5;
import defpackage.qmp;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.ul51;
import defpackage.uyj;
import defpackage.wiq0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class f {
    public final tt2 a;
    public final h3y b;
    public final qmp c;
    public volatile boolean d;
    public volatile BitmapDrawable e;

    public f(tt2 tt2Var, h3y h3yVar, qmp qmpVar) {
        this.a = tt2Var;
        this.b = h3yVar;
        this.c = qmpVar;
    }

    public final boolean a() {
        kb5 kb5Var;
        ((ul51) this.c).getClass();
        fnx0 n = ((k) ((wiq0) this.b.get())).n();
        TariffOrderFlow tariffOrderFlow = (n == null || (kb5Var = n.e) == null) ? null : kb5Var.d;
        return ((tariffOrderFlow == TariffOrderFlow.DELIVERY_FLOW || tariffOrderFlow == TariffOrderFlow.DRIVE_FLOW) ? IconType.DOTS : IconType.MAN_WITH_FLAG) == IconType.MAN_WITH_FLAG;
    }

    public final tpr b(r0 r0Var) {
        ((ul51) this.c).getClass();
        e eVar = new e(kotlinx.coroutines.flow.e.t(new m0(kotlinx.coroutines.flow.e.t(new c(((k) ((wiq0) this.b.get())).j.b())), r0Var, new SuggestIconRepository$updateIconFlow$2(3, null))));
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(eVar, uyj.a);
    }
}
