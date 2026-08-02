package defpackage;

import android.graphics.RectF;
import android.os.LocaleList;
import android.util.Rational;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class w83 implements Comparator {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public w83(Rational rational, Rational rational2) {
        this.a = 0;
        this.c = rational2 == null ? new Rational(4, 3) : rational2;
        this.b = b(rational);
    }

    public static float a(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    public RectF b(Rational rational) {
        float floatValue = rational.floatValue();
        Rational rational2 = (Rational) this.c;
        return floatValue == rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator()) : rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        boolean z = false;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Rational rational = (Rational) obj;
                Rational rational2 = (Rational) obj2;
                RectF rectF = (RectF) obj4;
                if (rational.equals(rational2)) {
                    return 0;
                }
                RectF b = b(rational);
                RectF b2 = b(rational2);
                boolean z2 = b.width() >= rectF.width() && b.height() >= rectF.height();
                if (b2.width() >= rectF.width() && b2.height() >= rectF.height()) {
                    z = true;
                }
                if (z2 && z) {
                    return (int) Math.signum((b.height() * b.width()) - (b2.height() * b2.width()));
                }
                if (z2) {
                    return -1;
                }
                if (z) {
                    return 1;
                }
                return -((int) Math.signum(a(b, rectF) - a(b2, rectF)));
            case 1:
                j5z j5zVar = (j5z) obj4;
                LocaleList localeList = (LocaleList) obj3;
                int a = j5z.a(j5zVar, localeList, ((i5z) obj).a.getLanguage());
                if (a == -1) {
                    a = 1024;
                }
                Integer valueOf = Integer.valueOf(a);
                int a2 = j5z.a(j5zVar, localeList, ((i5z) obj2).a.getLanguage());
                return valueOf.compareTo(Integer.valueOf(a2 != -1 ? a2 : 1024));
            case 2:
                ve61 ve61Var = (ve61) obj3;
                int compare = ((ue61) obj4).compare(obj, obj2);
                return compare != 0 ? compare : Float.valueOf(ve61.a(ve61Var, ((Map.Entry) obj).getKey())).compareTo(Float.valueOf(ve61.a(ve61Var, ((Map.Entry) obj2).getKey())));
            default:
                r691 r691Var = (r691) obj;
                r691 r691Var2 = (r691) obj2;
                if (r691Var instanceof g791) {
                    return !(r691Var2 instanceof g791) ? 1 : 0;
                }
                if (r691Var2 instanceof g791) {
                    return -1;
                }
                s591 s591Var = (s591) obj4;
                return s591Var == null ? r691Var.zzc().compareTo(r691Var2.zzc()) : (int) cwa1.l(s591Var.c((cr71) obj3, Arrays.asList(r691Var, r691Var2)).zzd().doubleValue());
        }
    }

    public /* synthetic */ w83(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
