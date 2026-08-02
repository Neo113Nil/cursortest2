package com.yandex.passport.internal.usecase;

import android.net.Uri;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.e93;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.x0q;
import defpackage.x7j;
import defpackage.xq0;
import defpackage.yd5;
import defpackage.z7o;
import java.io.Closeable;
import java.io.Serializable;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class e0 extends a3 {
    public final com.yandex.passport.internal.core.accounts.e d;
    public final com.yandex.passport.internal.network.d e;
    public final com.yandex.passport.data.network.v f;
    public final com.yandex.passport.internal.report.reporters.h g;
    public final com.yandex.passport.internal.network.mappers.b h;
    public final com.yandex.passport.internal.ui.domik.o i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.network.d dVar, com.yandex.passport.data.network.v vVar, com.yandex.passport.internal.report.reporters.h hVar, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        eVar.getClass();
        dVar.getClass();
        vVar.getClass();
        hVar.getClass();
        bVar.getClass();
        this.d = eVar;
        this.e = dVar;
        this.f = vVar;
        this.g = hVar;
        this.h = bVar;
        this.i = new com.yandex.passport.internal.ui.domik.o();
    }

    public final Uri w(com.yandex.passport.common.core.b bVar, long j, com.yandex.passport.data.network.u uVar, String str, boolean z, com.yandex.passport.common.core.c cVar) {
        String g;
        String str2;
        if (z && ((str2 = uVar.c) == null || StringsKt.U(str2))) {
            throw new com.yandex.passport.data.exceptions.h("authUrlResult.host == null");
        }
        String str3 = uVar.c;
        String str4 = uVar.b;
        if (str3 != null && !StringsKt.U(str3)) {
            String str5 = uVar.c;
            str5.getClass();
            Uri build = Uri.parse(str5).buildUpon().appendEncodedPath("auth/session").appendQueryParameter("track_id", str4).build();
            build.getClass();
            return build;
        }
        int ordinal = cVar.ordinal();
        com.yandex.passport.internal.network.d dVar = this.e;
        if (ordinal == 0) {
            g = ((com.yandex.passport.internal.network.h) dVar).g(bVar, Long.valueOf(j), str);
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            com.yandex.passport.internal.network.h hVar = (com.yandex.passport.internal.network.h) dVar;
            hVar.getClass();
            bVar.getClass();
            g = hVar.k(bVar, com.yandex.passport.api.b2.f, Long.valueOf(j), com.yandex.passport.internal.flags.n.c, new e93(hVar, bVar, str, j)).a;
        }
        Uri build2 = Uri.parse(g).buildUpon().appendEncodedPath("auth/session").appendQueryParameter("track_id", str4).build();
        build2.getClass();
        return build2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b A[Catch: all -> 0x012c, TRY_LEAVE, TryCatch #6 {all -> 0x012c, blocks: (B:27:0x0103, B:29:0x010b), top: B:26:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017e A[Catch: all -> 0x0127, TryCatch #3 {all -> 0x0127, blocks: (B:32:0x0123, B:33:0x0134, B:36:0x0178, B:38:0x017e, B:39:0x018f, B:41:0x0195, B:47:0x01be, B:61:0x016c), top: B:31:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0195 A[Catch: all -> 0x0127, TryCatch #3 {all -> 0x0127, blocks: (B:32:0x0123, B:33:0x0134, B:36:0x0178, B:38:0x017e, B:39:0x018f, B:41:0x0195, B:47:0x01be, B:61:0x016c), top: B:31:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0069  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // com.yandex.passport.internal.usecase.a3, androidx.core.app.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(c0 c0Var, cg6 cg6Var) {
        d0 d0Var;
        ?? r3;
        Closeable closeable;
        Throwable th;
        com.yandex.passport.internal.ui.domik.o oVar;
        com.yandex.passport.internal.l e;
        int i;
        int i2;
        Closeable closeable2;
        long j;
        c0 c0Var2;
        e0 e0Var;
        Closeable closeable3;
        Object obj;
        e0 e0Var2;
        com.yandex.passport.internal.ui.domik.o oVar2;
        nm6 nm6Var;
        e0 e0Var3;
        Object t7oVar;
        Throwable a;
        Throwable a2;
        Closeable closeable4;
        Closeable closeable5;
        try {
            try {
                if (cg6Var instanceof d0) {
                    d0Var = (d0) cg6Var;
                    int i3 = d0Var.t;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        d0Var.t = i3 - Integer.MIN_VALUE;
                        d0 d0Var2 = d0Var;
                        Object obj2 = d0Var2.r;
                        nm6 nm6Var2 = nm6.a;
                        r3 = d0Var2.t;
                        if (r3 != 0) {
                            qgg.h0(obj2);
                            oVar = this.i;
                            z2 z2Var = new z2(this);
                            com.yandex.passport.internal.ui.a aVar = c0Var.a;
                            Map map = c0Var.f;
                            if (aVar instanceof a0) {
                                e = ((a0) aVar).b;
                            } else {
                                if (!(aVar instanceof b0)) {
                                    throw new x7j();
                                }
                                e = this.d.a().e(((b0) aVar).b);
                                if (e == null) {
                                    com.yandex.passport.api.exception.b bVar = new com.yandex.passport.api.exception.b(((b0) aVar).b);
                                    r7o r7oVar = z7o.b;
                                    z7o z7oVar = new z7o(new t7o(bVar));
                                    z2Var.close();
                                    return z7oVar;
                                }
                            }
                            long h = e.h();
                            com.yandex.passport.common.core.f fVar = e.b;
                            this.g.x(fVar, h, map);
                            com.yandex.passport.data.network.v vVar = this.f;
                            com.yandex.passport.internal.network.mappers.b bVar2 = this.h;
                            com.yandex.passport.common.core.b bVar3 = fVar.a;
                            bVar2.getClass();
                            com.yandex.passport.data.network.p pVar = new com.yandex.passport.data.network.p(h, e.d, com.yandex.passport.internal.network.mappers.b.a(bVar3), c0Var.c, (String) map.get("yandexuid"));
                            d0Var2.j = c0Var;
                            d0Var2.k = this;
                            d0Var2.l = oVar;
                            d0Var2.m = z2Var;
                            d0Var2.n = e;
                            d0Var2.o = 0;
                            d0Var2.p = 0;
                            d0Var2.q = h;
                            d0Var2.t = 1;
                            Object g = vVar.g(pVar, d0Var2);
                            if (g == nm6Var2) {
                                return nm6Var2;
                            }
                            i = 0;
                            i2 = 0;
                            closeable2 = z2Var;
                            obj2 = g;
                            j = h;
                            c0Var2 = c0Var;
                            e0Var = this;
                        } else {
                            if (r3 != 1) {
                                if (r3 != 2) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                obj = d0Var2.n;
                                Closeable closeable6 = d0Var2.m;
                                qgg.h0(obj2);
                                closeable5 = closeable6;
                                closeable4 = closeable5;
                                yd5.q(closeable4, null);
                                return new z7o(obj);
                            }
                            long j2 = d0Var2.q;
                            int i4 = d0Var2.p;
                            int i5 = d0Var2.o;
                            e = (com.yandex.passport.internal.l) d0Var2.n;
                            Closeable closeable7 = d0Var2.m;
                            oVar = d0Var2.l;
                            e0 e0Var4 = d0Var2.k;
                            c0Var2 = d0Var2.j;
                            try {
                                qgg.h0(obj2);
                                i2 = i5;
                                j = j2;
                                e0Var = e0Var4;
                                i = i4;
                                closeable2 = closeable7;
                            } catch (Throwable th2) {
                                th = th2;
                                closeable = closeable7;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    yd5.q(closeable, th);
                                    throw th3;
                                }
                            }
                        }
                        com.yandex.passport.internal.l lVar = e;
                        obj = ((z7o) obj2).a;
                        if (obj instanceof t7o) {
                            e0Var2 = e0Var;
                            closeable3 = closeable2;
                            oVar2 = oVar;
                            try {
                                this.g.w(j, lVar.b, ((com.yandex.passport.data.network.u) obj).b, c0Var2.f);
                            } catch (Throwable th4) {
                                th = th4;
                                r3 = closeable3;
                                th = th;
                                closeable = r3;
                                throw th;
                            }
                        } else {
                            e0Var2 = e0Var;
                            closeable3 = closeable2;
                            oVar2 = oVar;
                        }
                        if (obj instanceof t7o) {
                            try {
                                r7o r7oVar2 = z7o.b;
                                nm6Var = nm6Var2;
                                e0Var3 = e0Var2;
                                long j3 = j;
                                try {
                                    Uri w = w(lVar.b.a, j3, (com.yandex.passport.data.network.u) obj, c0Var2.d, c0Var2.e, c0Var2.g);
                                    j = j3;
                                    try {
                                        com.yandex.passport.common.url.b.Companion.getClass();
                                        String uri = w.toString();
                                        uri.getClass();
                                        t7oVar = new com.yandex.passport.common.url.b(uri);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        r7o r7oVar3 = z7o.b;
                                        t7oVar = new t7o(th);
                                        obj = t7oVar;
                                        a = z7o.a(obj);
                                        if (a != null) {
                                        }
                                        a2 = z7o.a(obj);
                                        if (a2 == null) {
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    j = j3;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                nm6Var = nm6Var2;
                                e0Var3 = e0Var2;
                            }
                            obj = t7oVar;
                        } else {
                            nm6Var = nm6Var2;
                            e0Var3 = e0Var2;
                        }
                        a = z7o.a(obj);
                        if (a != null) {
                            this.g.v(j, lVar.b, String.valueOf(a.getMessage()), c0Var2.f);
                        }
                        a2 = z7o.a(obj);
                        if (a2 == null) {
                            closeable4 = closeable3;
                            yd5.q(closeable4, null);
                            return new z7o(obj);
                        }
                        d0Var2.j = null;
                        d0Var2.k = null;
                        d0Var2.l = null;
                        d0Var2.m = closeable3;
                        d0Var2.n = obj;
                        d0Var2.o = i2;
                        d0Var2.p = i;
                        d0Var2.t = 2;
                        Object emit = ((x0q) e0Var3.b).emit(oVar2.a(a2), d0Var2);
                        if (emit != nm6.a) {
                            emit = Unit.a;
                        }
                        nm6 nm6Var3 = nm6Var;
                        if (emit == nm6Var3) {
                            return nm6Var3;
                        }
                        closeable5 = closeable3;
                        closeable4 = closeable5;
                        yd5.q(closeable4, null);
                        return new z7o(obj);
                    }
                }
                obj = ((z7o) obj2).a;
                if (obj instanceof t7o) {
                }
                if (obj instanceof t7o) {
                }
                a = z7o.a(obj);
                if (a != null) {
                }
                a2 = z7o.a(obj);
                if (a2 == null) {
                }
            } catch (Throwable th8) {
                th = th8;
                closeable3 = closeable2;
            }
            if (r3 != 0) {
            }
            com.yandex.passport.internal.l lVar2 = e;
        } catch (Throwable th9) {
            th = th9;
        }
        d0Var = new d0(this, cg6Var);
        d0 d0Var22 = d0Var;
        Object obj22 = d0Var22.r;
        nm6 nm6Var22 = nm6.a;
        r3 = d0Var22.t;
    }
}
