package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class h implements PopupWindow.OnDismissListener {
    public final /* synthetic */ i MdtA4re8;
    public final /* synthetic */ c NCTxEWno;

    public h(i iVar, c cVar) {
        this.MdtA4re8 = iVar;
        this.NCTxEWno = cVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.MdtA4re8.eIA6dogk.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.NCTxEWno);
        }
    }
}
