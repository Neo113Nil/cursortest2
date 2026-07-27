package com.anythink.core.common.r;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final int f16226a = 16;

    /* renamed from: b, reason: collision with root package name */
    private final h f16227b;

    /* renamed from: c, reason: collision with root package name */
    private final a f16228c;

    public f(h hVar, a aVar) {
        this.f16227b = hVar;
        this.f16228c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f16228c;
        if (aVar != null) {
            aVar.a(this.f16226a, this.f16227b);
        }
    }
}
