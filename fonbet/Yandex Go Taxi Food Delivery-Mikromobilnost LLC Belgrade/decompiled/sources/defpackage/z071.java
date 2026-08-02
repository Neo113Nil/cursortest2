package defpackage;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import yads.wo3;
import yads.yo3;

/* loaded from: classes7.dex */
public final /* synthetic */ class z071 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mj31 b;

    public /* synthetic */ z071(mj31 mj31Var, int i) {
        this.a = i;
        this.b = mj31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        mj31 mj31Var = this.b;
        switch (i) {
            case 0:
                dj61 dj61Var = (dj61) mj31Var.w;
                if (dj61Var != null) {
                    new CallbackStackTraceMarker(new yo3(dj61Var));
                    break;
                }
                break;
            case 1:
                Object obj = mj31Var.w;
                break;
            case 2:
                dj61 dj61Var2 = (dj61) mj31Var.w;
                if (dj61Var2 != null) {
                    new CallbackStackTraceMarker(new wo3(dj61Var2));
                    break;
                }
                break;
            default:
                Object obj2 = mj31Var.w;
                break;
        }
    }
}
