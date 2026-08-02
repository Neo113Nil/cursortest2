package defpackage;

/* loaded from: classes11.dex */
public abstract class xya1 {
    public static final String a(int i) {
        return i != 1 ? i != 2 ? "unknown" : "modem_error" : "timeout";
    }

    public static final gxd b(fid fidVar) {
        return ((xy2) ((bts) fidVar).m(uy2.b)).d;
    }

    public static final tx4 c(fid fidVar) {
        return ((xy2) ((bts) fidVar).m(uy2.b)).c;
    }

    public static final tx4 d(fid fidVar) {
        return ((xy2) ((bts) fidVar).m(uy2.b)).a;
    }

    public static final tx4 e(fid fidVar) {
        return ((xy2) ((bts) fidVar).m(uy2.b)).b;
    }

    public static final lum f() {
        return new lum(new t1m0((byte) 0, 27), aim0.a, new mtw(26), bim0.a);
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
