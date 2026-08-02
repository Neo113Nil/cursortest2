package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import java.io.Closeable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class o0j implements Closeable {
    public final qdc a;
    public final ArrayList b;
    public final ConnectivityManager c;
    public Boolean d;
    public final Handler e;

    public o0j(Context context, qdc qdcVar) {
        qdcVar.getClass();
        this.a = qdcVar;
        this.b = new ArrayList();
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        this.c = (ConnectivityManager) systemService;
        jyr jyrVar = dwt.a;
        this.e = new Handler(Looper.getMainLooper());
    }

    public abstract boolean a();
}
