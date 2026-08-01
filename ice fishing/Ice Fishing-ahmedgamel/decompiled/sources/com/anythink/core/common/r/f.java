package com.anythink.core.common.r;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final int f16068a = 16;

    /* renamed from: b, reason: collision with root package name */
    private final h f16069b;

    /* renamed from: c, reason: collision with root package name */
    private final a f16070c;

    public f(h hVar, a aVar) {
        this.f16069b = hVar;
        this.f16070c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f16070c;
        if (aVar != null) {
            aVar.a(this.f16068a, this.f16069b);
        }
    }
}
