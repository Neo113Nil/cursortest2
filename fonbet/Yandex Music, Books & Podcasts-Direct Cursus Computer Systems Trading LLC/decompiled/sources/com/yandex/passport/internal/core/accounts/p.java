package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.internal.analytics.o0;
import defpackage.c5b;
import defpackage.xy0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class p {
    public static final Long[] j = {500L, 1000L, 3000L, 10000L};
    public final k a;
    public final m b;
    public final com.yandex.passport.internal.database.d c;
    public final c d;
    public final l e;
    public final o0 f;
    public final com.yandex.passport.common.a g;
    public final com.yandex.passport.internal.network.mappers.d h;
    public final com.yandex.passport.internal.storage.m i;

    public p(k kVar, m mVar, com.yandex.passport.internal.database.d dVar, c cVar, l lVar, o0 o0Var, com.yandex.passport.common.a aVar, com.yandex.passport.internal.network.mappers.d dVar2, com.yandex.passport.internal.storage.m mVar2) {
        kVar.getClass();
        mVar.getClass();
        dVar.getClass();
        cVar.getClass();
        lVar.getClass();
        o0Var.getClass();
        aVar.getClass();
        dVar2.getClass();
        mVar2.getClass();
        this.a = kVar;
        this.b = mVar;
        this.c = dVar;
        this.d = cVar;
        this.e = lVar;
        this.f = o0Var;
        this.g = aVar;
        this.h = dVar2;
        this.i = mVar2;
    }

    public final boolean a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            com.yandex.passport.internal.b bVar = (com.yandex.passport.internal.b) it.next();
            if (this.h.b(bVar) == null) {
                try {
                    this.e.a(bVar, com.yandex.passport.internal.analytics.j.n, com.yandex.passport.internal.report.reporters.t.j);
                    z = true;
                } catch (com.yandex.passport.common.exception.a e) {
                    com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "repairCorruptedAccounts", e);
                    }
                } catch (com.yandex.passport.data.exceptions.h e2) {
                    com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "repairCorruptedAccounts", e2);
                    }
                } catch (IOException e3) {
                    com.yandex.passport.common.logger.d dVar3 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "repairCorruptedAccounts", e3);
                    }
                } catch (JSONException e4) {
                    com.yandex.passport.common.logger.d dVar4 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "repairCorruptedAccounts", e4);
                    }
                }
            }
        }
        return z;
    }

    public final com.yandex.passport.internal.d b(boolean z) {
        com.yandex.passport.internal.storage.m mVar = this.i;
        o0 o0Var = this.f;
        c cVar = this.d;
        ArrayList b = this.c.b();
        k kVar = this.a;
        ArrayList b2 = kVar.b();
        if (b2.size() < b.size() && !b2.isEmpty() && cVar.c()) {
            o0Var.f(mVar.b(), kVar.c().length, kVar.e(), "retriever");
            Long[] lArr = j;
            for (int i = 0; i < 4; i++) {
                long longValue = lArr[i].longValue();
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "Error retrieve accounts: localAccountRows.size=" + b.size() + ", systemAccountRows.size=" + b2.size(), 8);
                }
                int size = b.size();
                int size2 = b2.size();
                xy0 xy0Var = new xy0(0);
                xy0Var.put("accounts_num", String.valueOf(size));
                xy0Var.put("system_accounts_num", String.valueOf(size2));
                xy0Var.put("timeout", String.valueOf(longValue));
                o0Var.a.b(com.yandex.passport.internal.analytics.j.q, xy0Var);
                this.g.getClass();
                try {
                    Thread.sleep(longValue);
                } catch (InterruptedException e) {
                    com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "call: timeout", e);
                    }
                }
                b2 = kVar.b();
                if (b2.size() == b.size() || b2.isEmpty()) {
                    break;
                }
            }
        }
        if (!b2.isEmpty()) {
            if (a(b2)) {
                b2 = kVar.b();
            }
            cVar.a();
        } else if (!b.isEmpty()) {
            synchronized (cVar.k) {
                cVar.e("AccountsRetriever.retrieve()", b);
            }
            b2 = kVar.b();
            if (a(b2)) {
                b2 = kVar.b();
            }
        }
        List a = z ? c5b.a : this.b.a(b2);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Accounts count = " + b2.size() + ", delayed " + a.size(), 8);
        }
        mVar.l.setValue(mVar, com.yandex.passport.internal.storage.m.m[11], Integer.valueOf(kVar.c().length));
        return new com.yandex.passport.internal.d(CollectionsKt.g0(b2, a), this.h);
    }
}
