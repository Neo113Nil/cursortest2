package com.yandex.passport.internal.sloth;

import com.yandex.passport.internal.usecase.c0;
import com.yandex.passport.internal.usecase.e0;
import com.yandex.passport.internal.usecase.ui.i0;
import com.yandex.passport.internal.usecase.ui.j0;
import com.yandex.passport.internal.usecase.ui.t0;
import com.yandex.passport.internal.usecase.ui.u0;
import com.yandex.passport.internal.usecase.ui.w0;
import com.yandex.passport.internal.usecase.ui.x0;
import com.yandex.passport.internal.usecase.ui.y0;
import com.yandex.passport.sloth.data.g0;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import defpackage.z7o;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public final class w implements com.yandex.passport.sloth.dependencies.i {
    public final e0 a;
    public final com.yandex.passport.internal.usecase.ui.g b;
    public final y0 c;
    public final t0 d;
    public final w0 e;
    public final j0 f;
    public final com.yandex.passport.internal.network.r g;

    public w(e0 e0Var, com.yandex.passport.internal.usecase.ui.g gVar, y0 y0Var, t0 t0Var, w0 w0Var, j0 j0Var, com.yandex.passport.internal.network.r rVar) {
        e0Var.getClass();
        gVar.getClass();
        y0Var.getClass();
        t0Var.getClass();
        w0Var.getClass();
        j0Var.getClass();
        rVar.getClass();
        this.a = e0Var;
        this.b = gVar;
        this.c = y0Var;
        this.d = t0Var;
        this.e = w0Var;
        this.f = j0Var;
        this.g = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var, com.yandex.passport.common.core.f fVar, String str) {
        q qVar;
        int i;
        if (cg6Var instanceof q) {
            qVar = (q) cg6Var;
            int i2 = qVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.l = i2 - Integer.MIN_VALUE;
                Object obj = qVar.j;
                nm6 nm6Var = nm6.a;
                i = qVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    x0 x0Var = new x0(fVar, str);
                    qVar.l = 1;
                    obj = this.c.g(x0Var, qVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        qVar = new q(this, cg6Var);
        Object obj2 = qVar.j;
        nm6 nm6Var2 = nm6.a;
        i = qVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var, com.yandex.passport.common.core.f fVar, String str) {
        r rVar;
        int i;
        if (cg6Var instanceof r) {
            rVar = (r) cg6Var;
            int i2 = rVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.l = i2 - Integer.MIN_VALUE;
                Object obj = rVar.j;
                nm6 nm6Var = nm6.a;
                i = rVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.usecase.ui.f fVar2 = new com.yandex.passport.internal.usecase.ui.f(fVar, str);
                    rVar.l = 1;
                    obj = this.b.g(fVar2, rVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        rVar = new r(this, cg6Var);
        Object obj2 = rVar.j;
        nm6 nm6Var2 = nm6.a;
        i = rVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.yandex.passport.sloth.data.y yVar, cg6 cg6Var) {
        s sVar;
        int i;
        if (cg6Var instanceof s) {
            sVar = (s) cg6Var;
            int i2 = sVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.l = i2 - Integer.MIN_VALUE;
                Object obj = sVar.j;
                nm6 nm6Var = nm6.a;
                i = sVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    u0 u0Var = new u0(yVar.f, yVar.b, yVar.c, yVar.e, yVar.g, yVar.h, yVar.i);
                    sVar.l = 1;
                    obj = this.d.g(u0Var, sVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        sVar = new s(this, cg6Var);
        Object obj2 = sVar.j;
        nm6 nm6Var2 = nm6.a;
        i = sVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(com.yandex.passport.common.core.f fVar, Locale locale, String str, com.yandex.passport.common.core.c cVar, cg6 cg6Var) {
        t tVar;
        int i;
        if (cg6Var instanceof t) {
            tVar = (t) cg6Var;
            int i2 = tVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.l = i2 - Integer.MIN_VALUE;
                Object obj = tVar.j;
                nm6 nm6Var = nm6.a;
                i = tVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    c0 c0Var = new c0(fVar, locale, str, (String) null, (Map) null, cVar, 56);
                    tVar.l = 1;
                    obj = this.a.g(c0Var, tVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        tVar = new t(this, cg6Var);
        Object obj2 = tVar.j;
        nm6 nm6Var2 = nm6.a;
        i = tVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(g0 g0Var, cg6 cg6Var) {
        u uVar;
        int i;
        if (cg6Var instanceof u) {
            uVar = (u) cg6Var;
            int i2 = uVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.l = i2 - Integer.MIN_VALUE;
                Object obj = uVar.j;
                nm6 nm6Var = nm6.a;
                i = uVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    i0 i0Var = new i0(g0Var.b, g0Var.c, g0Var.d, g0Var.e);
                    uVar.l = 1;
                    obj = this.f.g(i0Var, uVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        uVar = new u(this, cg6Var);
        Object obj2 = uVar.j;
        nm6 nm6Var2 = nm6.a;
        i = uVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(com.yandex.passport.sloth.data.y yVar, cg6 cg6Var) {
        v vVar;
        int i;
        if (cg6Var instanceof v) {
            vVar = (v) cg6Var;
            int i2 = vVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.l = i2 - Integer.MIN_VALUE;
                Object obj = vVar.j;
                nm6 nm6Var = nm6.a;
                i = vVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    u0 u0Var = new u0(yVar.f, yVar.b, yVar.c, yVar.e, yVar.g, yVar.h, yVar.i);
                    vVar.l = 1;
                    obj = this.e.g(u0Var, vVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        vVar = new v(this, cg6Var);
        Object obj2 = vVar.j;
        nm6 nm6Var2 = nm6.a;
        i = vVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }
}
