package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0655p3 implements InterfaceC0890y5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0890y5, t1.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap c2 = AbstractC0430gb.c(asString);
        if (Fm.a(c2)) {
            return c2;
        }
        AbstractC0412fj.a("Passed clids (" + asString + ") are invalid.", new Object[0]);
        return null;
    }
}
