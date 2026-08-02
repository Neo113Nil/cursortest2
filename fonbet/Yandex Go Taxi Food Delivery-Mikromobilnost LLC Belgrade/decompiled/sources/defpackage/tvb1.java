package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.splitinstall.internal.e;
import com.google.android.play.core.splitinstall.zzo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class tvb1 extends e {
    public static tvb1 j;
    public final Handler g;
    public final zzo h;
    public final LinkedHashSet i;

    public tvb1(Context context, zzo zzoVar) {
        super(new il0("SplitInstallListenerRegistry", 1), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.g = new Handler(Looper.getMainLooper());
        this.i = new LinkedHashSet();
        this.h = zzoVar;
    }

    public static synchronized tvb1 b(Context context) {
        tvb1 tvb1Var;
        synchronized (tvb1.class) {
            try {
                if (j == null) {
                    j = new tvb1(context, zzo.zza);
                }
                tvb1Var = j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tvb1Var;
    }

    public final synchronized void c(k391 k391Var) {
        try {
            Iterator it = new LinkedHashSet(this.i).iterator();
            while (it.hasNext()) {
                ((nvt0) it.next()).a(k391Var);
            }
            synchronized (this) {
                Iterator it2 = new HashSet(this.d).iterator();
                while (it2.hasNext()) {
                    ((nvt0) it2.next()).a(k391Var);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
