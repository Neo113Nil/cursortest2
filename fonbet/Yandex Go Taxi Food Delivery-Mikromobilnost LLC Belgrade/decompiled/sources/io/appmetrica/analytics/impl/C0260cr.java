package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ValidationException;

/* renamed from: io.appmetrica.analytics.impl.cr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C0260cr implements Vr {
    public final Vr a;

    public C0260cr(Vr vr) {
        this.a = vr;
    }

    @Override // io.appmetrica.analytics.impl.Vr
    public final Tr a(Object obj) {
        Tr a = this.a.a(obj);
        if (a.a) {
            return a;
        }
        throw new ValidationException(a.b);
    }

    public final Vr a() {
        return this.a;
    }
}
