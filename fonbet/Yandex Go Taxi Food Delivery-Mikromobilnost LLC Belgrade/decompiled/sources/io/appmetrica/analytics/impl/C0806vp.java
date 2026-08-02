package io.appmetrica.analytics.impl;

import defpackage.unr0;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.vp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0806vp extends BaseRequestConfig.BaseRequestArguments {
    public final String a;
    public final String b;
    public final Map<String, String> c;
    public final boolean d;
    public final List<String> e;

    public C0806vp(B4 b4) {
        this(b4.a().d(), b4.a().e(), b4.a().a(), b4.a().i(), b4.a().b());
    }

    public final boolean a(C0806vp c0806vp) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0806vp mergeFrom(C0806vp c0806vp) {
        String str = (String) WrapUtils.getOrDefaultNullable(this.a, c0806vp.a);
        String str2 = (String) WrapUtils.getOrDefaultNullable(this.b, c0806vp.b);
        Map map = (Map) WrapUtils.getOrDefaultNullable(this.c, c0806vp.c);
        boolean z = this.d || c0806vp.d;
        if (c0806vp.d) {
            this = c0806vp;
        }
        return new C0806vp(str, str2, map, z, this.e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Arguments{distributionReferrer='");
        sb.append(this.a);
        sb.append("', installReferrerSource='");
        sb.append(this.b);
        sb.append("', clientClids=");
        sb.append(this.c);
        sb.append(", hasNewCustomHosts=");
        sb.append(this.d);
        sb.append(", newCustomHosts=");
        return unr0.t(sb, this.e, '}');
    }

    public C0806vp(String str, String str2, Map<String, String> map, boolean z, List<String> list) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = z;
        this.e = list;
    }

    public C0806vp() {
        this(null, null, null, false, null);
    }
}
