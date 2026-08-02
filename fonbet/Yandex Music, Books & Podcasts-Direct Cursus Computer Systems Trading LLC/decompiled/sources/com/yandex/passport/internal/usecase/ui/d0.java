package com.yandex.passport.internal.usecase.ui;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import defpackage.avf;
import defpackage.c5b;
import defpackage.evw;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.v75;
import defpackage.yd5;
import defpackage.z7o;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class d0 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.database.d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.database.d dVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        dVar.getClass();
        this.b = dVar;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        Object obj2;
        c0 c0Var = (c0) obj;
        if (c0Var.c.j().contains(com.yandex.passport.api.n.CHILDISH)) {
            String str = c0Var.a;
            com.yandex.passport.internal.database.d dVar = this.b;
            dVar.getClass();
            str.getClass();
            com.yandex.passport.common.network.n nVar = dVar.f;
            nVar.getClass();
            ArrayList arrayList = new ArrayList();
            Cursor rawQuery = ((SQLiteDatabase) ((evw) nVar.b).invoke()).rawQuery("SELECT * FROM children WHERE parent_name  = ? AND is_deleted = ?", new String[]{str, CommonUrlParts.Values.FALSE_INTEGER});
            try {
                Cursor cursor = rawQuery;
                if (cursor.moveToFirst()) {
                    while (!cursor.isAfterLast()) {
                        arrayList.add(com.yandex.passport.internal.database.g.c(cursor));
                        cursor.moveToNext();
                    }
                    yd5.q(rawQuery, null);
                } else {
                    yd5.q(rawQuery, null);
                }
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.yandex.passport.internal.database.c cVar = (com.yandex.passport.internal.database.c) it.next();
                    com.yandex.passport.common.core.b bVar = c0Var.b;
                    long j = cVar.a;
                    bVar.getClass();
                    arrayList2.add(new com.yandex.passport.common.core.f(bVar, j));
                }
                obj2 = avf.u(arrayList2);
            } finally {
            }
        } else {
            r7o r7oVar = z7o.b;
            obj2 = c5b.a;
        }
        return new z7o(obj2);
    }
}
