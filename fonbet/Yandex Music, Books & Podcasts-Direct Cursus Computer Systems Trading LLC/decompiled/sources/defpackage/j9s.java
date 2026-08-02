package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.text.c;

/* loaded from: classes3.dex */
public final class j9s extends oyc {
    public static final j9s a = new j9s();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        mhb mhbVar = mhb.STRING;
        b = u75.h(new azc(mhbVar), new azc(mhbVar));
        c = mhb.BOOLEAN;
        d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        String str = (String) ouj.i(list, 0);
        Object obj = list.get(1);
        obj.getClass();
        try {
            return Boolean.valueOf(Pattern.compile((String) obj).matcher(str).find());
        } catch (PatternSyntaxException unused) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(v75.o(list2, 10));
            for (Object obj2 : list2) {
                if (obj2 instanceof String) {
                    obj2 = c.r((String) obj2, "\\", "\\\\", false);
                }
                arrayList.add(obj2);
            }
            ghh.J("testRegex", arrayList, "Invalid regular expression.", null);
            throw null;
        }
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "testRegex";
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
