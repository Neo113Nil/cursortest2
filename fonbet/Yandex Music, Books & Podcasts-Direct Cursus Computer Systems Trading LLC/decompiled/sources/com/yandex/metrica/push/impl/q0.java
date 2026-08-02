package com.yandex.metrica.push.impl;

import android.content.Context;
import com.yandex.metrica.push.common.utils.InternalLogger;
import com.yandex.metrica.push.utils.k;
import defpackage.ouj;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class q0 implements k.a {
    private final Context a;

    public q0(Context context) {
        this.a = context;
    }

    @Override // com.yandex.metrica.push.utils.k.a
    public String a(String str) {
        try {
            String a = C0067i.a(this.a);
            return a == null ? "" : a;
        } catch (Throwable th) {
            StringBuilder u = ouj.u("Cannot get ", str, " for metrica version: ");
            u.append(C0051a.b());
            InternalLogger.e(th, u.toString(), new Object[0]);
            return "";
        }
    }

    @Override // com.yandex.metrica.push.utils.k.a
    public List<String> a() {
        return Collections.singletonList("deviceId");
    }
}
