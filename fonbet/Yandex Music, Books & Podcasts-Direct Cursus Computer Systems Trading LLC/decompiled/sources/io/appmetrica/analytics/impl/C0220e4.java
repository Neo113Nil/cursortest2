package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import defpackage.hrg;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.e4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0220e4 implements InterfaceC0569q6 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0569q6, kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(@NotNull ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap d = Fc.d(asString);
        if (Jp.a(d)) {
            return d;
        }
        AbstractC0210dm.a(hrg.q("Passed clids (", asString, ") are invalid."), new Object[0]);
        return null;
    }
}
