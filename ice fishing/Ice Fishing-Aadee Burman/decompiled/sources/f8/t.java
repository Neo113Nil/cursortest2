package f8;

import a.AbstractC0422a;
import b8.InterfaceC0529a;
import e8.N;
import e8.O;
import e8.c0;
import java.util.Iterator;
import u7.C5099q;

/* loaded from: classes2.dex */
public final class t implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final t f37578a = new t();

    /* renamed from: b, reason: collision with root package name */
    public static final N f37579b;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    static {
        c8.c cVar = c8.c.f5636j;
        if (Q7.j.c0("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Iterator it = O.f37260a.keySet().iterator();
        while (it.hasNext()) {
            String b9 = ((kotlin.jvm.internal.d) ((O7.c) it.next())).b();
            kotlin.jvm.internal.h.b(b9);
            String a9 = O.a(b9);
            if ("kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase("kotlin." + a9) || "kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase(a9)) {
                throw new IllegalArgumentException(Q7.k.H("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exist " + O.a(a9) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f37579b = new N("kotlinx.serialization.json.JsonLiteral", cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // b8.InterfaceC0529a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(g8.q qVar, Object obj) {
        Double d2;
        s value = (s) obj;
        kotlin.jvm.internal.h.e(value, "value");
        AbstractC0422a.e(qVar);
        boolean z3 = value.f37576n;
        String str = value.f37577u;
        if (z3) {
            qVar.o(str);
            return;
        }
        Long T8 = Q7.q.T(str);
        if (T8 != null) {
            qVar.k(T8.longValue());
            return;
        }
        C5099q v9 = S0.f.v(str);
        if (v9 != null) {
            qVar.h(c0.f37283b).k(v9.f41345n);
            return;
        }
        Boolean bool = null;
        if (Q7.p.J(str)) {
            d2 = Double.valueOf(Double.parseDouble(str));
            if (d2 == null) {
                qVar.e(d2.doubleValue());
                return;
            }
            if (str.equals("true")) {
                bool = Boolean.TRUE;
            } else if (str.equals("false")) {
                bool = Boolean.FALSE;
            }
            if (bool != null) {
                qVar.b(bool.booleanValue());
                return;
            } else {
                qVar.o(str);
                return;
            }
        }
        d2 = null;
        if (d2 == null) {
        }
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        l T8 = AbstractC0422a.g(decoder).T();
        if (T8 instanceof s) {
            return (s) T8;
        }
        throw g8.l.b(-1, T8.toString(), "Unexpected JSON element, expected JsonLiteral, had " + kotlin.jvm.internal.s.a(T8.getClass()));
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37579b;
    }
}
