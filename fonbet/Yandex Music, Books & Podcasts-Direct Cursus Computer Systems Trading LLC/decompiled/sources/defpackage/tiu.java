package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.database.sqlite.SQLiteDatabase;
import android.telephony.SubscriptionManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.C0204dg;
import io.appmetrica.analytics.impl.C0335i3;
import io.appmetrica.analytics.impl.C0415kq;
import io.appmetrica.analytics.impl.C0615ro;
import io.appmetrica.analytics.impl.C0643sn;
import io.appmetrica.analytics.impl.Cdo;
import io.appmetrica.analytics.impl.InterfaceC0463mg;
import io.appmetrica.analytics.impl.InterfaceC0502nq;
import io.appmetrica.analytics.impl.V0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.kinopoisk.sdk.easylogin.internal.C1106k5;

/* loaded from: classes.dex */
public final /* synthetic */ class tiu implements yyc, n0f, z0t, vp3, InterfaceC0463mg, FunctionWithThrowable, nd, InterfaceC0502nq {
    public final /* synthetic */ int a;

    public /* synthetic */ tiu(int i) {
        this.a = i;
    }

    public static /* synthetic */ void e(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static /* synthetic */ void g(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalArgumentException(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void i(String str) {
        throw new cdx(str);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IOException(str + obj);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0463mg
    public Cdo a(V0 v0) {
        switch (this.a) {
            case 13:
                return C0204dg.a(v0);
            default:
                return C0204dg.b(v0);
        }
    }

    @Override // defpackage.yyc
    public Object apply(Object obj) {
        Boolean a;
        List a2;
        switch (this.a) {
            case 4:
                List list = (List) obj;
                if (list == null) {
                    return null;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((s4w) it.next()).a());
                }
                return arrayList;
            case 15:
                a = C0335i3.a((ActivityManager) obj);
                return a;
            case 17:
                return C0415kq.b((Activity) obj);
            default:
                a2 = C0615ro.a((SubscriptionManager) obj);
                return a2;
        }
    }

    @Override // defpackage.n0f
    public Integer b(Object obj) {
        return Integer.valueOf(((h6w) obj).a);
    }

    @Override // defpackage.vp3
    public String f(nb7 nb7Var) {
        nb7Var.getClass();
        return nb7Var.a.buildUpon().clearQuery().build().toString();
    }

    @Override // defpackage.nd
    /* renamed from: run */
    public void mo32run() {
        C1106k5.c();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0502nq
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return C0643sn.a(sQLiteDatabase);
    }

    @Override // defpackage.z0t
    public void a() {
        int i = b9w.n;
    }
}
