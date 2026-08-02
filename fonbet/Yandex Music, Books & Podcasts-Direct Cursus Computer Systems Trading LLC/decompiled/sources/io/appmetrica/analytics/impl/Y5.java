package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Y5 implements Lr {
    public final List a;

    public Y5(@NotNull List<? extends Pair<String, ? extends Lr>> list) {
        this.a = list;
    }

    @Override // io.appmetrica.analytics.impl.Lr
    public final String a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            String a = ((Lr) ((Pair) it.next()).b).a();
            if (a != null && a.length() > 0) {
                return a;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Lr
    public final void a(@NotNull String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Lr) ((Pair) it.next()).b).a(str);
        }
    }
}
