package defpackage;

import com.google.android.gms.internal.measurement.zzbk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class v791 extends n791 {
    public final /* synthetic */ int b;

    public /* synthetic */ v791(int i) {
        this.b = i;
    }

    public static o691 c(cr71 cr71Var, List list) {
        cwa1.f(2, zzbk.FN.name(), list);
        r691 b = ((p791) cr71Var.c).b(cr71Var, (r691) list.get(0));
        r691 b2 = ((p791) cr71Var.c).b(cr71Var, (r691) list.get(1));
        if (!(b2 instanceof w491)) {
            ny61.g(g8e.o("FN requires an ArrayValue of parameter names found ", b2.getClass().getCanonicalName()));
            return null;
        }
        List h = ((w491) b2).h();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new o691(b.zzc(), (ArrayList) h, arrayList, cr71Var);
    }

    public static r691 d(b991 b991Var, r691 r691Var, r691 r691Var2) {
        if (r691Var instanceof Iterable) {
            return e(b991Var, ((Iterable) r691Var).iterator(), r691Var2);
        }
        ny61.g("Non-iterable type in for...of loop.");
        return null;
    }

    public static r691 e(b991 b991Var, Iterator it, r691 r691Var) {
        if (it != null) {
            while (it.hasNext()) {
                r691 i = b991Var.a((r691) it.next()).i((w491) r691Var);
                if (i instanceof g591) {
                    g591 g591Var = (g591) i;
                    String str = g591Var.b;
                    if ("break".equals(str)) {
                        return r691.z5;
                    }
                    if ("return".equals(str)) {
                        return g591Var;
                    }
                }
            }
        }
        return r691.z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0b59  */
    /* JADX WARN: Removed duplicated region for block: B:495:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v18, types: [r691] */
    /* JADX WARN: Type inference failed for: r10v21, types: [r691] */
    /* JADX WARN: Type inference failed for: r10v230 */
    /* JADX WARN: Type inference failed for: r10v235 */
    /* JADX WARN: Type inference failed for: r10v256, types: [w491] */
    /* JADX WARN: Type inference failed for: r10v263, types: [i691] */
    /* JADX WARN: Type inference failed for: r10v300 */
    /* JADX WARN: Type inference failed for: r10v301 */
    /* JADX WARN: Type inference failed for: r12v0, types: [cr71, java.lang.Object] */
    @Override // defpackage.n791
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r691 a(String str, cr71 cr71Var, ArrayList arrayList) {
        g791 g791Var;
        g791 g791Var2;
        g791 g791Var3;
        g591 g591Var;
        r691 a791Var;
        r691 r691Var;
        String str2;
        int i = 0;
        switch (this.b) {
            case 0:
                zzbk zzbkVar = zzbk.ADD;
                int ordinal = cwa1.i(str).ordinal();
                if (ordinal == 2) {
                    r691 r691Var2 = (r691) uw51.g(zzbk.APPLY, 3, arrayList, 0);
                    p791 p791Var = (p791) cr71Var.c;
                    p791 p791Var2 = (p791) cr71Var.c;
                    r691 b = p791Var.b(cr71Var, r691Var2);
                    String zzc = p791Var2.b(cr71Var, (r691) arrayList.get(1)).zzc();
                    r691 b2 = p791Var2.b(cr71Var, (r691) arrayList.get(2));
                    if (!(b2 instanceof w491)) {
                        ny61.g(g8e.o("Function arguments for Apply are not a list found ", b2.getClass().getCanonicalName()));
                        return null;
                    }
                    if (!zzc.isEmpty()) {
                        return b.b(zzc, cr71Var, (ArrayList) ((w491) b2).h());
                    }
                    ny61.g("Function name for apply is undefined");
                    return null;
                }
                if (ordinal == 15) {
                    cwa1.e(0, zzbk.BREAK.name(), arrayList);
                    return r691.B5;
                }
                if (ordinal == 25) {
                    return c(cr71Var, arrayList);
                }
                if (ordinal != 41) {
                    if (ordinal == 54) {
                        return new w491(arrayList);
                    }
                    if (ordinal == 57) {
                        if (arrayList.isEmpty()) {
                            return r691.D5;
                        }
                        return new g591("return", ((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.RETURN, 1, arrayList, 0)));
                    }
                    if (ordinal != 19) {
                        if (ordinal == 20) {
                            cwa1.f(2, zzbk.DEFINE_FUNCTION.name(), arrayList);
                            o691 c = c(cr71Var, arrayList);
                            String str3 = c.a;
                            if (str3 == null) {
                                cr71Var.o("", c);
                                return c;
                            }
                            cr71Var.o(str3, c);
                            return c;
                        }
                        if (ordinal == 60) {
                            r691 r691Var3 = (r691) uw51.g(zzbk.SWITCH, 3, arrayList, 0);
                            p791 p791Var3 = (p791) cr71Var.c;
                            p791 p791Var4 = (p791) cr71Var.c;
                            r691 b3 = p791Var3.b(cr71Var, r691Var3);
                            r691 b4 = p791Var4.b(cr71Var, (r691) arrayList.get(1));
                            r691 b5 = p791Var4.b(cr71Var, (r691) arrayList.get(2));
                            if (!(b4 instanceof w491)) {
                                ny61.g("Malformed SWITCH statement, cases are not a list");
                                return null;
                            }
                            if (!(b5 instanceof w491)) {
                                ny61.g("Malformed SWITCH statement, case statements are not a list");
                                return null;
                            }
                            w491 w491Var = (w491) b4;
                            w491 w491Var2 = (w491) b5;
                            boolean z = false;
                            for (int i2 = 0; i2 < w491Var.j(); i2++) {
                                if (z || b3.equals(p791Var4.b(cr71Var, w491Var.k(i2)))) {
                                    r691 b6 = p791Var4.b(cr71Var, w491Var2.k(i2));
                                    if (b6 instanceof g591) {
                                        return ((g591) b6).b.equals("break") ? r691.z5 : b6;
                                    }
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            if (w491Var.j() + 1 == w491Var2.j()) {
                                r691 b7 = p791Var4.b(cr71Var, w491Var2.k(w491Var.j()));
                                if (b7 instanceof g591) {
                                    String str4 = ((g591) b7).b;
                                    if (str4.equals("return") || str4.equals("continue")) {
                                        return b7;
                                    }
                                }
                            }
                            return r691.z5;
                        }
                        if (ordinal == 61) {
                            r691 r691Var4 = (r691) uw51.g(zzbk.TERNARY, 3, arrayList, 0);
                            p791 p791Var5 = (p791) cr71Var.c;
                            p791 p791Var6 = (p791) cr71Var.c;
                            return p791Var5.b(cr71Var, r691Var4).zze().booleanValue() ? p791Var6.b(cr71Var, (r691) arrayList.get(1)) : p791Var6.b(cr71Var, (r691) arrayList.get(2));
                        }
                        switch (ordinal) {
                            case 11:
                                return cr71Var.j().i(new w491(arrayList));
                            case 12:
                                cwa1.e(0, zzbk.BREAK.name(), arrayList);
                                return r691.C5;
                            case 13:
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return r691.z5;
                    }
                    r691 b8 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0));
                    return b8 instanceof w491 ? cr71Var.i((w491) b8) : r691.z5;
                }
                cwa1.f(2, zzbk.IF.name(), arrayList);
                r691 r691Var5 = (r691) arrayList.get(0);
                p791 p791Var7 = (p791) cr71Var.c;
                p791 p791Var8 = (p791) cr71Var.c;
                r691 b9 = p791Var7.b(cr71Var, r691Var5);
                r691 b10 = p791Var8.b(cr71Var, (r691) arrayList.get(1));
                r691 b11 = arrayList.size() > 2 ? p791Var8.b(cr71Var, (r691) arrayList.get(2)) : null;
                g791 g791Var4 = r691.z5;
                if (b9.zze().booleanValue()) {
                    g791Var2 = cr71Var.i((w491) b10);
                } else {
                    if (b11 == null) {
                        g791Var = g791Var4;
                        return true == (g791Var instanceof g591) ? g791Var4 : g791Var;
                    }
                    g791Var2 = cr71Var.i((w491) b11);
                }
                g791Var = g791Var2;
                if (true == (g791Var instanceof g591)) {
                }
                break;
            case 1:
                zzbk zzbkVar2 = zzbk.ADD;
                int ordinal2 = cwa1.i(str).ordinal();
                if (ordinal2 == 1) {
                    r691 b12 = ((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.AND, 2, arrayList, 0));
                    if (b12.zze().booleanValue()) {
                        return ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1));
                    }
                    return b12;
                }
                if (ordinal2 == 47) {
                    return new b591(Boolean.valueOf(!((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.NOT, 1, arrayList, 0)).zze().booleanValue()));
                }
                if (ordinal2 != 50) {
                    b(str);
                    throw null;
                }
                r691 b13 = ((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.OR, 2, arrayList, 0));
                if (b13.zze().booleanValue()) {
                    return b13;
                }
                return ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1));
            case 2:
                zzbk zzbkVar3 = zzbk.ADD;
                int ordinal3 = cwa1.i(str).ordinal();
                if (ordinal3 == 65) {
                    r691 r691Var6 = (r691) uw51.g(zzbk.WHILE, 4, arrayList, 0);
                    r691 r691Var7 = (r691) arrayList.get(1);
                    r691 r691Var8 = (r691) arrayList.get(2);
                    r691 r691Var9 = (r691) arrayList.get(3);
                    p791 p791Var9 = (p791) cr71Var.c;
                    p791 p791Var10 = (p791) cr71Var.c;
                    r691 b14 = p791Var9.b(cr71Var, r691Var9);
                    if (p791Var10.b(cr71Var, r691Var8).zze().booleanValue()) {
                        r691 i3 = cr71Var.i((w491) b14);
                        if (i3 instanceof g591) {
                            g591 g591Var2 = (g591) i3;
                            String str5 = g591Var2.b;
                            if ("break".equals(str5)) {
                                return r691.z5;
                            }
                            if ("return".equals(str5)) {
                                return g591Var2;
                            }
                        }
                    }
                    while (p791Var10.b(cr71Var, r691Var6).zze().booleanValue()) {
                        r691 i4 = cr71Var.i((w491) b14);
                        if (i4 instanceof g591) {
                            g591 g591Var3 = (g591) i4;
                            String str6 = g591Var3.b;
                            if ("break".equals(str6)) {
                                return r691.z5;
                            }
                            if ("return".equals(str6)) {
                                return g591Var3;
                            }
                        }
                        cr71Var.h(r691Var7);
                    }
                    return r691.z5;
                }
                switch (ordinal3) {
                    case 26:
                        if (!(uw51.g(zzbk.FOR_IN, 3, arrayList, 0) instanceof a791)) {
                            ny61.g("Variable name in FOR_IN must be a string");
                            return null;
                        }
                        String zzc2 = ((r691) arrayList.get(0)).zzc();
                        r691 b15 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1));
                        r691 b16 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(2));
                        Iterator zzf = b15.zzf();
                        if (zzf != null) {
                            while (zzf.hasNext()) {
                                cr71Var.p(zzc2, (r691) zzf.next());
                                r691 i5 = cr71Var.i((w491) b16);
                                if (i5 instanceof g591) {
                                    g591Var = (g591) i5;
                                    String str7 = g591Var.b;
                                    if ("break".equals(str7)) {
                                        g791Var3 = r691.z5;
                                        return g791Var3;
                                    }
                                    if ("return".equals(str7)) {
                                        return g591Var;
                                    }
                                }
                            }
                        }
                        g791Var3 = r691.z5;
                        return g791Var3;
                    case 27:
                        if (uw51.g(zzbk.FOR_IN_CONST, 3, arrayList, 0) instanceof a791) {
                            return e(new u891(cr71Var, ((r691) arrayList.get(0)).zzc(), 0), ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)).zzf(), ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(2)));
                        }
                        ny61.g("Variable name in FOR_IN_CONST must be a string");
                        return null;
                    case 28:
                        if (!(uw51.g(zzbk.FOR_IN_LET, 3, arrayList, 0) instanceof a791)) {
                            ny61.g("Variable name in FOR_IN_LET must be a string");
                            return null;
                        }
                        String zzc3 = ((r691) arrayList.get(0)).zzc();
                        r691 b17 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1));
                        r691 b18 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(2));
                        Iterator zzf2 = b17.zzf();
                        if (zzf2 != null) {
                            while (zzf2.hasNext()) {
                                r691 r691Var10 = (r691) zzf2.next();
                                cr71 j = cr71Var.j();
                                j.p(zzc3, r691Var10);
                                r691 i6 = j.i((w491) b18);
                                if (i6 instanceof g591) {
                                    g591Var = (g591) i6;
                                    String str8 = g591Var.b;
                                    if ("break".equals(str8)) {
                                        g791Var3 = r691.z5;
                                        return g791Var3;
                                    }
                                    if ("return".equals(str8)) {
                                        return g591Var;
                                    }
                                }
                            }
                        }
                        g791Var3 = r691.z5;
                        return g791Var3;
                    case 29:
                        r691 r691Var11 = (r691) uw51.g(zzbk.FOR_LET, 4, arrayList, 0);
                        p791 p791Var11 = (p791) cr71Var.c;
                        p791 p791Var12 = (p791) cr71Var.c;
                        r691 b19 = p791Var11.b(cr71Var, r691Var11);
                        if (!(b19 instanceof w491)) {
                            ny61.g("Initializer variables in FOR_LET must be an ArrayList");
                            return null;
                        }
                        w491 w491Var3 = (w491) b19;
                        r691 r691Var12 = (r691) arrayList.get(1);
                        r691 r691Var13 = (r691) arrayList.get(2);
                        r691 b20 = p791Var12.b(cr71Var, (r691) arrayList.get(3));
                        cr71 j2 = cr71Var.j();
                        for (int i7 = 0; i7 < w491Var3.j(); i7++) {
                            String zzc4 = w491Var3.k(i7).zzc();
                            j2.o(zzc4, cr71Var.q(zzc4));
                        }
                        while (p791Var12.b(cr71Var, r691Var12).zze().booleanValue()) {
                            r691 i8 = cr71Var.i((w491) b20);
                            if (i8 instanceof g591) {
                                g591 g591Var4 = (g591) i8;
                                String str9 = g591Var4.b;
                                if ("break".equals(str9)) {
                                    return r691.z5;
                                }
                                if ("return".equals(str9)) {
                                    return g591Var4;
                                }
                            }
                            cr71 j3 = cr71Var.j();
                            for (int i9 = 0; i9 < w491Var3.j(); i9++) {
                                String zzc5 = w491Var3.k(i9).zzc();
                                j3.o(zzc5, j2.q(zzc5));
                            }
                            j3.h(r691Var13);
                            j2 = j3;
                        }
                        return r691.z5;
                    case 30:
                        if (uw51.g(zzbk.FOR_OF, 3, arrayList, 0) instanceof a791) {
                            return d(new u891(cr71Var, ((r691) arrayList.get(0)).zzc(), 1), ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)), ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(2)));
                        }
                        ny61.g("Variable name in FOR_OF must be a string");
                        return null;
                    case 31:
                        if (uw51.g(zzbk.FOR_OF_CONST, 3, arrayList, 0) instanceof a791) {
                            return d(new u891(cr71Var, ((r691) arrayList.get(0)).zzc(), 0), ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)), ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(2)));
                        }
                        ny61.g("Variable name in FOR_OF_CONST must be a string");
                        return null;
                    case 32:
                        if (uw51.g(zzbk.FOR_OF_LET, 3, arrayList, 0) instanceof a791) {
                            return d(new gr81(7, cr71Var, ((r691) arrayList.get(0)).zzc()), ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)), ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(2)));
                        }
                        ny61.g("Variable name in FOR_OF_LET must be a string");
                        return null;
                    default:
                        b(str);
                        throw null;
                }
            case 3:
                zzbk zzbkVar4 = zzbk.ADD;
                int ordinal4 = cwa1.i(str).ordinal();
                if (ordinal4 == 0) {
                    r691 b21 = ((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.ADD, 2, arrayList, 0));
                    r691 b22 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1));
                    a791Var = ((b21 instanceof a691) || (b21 instanceof a791) || (b22 instanceof a691) || (b22 instanceof a791)) ? new a791(String.valueOf(b21.zzc()).concat(String.valueOf(b22.zzc()))) : new n591(Double.valueOf(b22.zzd().doubleValue() + b21.zzd().doubleValue()));
                } else if (ordinal4 == 21) {
                    a791Var = new n591(Double.valueOf(((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.DIVIDE, 2, arrayList, 0)).zzd().doubleValue() / ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)).zzd().doubleValue()));
                } else {
                    if (ordinal4 == 59) {
                        return new n591(Double.valueOf(((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.SUBTRACT, 2, arrayList, 0)).zzd().doubleValue() + (-((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)).zzd().doubleValue())));
                    }
                    if (ordinal4 == 52 || ordinal4 == 53) {
                        cwa1.e(2, str, arrayList);
                        r691 b23 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0));
                        cr71Var.h((r691) arrayList.get(1));
                        return b23;
                    }
                    if (ordinal4 == 55 || ordinal4 == 56) {
                        cwa1.e(1, str, arrayList);
                        return ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0));
                    }
                    switch (ordinal4) {
                        case 44:
                            a791Var = new n591(Double.valueOf(((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.MODULUS, 2, arrayList, 0)).zzd().doubleValue() % ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)).zzd().doubleValue()));
                            break;
                        case 45:
                            return new n591(Double.valueOf(((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)).zzd().doubleValue() * ((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.MULTIPLY, 2, arrayList, 0)).zzd().doubleValue()));
                        case 46:
                            return new n591(Double.valueOf(-((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.NEGATE, 1, arrayList, 0)).zzd().doubleValue()));
                        default:
                            b(str);
                            throw null;
                    }
                }
                return a791Var;
            default:
                zzbk zzbkVar5 = zzbk.ADD;
                int ordinal5 = cwa1.i(str).ordinal();
                if (ordinal5 == 3) {
                    r691 b24 = ((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.ASSIGN, 2, arrayList, 0));
                    if (!(b24 instanceof a791)) {
                        ny61.g(g8e.o("Expected string for assign var. got ", b24.getClass().getCanonicalName()));
                        return null;
                    }
                    String str10 = ((a791) b24).a;
                    if (!cr71Var.l(str10)) {
                        ny61.g(g8e.o("Attempting to assign undefined value ", str10));
                        return null;
                    }
                    r691 b25 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1));
                    cr71Var.o(str10, b25);
                    return b25;
                }
                if (ordinal5 == 14) {
                    cwa1.f(2, zzbk.CONST.name(), arrayList);
                    if (arrayList.size() % 2 != 0) {
                        ny61.g(oyr.i(arrayList.size(), "CONST requires an even number of arguments, found "));
                        return null;
                    }
                    while (i < arrayList.size() - 1) {
                        r691 b26 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(i));
                        if (!(b26 instanceof a791)) {
                            ny61.g(g8e.o("Expected string for const name. got ", b26.getClass().getCanonicalName()));
                            return null;
                        }
                        String str11 = ((a791) b26).a;
                        cr71Var.p(str11, ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(i + 1)));
                        ((HashMap) cr71Var.x).put(str11, Boolean.TRUE);
                        i += 2;
                    }
                    return r691.z5;
                }
                if (ordinal5 == 24) {
                    cwa1.f(1, zzbk.EXPRESSION_LIST.name(), arrayList);
                    r691Var = r691.z5;
                    while (i < arrayList.size()) {
                        r691 b27 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(i));
                        if (b27 instanceof g591) {
                            ny61.r("ControlValue cannot be in an expression list");
                            return null;
                        }
                        i++;
                        r691Var = b27;
                    }
                } else {
                    if (ordinal5 == 33) {
                        r691 b28 = ((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.GET, 1, arrayList, 0));
                        if (b28 instanceof a791) {
                            return cr71Var.q(((a791) b28).a);
                        }
                        ny61.g(g8e.o("Expected string for get var. got ", b28.getClass().getCanonicalName()));
                        return null;
                    }
                    if (ordinal5 == 49) {
                        cwa1.e(0, zzbk.NULL.name(), arrayList);
                        return r691.A5;
                    }
                    if (ordinal5 == 58) {
                        r691 r691Var14 = (r691) uw51.g(zzbk.SET_PROPERTY, 3, arrayList, 0);
                        p791 p791Var13 = (p791) cr71Var.c;
                        p791 p791Var14 = (p791) cr71Var.c;
                        r691 b29 = p791Var13.b(cr71Var, r691Var14);
                        r691 b30 = p791Var14.b(cr71Var, (r691) arrayList.get(1));
                        r691 b31 = p791Var14.b(cr71Var, (r691) arrayList.get(2));
                        if (b29 == r691.z5 || b29 == r691.A5) {
                            ny61.r(b64.l("Can't set property ", b30.zzc(), " of ", b29.zzc()));
                            return null;
                        }
                        if ((b29 instanceof w491) && (b30 instanceof n591)) {
                            ((w491) b29).l(((n591) b30).a.intValue(), b31);
                        } else if (b29 instanceof a691) {
                            ((a691) b29).f(b30.zzc(), b31);
                        }
                        return b31;
                    }
                    if (ordinal5 != 17) {
                        if (ordinal5 != 18) {
                            if (ordinal5 == 35 || ordinal5 == 36) {
                                r691 b32 = ((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.GET_PROPERTY, 2, arrayList, 0));
                                r691 b33 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1));
                                if ((b32 instanceof w491) && cwa1.h(b33)) {
                                    return ((w491) b32).k(b33.zzd().intValue());
                                }
                                if (b32 instanceof a691) {
                                    return ((a691) b32).a(b33.zzc());
                                }
                                if (b32 instanceof a791) {
                                    if ("length".equals(b33.zzc())) {
                                        return new n591(Double.valueOf(((a791) b32).a.length()));
                                    }
                                    if (cwa1.h(b33)) {
                                        double doubleValue = b33.zzd().doubleValue();
                                        String str12 = ((a791) b32).a;
                                        if (doubleValue < str12.length()) {
                                            return new a791(String.valueOf(str12.charAt(b33.zzd().intValue())));
                                        }
                                    }
                                }
                                return r691.z5;
                            }
                            switch (ordinal5) {
                                case 62:
                                    r691 b34 = ((p791) cr71Var.c).b(cr71Var, (r691) uw51.g(zzbk.TYPEOF, 1, arrayList, 0));
                                    if (b34 instanceof g791) {
                                        str2 = StringUtils.UNDEFINED;
                                    } else if (b34 instanceof b591) {
                                        str2 = "boolean";
                                    } else if (b34 instanceof n591) {
                                        str2 = "number";
                                    } else if (b34 instanceof a791) {
                                        str2 = "string";
                                    } else if (b34 instanceof o691) {
                                        str2 = "function";
                                    } else {
                                        if ((b34 instanceof s691) || (b34 instanceof g591)) {
                                            kbs.o("Unsupported value type %s in typeof", new Object[]{b34});
                                            return null;
                                        }
                                        str2 = "object";
                                    }
                                    return new a791(str2);
                                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                                    cwa1.e(0, zzbk.UNDEFINED.name(), arrayList);
                                    return r691.z5;
                                case 64:
                                    cwa1.f(1, zzbk.VAR.name(), arrayList);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        r691 b35 = ((p791) cr71Var.c).b(cr71Var, (r691) it.next());
                                        if (!(b35 instanceof a791)) {
                                            ny61.g(g8e.o("Expected string for var name. got ", b35.getClass().getCanonicalName()));
                                            return null;
                                        }
                                        cr71Var.p(((a791) b35).a, r691.z5);
                                    }
                                    return r691.z5;
                                default:
                                    b(str);
                                    throw null;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return new i691();
                        }
                        if (arrayList.size() % 2 != 0) {
                            ny61.g(oyr.i(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            return null;
                        }
                        r691Var = new i691();
                        while (i < arrayList.size() - 1) {
                            r691 b36 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(i));
                            r691 b37 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(i + 1));
                            if ((b36 instanceof g591) || (b37 instanceof g591)) {
                                ny61.r("Failed to evaluate map entry");
                                return null;
                            }
                            r691Var.f(b36.zzc(), b37);
                            i += 2;
                        }
                    } else {
                        if (arrayList.isEmpty()) {
                            return new w491();
                        }
                        r691Var = new w491();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            r691 b38 = ((p791) cr71Var.c).b(cr71Var, (r691) it2.next());
                            if (b38 instanceof g591) {
                                ny61.r("Failed to evaluate array element");
                                return null;
                            }
                            r691Var.l(i, b38);
                            i++;
                        }
                    }
                }
                return r691Var;
        }
    }
}
