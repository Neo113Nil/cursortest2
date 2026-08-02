package io.appmetrica.analytics.impl;

import com.connectsdk.service.airplay.PListParser;
import defpackage.x7j;
import io.appmetrica.analytics.IParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.bb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0141bb {
    public final Wo a = new Wo();
    public C0199db b = new C0199db();

    public final synchronized void a(List list, HashMap hashMap) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.d((String) it.next(), IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) && (bool = this.b.a) != null) {
                    boolean booleanValue = bool.booleanValue();
                    C0199db c0199db = this.b;
                    IdentifierStatus identifierStatus = c0199db.b;
                    String str2 = c0199db.c;
                    if (booleanValue) {
                        str = PListParser.TAG_TRUE;
                    } else {
                        if (booleanValue) {
                            throw new x7j();
                        }
                        str = PListParser.TAG_FALSE;
                    }
                    hashMap.put(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED, this.a.a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(C0199db c0199db) {
        this.b = c0199db;
    }
}
