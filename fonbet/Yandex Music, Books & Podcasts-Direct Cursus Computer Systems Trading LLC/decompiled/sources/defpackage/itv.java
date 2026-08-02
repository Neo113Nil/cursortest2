package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.compose.animation.a;
import androidx.compose.animation.c;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.passport.R;
import com.yandex.passport.data.network.a1;
import com.yandex.passport.data.network.g1;
import com.yandex.passport.data.network.g9;
import com.yandex.passport.data.network.ia;
import com.yandex.passport.data.network.pa;
import com.yandex.passport.data.network.rb;
import com.yandex.passport.data.network.token.i;
import com.yandex.passport.data.network.x8;
import com.yandex.passport.data.network.xb;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.analytics.r;
import com.yandex.passport.internal.database.auth_cookie.d;
import com.yandex.passport.internal.database.auth_cookie.e;
import com.yandex.passport.internal.database.diary.b;
import com.yandex.passport.internal.database.diary.f;
import com.yandex.passport.internal.sloth.l;
import com.yandex.passport.internal.sloth.m;
import com.yandex.passport.internal.social.esia.f0;
import com.yandex.passport.internal.social.esia.n0;
import com.yandex.passport.internal.sso.g;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final /* synthetic */ class itv implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ itv(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        int i = this.a;
        int i2 = 13;
        int i3 = 14;
        int i4 = 15;
        int i5 = 3;
        int i6 = 0;
        int i7 = 1;
        Continuation continuation = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                bs1 bs1Var = (bs1) obj3;
                gtv gtvVar = (gtv) obj2;
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                long i8 = ((as1) bs1Var).a.i();
                long e = jpaVar.e();
                float max = Math.max(Float.intBitsToFloat((int) (e >> 32)) / Float.intBitsToFloat((int) (i8 >> 32)), Float.intBitsToFloat((int) (e & 4294967295L)) / Float.intBitsToFloat((int) (i8 & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
                int i9 = sso.a;
                float e2 = gtvVar.b.e() * sso.a(floatToRawIntBits) * nmq.d(i8);
                float b = sso.b(floatToRawIntBits) * nmq.b(i8);
                t6k t6kVar = gtvVar.b;
                long i10 = a4g.i(e2, t6kVar.e() * b);
                float e3 = 1 / t6kVar.e();
                long y0 = jpaVar.y0();
                nsh q0 = jpaVar.q0();
                long B = q0.B();
                q0.s().r();
                try {
                    ((xzi) q0.b).f0(e3, e3, y0);
                    float f = 2;
                    float f2 = (-(nmq.d(i10) - nmq.d(jpaVar.e()))) / f;
                    float f3 = (-(nmq.b(i10) - nmq.b(jpaVar.e()))) / f;
                    ((xzi) jpaVar.q0().b).m0(f2, f3);
                    try {
                        w4k.h(((as1) bs1Var).a, jpaVar, i10, null, 6);
                        vz1.A(q0, B);
                        return Unit.a;
                    } finally {
                        ((xzi) jpaVar.q0().b).m0(-f2, -f3);
                    }
                } catch (Throwable th) {
                    vz1.A(q0, B);
                    throw th;
                }
            case 1:
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                List list = (List) ((aqi) obj3).getValue();
                vufVar.Z(list.size(), new zcf(new jiv(5), list), new zcf(list, 22), new wn5(new cl(29, list, (lwv) obj2), -1091073711, true));
                return Unit.a;
            case 2:
                vuf vufVar2 = (vuf) obj;
                vufVar2.getClass();
                List list2 = ((kxv) ((sdr) obj3).getValue()).a;
                vufVar2.Z(list2.size(), null, new zcf(list2, 23), new wn5(new gxv(list2, (hxv) obj2, i6), -1091073711, true));
                vuf.Y(vufVar2, null, vut.h, 3);
                return Unit.a;
            case 3:
                ((jx7) obj).getClass();
                return new wpe(xv.t((int) ((((Number) ((sdr) obj2).getValue()).floatValue() * ((u6k) obj3).h()) / 2), 0));
            case 4:
                ((oa8) obj).getClass();
                return new mf0(19, (dzv) obj3, (rxv) obj2);
            case 5:
                e2w e2wVar = (e2w) obj3;
                Function2 function2 = (Function2) obj2;
                vuf vufVar3 = (vuf) obj;
                vufVar3.getClass();
                if (e2wVar instanceof c2w) {
                    List list3 = ((c2w) e2wVar).a;
                    vufVar3.Z(list3.size(), null, new zcf(list3, 24), new wn5(new gxv(list3, function2, i7), -1091073711, true));
                } else {
                    if (!e2wVar.equals(d2w.a)) {
                        b6e.s();
                        return null;
                    }
                    vufVar3.Z(10, null, vsf.v, i4w.g);
                }
                vuf.Y(vufVar3, null, i4w.h, 3);
                return Unit.a;
            case 6:
                hl0 hl0Var = (hl0) obj;
                hl0Var.getClass();
                if (((Boolean) ((Function2) obj3).invoke(hl0Var.b(), obj2)).booleanValue()) {
                    e9b e4 = c.e(weo.S(600, 0, lya.b, 2), 2);
                    vpb f4 = c.f(weo.S(600, 0, lya.a, 2), 2);
                    int i11 = a.b;
                    zd6 zd6Var = new zd6(e4, f4);
                    zd6Var.d = new dnq(false, new jiv(11));
                    return zd6Var;
                }
                e9b e9bVar = e9b.b;
                vpb vpbVar = vpb.b;
                int i12 = a.b;
                zd6 zd6Var2 = new zd6(e9bVar, vpbVar);
                zd6Var2.d = null;
                return zd6Var2;
            case 7:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                ((l4w) obj3).b.H(xjoVar, (k4w) obj2);
                return Unit.a;
            case 8:
                String str = (String) obj3;
                x4w x4wVar = (x4w) obj2;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    D0.E(1, str);
                    xy0 xy0Var = new xy0(0);
                    xy0 xy0Var2 = new xy0(0);
                    while (D0.q()) {
                        String x0 = D0.x0(0);
                        if (!xy0Var.containsKey(x0)) {
                            xy0Var.put(x0, new ArrayList());
                        }
                        String x02 = D0.x0(0);
                        if (!xy0Var2.containsKey(x02)) {
                            xy0Var2.put(x02, new ArrayList());
                        }
                    }
                    D0.reset();
                    x4wVar.b(xjoVar2, xy0Var);
                    x4wVar.a(xjoVar2, xy0Var2);
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        String x03 = D0.x0(0);
                        c4w I = ezf.I((int) D0.getLong(1));
                        byte[] blob = D0.getBlob(2);
                        q97 q97Var = q97.b;
                        q97 Q = cxb.Q(blob);
                        int i13 = (int) D0.getLong(i5);
                        int i14 = (int) D0.getLong(4);
                        long j = D0.getLong(i3);
                        long j2 = D0.getLong(i4);
                        long j3 = D0.getLong(16);
                        bk2 F = ezf.F((int) D0.getLong(17));
                        long j4 = D0.getLong(18);
                        long j5 = D0.getLong(19);
                        int i15 = (int) D0.getLong(20);
                        long j6 = D0.getLong(21);
                        int i16 = (int) D0.getLong(22);
                        fa6 fa6Var = new fa6(ezf.U(D0.getBlob(6)), ezf.G((int) D0.getLong(5)), ((int) D0.getLong(7)) != 0, ((int) D0.getLong(8)) != 0, ((int) D0.getLong(9)) != 0, ((int) D0.getLong(10)) != 0, D0.getLong(11), D0.getLong(12), ezf.u(D0.getBlob(13)));
                        Object c = uah.c(D0.x0(0), xy0Var);
                        c.getClass();
                        List list4 = (List) c;
                        Object c2 = uah.c(D0.x0(0), xy0Var2);
                        c2.getClass();
                        arrayList.add(new s4w(x03, I, Q, j, j2, j3, fa6Var, i13, F, j4, j5, i15, i14, j6, i16, list4, (List) c2));
                        i5 = 3;
                        i3 = 14;
                        i4 = 15;
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 9:
                c4w c4wVar = (c4w) obj3;
                String str2 = (String) obj2;
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                D0 = xjoVar3.D0("UPDATE workspec SET state=? WHERE id=?");
                try {
                    D0.bindLong(1, ezf.P(c4wVar));
                    D0.E(2, str2);
                    D0.q();
                    int L = gut.L(xjoVar3);
                    D0.close();
                    return Integer.valueOf(L);
                } finally {
                }
            case 10:
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                ((x4w) obj3).b.H(xjoVar4, (t4w) obj2);
                return Unit.a;
            case 11:
                q97 q97Var2 = (q97) obj3;
                String str3 = (String) obj2;
                xjo xjoVar5 = (xjo) obj;
                xjoVar5.getClass();
                D0 = xjoVar5.D0("UPDATE workspec SET output=? WHERE id=?");
                try {
                    q97 q97Var3 = q97.b;
                    D0.bindBlob(1, cxb.l0(q97Var2));
                    D0.E(2, str3);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 12:
                xjo xjoVar6 = (xjo) obj;
                xjoVar6.getClass();
                ((z4w) obj3).b.H(xjoVar6, (y4w) obj2);
                return Unit.a;
            case 13:
                ((oa8) obj).getClass();
                return new mf0(20, (ccg) obj3, (nbg) obj2);
            case 14:
                bjt bjtVar = (bjt) obj3;
                oo7 oo7Var = (oo7) obj;
                oo7Var.getClass();
                oo7Var.a = bjtVar;
                oo7Var.b = bjtVar;
                oo7Var.e = (jwl) obj2;
                return Unit.a;
            case 15:
                xpn xpnVar = (xpn) obj3;
                dgw dgwVar = (dgw) obj2;
                ((fwd) obj).getClass();
                s2i s2iVar = new s2i();
                fwd.b(s2iVar, "Ynison-Session-Id", String.valueOf(xpnVar.a));
                fwd.b(s2iVar, "Ynison-Redirect-Ticket", xpnVar.c);
                fwd.b(s2iVar, "Ynison-Device-Id", dgwVar.b());
                fwd.c(s2iVar, dgwVar.c());
                return s2iVar;
            case 16:
                x97.y((tf6) obj3, null, null, new rhw((Function2) obj2, (enj) obj, continuation, 8), 3);
                return Unit.a;
            case 17:
                ((a1) obj).getClass();
                return new z7o(com.yandex.passport.internal.ui.a.A(new rhw((g1) obj3, (a1) obj2, continuation, i2)));
            case 18:
                ((x8) obj).getClass();
                return new z7o(com.yandex.passport.internal.ui.a.A(new rhw((g9) obj3, (x8) obj2, continuation, i3)));
            case 19:
                ((ia) obj).getClass();
                return new z7o(com.yandex.passport.internal.ui.a.A(new rhw((pa) obj3, (ia) obj2, continuation, i4)));
            case 20:
                ((rb) obj).getClass();
                return new z7o(com.yandex.passport.internal.ui.a.A(new rhw((xb) obj3, (rb) obj2, continuation, r14)));
            case 21:
                ((d) obj3).b.H((xjo) obj, (e) obj2);
                return null;
            case 22:
                return Long.valueOf(((com.yandex.passport.internal.database.diary.c) obj3).c.I((xjo) obj, (b) obj2));
            case 23:
                return Long.valueOf(((com.yandex.passport.internal.database.diary.c) obj3).b.I((xjo) obj, (com.yandex.passport.internal.database.diary.a) obj2));
            case 24:
                return Long.valueOf(((com.yandex.passport.internal.database.diary.e) obj3).b.I((xjo) obj, (f) obj2));
            case 25:
                m mVar = ((com.yandex.passport.internal.sloth.performers.b) obj2).a;
                JSONObject jSONObject = (JSONObject) obj;
                jSONObject.getClass();
                Set set = (Set) obj3;
                i iVar = l.b;
                int a = tah.a(v75.o(set, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(a >= 16 ? a : 16);
                for (Object obj4 : set) {
                    String str4 = (String) obj4;
                    iVar.getClass();
                    str4.getClass();
                    linkedHashMap.put(obj4, (l) l.c.get(str4));
                }
                f9h G = n7w.G(linkedHashMap);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(G.i));
                Object it = ((g9h) G.entrySet()).iterator();
                while (((e9h) it).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((c9h) it).next();
                    Object key = entry.getKey();
                    l lVar = (l) entry.getValue();
                    Context context = mVar.a;
                    lVar.getClass();
                    int ordinal = lVar.ordinal();
                    linkedHashMap2.put(key, ordinal != 0 ? ordinal != 1 ? ordinal != 3 ? ordinal != 5 ? (String) mVar.d.get(lVar) : context.getString(R.string.passport_eula_taxi_agreement_text_override) : context.getString(R.string.passport_eula_privacy_policy_text) : context.getString(R.string.passport_eula_user_agreement_text) : context.getString(R.string.passport_eula_reg_format_android));
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(tah.a(linkedHashMap2.size()));
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    Object key2 = entry2.getKey();
                    String str5 = (String) entry2.getValue();
                    linkedHashMap3.put(key2, str5 != null ? kotlin.text.c.r(kotlin.text.c.r(str5, " ", StringUtil.SPACE, false), "&#160;", StringUtil.SPACE, false) : null);
                }
                Object it2 = ((g9h) n7w.G(linkedHashMap3).entrySet()).iterator();
                while (((e9h) it2).hasNext()) {
                    Map.Entry entry3 = (Map.Entry) ((c9h) it2).next();
                    irf.G(jSONObject, (String) entry3.getKey(), (String) entry3.getValue());
                }
                jSONObject.put("appType", mVar.b ? "taxi" : "default");
                return Unit.a;
            case 26:
                com.yandex.passport.internal.sloth.performers.f fVar = (com.yandex.passport.internal.sloth.performers.f) obj3;
                x97.y(gld.e(((com.yandex.passport.common.coroutine.f) fVar.d).a.b.plus(a4g.n())), null, null, new j9w(fVar, (l83) obj2, continuation, 28), 3);
                return Unit.a;
            case 27:
                Uri uri = (Uri) obj;
                uri.getClass();
                ((n0) obj3).k.a(f0.a);
                ((Function1) obj2).invoke(uri);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                Exception exc = (Exception) obj;
                exc.getClass();
                String str6 = ((com.yandex.passport.internal.sso.d) obj2).a;
                o0 o0Var = ((g) obj3).c;
                if (o0Var != null) {
                    str6.getClass();
                    r rVar = r.d;
                    xy0 xy0Var3 = new xy0(0);
                    xy0Var3.put("remote_package_name", str6);
                    xy0Var3.put("error", Log.getStackTraceString(exc));
                    o0Var.a.b(rVar, xy0Var3);
                }
                return Unit.a;
            default:
                String str7 = (String) obj2;
                Exception exc2 = (Exception) obj;
                exc2.getClass();
                o0 o0Var2 = ((g) obj3).c;
                if (o0Var2 != null) {
                    str7.getClass();
                    r rVar2 = r.d;
                    xy0 xy0Var4 = new xy0(0);
                    xy0Var4.put("remote_package_name", str7);
                    xy0Var4.put("error", Log.getStackTraceString(exc2));
                    o0Var2.a.b(rVar2, xy0Var4);
                }
                return Unit.a;
        }
    }
}
