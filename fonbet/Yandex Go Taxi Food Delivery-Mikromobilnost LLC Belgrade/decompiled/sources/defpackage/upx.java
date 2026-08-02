package defpackage;

import android.content.Context;
import com.airbnb.lottie.AsyncUpdates;

/* loaded from: classes.dex */
public abstract class upx {
    public static volatile au50 b;
    public static volatile gp50 c;
    public static final AsyncUpdates a = AsyncUpdates.AUTOMATIC;
    public static final u3x0 d = new u3x0();

    public static au50 a(Context context) {
        au50 au50Var;
        gp50 gp50Var;
        au50 au50Var2 = b;
        if (au50Var2 != null) {
            return au50Var2;
        }
        synchronized (au50.class) {
            try {
                au50Var = b;
                if (au50Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    gp50 gp50Var2 = c;
                    int i = 0;
                    if (gp50Var2 == null) {
                        synchronized (gp50.class) {
                            try {
                                gp50Var = c;
                                if (gp50Var == null) {
                                    gp50Var = new gp50(i, new tpx(applicationContext));
                                    c = gp50Var;
                                }
                            } finally {
                            }
                        }
                        gp50Var2 = gp50Var;
                    }
                    au50Var = new au50(i, gp50Var2, new jeh());
                    b = au50Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return au50Var;
    }
}
