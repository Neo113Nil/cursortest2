package com.anythink.expressad.foundation.g.f.f;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f20103a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.anythink.expressad.foundation.g.f.c.c> f20104b;

    /* renamed from: c, reason: collision with root package name */
    private final InputStream f20105c;

    public b(int i, List<com.anythink.expressad.foundation.g.f.c.c> list) {
        this(i, list, null);
    }

    public final int a() {
        return this.f20103a;
    }

    public final List<com.anythink.expressad.foundation.g.f.c.c> b() {
        return Collections.unmodifiableList(this.f20104b);
    }

    public final InputStream c() {
        return this.f20105c;
    }

    public b(int i, List<com.anythink.expressad.foundation.g.f.c.c> list, InputStream inputStream) {
        this.f20103a = i;
        this.f20104b = list;
        this.f20105c = inputStream;
    }
}
