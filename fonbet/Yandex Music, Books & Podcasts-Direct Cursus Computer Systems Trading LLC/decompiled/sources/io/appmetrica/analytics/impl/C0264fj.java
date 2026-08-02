package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.fj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0264fj implements T8 {
    public final Q5 a;

    public C0264fj(@NonNull Q5 q5) {
        this.a = q5;
    }

    @Override // io.appmetrica.analytics.impl.T8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0235ej a(@NonNull Context context, @NonNull H5 h5, @NonNull C0279g5 c0279g5) {
        return new C0235ej(context, h5, c0279g5, this.a, new I5(), Ko.a());
    }

    @NonNull
    public final Q5 a() {
        return this.a;
    }
}
