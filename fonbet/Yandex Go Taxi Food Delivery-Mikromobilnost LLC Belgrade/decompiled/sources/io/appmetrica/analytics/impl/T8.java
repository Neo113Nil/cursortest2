package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes9.dex */
public final class T8 extends H6 {
    public T8(Context context, String str) {
        super(context, str);
    }

    public final U8 a() {
        return new U8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.H6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final U8 load(G6 g6) {
        U8 u8 = (U8) super.load(g6);
        u8.d = g6.a.h;
        S8 s8 = (S8) g6.componentArguments;
        u8.e = s8.a;
        u8.f = Boolean.valueOf(s8.b);
        return u8;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new U8();
    }
}
