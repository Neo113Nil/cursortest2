package ru.yandex.taxi.statebar.router;

import defpackage.c9p;
import defpackage.h55;
import defpackage.m950;
import defpackage.tje;
import defpackage.uq1;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes6.dex */
public final class a extends h55 implements m950 {
    public final uq1 D;
    public final c9p E;
    public AlertDialog F;

    public a(uq1 uq1Var, c9p c9pVar) {
        super(null);
        this.D = uq1Var;
        this.E = c9pVar;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        AlertDialog alertDialog = this.F;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.F = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new ServerErrorDialogRouterImpl$onLaunch$1(this, null), 3);
    }
}
