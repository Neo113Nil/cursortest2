package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import defpackage.eta;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.dp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0212dp extends BaseRequestConfig.BaseRequestArguments {
    public final String a;
    public final String b;
    public final Map<String, String> c;
    public final boolean d;
    public final List<String> e;

    public C0212dp(@NonNull C0769x4 c0769x4) {
        this(c0769x4.a().d(), c0769x4.a().e(), c0769x4.a().a(), c0769x4.a().i(), c0769x4.a().b());
    }

    public final boolean a(@NonNull C0212dp c0212dp) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0212dp mergeFrom(@NonNull C0212dp c0212dp) {
        String str = (String) WrapUtils.getOrDefaultNullable(this.a, c0212dp.a);
        String str2 = (String) WrapUtils.getOrDefaultNullable(this.b, c0212dp.b);
        Map map = (Map) WrapUtils.getOrDefaultNullable(this.c, c0212dp.c);
        boolean z = this.d || c0212dp.d;
        if (!c0212dp.d) {
            c0212dp = this;
        }
        return new C0212dp(str, str2, map, z, c0212dp.e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
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
        return eta.h(sb, this.e, '}');
    }

    public C0212dp(String str, String str2, Map<String, String> map, boolean z, List<String> list) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = z;
        this.e = list;
    }

    public C0212dp() {
        this(null, null, null, false, null);
    }
}
