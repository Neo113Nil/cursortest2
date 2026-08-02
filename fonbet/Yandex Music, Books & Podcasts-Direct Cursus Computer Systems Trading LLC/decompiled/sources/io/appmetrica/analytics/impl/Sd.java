package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class Sd extends U5 {
    public Sd(@NonNull Context context, @NonNull H5 h5, @NonNull C0250f5 c0250f5, @NonNull N5 n5, @NonNull C0385jp c0385jp, @NonNull Kj kj, @NonNull ICommonExecutor iCommonExecutor, int i, @NonNull C0383jn c0383jn, @NonNull C0258fd c0258fd, @NonNull Aa aa) {
        super(context, h5, c0250f5, n5, c0385jp, kj, iCommonExecutor, i, c0258fd, aa);
    }

    @NonNull
    public final Si a(@NonNull Qd qd) {
        Hg hg = new Hg(qd);
        Objects.requireNonNull(qd);
        return new Si(hg, new Pd(qd), qd);
    }

    @Override // io.appmetrica.analytics.impl.U5
    @NonNull
    public final InterfaceC0803ya a(@NonNull Da da, @NonNull E7 e7, @NonNull C0668tj c0668tj, @NonNull C0250f5 c0250f5, @NonNull H5 h5, @NonNull C0637sh c0637sh) {
        return this.l.a(da, e7, c0668tj, c0250f5, h5, c0637sh).a();
    }
}
