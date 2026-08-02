package defpackage;

/* loaded from: classes6.dex */
public final class n8q {
    public final khr a;
    public final xdr b;

    public n8q(khr khrVar) {
        this.a = khrVar;
        this.b = ydr.a(khrVar.b());
    }

    public final void a(thr thrVar) {
        thrVar.getClass();
        xdr xdrVar = this.b;
        xdrVar.getClass();
        xdrVar.m(null, thrVar);
        khr khrVar = this.a;
        synchronized (khrVar) {
            khrVar.a.getSharedPreferences("Yandex_Music", 0).edit().putInt("save_path_position", thrVar == thr.d ? 1 : 0).apply();
            khrVar.c(thrVar);
        }
    }
}
