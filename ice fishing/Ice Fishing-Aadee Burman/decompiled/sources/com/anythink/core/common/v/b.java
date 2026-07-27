package com.anythink.core.common.v;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f16678a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.core.common.t.a f16679b = com.anythink.core.common.t.d.a();

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.t.b f16680c = new com.anythink.core.common.t.b() { // from class: com.anythink.core.common.v.b.1
        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.f16678a) {
                return;
            }
            b.b(b.this);
            b.this.b();
        }
    };

    public static /* synthetic */ boolean b(b bVar) {
        bVar.f16678a = true;
        return true;
    }

    private boolean c() {
        return this.f16678a;
    }

    public abstract void b();

    public final synchronized void a(long j6) {
        this.f16679b.a(this.f16680c, j6, false);
    }

    public final synchronized void a() {
        this.f16679b.b(this.f16680c);
    }
}
