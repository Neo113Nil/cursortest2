package defpackage;

import com.yandex.messenger.websdk.api.WebMessengerNavigationInterceptor;
import jason.statham.interpreter.error.a;
import java.io.File;
import java.util.List;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class sms implements ams, awc0, lq31, vm11, WebMessengerNavigationInterceptor, ese, e691, ga91 {
    public final /* synthetic */ int a;
    public static final /* synthetic */ sms b = new sms(15);
    public static final /* synthetic */ sms c = new sms(16);
    public static final /* synthetic */ sms w = new sms(17);
    public static final /* synthetic */ sms x = new sms(18);
    public static final /* synthetic */ sms y = new sms(19);
    public static final /* synthetic */ sms z = new sms(20);
    public static final /* synthetic */ sms A = new sms(21);
    public static final /* synthetic */ sms B = new sms(22);
    public static final /* synthetic */ sms C = new sms(23);
    public static final /* synthetic */ sms D = new sms(24);
    public static final /* synthetic */ sms E = new sms(25);
    public static final /* synthetic */ sms F = new sms(26);
    public static final /* synthetic */ sms G = new sms(27);
    public static final /* synthetic */ sms H = new sms(28);
    public static final /* synthetic */ sms I = new sms(29);

    public sms(d5g d5gVar) {
        this.a = 4;
    }

    public static final boolean a(oq90 oq90Var) {
        oq90 oq90Var2 = auj0.y;
        return !cvu0.s(oq90Var.b(), ".class", true);
    }

    public static final void b(List list, StringBuilder sb) {
        b6w m = y6i0.m(y6i0.n(0, list.size()), 2);
        int i = m.a;
        int i2 = m.b;
        int i3 = m.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    public static i4v0 c(zzs zzsVar) {
        return new i4v0("geomagnet", zzsVar, null, null, null, null, null, false, false, 508);
    }

    public static oq90 e(File file) {
        String str = oq90.b;
        String file2 = file.toString();
        ByteString byteString = g.a;
        yp6 yp6Var = new yp6();
        yp6Var.x0(file2);
        return g.d(yp6Var, false);
    }

    public static oq90 f(String str) {
        ByteString byteString = g.a;
        yp6 yp6Var = new yp6();
        yp6Var.x0(str);
        return g.d(yp6Var, false);
    }

    public static i4v0 g(zzs zzsVar, String str, String str2, boolean z2, int i) {
        i4v0 i4v0Var = i4v0.j;
        return new i4v0("pin_drop", zzsVar, (i & 2) != 0 ? null : str, null, null, null, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z2, false, 312);
    }

    @Override // defpackage.e691
    public /* synthetic */ String a7(String str, String str2) {
        return null;
    }

    @Override // defpackage.ams
    public Object d(jje jjeVar, inj injVar) {
        switch (this.a) {
            case 0:
                if (injVar.c == 2) {
                    Object[] objArr = injVar.a;
                    return Boolean.valueOf(ihb1.g(objArr[0], objArr[1]));
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"endswith\" requires 2 argument but "));
            default:
                if (injVar.c != 3) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"sublist\" requires 3 argument but "));
                }
                Object[] objArr2 = injVar.a;
                Object obj = objArr2[0];
                Object obj2 = objArr2[1];
                Object obj3 = objArr2[2];
                if (!(obj instanceof List) || !(obj2 instanceof Long) || !(obj3 instanceof Long)) {
                    throw a.a("Function \"sublist\" is not defined for " + obj + Extension.FIX_SPACE + obj2 + Extension.FIX_SPACE + obj3);
                }
                Number number = (Number) obj2;
                if (number.longValue() < 0) {
                    throw a.a("Range start " + obj2 + " is less than zero");
                }
                Number number2 = (Number) obj3;
                List list = (List) obj;
                if (number2.longValue() > list.size()) {
                    throw a.a("Range end " + obj3 + " is more than list size " + list.size());
                }
                if (number.longValue() <= number2.longValue()) {
                    return list.subList((int) number.longValue(), (int) number2.longValue());
                }
                throw a.a("Range start " + obj2 + " is more than end " + obj3);
        }
    }

    @Override // defpackage.vm11
    public /* bridge */ /* synthetic */ Object q() {
        return Double.valueOf(0.0d);
    }

    @Override // defpackage.vm11
    public boolean t(Object obj) {
        return obj instanceof Double;
    }

    @Override // defpackage.ga91
    public Object zza() {
        switch (this.a) {
            case 16:
                ((lgb1) fgb1.b.a.get()).getClass();
                return new Boolean(((Boolean) lgb1.a.b()).booleanValue());
            case 17:
                List list = nw91.a;
                hcb1.b.get().getClass();
                return (String) qcb1.l.b();
            case 18:
                List list2 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.r.b()).longValue());
            case 19:
                List list3 = nw91.a;
                hcb1.b.get().getClass();
                Long l = (Long) qcb1.A.b();
                l.getClass();
                return l;
            case 20:
                List list4 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.O.b()).longValue());
            case 21:
                List list5 = nw91.a;
                hcb1.b.get().getClass();
                Long l2 = (Long) qcb1.f0.b();
                l2.getClass();
                return l2;
            case 22:
                List list6 = nw91.a;
                hcb1.b.get().getClass();
                Long l3 = (Long) qcb1.y.b();
                l3.getClass();
                return l3;
            case 23:
                List list7 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.s0.b()).longValue());
            case 24:
                List list8 = nw91.a;
                hcb1.b.get().getClass();
                Long l4 = (Long) qcb1.H.b();
                l4.getClass();
                return l4;
            case 25:
                List list9 = nw91.a;
                uhb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) bib1.d.b()).longValue());
            case 26:
                List list10 = nw91.a;
                hcb1.b.get().getClass();
                Long l5 = (Long) qcb1.d0.b();
                l5.getClass();
                return l5;
            case 27:
                List list11 = nw91.a;
                hcb1.b.get().getClass();
                return (String) qcb1.Y.b();
            case 28:
                List list12 = nw91.a;
                hcb1.b.get().getClass();
                return (String) qcb1.b0.b();
            default:
                List list13 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.v.b()).longValue());
        }
    }

    public /* synthetic */ sms(int i) {
        this.a = i;
    }
}
