package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ho, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0401ho {
    public final String a;
    public final C0257co b;
    public final C0372go c;
    public final IBinaryDataHelper d;

    public C0401ho(Context context, K5 k5) {
        k5.a();
        this.a = "session_extras";
        this.b = new C0257co();
        this.c = new C0372go();
        this.d = Jb.k().B().a(context, k5);
    }

    public final Map a() {
        try {
            byte[] bArr = this.d.get(this.a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.b.toModel(this.c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        C0257co c0257co = this.b;
        this.c.getClass();
        return c0257co.toModel(new C0314eo());
    }
}
