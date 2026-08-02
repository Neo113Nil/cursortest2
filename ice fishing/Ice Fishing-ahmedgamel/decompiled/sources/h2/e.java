package h2;

import J3.l;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import i2.InterfaceC4590d;
import j2.C4610a;
import j2.InterfaceC4611b;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f38093n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b2.i f38094u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f38095v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Runnable f38096w;

    public /* synthetic */ e(i iVar, b2.i iVar2, int i, Runnable runnable) {
        this.f38093n = iVar;
        this.f38094u = iVar2;
        this.f38095v = i;
        this.f38096w = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final b2.i iVar = this.f38094u;
        final int i = this.f38095v;
        Runnable runnable = this.f38096w;
        final i iVar2 = this.f38093n;
        j2.c cVar = iVar2.f38111f;
        try {
            try {
                InterfaceC4590d interfaceC4590d = iVar2.f38108c;
                Objects.requireNonNull(interfaceC4590d);
                ((i2.h) cVar).m(new l(7, interfaceC4590d));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) iVar2.f38106a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((i2.h) cVar).m(new InterfaceC4611b() { // from class: h2.f
                        @Override // j2.InterfaceC4611b
                        public final Object d() {
                            i.this.f38109d.a(iVar, i + 1, false);
                            return null;
                        }
                    });
                } else {
                    iVar2.a(iVar, i);
                }
                runnable.run();
            } catch (C4610a unused) {
                iVar2.f38109d.a(iVar, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
