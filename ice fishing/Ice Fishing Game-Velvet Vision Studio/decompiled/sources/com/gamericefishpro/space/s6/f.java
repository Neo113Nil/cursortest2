package com.gamericefishpro.space.s6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.gamericefishpro.space.l6.q;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ g a;

    public f(g gVar) {
        this.a = gVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        q qVarC = q.c();
        String str = h.a;
        Objects.toString(capabilities);
        qVarC.getClass();
        g gVar = this.a;
        gVar.e(h.a(gVar.f));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        q qVarC = q.c();
        String str = h.a;
        qVarC.getClass();
        g gVar = this.a;
        gVar.e(h.a(gVar.f));
    }
}
