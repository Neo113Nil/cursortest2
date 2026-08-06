package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.b5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295b5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5603a;

    /* renamed from: b, reason: collision with root package name */
    public final Q4 f5604b;

    /* renamed from: c, reason: collision with root package name */
    public final C0905yk f5605c = C0610na.k().B();

    public C0295b5(Context context, Q4 q4) {
        this.f5603a = context;
        this.f5604b = q4;
    }

    public final We a() {
        return new We(this.f5605c.b(this.f5603a, this.f5604b));
    }
}
