package io.appmetrica.analytics.impl;

import h1.C0234d;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;

/* loaded from: classes.dex */
public final class Ed implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public static final Dd f4353a = new Dd();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f4354b = i1.u.I(new C0234d(NativeCrashSource.UNKNOWN, 0), new C0234d(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V5 fromModel(Kd kd) {
        V5 v5 = new V5();
        v5.f5219f = 1;
        U5 u5 = new U5();
        u5.f5148a = kd.f4632a;
        Y5 y5 = new Y5();
        Integer num = (Integer) f4354b.get(kd.f4633b.f4467a);
        if (num != null) {
            y5.f5416a = num.intValue();
        }
        String str = kd.f4633b.f4468b;
        if (str == null) {
            str = "";
        }
        y5.f5417b = str;
        u5.f5149b = y5;
        v5.f5220g = u5;
        return v5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Kd a(V5 v5) {
        throw new UnsupportedOperationException();
    }
}
