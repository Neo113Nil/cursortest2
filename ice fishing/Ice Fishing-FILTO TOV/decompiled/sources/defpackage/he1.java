package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class he1 implements View.OnApplyWindowInsetsListener {
    public wg1 GWasM1elztuh = null;
    public final /* synthetic */ xk0 X1lG3V04pd;
    public final /* synthetic */ View Yi7zF1RB1;

    public he1(View view, xk0 xk0Var) {
        this.Yi7zF1RB1 = view;
        this.X1lG3V04pd = xk0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        wg1 X1lG3V04pd = wg1.X1lG3V04pd(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        xk0 xk0Var = this.X1lG3V04pd;
        if (i < 30) {
            ie1.GWasM1elztuh(windowInsets, this.Yi7zF1RB1);
            if (X1lG3V04pd.equals(this.GWasM1elztuh)) {
                return xk0Var.GWasM1elztuh(view, X1lG3V04pd).Yi7zF1RB1();
            }
        }
        this.GWasM1elztuh = X1lG3V04pd;
        wg1 GWasM1elztuh = xk0Var.GWasM1elztuh(view, X1lG3V04pd);
        if (i >= 30) {
            return GWasM1elztuh.Yi7zF1RB1();
        }
        int i2 = ne1.GWasM1elztuh;
        view.requestApplyInsets();
        return GWasM1elztuh.Yi7zF1RB1();
    }
}
