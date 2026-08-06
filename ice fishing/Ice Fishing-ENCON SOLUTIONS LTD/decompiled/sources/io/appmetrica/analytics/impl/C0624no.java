package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.no, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624no implements Ka {
    @Override // io.appmetrica.analytics.impl.Ka
    public final String a(Context context) {
        C0518jm c0518jm;
        try {
            Qm a2 = Pm.a(C0518jm.class);
            if (a2 != null) {
                Rm rm = (Rm) a2;
                ProtobufStateStorage<Object> a3 = rm.a(context, rm.a(context));
                if (a3 != null && (c0518jm = (C0518jm) a3.read()) != null) {
                    return c0518jm.f6306a;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
