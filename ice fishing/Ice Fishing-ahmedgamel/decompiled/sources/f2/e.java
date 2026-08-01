package f2;

import H3.l;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import g2.InterfaceC4527d;
import h2.C4562a;
import h2.InterfaceC4563b;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f37469n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z1.i f37470u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f37471v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Runnable f37472w;

    public /* synthetic */ e(i iVar, Z1.i iVar2, int i, Runnable runnable) {
        this.f37469n = iVar;
        this.f37470u = iVar2;
        this.f37471v = i;
        this.f37472w = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Z1.i iVar = this.f37470u;
        final int i = this.f37471v;
        Runnable runnable = this.f37472w;
        final i iVar2 = this.f37469n;
        h2.c cVar = iVar2.f37487f;
        try {
            try {
                InterfaceC4527d interfaceC4527d = iVar2.f37484c;
                Objects.requireNonNull(interfaceC4527d);
                ((g2.h) cVar).m(new l(7, interfaceC4527d));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) iVar2.f37482a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((g2.h) cVar).m(new InterfaceC4563b() { // from class: f2.f
                        @Override // h2.InterfaceC4563b
                        public final Object c() {
                            i.this.f37485d.a(iVar, i + 1, false);
                            return null;
                        }
                    });
                } else {
                    iVar2.a(iVar, i);
                }
                runnable.run();
            } catch (C4562a unused) {
                iVar2.f37485d.a(iVar, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
