package io.appmetrica.analytics.impl;

import defpackage.uah;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Zf implements ProtobufConverter {

    @NotNull
    public static final Yf a = new Yf();
    public static final Map b = uah.e(new Pair(NativeCrashSource.UNKNOWN, 0), new Pair(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N6 fromModel(@NotNull C0261fg c0261fg) {
        N6 n6 = new N6();
        n6.f = 1;
        M6 m6 = new M6();
        m6.a = c0261fg.a;
        Q6 q6 = new Q6();
        Integer num = (Integer) b.get(c0261fg.b.a);
        if (num != null) {
            q6.a = num.intValue();
        }
        String str = c0261fg.b.b;
        if (str == null) {
            str = "";
        }
        q6.b = str;
        m6.b = q6;
        n6.g = m6;
        return n6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final C0261fg a(@NotNull N6 n6) {
        throw new UnsupportedOperationException();
    }
}
