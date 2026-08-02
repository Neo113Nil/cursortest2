package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.data.network.a2;
import com.yandex.passport.data.network.t1;
import com.yandex.passport.data.network.u1;
import com.yandex.passport.internal.methods.v5;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class c implements z0 {
    public final com.yandex.passport.internal.core.accounts.e a;
    public final com.yandex.passport.common.ui.lang.b b;
    public final a2 c;
    public final t1 d;
    public final com.yandex.passport.internal.credentials.g e;
    public final com.yandex.passport.data.network.token.i f;
    public final com.yandex.passport.internal.network.mappers.b g;

    public c(com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.common.ui.lang.b bVar, a2 a2Var, t1 t1Var, com.yandex.passport.internal.credentials.g gVar, com.yandex.passport.data.network.token.i iVar, com.yandex.passport.internal.network.mappers.b bVar2) {
        eVar.getClass();
        bVar.getClass();
        a2Var.getClass();
        t1Var.getClass();
        gVar.getClass();
        bVar2.getClass();
        this.a = eVar;
        this.b = bVar;
        this.c = a2Var;
        this.d = t1Var;
        this.e = gVar;
        this.f = iVar;
        this.g = bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x011f, code lost:
    
        if (r3 != r7) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2 A[Catch: all -> 0x0141, CancellationException -> 0x014a, wis -> 0x014c, TryCatch #2 {wis -> 0x014c, CancellationException -> 0x014a, all -> 0x0141, blocks: (B:11:0x0035, B:12:0x0122, B:14:0x0131, B:15:0x0138, B:21:0x004e, B:23:0x00c3, B:25:0x00d2, B:26:0x00d9, B:28:0x00f2, B:29:0x00f4, B:33:0x0058, B:36:0x0068, B:38:0x0085, B:39:0x008c, B:44:0x013b, B:45:0x0140), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f2 A[Catch: all -> 0x0141, CancellationException -> 0x014a, wis -> 0x014c, TryCatch #2 {wis -> 0x014c, CancellationException -> 0x014a, all -> 0x0141, blocks: (B:11:0x0035, B:12:0x0122, B:14:0x0131, B:15:0x0138, B:21:0x004e, B:23:0x00c3, B:25:0x00d2, B:26:0x00d9, B:28:0x00f2, B:29:0x00f4, B:33:0x0058, B:36:0x0068, B:38:0x0085, B:39:0x008c, B:44:0x013b, B:45:0x0140), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, com.yandex.passport.common.core.f fVar, String str, String str2, cg6 cg6Var) {
        a aVar;
        int i;
        com.yandex.passport.internal.l e;
        com.yandex.passport.common.core.f fVar2;
        String str3;
        int i2;
        com.yandex.passport.internal.credentials.f fVar3;
        String str4;
        int i3;
        com.yandex.passport.common.ui.lang.b bVar = cVar.b;
        com.yandex.passport.internal.network.mappers.b bVar2 = cVar.g;
        try {
            if (cg6Var instanceof a) {
                aVar = (a) cg6Var;
                int i4 = aVar.s;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    aVar.s = i4 - Integer.MIN_VALUE;
                    Object obj = aVar.q;
                    nm6 nm6Var = nm6.a;
                    i = aVar.s;
                    if (i != 0) {
                        qgg.h0(obj);
                        r7o r7oVar = z7o.b;
                        e = cVar.a.a().e(fVar);
                        com.yandex.passport.common.core.b bVar3 = fVar.a;
                        if (e == null) {
                            throw new com.yandex.passport.api.exception.b(fVar);
                        }
                        com.yandex.passport.internal.credentials.f b = cVar.e.b(bVar3);
                        a2 a2Var = cVar.c;
                        bVar2.getClass();
                        com.yandex.passport.data.models.g a = com.yandex.passport.internal.network.mappers.b.a(bVar3);
                        long h = e.h();
                        String d = e.d.d();
                        String str5 = str2 == null ? b.c : str2;
                        Locale b2 = ((com.yandex.passport.internal.ui.lang.a) bVar).b();
                        int i5 = com.yandex.passport.common.ui.lang.a.a;
                        String language = b2.getLanguage();
                        language.getClass();
                        u1 u1Var = new u1(a, h, d, str, str5, language);
                        aVar.j = fVar;
                        aVar.k = str;
                        aVar.l = str2;
                        aVar.m = b;
                        aVar.n = e;
                        aVar.o = 0;
                        aVar.p = 0;
                        aVar.s = 1;
                        Object g = a2Var.g(u1Var, aVar);
                        if (g == nm6Var) {
                            return nm6Var;
                        }
                        fVar2 = fVar;
                        str3 = str;
                        i2 = 0;
                        obj = g;
                        fVar3 = b;
                        str4 = str2;
                        i3 = 0;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            qgg.h0(((z7o) obj).a);
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "deviceAuthorizationCommitRequest ok", 8);
                            }
                            return Unit.a;
                        }
                        i2 = aVar.p;
                        i3 = aVar.o;
                        e = aVar.n;
                        fVar3 = aVar.m;
                        str4 = aVar.l;
                        String str6 = aVar.k;
                        fVar2 = aVar.j;
                        qgg.h0(obj);
                        str3 = str6;
                    }
                    qgg.h0(((z7o) obj).a);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "deviceAuthorizationSubmitRequest ok", 8);
                    }
                    t1 t1Var = cVar.d;
                    com.yandex.passport.common.core.b bVar4 = fVar2.a;
                    bVar2.getClass();
                    com.yandex.passport.data.models.g a2 = com.yandex.passport.internal.network.mappers.b.a(bVar4);
                    long h2 = e.h();
                    String d2 = e.d.d();
                    if (str4 == null) {
                        str4 = fVar3.c;
                    }
                    Locale b3 = ((com.yandex.passport.internal.ui.lang.a) bVar).b();
                    int i6 = com.yandex.passport.common.ui.lang.a.a;
                    String language2 = b3.getLanguage();
                    language2.getClass();
                    com.yandex.passport.data.network.n1 n1Var = new com.yandex.passport.data.network.n1(a2, h2, d2, str3, str4, language2);
                    aVar.j = null;
                    aVar.k = null;
                    aVar.l = null;
                    aVar.m = null;
                    aVar.n = null;
                    aVar.o = i3;
                    aVar.p = i2;
                    aVar.s = 2;
                    obj = t1Var.g(n1Var, aVar);
                }
            }
            if (i != 0) {
            }
            qgg.h0(((z7o) obj).a);
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            }
            t1 t1Var2 = cVar.d;
            com.yandex.passport.common.core.b bVar42 = fVar2.a;
            bVar2.getClass();
            com.yandex.passport.data.models.g a22 = com.yandex.passport.internal.network.mappers.b.a(bVar42);
            long h22 = e.h();
            String d22 = e.d.d();
            if (str4 == null) {
            }
            Locale b32 = ((com.yandex.passport.internal.ui.lang.a) bVar).b();
            int i62 = com.yandex.passport.common.ui.lang.a.a;
            String language22 = b32.getLanguage();
            language22.getClass();
            com.yandex.passport.data.network.n1 n1Var2 = new com.yandex.passport.data.network.n1(a22, h22, d22, str3, str4, language22);
            aVar.j = null;
            aVar.k = null;
            aVar.l = null;
            aVar.m = null;
            aVar.n = null;
            aVar.o = i3;
            aVar.p = i2;
            aVar.s = 2;
            obj = t1Var2.g(n1Var2, aVar);
        } catch (wis e2) {
            r7o r7oVar2 = z7o.b;
            return new t7o(e2);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            r7o r7oVar3 = z7o.b;
            return new t7o(th);
        }
        aVar = new a(cVar, cg6Var);
        Object obj2 = aVar.q;
        nm6 nm6Var2 = nm6.a;
        i = aVar.s;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return com.yandex.passport.internal.ui.a.A(new b((com.yandex.passport.internal.methods.z) v5Var, this, null, 0));
    }
}
