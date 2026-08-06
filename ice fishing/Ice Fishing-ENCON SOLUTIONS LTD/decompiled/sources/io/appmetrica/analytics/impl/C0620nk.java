package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.BuildConfig;

/* renamed from: io.appmetrica.analytics.impl.nk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0620nk extends Jc {

    /* renamed from: a, reason: collision with root package name */
    public final C0857wo f6630a;

    public C0620nk() {
        this(C0610na.k().D().b());
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(int i2) {
        C0857wo c0857wo = this.f6630a;
        synchronized (c0857wo) {
            C0909yo c0909yo = c0857wo.f7161a;
            c0909yo.a(c0909yo.a().put("last_migration_api_level", i2));
        }
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final int b() {
        int optInt;
        C0857wo c0857wo = this.f6630a;
        synchronized (c0857wo) {
            optInt = c0857wo.f7161a.a().optInt("last_migration_api_level", -1);
        }
        return optInt;
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final SparseArray<Ic> c() {
        SparseArray<Ic> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C0646ok(this.f6630a));
        sparseArray.put(115, new C0672pk());
        sparseArray.put(BuildConfig.API_LEVEL, new C0749sk());
        return sparseArray;
    }

    public C0620nk(C0857wo c0857wo) {
        this.f6630a = c0857wo;
    }
}
