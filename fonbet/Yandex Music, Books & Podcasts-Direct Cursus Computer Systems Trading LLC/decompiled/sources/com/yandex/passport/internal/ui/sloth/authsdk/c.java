package com.yandex.passport.internal.ui.sloth.authsdk;

import android.content.Intent;
import android.os.Bundle;
import defpackage.b6e;
import defpackage.k5r;
import defpackage.sqn;
import defpackage.xq0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class c implements sqn {
    public static final c a = new c();

    public static d b(String str) {
        return new d(new IllegalStateException("Internal error: Required response data is missing: ".concat(str)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c5, code lost:
    
        if (r2 == null) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g c(int i, Intent intent) {
        Throwable illegalArgumentException;
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        String str = null;
        String str2 = null;
        if (i == -1) {
            Bundle extras4 = intent != null ? intent.getExtras() : null;
            String str3 = extras4 != null ? !extras4.containsKey("passport-result-token") ? "token" : !extras4.containsKey("passport-result-token-type") ? "toke type" : !extras4.containsKey("passport-result-expires-in") ? "expires in" : null : "Bundle is empty";
            if (str3 != null) {
                return b(str3);
            }
            if (extras4 == null) {
                xq0.q("Internal error");
                return null;
            }
            String string = extras4.getString("passport-result-token");
            if (string == null) {
                xq0.q("can't get required string passport-result-token");
                return null;
            }
            String string2 = extras4.getString("passport-result-token-type");
            if (string2 != null) {
                return new f(extras4.getLong("passport-result-expires-in"), string, string2);
            }
            xq0.q("can't get required string passport-result-token-type");
            return null;
        }
        if (i == 0) {
            return b.a;
        }
        if (i == 13) {
            if (intent != null && (extras = intent.getExtras()) != null) {
                Serializable serializable = extras.getSerializable(Constants.KEY_EXCEPTION);
                illegalArgumentException = (Throwable) (serializable instanceof Throwable ? serializable : null);
            }
            illegalArgumentException = new IllegalArgumentException("Throwable is missing in data");
            return new d(illegalArgumentException);
        }
        if (i == 392) {
            if (intent == null || (extras2 = intent.getExtras()) == null) {
                return b("Bundle is empty");
            }
            if (!extras2.containsKey("passport-result-environment")) {
                str2 = "Environment";
            } else if (!extras2.containsKey("passport-result-uid")) {
                str2 = "Uid";
            }
            if (str2 != null) {
                return b(str2);
            }
            int i2 = extras2.getInt("passport-result-environment");
            long j = extras2.getLong("passport-result-uid");
            com.yandex.passport.common.core.b.b.getClass();
            return new e(new com.yandex.passport.common.core.f(com.yandex.passport.common.core.a.b(i2), j));
        }
        if (i != 666) {
            return new d(new IllegalStateException(k5r.i(i, "Unknown resultCode=")));
        }
        if (intent == null || (extras3 = intent.getExtras()) == null) {
            return b("Bundle is empty");
        }
        if (!extras3.containsKey("passport-result-environment")) {
            str = "Environment";
        } else if (!extras3.containsKey("passport-result-uid")) {
            str = "Uid";
        }
        if (str != null) {
            return b(str);
        }
        int i3 = extras3.getInt("passport-result-environment");
        long j2 = extras3.getLong("passport-result-uid");
        com.yandex.passport.common.core.b.b.getClass();
        return new a(new com.yandex.passport.common.core.f(com.yandex.passport.common.core.a.b(i3), j2));
    }

    @Override // defpackage.sqn
    public Object a(Object obj, Object obj2) {
        y yVar = (y) obj;
        v vVar = (v) obj2;
        yVar.getClass();
        if (vVar instanceof u) {
            return new y(((u) vVar).a, yVar.b);
        }
        if (vVar instanceof t) {
            return new y(yVar.a, ((t) vVar).a);
        }
        b6e.s();
        return null;
    }
}
