package com.yandex.passport.internal.sso.announcing;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.yandex.passport.common.network.n;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.analytics.r;
import com.yandex.passport.internal.core.accounts.f;
import com.yandex.passport.internal.core.accounts.p;
import com.yandex.passport.internal.core.accounts.y;
import com.yandex.passport.internal.sso.SsoContentProvider;
import com.yandex.passport.internal.sso.j;
import com.yandex.passport.internal.sso.l;
import defpackage.c5b;
import defpackage.evw;
import defpackage.hrg;
import defpackage.my1;
import defpackage.uah;
import defpackage.v75;
import defpackage.wvs;
import defpackage.x97;
import defpackage.xy0;
import defpackage.yd5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;

/* loaded from: classes4.dex */
public final class c {
    public final f a;
    public final y b;
    public final p c;
    public final com.yandex.passport.internal.helper.a d;
    public final j e;
    public final l f;
    public final o0 g;
    public final com.yandex.passport.internal.network.mappers.d h;

    public c(f fVar, y yVar, p pVar, com.yandex.passport.internal.helper.a aVar, j jVar, l lVar, o0 o0Var, com.yandex.passport.internal.network.mappers.d dVar) {
        fVar.getClass();
        yVar.getClass();
        pVar.getClass();
        aVar.getClass();
        jVar.getClass();
        lVar.getClass();
        o0Var.getClass();
        dVar.getClass();
        this.a = fVar;
        this.b = yVar;
        this.c = pVar;
        this.d = aVar;
        this.e = jVar;
        this.f = lVar;
        this.g = o0Var;
        this.h = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.yandex.passport.internal.sso.b, java.lang.Object] */
    public final ArrayList a() {
        if (this.f.a()) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Sso disabled", 8);
            }
            throw new my1(18);
        }
        ArrayList g = this.c.b(true).g();
        com.yandex.passport.internal.helper.a aVar = this.d;
        n nVar = aVar.a.e;
        nVar.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor query = ((SQLiteDatabase) ((evw) nVar.b).invoke()).query("accounts_last_action", com.yandex.passport.internal.database.tables.a.a, null, null, null, null, null);
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                com.yandex.passport.internal.sso.b k = com.yandex.plus.core.locale.b.k(cursor.getInt(cursor.getColumnIndexOrThrow("timestamp")), cursor.getString(cursor.getColumnIndexOrThrow("uid")), cursor.getString(cursor.getColumnIndexOrThrow("last_action")), cursor.getLong(cursor.getColumnIndexOrThrow("local_timestamp")));
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "getAccountsLastActions: select account row " + k, 8);
                }
                arrayList.add(k);
            }
            yd5.q(query, null);
            ArrayList O = CollectionsKt.O(arrayList);
            ArrayList arrayList2 = new ArrayList(v75.o(O, 10));
            Iterator it = O.iterator();
            while (it.hasNext()) {
                com.yandex.passport.internal.sso.b bVar = (com.yandex.passport.internal.sso.b) it.next();
                arrayList2.add(new Pair(bVar.a, bVar));
            }
            Map n = uah.n(arrayList2);
            ArrayList arrayList3 = new ArrayList(v75.o(g, 10));
            Iterator it2 = g.iterator();
            while (it2.hasNext()) {
                com.yandex.passport.internal.l lVar = (com.yandex.passport.internal.l) it2.next();
                ?? r9 = n.get(lVar.b);
                if (r9 == 0) {
                    r9 = aVar.a(lVar);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "getAccounts(): account found in system but not in actions table, updating: " + r9, 8);
                    }
                    long j = r9.a.b;
                    o0 o0Var = this.g;
                    o0Var.getClass();
                    xy0 xy0Var = new xy0(0);
                    xy0Var.put("uid", Long.toString(j));
                    o0Var.a.b(r.p, xy0Var);
                }
                arrayList3.add(new com.yandex.passport.internal.sso.c((com.yandex.passport.internal.sso.b) r9, this.h.a(lVar)));
            }
            Collection values = n.values();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : values) {
                if (((com.yandex.passport.internal.sso.b) obj).c == com.yandex.passport.internal.sso.a.b) {
                    arrayList4.add(obj);
                }
            }
            ArrayList arrayList5 = new ArrayList(v75.o(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(new com.yandex.passport.internal.sso.c((com.yandex.passport.internal.sso.b) it3.next(), null));
            }
            ArrayList g0 = CollectionsKt.g0(arrayList3, arrayList5);
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.b bVar2 = com.yandex.passport.common.logger.b.b;
                StringBuilder sb = new StringBuilder("getAccounts(): accountList=");
                ArrayList arrayList6 = new ArrayList(v75.o(g0, 10));
                Iterator it4 = g0.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(((com.yandex.passport.internal.sso.c) it4.next()).a);
                }
                sb.append(arrayList6);
                com.yandex.passport.common.logger.a.c(bVar2, null, sb.toString(), 8);
            }
            return g0;
        } finally {
        }
    }

    public final void b(String str, b bVar) {
        List list;
        str.getClass();
        if (this.f.a()) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "SSO is turned off in experiments, skipping sync accounts", 8);
                return;
            }
            return;
        }
        j jVar = this.e;
        jVar.getClass();
        o0 o0Var = jVar.b;
        o0Var.getClass();
        o0Var.i(str, r.k);
        if (jVar.c.b(str)) {
            SsoContentProvider.Method method = SsoContentProvider.Method.GetAccounts;
            Bundle bundle = Bundle.EMPTY;
            bundle.getClass();
            Bundle a = jVar.a(str, method, bundle);
            if (a == null) {
                throw new Exception(hrg.q("Unable to getAccounts from ", str, " : bundle null"));
            }
            if (a.containsKey("error-message")) {
                wvs.p(a.getString("error-message"));
                return;
            }
            Set set = com.yandex.passport.internal.sso.c.c;
            ArrayList v = com.yandex.plus.core.network.api.utils.a.v(a);
            list = v;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.b bVar2 = com.yandex.passport.common.logger.b.b;
                StringBuilder sb = new StringBuilder("getAccounts(): ");
                ArrayList arrayList = new ArrayList(v75.o(v, 10));
                Iterator it = v.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.yandex.passport.internal.sso.c) it.next()).a);
                }
                sb.append(arrayList);
                com.yandex.passport.common.logger.a.c(bVar2, null, sb.toString(), 8);
                list = v;
            }
        } else {
            list = c5b.a;
        }
        c(list, str, bVar);
    }

    public final synchronized void c(List list, String str, b bVar) {
        try {
            list.getClass();
            str.getClass();
            Continuation continuation = null;
            if (this.f.a()) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "SSO is turned off in experiments, skipping sync accounts", 8);
                }
                throw new my1(18);
            }
            ArrayList a = a();
            ArrayList arrayList = new ArrayList(v75.o(a, 10));
            Iterator it = a.iterator();
            while (it.hasNext()) {
                com.yandex.passport.internal.sso.b bVar2 = ((com.yandex.passport.internal.sso.c) it.next()).a;
                arrayList.add(new Pair(bVar2.a, bVar2));
            }
            Map n = uah.n(arrayList);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                com.yandex.passport.internal.sso.c cVar = (com.yandex.passport.internal.sso.c) it2.next();
                com.yandex.passport.internal.sso.b bVar3 = (com.yandex.passport.internal.sso.b) n.get(cVar.a.a);
                com.yandex.passport.internal.b bVar4 = cVar.b;
                com.yandex.passport.internal.l b = bVar4 != null ? this.h.b(bVar4) : null;
                com.yandex.passport.internal.sso.b bVar5 = cVar.a;
                if (bVar3 != null) {
                    int i = bVar3.b;
                    int i2 = bVar5.b;
                    if (i > i2) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Local action newer then remote:\nlocal=" + bVar3 + "\nremoteAction=" + bVar5, 8);
                        }
                        linkedHashMap.put(Long.valueOf(bVar5.a.b), a.d);
                    } else {
                        com.yandex.passport.internal.sso.a aVar = bVar5.c;
                        com.yandex.passport.internal.sso.a aVar2 = com.yandex.passport.internal.sso.a.b;
                        if (aVar == aVar2) {
                            if (bVar3.d > bVar5.d) {
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "ERROR: localAction.localTimestamp > remoteAction.localTimestamp", 8);
                                }
                                linkedHashMap.put(Long.valueOf(bVar5.a.b), a.e);
                            } else if (bVar3.c != aVar2) {
                                try {
                                    this.d.b(bVar5);
                                    x97.D(g.a, new com.yandex.passport.internal.provider.communication.c(this, bVar5.a, continuation, 6));
                                    linkedHashMap.put(Long.valueOf(bVar5.a.b), a.f);
                                } catch (com.yandex.passport.api.exception.b unused) {
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "Remove account failed: account with uid " + bVar5.a + " not found", 8);
                                    }
                                    linkedHashMap.put(Long.valueOf(bVar5.a.b), a.g);
                                }
                            } else {
                                linkedHashMap.put(Long.valueOf(bVar5.a.b), a.h);
                            }
                        } else if (b == null) {
                            linkedHashMap.put(Long.valueOf(bVar5.a.b), a.i);
                        } else if (i < i2) {
                            this.d.b(bVar5);
                            this.a.b(b, com.yandex.passport.internal.analytics.p.d, false);
                            linkedHashMap.put(Long.valueOf(bVar5.a.b), a.j);
                        } else {
                            long j = bVar3.d;
                            long j2 = bVar5.d;
                            if (j == j2) {
                                linkedHashMap.put(Long.valueOf(bVar5.a.b), a.k);
                            } else if (j > j2) {
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "ERROR: localAction.localTimestamp > remoteAction.localTimestamp", 8);
                                }
                                linkedHashMap.put(Long.valueOf(bVar5.a.b), a.l);
                            } else {
                                this.d.b(bVar5);
                                this.a.b(b, com.yandex.passport.internal.analytics.p.d, false);
                                linkedHashMap.put(Long.valueOf(bVar5.a.b), a.m);
                            }
                        }
                    }
                } else if (bVar5.c == com.yandex.passport.internal.sso.a.b) {
                    this.d.b(bVar5);
                    x97.D(g.a, new com.yandex.passport.internal.provider.communication.c(this, bVar5.a, continuation, 6));
                    linkedHashMap.put(Long.valueOf(bVar5.a.b), a.a);
                } else if (b == null) {
                    linkedHashMap.put(Long.valueOf(bVar5.a.b), a.b);
                } else {
                    this.d.b(bVar5);
                    this.a.b(b, com.yandex.passport.internal.analytics.p.d, false);
                    linkedHashMap.put(Long.valueOf(bVar5.a.b), a.c);
                }
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList2.add(new Pair(String.valueOf(((Number) entry.getKey()).longValue()), ((a) entry.getValue()).toString()));
            }
            Map n2 = uah.n(arrayList2);
            o0 o0Var = this.g;
            String name = bVar.name();
            o0Var.getClass();
            name.getClass();
            n2.getClass();
            xy0 xy0Var = new xy0(0);
            xy0Var.put("remote_package_name", str);
            xy0Var.put("source", name);
            xy0Var.putAll(n2);
            o0Var.a.b(r.i, xy0Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
