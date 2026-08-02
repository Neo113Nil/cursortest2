package io.appmetrica.analytics.impl;

import defpackage.jl40;
import io.appmetrica.analytics.IParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: io.appmetrica.analytics.impl.jb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0445jb {
    public final C0604op a = new C0604op();
    public C0503lb b = new C0503lb();

    public final synchronized void a(List list, HashMap hashMap) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (jl40.l((String) it.next(), IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) && (bool = this.b.a) != null) {
                    boolean booleanValue = bool.booleanValue();
                    C0503lb c0503lb = this.b;
                    IdentifierStatus identifierStatus = c0503lb.b;
                    String str2 = c0503lb.c;
                    if (booleanValue) {
                        str = "true";
                    } else {
                        if (booleanValue) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "false";
                    }
                    hashMap.put(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED, this.a.a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(C0503lb c0503lb) {
        this.b = c0503lb;
    }
}
