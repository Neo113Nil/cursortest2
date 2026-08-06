package io.appmetrica.analytics.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.df, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357df implements Q7 {

    /* renamed from: a, reason: collision with root package name */
    public final C0693qf f5817a;

    /* renamed from: b, reason: collision with root package name */
    public final List<C0331cf> f5818b;

    public C0357df(C0693qf c0693qf, List<C0331cf> list) {
        this.f5817a = c0693qf;
        this.f5818b = list;
    }

    @Override // io.appmetrica.analytics.impl.Q7
    public final List<C0331cf> a() {
        return this.f5818b;
    }

    @Override // io.appmetrica.analytics.impl.Q7
    public final Object b() {
        return this.f5817a;
    }

    public final C0693qf c() {
        return this.f5817a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f5817a + ", candidates=" + this.f5818b + '}';
    }
}
