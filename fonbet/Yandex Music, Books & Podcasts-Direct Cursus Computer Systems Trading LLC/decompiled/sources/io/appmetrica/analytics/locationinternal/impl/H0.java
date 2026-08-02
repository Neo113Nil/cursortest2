package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class H0 extends BaseRequestConfig.BaseRequestArguments {
    public final C0887k1 a;
    public final List b;
    public final RetryPolicyConfig c;

    public H0(@NotNull C0887k1 c0887k1, List<String> list, @NotNull RetryPolicyConfig retryPolicyConfig) {
        this.a = c0887k1;
        this.b = list;
        this.c = retryPolicyConfig;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(@NotNull H0 h0) {
        return Intrinsics.d(this.a, h0.a) && CollectionUtils.areCollectionsEqual(this.b, h0.b) && Intrinsics.d(this.c, h0.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r1 == null) goto L9;
     */
    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final H0 mergeFrom(@NotNull H0 h0) {
        C0887k1 c0887k1 = h0.a;
        List list = h0.b;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
        }
        list = this.b;
        return new H0(c0887k1, list, h0.c);
    }

    @NotNull
    public final RetryPolicyConfig c() {
        return this.c;
    }

    @NotNull
    public final C0887k1 b() {
        return this.a;
    }

    public final List<String> a() {
        return this.b;
    }
}
