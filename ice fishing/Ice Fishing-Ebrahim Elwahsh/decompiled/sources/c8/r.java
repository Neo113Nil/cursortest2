package c8;

import a8.L;
import b8.AbstractC0534c;
import b8.EnumC0532a;
import java.lang.annotation.Annotation;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final M.h f5795a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0534c f5796b;

    /* renamed from: c, reason: collision with root package name */
    public final u f5797c;

    /* renamed from: d, reason: collision with root package name */
    public final r[] f5798d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5799e;

    /* renamed from: f, reason: collision with root package name */
    public String f5800f;

    public r(M.h composer, AbstractC0534c abstractC0534c, u uVar, r[] rVarArr) {
        kotlin.jvm.internal.h.e(composer, "composer");
        this.f5795a = composer;
        this.f5796b = abstractC0534c;
        this.f5797c = uVar;
        this.f5798d = rVarArr;
        b8.j jVar = abstractC0534c.f5583a;
        int ordinal = uVar.ordinal();
        if (rVarArr != null) {
            r rVar = rVarArr[ordinal];
            if (rVar == null && rVar == this) {
                return;
            }
            rVarArr[ordinal] = this;
        }
    }

    public final r a(Y7.e descriptor) {
        r rVar;
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        AbstractC0534c abstractC0534c = this.f5796b;
        u h9 = m.h(descriptor, abstractC0534c);
        char c4 = h9.f5810n;
        M.h hVar = this.f5795a;
        hVar.h(c4);
        hVar.f1827n = true;
        if (this.f5800f != null) {
            hVar.d();
            String str = this.f5800f;
            kotlin.jvm.internal.h.b(str);
            o(str);
            hVar.h(':');
            o(descriptor.a());
            this.f5800f = null;
        }
        if (this.f5797c == h9) {
            return this;
        }
        r[] rVarArr = this.f5798d;
        return (rVarArr == null || (rVar = rVarArr[h9.ordinal()]) == null) ? new r(hVar, abstractC0534c, h9, rVarArr) : rVar;
    }

    public final void b(boolean z8) {
        if (this.f5799e) {
            o(String.valueOf(z8));
        } else {
            ((G1.a) this.f5795a.f1828u).o(String.valueOf(z8));
        }
    }

    public final void c(byte b9) {
        if (this.f5799e) {
            o(String.valueOf((int) b9));
        } else {
            this.f5795a.f(b9);
        }
    }

    public final void d(char c4) {
        o(String.valueOf(c4));
    }

    public final void e(double d2) {
        boolean z8 = this.f5799e;
        M.h hVar = this.f5795a;
        if (z8) {
            o(String.valueOf(d2));
        } else {
            ((G1.a) hVar.f1828u).o(String.valueOf(d2));
        }
        if (Double.isInfinite(d2) || Double.isNaN(d2)) {
            throw m.a(Double.valueOf(d2), ((G1.a) hVar.f1828u).toString());
        }
    }

    public final void f(Y7.e descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        int ordinal = this.f5797c.ordinal();
        boolean z8 = true;
        M.h hVar = this.f5795a;
        if (ordinal == 1) {
            if (!hVar.f1827n) {
                hVar.h(',');
            }
            hVar.d();
            return;
        }
        if (ordinal == 2) {
            if (hVar.f1827n) {
                this.f5799e = true;
                hVar.d();
                return;
            }
            if (i % 2 == 0) {
                hVar.h(',');
                hVar.d();
            } else {
                hVar.h(':');
                hVar.p();
                z8 = false;
            }
            this.f5799e = z8;
            return;
        }
        if (ordinal != 3) {
            if (!hVar.f1827n) {
                hVar.h(',');
            }
            hVar.d();
            m.g(descriptor, this.f5796b);
            o(descriptor.f(i));
            hVar.h(':');
            hVar.p();
            return;
        }
        if (i == 0) {
            this.f5799e = true;
        }
        if (i == 1) {
            hVar.h(',');
            hVar.p();
            this.f5799e = false;
        }
    }

    public final void g(float f6) {
        boolean z8 = this.f5799e;
        M.h hVar = this.f5795a;
        if (z8) {
            o(String.valueOf(f6));
        } else {
            ((G1.a) hVar.f1828u).o(String.valueOf(f6));
        }
        if (Float.isInfinite(f6) || Float.isNaN(f6)) {
            throw m.a(Float.valueOf(f6), ((G1.a) hVar.f1828u).toString());
        }
    }

    public final r h(Y7.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        boolean a9 = s.a(descriptor);
        u uVar = this.f5797c;
        AbstractC0534c abstractC0534c = this.f5796b;
        M.h hVar = this.f5795a;
        if (a9) {
            if (!(hVar instanceof f)) {
                hVar = new f((G1.a) hVar.f1828u, this.f5799e);
            }
            return new r(hVar, abstractC0534c, uVar, null);
        }
        if (!descriptor.g() || !descriptor.equals(b8.m.f5606a)) {
            return this;
        }
        if (!(hVar instanceof e)) {
            hVar = new e((G1.a) hVar.f1828u, this.f5799e);
        }
        return new r(hVar, abstractC0534c, uVar, null);
    }

    public final r i(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        f(descriptor, i);
        return h(descriptor.i(i));
    }

    public final void j(int i) {
        if (this.f5799e) {
            o(String.valueOf(i));
        } else {
            this.f5795a.i(i);
        }
    }

    public final void k(long j9) {
        if (this.f5799e) {
            o(String.valueOf(j9));
        } else {
            this.f5795a.j(j9);
        }
    }

    public final void l(Y7.e descriptor, int i, X7.a serializer, Object obj) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        kotlin.jvm.internal.h.e(serializer, "serializer");
        f(descriptor, i);
        m(serializer, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(X7.a serializer, Object obj) {
        String str;
        kotlin.jvm.internal.h.e(serializer, "serializer");
        b8.j jVar = this.f5796b.f5583a;
        int ordinal = ((EnumC0532a) jVar.f5605g).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                com.bumptech.glide.e d2 = serializer.c().d();
                if (kotlin.jvm.internal.h.a(d2, Y7.i.f4056g) || kotlin.jvm.internal.h.a(d2, Y7.i.f4058j)) {
                    Y7.e c4 = serializer.c();
                    kotlin.jvm.internal.h.e(c4, "<this>");
                    Iterator it = c4.getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = (String) jVar.f5604f;
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof b8.i) {
                            str = ((b8.i) annotation).discriminator();
                            break;
                        }
                    }
                    if (str != null) {
                        this.f5800f = str;
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

    public final void n(short s3) {
        if (this.f5799e) {
            o(String.valueOf((int) s3));
        } else {
            this.f5795a.m(s3);
        }
    }

    public final void o(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        this.f5795a.n(value);
    }

    public final void p(Y7.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        u uVar = this.f5797c;
        M.h hVar = this.f5795a;
        hVar.getClass();
        hVar.f1827n = false;
        hVar.h(uVar.f5811u);
    }
}
