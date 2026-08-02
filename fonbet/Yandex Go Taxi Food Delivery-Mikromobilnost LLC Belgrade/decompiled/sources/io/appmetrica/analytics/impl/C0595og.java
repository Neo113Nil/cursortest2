package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.og, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0595og implements ProtobufConverter {
    public static final C0566ng a = new C0566ng();
    public static final Map b = kotlin.collections.b.i(new Pair(NativeCrashSource.UNKNOWN, 0), new Pair(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q6 fromModel(C0768ug c0768ug) {
        Q6 q6 = new Q6();
        q6.f = 1;
        P6 p6 = new P6();
        p6.a = c0768ug.a;
        T6 t6 = new T6();
        Integer num = (Integer) b.get(c0768ug.b.a);
        if (num != null) {
            t6.a = num.intValue();
        }
        String str = c0768ug.b.b;
        if (str == null) {
            str = "";
        }
        t6.b = str;
        p6.b = t6;
        q6.g = p6;
        return q6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final C0768ug a(Q6 q6) {
        throw new UnsupportedOperationException();
    }
}
