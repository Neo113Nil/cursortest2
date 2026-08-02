package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ja, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0444ja {
    public static final Map h;
    public static final C0444ja i;
    public final InterfaceC0393hg a;
    public final Wr b;
    public final M9 c;
    public final Ia d;
    public final Ld e;
    public final Fg f;
    public final InterfaceC0273db g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0821wb.FIRST_OCCURRENCE, 1);
        hashMap.put(EnumC0821wb.NON_FIRST_OCCURENCE, 0);
        hashMap.put(EnumC0821wb.UNKNOWN, -1);
        h = Collections.unmodifiableMap(hashMap);
        i = new C0444ja(new C0370gm(), new C0807vq(), new Pg(), new C0341fm(), new Cb(), new Db(), new Bb());
    }

    public C0444ja(C0416ia c0416ia) {
        this(c0416ia.a, c0416ia.b, c0416ia.c, c0416ia.d, c0416ia.e, c0416ia.f, c0416ia.g);
    }

    public final C0733ta a(C0243ca c0243ca, Xj xj) {
        C0733ta c0733ta = new C0733ta();
        C0704sa a = this.f.a(c0243ca.l, c0243ca.m);
        C0589oa a2 = this.e.a(c0243ca.g);
        if (a != null) {
            c0733ta.g = a;
        }
        if (a2 != null) {
            c0733ta.f = a2;
        }
        String a3 = this.a.a(c0243ca.a);
        if (a3 != null) {
            c0733ta.d = a3;
        }
        c0733ta.e = this.b.a(c0243ca, xj);
        String str = c0243ca.j;
        if (str != null) {
            c0733ta.h = str;
        }
        Integer a4 = this.d.a(c0243ca);
        if (a4 != null) {
            c0733ta.c = a4.intValue();
        }
        Long l = c0243ca.c;
        if (l != null) {
            c0733ta.a = l.longValue();
        }
        Long l2 = c0243ca.d;
        if (l2 != null) {
            c0733ta.n = l2.longValue();
        }
        Long l3 = c0243ca.e;
        if (l3 != null) {
            c0733ta.o = l3.longValue();
        }
        Long l4 = c0243ca.f;
        if (l4 != null) {
            c0733ta.b = l4.longValue();
        }
        Integer num = c0243ca.k;
        if (num != null) {
            c0733ta.i = num.intValue();
        }
        c0733ta.j = this.c.a(c0243ca.o);
        C0327f8 c0327f8 = c0243ca.g;
        c0733ta.k = c0327f8 != null ? new C0240c7().a(c0327f8.a) : -1;
        String str2 = c0243ca.n;
        if (str2 != null) {
            c0733ta.l = str2.getBytes();
        }
        EnumC0821wb enumC0821wb = c0243ca.p;
        Integer num2 = enumC0821wb != null ? (Integer) h.get(enumC0821wb) : null;
        if (num2 != null) {
            c0733ta.m = num2.intValue();
        }
        Ba ba = c0243ca.q;
        if (ba != null) {
            int ordinal = ba.ordinal();
            if (ordinal == 0) {
                c0733ta.p = 0;
            } else if (ordinal == 1) {
                c0733ta.p = 1;
            } else if (ordinal == 2) {
                c0733ta.p = 2;
            }
        }
        Boolean bool = c0243ca.r;
        if (bool != null) {
            c0733ta.q = bool.booleanValue();
        }
        if (c0243ca.s != null) {
            c0733ta.r = r6.intValue();
        }
        c0733ta.s = ((Bb) this.g).a(c0243ca.t);
        return c0733ta;
    }

    public C0444ja(InterfaceC0393hg interfaceC0393hg, Wr wr, M9 m9, Ia ia, Ld ld, Fg fg, InterfaceC0273db interfaceC0273db) {
        this.a = interfaceC0393hg;
        this.b = wr;
        this.c = m9;
        this.d = ia;
        this.e = ld;
        this.f = fg;
        this.g = interfaceC0273db;
    }

    public static C0416ia a() {
        return new C0416ia(i);
    }
}
