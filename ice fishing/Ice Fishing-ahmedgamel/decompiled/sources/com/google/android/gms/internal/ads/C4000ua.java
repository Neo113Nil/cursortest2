package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;
import p.AbstractC4811a;

/* renamed from: com.google.android.gms.internal.ads.ua, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4000ua extends AbstractC4811a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4054va f34545a;

    public C4000ua(C4054va c4054va) {
        Objects.requireNonNull(c4054va);
        this.f34545a = c4054va;
    }

    @Override // p.AbstractC4811a
    public final void e(int i, Bundle bundle) {
        C4054va c4054va = this.f34545a;
        c4054va.getClass();
        if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32422y5)).booleanValue() || c4054va.f34707v == null) {
            return;
        }
        AbstractC3413jg.f31268a.execute(new L.a(c4054va, i, 5));
    }
}
