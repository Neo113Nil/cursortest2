package defpackage;

import android.app.AlertDialog;

/* loaded from: classes.dex */
public final class qyw extends exw {
    public final /* synthetic */ AlertDialog a;
    public final /* synthetic */ rxw b;

    public qyw(rxw rxwVar, AlertDialog alertDialog) {
        this.b = rxwVar;
        this.a = alertDialog;
    }

    @Override // defpackage.exw
    public final void a() {
        uyw uywVar = (uyw) this.b.c;
        uywVar.c.set(null);
        uywVar.l();
        AlertDialog alertDialog = this.a;
        if (alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
    }
}
