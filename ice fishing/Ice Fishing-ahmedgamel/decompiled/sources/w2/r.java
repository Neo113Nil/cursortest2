package w2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3067cm;
import com.google.android.gms.internal.ads.C3732p5;
import com.google.android.gms.internal.ads.LP;
import com.google.android.gms.internal.ads.V2;
import com.google.android.gms.internal.ads.V4;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static S0.q f41700a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f41701b = new Object();

    public r(Context context) {
        S0.q qVar;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f41701b) {
            try {
                if (f41700a == null) {
                    AbstractC3592ma.a(context);
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33117p5)).booleanValue()) {
                        qVar = k.L(context);
                    } else {
                        qVar = new S0.q(new C3732p5(new S0.c(12, (Object) context.getApplicationContext(), false)), new C3067cm(new V2(20)));
                        qVar.n();
                    }
                    f41700a = qVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final p a(int i, String str, HashMap hashMap, byte[] bArr) {
        p pVar = new p();
        LP lp = new LP(this, str, pVar);
        x2.f fVar = new x2.f();
        o oVar = new o(this, i, str, pVar, lp, bArr, hashMap, fVar);
        if (x2.f.c()) {
            try {
                Map e9 = oVar.e();
                byte[] bArr2 = bArr == null ? null : bArr;
                if (x2.f.c()) {
                    fVar.e("onNetworkRequest", new S0.i(str, "GET", e9, bArr2, 8));
                }
            } catch (V4 e10) {
                String message = e10.getMessage();
                int i4 = z.f41712b;
                x2.i.f(message);
            }
        }
        f41700a.o(oVar);
        return pVar;
    }
}
