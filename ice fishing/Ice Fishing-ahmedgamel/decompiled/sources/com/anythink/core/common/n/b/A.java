package com.anythink.core.common.n.b;

import E2.M;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import l3.InterfaceC4673a;
import n4.C4773a;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements q, T3.e, i2.f, InterfaceC4673a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f15645n;

    public /* synthetic */ A(int i) {
        this.f15645n = i;
    }

    @Override // i2.f
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                b3.e a9 = b2.i.a();
                a9.H(rawQuery.getString(1));
                a9.f5559w = l2.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a9.f5558v = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a9.o());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // T3.e
    public Object c(M m9) {
        f4.d lambda$getComponents$0;
        switch (this.f15645n) {
            case 1:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(m9);
                return lambda$getComponents$0;
            default:
                Set f2 = m9.f(T3.r.a(C4773a.class));
                n4.c cVar = n4.c.f39656v;
                if (cVar == null) {
                    synchronized (n4.c.class) {
                        try {
                            cVar = n4.c.f39656v;
                            if (cVar == null) {
                                cVar = new n4.c(0);
                                n4.c.f39656v = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new n4.b(f2, cVar);
        }
    }

    @Override // l3.InterfaceC4673a
    public Object g(l3.m mVar) {
        switch (this.f15645n) {
            case 10:
                return 403;
            default:
                return -1;
        }
    }

    @Override // com.anythink.core.common.n.b.q
    public List lookup(String str) {
        List a9;
        a9 = q.a(str);
        return a9;
    }
}
