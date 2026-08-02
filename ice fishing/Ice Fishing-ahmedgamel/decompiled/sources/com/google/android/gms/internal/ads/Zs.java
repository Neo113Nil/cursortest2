package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;
import x2.C5189a;

/* loaded from: classes2.dex */
public final class Zs implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f29742a;

    public Zs(Context context) {
        this.f29742a = C3.e(context, C5189a.a());
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final P3.a c() {
        return ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.td)).booleanValue() ? QC.c(Ys.f29531a) : QC.c(new Cs(2, this));
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        return 46;
    }
}
