package defpackage;

import android.os.Bundle;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.chat.notifications.a;

/* loaded from: classes15.dex */
public final class wz60 extends ky4 {
    public final Bundle y;

    public wz60(ChatRequest chatRequest, Bundle bundle) {
        super(chatRequest);
        this.y = bundle;
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        a aVar = (a) ((m8g) s020Var).J.get();
        aVar.getClass();
        yh60 a = mtb1.a(this.y);
        m5g0 m5g0Var = a.c;
        boolean z = a.b;
        bj60 g = aVar.g(m5g0Var, z);
        try {
            g.d("notification_dismissed", a.a);
            if (!z) {
                piv0 piv0Var = aVar.g;
                int d = aVar.d();
                String c = aVar.c();
                pnt0 pnt0Var = piv0Var.k;
                if (pnt0Var != null) {
                    int c2 = cvw.c(pnt0Var.b, pnt0Var.w, d);
                    if (c2 >= 0) {
                        Object[] objArr = pnt0Var.c;
                        Object obj = objArr[c2];
                        Object obj2 = kp50.b;
                        if (obj != obj2) {
                            objArr[c2] = obj2;
                            pnt0Var.a = true;
                        }
                    }
                    piv0Var.c(piv0Var.k, c, m5g0Var);
                }
            }
        } catch (Throwable th) {
            g.b("notification_dismiss_error", th);
        }
        h();
    }
}
