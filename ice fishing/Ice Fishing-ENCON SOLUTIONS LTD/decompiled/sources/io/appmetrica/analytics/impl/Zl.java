package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Zl extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f5527a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5528b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f5529c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5530d;

    /* renamed from: e, reason: collision with root package name */
    public final List<String> f5531e;

    public Zl(H3 h3) {
        this(h3.a().c(), h3.a().d(), h3.a().a(), h3.a().h(), h3.a().b());
    }

    public final boolean a(Zl zl) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Zl mergeFrom(Zl zl) {
        return new Zl((String) WrapUtils.getOrDefaultNullable(this.f5527a, zl.f5527a), (String) WrapUtils.getOrDefaultNullable(this.f5528b, zl.f5528b), (Map) WrapUtils.getOrDefaultNullable(this.f5529c, zl.f5529c), this.f5530d || zl.f5530d, zl.f5530d ? zl.f5531e : this.f5531e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return false;
    }

    public final String toString() {
        return "Arguments{distributionReferrer='" + this.f5527a + "', installReferrerSource='" + this.f5528b + "', clientClids=" + this.f5529c + ", hasNewCustomHosts=" + this.f5530d + ", newCustomHosts=" + this.f5531e + '}';
    }

    public Zl(String str, String str2, Map<String, String> map, boolean z2, List<String> list) {
        this.f5527a = str;
        this.f5528b = str2;
        this.f5529c = map;
        this.f5530d = z2;
        this.f5531e = list;
    }

    public Zl() {
        this(null, null, null, false, null);
    }
}
