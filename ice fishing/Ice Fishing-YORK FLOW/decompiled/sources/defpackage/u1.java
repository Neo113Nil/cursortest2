package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class u1 implements android.view.View.OnAttachStateChangeListener {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ u1(int i, java.lang.Object obj) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                defpackage.v1 v1Var = (defpackage.v1) this.oh71FJcDz6S2;
                android.content.Context context = view.getContext();
                if (!v1Var.JhCgjQRTAOCT) {
                    context.getApplicationContext().registerComponentCallbacks(v1Var.WDYagTQQm9ns);
                    v1Var.JhCgjQRTAOCT = true;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.v1 v1Var = (defpackage.v1) obj;
                android.content.Context context = view.getContext();
                if (v1Var.JhCgjQRTAOCT) {
                    context.getApplicationContext().unregisterComponentCallbacks(v1Var.WDYagTQQm9ns);
                    v1Var.JhCgjQRTAOCT = false;
                    break;
                }
                break;
            case 1:
                defpackage.XntWc4eZSQ8j xntWc4eZSQ8j = (defpackage.XntWc4eZSQ8j) obj;
                for (java.lang.Object obj2 : defpackage.fc1.GcLuU6pT9wO9(xntWc4eZSQ8j.getParent(), defpackage.eu1.fNwYGHIYeJcR)) {
                    if (obj2 instanceof android.view.View) {
                        android.view.View view2 = (android.view.View) obj2;
                        view2.getClass();
                        java.lang.Object tag = view2.getTag(com.ice.fishing.wolberta.R.id.is_pooling_container_tag);
                        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                xntWc4eZSQ8j.oh71FJcDz6S2();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((defpackage.yf1) obj).JhCgjQRTAOCT(null);
                break;
        }
    }

    private final void ZpBGe2uQfcn8(android.view.View view) {
    }

    private final void giKS3J6vZuNy(android.view.View view) {
    }
}
