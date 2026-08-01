package g8;

import b8.InterfaceC0529a;
import e8.L;
import f8.AbstractC4516c;
import f8.EnumC4514a;
import java.lang.annotation.Annotation;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final L3.h f37737a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC4516c f37738b;

    /* renamed from: c, reason: collision with root package name */
    public final t f37739c;

    /* renamed from: d, reason: collision with root package name */
    public final q[] f37740d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f37741e;

    /* renamed from: f, reason: collision with root package name */
    public String f37742f;

    public q(L3.h composer, AbstractC4516c abstractC4516c, t tVar, q[] qVarArr) {
        kotlin.jvm.internal.h.e(composer, "composer");
        this.f37737a = composer;
        this.f37738b = abstractC4516c;
        this.f37739c = tVar;
        this.f37740d = qVarArr;
        f8.j jVar = abstractC4516c.f37539a;
        int ordinal = tVar.ordinal();
        if (qVarArr != null) {
            q qVar = qVarArr[ordinal];
            if (qVar == null && qVar == this) {
                return;
            }
            qVarArr[ordinal] = this;
        }
    }

    public final q a(c8.e descriptor) {
        q qVar;
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        AbstractC4516c abstractC4516c = this.f37738b;
        t h9 = l.h(descriptor, abstractC4516c);
        char c9 = h9.f37752n;
        L3.h hVar = this.f37737a;
        hVar.h(c9);
        hVar.f1696n = true;
        if (this.f37742f != null) {
            hVar.f();
            String str = this.f37742f;
            kotlin.jvm.internal.h.b(str);
            o(str);
            hVar.h(':');
            o(descriptor.a());
            this.f37742f = null;
        }
        if (this.f37739c == h9) {
            return this;
        }
        q[] qVarArr = this.f37740d;
        return (qVarArr == null || (qVar = qVarArr[h9.ordinal()]) == null) ? new q(hVar, abstractC4516c, h9, qVarArr) : qVar;
    }

    public final void b(boolean z3) {
        if (this.f37741e) {
            o(String.valueOf(z3));
        } else {
            ((G1.a) this.f37737a.f1697u).p(String.valueOf(z3));
        }
    }

    public final void c(byte b9) {
        if (this.f37741e) {
            o(String.valueOf((int) b9));
        } else {
            this.f37737a.g(b9);
        }
    }

    public final void d(char c9) {
        o(String.valueOf(c9));
    }

    public final void e(double d2) {
        boolean z3 = this.f37741e;
        L3.h hVar = this.f37737a;
        if (z3) {
            o(String.valueOf(d2));
        } else {
            ((G1.a) hVar.f1697u).p(String.valueOf(d2));
        }
        if (Double.isInfinite(d2) || Double.isNaN(d2)) {
            throw l.a(Double.valueOf(d2), ((G1.a) hVar.f1697u).toString());
        }
    }

    public final void f(c8.e descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        int ordinal = this.f37739c.ordinal();
        boolean z3 = true;
        L3.h hVar = this.f37737a;
        if (ordinal == 1) {
            if (!hVar.f1696n) {
                hVar.h(',');
            }
            hVar.f();
            return;
        }
        if (ordinal == 2) {
            if (hVar.f1696n) {
                this.f37741e = true;
                hVar.f();
                return;
            }
            if (i % 2 == 0) {
                hVar.h(',');
                hVar.f();
            } else {
                hVar.h(':');
                hVar.q();
                z3 = false;
            }
            this.f37741e = z3;
            return;
        }
        if (ordinal != 3) {
            if (!hVar.f1696n) {
                hVar.h(',');
            }
            hVar.f();
            l.g(descriptor, this.f37738b);
            o(descriptor.f(i));
            hVar.h(':');
            hVar.q();
            return;
        }
        if (i == 0) {
            this.f37741e = true;
        }
        if (i == 1) {
            hVar.h(',');
            hVar.q();
            this.f37741e = false;
        }
    }

    public final void g(float f3) {
        boolean z3 = this.f37741e;
        L3.h hVar = this.f37737a;
        if (z3) {
            o(String.valueOf(f3));
        } else {
            ((G1.a) hVar.f1697u).p(String.valueOf(f3));
        }
        if (Float.isInfinite(f3) || Float.isNaN(f3)) {
            throw l.a(Float.valueOf(f3), ((G1.a) hVar.f1697u).toString());
        }
    }

    public final q h(c8.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        boolean a9 = r.a(descriptor);
        t tVar = this.f37739c;
        AbstractC4516c abstractC4516c = this.f37738b;
        L3.h hVar = this.f37737a;
        if (a9) {
            if (!(hVar instanceof e)) {
                hVar = new e((G1.a) hVar.f1697u, this.f37741e);
            }
            return new q(hVar, abstractC4516c, tVar, null);
        }
        if (!descriptor.g() || !descriptor.equals(f8.m.f37562a)) {
            return this;
        }
        if (!(hVar instanceof d)) {
            hVar = new d((G1.a) hVar.f1697u, this.f37741e);
        }
        return new q(hVar, abstractC4516c, tVar, null);
    }

    public final q i(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        f(descriptor, i);
        return h(descriptor.i(i));
    }

    public final void j(int i) {
        if (this.f37741e) {
            o(String.valueOf(i));
        } else {
            this.f37737a.i(i);
        }
    }

    public final void k(long j6) {
        if (this.f37741e) {
            o(String.valueOf(j6));
        } else {
            this.f37737a.k(j6);
        }
    }

    public final void l(c8.e descriptor, int i, InterfaceC0529a serializer, Object obj) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        kotlin.jvm.internal.h.e(serializer, "serializer");
        f(descriptor, i);
        m(serializer, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(InterfaceC0529a serializer, Object obj) {
        String str;
        kotlin.jvm.internal.h.e(serializer, "serializer");
        f8.j jVar = this.f37738b.f37539a;
        int ordinal = ((EnumC4514a) jVar.f37561g).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                t8.g d2 = serializer.c().d();
                if (kotlin.jvm.internal.h.a(d2, c8.i.f5651b) || kotlin.jvm.internal.h.a(d2, c8.i.f5654e)) {
                    c8.e c9 = serializer.c();
                    kotlin.jvm.internal.h.e(c9, "<this>");
                    Iterator it = c9.getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = (String) jVar.f37560f;
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof f8.i) {
                            str = ((f8.i) annotation).discriminator();
                            break;
                        }
                    }
                    if (str != null) {
                        this.f37742f = str;
                    }
                    serializer.a(this, obj);
                }
            } else if (ordinal != 2) {
                throw new B0.c();
            }
        }
        str = null;
        if (str != null) {
        }
        serializer.a(this, obj);
    }

    public final void n(short s9) {
        if (this.f37741e) {
            o(String.valueOf((int) s9));
        } else {
            this.f37737a.m(s9);
        }
    }

    public final void o(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        this.f37737a.o(value);
    }

    public final void p(c8.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        t tVar = this.f37739c;
        L3.h hVar = this.f37737a;
        hVar.getClass();
        hVar.f1696n = false;
        hVar.h(tVar.f37753u);
    }
}
