package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.zze;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class vkt {
    public static final Object a = new Object();
    public static b b;
    public static HandlerThread c;

    public static b a(Context context) {
        synchronized (a) {
            try {
                if (b == null) {
                    b = new b(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public abstract ConnectionResult b(e3b1 e3b1Var, zze zzeVar, String str, Executor executor);

    public abstract void c(e3b1 e3b1Var, ServiceConnection serviceConnection, String str);
}
