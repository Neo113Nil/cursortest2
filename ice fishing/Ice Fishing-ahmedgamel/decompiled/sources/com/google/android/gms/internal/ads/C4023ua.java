package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;
import p.AbstractC4815a;

/* renamed from: com.google.android.gms.internal.ads.ua, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4023ua extends AbstractC4815a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4077va f35317a;

    public C4023ua(C4077va c4077va) {
        Objects.requireNonNull(c4077va);
        this.f35317a = c4077va;
    }

    @Override // p.AbstractC4815a
    public final void e(int i, Bundle bundle) {
        C4077va c4077va = this.f35317a;
        c4077va.getClass();
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33201y5)).booleanValue() || c4077va.f35464v == null) {
            return;
        }
        AbstractC3436jg.f32055a.execute(new L.a(c4077va, i, 5));
    }
}
