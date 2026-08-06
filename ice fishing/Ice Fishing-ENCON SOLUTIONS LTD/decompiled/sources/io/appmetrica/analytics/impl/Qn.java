package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Qn {

    /* renamed from: a, reason: collision with root package name */
    public final Gn f4964a;

    /* renamed from: b, reason: collision with root package name */
    public final V f4965b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4966c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4967d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4968e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f4969f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4970g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f4971h;

    public Qn(Gn gn, V v2, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f4964a = gn;
        this.f4965b = v2;
        this.f4966c = arrayList;
        this.f4967d = str;
        this.f4968e = str2;
        this.f4969f = map;
        this.f4970g = str3;
        this.f4971h = bool;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Gn gn = this.f4964a;
        if (gn != null) {
            for (Dl dl : gn.f4446c) {
                sb.append("at " + dl.f4321a + "." + dl.f4325e + "(" + dl.f4322b + StringUtils.PROCESS_POSTFIX_DELIMITER + dl.f4323c + StringUtils.PROCESS_POSTFIX_DELIMITER + dl.f4324d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f4964a + "\n" + sb.toString() + '}';
    }
}
