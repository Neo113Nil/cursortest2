package io.appmetrica.analytics.locationinternal.impl;

import defpackage.jl40;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;

/* loaded from: classes9.dex */
public final class H0 extends BaseRequestConfig.BaseRequestArguments {
    public final C0962k1 a;
    public final List b;
    public final RetryPolicyConfig c;

    public H0(C0962k1 c0962k1, List<String> list, RetryPolicyConfig retryPolicyConfig) {
        this.a = c0962k1;
        this.b = list;
        this.c = retryPolicyConfig;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(H0 h0) {
        return jl40.l(this.a, h0.a) && CollectionUtils.areCollectionsEqual(this.b, h0.b) && jl40.l(this.c, h0.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r1 == null) goto L9;
     */
    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final H0 mergeFrom(H0 h0) {
        C0962k1 c0962k1 = h0.a;
        List list = h0.b;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
        }
        list = this.b;
        return new H0(c0962k1, list, h0.c);
    }

    public final RetryPolicyConfig c() {
        return this.c;
    }

    public final C0962k1 b() {
        return this.a;
    }

    public final List<String> a() {
        return this.b;
    }
}
