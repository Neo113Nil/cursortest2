package e8;

import java.util.LinkedHashMap;
import java.util.Locale;
import u7.C5089g;
import u7.C5095m;
import u7.C5096n;
import u7.C5097o;
import u7.C5098p;
import u7.C5099q;
import u7.C5100r;

/* loaded from: classes2.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f37260a;

    static {
        C5089g c5089g = new C5089g(kotlin.jvm.internal.s.a(String.class), T.f37266a);
        C5089g c5089g2 = new C5089g(kotlin.jvm.internal.s.a(Character.TYPE), C4480l.f37304a);
        C5089g c5089g3 = new C5089g(kotlin.jvm.internal.s.a(char[].class), C4479k.f37303c);
        C5089g c5089g4 = new C5089g(kotlin.jvm.internal.s.a(Double.TYPE), C4484p.f37310a);
        C5089g c5089g5 = new C5089g(kotlin.jvm.internal.s.a(double[].class), C4483o.f37309c);
        C5089g c5089g6 = new C5089g(kotlin.jvm.internal.s.a(Float.TYPE), C4488u.f37322a);
        C5089g c5089g7 = new C5089g(kotlin.jvm.internal.s.a(float[].class), C4487t.f37321c);
        C5089g c5089g8 = new C5089g(kotlin.jvm.internal.s.a(Long.TYPE), F.f37247a);
        C5089g c5089g9 = new C5089g(kotlin.jvm.internal.s.a(long[].class), E.f37246c);
        C5089g c5089g10 = new C5089g(kotlin.jvm.internal.s.a(C5099q.class), c0.f37282a);
        C5089g c5089g11 = new C5089g(kotlin.jvm.internal.s.a(C5100r.class), b0.f37280c);
        C5089g c5089g12 = new C5089g(kotlin.jvm.internal.s.a(Integer.TYPE), C4493z.f37337a);
        C5089g c5089g13 = new C5089g(kotlin.jvm.internal.s.a(int[].class), C4492y.f37336c);
        C5089g c5089g14 = new C5089g(kotlin.jvm.internal.s.a(C5097o.class), Z.f37276a);
        C5089g c5089g15 = new C5089g(kotlin.jvm.internal.s.a(C5098p.class), Y.f37275c);
        C5089g c5089g16 = new C5089g(kotlin.jvm.internal.s.a(Short.TYPE), S.f37264a);
        C5089g c5089g17 = new C5089g(kotlin.jvm.internal.s.a(short[].class), Q.f37263c);
        C5089g c5089g18 = new C5089g(kotlin.jvm.internal.s.a(u7.t.class), f0.f37292a);
        C5089g c5089g19 = new C5089g(kotlin.jvm.internal.s.a(u7.u.class), e0.f37289c);
        C5089g c5089g20 = new C5089g(kotlin.jvm.internal.s.a(Byte.TYPE), C4477i.f37299a);
        C5089g c5089g21 = new C5089g(kotlin.jvm.internal.s.a(byte[].class), C4476h.f37298c);
        C5089g c5089g22 = new C5089g(kotlin.jvm.internal.s.a(C5095m.class), W.f37271a);
        C5089g c5089g23 = new C5089g(kotlin.jvm.internal.s.a(C5096n.class), V.f37270c);
        C5089g c5089g24 = new C5089g(kotlin.jvm.internal.s.a(Boolean.TYPE), C4474f.f37290a);
        C5089g c5089g25 = new C5089g(kotlin.jvm.internal.s.a(boolean[].class), C4473e.f37288c);
        C5089g c5089g26 = new C5089g(kotlin.jvm.internal.s.a(u7.v.class), g0.f37296b);
        C5089g c5089g27 = new C5089g(kotlin.jvm.internal.s.a(Void.class), H.f37250a);
        kotlin.jvm.internal.d a9 = kotlin.jvm.internal.s.a(R7.a.class);
        int i = R7.a.f2760w;
        C5089g[] c5089gArr = {c5089g, c5089g2, c5089g3, c5089g4, c5089g5, c5089g6, c5089g7, c5089g8, c5089g9, c5089g10, c5089g11, c5089g12, c5089g13, c5089g14, c5089g15, c5089g16, c5089g17, c5089g18, c5089g19, c5089g20, c5089g21, c5089g22, c5089g23, c5089g24, c5089g25, c5089g26, c5089g27, new C5089g(a9, C4485q.f37312a)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(v7.t.P(28));
        v7.t.R(linkedHashMap, c5089gArr);
        f37260a = linkedHashMap;
    }

    public static final String a(String str) {
        String valueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        if (Character.isLowerCase(charAt)) {
            String valueOf2 = String.valueOf(charAt);
            kotlin.jvm.internal.h.c(valueOf2, "null cannot be cast to non-null type java.lang.String");
            Locale locale = Locale.ROOT;
            valueOf = valueOf2.toUpperCase(locale);
            kotlin.jvm.internal.h.d(valueOf, "toUpperCase(...)");
            if (valueOf.length() <= 1) {
                valueOf = String.valueOf(Character.toTitleCase(charAt));
            } else if (charAt != 329) {
                char charAt2 = valueOf.charAt(0);
                String substring = valueOf.substring(1);
                kotlin.jvm.internal.h.d(substring, "substring(...)");
                String lowerCase = substring.toLowerCase(locale);
                kotlin.jvm.internal.h.d(lowerCase, "toLowerCase(...)");
                valueOf = charAt2 + lowerCase;
            }
        } else {
            valueOf = String.valueOf(charAt);
        }
        sb.append((Object) valueOf);
        String substring2 = str.substring(1);
        kotlin.jvm.internal.h.d(substring2, "substring(...)");
        sb.append(substring2);
        return sb.toString();
    }
}
