package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.connectsdk.device.ConnectableDevice;
import com.yandex.passport.api.y1;
import com.yandex.passport.common.network.n;
import com.yandex.passport.data.network.s7;
import com.yandex.passport.internal.analytics.n0;
import com.yandex.passport.internal.analytics.p0;
import com.yandex.passport.internal.core.announcing.e;
import com.yandex.passport.internal.filter.r;
import com.yandex.passport.internal.flags.a;
import com.yandex.passport.internal.flags.b;
import com.yandex.passport.internal.flags.experiments.k;
import com.yandex.passport.internal.flags.i;
import com.yandex.passport.internal.flags.j;
import com.yandex.passport.internal.flags.o;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.rc;
import com.yandex.passport.internal.report.reporters.d1;
import com.yandex.passport.internal.sloth.performers.l;
import com.yandex.passport.internal.social.esia.h0;
import com.yandex.passport.internal.sso.g;
import com.yandex.passport.internal.ui.bouncer.chooser.h;
import com.yandex.passport.internal.ui.bouncer.model.j2;
import com.yandex.passport.internal.ui.bouncer.model.x1;
import com.yandex.passport.internal.ui.bouncer.s;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import ru.yandex.music.ui.widget.WidgetRecentlyRectangleReceiver;
import ru.yandex.music.ui.widget.WidgetRectangleReceiver;
import ru.yandex.music.ui.widget.WidgetSquareReceiver;

