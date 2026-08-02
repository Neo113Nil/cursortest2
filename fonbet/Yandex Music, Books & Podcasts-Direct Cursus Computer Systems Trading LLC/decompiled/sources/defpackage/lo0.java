package defpackage;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class lo0 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ lo0(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                Function0 function0 = this.b;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            default:
                this.b.invoke();
                break;
        }
    }
}
