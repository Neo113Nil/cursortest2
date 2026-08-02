package com.yandex.passport.internal.push;

import android.os.Bundle;
import defpackage.ern;
import defpackage.s9f;
import defpackage.yxm;
import java.util.Map;

/* loaded from: classes4.dex */
public final class l0 {
    public static final /* synthetic */ s9f[] b;
    public final com.yandex.passport.internal.core.accounts.h a = new com.yandex.passport.internal.core.accounts.h(new k0(0), new k0(1), "passport_push_payload_storage");

    static {
        yxm yxmVar = new yxm(l0.class, "map", "getMap()Lcom/yandex/passport/internal/util/storage/PersistableMap;", 0);
        ern.a.getClass();
        b = new s9f[]{yxmVar};
    }

    public final Bundle a() {
        if (b().a.isEmpty()) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : b().a.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    public final com.yandex.passport.internal.util.storage.a b() {
        return (com.yandex.passport.internal.util.storage.a) this.a.getValue(this, b[0]);
    }
}
