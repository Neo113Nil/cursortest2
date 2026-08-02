package defpackage;

import android.content.SharedPreferences;
import android.os.Parcelable;
import com.connectsdk.service.DeviceService;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class w03 {
    public final n23 a;
    public final t23 b;
    public final gek c;
    public x7o d;

    public w03(n23 n23Var, t23 t23Var, gek gekVar, SharedPreferences sharedPreferences) {
        this.a = n23Var;
        this.b = t23Var;
        this.c = gekVar;
    }

    public final void a(x7o x7oVar) {
        if (this.d != null) {
            Parcelable.Creator<bfk> creator = bfk.CREATOR;
            x7oVar.x(y7g.F("Failed to bind card. \"bindCompletion\" is not null"));
        } else {
            this.d = x7oVar;
            this.c.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(String str, Function1 function1, x7o x7oVar) {
        jzi jziVar = new jzi();
        jziVar.a = (uif) function1;
        t23 t23Var = this.b;
        g0c g0cVar = t23Var.k;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Привязка СБП токена", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(k, "event_name", "bind_sbp_token", "bind_sbp_token", k);
        l9i l9iVar = t23Var.f;
        yop a = mif.a(l9iVar.a.C(new j13(str, 0, 0 == true ? 1 : 0), vsf.X, p1j.a), new al(19, jziVar, t23Var), null, 5);
        ((x60) g0cVar).b(j, a);
        mif.b(mif.b(a, new pl2(x7oVar, 2), null, 5), lhb.y0, new pl2(x7oVar, 3), 1);
    }

    public final void c() {
        t23 t23Var = this.a.a;
        n20 n20Var = t23Var.o;
        if (n20Var != null) {
            n20Var.a = true;
        }
        t23Var.o = null;
        t23 t23Var2 = this.b;
        n20 n20Var2 = t23Var2.o;
        if (n20Var2 != null) {
            n20Var2.a = true;
        }
        t23Var2.o = null;
    }

    public final void d(String str, String str2, x7o x7oVar) {
        x7oVar.getClass();
        t23 t23Var = this.b;
        g0c g0cVar = t23Var.k;
        String r = hrg.r("Пользователь запросил повторно отправить код, sbp_token_id = ", str, ", verification_id = ", str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("sbp_token_id", new jkr(str));
        linkedHashMap.put("verification_id", new jkr(str2));
        vtm k = su4.k(r, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(k, "event_name", "verification_resend_code", "verification_resend_code", k);
        l9i l9iVar = t23Var.f;
        yop a = mif.a(l9iVar.a.C(new n0u(str, str2, "", za4.smsChallenge, true), k9i.v, p1j.a), rq1.L, null, 5);
        ((x60) g0cVar).b(j, a);
        mif.b(mif.b(a, new pl2(x7oVar, 4), null, 5), lhb.y0, new pl2(x7oVar, 5), 1);
    }

    public final void e(hw3 hw3Var, x7o x7oVar) {
        s8 a;
        String str = hw3Var.a;
        pt0 pt0Var = new pt0(this.c, x7oVar);
        str.getClass();
        t23 t23Var = this.a.a;
        jzi jziVar = new jzi(pt0Var);
        g0c g0cVar = t23Var.k;
        boolean z = t23Var.j;
        String concat = "Подтвердить карту ".concat(str);
        if (z) {
            concat = concat.concat(", с использованием поллинга");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("card_id", new jkr(str));
        linkedHashMap.put("use_verification_polling", new mc3(z));
        vtm k = su4.k(concat, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(k, "event_name", "verify_card", "verify_card", k);
        int i = 5;
        if (t23Var.a.a == null) {
            a = nif.c(new k03(q1c.c, r1c.a, null, null, "Unable to bind a new card: OAuth token is empty."));
        } else {
            a = mif.a(t23Var.f.a.C(new bj4(str, t23Var.h, 2), k9i.t, p1j.a), new lj0(9, t23Var, str, jziVar), null, 5);
        }
        ((x60) g0cVar).b(j, a);
        mif.b(mif.b(a, new l23(pt0Var, 4), null, 5), lhb.y0, new l23(pt0Var, i), 1);
    }

    public final void f(String str, String str2, String str3, jpo jpoVar, x7o x7oVar) {
        za4 za4Var;
        str3.getClass();
        jpoVar.getClass();
        x7oVar.getClass();
        int ordinal = jpoVar.ordinal();
        if (ordinal == 0) {
            za4Var = za4.randomAmount;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            za4Var = za4.smsChallenge;
        }
        za4 za4Var2 = za4Var;
        t23 t23Var = this.b;
        g0c g0cVar = t23Var.k;
        String r = hrg.r("Верификация СБП токена ", str, ", verification_id = ", str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("sbp_token_id", new jkr(str));
        linkedHashMap.put("verification_id", new jkr(str2));
        vtm k = su4.k(r, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(k, "event_name", "verify_sbp_token", "verify_sbp_token", k);
        l9i l9iVar = t23Var.f;
        yop b = mif.b(l9iVar.a.C(new n0u(str, str2, str3, za4Var2, false), k9i.v, p1j.a), rq1.Y, null, 5);
        ((x60) g0cVar).b(j, b);
        mif.b(mif.b(b, new pl2(x7oVar, 6), null, 5), lhb.y0, new pl2(x7oVar, 7), 1);
    }
}
