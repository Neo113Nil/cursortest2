package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.yi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4237yi {

    /* renamed from: a, reason: collision with root package name */
    public final Map f35384a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f35385b;

    public /* synthetic */ C4237yi(Map map, Map map2) {
        this.f35384a = map;
        this.f35385b = map2;
    }

    public Enum a(Object obj) {
        Enum r02 = (Enum) this.f35385b.get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public Object b(Enum r32) {
        Object obj = this.f35384a.get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }
}
