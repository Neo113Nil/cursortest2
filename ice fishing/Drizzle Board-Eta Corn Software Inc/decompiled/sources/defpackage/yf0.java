package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class yf0 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ rw MdtA4re8;
    public final /* synthetic */ View NCTxEWno;
    public wi0 qoPGr6Ce = null;

    public yf0(View view, rw rwVar) {
        this.NCTxEWno = view;
        this.MdtA4re8 = rwVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        wi0 VgvYg0wo = wi0.VgvYg0wo(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        rw rwVar = this.MdtA4re8;
        if (i < 30) {
            zf0.qoPGr6Ce(windowInsets, this.NCTxEWno);
            if (VgvYg0wo.equals(this.qoPGr6Ce)) {
                return rwVar.MdtA4re8(view, VgvYg0wo).wxUZMvaN();
            }
        }
        this.qoPGr6Ce = VgvYg0wo;
        wi0 MdtA4re8 = rwVar.MdtA4re8(view, VgvYg0wo);
        if (i >= 30) {
            return MdtA4re8.wxUZMvaN();
        }
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        view.requestApplyInsets();
        return MdtA4re8.wxUZMvaN();
    }
}
