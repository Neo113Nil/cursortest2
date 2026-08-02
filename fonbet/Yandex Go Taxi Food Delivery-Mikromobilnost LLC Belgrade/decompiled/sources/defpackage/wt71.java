package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class wt71 {
    public static volatile y381 a;
    public static final Object b = new Object();

    public static y381 a(Context context) {
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    a = new y381(s881.a(context, "YadPreferenceFile"));
                }
            }
        }
        y381 y381Var = a;
        if (y381Var != null) {
            return y381Var;
        }
        ny61.g("Required value was null.");
        return null;
    }
}
