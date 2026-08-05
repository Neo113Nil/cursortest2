package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class qp implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ xp NCTxEWno;

    public qp(xp xpVar) {
        this.NCTxEWno = xpVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        fe feVar;
        if (i == -1 || (feVar = this.NCTxEWno.wxUZMvaN) == null) {
            return;
        }
        feVar.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
