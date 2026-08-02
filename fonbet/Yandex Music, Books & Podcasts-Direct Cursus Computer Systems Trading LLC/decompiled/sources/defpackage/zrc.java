package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class zrc extends h0o {
    public static final twh c;
    public final List a;
    public final List b;

    static {
        Pattern pattern = twh.e;
        c = q5g.C("application/x-www-form-urlencoded");
    }

    public zrc(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.a = cvt.x(arrayList);
        this.b = cvt.x(arrayList2);
    }

    @Override // defpackage.h0o
    public final long a() {
        return e(null, true);
    }

    @Override // defpackage.h0o
    public final twh b() {
        return c;
    }

    @Override // defpackage.h0o
    public final void d(gj3 gj3Var) {
        e(gj3Var, false);
    }

    public final long e(gj3 gj3Var, boolean z) {
        hi3 h;
        if (z) {
            h = new hi3();
        } else {
            gj3Var.getClass();
            h = gj3Var.h();
        }
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                h.M0(38);
            }
            h.S0((String) list.get(i));
            h.M0(61);
            h.S0((String) this.b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = h.b;
        h.b();
        return j;
    }
}
