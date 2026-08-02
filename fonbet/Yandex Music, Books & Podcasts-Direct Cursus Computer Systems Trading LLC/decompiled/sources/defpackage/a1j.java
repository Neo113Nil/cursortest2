package defpackage;

import android.content.Context;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes6.dex */
public final class a1j {
    public static final v0j e = v0j.c;
    public final Context a;
    public final uju b;
    public z0j c;
    public final xdr d;

    public a1j(Context context, uju ujuVar, av0 av0Var) {
        this.a = context;
        this.b = ujuVar;
        dqi dqiVar = ((iv0) av0Var).a;
        this.c = new z0j(context, dqiVar.c(), ujuVar);
        xdr a = ydr.a(a());
        this.d = a;
        tf6 e2 = gld.e(dm6.b);
        a.m(null, a());
        ox6.B(zsd.a0(new bca(dqiVar.g(), 18), new d6h(4)), e2, new fmi(5, this));
    }

    public final synchronized v0j a() {
        v0j C;
        try {
            pst pstVar = (pst) this.c.c;
            pstVar.getClass();
            if (pstVar.a.getBoolean("is_offline", false)) {
                C = v0j.e;
            } else {
                pst pstVar2 = (pst) this.c.c;
                v0j v0jVar = e;
                int i = v0jVar.a;
                pstVar2.getClass();
                int i2 = pstVar2.a.getInt("network_mode", i);
                b3i b3iVar = v0j.b;
                Integer valueOf = Integer.valueOf(i2);
                b3iVar.getClass();
                Assertions.assertNonNull(b3i.C(valueOf));
                C = b3i.C(Integer.valueOf(i2));
                if (C == null) {
                    C = v0jVar;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return C;
    }
}
