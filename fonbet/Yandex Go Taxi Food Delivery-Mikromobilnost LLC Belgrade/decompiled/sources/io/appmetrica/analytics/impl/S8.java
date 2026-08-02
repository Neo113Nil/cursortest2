package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes9.dex */
public final class S8 extends BaseRequestConfig.BaseRequestArguments {
    public final String a;
    public final boolean b;

    public S8(String str, Boolean bool) {
        this.a = str;
        this.b = ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(C0439j5 c0439j5) {
        Boolean bool = c0439j5.i;
        if (bool != null && !bool.equals(Boolean.valueOf(this.b))) {
            return false;
        }
        String str = c0439j5.a;
        return str == null || str.equals(this.a);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final S8 mergeFrom(C0439j5 c0439j5) {
        return new S8((String) WrapUtils.getOrDefault(c0439j5.a, this.a), (Boolean) WrapUtils.getOrDefaultNullable(c0439j5.i, Boolean.valueOf(this.b)));
    }

    public S8(C0439j5 c0439j5) {
        this(c0439j5.a, c0439j5.i);
    }
}
