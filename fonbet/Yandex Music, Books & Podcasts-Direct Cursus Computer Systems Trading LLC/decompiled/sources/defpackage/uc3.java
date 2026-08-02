package defpackage;

import com.connectsdk.service.airplay.PListParser;
import java.util.List;

/* loaded from: classes3.dex */
public final class uc3 extends oyc {
    public static final uc3 a = new uc3();
    public static final List b = t75.c(new azc(mhb.BOOLEAN));
    public static final mhb c = mhb.STRING;
    public static final boolean d = true;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        return ((Boolean) ouj.j(list, list)).booleanValue() ? PListParser.TAG_TRUE : PListParser.TAG_FALSE;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "toString";
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
