package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;
import v2.C5110a;

/* loaded from: classes2.dex */
public final class Zs implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f28972a;

    public Zs(Context context) {
        this.f28972a = C3.e(context, C5110a.a());
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final N3.a c() {
        return ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.td)).booleanValue() ? QC.c(Ys.f28752a) : QC.c(new Cs(2, this));
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        return 46;
    }
}
