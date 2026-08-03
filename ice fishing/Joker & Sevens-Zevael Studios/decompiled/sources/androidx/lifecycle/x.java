package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class x extends Service implements u {

    /* renamed from: g, reason: collision with root package name */
    public final a5.c f731g;

    public x() {
        a5.c cVar = new a5.c();
        cVar.f262h = new w(this, true);
        cVar.f261g = new Handler();
        this.f731g = cVar;
    }

    @Override // androidx.lifecycle.u
    public final w h() {
        return (w) this.f731g.f262h;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        pc.j.e(intent, "intent");
        a5.c cVar = this.f731g;
        cVar.getClass();
        cVar.D(o.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        a5.c cVar = this.f731g;
        cVar.getClass();
        cVar.D(o.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        a5.c cVar = this.f731g;
        cVar.getClass();
        cVar.D(o.ON_STOP);
        cVar.D(o.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i10) {
        a5.c cVar = this.f731g;
        cVar.getClass();
        cVar.D(o.ON_START);
        super.onStart(intent, i10);
    }
}
