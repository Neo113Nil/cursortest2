package g8;

import b8.InterfaceC0537a;
import e8.L;
import f8.AbstractC4526c;
import f8.EnumC4524a;
import java.lang.annotation.Annotation;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final M.h f37763a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC4526c f37764b;

    /* renamed from: c, reason: collision with root package name */
    public final t f37765c;

    /* renamed from: d, reason: collision with root package name */
    public final q[] f37766d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f37767e;

    /* renamed from: f, reason: collision with root package name */
    public String f37768f;

    public q(M.h composer, AbstractC4526c abstractC4526c, t tVar, q[] qVarArr) {
        kotlin.jvm.internal.h.e(composer, "composer");
        this.f37763a = composer;
        this.f37764b = abstractC4526c;
        this.f37765c = tVar;
        this.f37766d = qVarArr;
        f8.j jVar = abstractC4526c.f37501a;
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
        AbstractC4526c abstractC4526c = this.f37764b;
        t h3 = l.h(descriptor, abstractC4526c);
        char c9 = h3.f37778n;
        M.h hVar = this.f37763a;
        hVar.i(c9);
        hVar.f1806n = true;
        if (this.f37768f != null) {
            hVar.g();
            String str = this.f37768f;
            kotlin.jvm.internal.h.b(str);
            o(str);
            hVar.i(':');
            o(descriptor.a());
            this.f37768f = null;
        }
        if (this.f37765c == h3) {
            return this;
        }
        q[] qVarArr = this.f37766d;
        return (qVarArr == null || (qVar = qVarArr[h3.ordinal()]) == null) ? new q(hVar, abstractC4526c, h3, qVarArr) : qVar;
    }

    public final void b(boolean z6) {
        if (this.f37767e) {
            o(String.valueOf(z6));
        } else {
            ((I1.a) this.f37763a.f1807u).p(String.valueOf(z6));
        }
    }

    public final void c(byte b9) {
        if (this.f37767e) {
            o(String.valueOf((int) b9));
        } else {
            this.f37763a.h(b9);
        }
    }

    public final void d(char c9) {
        o(String.valueOf(c9));
    }

    public final void e(double d9) {
        boolean z6 = this.f37767e;
        M.h hVar = this.f37763a;
        if (z6) {
            o(String.valueOf(d9));
        } else {
            ((I1.a) hVar.f1807u).p(String.valueOf(d9));
        }
        if (Double.isInfinite(d9) || Double.isNaN(d9)) {
            throw l.a(Double.valueOf(d9), ((I1.a) hVar.f1807u).toString());
        }
    }

    public final void f(c8.e descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        int ordinal = this.f37765c.ordinal();
        boolean z6 = true;
        M.h hVar = this.f37763a;
        if (ordinal == 1) {
            if (!hVar.f1806n) {
                hVar.i(',');
            }
            hVar.g();
            return;
        }
        if (ordinal == 2) {
            if (hVar.f1806n) {
                this.f37767e = true;
                hVar.g();
                return;
            }
            if (i % 2 == 0) {
                hVar.i(',');
                hVar.g();
            } else {
                hVar.i(':');
                hVar.q();
                z6 = false;
            }
            this.f37767e = z6;
            return;
        }
        if (ordinal != 3) {
            if (!hVar.f1806n) {
                hVar.i(',');
            }
            hVar.g();
            l.g(descriptor, this.f37764b);
            o(descriptor.f(i));
            hVar.i(':');
            hVar.q();
            return;
        }
        if (i == 0) {
            this.f37767e = true;
        }
        if (i == 1) {
            hVar.i(',');
            hVar.q();
            this.f37767e = false;
        }
    }

    public final void g(float f2) {
        boolean z6 = this.f37767e;
        M.h hVar = this.f37763a;
        if (z6) {
            o(String.valueOf(f2));
        } else {
            ((I1.a) hVar.f1807u).p(String.valueOf(f2));
        }
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            throw l.a(Float.valueOf(f2), ((I1.a) hVar.f1807u).toString());
        }
    }

    public final q h(c8.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        boolean a9 = r.a(descriptor);
        t tVar = this.f37765c;
        AbstractC4526c abstractC4526c = this.f37764b;
        M.h hVar = this.f37763a;
        if (a9) {
            if (!(hVar instanceof e)) {
                hVar = new e((I1.a) hVar.f1807u, this.f37767e);
            }
            return new q(hVar, abstractC4526c, tVar, null);
        }
        if (!descriptor.g() || !descriptor.equals(f8.m.f37524a)) {
            return this;
        }
        if (!(hVar instanceof d)) {
            hVar = new d((I1.a) hVar.f1807u, this.f37767e);
        }
        return new q(hVar, abstractC4526c, tVar, null);
    }

    public final q i(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        f(descriptor, i);
        return h(descriptor.i(i));
    }

    public final void j(int i) {
        if (this.f37767e) {
            o(String.valueOf(i));
        } else {
            this.f37763a.j(i);
        }
    }

    public final void k(long j6) {
        if (this.f37767e) {
            o(String.valueOf(j6));
        } else {
            this.f37763a.k(j6);
        }
    }

    public final void l(c8.e descriptor, int i, InterfaceC0537a serializer, Object obj) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        kotlin.jvm.internal.h.e(serializer, "serializer");
        f(descriptor, i);
        m(serializer, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(InterfaceC0537a serializer, Object obj) {
        String str;
        kotlin.jvm.internal.h.e(serializer, "serializer");
        f8.j jVar = this.f37764b.f37501a;
        int ordinal = ((EnumC4524a) jVar.f37523g).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                com.bumptech.glide.h d9 = serializer.c().d();
                if (kotlin.jvm.internal.h.a(d9, c8.i.f5827b) || kotlin.jvm.internal.h.a(d9, c8.i.f5830e)) {
                    c8.e c9 = serializer.c();
                    kotlin.jvm.internal.h.e(c9, "<this>");
                    Iterator it = c9.getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = (String) jVar.f37522f;
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof f8.i) {
                            str = ((f8.i) annotation).discriminator();
                            break;
                        }
                    }
                    if (str != null) {
                        this.f37768f = str;
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
        if (this.f37767e) {
            o(String.valueOf((int) s9));
        } else {
            this.f37763a.m(s9);
        }
    }

    public final void o(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        this.f37763a.o(value);
    }

    public final void p(c8.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        t tVar = this.f37765c;
        M.h hVar = this.f37763a;
        hVar.getClass();
        hVar.f1806n = false;
        hVar.i(tVar.f37779u);
    }
}
