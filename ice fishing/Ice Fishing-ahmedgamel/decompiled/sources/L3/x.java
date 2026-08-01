package L3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.internal.ads.LD;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class x implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y f1741n;

    public /* synthetic */ x(y yVar) {
        Objects.requireNonNull(yVar);
        this.f1741n = yVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "onServiceConnected: ".concat(String.valueOf(componentName)));
        }
        this.f1741n.c(new LD(17, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "onServiceDisconnected: ".concat(String.valueOf(componentName)));
        }
        this.f1741n.c(new G0.c(5, this));
    }
}
