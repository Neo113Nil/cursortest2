package com.yandex.passport.internal.core.accounts;

import android.accounts.Account;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import com.yandex.passport.internal.analytics.o0;
import defpackage.bz2;
import defpackage.e5b;
import defpackage.f1d;
import defpackage.hrg;
import defpackage.jp0;
import defpackage.ouj;
import defpackage.s9f;
import defpackage.xy0;
import defpackage.zqf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class c {
    public final k a;
    public final m b;
    public final com.yandex.passport.internal.database.d c;
    public final com.yandex.passport.internal.core.sync.b d;
    public final zqf e;
    public final com.yandex.passport.internal.storage.m f;
    public final o0 g;
    public final com.yandex.passport.internal.properties.x h;
    public final com.yandex.passport.internal.flags.i i;
    public final Object j;
    public final Object k;

    public c(k kVar, m mVar, com.yandex.passport.internal.database.d dVar, com.yandex.passport.internal.core.sync.b bVar, zqf zqfVar, com.yandex.passport.internal.storage.m mVar2, o0 o0Var, com.yandex.passport.internal.properties.x xVar, com.yandex.passport.internal.flags.i iVar) {
        kVar.getClass();
        mVar.getClass();
        dVar.getClass();
        bVar.getClass();
        zqfVar.getClass();
        mVar2.getClass();
        o0Var.getClass();
        xVar.getClass();
        iVar.getClass();
        this.a = kVar;
        this.b = mVar;
        this.c = dVar;
        this.d = bVar;
        this.e = zqfVar;
        this.f = mVar2;
        this.g = o0Var;
        this.h = xVar;
        this.i = iVar;
        this.j = new Object();
        this.k = new Object();
    }

    public final com.yandex.passport.internal.c a() {
        com.yandex.passport.internal.c b;
        synchronized (this.j) {
            b = b(this.a.b(), this.c.b());
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.yandex.passport.internal.c b(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        String str2;
        String str3;
        boolean z;
        ArrayList g0 = CollectionsKt.g0(arrayList, this.b.a(arrayList));
        boolean z2 = false;
        xy0 xy0Var = new xy0(0);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.yandex.passport.internal.b bVar = (com.yandex.passport.internal.b) it.next();
            xy0Var.put(bVar.a, bVar);
        }
        xy0 xy0Var2 = new xy0(0);
        Iterator it2 = g0.iterator();
        while (it2.hasNext()) {
            com.yandex.passport.internal.b bVar2 = (com.yandex.passport.internal.b) it2.next();
            xy0Var2.put(bVar2.a, bVar2);
        }
        int size = g0.size() + arrayList2.size();
        HashSet hashSet = new HashSet(size);
        hashSet.addAll(xy0Var.keySet());
        hashSet.addAll(xy0Var2.keySet());
        ArrayList arrayList3 = new ArrayList(size);
        ArrayList arrayList4 = new ArrayList(size);
        ArrayList arrayList5 = new ArrayList(size);
        ArrayList arrayList6 = new ArrayList(size);
        ArrayList arrayList7 = new ArrayList(size);
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            String str4 = (String) it3.next();
            com.yandex.passport.internal.b bVar3 = (com.yandex.passport.internal.b) xy0Var.get(str4);
            com.yandex.passport.internal.b bVar4 = (com.yandex.passport.internal.b) xy0Var2.get(str4);
            boolean z3 = (bVar3 != null || bVar4 == null) ? z2 : true;
            boolean z4 = (bVar3 == null || bVar4 == null || bVar3.equals(bVar4)) ? z2 : true;
            if (z4) {
                bVar3.getClass();
                String str5 = bVar3.b;
                if (str5 == null) {
                    str5 = "";
                }
                bVar4.getClass();
                String str6 = bVar4.b;
                if (str6 == null) {
                    str6 = "";
                }
                if (!str5.equals(str6)) {
                    z = true;
                    boolean z5 = bVar3 == null && bVar4 == null;
                    if (z3) {
                        if (z4) {
                            if (bVar4 != null) {
                                arrayList4.add(bVar4);
                            }
                        } else if (z5) {
                            if (bVar3 != null) {
                                arrayList6.add(bVar3);
                            }
                        } else if (bVar3 != null) {
                            arrayList7.add(bVar3);
                        }
                    } else if (bVar4 != null) {
                        arrayList3.add(bVar4);
                    }
                    if (z && bVar4 != null) {
                        arrayList5.add(bVar4);
                    }
                    z2 = false;
                }
            }
            z = false;
            if (bVar3 == null) {
            }
            if (z3) {
            }
            if (z) {
                arrayList5.add(bVar4);
            }
            z2 = false;
        }
        com.yandex.passport.internal.c cVar = new com.yandex.passport.internal.c(arrayList3, arrayList4, arrayList5, arrayList6, arrayList7);
        com.yandex.passport.internal.database.d dVar = this.c;
        dVar.getClass();
        com.yandex.passport.internal.database.a aVar = dVar.d;
        aVar.getClass();
        if (cVar.a()) {
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) aVar.b.invoke();
            Iterator it4 = arrayList3.iterator();
            boolean z6 = false;
            while (it4.hasNext()) {
                com.yandex.passport.internal.b bVar5 = (com.yandex.passport.internal.b) it4.next();
                long d = com.yandex.passport.internal.database.g.d(sQLiteDatabase, "accounts", aVar.c(bVar5));
                z6 = z6 || d != -1;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.b bVar6 = com.yandex.passport.common.logger.b.b;
                    if (d == -1) {
                        str3 = "mergeAccountRows: can't insert " + bVar5;
                    } else {
                        str3 = "mergeAccountRows: inserted " + bVar5;
                    }
                    com.yandex.passport.common.logger.a.c(bVar6, null, str3, 8);
                }
                com.yandex.passport.internal.l b = aVar.g.b(bVar5);
                if (b != null && b.d.a == null) {
                    aVar.c.a(b.b);
                }
            }
            Iterator it5 = cVar.b.iterator();
            while (it5.hasNext()) {
                com.yandex.passport.internal.b bVar7 = (com.yandex.passport.internal.b) it5.next();
                int update = sQLiteDatabase.update("accounts", aVar.c(bVar7), "name = ?", new String[]{bVar7.a});
                z6 = z6 || update > 0;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.b bVar8 = com.yandex.passport.common.logger.b.b;
                    if (update == 0) {
                        str2 = "mergeAccountRows: can't update " + bVar7;
                    } else {
                        str2 = "mergeAccountRows: updated " + bVar7;
                    }
                    com.yandex.passport.common.logger.a.c(bVar8, null, str2, 8);
                }
                com.yandex.passport.internal.l b2 = aVar.g.b(bVar7);
                if (b2 != null && b2.d.a == null) {
                    aVar.c.a(b2.b);
                }
            }
            Iterator it6 = cVar.d.iterator();
            while (it6.hasNext()) {
                com.yandex.passport.internal.b bVar9 = (com.yandex.passport.internal.b) it6.next();
                bVar9.getClass();
                int delete = sQLiteDatabase.delete("accounts", "name = ?", new String[]{bVar9.a});
                z6 = z6 || delete > 0;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.b bVar10 = com.yandex.passport.common.logger.b.b;
                    if (delete == 0) {
                        str = "mergeAccountRows: can't delete " + bVar9;
                    } else {
                        str = "mergeAccountRows: deleted " + bVar9;
                    }
                    com.yandex.passport.common.logger.a.c(bVar10, null, str, 8);
                }
                com.yandex.passport.internal.l b3 = aVar.g.b(bVar9);
                if (b3 != null) {
                    aVar.c.a(b3.b);
                }
            }
            Iterator it7 = cVar.e.iterator();
            while (it7.hasNext()) {
                com.yandex.passport.internal.b bVar11 = (com.yandex.passport.internal.b) it7.next();
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "mergeAccountRows: skipped " + bVar11, 8);
                }
            }
            if (z6) {
                aVar.j = null;
            }
        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "mergeAccountRows: no difference", 8);
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            this.d.a(((com.yandex.passport.internal.b) it8.next()).d());
        }
        return cVar;
    }

    public final boolean c() {
        String e = this.a.e();
        com.yandex.passport.internal.storage.m mVar = this.f;
        String str = (String) mVar.e.getValue(mVar, com.yandex.passport.internal.storage.m.m[3]);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, hrg.r("isAuthenticatorChanged: current=", e, " last=", str), 8);
        }
        return !TextUtils.equals(e, str);
    }

    public final void d(String str) {
        com.yandex.passport.internal.storage.m mVar = this.f;
        k kVar = this.a;
        Account[] c = kVar.c();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "restore: systemAccounts.length=" + c.length + " from=" + str, 8);
        }
        if (c.length == 0) {
            ArrayList b = this.c.b();
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "restore: localAccountRows.size()=" + b.size() + " from=" + str, 8);
            }
            if (!b.isEmpty()) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "restore: restoreAccountRows: from=".concat(str), 8);
                }
                synchronized (this.k) {
                    e(str, b);
                }
            }
        }
        if ("android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(str)) {
            String e = kVar.e();
            jp0 jp0Var = mVar.e;
            s9f[] s9fVarArr = com.yandex.passport.internal.storage.m.m;
            if (e.equals((String) jp0Var.getValue(mVar, s9fVarArr[3]))) {
                return;
            }
            this.g.f(mVar.b(), kVar.c().length, e, "backuper");
            mVar.l.setValue(mVar, s9fVarArr[11], Integer.valueOf(kVar.c().length));
            mVar.e.setValue(mVar, s9fVarArr[3], e);
        }
    }

    public final void e(String str, ArrayList arrayList) {
        String str2;
        int R;
        com.yandex.passport.common.core.b bVar;
        boolean c = c();
        o0 o0Var = this.g;
        k kVar = this.a;
        boolean z = false;
        if (!c) {
            com.yandex.passport.internal.flags.k kVar2 = com.yandex.passport.internal.flags.o.r0;
            com.yandex.passport.internal.flags.i iVar = this.i;
            if (!((List) iVar.b(kVar2)).contains(Build.MODEL)) {
                boolean z2 = ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.x0)).booleanValue() && this.f.b() != 0 && kVar.c().length == 0;
                if (z2) {
                    com.yandex.passport.internal.analytics.w wVar = o0Var.a;
                    com.yandex.passport.internal.analytics.l lVar = com.yandex.passport.internal.analytics.l.s;
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    wVar.b(lVar, e5bVar);
                }
                if (!z2) {
                    return;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (true) {
            com.yandex.passport.common.core.f fVar = null;
            if (!it.hasNext()) {
                break;
            }
            com.yandex.passport.internal.b bVar2 = (com.yandex.passport.internal.b) it.next();
            bz2 bz2Var = this.h.v ? new bz2(new Account("SaveLocal", "type"), z, 22) : kVar.a(bVar2);
            if (bz2Var.b) {
                this.d.a((Account) bz2Var.c);
            } else {
                String str3 = bVar2.c;
                if (str3 != null && (R = StringsKt.R(str3, ':', 0, false)) >= 1 && R != str3.length() - 1) {
                    String substring = str3.substring(0, R);
                    try {
                        long parseLong = Long.parseLong(str3.substring(R + 1));
                        if (parseLong > 0) {
                            try {
                                com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
                                int parseInt = Integer.parseInt(substring);
                                aVar.getClass();
                                bVar = com.yandex.passport.common.core.a.b(parseInt);
                            } catch (Exception unused) {
                                bVar = com.yandex.passport.common.core.b.c;
                            }
                            fVar = new com.yandex.passport.common.core.f(bVar, parseLong);
                        }
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (fVar == null || (str2 = Long.valueOf(fVar.b).toString()) == null) {
                    str2 = bVar2.c;
                }
                hashSet.add(str2);
            }
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.b bVar3 = com.yandex.passport.common.logger.b.b;
            StringBuilder u = ouj.u("restoreAccountRows: from=", str, " accounts.size()=");
            u.append(arrayList.size());
            u.append(" failed: ");
            u.append(hashSet);
            com.yandex.passport.common.logger.a.c(bVar3, null, u.toString(), 8);
        }
        int size = arrayList.size();
        o0Var.getClass();
        com.yandex.passport.internal.analytics.w wVar2 = o0Var.a;
        xy0 xy0Var = new xy0(0);
        xy0Var.put("from", str);
        xy0Var.put("accounts_num", String.valueOf(size));
        xy0Var.put("restoration_failed_uids", hashSet.isEmpty() ? "none" : TextUtils.join(", ", hashSet));
        wVar2.b(com.yandex.passport.internal.analytics.j.o, xy0Var);
        int size2 = arrayList.size();
        int length = kVar.c().length;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, f1d.e(length, size2, "reportRestoredAccounts: systemAccountsSize=", " localAccountSize="), 8);
        }
        if (size2 != length) {
            xy0 xy0Var2 = new xy0(0);
            xy0Var2.put("accounts_num", String.valueOf(size2));
            xy0Var2.put("system_accounts_num", String.valueOf(length));
            wVar2.b(com.yandex.passport.internal.analytics.j.p, xy0Var2);
        }
        com.yandex.passport.internal.core.announcing.b bVar4 = (com.yandex.passport.internal.core.announcing.b) this.e.get();
        bVar4.getClass();
        bVar4.a(true);
        bVar4.a.b(com.yandex.passport.internal.analytics.j.k);
    }
}
