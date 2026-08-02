package com.yandex.passport.internal.storage;

import android.content.SharedPreferences;
import defpackage.c5b;
import defpackage.ern;
import defpackage.jp0;
import defpackage.nc3;
import defpackage.opi;
import defpackage.s9f;

/* loaded from: classes4.dex */
public final class e {
    public static final /* synthetic */ s9f[] d;
    public final nc3 a;
    public final nc3 b;
    public final jp0 c;

    static {
        opi opiVar = new opi(e.class, "isAutoLoginDisabled", "isAutoLoginDisabled()Z", 0);
        ern.a.getClass();
        d = new s9f[]{opiVar, new opi(e.class, "isSubscriptionAllowed", "isSubscriptionAllowed()Z", 0), new opi(e.class, "latestSyncTimestamps", "getLatestSyncTimestamps()Ljava/util/List;", 0)};
    }

    public e(m mVar, com.yandex.passport.common.core.f fVar) {
        fVar.getClass();
        SharedPreferences sharedPreferences = mVar.a;
        sharedPreferences.getClass();
        StringBuilder sb = new StringBuilder("is_auto_login_disabled/%s/");
        long j = fVar.b;
        sb.append(j);
        this.a = new nc3(sharedPreferences, false, sb.toString());
        SharedPreferences sharedPreferences2 = mVar.a;
        sharedPreferences2.getClass();
        this.b = new nc3(sharedPreferences2, true, "is_subscription_allowed/" + j);
        sharedPreferences2.getClass();
        this.c = new jp0(sharedPreferences2, c5b.a, "sync_timestamps/%s/" + j, false, new d(1), new d(0));
    }

    public final void a(boolean z) {
        this.a.setValue(this, d[0], Boolean.valueOf(z));
    }
}
