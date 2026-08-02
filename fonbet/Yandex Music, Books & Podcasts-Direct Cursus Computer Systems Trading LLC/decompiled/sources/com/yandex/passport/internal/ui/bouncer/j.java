package com.yandex.passport.internal.ui.bouncer;

import android.view.View;
import com.lightside.slab.SlotView;
import defpackage.b6;
import defpackage.ezf;
import defpackage.hdu;
import defpackage.qvc;
import defpackage.rof;
import defpackage.trq;

/* loaded from: classes4.dex */
public final class j extends b6 {
    public final trq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(BouncerActivity bouncerActivity) {
        super(bouncerActivity, 10);
        bouncerActivity.getClass();
        SlotView slotView = new SlotView(ezf.a0(bouncerActivity, 0), null, 0, 0);
        if (this instanceof rof) {
            ((rof) this).j(slotView);
        }
        this.d = new trq(slotView);
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        qvc qvcVar = new qvc(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(qvcVar);
        }
        View view = this.d.a;
        ezf.a0(qvcVar.getCtx(), 0).getClass();
        qvcVar.j(view);
        view.setLayoutParams(qvcVar.a(-1, -1));
        return qvcVar;
    }
}
