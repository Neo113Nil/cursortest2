package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class zu71 {
    public final a081 a;

    public zu71() {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        this.a = a081Var2;
    }

    public final boolean a(Context context) {
        if (!cs71.a(context)) {
            return false;
        }
        gg81 a = this.a.a(context);
        return !(a != null ? a.w : true);
    }
}
