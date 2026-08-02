package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.text.c;
import okhttp3.OkHttpClient;

/* loaded from: classes6.dex */
public final class pyi implements ds3 {
    public final znk a;
    public final tjl b;
    public final OkHttpClient c;

    public pyi(OkHttpClient okHttpClient, pt0 pt0Var) {
        znk znkVar = new znk(24);
        tjl tjlVar = new tjl();
        okHttpClient.getClass();
        pt0Var.getClass();
        this.a = znkVar;
        this.b = tjlVar;
        qyi qyiVar = new qyi(pt0Var);
        iib iibVar = okHttpClient.e;
        if (iibVar instanceof hr5) {
            this.c = okHttpClient;
            return;
        }
        joj c = okHttpClient.c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(qyiVar);
        iibVar.getClass();
        arrayList.add(iibVar);
        c.e = new hr5(arrayList);
        this.c = new OkHttpClient(c);
    }

    @Override // defpackage.ds3
    public final es3 b(d0o d0oVar) {
        boolean z;
        d0oVar.getClass();
        u7e u7eVar = d0oVar.a;
        znk znkVar = this.a;
        znkVar.getClass();
        u7eVar.getClass();
        String b = u7eVar.b();
        Locale locale = Locale.ENGLISH;
        String s = ouj.s(locale, b, locale);
        Set set = (Set) znkVar.b;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (c.n(s, (String) it.next(), false)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        Log.d("DefaultIsNeedAddTInUrlChecker", z + " -> " + u7eVar);
        if (z) {
            s7e f = u7eVar.f();
            this.b.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            SystemClock.uptimeMillis();
            f.d("t", String.valueOf(currentTimeMillis));
            u7eVar = f.e();
        }
        b0o b2 = d0oVar.b();
        u7eVar.getClass();
        b2.a = u7eVar;
        d0o b3 = b2.b();
        OkHttpClient okHttpClient = this.c;
        okHttpClient.getClass();
        return new mkn(okHttpClient, b3, false);
    }
}
