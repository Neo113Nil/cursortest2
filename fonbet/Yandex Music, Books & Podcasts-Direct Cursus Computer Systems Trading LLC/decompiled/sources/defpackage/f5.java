package defpackage;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public abstract class f5 extends oyc {
    public static final Set a = xz0.Y(new Character[]{'#', '0', ',', '.'});

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        list.getClass();
        Number l = l(list.get(0));
        Object obj = list.get(1);
        obj.getClass();
        String str = (String) obj;
        Locale k = k(list);
        if (str.length() == 0) {
            m(jhbVar, list, null);
            throw null;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!a.contains(Character.valueOf(str.charAt(i)))) {
                m(jhbVar, list, null);
                throw null;
            }
        }
        try {
            return j(new DecimalFormat(str, DecimalFormatSymbols.getInstance(k)), l);
        } catch (Exception e) {
            m(jhbVar, list, e);
            throw null;
        }
    }

    @Override // defpackage.oyc
    public final mhb d() {
        return mhb.STRING;
    }

    @Override // defpackage.oyc
    public final boolean f() {
        return true;
    }

    public abstract String j(DecimalFormat decimalFormat, Number number);

    public abstract Locale k(List list);

    public abstract Number l(Object obj);

    public final void m(jhb jhbVar, List list, Exception exc) {
        throw new khb(hrg.q("Failed to evaluate [", CollectionsKt.X(CollectionsKt.L(list, jhbVar instanceof chb ? 1 : 0), null, c() + '(', ")", d5.t, 25), "]. Incorrect format pattern."), exc);
    }
}
