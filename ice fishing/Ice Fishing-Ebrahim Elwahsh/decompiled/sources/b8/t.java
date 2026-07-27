package b8;

import a8.N;
import a8.O;
import a8.c0;
import java.util.Iterator;
import q7.C4948q;

/* loaded from: classes2.dex */
public final class t implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final t f5622a = new t();

    /* renamed from: b, reason: collision with root package name */
    public static final N f5623b;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    static {
        Y7.c cVar = Y7.c.f4041o;
        if (M7.j.T("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Iterator it = O.f4445a.keySet().iterator();
        while (it.hasNext()) {
            String b9 = ((kotlin.jvm.internal.d) ((K7.c) it.next())).b();
            kotlin.jvm.internal.h.b(b9);
            String a9 = O.a(b9);
            if ("kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase("kotlin." + a9) || "kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase(a9)) {
                throw new IllegalArgumentException(M7.k.y("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exist " + O.a(a9) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f5623b = new N("kotlinx.serialization.json.JsonLiteral", cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // X7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(c8.r rVar, Object obj) {
        Double d2;
        s value = (s) obj;
        kotlin.jvm.internal.h.e(value, "value");
        p8.g.a(rVar);
        boolean z8 = value.f5620n;
        String str = value.f5621u;
        if (z8) {
            rVar.o(str);
            return;
        }
        Long K8 = M7.q.K(str);
        if (K8 != null) {
            rVar.k(K8.longValue());
            return;
        }
        C4948q E8 = K3.b.E(str);
        if (E8 != null) {
            rVar.h(c0.f4468b).k(E8.f40178n);
            return;
        }
        Boolean bool = null;
        if (M7.p.A(str)) {
            d2 = Double.valueOf(Double.parseDouble(str));
            if (d2 == null) {
                rVar.e(d2.doubleValue());
                return;
            }
            if (str.equals("true")) {
                bool = Boolean.TRUE;
            } else if (str.equals("false")) {
                bool = Boolean.FALSE;
            }
            if (bool != null) {
                rVar.b(bool.booleanValue());
                return;
            } else {
                rVar.o(str);
                return;
            }
        }
        d2 = null;
        if (d2 == null) {
        }
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        l Y = p8.g.c(decoder).Y();
        if (Y instanceof s) {
            return (s) Y;
        }
        throw c8.m.b(-1, Y.toString(), "Unexpected JSON element, expected JsonLiteral, had " + kotlin.jvm.internal.s.a(Y.getClass()));
    }

    @Override // X7.a
    public final Y7.e c() {
        return f5623b;
    }
}
