package com.anythink.core.common.n.b.a.c;

import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.v;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class i {
    private i() {
    }

    private static String a(ad adVar, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(adVar.b());
        sb.append(' ');
        if (adVar.g() || type != Proxy.Type.HTTP) {
            sb.append(a(adVar.a()));
        } else {
            sb.append(adVar.a());
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    private static boolean b(ad adVar, Proxy.Type type) {
        return !adVar.g() && type == Proxy.Type.HTTP;
    }

    public static String a(v vVar) {
        String h3 = vVar.h();
        String j6 = vVar.j();
        if (j6 == null) {
            return h3;
        }
        return h3 + '?' + j6;
    }
}
