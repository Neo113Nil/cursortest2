package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class uq0 extends zgu {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uq0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.zgu, defpackage.ygu
    public void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((tq0) obj).b.v.setVisibility(0);
                break;
            case 1:
                er0 er0Var = (er0) obj;
                er0Var.v.setVisibility(0);
                if (er0Var.v.getParent() instanceof View) {
                    View view = (View) er0Var.v.getParent();
                    WeakHashMap weakHashMap = wdu.a;
                    ldu.c(view);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ygu
    public final void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                er0 er0Var = ((tq0) obj).b;
                er0Var.v.setAlpha(1.0f);
                er0Var.y.d(null);
                er0Var.y = null;
                break;
            case 1:
                er0 er0Var2 = (er0) obj;
                er0Var2.v.setAlpha(1.0f);
                er0Var2.y.d(null);
                er0Var2.y = null;
                break;
            default:
                er0 er0Var3 = (er0) ((nnk) obj).b;
                er0Var3.v.setVisibility(8);
                PopupWindow popupWindow = er0Var3.w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (er0Var3.v.getParent() instanceof View) {
                    View view = (View) er0Var3.v.getParent();
                    WeakHashMap weakHashMap = wdu.a;
                    ldu.c(view);
                }
                er0Var3.v.e();
                er0Var3.y.d(null);
                er0Var3.y = null;
                ViewGroup viewGroup = er0Var3.B;
                WeakHashMap weakHashMap2 = wdu.a;
                ldu.c(viewGroup);
                break;
        }
    }
}
