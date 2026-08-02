package com.yandex.passport.internal.sloth;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class e {
    public final Context a;

    public e(Context context) {
        context.getClass();
        this.a = context;
    }

    public final b a() {
        Object t7oVar;
        Object t7oVar2;
        Object t7oVar3;
        Object systemService = this.a.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        int i = 2;
        if (connectivityManager == null) {
            c[] cVarArr = c.a;
            return new b(2, false, a.g, null);
        }
        try {
            r7o r7oVar = z7o.b;
            t7oVar = connectivityManager.getActiveNetwork();
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        Network network = (Network) t7oVar;
        if (network == null) {
            c[] cVarArr2 = c.a;
            return new b(2, false, a.g, null);
        }
        try {
            t7oVar2 = connectivityManager.getNetworkCapabilities(network);
        } catch (Throwable th2) {
            r7o r7oVar3 = z7o.b;
            t7oVar2 = new t7o(th2);
        }
        if (t7oVar2 instanceof t7o) {
            t7oVar2 = null;
        }
        NetworkCapabilities networkCapabilities = (NetworkCapabilities) t7oVar2;
        if (networkCapabilities == null) {
            c[] cVarArr3 = c.a;
            return new b(2, false, a.g, null);
        }
        boolean hasTransport = networkCapabilities.hasTransport(4);
        a aVar = networkCapabilities.hasTransport(1) ? a.a : networkCapabilities.hasTransport(0) ? a.b : networkCapabilities.hasTransport(3) ? a.c : networkCapabilities.hasTransport(2) ? a.d : networkCapabilities.hasTransport(5) ? a.e : networkCapabilities.hasTransport(6) ? a.f : a.g;
        if (hasTransport) {
            c[] cVarArr4 = c.a;
            i = 9;
        } else {
            switch (aVar.ordinal()) {
                case 0:
                    c[] cVarArr5 = c.a;
                    i = 1;
                    break;
                case 1:
                    c[] cVarArr6 = c.a;
                    i = 0;
                    break;
                case 2:
                    c[] cVarArr7 = c.a;
                    i = 4;
                    break;
                case 3:
                    c[] cVarArr8 = c.a;
                    i = 3;
                    break;
                case 4:
                    c[] cVarArr9 = c.a;
                    i = 12;
                    break;
                case 5:
                    c[] cVarArr10 = c.a;
                    i = 11;
                    break;
                case 6:
                    c[] cVarArr11 = c.a;
                    break;
                default:
                    b6e.s();
                    return null;
            }
        }
        try {
            t7oVar3 = Long.valueOf(network.getNetworkHandle());
        } catch (Throwable th3) {
            r7o r7oVar4 = z7o.b;
            t7oVar3 = new t7o(th3);
        }
        return new b(i, hasTransport, aVar, (Long) (t7oVar3 instanceof t7o ? null : t7oVar3));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        d dVar;
        int i;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dVar.j;
                Object obj2 = nm6.a;
                i = dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    dVar.l = 1;
                    obj = a();
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new Integer(((b) obj).a);
            }
        }
        dVar = new d(this, cg6Var);
        Object obj3 = dVar.j;
        Object obj22 = nm6.a;
        i = dVar.l;
        if (i != 0) {
        }
        return new Integer(((b) obj3).a);
    }
}
