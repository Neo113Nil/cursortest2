package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes4.dex */
public final class Mk implements Runnable {
    public final /* synthetic */ List a;
    public final /* synthetic */ Tk b;

    public Mk(Tk tk, List list) {
        this.b = tk;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.b;
        Tk.a(tk.a, tk.d, tk.e).reportAnr(CollectionUtils.getMapFromList(this.a));
    }
}
