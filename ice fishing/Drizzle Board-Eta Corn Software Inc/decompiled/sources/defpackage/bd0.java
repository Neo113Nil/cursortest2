package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class bd0 implements View.OnClickListener {
    public final /* synthetic */ dd0 MdtA4re8;
    public final QT4Tf9Dt NCTxEWno;

    public bd0(dd0 dd0Var) {
        this.MdtA4re8 = dd0Var;
        Context context = dd0Var.qoPGr6Ce.getContext();
        CharSequence charSequence = dd0Var.Qr9iLBAD;
        QT4Tf9Dt qT4Tf9Dt = new QT4Tf9Dt();
        qT4Tf9Dt.VgvYg0wo = 4096;
        qT4Tf9Dt.b2ZJblxo = 4096;
        qT4Tf9Dt.ow5vqvCr = null;
        qT4Tf9Dt.OnDfzHZD = null;
        qT4Tf9Dt.ygLcUYwZ = false;
        qT4Tf9Dt.lDXGDhIF = false;
        qT4Tf9Dt.sjUBp5pO = 16;
        qT4Tf9Dt.jb9XjC4I = context;
        qT4Tf9Dt.qoPGr6Ce = charSequence;
        this.NCTxEWno = qT4Tf9Dt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dd0 dd0Var = this.MdtA4re8;
        Window.Callback callback = dd0Var.k3x7lurq;
        if (callback == null || !dd0Var.ow5vqvCr) {
            return;
        }
        callback.onMenuItemSelected(0, this.NCTxEWno);
    }
}
