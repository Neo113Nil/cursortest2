package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class g implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ g(int i, Object obj) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CharSequence convertSelectionToString;
        int i2 = this.NCTxEWno;
        Object obj = this.MdtA4re8;
        switch (i2) {
            case 0:
                i iVar = (i) obj;
                l lVar = iVar.eIA6dogk;
                lVar.setSelection(i);
                if (lVar.getOnItemClickListener() != null) {
                    lVar.performItemClick(view, i, iVar.euDDoUNr.getItemId(i));
                }
                iVar.dismiss();
                break;
            default:
                dr drVar = (dr) obj;
                xp xpVar = drVar.P7K7Inc8;
                convertSelectionToString = drVar.convertSelectionToString(i < 0 ? !xpVar.lwWCatUu.isShowing() ? null : xpVar.wxUZMvaN.getSelectedItem() : drVar.getAdapter().getItem(i));
                drVar.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = drVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !xpVar.lwWCatUu.isShowing() ? null : xpVar.wxUZMvaN.getSelectedView();
                        i = !xpVar.lwWCatUu.isShowing() ? -1 : xpVar.wxUZMvaN.getSelectedItemPosition();
                        j = !xpVar.lwWCatUu.isShowing() ? Long.MIN_VALUE : xpVar.wxUZMvaN.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(xpVar.wxUZMvaN, view, i, j);
                }
                xpVar.dismiss();
                break;
        }
    }
}
