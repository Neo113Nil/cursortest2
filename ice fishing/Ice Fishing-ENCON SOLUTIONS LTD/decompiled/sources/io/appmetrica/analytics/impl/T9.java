package io.appmetrica.analytics.impl;

import A1.C0015p;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class T9 {

    /* renamed from: a, reason: collision with root package name */
    public final Tl f5101a = new Tl();

    /* renamed from: b, reason: collision with root package name */
    public V9 f5102b = new V9();

    public final synchronized void a(V9 v9) {
        this.f5102b = v9;
    }

    public final synchronized void a(List list, HashMap hashMap) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.i.a((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f5102b.f5225a) != null) {
                    boolean booleanValue = bool.booleanValue();
                    V9 v9 = this.f5102b;
                    IdentifierStatus identifierStatus = v9.f5226b;
                    String str2 = v9.f5227c;
                    if (booleanValue) {
                        str = "true";
                    } else {
                        if (booleanValue) {
                            throw new C0015p();
                        }
                        str = "false";
                    }
                    hashMap.put("appmetrica_lib_ssl_enabled", this.f5101a.a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
