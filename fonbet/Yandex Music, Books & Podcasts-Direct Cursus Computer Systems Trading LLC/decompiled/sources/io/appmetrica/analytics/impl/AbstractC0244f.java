package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0244f implements V4 {
    public final Context a;
    public final C0235ej b;

    public AbstractC0244f(@NonNull Context context, @NonNull C0235ej c0235ej) {
        this.a = context.getApplicationContext();
        this.b = c0235ej;
        c0235ej.a(this);
        C0747wb.k().n().b(this);
    }

    @Override // io.appmetrica.analytics.impl.V4
    public final void a() {
        this.b.b(this);
        C0747wb.I.m().a(this);
    }

    @NonNull
    public final C0235ej b() {
        return this.b;
    }

    public abstract void b(@NonNull H6 h6, @NonNull C0279g5 c0279g5);

    @NonNull
    public final Context c() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.V4
    public final void a(@NonNull H6 h6, @NonNull C0279g5 c0279g5) {
        b(h6, c0279g5);
    }
}
