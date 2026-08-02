package com.yandex.passport.internal.ui.challenge.changecurrent;

import android.net.http.SslError;
import com.yandex.passport.internal.report.reporters.j0;
import com.yandex.passport.internal.ui.sloth.plusdevices.i0;
import com.yandex.passport.internal.ui.sloth.plusdevices.k0;
import com.yandex.passport.internal.ui.sloth.plusdevices.l0;
import com.yandex.passport.internal.ui.sloth.plusdevices.m0;
import com.yandex.passport.internal.usecase.f2;
import com.yandex.passport.internal.usecase.m2;
import com.yandex.passport.internal.usecase.o2;
import com.yandex.passport.internal.usecase.x0;
import com.yandex.passport.sloth.b1;
import com.yandex.passport.sloth.c1;
import com.yandex.passport.sloth.d1;
import com.yandex.passport.sloth.h0;
import com.yandex.passport.sloth.o0;
import com.yandex.passport.sloth.r0;
import com.yandex.passport.sloth.ui.a1;
import com.yandex.passport.sloth.ui.f1;
import com.yandex.passport.sloth.ui.g1;
import com.yandex.passport.sloth.ui.h1;
import com.yandex.passport.sloth.ui.i1;
import com.yandex.passport.sloth.ui.j1;
import com.yandex.passport.sloth.ui.k1;
import com.yandex.passport.sloth.ui.l1;
import com.yandex.passport.sloth.ui.m1;
import com.yandex.passport.sloth.ui.p1;
import com.yandex.passport.sloth.ui.q1;
import com.yandex.passport.sloth.ui.r1;
import com.yandex.passport.sloth.ui.s1;
import com.yandex.passport.sloth.ui.t1;
import com.yandex.passport.sloth.ui.u0;
import com.yandex.passport.sloth.ui.u1;
import com.yandex.passport.sloth.ui.v0;
import com.yandex.passport.sloth.ui.v1;
import com.yandex.passport.sloth.ui.w0;
import com.yandex.passport.sloth.ui.w1;
import com.yandex.passport.sloth.ui.x1;
import com.yandex.passport.sloth.ui.y0;
import defpackage.b6;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.e5b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t7o;
import defpackage.tah;
import defpackage.uah;
import defpackage.vz1;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes4.dex */
public final class y extends com.yandex.passport.common.mvi.h {
    public final /* synthetic */ int c = 0;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;

    public y(com.yandex.passport.internal.ui.sloth.plusdevices.l lVar, j0 j0Var, o2 o2Var, x0 x0Var) {
        lVar.getClass();
        j0Var.getClass();
        o2Var.getClass();
        x0Var.getClass();
        this.d = lVar;
        this.e = j0Var;
        this.f = o2Var;
        this.g = x0Var;
    }

    public static int j(Throwable th) {
        if (th instanceof com.yandex.passport.data.exceptions.e) {
            return 1111;
        }
        if ((th instanceof com.yandex.passport.common.exception.a) || (th instanceof com.yandex.passport.api.exception.b)) {
            return NetworkRequestException.EXPIRED_SIGNATURE;
        }
        return 1112;
    }

