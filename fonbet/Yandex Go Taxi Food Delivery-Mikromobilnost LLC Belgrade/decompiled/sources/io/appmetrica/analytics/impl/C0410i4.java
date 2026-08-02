package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import defpackage.oyr;
import java.util.HashMap;
import java.util.Map;
import ru.yandex.common.clid.ClidProvider;

/* renamed from: io.appmetrica.analytics.impl.i4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0410i4 implements InterfaceC0729t6 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0729t6, defpackage.tls
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString(ClidProvider.CLID_TABLE_NAME);
        HashMap d = Vc.d(asString);
        if (AbstractC0230bq.a(d)) {
            return d;
        }
        AbstractC0774um.a(oyr.p("Passed clids (", asString, ") are invalid."), new Object[0]);
        return null;
    }
}
