package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* loaded from: classes.dex */
public final class Nk {

    /* renamed from: a, reason: collision with root package name */
    public final String f4830a;

    /* renamed from: b, reason: collision with root package name */
    public final Ik f4831b;

    /* renamed from: c, reason: collision with root package name */
    public final Mk f4832c;

    /* renamed from: d, reason: collision with root package name */
    public final IBinaryDataHelper f4833d;

    public Nk(Context context, Q4 q4) {
        q4.a();
        this.f4830a = "session_extras";
        this.f4831b = new Ik();
        this.f4832c = new Mk();
        this.f4833d = C0610na.k().B().a(context, q4);
    }

    public final Map a() {
        try {
            byte[] bArr = this.f4833d.get(this.f4830a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f4831b.toModel(this.f4832c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        Ik ik = this.f4831b;
        this.f4832c.getClass();
        return ik.toModel(new Kk());
    }
}
