package com.anythink.core.common.v;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f17465a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.core.common.t.a f17466b = com.anythink.core.common.t.d.a();

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.t.b f17467c = new com.anythink.core.common.t.b() { // from class: com.anythink.core.common.v.b.1
        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.f17465a) {
                return;
            }
            b.b(b.this);
            b.this.b();
        }
    };

    public static /* synthetic */ boolean b(b bVar) {
        bVar.f17465a = true;
        return true;
    }

    private boolean c() {
        return this.f17465a;
    }

    public abstract void b();

    public final synchronized void a(long j6) {
        this.f17466b.a(this.f17467c, j6, false);
    }

    public final synchronized void a() {
        this.f17466b.b(this.f17467c);
    }
}
