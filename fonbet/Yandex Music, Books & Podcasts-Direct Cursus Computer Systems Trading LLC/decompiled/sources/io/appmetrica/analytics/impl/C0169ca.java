package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0169ca {
    public static final Map h;
    public static final C0169ca i;
    public final Sf a;
    public final Dr b;
    public final G9 c;
    public final Ba d;
    public final InterfaceC0720vd e;
    public final InterfaceC0550pg f;
    public final Va g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0458mb.FIRST_OCCURRENCE, 1);
        hashMap.put(EnumC0458mb.NON_FIRST_OCCURENCE, 0);
        hashMap.put(EnumC0458mb.UNKNOWN, -1);
        h = Collections.unmodifiableMap(hashMap);
        i = new C0169ca(new Pl(), new C0213dq(), new C0837zg(), new Ol(), new C0631sb(), new C0660tb(), new C0602rb());
    }

    public C0169ca(C0140ba c0140ba) {
        this(c0140ba.a, c0140ba.b, c0140ba.c, c0140ba.d, c0140ba.e, c0140ba.f, c0140ba.g);
    }

    public final C0457ma a(V9 v9, Nj nj) {
        C0457ma c0457ma = new C0457ma();
        C0428la a = this.f.a(v9.l, v9.m);
        C0313ha a2 = this.e.a(v9.g);
        if (a != null) {
            c0457ma.g = a;
        }
        if (a2 != null) {
            c0457ma.f = a2;
        }
        String a3 = this.a.a(v9.a);
        if (a3 != null) {
            c0457ma.d = a3;
        }
        c0457ma.e = this.b.a(v9, nj);
        String str = v9.j;
        if (str != null) {
            c0457ma.h = str;
        }
        Integer a4 = this.d.a(v9);
        if (a4 != null) {
            c0457ma.c = a4.intValue();
        }
        Long l = v9.c;
        if (l != null) {
            c0457ma.a = l.longValue();
        }
        Long l2 = v9.d;
        if (l2 != null) {
            c0457ma.n = l2.longValue();
        }
        Long l3 = v9.e;
        if (l3 != null) {
            c0457ma.o = l3.longValue();
        }
        Long l4 = v9.f;
        if (l4 != null) {
            c0457ma.b = l4.longValue();
        }
        Integer num = v9.k;
        if (num != null) {
            c0457ma.i = num.intValue();
        }
        c0457ma.j = this.c.a(v9.o);
        C0138b8 c0138b8 = v9.g;
        c0457ma.k = c0138b8 != null ? new Z6().a(c0138b8.a) : -1;
        String str2 = v9.n;
        if (str2 != null) {
            c0457ma.l = str2.getBytes();
        }
        EnumC0458mb enumC0458mb = v9.p;
        Integer num2 = enumC0458mb != null ? (Integer) h.get(enumC0458mb) : null;
        if (num2 != null) {
            c0457ma.m = num2.intValue();
        }
        EnumC0688ua enumC0688ua = v9.q;
        if (enumC0688ua != null) {
            int ordinal = enumC0688ua.ordinal();
            if (ordinal == 0) {
                c0457ma.p = 0;
            } else if (ordinal == 1) {
                c0457ma.p = 1;
            } else if (ordinal == 2) {
                c0457ma.p = 2;
            }
        }
        Boolean bool = v9.r;
        if (bool != null) {
            c0457ma.q = bool.booleanValue();
        }
        if (v9.s != null) {
            c0457ma.r = r6.intValue();
        }
        c0457ma.s = ((C0602rb) this.g).a(v9.t);
        return c0457ma;
    }

    public C0169ca(Sf sf, Dr dr, G9 g9, Ba ba, InterfaceC0720vd interfaceC0720vd, InterfaceC0550pg interfaceC0550pg, Va va) {
        this.a = sf;
        this.b = dr;
        this.c = g9;
        this.d = ba;
        this.e = interfaceC0720vd;
        this.f = interfaceC0550pg;
        this.g = va;
    }

    public static C0140ba a() {
        return new C0140ba(i);
    }
}
