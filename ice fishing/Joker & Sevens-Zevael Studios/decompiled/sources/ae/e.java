package ae;

import android.content.ComponentName;
import android.os.RemoteException;
import m0.d1;
import p.i;
import p.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f348a;

    public e(d1 d1Var) {
        this.f348a = d1Var;
    }

    @Override // p.i
    public final void onCustomTabsServiceConnected(ComponentName componentName, p.c cVar) {
        j jVar;
        b.d dVar = cVar.f5398a;
        pc.j.e(componentName, "name");
        try {
            ((b.b) dVar).d();
        } catch (RemoteException unused) {
        }
        p.b bVar = new p.b(new m6.i(3));
        if (((b.b) dVar).c(bVar)) {
            jVar = new j(dVar, bVar, cVar.f5399b);
            this.f348a.setValue(jVar);
        }
        jVar = null;
        this.f348a.setValue(jVar);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        pc.j.e(componentName, "name");
        this.f348a.setValue(null);
    }
}
