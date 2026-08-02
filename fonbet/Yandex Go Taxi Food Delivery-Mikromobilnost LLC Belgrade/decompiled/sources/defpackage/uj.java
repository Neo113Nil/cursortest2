package defpackage;

import android.os.Trace;
import org.altbeacon.beacon.client.DataProviderException;

/* loaded from: classes4.dex */
public final class uj implements Runnable {
    public final /* synthetic */ int a;
    public static final uj b = new uj(0);
    public static final uj c = new uj(1);
    public static final uj w = new uj(2);
    public static final uj x = new uj(3);
    public static final uj y = new uj(4);
    public static final uj z = new uj(5);
    public static final uj A = new uj(6);
    public static final uj B = new uj(7);
    public static final uj C = new uj(8);
    public static final uj D = new uj(9);
    public static final uj E = new uj(10);
    public static final uj F = new uj(11);
    public static final uj G = new uj(12);
    public static final uj H = new uj(13);
    public static final uj I = new uj(14);
    public static final uj J = new uj(15);
    public static final uj K = new uj(16);
    public static final /* synthetic */ uj L = new uj(17);
    public static final /* synthetic */ uj M = new uj(29);

    public /* synthetic */ uj(int i) {
        this.a = i;
    }

    private final void A() {
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void l() {
    }

    private final void m() {
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }

    private final void r() {
    }

    private final void s() {
    }

    private final void t() {
    }

    private final void u() {
    }

    private final void v() {
    }

    private final void w() {
    }

    private final void x() {
    }

    private final void y() {
    }

    private final void z() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return;
            case 18:
                try {
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (ftn.e()) {
                        ftn.a().g();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                return;
            case 27:
                new DataProviderException("You need to configure a beacon data service to use this feature.");
                throw null;
            case 28:
                return;
            default:
                cna1.i.incrementAndGet();
                return;
        }
    }
}
