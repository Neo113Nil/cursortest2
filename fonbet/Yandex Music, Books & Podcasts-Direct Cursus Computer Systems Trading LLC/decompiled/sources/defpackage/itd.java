package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class itd {
    public static final Object a = btf.a(bwf.c, new htb(27));

    public static float a(htd htdVar) {
        float b = b(htdVar);
        ltd ltdVar = htdVar.s;
        if (Intrinsics.d(ltdVar, ktd.a)) {
            return 1.0f;
        }
        if (!Intrinsics.d(ltdVar, jtd.a)) {
            b6e.s();
            return 0.0f;
        }
        if (Float.compare(b, 7) < 0) {
            return 1.0f;
        }
        return htdVar.D != null ? 0.5f : 0.3334f;
    }

    public static final float b(htd htdVar) {
        float f = htdVar.B;
        if (Float.isNaN(f)) {
            f = htdVar.u.c;
        }
        return !Float.isNaN(f) ? f : htdVar.t.c;
    }

    public static final List c(htd htdVar) {
        htdVar.F.getClass();
        List list = htdVar.u.b;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            return list;
        }
        List list2 = htdVar.t.b;
        List list3 = list2.isEmpty() ? null : list2;
        return list3 == null ? c5b.a : list3;
    }
}
