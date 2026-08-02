package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class y171 {
    public static final Object a = new Object();
    public static volatile y381 b;

    public static y381 a(Context context) {
        y381 y381Var;
        y381 y381Var2 = b;
        if (y381Var2 != null) {
            return y381Var2;
        }
        synchronized (a) {
            y381Var = b;
            if (y381Var == null) {
                y381Var = new y381(s881.a(context, "YadPreferenceFile"));
                b = y381Var;
            }
        }
        return y381Var;
    }
}
