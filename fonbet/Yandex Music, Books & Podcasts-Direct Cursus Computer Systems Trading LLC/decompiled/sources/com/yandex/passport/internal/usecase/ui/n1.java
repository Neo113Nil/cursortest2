package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.api.z1;
import com.yandex.passport.data.network.ec;
import com.yandex.passport.data.network.mc;
import com.yandex.passport.internal.report.ca;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.usecase.j2;
import com.yandex.passport.internal.usecase.l2;
import defpackage.cg6;
import defpackage.fb7;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class n1 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.account.d b;
    public final com.yandex.passport.internal.ui.e c;
    public final d1 d;
    public final l2 e;
    public final mc f;
    public final com.yandex.passport.internal.network.mappers.b g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.yandex.passport.internal.account.d dVar, com.yandex.passport.internal.ui.e eVar, d1 d1Var, com.yandex.passport.common.coroutine.a aVar, l2 l2Var, mc mcVar, com.yandex.passport.internal.network.mappers.b bVar) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        dVar.getClass();
        eVar.getClass();
        d1Var.getClass();
        aVar.getClass();
        l2Var.getClass();
        mcVar.getClass();
        bVar.getClass();
        this.b = dVar;
        this.c = eVar;
        this.d = d1Var;
        this.e = l2Var;
        this.f = mcVar;
        this.g = bVar;
    }

    public final void u(Exception exc, com.yandex.passport.data.network.l lVar) {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "processRegistrationError " + exc, 8);
        }
        lVar.G(false);
        ((com.yandex.passport.internal.ui.domik.phone_number.b) lVar.a).k.m(this.c.a(exc));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.core.app.n0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(j1 j1Var, cg6 cg6Var) {
        k1 k1Var;
        int i;
        if (cg6Var instanceof k1) {
            k1Var = (k1) cg6Var;
            int i2 = k1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = k1Var.j;
                Object obj2 = nm6.a;
                i = k1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    k1Var.l = 1;
                    if (x(j1Var, k1Var) == obj2) {
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
        k1Var = new k1(this, cg6Var);
        Object obj3 = k1Var.j;
        Object obj22 = nm6.a;
        i = k1Var.l;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(j1 j1Var, String str, String str2, String str3, cg6 cg6Var) {
        l1 l1Var;
        int i;
        com.yandex.passport.internal.entities.g gVar;
        j1 j1Var2;
        Object obj;
        String str4;
        String str5;
        String str6;
        Object obj2;
        Throwable a;
        Throwable a2;
        boolean z;
        z1 z1Var;
        if (cg6Var instanceof l1) {
            l1Var = (l1) cg6Var;
            int i2 = l1Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l1Var.q = i2 - Integer.MIN_VALUE;
                Object obj3 = l1Var.o;
                nm6 nm6Var = nm6.a;
                i = l1Var.q;
                if (i != 0) {
                    qgg.h0(obj3);
                    gVar = com.yandex.passport.internal.entities.g.BY_SMS;
                    b1 b1Var = new b1(j1Var.a.f(), str, str2, str3, null, false);
                    l1Var.j = j1Var;
                    l1Var.k = str;
                    l1Var.l = str2;
                    l1Var.m = str3;
                    l1Var.n = gVar;
                    l1Var.q = 1;
                    Object g = this.d.g(b1Var, l1Var);
                    if (g == nm6Var) {
                        return nm6Var;
                    }
                    j1Var2 = j1Var;
                    obj = g;
                    str4 = str;
                    str5 = str2;
                    str6 = str3;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    com.yandex.passport.internal.entities.g gVar2 = l1Var.n;
                    str6 = l1Var.m;
                    str5 = l1Var.l;
                    String str7 = l1Var.k;
                    j1Var2 = l1Var.j;
                    qgg.h0(obj3);
                    gVar = gVar2;
                    obj = obj3;
                    str4 = str7;
                }
                obj2 = ((z7o) obj).a;
                a = z7o.a(obj2);
                if (a != null) {
                    try {
                        throw a;
                    } catch (Throwable th) {
                        obj2 = new t7o(th);
                    }
                }
                if (!(obj2 instanceof t7o)) {
                    com.yandex.passport.data.models.m mVar = (com.yandex.passport.data.models.m) obj2;
                    com.yandex.passport.data.network.l lVar = j1Var2.c;
                    lVar.G(false);
                    com.yandex.passport.internal.ui.domik.a0 a0Var = j1Var2.a;
                    str4.getClass();
                    com.yandex.passport.internal.ui.domik.a0 i3 = com.yandex.passport.internal.ui.domik.a0.i(com.yandex.passport.internal.ui.domik.a0.i(com.yandex.passport.internal.ui.domik.a0.i(a0Var, str4, null, null, null, null, null, 65533), null, str5, null, null, null, null, 65519), null, null, str6, null, null, null, 65279);
                    gVar.getClass();
                    com.yandex.passport.internal.ui.domik.a0 i4 = com.yandex.passport.internal.ui.domik.a0.i(i3, null, null, null, null, gVar, null, 61439);
                    com.yandex.passport.internal.ui.domik.phone_number.b bVar = (com.yandex.passport.internal.ui.domik.phone_number.b) lVar.a;
                    mVar.getClass();
                    if (!i4.a.y || (z1Var = bVar.v.g) == null) {
                        z = false;
                    } else {
                        com.yandex.passport.internal.report.reporters.u0 u0Var = bVar.u;
                        com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L(z1Var);
                        u0Var.getClass();
                        z = false;
                        u0Var.n(ca.d, new ff(L));
                    }
                    bVar.s.e(com.yandex.passport.internal.analytics.h0.a);
                    com.yandex.passport.internal.ui.domik.y yVar = bVar.r;
                    yVar.getClass();
                    yVar.a.q.m(new com.yandex.passport.internal.ui.base.m(new fb7(12, i4, mVar), com.yandex.passport.internal.ui.domik.sms.a.y, true, 2));
                    lVar.G(z);
                }
                a2 = z7o.a(obj2);
                if (a2 != null) {
                    return Unit.a;
                }
                throw a2;
            }
        }
        l1Var = new l1(this, cg6Var);
        Object obj32 = l1Var.o;
        nm6 nm6Var2 = nm6.a;
        i = l1Var.q;
        if (i != 0) {
        }
        obj2 = ((z7o) obj).a;
        a = z7o.a(obj2);
        if (a != null) {
        }
        if (!(obj2 instanceof t7o)) {
        }
        a2 = z7o.a(obj2);
        if (a2 != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|8|(1:(1:(1:(4:13|14|15|16)(2:18|19))(7:20|21|22|23|24|25|26))(4:39|40|41|42))(3:81|82|(2:84|(2:86|28)(1:87))(5:88|(3:45|46|(2:48|(2:50|51)(1:(2:53|54)))(3:(1:72)(1:69)|70|71))(1:73)|55|56|(5:58|(2:60|28)|24|25|26)(2:61|(3:63|25|26)(2:64|65))))|43|(0)(0)|55|56|(0)(0)))|92|6|7|8|(0)(0)|43|(0)(0)|55|56|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01de, code lost:
    
        if (w(r2, r5, r0, r16, r6) == r7) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x003a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x003d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0040, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6 A[Catch: h -> 0x003a, IOException -> 0x003d, JSONException -> 0x0040, TRY_LEAVE, TryCatch #4 {h -> 0x003a, IOException -> 0x003d, JSONException -> 0x0040, blocks: (B:14:0x0035, B:24:0x01b5, B:26:0x01ca, B:43:0x00b4, B:45:0x00c6, B:48:0x0103, B:50:0x0107, B:53:0x012a, B:56:0x018a, B:58:0x0190, B:61:0x01c3, B:64:0x01e1, B:65:0x01e8, B:67:0x014f, B:69:0x0155, B:70:0x0181, B:72:0x0170, B:82:0x0092, B:84:0x0098), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0190 A[Catch: h -> 0x003a, IOException -> 0x003d, JSONException -> 0x0040, TryCatch #4 {h -> 0x003a, IOException -> 0x003d, JSONException -> 0x0040, blocks: (B:14:0x0035, B:24:0x01b5, B:26:0x01ca, B:43:0x00b4, B:45:0x00c6, B:48:0x0103, B:50:0x0107, B:53:0x012a, B:56:0x018a, B:58:0x0190, B:61:0x01c3, B:64:0x01e1, B:65:0x01e8, B:67:0x014f, B:69:0x0155, B:70:0x0181, B:72:0x0170, B:82:0x0092, B:84:0x0098), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c3 A[Catch: h -> 0x003a, IOException -> 0x003d, JSONException -> 0x0040, TryCatch #4 {h -> 0x003a, IOException -> 0x003d, JSONException -> 0x0040, blocks: (B:14:0x0035, B:24:0x01b5, B:26:0x01ca, B:43:0x00b4, B:45:0x00c6, B:48:0x0103, B:50:0x0107, B:53:0x012a, B:56:0x018a, B:58:0x0190, B:61:0x01c3, B:64:0x01e1, B:65:0x01e8, B:67:0x014f, B:69:0x0155, B:70:0x0181, B:72:0x0170, B:82:0x0092, B:84:0x0098), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(j1 j1Var, cg6 cg6Var) {
        m1 m1Var;
        int i;
        com.yandex.passport.common.core.b f;
        String str;
        String str2;
        int i2;
        com.yandex.passport.common.core.b bVar;
        String str3;
        String str4;
        com.yandex.passport.internal.ui.domik.a0 a0Var;
        String d;
        j1 j1Var2 = j1Var;
        if (cg6Var instanceof m1) {
            m1Var = (m1) cg6Var;
            int i3 = m1Var.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m1Var.q = i3 - Integer.MIN_VALUE;
                m1 m1Var2 = m1Var;
                Object obj = m1Var2.o;
                Object obj2 = nm6.a;
                i = m1Var2.q;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.data.network.l lVar = j1Var2.c;
                    com.yandex.passport.internal.ui.domik.a0 a0Var2 = j1Var2.a;
                    lVar.G(true);
                    f = a0Var2.f();
                    str = a0Var2.b;
                    String str5 = a0Var2.i;
                    if (str5 == null) {
                        l2 l2Var = this.e;
                        j2 j2Var = new j2(f, str);
                        m1Var2.j = j1Var2;
                        m1Var2.k = f;
                        m1Var2.l = str;
                        m1Var2.n = 0;
                        m1Var2.q = 1;
                        Object g = l2Var.g(j2Var, m1Var2);
                        if (g == obj2) {
                            return obj2;
                        }
                        bVar = f;
                        obj = g;
                        i2 = 0;
                    } else {
                        str2 = str5;
                        i2 = 0;
                        if (str == null) {
                            com.yandex.passport.internal.account.d dVar = this.b;
                            String str6 = j1Var2.b;
                            com.yandex.passport.data.network.l lVar2 = j1Var2.c;
                            com.yandex.passport.internal.properties.l lVar3 = j1Var2.a.a;
                            String str7 = lVar3.a;
                            String str8 = lVar3.c;
                            dVar.getClass();
                            f.getClass();
                            str2.getClass();
                            com.yandex.passport.internal.network.response.d i4 = dVar.a.a(f).i(str6, true, true, dVar.c.b(f), str2, str7, str8);
                            str3 = str2;
                            boolean z = i4.b;
                            List list = i4.f;
                            if (!z) {
                                if (list == null || list.isEmpty()) {
                                    com.yandex.passport.internal.ui.f fVar = new com.yandex.passport.internal.ui.f("unknown error");
                                    lVar2.getClass();
                                    ((com.yandex.passport.internal.ui.domik.phone_number.b) lVar2.a).k.m(fVar);
                                } else {
                                    Object obj3 = list.get(0);
                                    obj3.getClass();
                                    com.yandex.passport.internal.ui.f fVar2 = new com.yandex.passport.internal.ui.f((String) obj3);
                                    lVar2.getClass();
                                    ((com.yandex.passport.internal.ui.domik.phone_number.b) lVar2.a).k.m(fVar2);
                                }
                                lVar2.G(false);
                                return Unit.a;
                            }
                            str = i4.c;
                            if (!z) {
                                com.yandex.passport.legacy.a.d(new RuntimeException("Can't register"));
                                com.yandex.passport.internal.ui.f fVar3 = new com.yandex.passport.internal.ui.f("unknown error");
                                lVar2.getClass();
                                ((com.yandex.passport.internal.ui.domik.phone_number.b) lVar2.a).k.m(fVar3);
                                lVar2.G(false);
                                return Unit.a;
                            }
                            if (str == null) {
                                com.yandex.passport.legacy.a.d(new RuntimeException("track_id null"));
                                com.yandex.passport.internal.ui.f fVar4 = new com.yandex.passport.internal.ui.f("unknown error");
                                lVar2.getClass();
                                ((com.yandex.passport.internal.ui.domik.phone_number.b) lVar2.a).k.m(fVar4);
                                lVar2.G(false);
                                return Unit.a;
                            }
                        } else {
                            str3 = str2;
                        }
                        str4 = str;
                        a0Var = j1Var2.a;
                        if (a0Var.m == null) {
                            mc mcVar = this.f;
                            this.g.getClass();
                            ec ecVar = new ec(com.yandex.passport.internal.network.mappers.b.a(f), str4, j1Var2.b);
                            m1Var2.j = j1Var2;
                            m1Var2.k = null;
                            m1Var2.l = str4;
                            m1Var2.m = str3;
                            m1Var2.n = i2;
                            m1Var2.q = 2;
                            obj = mcVar.g(ecVar, m1Var2);
                            if (obj == obj2) {
                                return obj2;
                            }
                            Object obj4 = ((z7o) obj).a;
                            qgg.h0(obj4);
                            d = ((com.yandex.passport.data.models.n) obj4).a;
                            String str9 = str3;
                            m1Var2.j = j1Var2;
                            m1Var2.k = null;
                            m1Var2.l = null;
                            m1Var2.m = null;
                            m1Var2.n = i2;
                            m1Var2.q = 3;
                        } else {
                            d = a0Var.d();
                            if (d == null) {
                                throw new IllegalStateException("required phoneNumber is missing");
                            }
                            String str92 = str3;
                            m1Var2.j = j1Var2;
                            m1Var2.k = null;
                            m1Var2.l = null;
                            m1Var2.m = null;
                            m1Var2.n = i2;
                            m1Var2.q = 3;
                        }
                    }
                } else if (i == 1) {
                    int i5 = m1Var2.n;
                    String str10 = m1Var2.l;
                    bVar = m1Var2.k;
                    j1 j1Var3 = m1Var2.j;
                    try {
                        qgg.h0(obj);
                        i2 = i5;
                        j1Var2 = j1Var3;
                        str = str10;
                    } catch (com.yandex.passport.data.exceptions.h e) {
                        e = e;
                        j1Var2 = j1Var3;
                        u(e, j1Var2.c);
                        return Unit.a;
                    } catch (IOException e2) {
                        e = e2;
                        j1Var2 = j1Var3;
                        u(e, j1Var2.c);
                        return Unit.a;
                    } catch (JSONException e3) {
                        e = e3;
                        j1Var2 = j1Var3;
                        u(e, j1Var2.c);
                        return Unit.a;
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j1 j1Var4 = m1Var2.j;
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    int i6 = m1Var2.n;
                    String str11 = m1Var2.m;
                    str4 = m1Var2.l;
                    j1 j1Var5 = m1Var2.j;
                    try {
                        qgg.h0(obj);
                        str3 = str11;
                        i2 = i6;
                        j1Var2 = j1Var5;
                        Object obj42 = ((z7o) obj).a;
                        qgg.h0(obj42);
                        d = ((com.yandex.passport.data.models.n) obj42).a;
                        String str922 = str3;
                        m1Var2.j = j1Var2;
                        m1Var2.k = null;
                        m1Var2.l = null;
                        m1Var2.m = null;
                        m1Var2.n = i2;
                        m1Var2.q = 3;
                    } catch (com.yandex.passport.data.exceptions.h e4) {
                        e = e4;
                        j1Var2 = j1Var5;
                        u(e, j1Var2.c);
                        return Unit.a;
                    } catch (IOException e5) {
                        e = e5;
                        j1Var2 = j1Var5;
                        u(e, j1Var2.c);
                        return Unit.a;
                    } catch (JSONException e6) {
                        e = e6;
                        j1Var2 = j1Var5;
                        u(e, j1Var2.c);
                        return Unit.a;
                    }
                }
                Object obj5 = ((z7o) obj).a;
                qgg.h0(obj5);
                str2 = (String) obj5;
                f = bVar;
                if (str == null) {
                }
                str4 = str;
                a0Var = j1Var2.a;
                if (a0Var.m == null) {
                }
            }
        }
        m1Var = new m1(this, cg6Var);
        m1 m1Var22 = m1Var;
        Object obj6 = m1Var22.o;
        Object obj22 = nm6.a;
        i = m1Var22.q;
        if (i != 0) {
        }
        Object obj52 = ((z7o) obj6).a;
        qgg.h0(obj52);
        str2 = (String) obj52;
        f = bVar;
        if (str == null) {
        }
        str4 = str;
        a0Var = j1Var2.a;
        if (a0Var.m == null) {
        }
    }
}
