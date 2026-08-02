package defpackage;

import android.content.Context;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes4.dex */
public final class tdk implements sdk {
    public final jdk a;
    public final String b;
    public final x3i c;
    public final x60 d;
    public final g0c e;
    public final o77 f;
    public rdk g;
    public final w03 h;
    public final end i;
    public final boolean j;

    public tdk(Context context, jdk jdkVar, pyh pyhVar, hek hekVar, gp2 gp2Var, boolean z, String str, int i, ind indVar, boolean z2, boolean z3, String str2, String str3, boolean z4, xt0 xt0Var, List list, xfk xfkVar, ugk ugkVar, g86 g86Var, String str4, dnd dndVar, x3i x3iVar, x60 x60Var, g0c g0cVar, b0j b0jVar, String str5, String str6, Boolean bool, efs efsVar) {
        wm wmVar;
        wm wmVar2 = x60Var.b;
        context.getClass();
        xt0Var.getClass();
        list.getClass();
        dndVar.getClass();
        str6.getClass();
        this.a = jdkVar;
        this.b = str4;
        this.c = x3iVar;
        this.d = x60Var;
        this.e = g0cVar;
        int i2 = 15;
        o77 o77Var = new o77(new mvn(i2), new l48(i2), new e88(24), context, jdkVar, pyhVar, hekVar, gp2Var, xfkVar.f ? jeq.enabled : jeq.disabled, Boolean.valueOf(z), str3, Boolean.valueOf(z4), str, Integer.valueOf(i), indVar, Boolean.valueOf(z2), Boolean.valueOf(z3), str2, xt0Var, list, xfkVar, dndVar, ugkVar, g86Var, g0cVar, x60Var, b0jVar, efsVar, str5, str6, bool);
        this.f = o77Var;
        this.h = (w03) ((rzm) o77Var.K).get();
        this.i = (end) ((rzm) o77Var.N).get();
        if (x3iVar == x3i.c) {
            String str7 = jdkVar.c;
            if (str7 != null) {
                wmVar = wmVar2;
                wmVar.a.put("uid", str7);
            } else {
                wmVar = wmVar2;
            }
            String str8 = pyhVar.a;
            str8.getClass();
            wmVar.a.put("service_token", str8);
            String uuid = UUID.randomUUID().toString();
            uuid.getClass();
            uoe[] uoeVarArr = uoe.b;
            LinkedHashMap linkedHashMap = wmVar.a;
            linkedHashMap.put("api_instance_id", uuid);
            linkedHashMap.put("api_instance_type", "core");
        }
        this.j = n7w.R(q6c.A);
    }

