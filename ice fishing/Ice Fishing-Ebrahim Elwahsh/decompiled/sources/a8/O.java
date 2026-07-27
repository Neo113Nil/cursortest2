package a8;

import java.util.LinkedHashMap;
import java.util.Locale;
import q7.C4938g;
import q7.C4944m;
import q7.C4945n;
import q7.C4946o;
import q7.C4947p;
import q7.C4948q;
import q7.C4949r;

/* loaded from: classes2.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f4445a;

    static {
        C4938g c4938g = new C4938g(kotlin.jvm.internal.s.a(String.class), T.f4451a);
        C4938g c4938g2 = new C4938g(kotlin.jvm.internal.s.a(Character.TYPE), C0445l.f4489a);
        C4938g c4938g3 = new C4938g(kotlin.jvm.internal.s.a(char[].class), C0444k.f4488c);
        C4938g c4938g4 = new C4938g(kotlin.jvm.internal.s.a(Double.TYPE), C0449p.f4495a);
        C4938g c4938g5 = new C4938g(kotlin.jvm.internal.s.a(double[].class), C0448o.f4494c);
        C4938g c4938g6 = new C4938g(kotlin.jvm.internal.s.a(Float.TYPE), C0453u.f4507a);
        C4938g c4938g7 = new C4938g(kotlin.jvm.internal.s.a(float[].class), C0452t.f4506c);
        C4938g c4938g8 = new C4938g(kotlin.jvm.internal.s.a(Long.TYPE), F.f4432a);
        C4938g c4938g9 = new C4938g(kotlin.jvm.internal.s.a(long[].class), E.f4431c);
        C4938g c4938g10 = new C4938g(kotlin.jvm.internal.s.a(C4948q.class), c0.f4467a);
        C4938g c4938g11 = new C4938g(kotlin.jvm.internal.s.a(C4949r.class), b0.f4465c);
        C4938g c4938g12 = new C4938g(kotlin.jvm.internal.s.a(Integer.TYPE), C0458z.f4522a);
        C4938g c4938g13 = new C4938g(kotlin.jvm.internal.s.a(int[].class), C0457y.f4521c);
        C4938g c4938g14 = new C4938g(kotlin.jvm.internal.s.a(C4946o.class), Z.f4461a);
        C4938g c4938g15 = new C4938g(kotlin.jvm.internal.s.a(C4947p.class), Y.f4460c);
        C4938g c4938g16 = new C4938g(kotlin.jvm.internal.s.a(Short.TYPE), S.f4449a);
        C4938g c4938g17 = new C4938g(kotlin.jvm.internal.s.a(short[].class), Q.f4448c);
        C4938g c4938g18 = new C4938g(kotlin.jvm.internal.s.a(q7.t.class), f0.f4477a);
        C4938g c4938g19 = new C4938g(kotlin.jvm.internal.s.a(q7.u.class), e0.f4474c);
        C4938g c4938g20 = new C4938g(kotlin.jvm.internal.s.a(Byte.TYPE), C0442i.f4484a);
        C4938g c4938g21 = new C4938g(kotlin.jvm.internal.s.a(byte[].class), C0441h.f4483c);
        C4938g c4938g22 = new C4938g(kotlin.jvm.internal.s.a(C4944m.class), W.f4456a);
        C4938g c4938g23 = new C4938g(kotlin.jvm.internal.s.a(C4945n.class), V.f4455c);
        C4938g c4938g24 = new C4938g(kotlin.jvm.internal.s.a(Boolean.TYPE), C0439f.f4475a);
        C4938g c4938g25 = new C4938g(kotlin.jvm.internal.s.a(boolean[].class), C0438e.f4473c);
        C4938g c4938g26 = new C4938g(kotlin.jvm.internal.s.a(q7.v.class), g0.f4481b);
        C4938g c4938g27 = new C4938g(kotlin.jvm.internal.s.a(Void.class), H.f4435a);
        kotlin.jvm.internal.d a9 = kotlin.jvm.internal.s.a(N7.a.class);
        int i = N7.a.f2200w;
        C4938g[] c4938gArr = {c4938g, c4938g2, c4938g3, c4938g4, c4938g5, c4938g6, c4938g7, c4938g8, c4938g9, c4938g10, c4938g11, c4938g12, c4938g13, c4938g14, c4938g15, c4938g16, c4938g17, c4938g18, c4938g19, c4938g20, c4938g21, c4938g22, c4938g23, c4938g24, c4938g25, c4938g26, c4938g27, new C4938g(a9, C0450q.f4497a)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(r7.t.z(28));
        r7.t.B(linkedHashMap, c4938gArr);
        f4445a = linkedHashMap;
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
