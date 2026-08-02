package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public final class fmp implements ServiceConnection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fmp(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m2x m2xVar = null;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                x3n x3nVar = (x3n) this.b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) x3nVar.c;
                sb.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb.toString());
                x3nVar.b = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                x97.y(gld.e((CoroutineContext) x3nVar.a), null, null, new v5p(x3nVar, arrayList, objArr == true ? 1 : 0, 5), 3);
                break;
            case 1:
                l8x.f("BillingClientTesting", "Billing Override Service connected.");
                r5x r5xVar = (r5x) this.b;
                int i = h2x.h;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    m2xVar = queryLocalInterface instanceof m2x ? (m2x) queryLocalInterface : new e2x(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 4);
                }
                r5xVar.C = m2xVar;
                ((r5x) this.b).B = 2;
                r5x r5xVar2 = (r5x) this.b;
                kfx d = v5x.d(26);
                Objects.requireNonNull(d, "ApiSuccess should not be null");
                r5xVar2.g.X(d);
                break;
            case 2:
                zlx zlxVar = (zlx) this.b;
                zlxVar.b.f("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                zlxVar.a().post(new i9x(this, iBinder));
                break;
            default:
                hox hoxVar = (hox) this.b;
                hoxVar.b.e("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                hoxVar.a().post(new ylx(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.a) {
            case 0:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                ((x3n) this.b).b = null;
                break;
            case 1:
                l8x.g("BillingClientTesting", "Billing Override Service disconnected.");
                ((r5x) this.b).C = null;
                ((r5x) this.b).B = 0;
                break;
            case 2:
                zlx zlxVar = (zlx) this.b;
                zlxVar.b.f("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                zlxVar.a().post(new chx(1, this));
                break;
            default:
                hox hoxVar = (hox) this.b;
                hoxVar.b.e("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                hoxVar.a().post(new jkx(1, this));
                break;
        }
    }
}
