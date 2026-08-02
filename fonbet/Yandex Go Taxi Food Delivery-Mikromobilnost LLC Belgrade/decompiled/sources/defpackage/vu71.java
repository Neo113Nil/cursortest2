package defpackage;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes7.dex */
public final class vu71 implements bi71 {
    public static final /* synthetic */ kgx[] d = {qha1.a(vu71.class, "contextReference", "getContextReference()Landroid/content/Context;")};
    public final o781 a;
    public final xq81 b;
    public final r581 c;

    public vu71(Activity activity, o781 o781Var) {
        xq81 xq81Var;
        xq81 xq81Var2 = xq81.g;
        if (xq81Var2 == null) {
            synchronized (xq81.f) {
                xq81Var = xq81.g;
                if (xq81Var == null) {
                    xq81Var = new xq81();
                    xq81.g = xq81Var;
                }
            }
            xq81Var2 = xq81Var;
        }
        this.a = o781Var;
        this.b = xq81Var2;
        this.c = new r581(activity);
    }

    @Override // defpackage.bi71
    public final void a(Activity activity) {
        kgx kgxVar = d[0];
        Context context = (Context) this.c.a.get();
        if (context == null || !context.equals(activity)) {
            return;
        }
        this.a.a.n();
    }

    @Override // defpackage.bi71
    public final void b(Activity activity) {
        kgx kgxVar = d[0];
        Context context = (Context) this.c.a.get();
        if (context == null || !context.equals(activity)) {
            return;
        }
        this.a.a.m();
    }
}
