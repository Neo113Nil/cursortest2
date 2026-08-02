package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes6.dex */
public final class w3i {
    public final a4i a;
    public final au1 b;
    public final z6u c;

    public w3i(Context context, p46 p46Var, a4i a4iVar) {
        p46Var.getClass();
        a4iVar.getClass();
        this.a = a4iVar;
        this.b = new au1(System.currentTimeMillis());
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        this.c = new z6u((ConnectivityManager) systemService, new awc(this));
        a4iVar.a.T("DiscoveryStartSearching", a4iVar.i());
    }
}
