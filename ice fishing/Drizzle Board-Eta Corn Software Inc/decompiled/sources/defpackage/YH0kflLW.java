package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class YH0kflLW implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AhLfQVuM MdtA4re8;
    public final /* synthetic */ dHPzAh2D NCTxEWno;

    public YH0kflLW(AhLfQVuM ahLfQVuM, dHPzAh2D dhpzah2d) {
        this.MdtA4re8 = ahLfQVuM;
        this.NCTxEWno = dhpzah2d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AhLfQVuM ahLfQVuM = this.MdtA4re8;
        DialogInterface.OnClickListener onClickListener = ahLfQVuM.Qr9iLBAD;
        dHPzAh2D dhpzah2d = this.NCTxEWno;
        onClickListener.onClick(dhpzah2d.NCTxEWno, i);
        if (ahLfQVuM.jb9XjC4I) {
            return;
        }
        dhpzah2d.NCTxEWno.dismiss();
    }
}
