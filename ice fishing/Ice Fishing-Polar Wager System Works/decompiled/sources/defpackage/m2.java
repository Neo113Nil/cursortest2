package defpackage;

/* loaded from: classes.dex */
public final class m2 implements android.view.View.OnAttachStateChangeListener {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ m2(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        switch (this.adDC3e2L) {
            case 0:
                defpackage.n2 n2Var = (defpackage.n2) this.xiZrDbcSW0;
                android.content.Context context = view.getContext();
                if (!n2Var.F7NU4MC0GW) {
                    context.getApplicationContext().registerComponentCallbacks(n2Var.adDC3e2L);
                    n2Var.F7NU4MC0GW = true;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                defpackage.n2 n2Var = (defpackage.n2) obj;
                android.content.Context context = view.getContext();
                if (n2Var.F7NU4MC0GW) {
                    context.getApplicationContext().unregisterComponentCallbacks(n2Var.adDC3e2L);
                    n2Var.F7NU4MC0GW = false;
                    break;
                }
                break;
            case 1:
                defpackage.G3OKOH3wZRC g3OKOH3wZRC = (defpackage.G3OKOH3wZRC) obj;
                for (java.lang.Object obj2 : defpackage.a81.yIx6ChFVk(g3OKOH3wZRC.getParent(), defpackage.rm1.JlrlGoKF)) {
                    if (obj2 instanceof android.view.View) {
                        android.view.View view2 = (android.view.View) obj2;
                        view2.getClass();
                        java.lang.Object tag = view2.getTag(com.combinations.spin.balbi.R.id.is_pooling_container_tag);
                        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                g3OKOH3wZRC.xiZrDbcSW0();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((defpackage.xb1) obj).F7NU4MC0GW(null);
                break;
        }
    }

    private final void IHQe1A4L2xu(android.view.View view) {
    }

    private final void oh6vYeIP(android.view.View view) {
    }
}
