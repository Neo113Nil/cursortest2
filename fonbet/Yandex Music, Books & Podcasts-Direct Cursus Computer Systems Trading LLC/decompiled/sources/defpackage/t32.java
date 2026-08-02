package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class t32 extends bfu {
    public final b32 k;
    public final e32 l;
    public final a32 m;
    public final xdr n;
    public final xdr o;
    public final tf6 p;
    public final jyr q;
    public final ArrayList r;

    public t32(b32 b32Var, e32 e32Var, a32 a32Var) {
        b32Var.getClass();
        e32Var.getClass();
        a32Var.getClass();
        this.k = b32Var;
        this.l = e32Var;
        this.m = a32Var;
        this.n = ydr.a(u32.a);
        this.o = ydr.a(Boolean.FALSE);
        this.p = gld.e(dm6.b);
        this.q = btf.b(new ri1(15, this));
        jyr jyrVar = dzq.f;
        List h = quk.f() ? u75.h(k22.d, k22.e, k22.f, k22.g, k22.h, k22.i) : u75.h(k22.c, k22.d, k22.e, k22.f, k22.h, k22.i);
        ArrayList arrayList = new ArrayList(v75.o(h, 10));
        Iterator it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(H((k22) it.next()));
        }
        this.r = arrayList;
        x97.y(ot0.F(this), null, null, new r32(this, null), 3);
    }

    public static final q12 a(t32 t32Var) {
        return (q12) t32Var.q.getValue();
    }

    public final void G(boolean z) {
        xdr xdrVar = this.n;
        Object value = xdrVar.getValue();
        v32 v32Var = value instanceof v32 ? (v32) value : null;
        if (v32Var != null) {
            xdr xdrVar2 = this.o;
            if (((Boolean) xdrVar2.getValue()).booleanValue()) {
                ((tnb) this.m.c.getValue()).b();
            }
            Boolean bool = Boolean.FALSE;
            xdrVar2.getClass();
            xdrVar2.m(null, bool);
            v32 a = v32.a(v32Var, z, null, 6);
            xdrVar.getClass();
            xdrVar.m(null, a);
        }
    }

    public final x32 H(k22 k22Var) {
        Integer valueOf = Integer.valueOf(R.string.auto_downloading_limit_slider_description);
        this.k.getClass();
        jyr jyrVar = dzq.f;
        if (!quk.f()) {
            valueOf = null;
        }
        switch (k22Var.ordinal()) {
            case 0:
                return new x32(R.string.auto_download_250_mb_limit, R.string.auto_download_250_mb_description, k22Var);
            case 1:
                return new x32(R.string.auto_download_500_mb_limit, valueOf != null ? valueOf.intValue() : R.string.auto_download_500_mb_description, k22Var);
            case 2:
                return new x32(R.string.auto_download_1_gb_limit, valueOf != null ? valueOf.intValue() : R.string.auto_download_1_gb_description, k22Var);
            case 3:
                return new x32(R.string.auto_download_2_gb_limit, valueOf != null ? valueOf.intValue() : R.string.auto_download_2_gb_description, k22Var);
            case 4:
                return new x32(R.string.auto_download_3_gb_limit, R.string.auto_downloading_limit_slider_description, k22Var);
            case 5:
                return new x32(R.string.auto_download_4_gb_limit, valueOf != null ? valueOf.intValue() : R.string.auto_download_4_gb_description, k22Var);
            case 6:
                return new x32(R.string.auto_download_unlimited, R.string.auto_download_unlimited_description, k22Var);
            default:
                b6e.s();
                return null;
        }
    }
}
