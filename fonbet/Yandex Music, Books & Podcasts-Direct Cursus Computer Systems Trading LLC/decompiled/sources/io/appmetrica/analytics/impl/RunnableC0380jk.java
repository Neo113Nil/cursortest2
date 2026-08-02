package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.jk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0380jk implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Jk c;

    public RunnableC0380jk(Jk jk, String str, List list) {
        this.c = jk;
        this.a = str;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Jk jk = this.c;
        Jk.a(jk.a, jk.d, jk.e).reportEvent(this.a, CollectionUtils.getMapFromList(this.b));
    }
}
