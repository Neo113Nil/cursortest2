package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.tk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC0743tk implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Tk c;

    public RunnableC0743tk(Tk tk, String str, List list) {
        this.c = tk;
        this.a = str;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.c;
        Tk.a(tk.a, tk.d, tk.e).reportEvent(this.a, CollectionUtils.getMapFromList(this.b));
    }
}
