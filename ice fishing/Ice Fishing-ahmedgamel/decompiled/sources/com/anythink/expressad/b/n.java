package com.anythink.expressad.b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.b.l;
import com.anythink.expressad.foundation.h.u;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class n {
    public static void a(com.anythink.expressad.foundation.d.d dVar, com.anythink.expressad.b.a.b bVar, com.anythink.expressad.b.a.a aVar, String str, String str2, Context context, l.a aVar2, Semaphore semaphore) {
        if (!a(bVar.i()) && !u.a.a(bVar.i()) && 200 == aVar.f18909f && !TextUtils.isEmpty(bVar.f()) && !bVar.f().contains(com.anythink.expressad.foundation.g.a.bY)) {
            bVar.b(2);
            if (TextUtils.isEmpty(bVar.f())) {
                try {
                    new l().a(str, str2, context, bVar.i(), aVar2);
                } catch (Exception unused) {
                }
            } else {
                new l().a(str, str2, context, bVar.i(), bVar.f(), aVar2);
            }
            semaphore.acquireUninterruptibly();
            return;
        }
        if (aVar != null) {
            bVar.b(1);
            bVar.b(aVar.f18911h);
            bVar.a(aVar.f18909f);
            bVar.a(aVar.a());
            bVar.c(aVar.f18910g);
        }
        a(bVar.i(), dVar, bVar);
    }

    private static boolean b(String str) {
        return u.a.a(str);
    }

    private static boolean a(String str) {
        return !TextUtils.isEmpty(str) && str.toLowerCase().contains("apk");
    }

    public static boolean a(String str, com.anythink.expressad.foundation.d.d dVar, com.anythink.expressad.b.a.b bVar) {
        if (dVar != null) {
            dVar.R();
        }
        if (u.a.a(str)) {
            bVar.c(1);
            bVar.e(str);
            bVar.b(true);
            return true;
        }
        if (a(str)) {
            bVar.c(3);
            bVar.e(str);
            bVar.b(true);
            return true;
        }
        bVar.c(2);
        bVar.e(str);
        return false;
    }

    private static String a(com.anythink.expressad.foundation.d.d dVar, String str) {
        try {
            return dVar.v(str);
        } catch (Exception unused) {
            return str;
        }
    }
}
