package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;

/* loaded from: classes11.dex */
public final /* synthetic */ class xka1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ xka1(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        j jVar = this.b;
        switch (i) {
            case 0:
                jVar.dh();
                break;
            case 1:
                svb1 svb1Var = jVar.L;
                g gVar = (g) svb1Var.a;
                aaa1 aaa1Var = gVar.z;
                j jVar2 = gVar.F;
                o5a1 o5a1Var = gVar.x;
                g.g(aaa1Var);
                aaa1Var.Gg();
                if (svb1Var.d()) {
                    if (svb1Var.c()) {
                        g.e(o5a1Var);
                        o5a1Var.Q.p(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        g.f(jVar2);
                        jVar2.Ng("auto", "_cmpx", bundle);
                    } else {
                        g.e(o5a1Var);
                        lxj lxjVar = o5a1Var.Q;
                        String o = lxjVar.o();
                        if (TextUtils.isEmpty(o)) {
                            y1a1 y1a1Var = gVar.y;
                            g.g(y1a1Var);
                            y1a1Var.A.a("Cache still valid but referrer not found");
                        } else {
                            long a = o5a1Var.R.a() / 3600000;
                            Uri parse = Uri.parse(o);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str : parse.getQueryParameterNames()) {
                                bundle2.putString(str, parse.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (a - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            g.f(jVar2);
                            jVar2.Ng(str2, "_cmp", (Bundle) pair.second);
                        }
                        lxjVar.p(null);
                    }
                    g.e(o5a1Var);
                    o5a1Var.R.b(0L);
                    break;
                }
                break;
            default:
                jVar.dh();
                break;
        }
    }
}
