package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class Gh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f4430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0437gi f4431c;

    public Gh(C0437gi c0437gi, String str, List list) {
        this.f4431c = c0437gi;
        this.f4429a = str;
        this.f4430b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f4431c;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).reportEvent(this.f4429a, CollectionUtils.getMapFromList(this.f4430b));
    }
}
