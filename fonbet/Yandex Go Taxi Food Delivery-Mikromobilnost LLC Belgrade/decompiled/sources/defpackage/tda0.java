package defpackage;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.yandex.go.payments.data.k;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.paymentlist.data.c;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class tda0 implements d170 {
    public final c a;
    public final k b;
    public final wsx c;

    public tda0(c cVar, k kVar, wsx wsxVar) {
        this.a = cVar;
        this.b = kVar;
        this.c = wsxVar;
    }

    @Override // defpackage.d170
    public final Object a(Continuation continuation) {
        r0 r0Var;
        Object value;
        c cVar = this.a;
        cVar.s.evictAll();
        fga0 fga0Var = cVar.g;
        fga0Var.A();
        kjz kjzVar = fga0Var.b;
        ((pme0) ((i3y) kjzVar.b).getValue()).a(null);
        pz40 pz40Var = (pz40) ((i3y) kjzVar.c).getValue();
        do {
            r0Var = (r0) pz40Var;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new vda0(PaymentMethods.x, SystemClock.elapsedRealtime())));
        fga0Var.a.w(fga0Var.t);
        Iterator it = PaymentMethod$Type.f().iterator();
        while (it.hasNext()) {
            fga0Var.C((PaymentMethod$Type) it.next(), null);
        }
        k kVar = this.b;
        cne0 a = kVar.a();
        Set e = kVar.a().e();
        SharedPreferences.Editor d = a.d();
        Iterator it2 = e.iterator();
        while (it2.hasNext()) {
            d.remove((String) it2.next());
        }
        d.commit();
        this.c.a.w("last_payment_method_last_applied_updated_at_ms");
        return zy11.a;
    }
}
