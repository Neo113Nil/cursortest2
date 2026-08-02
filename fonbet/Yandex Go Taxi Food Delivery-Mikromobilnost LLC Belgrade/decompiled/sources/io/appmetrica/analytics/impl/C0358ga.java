package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0358ga {
    public final C0300ea a;
    public final C0329fa b;
    public final IBinaryDataHelper c;

    public C0358ga(Context context, K5 k5) {
        this(new C0329fa(), new C0300ea(), Jb.k().B().a(context, k5));
    }

    public C0358ga(C0329fa c0329fa, C0300ea c0300ea, IBinaryDataHelper iBinaryDataHelper) {
        this.b = c0329fa;
        this.a = c0300ea;
        this.c = iBinaryDataHelper;
    }
}
