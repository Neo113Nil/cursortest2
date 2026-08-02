package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class b6w {
    public static final b6w b;
    public me1 a;

    static {
        b6w b6wVar = new b6w();
        b6wVar.a = null;
        b = b6wVar;
    }

    public static me1 a(Context context) {
        me1 me1Var;
        b6w b6wVar = b;
        synchronized (b6wVar) {
            try {
                if (b6wVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    b6wVar.a = new me1(context, 4);
                }
                me1Var = b6wVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return me1Var;
    }
}
