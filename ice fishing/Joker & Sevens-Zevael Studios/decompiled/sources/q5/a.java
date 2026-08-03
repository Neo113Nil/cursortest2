package q5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import bc.a0;
import h6.b;
import h6.c;
import x4.l;
import yc.g;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final l f5817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l6.l f5818b;

    public a(l6.l lVar, l lVar2) {
        this.f5818b = lVar;
        this.f5817a = lVar2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object aVar;
        a0.z("Install Referrer service connected.");
        int i10 = b.f2864d;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            aVar = queryLocalInterface instanceof c ? (c) queryLocalInterface : new h6.a(iBinder);
        }
        l6.l lVar = this.f5818b;
        lVar.f4200c = aVar;
        lVar.f4198a = 2;
        this.f5817a.i(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a0.A("Install Referrer service disconnected.");
        l6.l lVar = this.f5818b;
        lVar.f4200c = null;
        lVar.f4198a = 0;
        g gVar = (g) this.f5817a.f8312h;
        if (gVar.u()) {
            gVar.resumeWith("");
        }
    }
}
