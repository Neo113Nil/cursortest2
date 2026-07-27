package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: n, reason: collision with root package name */
    public final Context f23448n;

    /* renamed from: u, reason: collision with root package name */
    public final com.bumptech.glide.o f23449u;

    public c(Context context, com.bumptech.glide.o oVar) {
        this.f23448n = context.getApplicationContext();
        this.f23449u = oVar;
    }

    @Override // com.bumptech.glide.manager.h
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStart() {
        p b9 = p.b(this.f23448n);
        com.bumptech.glide.o oVar = this.f23449u;
        synchronized (b9) {
            ((HashSet) b9.f23471w).add(oVar);
            b9.c();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStop() {
        p b9 = p.b(this.f23448n);
        com.bumptech.glide.o oVar = this.f23449u;
        synchronized (b9) {
            ((HashSet) b9.f23471w).remove(oVar);
            if (b9.f23469u && ((HashSet) b9.f23471w).isEmpty()) {
                o oVar2 = (o) b9.f23470v;
                ((ConnectivityManager) ((N1.h) oVar2.f23465v).get()).unregisterNetworkCallback((Q0.h) oVar2.f23466w);
                b9.f23469u = false;
            }
        }
    }
}
