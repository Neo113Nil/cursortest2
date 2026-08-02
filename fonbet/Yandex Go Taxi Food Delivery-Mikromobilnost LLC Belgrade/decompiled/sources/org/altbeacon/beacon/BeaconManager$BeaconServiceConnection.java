package org.altbeacon.beacon;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import defpackage.oi5;
import java.util.Map;

/* loaded from: classes4.dex */
class BeaconManager$BeaconServiceConnection implements ServiceConnection {
    final /* synthetic */ b this$0;

    private BeaconManager$BeaconServiceConnection(b bVar) {
        this.this$0 = bVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar = this.this$0;
        if (bVar.n == null) {
            bVar.n = Boolean.FALSE;
        }
        bVar.c = new Messenger(iBinder);
        this.this$0.c();
        synchronized (this.this$0.b) {
            try {
                for (Map.Entry entry : this.this$0.b.entrySet()) {
                    if (!((a) entry.getValue()).a) {
                        ((oi5) entry.getKey()).a();
                        ((a) entry.getValue()).a = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.this$0.c = null;
    }

    public /* synthetic */ BeaconManager$BeaconServiceConnection(b bVar, int i) {
        this(bVar);
    }
}