/* loaded from: classes4.dex */
public final /* synthetic */ class q0v implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q0v(x4w x4wVar, t4w t4wVar) {
        this.a = 14;
        this.b = t4wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nmv nmvVar;
        Class cls;
        Object b;
        int i = 17;
        int i2 = 16;
        int i3 = 15;
        int i4 = 12;
        int i5 = 11;
        int i6 = 9;
        int i7 = 6;
        int i8 = 8;
        int i9 = 3;
        int i10 = 7;
        int i11 = 5;
        int i12 = 20;
        switch (this.a) {
            case 0:
                z7t z7tVar = (z7t) this.b;
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                float c = yhn.c(((Number) z7tVar.h.getValue()).floatValue(), 0.0f, 1.0f);
                float f = (0.3f * c) + 0.7f;
                zcoVar.k(f);
                zcoVar.n(f);
                zcoVar.a(c);
                return Unit.a;
            case 1:
                y3v y3vVar = (y3v) this.b;
                xml xmlVar = (xml) obj;
                xmlVar.getClass();
                if (!(xmlVar instanceof wml)) {
                    if (xmlVar.equals(vml.b)) {
                        return y3vVar.f ? a4v.a : new z3v(true);
                    }
                    if (xmlVar.equals(vml.a)) {
                        return new z3v(false);
                    }
                    b6e.s();
                    return null;
                }
                y3vVar.f = true;
                kml kmlVar = ((wml) xmlVar).a;
                cml cmlVar = kmlVar.a;
                l2v a = cmlVar != null ? y3v.a(cmlVar) : null;
                l2v a2 = y3v.a(kmlVar.b);
                cml cmlVar2 = kmlVar.c;
                return new b4v(new l3v(a, a2, cmlVar2 != null ? y3v.a(cmlVar2) : null));
            case 2:
                h9v h9vVar = (h9v) this.b;
                zco zcoVar2 = (zco) obj;
                zcoVar2.getClass();
                f9v f9vVar = (f9v) h9vVar.a.getValue();
                zcoVar2.k(f9vVar != null ? ((Number) f9vVar.b.getValue()).floatValue() : 1.0f);
                f9v f9vVar2 = (f9v) h9vVar.a.getValue();
                zcoVar2.n(f9vVar2 != null ? ((Number) f9vVar2.b.getValue()).floatValue() : 1.0f);
                return Unit.a;
            case 3:
                oav oavVar = (oav) this.b;
                return ((Integer) obj).intValue() + oavVar.a;
            case 4:
                vbv vbvVar = (vbv) this.b;
                Activity activity = (Activity) obj;
                activity.getClass();
                return new yes(vbvVar, activity);
            case 5:
                n3m n3mVar = (n3m) this.b;
                ngv ngvVar = (ngv) n3mVar.b;
                String str = (String) obj;
                str.getClass();
                n3mVar.e = str;
                vh4 vh4Var = (vh4) n3mVar.d;
                if (vh4Var != null) {
                    n3mVar.d = null;
                    ngvVar.d();
                    vh4Var.invoke();
                }
                if (str.equals("/")) {
                    ngvVar.d();
                }
                return Unit.a;
            case 6:
                jac jacVar = (jac) this.b;
                ((l13) obj).getClass();
                return new giv((frt) jacVar.e, (cc7) jacVar.f, (tf6) jacVar.b);
            case 7:
                pzl pzlVar = (pzl) this.b;
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new zhv(l13Var.b(hag.I(giv.class), true), pzlVar.d());
            case 8:
                xdr xdrVar = (xdr) this.b;
                rnv rnvVar = (rnv) obj;
                rnvVar.getClass();
                xdrVar.m(null, rnvVar);
                return Unit.a;
            case 9:
                pmv pmvVar = (pmv) this.b;
                rmv rmvVar = (rmv) obj;
                rmvVar.getClass();
                if (((Boolean) pmvVar.n.getValue()).booleanValue()) {
                    int ordinal = rmvVar.ordinal();
                    if (ordinal == 0) {
                        nmvVar = nmv.a;
                    } else if (ordinal == 1) {
                        nmvVar = nmv.b;
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        nmvVar = nmv.c;
                    }
                    umv umvVar = (umv) pmvVar.k.getValue();
                    umvVar.getClass();
                    int ordinal2 = nmvVar.ordinal();
                    if (ordinal2 == 0) {
                        cls = WidgetRecentlyRectangleReceiver.class;
                    } else if (ordinal2 == 1) {
                        cls = WidgetRectangleReceiver.class;
                    } else {
                        if (ordinal2 != 2) {
                            b6e.s();
                            return null;
                        }
                        cls = WidgetSquareReceiver.class;
                    }
                    vmv.a(umvVar.a, cls);
                }
                pmvVar.B();
                return Unit.a;
            case 10:
                ovv ovvVar = (ovv) this.b;
                rj6 rj6Var = (rj6) obj;
                rj6Var.getClass();
                if (rj6Var instanceof qj6) {
                    rmb.h(ovvVar.k, 1, 2);
                } else if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                xdr xdrVar2 = ovvVar.o;
                kvv a3 = ((lvv) ovvVar.l.getValue()).a(rj6Var);
                xdrVar2.getClass();
                xdrVar2.m(null, a3);
                return Unit.a;
            case 11:
                ((lyv) this.b).a.r(false);
                return Unit.a;
            case 12:
                ((eyv) this.b).invoke();
                return Unit.a;
            case 13:
                ((u2r) this.b).clear();
                return Unit.a;
            case 14:
                t4w t4wVar = (t4w) this.b;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0("UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?");
                try {
                    tjl.b(D0, t4wVar);
                    D0.q();
                    i4w.w(D0, null);
                    gut.L(xjoVar);
                    return Unit.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        i4w.w(D0, th);
                        throw th2;
                    }
                }
            case 15:
                int i13 = 4;
                int i14 = 19;
                int i15 = 18;
                x4w x4wVar = (x4w) this.b;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                cko D02 = xjoVar2.D0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    D02.E(1, "SmartDownloadWorker");
                    int i16 = 0;
                    xy0 xy0Var = new xy0(0);
                    xy0 xy0Var2 = new xy0(0);
                    while (D02.q()) {
                        String x0 = D02.x0(i16);
                        if (!xy0Var.containsKey(x0)) {
                            xy0Var.put(x0, new ArrayList());
                        }
                        String x02 = D02.x0(0);
                        if (!xy0Var2.containsKey(x02)) {
                            xy0Var2.put(x02, new ArrayList());
                        }
                        i16 = 0;
                    }
                    D02.reset();
                    x4wVar.b(xjoVar2, xy0Var);
                    x4wVar.a(xjoVar2, xy0Var2);
                    ArrayList arrayList = new ArrayList();
                    while (D02.q()) {
                        String x03 = D02.x0(0);
                        c4w I = ezf.I((int) D02.getLong(1));
                        byte[] blob = D02.getBlob(2);
                        q97 q97Var = q97.b;
                        q97 Q = cxb.Q(blob);
                        int i17 = (int) D02.getLong(i9);
                        int i18 = i13;
                        int i19 = (int) D02.getLong(i18);
                        long j = D02.getLong(14);
                        long j2 = D02.getLong(i3);
                        long j3 = D02.getLong(i2);
                        bk2 F = ezf.F((int) D02.getLong(i));
                        long j4 = D02.getLong(i15);
                        long j5 = D02.getLong(i14);
                        int i20 = (int) D02.getLong(i12);
                        long j6 = D02.getLong(21);
                        int i21 = (int) D02.getLong(22);
                        g2j G = ezf.G((int) D02.getLong(i11));
                        f1j U = ezf.U(D02.getBlob(i7));
                        int i22 = i6;
                        fa6 fa6Var = new fa6(U, G, ((int) D02.getLong(i10)) != 0, ((int) D02.getLong(i8)) != 0, ((int) D02.getLong(i22)) != 0, ((int) D02.getLong(10)) != 0, D02.getLong(i5), D02.getLong(i4), ezf.u(D02.getBlob(13)));
                        Object c2 = uah.c(D02.x0(0), xy0Var);
                        c2.getClass();
                        Object c3 = uah.c(D02.x0(0), xy0Var2);
                        c3.getClass();
                        arrayList.add(new s4w(x03, I, Q, j, j2, j3, fa6Var, i17, F, j4, j5, i20, i19, j6, i21, (List) c2, (List) c3));
                        i13 = i18;
                        i6 = i22;
                        i = 17;
                        i2 = 16;
                        i3 = 15;
                        i7 = 6;
                        i9 = 3;
                        i4 = 12;
                        i5 = 11;
                        i8 = 8;
                        i10 = 7;
                        i11 = 5;
                        i12 = 20;
                        i14 = 19;
                        i15 = 18;
                    }
                    D02.close();
                    return arrayList;
                } catch (Throwable th3) {
                    D02.close();
                    throw th3;
                }
            case 16:
                osw oswVar = (osw) this.b;
                tow towVar = (tow) obj;
                towVar.getClass();
                oswVar.getClass();
                int ordinal3 = towVar.ordinal();
                if (ordinal3 == 0) {
                    return "TRACK";
                }
                if (ordinal3 == 1) {
                    return "INFINITE";
                }
                if (ordinal3 == 2) {
                    return "VIDEO_CLIP";
                }
                if (ordinal3 == 3) {
                    return "UNKNOWN";
                }
                b6e.s();
                return null;
            case 17:
                gao gaoVar = (gao) this.b;
                gow gowVar = (gow) obj;
                gowVar.getClass();
                gaoVar.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ConnectableDevice.KEY_ID, gowVar.a);
                String str2 = "unknown";
                switch (gowVar.b.ordinal()) {
                    case 0:
                        str2 = "ios";
                        break;
                    case 1:
                        str2 = "ios_tv";
                        break;
                    case 2:
                        str2 = ConstantDeviceInfo.APP_PLATFORM;
                        break;
                    case 3:
                        str2 = "android_tv";
                        break;
                    case 4:
                        str2 = "web";
                        break;
                    case 5:
                        str2 = "web_tv";
                        break;
                    case 6:
                        l18 l18Var = l18.b;
                        bdt I2 = hag.I(byb.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        if (((otw) ((byb) qdcVar.C(I2)).b(otw.class)).h()) {
                            str2 = "web_desktop";
                            break;
                        }
                        break;
                    case 7:
                        str2 = "speaker";
                        break;
                    case 8:
                        str2 = "android_wear";
                        break;
                    case 9:
                        break;
                    default:
                        b6e.s();
                        return null;
                }
                jSONObject.put("type", str2);
                jSONObject.put("name", gowVar.c);
                jSONObject.put("appName", gowVar.d);
                jSONObject.put("appVersion", gowVar.e);
                jSONObject.put("canBeActive", gowVar.h);
                jSONObject.put("canBePassive", gowVar.i);
                String jSONObject2 = jSONObject.toString();
                jSONObject2.getClass();
                return jSONObject2;
            case 18:
                epw epwVar = (epw) this.b;
                zow zowVar = (zow) obj;
                zowVar.getClass();
                mlw mlwVar = (mlw) epwVar.f.getValue();
                mlwVar.getClass();
                mlwVar.a.a(zowVar);
                return Unit.a;
            case 19:
                n0 n0Var = (n0) this.b;
                Map map = (Map) obj;
                map.getClass();
                String str3 = n0Var.d;
                if (str3 != null) {
                    map.put("session_hash", str3);
                }
                return Unit.a;
            case 20:
                p0 p0Var = (p0) this.b;
                Map map2 = (Map) obj;
                map2.getClass();
                map2.putAll(p0Var.b);
                return Unit.a;
            case 21:
                e eVar = (e) this.b;
                String str4 = (String) obj;
                g gVar = eVar.e;
                str4.getClass();
                return Boolean.valueOf(gVar.b(str4) && !str4.equals(eVar.a.getPackageName()));
            case 22:
                d1 d1Var = (d1) this.b;
                ((wm6) obj).getClass();
                d1Var.n(rc.d, new ff("yandex-datastore", 6));
                return imm.a();
            case 23:
                r rVar = (r) this.b;
                ((wm6) obj).getClass();
                d1 d1Var2 = rVar.b;
                String str5 = r.g;
                d1Var2.getClass();
                str5.getClass();
                d1Var2.n(rc.d, new ff(str5, 6));
                return imm.a();
            case 24:
                l lVar = (l) this.b;
                JSONObject jSONObject3 = (JSONObject) obj;
                jSONObject3.getClass();
                n nVar = lVar.a;
                nVar.getClass();
                ArrayList p = v75.p(uah.e(new Pair("Others", u75.h(o.A0, o.a, o.b, o.c, o.d, o.e, o.v, o.h, o.i, o.o, o.q, o.w, o.x, o.A, o.G, o.F, o.H, o.Q, o.S, o.f0, o.g0, o.p0, o.q0, o.r0, o.t0, o.x0, o.z0, o.u0, o.i0, o.B0, o.C0, o.D0, o.f)), new Pair("Compose", u75.h(o.R, o.T, o.U, o.V, o.W, o.X, o.Y, o.Z, o.a0, o.b0, o.c0, o.d0, o.e0)), new Pair("Web", u75.h(o.n, o.y, o.z)), new Pair("Registration", t75.c(o.j)), new Pair("Autologin", u75.h(o.C, o.D, o.E)), new Pair("Social", u75.h(o.l, o.k, o.m, o.g)), new Pair("Push", u75.h(o.r, o.p, o.s, o.t, o.j0, o.k0, o.l0, o.u, o.m0, o.o0, o.n0, o.v0, o.w0)), new Pair("Url backups", u75.h(com.yandex.passport.internal.flags.n.a, com.yandex.passport.internal.flags.n.c, com.yandex.passport.internal.flags.n.b, com.yandex.passport.internal.flags.n.d, com.yandex.passport.internal.flags.n.e)), new Pair("Link auth", u75.h(com.yandex.passport.internal.flags.l.a, com.yandex.passport.internal.flags.l.b, o.B)), new Pair("Fast Auth Url", u75.h(o.I, o.J, o.K, o.L, o.M, o.N, o.O, o.P, o.h0))).values());
                ArrayList arrayList2 = new ArrayList();
                Iterator it = p.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    k kVar = (k) nVar.b;
                    String str6 = ((com.yandex.passport.internal.flags.g) next).a;
                    kVar.getClass();
                    if (kVar.a.contains(str6)) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    com.yandex.passport.internal.flags.g gVar2 = (com.yandex.passport.internal.flags.g) it2.next();
                    String str7 = gVar2.a;
                    i iVar = (i) nVar.c;
                    if ((gVar2 instanceof a) || (gVar2 instanceof j) || (gVar2 instanceof com.yandex.passport.internal.flags.k)) {
                        b = iVar.b(gVar2);
                    } else {
                        if (!(gVar2 instanceof b)) {
                            b6e.s();
                            return null;
                        }
                        b = Integer.valueOf(((Enum) iVar.b(gVar2)).ordinal());
                    }
                    if (b == null) {
                        b6e.l(gVar2, "no value for flag ");
                        return null;
                    }
                    arrayList3.add(new Pair(str7, b));
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Pair pair = (Pair) it3.next();
                    jSONObject3.put((String) pair.a, pair.b);
                }
                return Unit.a;
            case 25:
                com.yandex.passport.internal.social.esia.n0 n0Var2 = (com.yandex.passport.internal.social.esia.n0) this.b;
                Uri uri = (Uri) obj;
                uri.getClass();
                n0Var2.k.a(new h0(uri));
                return Unit.a;
            case 26:
                y1 y1Var = (y1) this.b;
                ((Resources) obj).getClass();
                return Boolean.valueOf(y1Var == y1.b);
            case 27:
                s sVar = (s) this.b;
                j2 j2Var = (j2) obj;
                j2Var.getClass();
                sVar.a(new x1(j2Var));
                return Unit.a;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                h hVar = (h) this.b;
                j2 j2Var2 = (j2) obj;
                j2Var2.getClass();
                hVar.k.a(new x1(j2Var2));
                return Unit.a;
            default:
                s7 s7Var = (s7) this.b;
                ((Context) obj).getClass();
                return (t13) s7Var.get();
        }
    }

    public /* synthetic */ q0v(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
