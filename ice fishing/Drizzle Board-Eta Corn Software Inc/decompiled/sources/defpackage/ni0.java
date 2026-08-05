package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class ni0 extends mi0 {
    public static final wi0 RXQxj5Oe;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        RXQxj5Oe = wi0.VgvYg0wo(windowInsets, null);
    }

    public ni0(wi0 wi0Var, WindowInsets windowInsets) {
        super(wi0Var, windowInsets);
    }

    @Override // defpackage.ji0, defpackage.si0
    public bn Qr9iLBAD(int i) {
        Insets insets;
        insets = this.MdtA4re8.getInsets(ti0.qoPGr6Ce(i));
        return bn.NCTxEWno(insets);
    }

    @Override // defpackage.ji0
    public bn euDDoUNr(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.MdtA4re8.getInsetsIgnoringVisibility(ti0.qoPGr6Ce(i));
        return bn.NCTxEWno(insetsIgnoringVisibility);
    }

    @Override // defpackage.ji0, defpackage.si0
    public final void wxUZMvaN(View view) {
    }
}
