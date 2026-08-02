package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import java.io.Closeable;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public abstract class sw50 implements Closeable {
    public final ew2 a;
    public final ArrayList b = new ArrayList();
    public final ConnectivityManager c;
    public Boolean w;
    public final Handler x;

    public sw50(Context context, ew2 ew2Var) {
        this.a = ew2Var;
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
        i3y i3yVar = vx21.a;
        this.x = new Handler(Looper.getMainLooper());
    }

    public abstract boolean a();
}
