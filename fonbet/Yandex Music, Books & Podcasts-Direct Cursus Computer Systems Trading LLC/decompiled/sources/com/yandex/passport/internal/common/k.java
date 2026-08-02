package com.yandex.passport.internal.common;

import android.content.Context;
import android.net.ConnectivityManager;
import com.yandex.passport.internal.ui.sloth.authsdk.h0;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.r7o;
import defpackage.rqi;
import defpackage.t7o;
import defpackage.xd0;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class k {
    public final Context a;
    public final qqi b;
    public xd0 c;

    public k(Context context) {
        context.getClass();
        this.a = context;
        this.b = rqi.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        h hVar;
        int i;
        qqi qqiVar;
        try {
            if (cg6Var instanceof h) {
                hVar = (h) cg6Var;
                int i2 = hVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = hVar.k;
                    nm6 nm6Var = nm6.a;
                    i = hVar.m;
                    boolean z = true;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqi qqiVar2 = this.b;
                        hVar.j = qqiVar2;
                        hVar.m = 1;
                        if (qqiVar2.a(hVar) == nm6Var) {
                            return nm6Var;
                        }
                        qqiVar = qqiVar2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqiVar = hVar.j;
                        qgg.h0(obj);
                    }
                    if (this.c != null) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }
            if (this.c != null) {
            }
            return Boolean.valueOf(z);
        } finally {
            qqiVar.b(null);
        }
        hVar = new h(this, cg6Var);
        Object obj2 = hVar.k;
        nm6 nm6Var2 = nm6.a;
        i = hVar.m;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x0058, TryCatch #1 {all -> 0x0058, blocks: (B:11:0x0046, B:13:0x004e, B:14:0x005a, B:17:0x00b3, B:22:0x005f, B:24:0x006b, B:27:0x0073, B:30:0x008d, B:32:0x0093, B:34:0x009d, B:35:0x00a4, B:36:0x00a6, B:39:0x00ad, B:42:0x0085, B:29:0x007a), top: B:10:0x0046, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[Catch: all -> 0x0058, TryCatch #1 {all -> 0x0058, blocks: (B:11:0x0046, B:13:0x004e, B:14:0x005a, B:17:0x00b3, B:22:0x005f, B:24:0x006b, B:27:0x0073, B:30:0x008d, B:32:0x0093, B:34:0x009d, B:35:0x00a4, B:36:0x00a6, B:39:0x00ad, B:42:0x0085, B:29:0x007a), top: B:10:0x0046, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(h0 h0Var, cg6 cg6Var) {
        i iVar;
        int i;
        qqi qqiVar;
        Object t7oVar;
        try {
            if (cg6Var instanceof i) {
                iVar = (i) cg6Var;
                int i2 = iVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    iVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = iVar.l;
                    nm6 nm6Var = nm6.a;
                    i = iVar.n;
                    boolean z = true;
                    if (i != 0) {
                        qgg.h0(obj);
                        iVar.j = h0Var;
                        qqiVar = this.b;
                        iVar.k = qqiVar;
                        iVar.n = 1;
                        if (qqiVar.a(iVar) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = iVar.k;
                        h0 h0Var2 = iVar.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        h0Var = h0Var2;
                    }
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "registerDefaultNetworkCallback", 8);
                    }
                    if (this.c != null) {
                        Object systemService = this.a.getSystemService("connectivity");
                        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                        if (connectivityManager == null) {
                            z = false;
                        } else {
                            xd0 xd0Var = new xd0(9, h0Var);
                            try {
                                r7o r7oVar = z7o.b;
                                connectivityManager.registerDefaultNetworkCallback(xd0Var);
                                this.c = xd0Var;
                                t7oVar = Boolean.TRUE;
                            } catch (Throwable th) {
                                r7o r7oVar2 = z7o.b;
                                t7oVar = new t7o(th);
                            }
                            Throwable a = z7o.a(t7oVar);
                            if (a != null) {
                                com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Failed to register vpn network callback", a);
                                }
                                this.c = null;
                            }
                            Boolean bool = Boolean.FALSE;
                            if (t7oVar instanceof t7o) {
                                t7oVar = bool;
                            }
                            z = ((Boolean) t7oVar).booleanValue();
                        }
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    qqiVar.b(null);
                    return valueOf;
                }
            }
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            }
            if (this.c != null) {
            }
            Boolean valueOf2 = Boolean.valueOf(z);
            qqiVar.b(null);
            return valueOf2;
        } catch (Throwable th2) {
            qqiVar.b(null);
            throw th2;
        }
        iVar = new i(this, cg6Var);
        Object obj2 = iVar.l;
        nm6 nm6Var2 = nm6.a;
        i = iVar.n;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:11:0x0041, B:13:0x0049, B:14:0x0055, B:17:0x00a5, B:22:0x005a, B:24:0x0066, B:29:0x0081, B:31:0x0087, B:33:0x0091, B:34:0x0098, B:37:0x009f, B:40:0x0079, B:28:0x006e), top: B:10:0x0041, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:11:0x0041, B:13:0x0049, B:14:0x0055, B:17:0x00a5, B:22:0x005a, B:24:0x0066, B:29:0x0081, B:31:0x0087, B:33:0x0091, B:34:0x0098, B:37:0x009f, B:40:0x0079, B:28:0x006e), top: B:10:0x0041, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        j jVar;
        int i;
        qqi qqiVar;
        xd0 xd0Var;
        Object t7oVar;
        try {
            if (cg6Var instanceof j) {
                jVar = (j) cg6Var;
                int i2 = jVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = jVar.k;
                    nm6 nm6Var = nm6.a;
                    i = jVar.m;
                    boolean z = true;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqi qqiVar2 = this.b;
                        jVar.j = qqiVar2;
                        jVar.m = 1;
                        if (qqiVar2.a(jVar) == nm6Var) {
                            return nm6Var;
                        }
                        qqiVar = qqiVar2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqiVar = jVar.j;
                        qgg.h0(obj);
                    }
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "unregisterDefaultNetworkCallback", 8);
                    }
                    xd0Var = this.c;
                    if (xd0Var == null) {
                        Object systemService = this.a.getSystemService("connectivity");
                        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                        if (connectivityManager == null) {
                            z = false;
                        } else {
                            try {
                                r7o r7oVar = z7o.b;
                                connectivityManager.unregisterNetworkCallback(xd0Var);
                                this.c = null;
                                t7oVar = Boolean.TRUE;
                            } catch (Throwable th) {
                                r7o r7oVar2 = z7o.b;
                                t7oVar = new t7o(th);
                            }
                            Throwable a = z7o.a(t7oVar);
                            if (a != null) {
                                com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Failed to unregister vpn network callback", a);
                                }
                            }
                            Boolean bool = Boolean.FALSE;
                            if (t7oVar instanceof t7o) {
                                t7oVar = bool;
                            }
                            z = ((Boolean) t7oVar).booleanValue();
                        }
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    qqiVar.b(null);
                    return valueOf;
                }
            }
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            }
            xd0Var = this.c;
            if (xd0Var == null) {
            }
            Boolean valueOf2 = Boolean.valueOf(z);
            qqiVar.b(null);
            return valueOf2;
        } catch (Throwable th2) {
            qqiVar.b(null);
            throw th2;
        }
        jVar = new j(this, cg6Var);
        Object obj2 = jVar.k;
        nm6 nm6Var2 = nm6.a;
        i = jVar.m;
        boolean z2 = true;
        if (i != 0) {
        }
    }
}
