package com.yandex.passport.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFormatException;
import defpackage.b6e;
import defpackage.k5r;
import defpackage.xq0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class q {
    public static final q a = new q();

    public static h a(int i) {
        for (h hVar : h.values()) {
            if (hVar.a.a == i) {
                return hVar;
            }
        }
        return null;
    }

    public static h b(k0 k0Var) {
        k0Var.getClass();
        h a2 = a(k0Var.d());
        if (a2 != null) {
            return a2;
        }
        b6e.l(k0Var, "Unknown environment ");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        if (r3 == null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v c(int i, Intent intent) {
        Throwable illegalArgumentException;
        Bundle extras;
        String str = null;
        if (i == -1) {
            Bundle extras2 = intent != null ? intent.getExtras() : null;
            String e = e(extras2);
            if (e != null) {
                return new r(new IllegalStateException("Internal error: Required response data is missing: ".concat(e)));
            }
            if (extras2 == null) {
                xq0.q("Internal error");
                return null;
            }
            int i2 = extras2.getInt("passport-login-result-environment");
            long j = extras2.getLong("passport-login-result-uid");
            int i3 = extras2.getInt("passport-login-action");
            String string = extras2.getString("passport-login-additional-action");
            com.yandex.passport.api.impl.b a2 = com.yandex.passport.api.impl.b.a(i2);
            a2.getClass();
            z1 z1Var = new z1(a2, j);
            com.yandex.passport.internal.account.f fVar = (com.yandex.passport.internal.account.f) com.appsflyer.internal.k.h(extras2, com.yandex.passport.internal.util.p.class, "passport-account");
            if (fVar != null) {
                return new t(z1Var, fVar, w0.values()[i3], string != null ? string : null, extras2.getString("phone-number"));
            }
            throw new ParcelFormatException("Invalid parcelable " + com.yandex.passport.internal.account.f.class.getSimpleName() + " in the bundle");
        }
        if (i == 0) {
            return p.a;
        }
        if (i == 6) {
            return s.a;
        }
        if (i == 13) {
            if (intent != null && (extras = intent.getExtras()) != null) {
                Serializable serializable = extras.getSerializable(Constants.KEY_EXCEPTION);
                illegalArgumentException = (Throwable) (serializable instanceof Throwable ? serializable : null);
            }
            illegalArgumentException = new IllegalArgumentException("Throwable is missing in data");
            return new r(illegalArgumentException);
        }
        if (i != 42) {
            return new r(new IllegalStateException(k5r.i(i, "Unknown resultCode=")));
        }
        Bundle extras3 = intent != null ? intent.getExtras() : null;
        if (extras3 == null) {
            str = "Bundle is empty";
        } else if (!extras3.containsKey("passport-result-url")) {
            str = "Environment";
        } else if (!extras3.containsKey("passport-result-purpose")) {
            str = "Uid";
        }
        if (str != null) {
            return new r(new IllegalStateException("Internal error: Required response data is missing: ".concat(str)));
        }
        if (extras3 == null) {
            xq0.q("Internal error");
            return null;
        }
        String string2 = extras3.getString("passport-result-url");
        if (string2 == null) {
            xq0.q("can't get required string passport-result-url");
            return null;
        }
        String string3 = extras3.getString("passport-result-purpose");
        if (string3 != null) {
            return new u(string2, string3);
        }
        xq0.q("can't get required string passport-result-purpose");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r3 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j0 d(int i, Intent intent) {
        Throwable illegalArgumentException;
        Bundle extras;
        if (i == -1) {
            return h0.c;
        }
        if (i == 0) {
            return h0.a;
        }
        if (i == 6) {
            return h0.b;
        }
        if (i != 13) {
            return new i0(new IllegalStateException(k5r.i(i, "Unknown resultCode=")));
        }
        if (intent != null && (extras = intent.getExtras()) != null) {
            Serializable serializable = extras.getSerializable(Constants.KEY_EXCEPTION);
            if (!(serializable instanceof Throwable)) {
                serializable = null;
            }
            illegalArgumentException = (Throwable) serializable;
        }
        illegalArgumentException = new IllegalArgumentException("Throwable is missing in data");
        return new i0(illegalArgumentException);
    }

    public static String e(Bundle bundle) {
        if (bundle == null) {
            return "Bundle is empty";
        }
        if (!bundle.containsKey("passport-login-result-environment")) {
            return "Environment";
        }
        if (!bundle.containsKey("passport-login-result-uid")) {
            return "Uid";
        }
        if (!bundle.containsKey("passport-login-action")) {
            return "Login Action";
        }
        if (bundle.containsKey("passport-account")) {
            return null;
        }
        return "Account data";
    }

    public static n h(int i, boolean z) {
        return i != 1 ? i != 10 ? i != 12 ? i != 24 ? i != 5 ? i != 6 ? i != 7 ? n.UNDEFINED : n.PDD : n.SOCIAL : n.LITE : n.PORTAL : n.MAILISH : z ? n.MUSIC_PHONISH : n.PHONISH : n.PORTAL;
    }

    public void f(v0 v0Var, String str, String str2) {
        str2.getClass();
    }

    public void g(v0 v0Var, String str, String str2, Throwable th) {
        str2.getClass();
        th.getClass();
    }
}
