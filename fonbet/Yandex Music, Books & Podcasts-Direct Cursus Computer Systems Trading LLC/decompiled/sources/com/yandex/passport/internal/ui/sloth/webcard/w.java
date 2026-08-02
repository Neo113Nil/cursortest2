package com.yandex.passport.internal.ui.sloth.webcard;

import android.content.Intent;
import android.os.Bundle;
import defpackage.b6e;
import defpackage.k5r;
import defpackage.sqn;
import defpackage.xq0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class w implements sqn {
    public static final w a = new w();

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0137, code lost:
    
        if (r1 == null) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s0 b(int i, Intent intent) {
        Throwable illegalArgumentException;
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        n0 n0Var = n0.b;
        if (i == -1 || i == 0) {
            return n0Var;
        }
        String str = null;
        String str2 = null;
        if (i == 13) {
            if (intent != null && (extras = intent.getExtras()) != null) {
                Serializable serializable = extras.getSerializable(Constants.KEY_EXCEPTION);
                illegalArgumentException = (Throwable) (serializable instanceof Throwable ? serializable : null);
            }
            illegalArgumentException = new IllegalArgumentException("Throwable is missing in data");
            return new p0(illegalArgumentException);
        }
        if (i == 392) {
            if (intent == null || (extras2 = intent.getExtras()) == null) {
                return new p0(new IllegalStateException("Bundle is empty"));
            }
            if (!extras2.containsKey("passport-result-environment")) {
                str2 = "Environment";
            } else if (!extras2.containsKey("passport-result-uid")) {
                str2 = "Uid";
            }
            if (str2 != null) {
                return new p0(new IllegalStateException("Internal error: Required response data is missing: ".concat(str2)));
            }
            int i2 = extras2.getInt("passport-result-environment");
            long j = extras2.getLong("passport-result-uid");
            com.yandex.passport.common.core.b.b.getClass();
            return new r0(new com.yandex.passport.common.core.f(com.yandex.passport.common.core.a.b(i2), j));
        }
        if (i == 666) {
            return n0.a;
        }
        if (i == 17121) {
            return n0.c;
        }
        if (i != 42) {
            if (i != 43) {
                return new p0(new IllegalStateException(k5r.i(i, "Unknown resultCode=")));
            }
            if (intent == null || (extras3 = intent.getExtras()) == null) {
                xq0.q("Internal error: Bundle is empty");
                return null;
            }
            if (!extras3.containsKey("passport-result-url")) {
                return new p0(new IllegalStateException("Internal error: Required response data is missing: URL"));
            }
            String string = extras3.getString("passport-result-url");
            if (string != null) {
                return new o0(string);
            }
            xq0.q("can't get required string passport-result-url");
            return null;
        }
        Bundle extras4 = intent != null ? intent.getExtras() : null;
        if (extras4 == null) {
            str = "Bundle is empty";
        } else if (!extras4.containsKey("passport-result-url")) {
            str = "Url";
        } else if (!extras4.containsKey("passport-result-purpose")) {
            str = "Purpose";
        }
        if (str != null) {
            return new p0(new IllegalStateException("Internal error: Required response data is missing: ".concat(str)));
        }
        if (extras4 == null) {
            xq0.q("Internal error");
            return null;
        }
        String string2 = extras4.getString("passport-result-url");
        if (string2 == null) {
            xq0.q("can't get required string passport-result-url");
            return null;
        }
        String string3 = extras4.getString("passport-result-purpose");
        if (string3 != null) {
            return new q0(string2, string3);
        }
        xq0.q("can't get required string passport-result-purpose");
        return null;
    }

    @Override // defpackage.sqn
    public Object a(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        v vVar = (v) obj2;
        c0Var.getClass();
        if (vVar instanceof t) {
            return c0.a(c0Var, null, ((t) vVar).a, null, 5);
        }
        if (vVar instanceof s) {
            return c0.a(c0Var, null, null, ((s) vVar).a, 3);
        }
        if (vVar instanceof u) {
            return c0.a(c0Var, ((u) vVar).a, null, null, 6);
        }
        b6e.s();
        return null;
    }
}
