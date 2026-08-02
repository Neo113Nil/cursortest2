package defpackage;

import com.connectsdk.service.airplay.PListParser;
import java.util.List;

/* loaded from: classes3.dex */
public final class vkr extends oyc {
    public static final vkr a = new vkr();
    public static final List b = t75.c(new azc(mhb.STRING));
    public static final mhb c = mhb.BOOLEAN;
    public static final boolean d = true;

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        boolean z;
        String str = (String) ouj.j(list, list);
        if (str.equals(PListParser.TAG_TRUE)) {
            z = true;
        } else {
            if (!str.equals(PListParser.TAG_FALSE)) {
                ghh.J("toBoolean", list, "Unable to convert value to Boolean.", null);
                throw null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "toBoolean";
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
