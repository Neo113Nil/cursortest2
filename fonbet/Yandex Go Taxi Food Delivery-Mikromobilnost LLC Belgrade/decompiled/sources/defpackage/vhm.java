package defpackage;

import android.view.ViewTreeObserver;

/* loaded from: classes14.dex */
public final /* synthetic */ class vhm implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ vhm(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.a;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                slsVar.invoke();
                break;
            default:
                slsVar.invoke();
                break;
        }
    }
}
