package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Db implements InterfaceC0315c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0419g0 f4296a;

    /* renamed from: b, reason: collision with root package name */
    public final Dn f4297b = new Dn();

    public Db(InterfaceC0419g0 interfaceC0419g0) {
        this.f4296a = interfaceC0419g0;
    }

    public static final void a(Db db, V v2) {
        db.f4296a.a(v2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0315c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArr;
        Dn dn = this.f4297b;
        Thread a2 = dn.f4327a.a();
        try {
            stackTraceElementArr = dn.f4327a.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a2.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        V v2 = new V((C0856wn) dn.f4328b.apply(a2, stackTraceElementArr), dn.a(a2, null), dn.f4329c.a());
        ((C0920z9) C0294b4.l().f5584c.a()).f7271b.post(new F0.c(4, this, v2));
    }
}
