package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class Zh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f5524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0437gi f5525b;

    public Zh(C0437gi c0437gi, List list) {
        this.f5525b = c0437gi;
        this.f5524a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f5525b;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).reportAnr(CollectionUtils.getMapFromList(this.f5524a));
    }
}
