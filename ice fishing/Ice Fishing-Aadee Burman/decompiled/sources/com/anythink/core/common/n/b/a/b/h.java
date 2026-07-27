package com.anythink.core.common.n.b.a.b;

import java.io.IOException;

/* loaded from: classes.dex */
public final class h extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private IOException f15007a;

    /* renamed from: b, reason: collision with root package name */
    private IOException f15008b;

    public h(IOException iOException) {
        super(iOException);
        this.f15007a = iOException;
        this.f15008b = iOException;
    }

    public final IOException a() {
        return this.f15007a;
    }

    public final IOException b() {
        return this.f15008b;
    }

    public final void a(IOException iOException) {
        com.anythink.core.common.n.b.a.c.a(this.f15007a, iOException);
        this.f15008b = iOException;
    }
}
