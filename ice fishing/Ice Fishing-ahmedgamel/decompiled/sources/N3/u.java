package N3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.internal.ads.LD;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class u implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f2013n;

    public /* synthetic */ u(v vVar) {
        Objects.requireNonNull(vVar);
        this.f2013n = vVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "onServiceConnected: ".concat(String.valueOf(componentName)));
        }
        this.f2013n.c(new LD(17, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "onServiceDisconnected: ".concat(String.valueOf(componentName)));
        }
        this.f2013n.c(new G0.c(5, this));
    }
}
