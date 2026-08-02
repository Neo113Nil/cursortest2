package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.h5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0308h5 extends AbstractC0337i5 {
    public C0308h5(@NonNull Zk zk) {
        super(zk);
    }

    public final void a(@NonNull EnumC0603rc enumC0603rc, @NonNull List<AbstractC0697uj> list) {
        if (!Ea.h.contains(enumC0603rc)) {
            list.add(this.a.s);
        }
        if (Ea.b.contains(enumC0603rc)) {
            return;
        }
        list.add(this.a.c);
    }
}
