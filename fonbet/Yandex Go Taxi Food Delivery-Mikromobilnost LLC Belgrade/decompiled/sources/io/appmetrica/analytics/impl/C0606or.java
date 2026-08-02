package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* renamed from: io.appmetrica.analytics.impl.or, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0606or {
    public final C0317er a;
    public final C0204b0 b;
    public final List c;
    public final String d;
    public final String e;
    public final Map f;
    public final String g;
    public final Boolean h;

    public C0606or(C0317er c0317er, C0204b0 c0204b0, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.a = c0317er;
        this.b = c0204b0;
        this.c = arrayList;
        this.d = str;
        this.e = str2;
        this.f = map;
        this.g = str3;
        this.h = bool;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0317er c0317er = this.a;
        if (c0317er != null) {
            for (Yo yo : c0317er.c) {
                sb.append("at " + yo.a + Extension.DOT_CHAR + yo.e + Extension.O_BRAKE + yo.b + ":" + yo.c + ":" + yo.d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.a + "\n" + sb.toString() + '}';
    }
}
