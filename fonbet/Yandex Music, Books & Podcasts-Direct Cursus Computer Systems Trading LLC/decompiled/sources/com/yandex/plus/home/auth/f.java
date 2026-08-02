package com.yandex.plus.home.auth;

import com.yandex.plus.adapter.auth.api.g;
import com.yandex.plus.domain.auth.impl.i;
import defpackage.cg6;
import defpackage.fkn;
import defpackage.msa;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.qgg;
import defpackage.ssa;
import defpackage.tyf;
import defpackage.xq0;
import defpackage.yd5;
import defpackage.z7o;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class f {
    public final i a;
    public final fkn b;
    public final kotlinx.coroutines.a c;
    public final long d;

    public f(i iVar, fkn fknVar, kotlinx.coroutines.a aVar) {
        iVar.getClass();
        aVar.getClass();
        this.a = iVar;
        this.b = fknVar;
        this.c = aVar;
        msa msaVar = nsa.b;
        this.d = yd5.M(60, ssa.SECONDS);
    }

    public final String a() {
        i iVar = this.a;
        iVar.getClass();
        return ((com.yandex.plus.domain.auth.api.e) iVar.h.getValue()).e();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        b bVar;
        int i;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bVar.j;
                nm6 nm6Var = nm6.a;
                i = bVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    bVar.l = 1;
                    if (this.a.h(str, bVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                }
                return Unit.a;
            }
        }
        bVar = new b(this, cg6Var);
        Object obj2 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        if (i != 0) {
        }
        return Unit.a;
    }

    public final boolean c() {
        i iVar = this.a;
        iVar.getClass();
        return iVar.h.getValue() instanceof com.yandex.plus.domain.auth.api.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[Catch: CancellationException -> 0x0061, TryCatch #0 {CancellationException -> 0x0061, blocks: (B:10:0x0023, B:11:0x004e, B:13:0x0054, B:16:0x005e, B:21:0x0035), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[Catch: CancellationException -> 0x0061, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0061, blocks: (B:10:0x0023, B:11:0x004e, B:13:0x0054, B:16:0x005e, B:21:0x0035), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var) {
        c cVar;
        int i;
        Object f;
        try {
            if (cg6Var instanceof c) {
                cVar = (c) cg6Var;
                int i2 = cVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = cVar.j;
                    nm6 nm6Var = nm6.a;
                    i = cVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        i iVar = this.a;
                        g c = com.yandex.plus.bdui.flex.ui.a.c((com.yandex.plus.ui.core.theme.a) this.b.a.getValue());
                        cVar.l = 1;
                        f = iVar.f(c, cVar);
                        if (f == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        f = ((z7o) obj).a;
                    }
                    return z7o.a(f) != null ? new com.yandex.plus.home.feature.webviews.internalapi.authorization.c(((com.yandex.plus.domain.auth.api.b) f).a) : com.yandex.plus.home.feature.webviews.internalapi.authorization.b.a;
                }
            }
            if (i != 0) {
            }
            if (z7o.a(f) != null) {
            }
        } catch (CancellationException unused) {
            return com.yandex.plus.home.feature.webviews.internalapi.authorization.a.a;
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cVar.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[Catch: CancellationException -> 0x005c, TryCatch #0 {CancellationException -> 0x005c, blocks: (B:10:0x0023, B:11:0x004e, B:13:0x0054, B:16:0x0059, B:21:0x0035), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: CancellationException -> 0x005c, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x005c, blocks: (B:10:0x0023, B:11:0x004e, B:13:0x0054, B:16:0x0059, B:21:0x0035), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum e(cg6 cg6Var) {
        d dVar;
        int i;
        Object g;
        try {
            if (cg6Var instanceof d) {
                dVar = (d) cg6Var;
                int i2 = dVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = dVar.j;
                    nm6 nm6Var = nm6.a;
                    i = dVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        i iVar = this.a;
                        g c = com.yandex.plus.bdui.flex.ui.a.c((com.yandex.plus.ui.core.theme.a) this.b.a.getValue());
                        dVar.l = 1;
                        g = iVar.g(c, dVar);
                        if (g == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        g = ((z7o) obj).a;
                    }
                    if (z7o.a(g) == null) {
                        return com.yandex.plus.home.feature.webviews.internalapi.authorization.e.c;
                    }
                    return com.yandex.plus.home.feature.webviews.internalapi.authorization.e.a;
                }
            }
            if (i != 0) {
            }
            if (z7o.a(g) == null) {
            }
        } catch (CancellationException unused) {
            return com.yandex.plus.home.feature.webviews.internalapi.authorization.e.b;
        }
        dVar = new d(this, cg6Var);
        Object obj2 = dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dVar.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var) {
        e eVar;
        int i;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i2 = eVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.l = i2 - Integer.MIN_VALUE;
                Object obj = eVar.j;
                nm6 nm6Var = nm6.a;
                i = eVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.ui.social.i iVar = new com.yandex.passport.internal.ui.social.i(this, null, 12);
                    eVar.l = 1;
                    obj = tyf.M(this.d, iVar, eVar);
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
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        eVar = new e(this, cg6Var);
        Object obj2 = eVar.j;
        nm6 nm6Var2 = nm6.a;
        i = eVar.l;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }
}
