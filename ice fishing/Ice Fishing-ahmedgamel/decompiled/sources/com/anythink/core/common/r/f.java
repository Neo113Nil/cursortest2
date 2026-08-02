package com.anythink.core.common.r;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final int f16855a = 16;

    /* renamed from: b, reason: collision with root package name */
    private final h f16856b;

    /* renamed from: c, reason: collision with root package name */
    private final a f16857c;

    public f(h hVar, a aVar) {
        this.f16856b = hVar;
        this.f16857c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f16857c;
        if (aVar != null) {
            aVar.a(this.f16855a, this.f16856b);
        }
    }
}
