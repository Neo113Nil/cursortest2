package defpackage;

import java.util.List;
import kotlin.text.c;

/* loaded from: classes3.dex */
public final class rkr extends oyc {
    public static final rkr a = new rkr();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.STRING;
        b = u75.h(new azc(mhbVar), new azc(mhbVar), new azc(mhbVar));
        c = mhbVar;
        d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        String str = (String) ouj.i(list, 0);
        Object obj = list.get(1);
        obj.getClass();
        String str2 = (String) obj;
        Object obj2 = list.get(2);
        obj2.getClass();
        return str2.length() == 0 ? str : c.r(str, str2, (String) obj2, false);
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "replaceAll";
    }

    @Override // defpackage.oyc
    public final mhb d() {
        return c;
    }

    @Override // defpackage.oyc
    public final boolean f() {
        return d;
    }
}
