package defpackage;

import com.google.android.gms.internal.measurement.zzbk;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class s791 extends n791 {
    public s791() {
        this.a.add(zzbk.EQUALS);
        this.a.add(zzbk.GREATER_THAN);
        this.a.add(zzbk.GREATER_THAN_EQUALS);
        this.a.add(zzbk.IDENTITY_EQUALS);
        this.a.add(zzbk.IDENTITY_NOT_EQUALS);
        this.a.add(zzbk.LESS_THAN);
        this.a.add(zzbk.LESS_THAN_EQUALS);
        this.a.add(zzbk.NOT_EQUALS);
    }

    public static boolean c(r691 r691Var, r691 r691Var2) {
        if (r691Var instanceof a691) {
            r691Var = new a791(r691Var.zzc());
        }
        if (r691Var2 instanceof a691) {
            r691Var2 = new a791(r691Var2.zzc());
        }
        if ((r691Var instanceof a791) && (r691Var2 instanceof a791)) {
            return ((a791) r691Var).a.compareTo(((a791) r691Var2).a) < 0;
        }
        double doubleValue = r691Var.zzd().doubleValue();
        double doubleValue2 = r691Var2.zzd().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    public static boolean d(r691 r691Var, r691 r691Var2) {
        if (r691Var.getClass().equals(r691Var2.getClass())) {
            if ((r691Var instanceof g791) || (r691Var instanceof l691)) {
                return true;
            }
            return r691Var instanceof n591 ? (Double.isNaN(r691Var.zzd().doubleValue()) || Double.isNaN(r691Var2.zzd().doubleValue()) || r691Var.zzd().doubleValue() != r691Var2.zzd().doubleValue()) ? false : true : r691Var instanceof a791 ? r691Var.zzc().equals(r691Var2.zzc()) : r691Var instanceof b591 ? r691Var.zze().equals(r691Var2.zze()) : r691Var == r691Var2;
        }
        if (((r691Var instanceof g791) || (r691Var instanceof l691)) && ((r691Var2 instanceof g791) || (r691Var2 instanceof l691))) {
            return true;
        }
        boolean z = r691Var instanceof n591;
        if (z && (r691Var2 instanceof a791)) {
            return d(r691Var, new n591(r691Var2.zzd()));
        }
        boolean z2 = r691Var instanceof a791;
        if ((!z2 || !(r691Var2 instanceof n591)) && !(r691Var instanceof b591)) {
            if (r691Var2 instanceof b591) {
                return d(r691Var, new n591(r691Var2.zzd()));
            }
            if ((z2 || z) && (r691Var2 instanceof a691)) {
                return d(r691Var, new a791(r691Var2.zzc()));
            }
            if ((r691Var instanceof a691) && ((r691Var2 instanceof a791) || (r691Var2 instanceof n591))) {
                return d(new a791(r691Var.zzc()), r691Var2);
            }
            return false;
        }
        return d(new n591(r691Var.zzd()), r691Var2);
    }

    public static boolean e(r691 r691Var, r691 r691Var2) {
        if (r691Var instanceof a691) {
            r691Var = new a791(r691Var.zzc());
        }
        if (r691Var2 instanceof a691) {
            r691Var2 = new a791(r691Var2.zzc());
        }
        return (((r691Var instanceof a791) && (r691Var2 instanceof a791)) || !(Double.isNaN(r691Var.zzd().doubleValue()) || Double.isNaN(r691Var2.zzd().doubleValue()))) && !c(r691Var2, r691Var);
    }

    @Override // defpackage.n791
    public final r691 a(String str, cr71 cr71Var, ArrayList arrayList) {
        boolean d;
        boolean d2;
        cwa1.e(2, cwa1.i(str).name(), arrayList);
        r691 b = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0));
        r691 b2 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1));
        int ordinal = cwa1.i(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                d2 = d(b, b2);
            } else if (ordinal == 42) {
                d = c(b, b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        d = c(b2, b);
                        break;
                    case 38:
                        d = e(b2, b);
                        break;
                    case 39:
                        d = cwa1.j(b, b2);
                        break;
                    case 40:
                        d2 = cwa1.j(b, b2);
                        break;
                    default:
                        b(str);
                        throw null;
                }
            } else {
                d = e(b, b2);
            }
            d = !d2;
        } else {
            d = d(b, b2);
        }
        return d ? r691.E5 : r691.F5;
    }
}
