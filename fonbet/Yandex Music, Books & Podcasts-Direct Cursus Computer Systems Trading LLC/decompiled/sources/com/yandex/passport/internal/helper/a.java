package com.yandex.passport.internal.helper;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.passport.common.network.n;
import com.yandex.passport.internal.l;
import defpackage.evw;
import defpackage.yd5;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class a {
    public final com.yandex.passport.internal.database.d a;
    public final com.yandex.passport.common.a b;
    public final com.yandex.passport.internal.network.mappers.d c;

    public a(com.yandex.passport.internal.database.d dVar, com.yandex.passport.common.a aVar, com.yandex.passport.internal.network.mappers.d dVar2) {
        dVar.getClass();
        aVar.getClass();
        dVar2.getClass();
        this.a = dVar;
        this.b = aVar;
        this.c = dVar2;
    }

    public final com.yandex.passport.internal.sso.b a(l lVar) {
        com.yandex.passport.internal.sso.b bVar;
        int i;
        lVar.getClass();
        com.yandex.passport.common.core.f fVar = lVar.b;
        com.yandex.passport.common.core.g gVar = lVar.e;
        com.yandex.passport.internal.sso.b d = d(fVar);
        com.yandex.passport.common.a aVar = this.b;
        if (d != null) {
            int i2 = d.b;
            if (d.c != com.yandex.passport.internal.sso.a.b) {
                if (lVar.d.a == null) {
                    return d;
                }
                int i3 = gVar.u;
                if (i2 != i3) {
                    if (i2 <= i3) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Sso: current timestamp < accountTimestamp # updating timestamp", 8);
                        }
                        i = i3;
                        com.yandex.passport.common.core.f fVar2 = lVar.b;
                        com.yandex.passport.internal.sso.a aVar2 = com.yandex.passport.internal.sso.a.a;
                        aVar.getClass();
                        bVar = new com.yandex.passport.internal.sso.b(fVar2, i, aVar2, System.currentTimeMillis());
                        b(bVar);
                        return bVar;
                    }
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "Sso: current timestamp > accountTimestamp", 8);
                    }
                }
                i = i2;
                com.yandex.passport.common.core.f fVar22 = lVar.b;
                com.yandex.passport.internal.sso.a aVar22 = com.yandex.passport.internal.sso.a.a;
                aVar.getClass();
                bVar = new com.yandex.passport.internal.sso.b(fVar22, i, aVar22, System.currentTimeMillis());
                b(bVar);
                return bVar;
            }
        }
        com.yandex.passport.common.core.f fVar3 = lVar.b;
        int i4 = gVar.u;
        com.yandex.passport.internal.sso.a aVar3 = com.yandex.passport.internal.sso.a.a;
        aVar.getClass();
        bVar = new com.yandex.passport.internal.sso.b(fVar3, i4, aVar3, System.currentTimeMillis());
        b(bVar);
        return bVar;
    }

    public final void b(com.yandex.passport.internal.sso.b bVar) {
        bVar.getClass();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Sso: Write account action: " + bVar, 8);
        }
        com.yandex.passport.internal.database.d dVar = this.a;
        dVar.getClass();
        n nVar = dVar.e;
        nVar.getClass();
        com.yandex.passport.internal.sso.a aVar = bVar.c;
        int i = bVar.b;
        com.yandex.passport.common.core.f fVar = bVar.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "addOrUpdateAccountLastAction: uid=" + fVar + " timestamp=" + i + " lastAction=" + aVar, 8);
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((evw) nVar.c).invoke();
        ContentValues contentValues = new ContentValues();
        fVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(fVar.a.a);
        sb.append(':');
        sb.append(fVar.b);
        contentValues.put("uid", sb.toString());
        contentValues.put("timestamp", Integer.valueOf(i));
        contentValues.put("last_action", aVar.name());
        contentValues.put("local_timestamp", Long.valueOf(bVar.d));
        long e = com.yandex.passport.internal.database.g.e(sQLiteDatabase, "accounts_last_action", contentValues);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "addOrUpdateAccountLastAction: uid=" + fVar + " rowid=" + e, 8);
        }
    }

    public final void c(com.yandex.passport.internal.c cVar) {
        com.yandex.passport.internal.network.mappers.d dVar;
        ArrayList arrayList = cVar.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            dVar = this.c;
            if (!hasNext) {
                break;
            }
            l b = dVar.b((com.yandex.passport.internal.b) it.next());
            if (b != null) {
                arrayList2.add(b);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            a((l) it2.next());
        }
        ArrayList arrayList3 = cVar.d;
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            l b2 = dVar.b((com.yandex.passport.internal.b) it3.next());
            if (b2 != null) {
                arrayList4.add(b2);
            }
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            l lVar = (l) it4.next();
            lVar.getClass();
            com.yandex.passport.common.core.f fVar = lVar.b;
            com.yandex.passport.internal.sso.b d = d(fVar);
            int i = d != null ? d.b : lVar.e.u;
            com.yandex.passport.internal.sso.a aVar = com.yandex.passport.internal.sso.a.b;
            this.b.getClass();
            b(new com.yandex.passport.internal.sso.b(fVar, i, aVar, System.currentTimeMillis()));
        }
        ArrayList arrayList5 = cVar.b;
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            l b3 = dVar.b((com.yandex.passport.internal.b) it5.next());
            if (b3 != null) {
                arrayList6.add(b3);
            }
        }
        Iterator it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            a((l) it6.next());
        }
    }

    public final com.yandex.passport.internal.sso.b d(com.yandex.passport.common.core.f fVar) {
        com.yandex.passport.internal.sso.b bVar;
        fVar.getClass();
        com.yandex.passport.internal.database.d dVar = this.a;
        dVar.getClass();
        n nVar = dVar.e;
        nVar.getClass();
        Cursor query = ((SQLiteDatabase) ((evw) nVar.b).invoke()).query("accounts_last_action", com.yandex.passport.internal.database.tables.a.a, "uid = ?", com.yandex.passport.internal.database.g.f(fVar), null, null, null);
        try {
            Cursor cursor = query;
            if (cursor.moveToNext()) {
                bVar = com.yandex.plus.core.locale.b.k(cursor.getInt(cursor.getColumnIndexOrThrow("timestamp")), cursor.getString(cursor.getColumnIndexOrThrow("uid")), cursor.getString(cursor.getColumnIndexOrThrow("last_action")), cursor.getLong(cursor.getColumnIndexOrThrow("local_timestamp")));
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "getLastAction: select account row " + bVar, 8);
                }
            } else {
                bVar = null;
            }
            yd5.q(query, null);
            return bVar;
        } finally {
        }
    }
}
