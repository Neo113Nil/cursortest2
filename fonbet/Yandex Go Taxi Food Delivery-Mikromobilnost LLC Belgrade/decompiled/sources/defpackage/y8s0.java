package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.common_models.net.NotificationParams;
import ru.yandex.taxi.common_models.net.map_object.p0;

/* loaded from: classes5.dex */
public final class y8s0 extends c85 {
    public final dqe0 a;
    public final rjt0 b;
    public final tq1 c;
    public final rft0 d;

    public y8s0(dqe0 dqe0Var, rjt0 rjt0Var, tq1 tq1Var, rft0 rft0Var) {
        this.a = dqe0Var;
        this.b = rjt0Var;
        this.c = tq1Var;
        this.d = rft0Var;
    }

    @Override // defpackage.c85
    public final Object c(pm00 pm00Var, Continuation continuation) {
        e(pm00Var.b, (p0) pm00Var.d);
        return zy11.a;
    }

    @Override // defpackage.c85
    public final Object d(wsd0 wsd0Var, Continuation continuation) {
        e(null, (p0) wsd0Var.getAction());
        return zy11.a;
    }

    public final void e(String str, p0 p0Var) {
        String str2;
        String str3 = p0Var.b;
        if ((str3 == null || str3.length() == 0) && ((str2 = p0Var.c) == null || str2.length() == 0)) {
            return;
        }
        tq1 tq1Var = this.c;
        String str4 = p0Var.a;
        if (str4 == null) {
            str4 = "";
        }
        sq1 a = tq1Var.a(str4);
        NotificationParams notificationParams = p0Var.f;
        if (notificationParams == null) {
            NotificationParams.Companion.getClass();
            notificationParams = NotificationParams.f;
        }
        if (a.b(notificationParams)) {
            if (str != null) {
                rjt0 rjt0Var = this.b;
                String str5 = this.a.a.Q;
                i d = ((j) rjt0Var.a).d(b64.j(rjt0Var.o.getModeName(), ".AlertDidShow"));
                if (str5 != null && str5.length() != 0) {
                    d.d("mode", str5);
                }
                d.a.put("pickupPointId", str);
                d.m();
            }
            rft0 rft0Var = this.d;
            String str6 = p0Var.b;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = p0Var.c;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = p0Var.d;
            uqb0 uqb0Var = new uqb0(str6, str7, str8 != null ? str8 : "");
            qht0 qht0Var = (qht0) rft0Var;
            qht0Var.getClass();
            qht0Var.h(new rce0(uqb0Var), new bgc(12));
            a.a();
        }
    }
}
