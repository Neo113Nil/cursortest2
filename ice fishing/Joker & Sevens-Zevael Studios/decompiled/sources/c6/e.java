package c6;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f1245g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w5.i f1246h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1247i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Runnable f1248j;

    public /* synthetic */ e(l lVar, w5.i iVar, int i10, Runnable runnable) {
        this.f1245g = lVar;
        this.f1246h = iVar;
        this.f1247i = i10;
        this.f1248j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final w5.i iVar = this.f1246h;
        final int i10 = this.f1247i;
        Runnable runnable = this.f1248j;
        final l lVar = this.f1245g;
        e6.c cVar = (e6.c) lVar.f1273f;
        try {
            try {
                d6.d dVar = (d6.d) lVar.f1270c;
                Objects.requireNonNull(dVar);
                ((d6.j) cVar).i(new f(1, dVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) lVar.f1268a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((d6.j) cVar).i(new e6.b() { // from class: c6.g
                        @Override // e6.b
                        public final Object a() {
                            ((a5.c) l.this.f1271d).I(iVar, i10 + 1, false);
                            return null;
                        }
                    });
                } else {
                    lVar.a(iVar, i10);
                }
                runnable.run();
            } catch (e6.a unused) {
                ((a5.c) lVar.f1271d).I(iVar, i10 + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
