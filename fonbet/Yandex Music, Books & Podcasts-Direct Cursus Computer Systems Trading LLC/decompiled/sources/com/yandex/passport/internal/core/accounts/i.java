package com.yandex.passport.internal.core.accounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.j6;
import com.yandex.passport.internal.report.l6;
import com.yandex.passport.internal.report.m6;
import com.yandex.passport.internal.report.n6;
import com.yandex.passport.internal.report.pc;
import com.yandex.passport.internal.report.reporters.c1;
import com.yandex.passport.internal.report.reporters.f1;
import com.yandex.passport.internal.report.reporters.x0;
import com.yandex.passport.internal.usecase.a2;
import defpackage.bnh;
import defpackage.bz2;
import defpackage.n7w;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.v75;
import defpackage.wzv;
import defpackage.xy0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class i {
    public final k a;
    public final com.yandex.passport.internal.core.announcing.b b;
    public final o0 c;
    public final c1 d;
    public final f1 e;
    public final com.yandex.passport.internal.report.reporters.c f;
    public final com.yandex.passport.internal.properties.x g;
    public final com.yandex.passport.internal.database.d h;
    public final com.yandex.passport.internal.report.reporters.r i;
    public final a2 j;
    public final com.yandex.passport.internal.account.b k;
    public final com.yandex.passport.internal.network.mappers.d l;

    public i(k kVar, com.yandex.passport.internal.core.announcing.b bVar, o0 o0Var, c1 c1Var, f1 f1Var, com.yandex.passport.internal.report.reporters.c cVar, com.yandex.passport.internal.properties.x xVar, com.yandex.passport.internal.database.d dVar, com.yandex.passport.internal.report.reporters.r rVar, a2 a2Var, com.yandex.passport.internal.account.b bVar2, com.yandex.passport.internal.network.mappers.d dVar2) {
        this.a = kVar;
        this.b = bVar;
        this.c = o0Var;
        this.d = c1Var;
        this.e = f1Var;
        this.f = cVar;
        this.g = xVar;
        this.h = dVar;
        this.i = rVar;
        this.j = a2Var;
        this.k = bVar2;
        this.l = dVar2;
    }

    public static void j(i iVar, com.yandex.passport.internal.l lVar, Pair[] pairArr) {
        iVar.getClass();
        lVar.getClass();
        Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
        int length = pairArr2.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Pair pair = pairArr2[i];
            if (!Intrinsics.d(lVar.f.a((com.yandex.passport.internal.stash.b) pair.a), pair.b)) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            iVar.k(lVar, pairArr);
            com.yandex.passport.internal.core.announcing.b bVar = iVar.b;
            bVar.a(true);
            bVar.a.b(com.yandex.passport.internal.analytics.j.f);
        }
    }

    public final bz2 a(com.yandex.passport.internal.l lVar, com.yandex.passport.internal.analytics.n nVar, boolean z) {
        o0 o0Var = this.c;
        com.yandex.passport.internal.analytics.w wVar = o0Var.a;
        lVar.getClass();
        nVar.getClass();
        if (this.g.v) {
            throw new o();
        }
        com.yandex.passport.internal.network.mappers.d dVar = this.l;
        com.yandex.passport.internal.b a = dVar.a(lVar);
        Account account = lVar.g;
        com.yandex.passport.common.core.f fVar = lVar.b;
        k kVar = this.a;
        bz2 a2 = kVar.a(a);
        boolean z2 = a2.b;
        com.yandex.passport.internal.core.announcing.b bVar = this.b;
        if (z2) {
            bVar.b(fVar, nVar, z);
            return a2;
        }
        h(lVar, nVar, z);
        account.getClass();
        String str = account.name;
        str.getClass();
        Account[] c = kVar.c();
        int length = c.length;
        int i = 0;
        while (i < length) {
            bz2 bz2Var = a2;
            if (str.equals(c[i].name)) {
                long j = fVar.b;
                xy0 xy0Var = new xy0(0);
                xy0Var.put("uid", Long.toString(j));
                wVar.b(com.yandex.passport.internal.analytics.l.j, xy0Var);
                return bz2Var;
            }
            i++;
            a2 = bz2Var;
        }
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        kVar.k(account, lVar.d.a, new h(countDownLatch, fVar, this, atomicReference, 0));
        try {
            countDownLatch.await();
            if (atomicReference.get() == null) {
                bz2 a3 = kVar.a(a);
                if (a3.b) {
                    long j2 = fVar.b;
                    xy0 xy0Var2 = new xy0(0);
                    xy0Var2.put("uid", Long.toString(j2));
                    wVar.b(com.yandex.passport.internal.analytics.l.l, xy0Var2);
                    bVar.b(fVar, nVar, z);
                    return a3;
                }
                long j3 = fVar.b;
                xy0 xy0Var3 = new xy0(0);
                xy0Var3.put("uid", Long.toString(j3));
                wVar.b(com.yandex.passport.internal.analytics.l.n, xy0Var3);
            }
        } catch (InterruptedException e) {
            com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "removeAndRecreateAccount: remove uid=" + fVar + ": timeout while waiting for account removal", 8);
            }
            o0Var.a(fVar.b, e);
        }
        bz2 a4 = kVar.a(dVar.a(com.yandex.passport.internal.l.e(lVar, "user" + fVar.b, null, null, null, 62)));
        boolean z3 = a4.b;
        long j4 = fVar.b;
        if (!z3) {
            xy0 xy0Var4 = new xy0(0);
            xy0Var4.put("uid", Long.toString(j4));
            wVar.b(com.yandex.passport.internal.analytics.l.k, xy0Var4);
            throw new o();
        }
        xy0 xy0Var5 = new xy0(0);
        xy0Var5.put("uid", Long.toString(j4));
        wVar.b(com.yandex.passport.internal.analytics.l.o, xy0Var5);
        bVar.b(fVar, nVar, z);
        return a4;
    }

    public final void b(com.yandex.passport.common.core.f fVar) {
        fVar.getClass();
        int a = this.h.a(fVar);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "deleteLocalUidOnSuccess " + a, 8);
        }
        if (a > 0) {
            this.i.n(j6.d, new ff(fVar));
        }
    }

    public final void c(com.yandex.passport.internal.l lVar, boolean z, boolean z2, x0 x0Var, boolean z3) {
        String str;
        lVar.getClass();
        com.yandex.passport.common.account.a aVar = lVar.d;
        com.yandex.passport.common.core.f fVar = lVar.b;
        x0Var.getClass();
        Continuation continuation = null;
        try {
            int a = this.h.a(fVar);
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "removeAccount deleteLocalUidOnSuccess " + a, 8);
            }
            com.yandex.passport.internal.report.reporters.r rVar = this.i;
            fVar.getClass();
            if (a > 0) {
                rVar.n(j6.d, new ff(fVar));
            }
        } catch (Throwable th) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.c, null, "removeAccount deleteLocalUidOnFailed " + th.getMessage(), 8);
            }
        }
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            bnh bnhVar = new bnh();
            bnhVar.d = this;
            bnhVar.e = lVar;
            bnhVar.a = z;
            bnhVar.b = z2;
            bnhVar.f = x0Var;
            bnhVar.c = z3;
            bnhVar.g = countDownLatch;
            bnhVar.h = atomicReference;
            Account account = lVar.g;
            k kVar = this.a;
            if (z3) {
                str = aVar.a;
                kVar.l(account, str, bnhVar);
            } else {
                str = aVar.a;
                kVar.k(account, str, bnhVar);
            }
        } catch (Exception e) {
            e = e;
            str = null;
        }
        try {
            try {
                countDownLatch.await();
                if (atomicReference.get() != null) {
                    Object obj = atomicReference.get();
                    obj.getClass();
                    throw new com.yandex.passport.api.exception.t((Throwable) obj);
                }
                this.b.c(lVar, z);
                this.k.a(fVar);
                if (z2) {
                    com.yandex.passport.internal.ui.a.z(new wzv(this, lVar, x0Var, continuation, 19));
                }
            } catch (InterruptedException unused) {
                throw new com.yandex.passport.api.exception.t("timeout while waiting for account removal");
            }
        } catch (Exception e2) {
            e = e2;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.c, str, "removeAccount failed: " + e.getMessage(), 8);
            }
        }
    }

    public final void d(com.yandex.passport.internal.b bVar, com.yandex.passport.internal.report.reporters.t tVar) {
        tVar.getClass();
        this.e.u(tVar, null, null);
        if (this.a.p(bVar, "-")) {
            com.yandex.passport.internal.core.announcing.b.d(this.b, com.yandex.passport.internal.analytics.j.g);
        }
    }

    public final void e(com.yandex.passport.internal.l lVar, com.yandex.passport.internal.report.reporters.t tVar) {
        lVar.getClass();
        tVar.getClass();
        this.e.u(tVar, lVar.b, null);
        if (this.a.p(this.l.a(lVar), "-")) {
            com.yandex.passport.internal.core.announcing.b.d(this.b, com.yandex.passport.internal.analytics.j.g);
        }
    }

    public final void f(com.yandex.passport.internal.b bVar) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "updateLocalAccount", 8);
            }
            this.h.H(bVar);
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "updateLocalAccount failed " + a, 8);
            }
            this.i.n(n6.d, new com.yandex.passport.internal.report.c(String.valueOf(bVar.c), 3), new ff(a));
        }
    }

    public final void g(com.yandex.passport.common.core.f fVar, com.yandex.passport.internal.b bVar) {
        Object t7oVar;
        fVar.getClass();
        try {
            r7o r7oVar = z7o.b;
            this.h.o(fVar, bVar);
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        boolean z = t7oVar instanceof t7o;
        com.yandex.passport.internal.report.reporters.r rVar = this.i;
        if (!z) {
            rVar.n(m6.d, new ff(fVar));
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Failed for account " + bVar.c, a);
            }
            rVar.n(l6.d, new ff(fVar), new ff(a));
        }
        qgg.h0(t7oVar);
    }

    public final void h(com.yandex.passport.internal.l lVar, com.yandex.passport.internal.analytics.n nVar, boolean z) {
        lVar.getClass();
        nVar.getClass();
        if (this.g.v) {
            throw new o();
        }
        Account account = lVar.g;
        com.yandex.passport.internal.b a = this.l.a(lVar);
        String str = a.c;
        account.getClass();
        k kVar = this.a;
        kVar.e();
        AccountManager accountManager = kVar.a;
        accountManager.setUserData(account, "uid", str);
        accountManager.setUserData(account, "user_info_body", a.d);
        accountManager.setUserData(account, "user_info_meta", a.e);
        accountManager.setUserData(account, "affinity", a.h);
        accountManager.setUserData(account, "account_type", a.g);
        accountManager.setUserData(account, "extra_data", a.i);
        String str2 = a.f;
        accountManager.setUserData(account, "stash", str2);
        kVar.n(account, a.b);
        kVar.e.u(str2 != null ? Integer.valueOf(str2.length()) : null, str);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "updateAccount: account=" + account + " accountRow=" + a, 8);
        }
        com.yandex.passport.internal.core.announcing.b bVar = this.b;
        bVar.c.b(null);
        bVar.a(z);
        bVar.a.b(nVar);
    }

    public final void i(ArrayList arrayList, com.yandex.passport.internal.stash.b bVar, String str) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            k((com.yandex.passport.internal.l) it.next(), new Pair[]{new Pair(bVar, str)});
            z = true;
        }
        if (z) {
            com.yandex.passport.internal.core.announcing.b bVar2 = this.b;
            bVar2.a(true);
            bVar2.a.b(com.yandex.passport.internal.analytics.j.f);
        }
    }

    public final void k(com.yandex.passport.internal.l lVar, Pair[] pairArr) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            com.yandex.passport.internal.stash.b bVar = (com.yandex.passport.internal.stash.b) pair.a;
            String str = (String) pair.b;
            arrayList.add((str == null || StringsKt.U(str)) ? new Pair(bVar, null) : new Pair(bVar, str));
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((com.yandex.passport.internal.stash.b) ((Pair) it.next()).a);
        }
        com.yandex.passport.internal.stash.a aVar = lVar.f;
        Iterator it2 = arrayList.iterator();
        com.yandex.passport.internal.stash.a aVar2 = aVar;
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            aVar2 = aVar2.b((com.yandex.passport.internal.stash.b) pair2.a, (String) pair2.b, true);
        }
        Map map = aVar2.a;
        String jSONObject = map.isEmpty() ? null : new JSONObject(map).toString();
        com.yandex.passport.internal.l e = com.yandex.passport.internal.l.e(lVar, lVar.j, null, null, aVar2, 30);
        com.yandex.passport.common.core.f fVar = e.b;
        Account account = e.g;
        boolean contains = arrayList2.contains(com.yandex.passport.internal.stash.b.DISK_PIN_CODE);
        k kVar = this.a;
        if (contains || arrayList2.contains(com.yandex.passport.internal.stash.b.MAIL_PIN_CODE)) {
            kVar.o(account, e.d().d());
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "updateStashImpl: stashBody=" + jSONObject, 8);
        }
        String valueOf = String.valueOf(fVar.b);
        Integer valueOf2 = jSONObject != null ? Integer.valueOf(jSONObject.length()) : null;
        c1 c1Var = this.d;
        c1Var.u(valueOf2, valueOf);
        account.getClass();
        kVar.e();
        kVar.a.setUserData(account, "stash", jSONObject);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "updateStash: account=" + account + " stashBody=" + jSONObject, 8);
        }
        f(com.yandex.passport.internal.b.a(this.l.a(lVar), null, null, jSONObject, null, 479));
        String valueOf3 = String.valueOf(fVar.b);
        Set keySet = n7w.G(aVar2.a).keySet();
        valueOf3.getClass();
        c1Var.n(pc.d, new com.yandex.passport.internal.report.c(valueOf3, 3), new com.yandex.passport.internal.report.f(keySet));
    }

    public final void l(com.yandex.passport.internal.l lVar, com.yandex.passport.internal.analytics.n nVar) {
        nVar.getClass();
        com.yandex.passport.internal.b a = this.l.a(lVar);
        f(a);
        Account account = lVar.g;
        account.getClass();
        k kVar = this.a;
        kVar.e();
        AccountManager accountManager = kVar.a;
        String str = a.c;
        accountManager.setUserData(account, "uid", str);
        accountManager.setUserData(account, "user_info_body", a.d);
        accountManager.setUserData(account, "user_info_meta", a.e);
        accountManager.setUserData(account, "affinity", a.h);
        accountManager.setUserData(account, "account_type", a.g);
        accountManager.setUserData(account, "extra_data", a.i);
        String str2 = a.f;
        accountManager.setUserData(account, "stash", str2);
        kVar.e.u(str2 != null ? Integer.valueOf(str2.length()) : null, str);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "updateUserInfo: account=" + account + " accountRow=" + a, 8);
        }
        com.yandex.passport.internal.core.announcing.b bVar = this.b;
        bVar.a(true);
        bVar.a.b(nVar);
    }
}
