package com.yandex.passport.internal.sso;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.analytics.r;
import com.yandex.passport.internal.sso.SsoContentProvider;
import defpackage.i4w;
import defpackage.xy0;

/* loaded from: classes4.dex */
public final class j {
    public final Context a;
    public final o0 b;
    public final g c;

    public j(Context context, o0 o0Var, g gVar) {
        context.getClass();
        o0Var.getClass();
        gVar.getClass();
        this.a = context;
        this.b = o0Var;
        this.c = gVar;
    }

    public final Bundle a(String str, SsoContentProvider.Method method, Bundle bundle) {
        ContentProviderClient acquireUnstableContentProviderClient;
        Bundle call;
        Bundle call2;
        ContentResolver contentResolver = this.a.getContentResolver();
        contentResolver.getClass();
        Uri parse = Uri.parse("content://com.yandex.passport.internal.sso." + str);
        parse.getClass();
        try {
            try {
                String name = method.name();
                name.getClass();
                acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(parse);
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        call2 = acquireUnstableContentProviderClient.call(name, null, bundle);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    call2 = null;
                }
                i4w.w(acquireUnstableContentProviderClient, null);
                return call2;
            } catch (RemoteException e) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "call, trying again: " + e.getMessage(), 8);
                }
                String name2 = method.name();
                name2.getClass();
                acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(parse);
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        call = acquireUnstableContentProviderClient.call(name2, null, bundle);
                    } finally {
                    }
                } else {
                    call = null;
                }
                i4w.w(acquireUnstableContentProviderClient, null);
                return call;
            }
        } catch (Exception e2) {
            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "call", e2);
            }
            o0 o0Var = this.b;
            o0Var.getClass();
            str.getClass();
            r rVar = r.c;
            xy0 xy0Var = new xy0(0);
            xy0Var.put("remote_package_name", str);
            xy0Var.put("error", Log.getStackTraceString(e2));
            o0Var.a.b(rVar, xy0Var);
            return null;
        }
    }
}
