package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.internal.usecase.j2;
import com.yandex.passport.internal.usecase.l2;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class r0 extends androidx.core.app.n0 {
    public final d1 b;
    public final com.yandex.passport.internal.f c;
    public final com.yandex.passport.internal.ui.e d;
    public final l2 e;
    public final r f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(d1 d1Var, com.yandex.passport.internal.f fVar, com.yandex.passport.internal.ui.e eVar, l2 l2Var, r rVar, com.yandex.passport.common.coroutine.a aVar) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        d1Var.getClass();
        fVar.getClass();
        eVar.getClass();
        l2Var.getClass();
        rVar.getClass();
        aVar.getClass();
        this.b = d1Var;
        this.c = fVar;
        this.d = eVar;
        this.e = l2Var;
        this.f = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(o0 o0Var, cg6 cg6Var) {
        p0 p0Var;
        nm6 nm6Var;
        int i;
        com.yandex.passport.internal.ui.e eVar;
        int i2;
        Object g;
        String a;
        o0 o0Var2;
        int i3;
        Object g2;
        o0 o0Var3;
        Exception e;
        String str;
        Object g3;
        o0 o0Var4;
        Object obj;
        Throwable a2;
        o0 o0Var5 = o0Var;
        try {
            if (cg6Var instanceof p0) {
                p0Var = (p0) cg6Var;
                int i4 = p0Var.o;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    p0Var.o = i4 - Integer.MIN_VALUE;
                    Object obj2 = p0Var.m;
                    nm6Var = nm6.a;
                    i = p0Var.o;
                    eVar = this.d;
                    if (i != 0) {
                        qgg.h0(obj2);
                        Function1 function1 = o0Var5.f;
                        com.yandex.passport.internal.ui.domik.e eVar2 = o0Var5.a;
                        function1.invoke(Boolean.TRUE);
                        i2 = 0;
                        try {
                            l2 l2Var = this.e;
                            j2 j2Var = new j2(eVar2.f(), eVar2.u());
                            p0Var.j = o0Var5;
                            p0Var.l = 0;
                            p0Var.o = 1;
                            g = l2Var.g(j2Var, p0Var);
                        } catch (Exception unused) {
                            a = this.c.a();
                            int i5 = i2;
                            o0Var2 = o0Var5;
                            i3 = i5;
                            o0Var2.getClass();
                            com.yandex.passport.internal.ui.domik.e eVar3 = o0Var2.a;
                            r rVar = this.f;
                            p pVar = new p(eVar3.f(), eVar3.g());
                            p0Var.j = o0Var2;
                            p0Var.k = a;
                            p0Var.l = i3;
                            p0Var.o = 2;
                            g2 = rVar.g(pVar, p0Var);
                            if (g2 == nm6Var) {
                            }
                            String str2 = a;
                            Object obj3 = ((z7o) g2).a;
                            qgg.h0(obj3);
                            String str3 = (String) obj3;
                            com.yandex.passport.internal.ui.domik.e eVar4 = o0Var2.a;
                            com.yandex.passport.common.core.b f = eVar4.f();
                            String g4 = eVar4.g();
                            if (o0Var2.b) {
                            }
                            com.yandex.passport.internal.entities.g gVar = com.yandex.passport.internal.entities.g.BY_SMS;
                            b1 b1Var = new b1(f, g4, str, str2, str3, o0Var2.b);
                            p0Var.j = o0Var2;
                            p0Var.k = null;
                            p0Var.l = i3;
                            p0Var.o = 3;
                            g3 = this.b.g(b1Var, p0Var);
                            if (g3 != nm6Var) {
                            }
                            return nm6Var;
                        }
                        if (g == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                o0Var4 = p0Var.j;
                                qgg.h0(obj2);
                                obj = ((z7o) obj2).a;
                                if (!(obj instanceof t7o)) {
                                    com.yandex.passport.data.models.m mVar = (com.yandex.passport.data.models.m) obj;
                                    if (mVar.d()) {
                                        o0Var4.d.invoke(o0Var4.a);
                                    } else {
                                        o0Var4.c.invoke(o0Var4.a, mVar);
                                    }
                                }
                                a2 = z7o.a(obj);
                                if (a2 != null) {
                                    o0Var4.e.invoke(eVar.a(a2));
                                }
                                o0Var4.f.invoke(Boolean.FALSE);
                                return Unit.a;
                            }
                            i3 = p0Var.l;
                            a = p0Var.k;
                            o0Var3 = p0Var.j;
                            try {
                                qgg.h0(obj2);
                                g2 = obj2;
                                o0Var2 = o0Var3;
                                String str22 = a;
                                Object obj32 = ((z7o) g2).a;
                                qgg.h0(obj32);
                                String str32 = (String) obj32;
                                com.yandex.passport.internal.ui.domik.e eVar42 = o0Var2.a;
                                com.yandex.passport.common.core.b f2 = eVar42.f();
                                String g42 = eVar42.g();
                                if (o0Var2.b) {
                                    str = null;
                                } else {
                                    String d = eVar42.d();
                                    if (d == null) {
                                        xq0.q("required phoneNumber is missing");
                                        return null;
                                    }
                                    str = d;
                                }
                                com.yandex.passport.internal.entities.g gVar2 = com.yandex.passport.internal.entities.g.BY_SMS;
                                b1 b1Var2 = new b1(f2, g42, str, str22, str32, o0Var2.b);
                                p0Var.j = o0Var2;
                                p0Var.k = null;
                                p0Var.l = i3;
                                p0Var.o = 3;
                                g3 = this.b.g(b1Var2, p0Var);
                                if (g3 != nm6Var) {
                                    o0 o0Var6 = o0Var2;
                                    obj2 = g3;
                                    o0Var4 = o0Var6;
                                    obj = ((z7o) obj2).a;
                                    if (!(obj instanceof t7o)) {
                                    }
                                    a2 = z7o.a(obj);
                                    if (a2 != null) {
                                    }
                                    o0Var4.f.invoke(Boolean.FALSE);
                                    return Unit.a;
                                }
                                return nm6Var;
                            } catch (Exception e2) {
                                e = e2;
                                o0Var3.e.invoke(eVar.a(e));
                                o0Var3.f.invoke(Boolean.FALSE);
                                return Unit.a;
                            }
                        }
                        int i6 = p0Var.l;
                        o0 o0Var7 = p0Var.j;
                        try {
                            qgg.h0(obj2);
                            i2 = i6;
                            o0Var5 = o0Var7;
                            g = obj2;
                        } catch (Exception unused2) {
                            i2 = i6;
                            o0Var5 = o0Var7;
                            a = this.c.a();
                            int i52 = i2;
                            o0Var2 = o0Var5;
                            i3 = i52;
                            o0Var2.getClass();
                            com.yandex.passport.internal.ui.domik.e eVar32 = o0Var2.a;
                            r rVar2 = this.f;
                            p pVar2 = new p(eVar32.f(), eVar32.g());
                            p0Var.j = o0Var2;
                            p0Var.k = a;
                            p0Var.l = i3;
                            p0Var.o = 2;
                            g2 = rVar2.g(pVar2, p0Var);
                            if (g2 == nm6Var) {
                            }
                            String str222 = a;
                            Object obj322 = ((z7o) g2).a;
                            qgg.h0(obj322);
                            String str322 = (String) obj322;
                            com.yandex.passport.internal.ui.domik.e eVar422 = o0Var2.a;
                            com.yandex.passport.common.core.b f22 = eVar422.f();
                            String g422 = eVar422.g();
                            if (o0Var2.b) {
                            }
                            com.yandex.passport.internal.entities.g gVar22 = com.yandex.passport.internal.entities.g.BY_SMS;
                            b1 b1Var22 = new b1(f22, g422, str, str222, str322, o0Var2.b);
                            p0Var.j = o0Var2;
                            p0Var.k = null;
                            p0Var.l = i3;
                            p0Var.o = 3;
                            g3 = this.b.g(b1Var22, p0Var);
                            if (g3 != nm6Var) {
                            }
                            return nm6Var;
                        }
                    }
                    Object obj4 = ((z7o) g).a;
                    qgg.h0(obj4);
                    a = (String) obj4;
                    int i522 = i2;
                    o0Var2 = o0Var5;
                    i3 = i522;
                    o0Var2.getClass();
                    com.yandex.passport.internal.ui.domik.e eVar322 = o0Var2.a;
                    r rVar22 = this.f;
                    p pVar22 = new p(eVar322.f(), eVar322.g());
                    p0Var.j = o0Var2;
                    p0Var.k = a;
                    p0Var.l = i3;
                    p0Var.o = 2;
                    g2 = rVar22.g(pVar22, p0Var);
                    if (g2 == nm6Var) {
                        return nm6Var;
                    }
                    String str2222 = a;
                    Object obj3222 = ((z7o) g2).a;
                    qgg.h0(obj3222);
                    String str3222 = (String) obj3222;
                    com.yandex.passport.internal.ui.domik.e eVar4222 = o0Var2.a;
                    com.yandex.passport.common.core.b f222 = eVar4222.f();
                    String g4222 = eVar4222.g();
                    if (o0Var2.b) {
                    }
                    com.yandex.passport.internal.entities.g gVar222 = com.yandex.passport.internal.entities.g.BY_SMS;
                    b1 b1Var222 = new b1(f222, g4222, str, str2222, str3222, o0Var2.b);
                    p0Var.j = o0Var2;
                    p0Var.k = null;
                    p0Var.l = i3;
                    p0Var.o = 3;
                    g3 = this.b.g(b1Var222, p0Var);
                    if (g3 != nm6Var) {
                    }
                    return nm6Var;
                }
            }
            r rVar222 = this.f;
            p pVar222 = new p(eVar322.f(), eVar322.g());
            p0Var.j = o0Var2;
            p0Var.k = a;
            p0Var.l = i3;
            p0Var.o = 2;
            g2 = rVar222.g(pVar222, p0Var);
            if (g2 == nm6Var) {
            }
            String str22222 = a;
            Object obj32222 = ((z7o) g2).a;
            qgg.h0(obj32222);
            String str32222 = (String) obj32222;
            com.yandex.passport.internal.ui.domik.e eVar42222 = o0Var2.a;
            com.yandex.passport.common.core.b f2222 = eVar42222.f();
            String g42222 = eVar42222.g();
            if (o0Var2.b) {
            }
            com.yandex.passport.internal.entities.g gVar2222 = com.yandex.passport.internal.entities.g.BY_SMS;
            b1 b1Var2222 = new b1(f2222, g42222, str, str22222, str32222, o0Var2.b);
            p0Var.j = o0Var2;
            p0Var.k = null;
            p0Var.l = i3;
            p0Var.o = 3;
            g3 = this.b.g(b1Var2222, p0Var);
            if (g3 != nm6Var) {
            }
            return nm6Var;
        } catch (Exception e3) {
            e = e3;
            o0Var3 = o0Var2;
            o0Var3.e.invoke(eVar.a(e));
            o0Var3.f.invoke(Boolean.FALSE);
            return Unit.a;
        }
        p0Var = new p0(this, cg6Var);
        Object obj22 = p0Var.m;
        nm6Var = nm6.a;
        i = p0Var.o;
        eVar = this.d;
        if (i != 0) {
        }
        Object obj42 = ((z7o) g).a;
        qgg.h0(obj42);
        a = (String) obj42;
        int i5222 = i2;
        o0Var2 = o0Var5;
        i3 = i5222;
        o0Var2.getClass();
        com.yandex.passport.internal.ui.domik.e eVar3222 = o0Var2.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.core.app.n0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(o0 o0Var, cg6 cg6Var) {
        q0 q0Var;
        int i;
        if (cg6Var instanceof q0) {
            q0Var = (q0) cg6Var;
            int i2 = q0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = q0Var.j;
                Object obj2 = nm6.a;
                i = q0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    q0Var.l = 1;
                    if (u(o0Var, q0Var) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            }
        }
        q0Var = new q0(this, cg6Var);
        Object obj3 = q0Var.j;
        Object obj22 = nm6.a;
        i = q0Var.l;
        if (i != 0) {
        }
        return Unit.a;
    }
}
