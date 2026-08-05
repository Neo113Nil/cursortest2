package defpackage;

import android.content.DialogInterface;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class kc implements DialogInterface.OnDismissListener {
    public final /* synthetic */ nc NCTxEWno;

    public kc(nc ncVar) {
        this.NCTxEWno = ncVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        nc ncVar = this.NCTxEWno;
        o7 o7Var = ncVar.QT4Tf9Dt;
        if (o7Var != null) {
            ncVar.onDismiss(o7Var);
        }
    }
}
