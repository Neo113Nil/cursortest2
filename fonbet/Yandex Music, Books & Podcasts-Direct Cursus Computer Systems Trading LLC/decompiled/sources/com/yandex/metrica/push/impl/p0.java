package com.yandex.metrica.push.impl;

import com.yandex.metrica.push.common.utils.InternalLogger;
import com.yandex.metrica.push.utils.k;
import defpackage.ouj;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class p0 implements k.a {
    @Override // com.yandex.metrica.push.utils.k.a
    public String a(String str) {
        String c;
        try {
            C0069j a = C0067i.a();
            if (a == null) {
                return "";
            }
            if ("googleAdvId".equals(str)) {
                String a2 = a.a();
                return a2 == null ? "" : a2;
            }
            if (!"huaweiAdvId".equals(str)) {
                return (!"yandexAdvId".equals(str) || (c = a.c()) == null) ? "" : c;
            }
            String b = a.b();
            return b == null ? "" : b;
        } catch (Throwable th) {
            StringBuilder u = ouj.u("Cannot get ", str, " for metrica version: ");
            u.append(C0051a.b());
            InternalLogger.e(th, u.toString(), new Object[0]);
            return "";
        }
    }

    @Override // com.yandex.metrica.push.utils.k.a
    public List<String> a() {
        return Arrays.asList("googleAdvId", "huaweiAdvId", "yandexAdvId");
    }
}
