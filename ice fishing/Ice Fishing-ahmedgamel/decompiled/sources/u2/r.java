package u2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2991bm;
import com.google.android.gms.internal.ads.C3709p5;
import com.google.android.gms.internal.ads.V2;
import com.google.android.gms.internal.ads.V4;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static S0.q f41310a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f41311b = new Object();

    public r(Context context) {
        S0.q qVar;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f41311b) {
            try {
                if (f41310a == null) {
                    AbstractC3569ma.a(context);
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32337p5)).booleanValue()) {
                        qVar = k.W(context);
                    } else {
                        qVar = new S0.q(new C3709p5(new S0.c(context.getApplicationContext(), 9)), new C2991bm(new V2(20)));
                        qVar.n();
                    }
                    f41310a = qVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final p a(int i, String str, HashMap hashMap, byte[] bArr) {
        p pVar = new p();
        m1.e eVar = new m1.e();
        eVar.f39302u = str;
        eVar.f39301n = pVar;
        Objects.requireNonNull(this);
        v2.f fVar = new v2.f();
        o oVar = new o(this, i, str, pVar, eVar, bArr, hashMap, fVar);
        if (v2.f.c()) {
            try {
                Map e9 = oVar.e();
                byte[] bArr2 = bArr == null ? null : bArr;
                if (v2.f.c()) {
                    fVar.e("onNetworkRequest", new S0.i(str, "GET", e9, bArr2, 8));
                }
            } catch (V4 e10) {
                String message = e10.getMessage();
                int i6 = z.f41322b;
                v2.i.f(message);
            }
        }
        f41310a.o(oVar);
        return pVar;
    }
}
