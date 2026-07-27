package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class PK {

    /* renamed from: a, reason: collision with root package name */
    public static volatile PK f26757a;

    /* renamed from: b, reason: collision with root package name */
    public static final PK f26758b;

    static {
        PK pk = new PK();
        Map map = Collections.EMPTY_MAP;
        f26758b = pk;
    }

    public static PK a() {
        PK pk = f26757a;
        if (pk != null) {
            return pk;
        }
        synchronized (PK.class) {
            try {
                PK pk2 = f26757a;
                if (pk2 != null) {
                    return pk2;
                }
                int i = BK.f23877a;
                PK s9 = SK.s();
                f26757a = s9;
                return s9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
