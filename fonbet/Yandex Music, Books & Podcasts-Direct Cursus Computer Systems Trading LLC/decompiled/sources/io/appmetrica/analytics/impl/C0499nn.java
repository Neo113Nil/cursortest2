package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.BuildConfig;

/* renamed from: io.appmetrica.analytics.impl.nn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0499nn extends AbstractC0548pe {
    public final Gr a;

    public C0499nn() {
        this(C0747wb.k().D().b());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0548pe
    public final void a(int i) {
        Gr gr = this.a;
        synchronized (gr) {
            Ir ir = gr.a;
            ir.a(ir.a().put("last_migration_api_level", i));
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0548pe
    public final int b() {
        int optInt;
        Gr gr = this.a;
        synchronized (gr) {
            optInt = gr.a.a().optInt("last_migration_api_level", -1);
        }
        return optInt;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0548pe
    public final SparseArray<InterfaceC0519oe> c() {
        SparseArray<InterfaceC0519oe> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C0528on(this.a));
        sparseArray.put(115, new C0557pn());
        sparseArray.put(BuildConfig.API_LEVEL, new C0643sn());
        return sparseArray;
    }

    public C0499nn(Gr gr) {
        this.a = gr;
    }
}
