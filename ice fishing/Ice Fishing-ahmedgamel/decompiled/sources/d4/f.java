package d4;

import C2.N;
import O.A0;
import O.InterfaceC0345u;
import R3.r;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.view.View;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.icefishingapp.icefishing.adscode.ApplinkActivity;
import j3.InterfaceC4604a;
import j3.m;
import java.util.ArrayList;
import java.util.Set;
import l4.C4664a;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements R3.e, g2.f, InterfaceC4604a, InterfaceC0345u {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37063n;

    public /* synthetic */ f(int i) {
        this.f37063n = i;
    }

    @Override // g2.f
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                Z2.e a9 = Z1.i.a();
                a9.H(rawQuery.getString(1));
                a9.f4172w = j2.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a9.f4171v = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a9.n());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // R3.e
    public Object b(N n9) {
        InterfaceC4450d lambda$getComponents$0;
        switch (this.f37063n) {
            case 0:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(n9);
                return lambda$getComponents$0;
            default:
                Set c9 = n9.c(r.a(C4664a.class));
                l4.c cVar = l4.c.f38918b;
                if (cVar == null) {
                    synchronized (l4.c.class) {
                        try {
                            cVar = l4.c.f38918b;
                            if (cVar == null) {
                                cVar = new l4.c(0);
                                l4.c.f38918b = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new l4.b(c9, cVar);
        }
    }

    @Override // j3.InterfaceC4604a
    public Object h(m mVar) {
        switch (this.f37063n) {
            case 8:
                return 403;
            default:
                return -1;
        }
    }

    @Override // O.InterfaceC0345u
    public A0 q(View view, A0 a02) {
        int i = ApplinkActivity.f36901u;
        G.e f3 = a02.f2027a.f(7);
        view.setPadding(f3.f1005a, f3.f1006b, f3.f1007c, f3.f1008d);
        return a02;
    }
}
