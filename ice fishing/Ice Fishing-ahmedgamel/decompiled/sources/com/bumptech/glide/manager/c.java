package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: n, reason: collision with root package name */
    public final Context f24235n;

    /* renamed from: u, reason: collision with root package name */
    public final com.bumptech.glide.o f24236u;

    public c(Context context, com.bumptech.glide.o oVar) {
        this.f24235n = context.getApplicationContext();
        this.f24236u = oVar;
    }

    @Override // com.bumptech.glide.manager.h
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStart() {
        o b9 = o.b(this.f24235n);
        com.bumptech.glide.o oVar = this.f24236u;
        synchronized (b9) {
            ((HashSet) b9.f24256w).add(oVar);
            b9.c();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStop() {
        o b9 = o.b(this.f24235n);
        com.bumptech.glide.o oVar = this.f24236u;
        synchronized (b9) {
            ((HashSet) b9.f24256w).remove(oVar);
            if (b9.f24254u && ((HashSet) b9.f24256w).isEmpty()) {
                n nVar = (n) b9.f24255v;
                ((ConnectivityManager) ((P1.h) nVar.f24250v).get()).unregisterNetworkCallback((Q0.h) nVar.f24251w);
                b9.f24254u = false;
            }
        }
    }
}
