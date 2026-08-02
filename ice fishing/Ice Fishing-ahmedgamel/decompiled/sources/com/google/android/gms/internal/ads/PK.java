package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class PK {

    /* renamed from: a, reason: collision with root package name */
    public static volatile PK f27540a;

    /* renamed from: b, reason: collision with root package name */
    public static final PK f27541b;

    static {
        PK pk = new PK();
        Map map = Collections.EMPTY_MAP;
        f27541b = pk;
    }

    public static PK a() {
        PK pk = f27540a;
        if (pk != null) {
            return pk;
        }
        synchronized (PK.class) {
            try {
                PK pk2 = f27540a;
                if (pk2 != null) {
                    return pk2;
                }
                int i = BK.f24648a;
                PK s9 = SK.s();
                f27540a = s9;
                return s9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
