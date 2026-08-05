package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class pi0 extends oi0 {
    public static final wi0 FySoLYna;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        FySoLYna = wi0.VgvYg0wo(windowInsets, null);
    }

    public pi0(wi0 wi0Var, WindowInsets windowInsets) {
        super(wi0Var, windowInsets);
    }

    @Override // defpackage.ni0, defpackage.ji0, defpackage.si0
    public bn Qr9iLBAD(int i) {
        Insets insets;
        insets = this.MdtA4re8.getInsets(vi0.qoPGr6Ce(i));
        return bn.NCTxEWno(insets);
    }

    @Override // defpackage.ni0, defpackage.ji0
    public bn euDDoUNr(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.MdtA4re8.getInsetsIgnoringVisibility(vi0.qoPGr6Ce(i));
        return bn.NCTxEWno(insetsIgnoringVisibility);
    }

    @Override // defpackage.ji0, defpackage.si0
    public void ygLcUYwZ(View view) {
    }
}
