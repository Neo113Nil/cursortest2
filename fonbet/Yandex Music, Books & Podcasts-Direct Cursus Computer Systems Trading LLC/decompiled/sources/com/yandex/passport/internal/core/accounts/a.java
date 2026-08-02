package com.yandex.passport.internal.core.accounts;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.yandex.passport.data.network.o0;
import com.yandex.passport.internal.analytics.r0;
import defpackage.d7e;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wzv;
import defpackage.x97;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {
    public final k a;
    public final t b;
    public final l c;
    public final com.yandex.passport.internal.core.linkage.c d;
    public final e e;
    public final r0 f;
    public final com.yandex.passport.internal.network.mappers.d g;
    public final String h;

    public a(Context context, k kVar, t tVar, l lVar, com.yandex.passport.internal.core.linkage.c cVar, e eVar, r0 r0Var, com.yandex.passport.internal.network.mappers.d dVar) {
        context.getClass();
        kVar.getClass();
        tVar.getClass();
        lVar.getClass();
        cVar.getClass();
        eVar.getClass();
        r0Var.getClass();
        dVar.getClass();
        this.a = kVar;
        this.b = tVar;
        this.c = lVar;
        this.d = cVar;
        this.e = eVar;
        this.f = r0Var;
        this.g = dVar;
        String packageName = context.getPackageName();
        packageName.getClass();
        this.h = packageName;
    }

    public final boolean a(Account account, boolean z) {
        account.getClass();
        try {
            return b(account, z);
        } catch (Exception e) {
            r0 r0Var = this.f;
            r0Var.getClass();
            com.yandex.passport.internal.analytics.u uVar = com.yandex.passport.internal.analytics.u.c;
            r0Var.a(com.yandex.passport.internal.analytics.u.c, new Pair("error", Log.getStackTraceString(e)));
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String, kotlin.coroutines.Continuation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Account account, boolean z) {
        boolean z2;
        Object obj;
        com.yandex.passport.internal.l a;
        Object obj2;
        String str;
        Object obj3;
        String str2;
        boolean z3;
        boolean z4;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "synchronizeAccount: synchronizing " + account, 8);
        }
        e eVar = this.e;
        com.yandex.passport.internal.b a2 = eVar.a().a(account);
        r0 r0Var = this.f;
        if (a2 == null) {
            r0Var.getClass();
            r0Var.a(com.yandex.passport.internal.analytics.u.d, new Pair[0]);
            if (!com.yandex.passport.common.logger.a.a.isEnabled()) {
                return false;
            }
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "synchronizeAccount: can't get account row for account " + account, 8);
            return false;
        }
        com.yandex.passport.internal.l b = this.g.b(a2);
        if (b != null) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "synchronizeAccount: processing as modern account " + account, 8);
            }
            String e = this.a.e();
            if (z || Intrinsics.d(this.h, e)) {
                com.yandex.passport.internal.analytics.j jVar = com.yandex.passport.internal.analytics.j.e;
                t tVar = this.b;
                tVar.getClass();
                jVar.getClass();
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "starting getAllUserInfo", 8);
                }
                obj = "uid";
                long a3 = com.yandex.passport.common.a.a();
                com.yandex.passport.common.core.g gVar = b.e;
                gVar.getClass();
                String str3 = gVar.b;
                long j = gVar.c;
                Locale b2 = ((com.yandex.passport.internal.ui.lang.a) tVar.e).b();
                int i = com.yandex.passport.common.ui.lang.a.a;
                String language = b2.getLanguage();
                language.getClass();
                if (z || Intrinsics.f(a3, j) < 0) {
                    z3 = false;
                } else {
                    long j2 = a3 - j;
                    boolean z5 = false;
                    z3 = z5;
                    if (Intrinsics.f(j2, tVar.a) < 0) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "refreshModernAccountIfNecessary: account " + b + " userInfoAge: " + ((Object) com.yandex.passport.common.time.a.g(j2)) + " to small", 8);
                        }
                        a = null;
                        z4 = z5;
                        long j3 = b.b.b;
                        r0Var.getClass();
                        r0Var.a(com.yandex.passport.internal.analytics.u.e, new Pair(obj, String.valueOf(j3)));
                        z2 = z4;
                    }
                }
                a = (com.yandex.passport.internal.l) x97.D(kotlin.coroutines.g.a, new d7e(tVar, b, language, jVar, a3, str3, null));
                z4 = z3;
                long j32 = b.b.b;
                r0Var.getClass();
                r0Var.a(com.yandex.passport.internal.analytics.u.e, new Pair(obj, String.valueOf(j32)));
                z2 = z4;
            } else {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "synchronizeAccount: i'm not a master", 8);
                }
                z2 = 0;
                obj = "uid";
                a = null;
            }
        } else {
            z2 = 0;
            obj = "uid";
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "synchronizeAccount: processing as corrupted account " + account, 8);
            }
            a = this.c.a(a2, com.yandex.passport.internal.analytics.j.e, com.yandex.passport.internal.report.reporters.t.i);
            long j4 = a.b.b;
            r0Var.getClass();
            r0Var.a(com.yandex.passport.internal.analytics.u.f, new Pair(obj, String.valueOf(j4)));
        }
        com.yandex.passport.internal.l lVar = a;
        if (lVar == null) {
            return z2;
        }
        com.yandex.passport.internal.h hVar = lVar.i;
        com.yandex.passport.internal.d a4 = eVar.a();
        com.yandex.passport.internal.core.linkage.c cVar = this.d;
        cVar.getClass();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "refreshLinkage: " + lVar, 8);
        }
        int i2 = hVar.a;
        HashSet hashSet = hVar.d;
        int i3 = 4;
        if (i2 != 4) {
            List h = a4.h(lVar);
            if (!h.isEmpty() && !Intrinsics.d(((com.yandex.passport.internal.i) h.get(z2)).c, lVar)) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    obj2 = null;
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "refreshLinkage: target = " + lVar + ", possibleLinkagePairs = " + h, 8);
                } else {
                    obj2 = null;
                }
                Iterator it = h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = obj2;
                        obj3 = obj;
                        break;
                    }
                    com.yandex.passport.internal.i iVar = (com.yandex.passport.internal.i) it.next();
                    Object obj4 = obj2;
                    obj3 = obj;
                    ?? r8 = obj4;
                    Object A = com.yandex.passport.internal.ui.a.A(new wzv(cVar, lVar, iVar, r8, 20));
                    r7o r7oVar = z7o.b;
                    if (!(A instanceof t7o)) {
                        try {
                            o0 o0Var = (o0) A;
                            int i4 = o0Var.b ? i3 : o0Var.c ? 3 : 2;
                            Pattern pattern = com.yandex.passport.internal.h.e;
                            A = new com.yandex.passport.internal.h(i4, CollectionsKt.y0(o0Var.d), new ArrayList(), new HashSet());
                        } catch (Throwable th) {
                            r7o r7oVar2 = z7o.b;
                            A = new t7o(th);
                        }
                    }
                    if (A instanceof t7o) {
                        i3 = 4;
                    } else {
                        com.yandex.passport.internal.h hVar2 = (com.yandex.passport.internal.h) A;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, r8, "refreshLinkage: linkage = " + hVar2, 8);
                        }
                        int i5 = hVar2.a;
                        i3 = 4;
                        if (i5 == 4) {
                            hVar.a = 4;
                            hVar.b.clear();
                            hVar.c.clear();
                            hashSet.clear();
                            str = r8;
                            break;
                        }
                        if (i5 == 3) {
                            hVar.b = hVar2.b;
                            com.yandex.passport.common.core.f fVar = iVar.a.b;
                            fVar.getClass();
                            hashSet.add(fVar);
                            hVar.a = 3;
                        } else if (i5 == 2) {
                            com.yandex.passport.common.core.f fVar2 = iVar.a.b;
                            fVar2.getClass();
                            hashSet.remove(fVar2);
                            if (hashSet.isEmpty()) {
                                hVar.a = 2;
                            }
                        }
                    }
                    Throwable a5 = z7o.a(A);
                    if (a5 != null) {
                        com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, r8, "refreshLinkage: fail", a5);
                        }
                    }
                    obj = obj3;
                    obj2 = r8;
                }
                com.yandex.passport.internal.core.linkage.d dVar2 = cVar.a;
                dVar2.getClass();
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, str, "updateLinkage: linkage=" + hVar + " modernAccount=" + lVar, 8);
                }
                String a6 = hVar.a();
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, str, "updateLinkage: serializedLinkage=" + a6, 8);
                }
                i.j(dVar2.a, lVar, new Pair[]{new Pair(com.yandex.passport.internal.stash.b.PASSPORT_LINKAGE, a6)});
                str2 = str;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, str, "updateLinkage: refreshed", 8);
                    str2 = str;
                }
                long j5 = lVar.b.b;
                r0Var.getClass();
                r0Var.a(com.yandex.passport.internal.analytics.u.g, new Pair(obj3, String.valueOf(j5)));
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    return true;
                }
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, str2, "synchronizeAccount: synchronized " + account, 8);
                return true;
            }
        }
        obj3 = obj;
        str2 = null;
        long j52 = lVar.b.b;
        r0Var.getClass();
        r0Var.a(com.yandex.passport.internal.analytics.u.g, new Pair(obj3, String.valueOf(j52)));
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
    }
}