    public static com.yandex.passport.sloth.ui.error.e r(com.yandex.passport.sloth.ui.error.c cVar) {
        return new com.yandex.passport.sloth.ui.error.e(false, com.yandex.passport.sloth.ui.string.a.a, com.yandex.passport.sloth.ui.error.d.a, cVar, true);
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Object c(Object obj, com.yandex.passport.common.mvi.g gVar) {
        switch (this.c) {
            case 0:
                u uVar = (u) obj;
                Object k = k(uVar.a, uVar.b, gVar);
                if (k != nm6.a) {
                    break;
                }
                break;
            case 1:
                com.yandex.passport.internal.ui.sloth.plusdevices.x xVar = (com.yandex.passport.internal.ui.sloth.plusdevices.x) obj;
                if (!(xVar instanceof com.yandex.passport.internal.ui.sloth.plusdevices.u)) {
                    if (!(xVar instanceof com.yandex.passport.internal.ui.sloth.plusdevices.v)) {
                        if (!(xVar instanceof com.yandex.passport.internal.ui.sloth.plusdevices.w)) {
                            b6e.s();
                            break;
                        } else {
                            Object q = q(((com.yandex.passport.internal.ui.sloth.plusdevices.w) xVar).a, gVar);
                            if (q != nm6.a) {
                                break;
                            }
                        }
                    } else {
                        int i = ((com.yandex.passport.internal.ui.sloth.plusdevices.v) xVar).a;
                        if (i == -1) {
                            e(new com.yandex.passport.internal.ui.sloth.plusdevices.w(false));
                        } else {
                            a(new com.yandex.passport.internal.ui.sloth.plusdevices.a0(i));
                        }
                        break;
                    }
                } else {
                    Object p = p(gVar);
                    if (p != nm6.a) {
                        break;
                    }
                }
                break;
            default:
                com.yandex.passport.sloth.ui.e0 e0Var = (com.yandex.passport.sloth.ui.e0) obj;
                if (!(e0Var instanceof com.yandex.passport.sloth.ui.c0)) {
                    if (!(e0Var instanceof com.yandex.passport.sloth.ui.d0)) {
                        b6e.s();
                        break;
                    } else {
                        String str = ((com.yandex.passport.sloth.ui.d0) e0Var).a;
                        if (!StringsKt.U(str)) {
                            g(new i1(str));
                        }
                        break;
                    }
                } else {
                    Object n = n(((com.yandex.passport.sloth.ui.c0) e0Var).a, gVar);
                    if (n != nm6.a) {
                        break;
                    }
                }
                break;
        }
        return null;
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Object d(Object obj, com.yandex.passport.common.mvi.g gVar) {
        switch (this.c) {
            case 0:
                s sVar = (s) obj;
                if (sVar instanceof s) {
                    Object o = o(sVar.a, gVar);
                    return o == nm6.a ? o : Unit.a;
                }
                b6e.s();
                return null;
            case 1:
                m0 m0Var = (m0) obj;
                com.yandex.passport.internal.ui.sloth.plusdevices.l lVar = (com.yandex.passport.internal.ui.sloth.plusdevices.l) this.d;
                j0 j0Var = (j0) this.e;
                boolean equals = m0Var.equals(i0.a);
                com.yandex.passport.internal.ui.sloth.plusdevices.f0 f0Var = com.yandex.passport.internal.ui.sloth.plusdevices.f0.a;
                if (equals) {
                    g(f0Var);
                } else if (m0Var instanceof com.yandex.passport.internal.ui.sloth.plusdevices.j0) {
                    h0 h0Var = ((com.yandex.passport.internal.ui.sloth.plusdevices.j0) m0Var).a;
                    if (h0Var instanceof com.yandex.passport.sloth.a0) {
                        com.yandex.passport.sloth.a0 a0Var = (com.yandex.passport.sloth.a0) h0Var;
                        Throwable th = a0Var.a;
                        if (!com.yandex.plus.core.locale.b.q(th)) {
                            j0Var.u(lVar.a, lVar.c, lVar.d, a0Var.b);
                            e(new com.yandex.passport.internal.ui.sloth.plusdevices.v(th instanceof com.yandex.passport.common.exception.a ? NetworkRequestException.EXPIRED_SIGNATURE : 1112));
                        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Internet connection is lost in Sloth.", 8);
                        }
                    }
                } else if (m0Var instanceof k0) {
                    int ordinal = ((k0) m0Var).a.ordinal();
                    if (ordinal == 0 || ordinal == 1) {
                        g(f0Var);
                    } else if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                } else {
                    if (!(m0Var instanceof l0)) {
                        b6e.s();
                        return null;
                    }
                    b1 b1Var = ((l0) m0Var).a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New event: " + b1Var, 8);
                    }
                    if (b1Var instanceof com.yandex.passport.sloth.b) {
                        j0Var.x(lVar.a, lVar.c, lVar.d, ((com.yandex.passport.sloth.b) b1Var).a);
                        e(new com.yandex.passport.internal.ui.sloth.plusdevices.v(-1));
                    }
                }
                return Unit.a;
            default:
                return i((x1) obj, gVar);
        }
    }

    @Override // com.yandex.passport.common.mvi.h
    public final Unit f(Throwable th) {
        switch (this.c) {
            case 0:
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "onUnhandledError: " + th, 8);
                }
                a(new a0(th));
                break;
            case 1:
                a(new com.yandex.passport.internal.ui.sloth.plusdevices.a0(j(th)));
                break;
            default:
                a(new com.yandex.passport.sloth.ui.j0(r(com.yandex.passport.sloth.ui.error.a.a)));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        if (r2 == r5) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        if (((com.yandex.passport.sloth.c1) r3).f(r1, r4) == r5) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x020c, code lost:
    
        if (kotlin.Unit.a == r5) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(x1 x1Var, cg6 cg6Var) {
        com.yandex.passport.sloth.ui.f0 f0Var;
        int i;
        String str;
        Map map;
        x1 x1Var2 = x1Var;
        a1 a1Var = (a1) this.d;
        if (cg6Var instanceof com.yandex.passport.sloth.ui.f0) {
            f0Var = (com.yandex.passport.sloth.ui.f0) cg6Var;
            int i2 = f0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = f0Var.k;
                nm6 nm6Var = nm6.a;
                i = f0Var.m;
                int i3 = 3;
                Object[] objArr = 0;
                if (i != 0) {
                    qgg.h0(obj);
                    if (x1Var2 instanceof r1) {
                        r1 r1Var = (r1) x1Var2;
                        String str2 = r1Var.a;
                        f0Var.j = r1Var;
                        f0Var.m = 1;
                        obj = ((c1) a1Var).e(str2, f0Var);
                    } else if (x1Var2 instanceof w1) {
                        y0 y0Var = ((w1) x1Var2).a;
                        f0Var.j = null;
                        f0Var.m = 2;
                    } else if (x1Var2 instanceof s1) {
                        com.yandex.passport.internal.sloth.performers.usermenu.c cVar = (com.yandex.passport.internal.sloth.performers.usermenu.c) this.g;
                        if (cVar != null) {
                            cVar.invoke(((s1) x1Var2).a);
                            this.g = null;
                        }
                    } else if (x1Var2 instanceof t1) {
                        com.yandex.passport.sloth.ui.webview.f fVar = ((t1) x1Var2).a;
                        f0Var.j = null;
                        f0Var.m = 3;
                        com.yandex.passport.sloth.ui.webview.c cVar2 = com.yandex.passport.sloth.ui.webview.c.c;
                        com.yandex.passport.sloth.ui.webview.c cVar3 = com.yandex.passport.sloth.ui.webview.c.b;
                        com.yandex.passport.sloth.ui.webview.c cVar4 = com.yandex.passport.sloth.ui.webview.c.a;
                        if (Intrinsics.d(fVar, cVar4)) {
                            a(new com.yandex.passport.sloth.ui.j0(new com.yandex.passport.sloth.ui.error.e(false, com.yandex.passport.sloth.ui.string.a.b, com.yandex.passport.sloth.ui.error.d.a, new com.yandex.passport.sloth.ui.error.b(new com.yandex.passport.sloth.ui.x0()), true)));
                        } else if (Intrinsics.d(fVar, cVar3)) {
                            a(new com.yandex.passport.sloth.ui.j0(r(new com.yandex.passport.sloth.ui.error.b(new com.yandex.passport.sloth.ui.x0()))));
                        } else if (Intrinsics.d(fVar, cVar2)) {
                            a(new com.yandex.passport.sloth.ui.j0(r(new com.yandex.passport.sloth.ui.error.b(u0.b))));
                        } else if (fVar instanceof com.yandex.passport.sloth.ui.webview.d) {
                            com.yandex.passport.sloth.ui.webview.d dVar = (com.yandex.passport.sloth.ui.webview.d) fVar;
                            a(new com.yandex.passport.sloth.ui.j0(r(new com.yandex.passport.sloth.ui.error.b(new v0(dVar.a, dVar.b)))));
                        } else {
                            boolean z = fVar instanceof com.yandex.passport.sloth.ui.webview.b;
                            com.yandex.passport.sloth.ui.error.a aVar = com.yandex.passport.sloth.ui.error.a.a;
                            if (z) {
                                a(new com.yandex.passport.sloth.ui.j0(new com.yandex.passport.sloth.ui.error.e(true, com.yandex.passport.sloth.ui.string.a.c, com.yandex.passport.sloth.ui.error.d.b, aVar, false)));
                            } else if (fVar instanceof com.yandex.passport.sloth.ui.webview.e) {
                                r(aVar);
                            } else {
                                if (!(fVar instanceof com.yandex.passport.sloth.ui.webview.a)) {
                                    b6e.s();
                                    return null;
                                }
                                com.yandex.passport.sloth.ui.string.a aVar2 = com.yandex.passport.sloth.ui.string.a.a;
                                com.yandex.passport.sloth.ui.error.d dVar2 = com.yandex.passport.sloth.ui.error.d.a;
                            }
                        }
                        com.yandex.passport.sloth.ui.g gVar = (com.yandex.passport.sloth.ui.g) this.e;
                        if (Intrinsics.d(fVar, com.yandex.passport.sloth.ui.webview.b.a)) {
                            str = "Error.Connection";
                        } else if (Intrinsics.d(fVar, cVar4)) {
                            str = "Error.Http4xx";
                        } else if (Intrinsics.d(fVar, cVar3)) {
                            str = "Error.Http5xx";
                        } else if (Intrinsics.d(fVar, cVar2)) {
                            str = "Error.OnRenderProcessGone";
                        } else if (Intrinsics.d(fVar, com.yandex.passport.sloth.ui.webview.a.a)) {
                            str = "Error.BlockedUrl";
                        } else if (fVar instanceof com.yandex.passport.sloth.ui.webview.d) {
                            str = toString();
                        } else {
                            if (!(fVar instanceof com.yandex.passport.sloth.ui.webview.e)) {
                                b6e.s();
                                return null;
                            }
                            str = "Error.Ssl";
                        }
                        if (fVar instanceof com.yandex.passport.sloth.ui.webview.e) {
                            o0 o0Var = o0.d;
                            SslError sslError = ((com.yandex.passport.sloth.ui.webview.e) fVar).a;
                            o0Var.getClass();
                            map = b6.M(sslError);
                        } else {
                            map = e5b.a;
                            map.getClass();
                        }
                        str.getClass();
                        r0 r0Var = r0.UI_ERROR;
                        LinkedHashMap i4 = uah.i(tah.b(new Pair("ui_error", str)), map);
                        com.yandex.passport.internal.sloth.o oVar = (com.yandex.passport.internal.sloth.o) ((com.yandex.passport.internal.ui.sloth.c) gVar).a;
                        oVar.getClass();
                        if (oVar.a()) {
                            r0Var.getClass();
                            oVar.a.a("sloth.reportWebAmEvent.".concat("sloth_ui_error"), i4);
                        }
                    } else {
                        boolean z2 = x1Var2 instanceof u1;
                        com.yandex.passport.sloth.ui.error.e eVar = com.yandex.passport.sloth.ui.error.e.f;
                        if (z2) {
                            a(new com.yandex.passport.sloth.ui.j0(eVar));
                        } else if (x1Var2 instanceof v1) {
                            com.yandex.passport.sloth.ui.error.e eVar2 = ((p1) h()).b;
                            if ((eVar2 != null ? eVar2.b : null) == null) {
                                a(com.yandex.passport.sloth.ui.i0.a);
                            }
                        } else {
                            if (!(x1Var2 instanceof q1)) {
                                b6e.s();
                                return null;
                            }
                            p1 p1Var = (p1) h();
                            com.yandex.passport.sloth.ui.error.e eVar3 = p1Var.b;
                            if ((eVar3 != null ? eVar3.b : null) != com.yandex.passport.sloth.ui.string.a.c) {
                                return Unit.a;
                            }
                            if (p1Var.a) {
                                a(new com.yandex.passport.sloth.ui.j0(null));
                                g(k1.a);
                            } else {
                                a(new com.yandex.passport.sloth.ui.j0(eVar));
                                d1 d1Var = ((c1) a1Var).b;
                                x97.y(d1Var.e, null, null, new com.yandex.passport.internal.ui.social.i(d1Var, objArr == true ? 1 : 0, i3), 3);
                            }
                        }
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x1Var2 = f0Var.j;
                qgg.h0(obj);
                String str3 = (String) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, vz1.s(new StringBuilder("performJsCommand("), ((r1) x1Var2).a, ") resulted in ", str3), 8);
                }
                if (str3 != null) {
                    g(new g1(str3));
                }
                return Unit.a;
            }
        }
        f0Var = new com.yandex.passport.sloth.ui.f0(this, cg6Var);
        Object obj2 = f0Var.k;
        nm6 nm6Var2 = nm6.a;
        i = f0Var.m;
        int i32 = 3;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x009e, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(com.yandex.passport.common.core.f fVar, com.yandex.passport.common.ui.a aVar, cg6 cg6Var) {
        v vVar;
        int i;
        y yVar;
        y yVar2;
        if (cg6Var instanceof v) {
            vVar = (v) cg6Var;
            int i2 = vVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.o = i2 - Integer.MIN_VALUE;
                Object obj = vVar.m;
                nm6 nm6Var = nm6.a;
                i = vVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.l a = ((com.yandex.passport.internal.account.a) this.f).a();
                    com.yandex.passport.common.core.f fVar2 = a != null ? a.b : null;
                    if (Intrinsics.d(fVar2, fVar)) {
                        fVar2 = null;
                    }
                    if (fVar2 == null) {
                        vVar.j = null;
                        vVar.k = this;
                        vVar.o = 1;
                        obj = m(fVar, vVar);
                        if (obj != nm6Var) {
                            yVar = this;
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            yVar.getClass();
                            yVar.a(new b0(booleanValue));
                            return Unit.a;
                        }
                    } else {
                        a(new z(new p(fVar, fVar2)));
                        com.yandex.passport.internal.ui.challenge.m mVar = (com.yandex.passport.internal.ui.challenge.m) this.d;
                        vVar.j = fVar;
                        vVar.o = 2;
                        obj = mVar.a(fVar2, aVar, vVar);
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    yVar = vVar.k;
                    qgg.h0(obj);
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    yVar.getClass();
                    yVar.a(new b0(booleanValue2));
                    return Unit.a;
                }
                if (i != 2) {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yVar2 = vVar.l;
                    qgg.h0(obj);
                    boolean booleanValue3 = ((Boolean) obj).booleanValue();
                    yVar2.getClass();
                    yVar2.a(new b0(booleanValue3));
                    return Unit.a;
                }
                fVar = vVar.j;
                qgg.h0(obj);
                com.yandex.passport.internal.ui.challenge.j jVar = (com.yandex.passport.internal.ui.challenge.j) obj;
                if (jVar instanceof com.yandex.passport.internal.ui.challenge.g) {
                    a(new b0(false));
                } else {
                    if (jVar instanceof com.yandex.passport.internal.ui.challenge.h) {
                        vVar.j = null;
                        vVar.k = null;
                        vVar.l = this;
                        vVar.o = 3;
                        obj = m(fVar, vVar);
                        if (obj != nm6Var) {
                            yVar2 = this;
                            boolean booleanValue32 = ((Boolean) obj).booleanValue();
                            yVar2.getClass();
                            yVar2.a(new b0(booleanValue32));
                        }
                        return nm6Var;
                    }
                    if (!(jVar instanceof com.yandex.passport.internal.ui.challenge.i)) {
                        b6e.s();
                        return null;
                    }
                    com.yandex.passport.internal.ui.challenge.c0 c0Var = ((com.yandex.passport.internal.ui.challenge.i) jVar).a;
                    this.g = c0Var;
                    a(new d0(new com.yandex.passport.internal.ui.challenge.webview.i(c0Var.c, c0Var.d, c0Var.e)));
                }
                return Unit.a;
            }
        }
        vVar = new v(this, cg6Var);
        Object obj2 = vVar.m;
        nm6 nm6Var2 = nm6.a;
        i = vVar.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(com.yandex.passport.sloth.p pVar, cg6 cg6Var) {
        com.yandex.passport.sloth.ui.g0 g0Var;
        int i;
        String str;
        com.yandex.passport.common.core.f fVar;
        Object d;
        com.yandex.passport.sloth.p pVar2;
        com.yandex.passport.sloth.p pVar3;
        com.yandex.passport.common.core.f fVar2;
        Throwable a;
        Map map;
        if (cg6Var instanceof com.yandex.passport.sloth.ui.g0) {
            g0Var = (com.yandex.passport.sloth.ui.g0) cg6Var;
            int i2 = g0Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g0Var.o = i2 - Integer.MIN_VALUE;
                com.yandex.passport.sloth.ui.g0 g0Var2 = g0Var;
                Object obj = g0Var2.m;
                nm6 nm6Var = nm6.a;
                i = g0Var2.o;
                if (i != 0) {
                    qgg.h0(obj);
                    Object obj2 = ((c1) ((a1) this.d)).a;
                    com.yandex.passport.common.core.f uid = obj2 instanceof com.yandex.passport.sloth.data.q ? ((com.yandex.passport.sloth.data.q) obj2).getUid() : null;
                    com.yandex.passport.common.core.c cVar = ((obj2 instanceof com.yandex.passport.sloth.data.t) || (obj2 instanceof com.yandex.passport.sloth.data.c0)) ? com.yandex.passport.common.core.c.b : com.yandex.passport.common.core.c.a;
                    if (!pVar.b || uid == null) {
                        str = pVar.a;
                        fVar = uid;
                        g(new j1(str, pVar, fVar));
                        return Unit.a;
                    }
                    com.yandex.passport.sloth.dependencies.i iVar = (com.yandex.passport.sloth.dependencies.i) this.f;
                    String str2 = pVar.a;
                    g0Var2.j = pVar;
                    g0Var2.k = pVar;
                    g0Var2.l = uid;
                    g0Var2.o = 1;
                    com.yandex.passport.common.core.f fVar3 = uid;
                    d = ((com.yandex.passport.internal.sloth.w) iVar).d(fVar3, null, str2, cVar, g0Var2);
                    if (d == nm6Var) {
                        return nm6Var;
                    }
                    pVar2 = pVar;
                    pVar3 = pVar2;
                    fVar2 = fVar3;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar2 = g0Var2.l;
                    pVar2 = g0Var2.k;
                    pVar3 = g0Var2.j;
                    qgg.h0(obj);
                    d = ((z7o) obj).a;
                }
                a = z7o.a(d);
                if (a != null) {
                    com.yandex.passport.sloth.ui.g gVar = (com.yandex.passport.sloth.ui.g) this.e;
                    String valueOf = String.valueOf(a.getMessage());
                    Pair[] pairArr = {new Pair("uid", String.valueOf(fVar2.b)), new Pair("place", "getAuthorizationUrl in openExternalUrl")};
                    r0 r0Var = r0.ERROR;
                    Map b = tah.b(new Pair("ui_error", valueOf));
                    b.getClass();
                    if (b.isEmpty()) {
                        map = uah.p(pairArr);
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
                        uah.k(linkedHashMap, pairArr);
                        map = linkedHashMap;
                    }
                    com.yandex.passport.internal.sloth.o oVar = (com.yandex.passport.internal.sloth.o) ((com.yandex.passport.internal.ui.sloth.c) gVar).a;
                    oVar.getClass();
                    if (oVar.a()) {
                        oVar.a.a("sloth.reportWebAmEvent.".concat(r0Var.a), map);
                    }
                }
                if (d instanceof t7o) {
                    d = null;
                }
                com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) d;
                str = bVar != null ? bVar.a : null;
                if (str == null) {
                    str = pVar2.a;
                }
                com.yandex.passport.sloth.p pVar4 = pVar3;
                fVar = fVar2;
                pVar = pVar4;
                g(new j1(str, pVar, fVar));
                return Unit.a;
            }
        }
        g0Var = new com.yandex.passport.sloth.ui.g0(this, cg6Var);
        com.yandex.passport.sloth.ui.g0 g0Var22 = g0Var;
        Object obj3 = g0Var22.m;
        nm6 nm6Var2 = nm6.a;
        i = g0Var22.o;
        if (i != 0) {
        }
        a = z7o.a(d);
        if (a != null) {
        }
        if (d instanceof t7o) {
        }
        com.yandex.passport.common.url.b bVar2 = (com.yandex.passport.common.url.b) d;
        if (bVar2 != null) {
        }
        if (str == null) {
        }
        com.yandex.passport.sloth.p pVar42 = pVar3;
        fVar = fVar2;
        pVar = pVar42;
        g(new j1(str, pVar, fVar));
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(com.yandex.passport.common.core.f fVar, cg6 cg6Var) {
        w wVar;
        int i;
        Throwable a;
        if (cg6Var instanceof w) {
            wVar = (w) cg6Var;
            int i2 = wVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wVar.m = i2 - Integer.MIN_VALUE;
                Object obj = wVar.k;
                nm6 nm6Var = nm6.a;
                i = wVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    f2 f2Var = (f2) this.e;
                    com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(bVar, null, "Executing setCurrentAccountUseCase", 10);
                    }
                    wVar.j = fVar;
                    wVar.m = 1;
                    obj = f2Var.g(fVar, wVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar = wVar.j;
                    qgg.h0(obj);
                }
                Object obj2 = ((z7o) obj).a;
                a = z7o.a(obj2);
                if (a != null) {
                    return Boolean.TRUE;
                }
                com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error performing challenged action for uid: " + fVar, a);
                }
                return Boolean.FALSE;
            }
        }
        wVar = new w(this, cg6Var);
        Object obj3 = wVar.k;
        nm6 nm6Var2 = nm6.a;
        i = wVar.m;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        a = z7o.a(obj22);
        if (a != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        if (((com.yandex.passport.sloth.c1) r0).f(r8, r1) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bb, code lost:
    
        if (((com.yandex.passport.sloth.c1) r0).f(r8, r1) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0123, code lost:
    
        if (l(r3, r1) == r2) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(com.yandex.passport.sloth.u uVar, cg6 cg6Var) {
        com.yandex.passport.sloth.ui.h0 h0Var;
        int i;
        a1 a1Var = (a1) this.d;
        if (cg6Var instanceof com.yandex.passport.sloth.ui.h0) {
            h0Var = (com.yandex.passport.sloth.ui.h0) cg6Var;
            int i2 = h0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = h0Var.k;
                Object obj2 = nm6.a;
                i = h0Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (uVar instanceof com.yandex.passport.sloth.s) {
                        g(l1.a);
                    } else if (uVar instanceof com.yandex.passport.sloth.n) {
                        g(f1.a);
                    } else if (uVar instanceof com.yandex.passport.sloth.t) {
                        this.g = ((com.yandex.passport.sloth.t) uVar).a;
                        g(m1.a);
                    } else {
                        if (uVar instanceof com.yandex.passport.sloth.o) {
                            com.yandex.passport.sloth.o oVar = (com.yandex.passport.sloth.o) uVar;
                            if (!oVar.b) {
                                w0 w0Var = new w0(true);
                                h0Var.j = null;
                                h0Var.m = 2;
                            } else if (oVar.a) {
                                a(new com.yandex.passport.sloth.ui.j0(r(new com.yandex.passport.sloth.ui.error.b(new w0(false)))));
                            } else {
                                w0 w0Var2 = new w0(false);
                                h0Var.j = null;
                                h0Var.m = 1;
                            }
                            return obj2;
                        }
                        if (uVar instanceof com.yandex.passport.sloth.q) {
                            if (((com.yandex.passport.sloth.q) uVar).a) {
                                com.yandex.passport.sloth.ui.error.e eVar = ((p1) h()).b;
                                if ((eVar != null ? eVar.b : null) == null) {
                                    a(com.yandex.passport.sloth.ui.i0.a);
                                }
                            }
                        } else if (uVar instanceof com.yandex.passport.sloth.p) {
                            com.yandex.passport.sloth.ui.g gVar = (com.yandex.passport.sloth.ui.g) this.e;
                            com.yandex.passport.sloth.p pVar = (com.yandex.passport.sloth.p) uVar;
                            if ((((c1) a1Var).a instanceof com.yandex.passport.sloth.data.d0) && !pVar.c) {
                                Map n = dfi.n("url", pVar.a);
                                com.yandex.passport.internal.ui.sloth.c cVar = (com.yandex.passport.internal.ui.sloth.c) gVar;
                                cVar.getClass();
                                n.getClass();
                                com.yandex.passport.internal.sloth.o oVar2 = (com.yandex.passport.internal.sloth.o) cVar.a;
                                oVar2.getClass();
                                if (oVar2.a()) {
                                    oVar2.a.a("pay.processing_open_browser_without_redirect", n);
                                }
                            }
                            h0Var.j = pVar;
                            h0Var.m = 3;
                        } else if (!(uVar instanceof com.yandex.passport.sloth.r)) {
                            b6e.s();
                            return null;
                        }
                    }
                } else {
                    if (i == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uVar = h0Var.j;
                    qgg.h0(obj);
                    if (((com.yandex.passport.sloth.p) uVar).c) {
                        g(h1.a);
                    }
                }
                return Unit.a;
            }
        }
        h0Var = new com.yandex.passport.sloth.ui.h0(this, cg6Var);
        Object obj3 = h0Var.k;
        Object obj22 = nm6.a;
        i = h0Var.m;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(String str, cg6 cg6Var) {
        x xVar;
        Object obj;
        int i;
        p pVar;
        y yVar;
        if (cg6Var instanceof x) {
            xVar = (x) cg6Var;
            int i2 = xVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xVar.n = i2 - Integer.MIN_VALUE;
                obj = xVar.l;
                nm6 nm6Var = nm6.a;
                i = xVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    a(new d0(null));
                    p pVar2 = ((r) h()).a;
                    if (pVar2 == null) {
                        return Unit.a;
                    }
                    com.yandex.passport.internal.ui.challenge.c0 c0Var = (com.yandex.passport.internal.ui.challenge.c0) this.g;
                    if (c0Var == null) {
                        return Unit.a;
                    }
                    com.yandex.passport.internal.ui.challenge.m mVar = (com.yandex.passport.internal.ui.challenge.m) this.d;
                    com.yandex.passport.common.core.f fVar = pVar2.b;
                    xVar.j = pVar2;
                    xVar.n = 1;
                    Object b = mVar.b(str, fVar, c0Var, xVar);
                    if (b != nm6Var) {
                        obj = b;
                        pVar = pVar2;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yVar = xVar.k;
                    qgg.h0(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    yVar.getClass();
                    yVar.a(new b0(booleanValue));
                    return Unit.a;
                }
                pVar = xVar.j;
                qgg.h0(obj);
                if (((com.yandex.passport.internal.ui.challenge.j) obj) instanceof com.yandex.passport.internal.ui.challenge.h) {
                    a(new b0(false));
                    return Unit.a;
                }
                com.yandex.passport.common.core.f fVar2 = pVar.a;
                xVar.j = null;
                xVar.k = this;
                xVar.n = 2;
                obj = m(fVar2, xVar);
                if (obj != nm6Var) {
                    yVar = this;
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    yVar.getClass();
                    yVar.a(new b0(booleanValue2));
                    return Unit.a;
                }
                return nm6Var;
            }
        }
        xVar = new x(this, cg6Var);
        obj = xVar.l;
        nm6 nm6Var2 = nm6.a;
        i = xVar.n;
        if (i != 0) {
        }
        if (((com.yandex.passport.internal.ui.challenge.j) obj) instanceof com.yandex.passport.internal.ui.challenge.h) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(cg6 cg6Var) {
        com.yandex.passport.internal.ui.sloth.plusdevices.y yVar;
        int i;
        Object obj;
        Throwable a;
        com.yandex.passport.internal.ui.sloth.plusdevices.l lVar = (com.yandex.passport.internal.ui.sloth.plusdevices.l) this.d;
        if (cg6Var instanceof com.yandex.passport.internal.ui.sloth.plusdevices.y) {
            yVar = (com.yandex.passport.internal.ui.sloth.plusdevices.y) cg6Var;
            int i2 = yVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = yVar.j;
                nm6 nm6Var = nm6.a;
                i = yVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    x0 x0Var = (x0) this.g;
                    com.yandex.passport.common.core.f fVar = lVar.a;
                    yVar.l = 1;
                    obj2 = x0Var.g(fVar, yVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    a(new com.yandex.passport.internal.ui.sloth.plusdevices.b0(new com.yandex.passport.sloth.data.m(new com.yandex.passport.sloth.data.c0(lVar.a, ((Number) obj).longValue(), com.yandex.plus.core.network.api.utils.a.T(lVar.b), lVar.c, lVar.d), lVar.a.a, new com.yandex.passport.common.properties.a(15, false, false), 4)));
                }
                a = z7o.a(obj);
                if (a != null) {
                    a(new com.yandex.passport.internal.ui.sloth.plusdevices.a0(j(a)));
                }
                return Unit.a;
            }
        }
        yVar = new com.yandex.passport.internal.ui.sloth.plusdevices.y(this, cg6Var);
        Object obj22 = yVar.j;
        nm6 nm6Var2 = nm6.a;
        i = yVar.l;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        a = z7o.a(obj);
        if (a != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(boolean z, cg6 cg6Var) {
        com.yandex.passport.internal.ui.sloth.plusdevices.z zVar;
        int i;
        Object obj;
        Object obj2;
        Throwable a;
        if (cg6Var instanceof com.yandex.passport.internal.ui.sloth.plusdevices.z) {
            zVar = (com.yandex.passport.internal.ui.sloth.plusdevices.z) cg6Var;
            int i2 = zVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zVar.n = i2 - Integer.MIN_VALUE;
                Object obj3 = zVar.l;
                Object obj4 = nm6.a;
                i = zVar.n;
                if (i != 0) {
                    qgg.h0(obj3);
                    o2 o2Var = (o2) this.f;
                    com.yandex.passport.internal.ui.sloth.plusdevices.l lVar = (com.yandex.passport.internal.ui.sloth.plusdevices.l) this.d;
                    m2 m2Var = new m2(lVar.a, lVar.c, lVar.d, "managing_plus_devices");
                    zVar.j = z;
                    zVar.n = 1;
                    obj3 = o2Var.g(m2Var, zVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = zVar.k;
                        qgg.h0(obj3);
                        obj = obj2;
                        a = z7o.a(obj);
                        if (a != null) {
                            a(new com.yandex.passport.internal.ui.sloth.plusdevices.a0(j(a)));
                        }
                        return Unit.a;
                    }
                    z = zVar.j;
                    qgg.h0(obj3);
                }
                obj = ((z7o) obj3).a;
                if (!(obj instanceof t7o)) {
                    if (((Boolean) obj).booleanValue()) {
                        a(new com.yandex.passport.internal.ui.sloth.plusdevices.a0(-1));
                    } else {
                        if (z) {
                            zVar.k = obj;
                            zVar.j = z;
                            zVar.n = 2;
                            if (p(zVar) != obj4) {
                                obj2 = obj;
                                obj = obj2;
                            }
                            return obj4;
                        }
                        a(new com.yandex.passport.internal.ui.sloth.plusdevices.a0(1112));
                    }
                }
                a = z7o.a(obj);
                if (a != null) {
                }
                return Unit.a;
            }
        }
        zVar = new com.yandex.passport.internal.ui.sloth.plusdevices.z(this, cg6Var);
        Object obj32 = zVar.l;
        Object obj42 = nm6.a;
        i = zVar.n;
        if (i != 0) {
        }
        obj = ((z7o) obj32).a;
        if (!(obj instanceof t7o)) {
        }
        a = z7o.a(obj);
        if (a != null) {
        }
        return Unit.a;
    }

    public y(com.yandex.passport.internal.ui.challenge.m mVar, f2 f2Var, com.yandex.passport.internal.account.a aVar) {
        mVar.getClass();
        f2Var.getClass();
        aVar.getClass();
        this.d = mVar;
        this.e = f2Var;
        this.f = aVar;
    }

    public y(a1 a1Var, com.yandex.passport.sloth.ui.g gVar, com.yandex.passport.sloth.dependencies.i iVar) {
        this.d = a1Var;
        this.e = gVar;
        this.f = iVar;
    }
}
