package com.anythink.expressad.b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.b.l;
import com.anythink.expressad.foundation.h.u;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class j {
    public static void a(com.anythink.expressad.b.a.b bVar, com.anythink.expressad.b.a.a aVar, String str, String str2, Context context, l.a aVar2, h hVar, Semaphore semaphore) {
        if (!a(bVar.i()) && !u.a.a(bVar.i()) && 200 == aVar.f18122f && !TextUtils.isEmpty(bVar.f()) && !bVar.f().contains(com.anythink.expressad.foundation.g.a.bY)) {
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
            bVar.b(aVar.f18124h);
            bVar.a(aVar.f18122f);
            bVar.a(aVar.a());
            bVar.c(aVar.f18123g);
        }
        String i = bVar.i();
        if (u.a.a(i)) {
            bVar.c(1);
            bVar.e(i);
            bVar.b(true);
        } else if (a(i)) {
            bVar.c(3);
            bVar.e(i);
            bVar.b(true);
        } else {
            bVar.c(2);
            bVar.e(i);
        }
        if (hVar != null) {
            hVar.a(bVar);
        }
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(".apk") || str.contains(".APK");
    }

    public static boolean a(String str, com.anythink.expressad.b.a.b bVar) {
        if (u.a.a(bVar.i())) {
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
