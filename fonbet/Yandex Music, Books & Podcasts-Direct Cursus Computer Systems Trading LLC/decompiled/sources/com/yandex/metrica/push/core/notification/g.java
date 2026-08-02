package com.yandex.metrica.push.core.notification;

import android.app.NotificationManager;
import android.content.Context;
import com.yandex.metrica.push.common.utils.InternalLogger;
import com.yandex.metrica.push.common.utils.TrackersHub;
import com.yandex.metrica.push.impl.C0077n;
import com.yandex.metrica.push.impl.C0080q;
import com.yandex.metrica.push.utils.j;
import defpackage.f1d;
import defpackage.su4;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class g {
    private final Context a;

    public g(Context context) {
        this.a = context;
    }

    public String a(String str, int i) {
        C0080q.a aVar;
        boolean a;
        Iterator<C0080q.a> it = C0077n.a(this.a).g().c().iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (com.yandex.metrica.push.utils.f.a(aVar.c, str) && com.yandex.metrica.push.utils.f.a(aVar.b, Integer.valueOf(i))) {
                break;
            }
        }
        String str2 = aVar == null ? null : aVar.a;
        boolean z = aVar != null && Boolean.TRUE.equals(aVar.d);
        if (com.yandex.metrica.push.utils.f.a(23) && (a = j.a((NotificationManager) this.a.getSystemService("notification"), str, i)) != z) {
            String str3 = z ? "" : "not ";
            String str4 = a ? "" : "not ";
            StringBuilder l = f1d.l(i, "Failed get active status for notification [", str, ", ", "]. Preferences has pushId ");
            su4.v(l, str2, " (", str3, "active), but notification in status bar is ");
            String o = su4.o(l, str4, "active");
            TrackersHub.getInstance().reportError(o, null);
            InternalLogger.e(o, new Object[0]);
            z = a;
        }
        if (z) {
            return str2;
        }
        return null;
    }
}
