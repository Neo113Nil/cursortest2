package com.anythink.expressad.foundation.g.h;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static long f19716d;

    /* renamed from: e, reason: collision with root package name */
    public b f19717e = b.READY;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0123a f19718f;

    /* renamed from: com.anythink.expressad.foundation.g.h.a$a, reason: collision with other inner class name */
    public interface InterfaceC0123a {
        void a(b bVar);
    }

    public enum b {
        READY,
        RUNNING,
        PAUSE,
        CANCEL,
        FINISH;

        private static /* synthetic */ b[] a() {
            return new b[]{READY, RUNNING, PAUSE, CANCEL, FINISH};
        }
    }

    public a() {
        f19716d++;
    }

    private void a(b bVar) {
        this.f19717e = bVar;
        InterfaceC0123a interfaceC0123a = this.f19718f;
        if (interfaceC0123a != null) {
            interfaceC0123a.a(bVar);
        }
    }

    private b d() {
        return this.f19717e;
    }

    public static long e() {
        return f19716d;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public final void f() {
        b bVar = this.f19717e;
        b bVar2 = b.CANCEL;
        if (bVar != bVar2) {
            a(bVar2);
        }
    }

    public final void g() {
        b bVar = this.f19717e;
        if (bVar == b.PAUSE || bVar == b.CANCEL || bVar == b.FINISH) {
            return;
        }
        a(b.RUNNING);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f19717e == b.READY) {
                a(b.RUNNING);
                a();
                a(b.FINISH);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(InterfaceC0123a interfaceC0123a) {
        this.f19718f = interfaceC0123a;
    }
}
