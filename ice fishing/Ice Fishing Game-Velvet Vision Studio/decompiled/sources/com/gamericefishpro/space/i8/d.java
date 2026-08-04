package com.gamericefishpro.space.i8;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.gamericefishpro.space.c8.j;
import com.gamericefishpro.space.j8.i;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ h d;
    public final /* synthetic */ j e;
    public final /* synthetic */ int i;
    public final /* synthetic */ Runnable v;

    public /* synthetic */ d(h hVar, j jVar, int i, Runnable runnable) {
        this.d = hVar;
        this.e = jVar;
        this.i = i;
        this.v = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final j jVar = this.e;
        final int i = this.i;
        Runnable runnable = this.v;
        final h hVar = this.d;
        com.gamericefishpro.space.k8.c cVar = (com.gamericefishpro.space.k8.c) hVar.f;
        try {
            com.gamericefishpro.space.j8.d dVar = (com.gamericefishpro.space.j8.d) hVar.c;
            Objects.requireNonNull(dVar);
            ((i) cVar).o(new com.gamericefishpro.space.a8.b(7, dVar));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) hVar.a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                ((i) cVar).o(new com.gamericefishpro.space.k8.b() { // from class: com.gamericefishpro.space.i8.e
                    @Override // com.gamericefishpro.space.k8.b
                    public final Object b() {
                        ((com.gamericefishpro.space.a8.c) hVar.d).z(jVar, i + 1, false);
                        return null;
                    }
                });
            } else {
                hVar.a(jVar, i);
            }
        } catch (com.gamericefishpro.space.k8.a unused) {
            ((com.gamericefishpro.space.a8.c) hVar.d).z(jVar, i + 1, false);
        } finally {
            runnable.run();
        }
    }
}
