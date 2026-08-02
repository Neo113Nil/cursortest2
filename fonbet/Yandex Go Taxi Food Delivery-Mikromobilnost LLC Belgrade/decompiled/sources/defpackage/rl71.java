package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class rl71 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public rl71(Handler handler) {
        this.a = handler;
    }

    public static fi71 a() {
        fi71 fi71Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                fi71Var = arrayList.isEmpty() ? new fi71() : (fi71) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fi71Var;
    }

    public final fi71 b(int i, Object obj) {
        fi71 a = a();
        a.a = this.a.obtainMessage(i, obj);
        return a;
    }
}
