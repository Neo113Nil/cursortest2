package com.yandex.plus.core.network.api.interceptors;

import defpackage.b0o;
import defpackage.bse;
import defpackage.d0o;
import defpackage.dfi;
import defpackage.l3o;
import defpackage.ukn;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class c implements bse {
    public final String a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;
    public final Function0 e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public c(String str, Function0 function0, Function0 function02, Function0 function03, Function0 function04, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = function0;
        this.c = function02;
        this.d = function03;
        this.e = function04;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = "110.0.0";
        this.j = str5;
    }

    @Override // defpackage.bse
    public final l3o b(ukn uknVar) {
        d0o d0oVar = (d0o) uknVar.i;
        d0oVar.getClass();
        String a = d0oVar.c.a("X-APOLLO-OPERATION-NAME");
        b0o b = d0oVar.b();
        b.d("X-Yandex-Plus-Source", this.j);
        b.d("X-Yandex-Plus-Service", this.a);
        b.d("X-Yandex-Plus-Platform", (String) this.e.invoke());
        String concat = a != null ? a.concat("-") : null;
        if (concat == null) {
            concat = "";
        }
        StringBuilder k = dfi.k(concat);
        k.append(UUID.randomUUID());
        b.d("X-Request-Id", k.toString());
        Long l = (Long) this.b.invoke();
        String l2 = l != null ? l.toString() : null;
        if (l2 == null) {
            l2 = "";
        }
        b.d("X-Yandex-PUID", l2);
        String str = (String) this.c.invoke();
        if (str == null) {
            str = "";
        }
        b.d("X-Yandex-UUID", str);
        String str2 = (String) this.d.invoke();
        b.d("X-Yandex-DeviceID", str2 != null ? str2 : "");
        b.d("X-Yandex-Plus-SessionId", this.f);
        b.d("X-Yandex-Plus-AppId", this.g);
        b.d("X-Yandex-Plus-HostAppVersion", this.h);
        b.d("X-Yandex-Plus-SdkVersion", this.i);
        return uknVar.f(b.b());
    }
}
