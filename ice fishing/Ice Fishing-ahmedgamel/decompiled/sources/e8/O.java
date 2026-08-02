package e8;

import java.util.LinkedHashMap;
import java.util.Locale;
import u7.C5081g;
import u7.C5087m;
import u7.C5088n;
import u7.C5089o;
import u7.C5090p;
import u7.C5091q;
import u7.C5092r;

/* loaded from: classes2.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f37336a;

    static {
        C5081g c5081g = new C5081g(kotlin.jvm.internal.s.a(String.class), T.f37342a);
        C5081g c5081g2 = new C5081g(kotlin.jvm.internal.s.a(Character.TYPE), C4497l.f37380a);
        C5081g c5081g3 = new C5081g(kotlin.jvm.internal.s.a(char[].class), C4496k.f37379c);
        C5081g c5081g4 = new C5081g(kotlin.jvm.internal.s.a(Double.TYPE), C4501p.f37386a);
        C5081g c5081g5 = new C5081g(kotlin.jvm.internal.s.a(double[].class), C4500o.f37385c);
        C5081g c5081g6 = new C5081g(kotlin.jvm.internal.s.a(Float.TYPE), C4505u.f37398a);
        C5081g c5081g7 = new C5081g(kotlin.jvm.internal.s.a(float[].class), C4504t.f37397c);
        C5081g c5081g8 = new C5081g(kotlin.jvm.internal.s.a(Long.TYPE), F.f37323a);
        C5081g c5081g9 = new C5081g(kotlin.jvm.internal.s.a(long[].class), E.f37322c);
        C5081g c5081g10 = new C5081g(kotlin.jvm.internal.s.a(C5091q.class), c0.f37358a);
        C5081g c5081g11 = new C5081g(kotlin.jvm.internal.s.a(C5092r.class), b0.f37356c);
        C5081g c5081g12 = new C5081g(kotlin.jvm.internal.s.a(Integer.TYPE), C4510z.f37413a);
        C5081g c5081g13 = new C5081g(kotlin.jvm.internal.s.a(int[].class), C4509y.f37412c);
        C5081g c5081g14 = new C5081g(kotlin.jvm.internal.s.a(C5089o.class), Z.f37352a);
        C5081g c5081g15 = new C5081g(kotlin.jvm.internal.s.a(C5090p.class), Y.f37351c);
        C5081g c5081g16 = new C5081g(kotlin.jvm.internal.s.a(Short.TYPE), S.f37340a);
        C5081g c5081g17 = new C5081g(kotlin.jvm.internal.s.a(short[].class), Q.f37339c);
        C5081g c5081g18 = new C5081g(kotlin.jvm.internal.s.a(u7.t.class), f0.f37368a);
        C5081g c5081g19 = new C5081g(kotlin.jvm.internal.s.a(u7.u.class), e0.f37365c);
        C5081g c5081g20 = new C5081g(kotlin.jvm.internal.s.a(Byte.TYPE), C4494i.f37375a);
        C5081g c5081g21 = new C5081g(kotlin.jvm.internal.s.a(byte[].class), C4493h.f37374c);
        C5081g c5081g22 = new C5081g(kotlin.jvm.internal.s.a(C5087m.class), W.f37347a);
        C5081g c5081g23 = new C5081g(kotlin.jvm.internal.s.a(C5088n.class), V.f37346c);
        C5081g c5081g24 = new C5081g(kotlin.jvm.internal.s.a(Boolean.TYPE), C4491f.f37366a);
        C5081g c5081g25 = new C5081g(kotlin.jvm.internal.s.a(boolean[].class), C4490e.f37364c);
        C5081g c5081g26 = new C5081g(kotlin.jvm.internal.s.a(u7.v.class), g0.f37372b);
        C5081g c5081g27 = new C5081g(kotlin.jvm.internal.s.a(Void.class), H.f37326a);
        kotlin.jvm.internal.d a9 = kotlin.jvm.internal.s.a(R7.a.class);
        int i = R7.a.f2887w;
        C5081g[] c5081gArr = {c5081g, c5081g2, c5081g3, c5081g4, c5081g5, c5081g6, c5081g7, c5081g8, c5081g9, c5081g10, c5081g11, c5081g12, c5081g13, c5081g14, c5081g15, c5081g16, c5081g17, c5081g18, c5081g19, c5081g20, c5081g21, c5081g22, c5081g23, c5081g24, c5081g25, c5081g26, c5081g27, new C5081g(a9, C4502q.f37388a)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(v7.t.t(28));
        v7.t.v(linkedHashMap, c5081gArr);
        f37336a = linkedHashMap;
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
