package com.anythink.expressad.foundation.g.h;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static long f20345d;

    /* renamed from: e, reason: collision with root package name */
    public b f20346e = b.READY;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0124a f20347f;

    /* renamed from: com.anythink.expressad.foundation.g.h.a$a, reason: collision with other inner class name */
    public interface InterfaceC0124a {
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
        f20345d++;
    }

    private void a(b bVar) {
        this.f20346e = bVar;
        InterfaceC0124a interfaceC0124a = this.f20347f;
        if (interfaceC0124a != null) {
            interfaceC0124a.a(bVar);
        }
    }

    private b d() {
        return this.f20346e;
    }

    public static long e() {
        return f20345d;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public final void f() {
        b bVar = this.f20346e;
        b bVar2 = b.CANCEL;
        if (bVar != bVar2) {
            a(bVar2);
        }
    }

    public final void g() {
        b bVar = this.f20346e;
        if (bVar == b.PAUSE || bVar == b.CANCEL || bVar == b.FINISH) {
            return;
        }
        a(b.RUNNING);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f20346e == b.READY) {
                a(b.RUNNING);
                a();
                a(b.FINISH);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(InterfaceC0124a interfaceC0124a) {
        this.f20347f = interfaceC0124a;
    }
}
