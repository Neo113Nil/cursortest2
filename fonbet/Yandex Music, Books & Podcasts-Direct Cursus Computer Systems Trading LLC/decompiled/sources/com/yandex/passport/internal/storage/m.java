package com.yandex.passport.internal.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.passport.common.network.r;
import defpackage.ern;
import defpackage.jp0;
import defpackage.nc3;
import defpackage.opi;
import defpackage.s9f;
import defpackage.vlv;

/* loaded from: classes4.dex */
public final class m {
    public static final /* synthetic */ s9f[] m;
    public final SharedPreferences a;
    public final jp0 b;
    public final jp0 c;
    public final jp0 d;
    public final jp0 e;
    public final jp0 f;
    public final jp0 g;
    public final nc3 h;
    public final nc3 i;
    public final jp0 j;
    public final nc3 k;
    public final nc3 l;

    static {
        opi opiVar = new opi(m.class, "pushTokenVersion", "getPushTokenVersion()Ljava/lang/String;", 0);
        ern.a.getClass();
        m = new s9f[]{opiVar, new opi(m.class, "currentAccountName", "getCurrentAccountName()Ljava/lang/String;", 0), new opi(m.class, "currentAccountUid", "getCurrentAccountUid()Lcom/yandex/passport/common/core/Uid;", 0), new opi(m.class, "authenticatorPackageName", "getAuthenticatorPackageName()Ljava/lang/String;", 0), new opi(m.class, "smsCode", "getSmsCode()Ljava/lang/String;", 0), new opi(m.class, "smsFrom", "getSmsFrom()Ljava/lang/String;", 0), new opi(m.class, "isAutoLoginFromCredentialManagerDisabled", "isAutoLoginFromCredentialManagerDisabled()Z", 0), new opi(m.class, "latestPassportVersion", "getLatestPassportVersion()I", 0), new opi(m.class, "masterTokenKey", "getMasterTokenKey()Ljava/lang/String;", 0), new opi(m.class, "webAmSessionIndicator", "getWebAmSessionIndicator()Z", 0), new opi(m.class, "lastCoreActivationTime", "getLastCoreActivationTime()J", 0), new opi(m.class, "accountCount", "getAccountCount()I", 0)};
    }

    public m(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("yandex_am_storage", 0);
        this.a = sharedPreferences;
        sharedPreferences.getClass();
        this.b = new jp0(sharedPreferences, null, "lib_saved_version", false, h.a, f.d);
        this.c = new jp0(sharedPreferences, null, "current_account_name", false, i.a, f.e);
        this.d = new jp0(sharedPreferences, null, "current_account_uid", false, new vlv(1, com.yandex.passport.internal.serialization.b.a, com.yandex.passport.internal.serialization.b.class, "from", "from(Ljava/lang/String;)Lcom/yandex/passport/common/core/Uid;", 0, 23), new r(29));
        this.e = new jp0(sharedPreferences, null, "authenticator_package_name", true, j.a, f.f);
        this.f = new jp0(sharedPreferences, null, "sms_code", false, k.a, f.g);
        this.g = new jp0(sharedPreferences, null, "sms_from", false, l.a, f.b);
        this.h = new nc3(sharedPreferences, false, "is_auto_login_from_smartlock_disabled");
        this.i = new nc3(sharedPreferences, -1, "latest_passport_version");
        this.j = new jp0(sharedPreferences, null, "master_token_key", false, g.a, f.c);
        this.k = new nc3(sharedPreferences, (Object) 0L, "core_activation_sending_time");
        this.l = new nc3(sharedPreferences, 0, "account_count");
    }

    public final e a(com.yandex.passport.common.core.f fVar) {
        fVar.getClass();
        return new e(this, fVar);
    }

    public final int b() {
        return ((Number) this.l.getValue(this, m[11])).intValue();
    }

    public final com.yandex.passport.common.core.f c() {
        return (com.yandex.passport.common.core.f) this.d.getValue(this, m[2]);
    }
}
