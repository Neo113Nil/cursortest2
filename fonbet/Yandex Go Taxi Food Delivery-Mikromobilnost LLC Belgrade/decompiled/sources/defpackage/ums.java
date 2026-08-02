package defpackage;

import android.util.Log;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.collections.a;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes9.dex */
public class ums implements ams, yyt0, ht90, qef0, ese, vm11, wi61, ga91 {
    public static ums b;
    public final /* synthetic */ int a;
    public static final /* synthetic */ ums c = new ums(15);
    public static final /* synthetic */ ums w = new ums(16);
    public static final /* synthetic */ ums x = new ums(17);
    public static final /* synthetic */ ums y = new ums(18);
    public static final /* synthetic */ ums z = new ums(19);
    public static final /* synthetic */ ums A = new ums(20);
    public static final /* synthetic */ ums B = new ums(21);
    public static final /* synthetic */ ums C = new ums(22);
    public static final /* synthetic */ ums D = new ums(23);
    public static final /* synthetic */ ums E = new ums(24);
    public static final /* synthetic */ ums F = new ums(25);
    public static final /* synthetic */ ums G = new ums(26);
    public static final /* synthetic */ ums H = new ums(27);
    public static final /* synthetic */ ums I = new ums(28);
    public static final /* synthetic */ ums J = new ums(29);

    public ums(rl60 rl60Var, wi61 wi61Var) {
        this.a = 14;
    }

    public static final String b(String str, String str2) {
        List W;
        W = evu0.W(str2, new String[]{"$NUMBER$"}, (r2 & 4) != 0 ? 0 : 2);
        w610 b2 = new Regex(oyr.p("^", a.X(W, "(.+?)", null, null, new tyo0(7), 30), "$")).b(str);
        if (b2 != null) {
            return (String) a.S(1, b2.a());
        }
        return null;
    }

    public static final void e(fw60 fw60Var, meu meuVar) {
        Charset charset = gw60.c;
        fw60Var.a("-- HEADERS --");
        if (meuVar == null || meuVar.size() == 0) {
            fw60Var.a("(no headers)");
            return;
        }
        int size = meuVar.size();
        for (int i = 0; i < size; i++) {
            fw60Var.a(meuVar.b(i) + Extension.COLON_SPACE + meuVar.f(i));
        }
    }

    public static String j(long j, wg10 wg10Var) {
        String str;
        String str2;
        if (j >= 0) {
            str = j + "-byte";
        } else {
            str = "unknown length";
        }
        if (wg10Var != null) {
            str2 = "'" + wg10Var + '\'';
        } else {
            str2 = "unknown content-type";
        }
        return Extension.O_BRAKE + str + HexString.CHAR_SPACE + str2 + " body)";
    }

    @Override // defpackage.yyt0
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // defpackage.qef0
    public void c(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override // defpackage.ams
    public Object d(jje jjeVar, inj injVar) {
        switch (this.a) {
            case 0:
                if (injVar.c != 2) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"same\" requires 2 argument but "));
                }
                Object[] objArr = injVar.a;
                Object obj = objArr[0];
                Object obj2 = objArr[1];
                if (!(obj instanceof List)) {
                    throw oyr.y(obj, "Path should be list but actual value is ");
                }
                r5x q = eja1.q((List) obj);
                if (!(obj2 instanceof List)) {
                    throw oyr.y(obj2, "Path should be list but actual value is ");
                }
                return Boolean.valueOf(jl40.l(bb1.J(jjeVar.c, q), bb1.J(jjeVar.c, eja1.q((List) obj2))));
            default:
                if (injVar.c != 3) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"insert\" requires 3 argument but "));
                }
                Object[] objArr2 = injVar.a;
                Object obj3 = objArr2[0];
                Object obj4 = objArr2[1];
                Object obj5 = objArr2[2];
                if (ym11.g(obj3) && (obj4 instanceof Long)) {
                    Number number = (Number) obj4;
                    if (number.longValue() < 0) {
                        throw jason.statham.interpreter.error.a.a("Index " + obj4 + " is less than zero");
                    }
                    List list = (List) obj3;
                    if (number.longValue() > list.size()) {
                        throw jason.statham.interpreter.error.a.a("Index " + obj4 + " is more than list size " + list.size());
                    }
                    ym11.b(obj3).add((int) number.longValue(), obj5);
                }
                return seu.E;
        }
    }

    public String f(int i, Method method) {
        return "parameter #" + (i + 1);
    }

    @Override // defpackage.ht90
    public String g() {
        return "PAY";
    }

    @Override // defpackage.ht90
    public String getName() {
        return "TRACE";
    }

    public Object h(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean i(Method method) {
        return false;
    }

    @Override // defpackage.vm11
    public /* bridge */ /* synthetic */ Object q() {
        return "";
    }

    @Override // defpackage.vm11
    public boolean t(Object obj) {
        return obj instanceof String;
    }

    @Override // defpackage.ga91
    public Object zza() {
        switch (this.a) {
            case 15:
                ((odb1) gdb1.b.a.get()).getClass();
                return new Boolean(((Boolean) odb1.a.b()).booleanValue());
            case 16:
                List list = nw91.a;
                eib1.b.get().getClass();
                Boolean bool = (Boolean) lib1.c.b();
                bool.getClass();
                return bool;
            case 17:
                List list2 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.l0.b()).longValue());
            case 18:
                List list3 = nw91.a;
                hcb1.b.get().getClass();
                return (String) qcb1.n.b();
            case 19:
                List list4 = nw91.a;
                hcb1.b.get().getClass();
                Long l = (Long) qcb1.J.b();
                l.getClass();
                return l;
            case 20:
                List list5 = nw91.a;
                hcb1.b.get().getClass();
                Long l2 = (Long) qcb1.R.b();
                l2.getClass();
                return l2;
            case 21:
                List list6 = nw91.a;
                hcb1.b.get().getClass();
                Long l3 = (Long) qcb1.h0.b();
                l3.getClass();
                return l3;
            case 22:
                List list7 = nw91.a;
                hcb1.b.get().getClass();
                Long l4 = (Long) qcb1.F.b();
                l4.getClass();
                return l4;
            case 23:
                List list8 = nw91.a;
                hcb1.b.get().getClass();
                Long l5 = (Long) qcb1.m.b();
                l5.getClass();
                return l5;
            case 24:
                List list9 = nw91.a;
                uhb1.b.get().getClass();
                return (String) bib1.f.b();
            case 25:
                List list10 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.s.b()).longValue());
            case 26:
                List list11 = nw91.a;
                hcb1.b.get().getClass();
                return Integer.valueOf((int) ((Long) qcb1.j0.b()).longValue());
            case 27:
                List list12 = nw91.a;
                hcb1.b.get().getClass();
                Long l6 = (Long) qcb1.j.b();
                l6.getClass();
                return l6;
            case 28:
                List list13 = nw91.a;
                hcb1.b.get().getClass();
                Long l7 = (Long) qcb1.Z.b();
                l7.getClass();
                return l7;
            default:
                List list14 = nw91.a;
                hcb1.b.get().getClass();
                Boolean bool2 = (Boolean) qcb1.C.b();
                bool2.getClass();
                return bool2;
        }
    }

    public /* synthetic */ ums(int i) {
        this.a = i;
    }

    @Override // defpackage.wi61
    public Object a() {
        return new tms(14);
    }
}
