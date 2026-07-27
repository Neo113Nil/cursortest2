package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: n, reason: collision with root package name */
    public final Context f23604n;

    /* renamed from: u, reason: collision with root package name */
    public final com.bumptech.glide.o f23605u;

    public c(Context context, com.bumptech.glide.o oVar) {
        this.f23604n = context.getApplicationContext();
        this.f23605u = oVar;
    }

    @Override // com.bumptech.glide.manager.h
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStart() {
        o b9 = o.b(this.f23604n);
        com.bumptech.glide.o oVar = this.f23605u;
        synchronized (b9) {
            ((HashSet) b9.f23625w).add(oVar);
            b9.c();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStop() {
        o b9 = o.b(this.f23604n);
        com.bumptech.glide.o oVar = this.f23605u;
        synchronized (b9) {
            ((HashSet) b9.f23625w).remove(oVar);
            if (b9.f23623u && ((HashSet) b9.f23625w).isEmpty()) {
                n nVar = (n) b9.f23624v;
                ((ConnectivityManager) ((N1.h) nVar.f23619v).get()).unregisterNetworkCallback((Q0.h) nVar.f23620w);
                b9.f23623u = false;
            }
        }
    }
}