    public final void a(g3j g3jVar) {
        int i;
        Function1 function1;
        s8 a;
        x60 x60Var;
        lhb lhbVar = lhb.y0;
        String str = this.a.d;
        w03 w03Var = this.h;
        t23 t23Var = w03Var.a.a;
        gek gekVar = w03Var.c;
        String str2 = g3jVar.d;
        String str3 = g3jVar.a;
        String str4 = g3jVar.c;
        x7o x7oVar = w03Var.d;
        if (x7oVar == null) {
            return;
        }
        w03Var.d = null;
        if (n7w.R(q6c.f)) {
            pt0 pt0Var = new pt0(gekVar, x7oVar);
            String str5 = g3jVar.b;
            String g = f1d.g("20", str4);
            String r = c.r(str3, StringUtil.SPACE, "", false);
            String str6 = g3jVar.d;
            n3m n3mVar = new n3m(r, str5, g, str, str6);
            xzi xziVar = new xzi(pt0Var);
            ArrayList arrayList = vx3.f;
            String str7 = gos.o(r).a.a;
            boolean A = ixf.A(str6);
            g0c g0cVar = t23Var.k;
            String q = hrg.q("Инициализация привязки новой карты ", str7, " через Vera");
            if (A) {
                q = q.concat(", с пустым CVV");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            r1f r1fVar = r1f.a;
            linkedHashMap.put("empty_svv", new mc3(A));
            linkedHashMap.put("system", new jkr(str7));
            vtm k = su4.k(q, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
            ci0 ci0Var = qjb.a;
            ci0Var.a = su4.g(1, ci0Var.a);
            k.u(qee.n() + ci0Var.a, "eventus_id");
            qne j = su4.j(k, "event_name", "bind_new_card_psp", "bind_new_card_psp", k);
            l9i l9iVar = t23Var.f;
            yop a2 = mif.a(l9iVar.a.C(new j13(t23Var.h, 2, false), vsf.x0, p1j.a), new s23(t23Var, n3mVar, this.b, A, str7, xziVar), null, 5);
            ((x60) g0cVar).b(j, a2);
            mif.b(mif.b(a2, new l23(pt0Var, 0), null, 5), lhbVar, new l23(pt0Var, 1), 1);
            return;
        }
        pt0 pt0Var2 = new pt0(gekVar, x7oVar);
        jzi jziVar = new jzi(pt0Var2);
        g0c g0cVar2 = t23Var.k;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        r1f r1fVar2 = r1f.a;
        vtm k2 = su4.k("deprecated Старый ивент при передачи карточных данных на привязку", linkedHashMap2, DeviceService.KEY_DESC, linkedHashMap2);
        ci0 ci0Var2 = qjb.a;
        ci0Var2.a = su4.g(1, ci0Var2.a);
        k2.u(qee.n() + ci0Var2.a, "eventus_id");
        x60 x60Var2 = (x60) g0cVar2;
        x60Var2.a(su4.j(k2, "event_name", "card_bound", "card_bound", k2));
        String A2 = bcx.A(str3);
        ArrayList arrayList2 = vx3.f;
        String str8 = gos.o(str3).a.a;
        boolean A3 = ixf.A(str2);
        y03 y03Var = y03.v2;
        StringBuilder m = f1d.m("Процесс добавления новой карты ", str8, StringUtil.SPACE, A2, " через Trust ");
        m.append(y03Var);
        String sb = m.toString();
        if (A3) {
            sb = sb.concat(", с пустым CVV");
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        r1f r1fVar3 = r1f.a;
        w1g.B(linkedHashMap3, Constants.KEY_VALUE, new jkr(A2));
        w1g.B(linkedHashMap3, "bind_version", new jkr(y03Var.a));
        w1g.B(linkedHashMap3, "empty_svv", new mc3(A3));
        w1g.B(linkedHashMap3, "system", new jkr(str8));
        w1g.B(linkedHashMap3, DeviceService.KEY_DESC, new jkr(sb));
        vtm vtmVar = new vtm((Map) linkedHashMap3);
        ci0 ci0Var3 = qjb.a;
        ci0Var3.a = su4.g(1, ci0Var3.a);
        vtmVar.u(qee.n() + ci0Var3.a, "eventus_id");
        qne j2 = su4.j(vtmVar, "event_name", "bind_new_card", "bind_new_card", vtmVar);
        int i2 = 3;
        if (t23Var.a.a == null) {
            a = nif.c(new k03(q1c.c, r1c.a, null, null, "Unable to bind a new card: OAuth token is empty."));
        } else {
            z9h z9hVar = new z9h();
            z9hVar.j("cvn", str2);
            z9hVar.j("card_number", str3);
            z9hVar.j("expiration_year", str4);
            z9hVar.j("expiration_month", g3jVar.b);
            y7o C = t23Var.c.C(z9hVar);
            if (!C.b()) {
                qk7 qk7Var = t23Var.d;
                String str9 = (String) C.a();
                str9.getClass();
                i = 5;
                function1 = null;
                a = mif.a(mif.a(nif.b(nif.a, new yl0(i2, str9, qk7Var)), new m40(11, t23Var), null, 5), new al(20, t23Var, jziVar), null, 5);
                x60Var = x60Var2;
                x60Var.b(j2, a);
                mif.b(mif.b(a, new l23(pt0Var2, 2), function1, i), lhbVar, new l23(pt0Var2, i2), 1);
            }
            r7w r7wVar = C.b;
            up6.D(r7wVar);
            a = nif.c(r7wVar);
        }
        x60Var = x60Var2;
        i = 5;
        function1 = null;
        x60Var.b(j2, a);
        mif.b(mif.b(a, new l23(pt0Var2, 2), function1, i), lhbVar, new l23(pt0Var2, i2), 1);
    }

    public final void b(x7o x7oVar) {
        rl2 rl2Var = (rl2) ((rzm) this.f.O).get();
        rl2Var.getClass();
        mif.b(rl2Var.b.K(kgj.qr), new pl2(x7oVar, 0), new pl2(x7oVar, 1), 1);
    }

    public final boolean c() {
        mgk H;
        boolean z;
        mek mekVar;
        rdk rdkVar = this.g;
        Boolean bool = null;
        if (rdkVar != null && (H = rdkVar.H()) != null) {
            try {
                mekVar = H.j;
            } catch (Exception e) {
                g0c g0cVar = H.i;
                String valueOf = String.valueOf(e.getMessage());
                String concat = "Ошибка при получении поля legalForSbpQr: ".concat(valueOf);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                linkedHashMap.put("field_name", new jkr("legalForSbpQr"));
                linkedHashMap.put(ServiceCommand.TYPE_REQ, new jkr(valueOf));
                vtm k = su4.k(concat, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                k.u(qee.n() + ci0Var.a, "eventus_id");
                qne j = su4.j(k, "event_name", "error_get_field", "error_get_field", k);
                x60 x60Var = (x60) g0cVar;
                x60Var.getClass();
                x60Var.a(j);
                z = false;
            }
            if (mekVar == null) {
                Intrinsics.j("paymentDetails");
                throw null;
            }
            z = mekVar.b.i;
            bool = Boolean.valueOf(z);
        }
        return qdq.B(bool);
    }

    public final void d(g3j g3jVar) {
        mgk H;
        g3jVar.getClass();
        rdk rdkVar = this.g;
        if (rdkVar == null || (H = rdkVar.H()) == null) {
            return;
        }
        gek gekVar = H.b;
        if (H.k instanceof jfk) {
            ogk ogkVar = H.a;
            g3j g3jVar2 = new g3j(c.r(g3jVar.a, StringUtil.SPACE, "", false), g3jVar.b, g3jVar.c, g3jVar.d, g3jVar.e, cm2.UnknownBank);
            String b = H.b();
            oxa oxaVar = new oxa(gekVar);
            jtc jtcVar = new jtc(H, gekVar);
            yop yopVar = ogkVar.g;
            ii iiVar = new ii(ogkVar, g3jVar2, b, oxaVar, jtcVar, 27);
            yopVar.getClass();
            H.c(mif.a(yopVar, iiVar, null, 5));
        }
    }

    public final w7o e() {
        fjn fjnVar = (fjn) ((rzm) this.f.D).get();
        igj igjVar = new igj(fjnVar.b, 1);
        g0c g0cVar = fjnVar.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Получение методов оплаты, разрешенных для данной корзины", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(k, "event_name", "get_raw_payment_methods", "get_raw_payment_methods", k);
        yop a = mif.a(mif.b(fjnVar.a.a.C(igjVar, vsf.z0, p1j.a), hhm.z, null, 5), new ybg(19, fjnVar), null, 5);
        ((x60) g0cVar).b(j, a);
        w7o h = qdq.h(a, 0L);
        if (h instanceof s7o) {
            return new s7o(((s7o) h).a);
        }
        if (h instanceof u7o) {
            return new u7o(zsd.J0((bg2) ((u7o) h).a));
        }
        b6e.s();
        return null;
    }

    public final void f(String str) {
        mgk H;
        str.getClass();
        rdk rdkVar = this.g;
        if (rdkVar == null || (H = rdkVar.H()) == null) {
            return;
        }
        str.getClass();
        rfk rfkVar = H.k;
        ffk ffkVar = rfkVar instanceof ffk ? (ffk) rfkVar : null;
        if (ffkVar != null) {
            H.a(ffkVar, str);
        }
    }

    public final void g(ehk ehkVar, xwj xwjVar, x7o x7oVar) {
        ehkVar.getClass();
        int i = 0;
        int i2 = 1;
        if (this.g != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            r1f r1fVar = r1f.a;
            vtm k = su4.k("Переиспользование данных о платеже", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
            ci0 ci0Var = qjb.a;
            ci0Var.a = su4.g(1, ci0Var.a);
            k.u(qee.n() + ci0Var.a, "eventus_id");
            ((x60) this.e).a(su4.j(k, "event_name", "reuse_get_payment_result", "reuse_get_payment_result", k));
            if (qee.i && !this.j) {
                qee.i = false;
                return;
            }
            this.g = null;
        }
        o77 o77Var = (o77) this.f.a;
        Boolean bool = Boolean.FALSE;
        ypb ypbVar = new ypb(28, this);
        kjn kjnVar = new kjn(29);
        rdk rdkVar = new rdk(7);
        rdkVar.b = toe.a(ehkVar);
        toe b = toe.b(xwjVar);
        rdkVar.c = b;
        rdkVar.d = t8a.b(hyf.u(new kdk(kjnVar, (toe) o77Var.c, (toe) o77Var.o, (toe) rdkVar.b, b, (rzm) o77Var.G, (rzm) o77Var.A, (rzm) o77Var.M, (rzm) o77Var.E, (toe) o77Var.j, (toe) o77Var.u, (rzm) o77Var.H, (rzm) o77Var.z)));
        toe a = toe.a(bool);
        rdkVar.e = a;
        rdkVar.f = t8a.b(hyf.u(new vp2(kjnVar, (rzm) rdkVar.d, (rzm) o77Var.L, (rzm) o77Var.C, (toe) o77Var.y, (toe) o77Var.w, a, (toe) o77Var.j)));
        rdkVar.g = t8a.b(hyf.u(new rp2((rzm) rdkVar.f, (toe) o77Var.v, (toe) o77Var.c, (toe) rdkVar.c, (rzm) o77Var.L, (rzm) rdkVar.d, (toe) o77Var.q, (toe) rdkVar.e, toe.a(ypbVar), (toe) o77Var.j)));
        if (this.c == x3i.c) {
            String str = ehkVar.a;
            str.getClass();
            this.d.b.a.put("payment_token", str);
        }
        mgk H = rdkVar.H();
        ime imeVar = new ime(21, this, rdkVar, x7oVar);
        H.getClass();
        ogk ogkVar = H.a;
        yop yopVar = ogkVar.g;
        ngk ngkVar = new ngk(ogkVar, i);
        yopVar.getClass();
        yop b2 = mif.b(mif.b(mif.a(mif.b(yopVar, ngkVar, null, 5), new ngk(ogkVar, i2), null, 5), new ngk(ogkVar, 2), null, 5), kzj.X, null, 5);
        yop yopVar2 = ogkVar.g;
        kzj kzjVar = kzj.v0;
        yopVar2.getClass();
        mif.b(mif.b(mif.b(nif.a(u75.j(b2, mif.b(mif.b(yopVar2, kzjVar, null, 5), kzj.Y, null, 5))), kzj.Z, null, 5), new afg(16, H, imeVar), null, 5), lhb.y0, new ybg(15, imeVar), 1);
    }
}
