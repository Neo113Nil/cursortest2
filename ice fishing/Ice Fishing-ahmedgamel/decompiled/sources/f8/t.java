package f8;

import b8.InterfaceC0537a;
import e8.N;
import e8.O;
import e8.c0;
import java.util.Iterator;
import u7.C5091q;

/* loaded from: classes2.dex */
public final class t implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final t f37540a = new t();

    /* renamed from: b, reason: collision with root package name */
    public static final N f37541b;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    static {
        c8.c cVar = c8.c.f5812j;
        if (Q7.j.s0("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Iterator it = O.f37336a.keySet().iterator();
        while (it.hasNext()) {
            String b9 = ((kotlin.jvm.internal.d) ((O7.c) it.next())).b();
            kotlin.jvm.internal.h.b(b9);
            String a9 = O.a(b9);
            if ("kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase("kotlin." + a9) || "kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase(a9)) {
                throw new IllegalArgumentException(Q7.k.X("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exist " + O.a(a9) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f37541b = new N("kotlinx.serialization.json.JsonLiteral", cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // b8.InterfaceC0537a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(g8.q qVar, Object obj) {
        Double d9;
        s value = (s) obj;
        kotlin.jvm.internal.h.e(value, "value");
        com.bumptech.glide.d.a(qVar);
        boolean z6 = value.f37538n;
        String str = value.f37539u;
        if (z6) {
            qVar.o(str);
            return;
        }
        Long j02 = Q7.q.j0(str);
        if (j02 != null) {
            qVar.k(j02.longValue());
            return;
        }
        C5091q u6 = Q3.b.u(str);
        if (u6 != null) {
            qVar.h(c0.f37359b).k(u6.f41068n);
            return;
        }
        Boolean bool = null;
        if (Q7.p.Z(str)) {
            d9 = Double.valueOf(Double.parseDouble(str));
            if (d9 == null) {
                qVar.e(d9.doubleValue());
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
        d9 = null;
        if (d9 == null) {
        }
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        l X8 = com.bumptech.glide.d.c(decoder).X();
        if (X8 instanceof s) {
            return (s) X8;
        }
        throw g8.l.b(-1, X8.toString(), "Unexpected JSON element, expected JsonLiteral, had " + kotlin.jvm.internal.s.a(X8.getClass()));
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return f37541b;
    }
}
