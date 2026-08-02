package defpackage;

import android.window.OnBackInvokedCallback;

/* loaded from: classes10.dex */
public final /* synthetic */ class wm2 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ wm2(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    public final void onBackInvoked() {
        int i = this.a;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                if (slsVar != null) {
                    slsVar.invoke();
                    break;
                }
                break;
            default:
                slsVar.invoke();
                break;
        }
    }
}
