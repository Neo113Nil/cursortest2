package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Ol implements Ba {
    @Override // io.appmetrica.analytics.impl.Ba
    public final Integer a(@NonNull V9 v9) {
        EnumC0603rc enumC0603rc = v9.h;
        if (enumC0603rc != null) {
            return (Integer) AbstractC0465mi.c.get(enumC0603rc);
        }
        Map map = AbstractC0465mi.a;
        return null;
    }
}
