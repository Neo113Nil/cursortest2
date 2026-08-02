package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.media.ynison.service.d;
import com.yandex.media.ynison.service.s0;
import com.yandex.passport.common.core.f;
import com.yandex.passport.data.exceptions.h;
import com.yandex.passport.data.models.w;
import com.yandex.passport.internal.entities.l;
import com.yandex.passport.internal.flags.experiments.i;
import com.yandex.passport.internal.flags.experiments.k;
import com.yandex.passport.internal.network.response.a;
import com.yandex.passport.internal.network.response.b;
import com.yandex.passport.internal.network.response.g;
import com.yandex.passport.internal.properties.q;
import com.yandex.passport.internal.properties.r;
import com.yandex.passport.internal.properties.t;
import com.yandex.passport.internal.report.c;
import com.yandex.passport.internal.report.reporters.f1;
import com.yandex.passport.internal.report.reporters.y;
import com.yandex.passport.internal.report.t4;
import com.yandex.passport.internal.report.u4;
import com.yandex.passport.internal.social.esia.EsiaBindActivity;
import com.yandex.passport.internal.social.esia.b0;
import com.yandex.passport.internal.social.esia.c0;
import com.yandex.passport.internal.social.esia.d0;
import com.yandex.passport.internal.ui.bouncer.chooser.x;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.r0;
import com.yandex.passport.internal.util.p;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final /* synthetic */ class vlv extends ezc implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vlv(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l9q l9qVar;
        Object c73Var;
        sqw sqwVar;
        how a;
        gow gowVar;
        a aVar;
        a aVar2;
        b bVar;
        com.yandex.passport.common.core.b bVar2;
        int i = 3;
        int i2 = 0;
        a aVar3 = null;
        switch (this.a) {
            case 0:
                aab aabVar = (aab) obj;
                aabVar.getClass();
                ((wlv) this.receiver).getClass();
                if (aabVar instanceof lt) {
                    return "mobile-home-album-default";
                }
                if (aabVar instanceof u51) {
                    return "mobile-home-artist-default";
                }
                if (aabVar instanceof eul) {
                    return "mobile-home-playlist-default";
                }
                b6e.s();
                return null;
            case 1:
                uht uhtVar = (uht) obj;
                uhtVar.getClass();
                bov bovVar = (bov) this.receiver;
                bovVar.getClass();
                uiq uiqVar = bovVar.a.k;
                uiqVar.getClass();
                m9q m9qVar = ((aov) uiqVar.b).a;
                int ordinal = uhtVar.ordinal();
                if (ordinal == 0) {
                    l9qVar = l9q.System;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    l9qVar = l9q.CoverBased;
                }
                x97.y(m9qVar.b, null, null, new v5p(m9qVar, l9qVar, r15, 19), 3);
                return Unit.a;
            case 2:
                rj6 rj6Var = (rj6) obj;
                rj6Var.getClass();
                stv stvVar = (stv) this.receiver;
                stvVar.c = false;
                xdr xdrVar = stvVar.j;
                kvv a2 = ((lvv) ((mvv) stvVar.h.getValue()).b.getValue()).a(rj6Var);
                xdrVar.getClass();
                xdrVar.m(null, a2);
                boolean z = rj6Var instanceof qj6;
                if (z) {
                    rmb.h(stvVar.b, 1, 2);
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    ssg.a(3, "Skeleton:WizardEntryBlock", hrg.q("Block load error[", stvVar.a.a.a, "]"), null);
                }
                kzp kzpVar = stvVar.d;
                if (kzpVar != null) {
                    ptv ptvVar = stvVar.a;
                    ptvVar.getClass();
                    if (z) {
                        c73Var = new d73(ptvVar);
                    } else {
                        if (!(rj6Var instanceof pj6)) {
                            b6e.s();
                            return null;
                        }
                        ((pj6) rj6Var).a();
                        c73Var = new c73(ptvVar);
                    }
                    kzpVar.invoke(c73Var);
                }
                return Unit.a;
            case 3:
                Context context = (Context) obj;
                context.getClass();
                ((egq) this.receiver).getClass();
                return fgq.E(context);
            case 4:
                wqw wqwVar = (wqw) obj;
                wqwVar.getClass();
                qfw qfwVar = (qfw) this.receiver;
                qfwVar.getClass();
                if (qfwVar.c.d.a() && (sqwVar = (sqw) qfwVar.F.getValue()) != null && (a = sqwVar.a()) != null && (gowVar = a.c) != null) {
                    if (gowVar.j) {
                        gowVar = null;
                    }
                    if (gowVar != null) {
                        vqw vqwVar = wqwVar.b;
                        Double U = vqwVar.c ? null : wdg.U(wqwVar.a, vqwVar.b, gx1.a);
                        if (U != null) {
                            double doubleValue = U.doubleValue();
                            qrw qrwVar = (qrw) qfwVar.k.getValue();
                            s0 a3 = qrwVar.a(qrwVar.a.b());
                            k18 k = d.k();
                            k.h(doubleValue);
                            k.d();
                            d.f((d) k.b, a3);
                            d dVar = (d) k.b();
                            dcw a4 = qfwVar.a();
                            kot kotVar = new kot(gowVar.a, dVar);
                            xhw xhwVar = (xhw) a4;
                            xhwVar.getClass();
                            x97.y(xhwVar.n, null, null, new rhw(xhwVar, kotVar, (Continuation) r15, i2), 3);
                        }
                    }
                }
                return Unit.a;
            case 5:
                u3q u3qVar = (u3q) obj;
                u3qVar.getClass();
                qqs qqsVar = (qqs) this.receiver;
                qqsVar.getClass();
                Boolean bool = (Boolean) ocg.k(u3qVar, new qec(i, qqsVar.a()));
                bool.booleanValue();
                return bool;
            case 6:
                qfw qfwVar2 = (qfw) obj;
                qfwVar2.getClass();
                tfw tfwVar = (tfw) this.receiver;
                tfwVar.getClass();
                oaw oawVar = (oaw) tfwVar.r.a.m.getValue();
                if (oawVar != null) {
                    return new etw(qfwVar2.F, oawVar, new vlv(1, qfwVar2, qfw.class, "requestChangeVolume", "requestChangeVolume(Lcom/yandex/music/shared/ynison/api/model/remote/YnisonRemoteVolume;)V", 0, 4));
                }
                return null;
            case 7:
                rrw rrwVar = (rrw) obj;
                rrwVar.getClass();
                rrw rrwVar2 = (rrw) this.receiver;
                rrwVar2.getClass();
                return Boolean.valueOf(rrwVar2.a.getClass().equals(rrwVar.a.getClass()));
            case 8:
                String str = (String) obj;
                str.getClass();
                com.yandex.passport.internal.flags.experiments.b bVar3 = (com.yandex.passport.internal.flags.experiments.b) this.receiver;
                bVar3.getClass();
                return bVar3.a.getString(str, null);
            case 9:
                String str2 = (String) obj;
                str2.getClass();
                k kVar = (k) this.receiver;
                kVar.getClass();
                return kVar.a.getString(str2, null);
            case 10:
                String str3 = (String) obj;
                str3.getClass();
                i iVar = (i) this.receiver;
                iVar.getClass();
                return iVar.a.getString(str3, null);
            case 11:
                l3o l3oVar = (l3o) obj;
                l3oVar.getClass();
                ((com.yandex.passport.internal.network.a) this.receiver).getClass();
                JSONObject jSONObject = new JSONObject(com.yandex.passport.internal.network.a.c(l3oVar));
                if (!"ok".equals(jSONObject.getString("status"))) {
                    String d = com.yandex.passport.internal.network.a.d(jSONObject);
                    if (d != null) {
                        com.yandex.passport.internal.network.a.i(d);
                    }
                    ArrayList e = com.yandex.passport.internal.network.a.e(jSONObject);
                    if (e != null) {
                        e.remove("account.auth_passed");
                        if (e.size() > 0) {
                            throw new h((String) e.get(0));
                        }
                    }
                }
                return Unit.a;
            case 12:
                l3o l3oVar2 = (l3o) obj;
                l3oVar2.getClass();
                f1 f1Var = ((com.yandex.passport.internal.network.a) this.receiver).a;
                JSONObject b = com.yandex.passport.internal.network.a.b(l3oVar2);
                ArrayList e2 = com.yandex.passport.internal.network.a.e(b);
                if (e2 != null && e2.size() > 0) {
                    String str4 = (String) e2.get(0);
                    str4.getClass();
                    f1Var.n(t4.d, new com.yandex.passport.internal.report.a(str4, 28), new c("null", 3));
                    if (((String) e2.get(0)).equals("invalid_grant")) {
                        throw new com.yandex.passport.common.exception.a();
                    }
                    throw new h((String) e2.get(0));
                }
                String optString = b.optString("uid");
                optString.getClass();
                f1Var.n(u4.d, new c(optString, 3));
                String optString2 = b.optString("access_token");
                String optString3 = b.optString("token_type");
                long optLong = b.optLong("expires_in");
                if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                    return new com.yandex.passport.internal.network.response.h(optLong, optString2, optString3);
                }
                String optString4 = b.optString("code");
                if (TextUtils.isEmpty(optString4)) {
                    throw new JSONException("access_token or code should be in response");
                }
                return new com.yandex.passport.internal.network.response.h(optString4);
            case 13:
                l3o l3oVar3 = (l3o) obj;
                l3oVar3.getClass();
                ((com.yandex.passport.internal.network.a) this.receiver).getClass();
                JSONObject b2 = com.yandex.passport.internal.network.a.b(l3oVar3);
                String d2 = com.yandex.passport.internal.network.a.d(b2);
                if (d2 != null) {
                    throw new h(d2);
                }
                String string = b2.getString("status");
                if (TextUtils.equals(string, "ok")) {
                    return Boolean.TRUE;
                }
                throw new h(string);
            case 14:
                l3o l3oVar4 = (l3o) obj;
                l3oVar4.getClass();
                ((com.yandex.passport.internal.network.a) this.receiver).getClass();
                JSONObject jSONObject2 = new JSONObject(com.yandex.passport.internal.network.a.c(l3oVar4));
                String string2 = jSONObject2.getString("status");
                if ("ok".equals(string2)) {
                    return Unit.a;
                }
                String d3 = com.yandex.passport.internal.network.a.d(jSONObject2);
                if (d3 != null) {
                    com.yandex.passport.internal.network.a.i(d3);
                }
                ArrayList e3 = com.yandex.passport.internal.network.a.e(jSONObject2);
                if (e3 == null || e3.size() <= 0) {
                    throw new h(string2);
                }
                throw new h((String) e3.get(0));
            case 15:
                l3o l3oVar5 = (l3o) obj;
                l3oVar5.getClass();
                ((com.yandex.passport.internal.network.a) this.receiver).getClass();
                JSONObject b3 = com.yandex.passport.internal.network.a.b(l3oVar5);
                com.yandex.passport.internal.network.a.h(b3);
                String optString5 = b3.optString("code");
                if (!TextUtils.isEmpty(optString5)) {
                    if (TextUtils.equals(optString5, "AuthorizationRequiredError")) {
                        throw new com.yandex.passport.common.exception.a();
                    }
                    throw new h(optString5);
                }
                String string3 = b3.getString("status");
                if (TextUtils.equals(string3, "ok")) {
                    return Boolean.TRUE;
                }
                throw new h(string3);
            case 16:
                l3o l3oVar6 = (l3o) obj;
                l3oVar6.getClass();
                ((com.yandex.passport.internal.network.a) this.receiver).getClass();
                JSONObject jSONObject3 = new JSONObject(com.yandex.passport.internal.network.a.c(l3oVar6));
                String string4 = jSONObject3.getString("status");
                if ("ok".equals(string4)) {
                    return new l(jSONObject3.getString("jwt"), jSONObject3.getLong("expires_in"));
                }
                String d4 = com.yandex.passport.internal.network.a.d(jSONObject3);
                if (d4 != null) {
                    com.yandex.passport.internal.network.a.i(d4);
                }
                ArrayList e4 = com.yandex.passport.internal.network.a.e(jSONObject3);
                if (e4 == null || e4.size() <= 0) {
                    throw new h(string4);
                }
                throw new h((String) e4.get(0));
            case 17:
                l3o l3oVar7 = (l3o) obj;
                l3oVar7.getClass();
                ((com.yandex.passport.internal.network.a) this.receiver).getClass();
                JSONObject b4 = com.yandex.passport.internal.network.a.b(l3oVar7);
                com.yandex.passport.internal.network.a.h(b4);
                String string5 = b4.getString(CommonUrlParts.REQUEST_ID);
                boolean optBoolean = b4.optBoolean("require_user_confirm", false);
                JSONObject jSONObject4 = b4.getJSONObject("client");
                return new g(string5, com.yandex.plus.pay.ui.core.b.x("title", jSONObject4), com.yandex.plus.pay.ui.core.b.x("icon_url", jSONObject4), com.yandex.passport.internal.network.a.g(jSONObject4.getJSONObject("scopes")), optBoolean, com.yandex.passport.internal.network.a.g(b4.getJSONObject("already_granted_scopes")), com.yandex.passport.internal.network.a.g(b4.getJSONObject("requested_scopes")));
            case 18:
                l3o l3oVar8 = (l3o) obj;
                l3oVar8.getClass();
                ((com.yandex.passport.internal.network.a) this.receiver).getClass();
                String c = com.yandex.passport.internal.network.a.c(l3oVar8);
                if (l3oVar8.b()) {
                    return new l(c, 0L);
                }
                if (l3oVar8.d == 401) {
                    throw new com.yandex.passport.common.exception.a();
                }
                throw new h(c);
            case 19:
                l3o l3oVar9 = (l3o) obj;
                l3oVar9.getClass();
                ((com.yandex.passport.internal.network.a) this.receiver).getClass();
                if (l3oVar9.d == 304) {
                    return null;
                }
                String c2 = com.yandex.passport.internal.network.a.c(l3oVar9);
                com.yandex.passport.internal.network.a.h(new JSONObject(c2));
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                String a5 = l3oVar9.f.a("ETag");
                return com.yandex.passport.data.mapper.a.a(w.a((w) quj.r(x3f.d, new com.yandex.passport.internal.storage.d(17)).b(w.Companion.serializer(), c2), c2, a5 != null ? a5 : 0, com.yandex.passport.common.time.a.c(0, currentTimeMillis, 0, 11)));
            case 20:
                l3o l3oVar10 = (l3o) obj;
                l3oVar10.getClass();
                ((com.yandex.passport.internal.network.a) this.receiver).getClass();
                JSONObject b5 = com.yandex.passport.internal.network.a.b(l3oVar10);
                String optString6 = b5.optString("track_id");
                boolean optBoolean2 = b5.optBoolean("can_authorize");
                boolean optBoolean3 = b5.optBoolean("can_register");
                int optInt = b5.optInt("primary_alias_type", -1);
                String x = com.yandex.plus.pay.ui.core.b.x("masked_login", b5);
                JSONArray optJSONArray = b5.optJSONArray("auth_methods");
                ArrayList arrayList = new ArrayList();
                if (optJSONArray != null) {
                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                        String string6 = optJSONArray.getString(i3);
                        b.d.getClass();
                        b[] values = b.values();
                        int length = values.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                bVar = values[i4];
                                if (!Intrinsics.d(bVar.a, string6)) {
                                    i4++;
                                }
                            } else {
                                bVar = null;
                            }
                        }
                        if (bVar != null) {
                            arrayList.add(bVar);
                        }
                    }
                }
                ArrayList e5 = com.yandex.passport.internal.network.a.e(b5);
                JSONObject optJSONObject = b5.optJSONObject("phone_number");
                String string7 = optJSONObject == null ? null : optJSONObject.getString("international");
                JSONObject optJSONObject2 = b5.optJSONObject("secure_phone_number");
                String string8 = optJSONObject2 == null ? null : optJSONObject2.getString("masked_international");
                String x2 = com.yandex.plus.pay.ui.core.b.x("account_type", b5);
                a.c.getClass();
                a[] values2 = a.values();
                int length2 = values2.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length2) {
                        aVar = values2[i5];
                        if (!aVar.a.equals(x2)) {
                            i5++;
                        }
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    a.c.getClass();
                    a[] values3 = a.values();
                    int length3 = values3.length;
                    while (true) {
                        if (i2 < length3) {
                            a aVar4 = values3[i2];
                            if (aVar4.b == optInt) {
                                aVar3 = aVar4;
                            } else {
                                i2++;
                            }
                        }
                    }
                    aVar2 = aVar3;
                } else {
                    aVar2 = aVar;
                }
                return new com.yandex.passport.internal.network.response.d(optBoolean2, optBoolean3, optString6, arrayList, e5, string7, x, aVar2, com.yandex.plus.pay.ui.core.b.x("magic_link_email", b5), string8);
            case 21:
                d0 d0Var = (d0) obj;
                d0Var.getClass();
                EsiaBindActivity esiaBindActivity = (EsiaBindActivity) this.receiver;
                int i6 = EsiaBindActivity.h;
                esiaBindActivity.getClass();
                if (d0Var.equals(b0.a)) {
                    esiaBindActivity.j().x(esiaBindActivity.e, y.b, null);
                } else {
                    if (!(d0Var instanceof c0)) {
                        b6e.s();
                        return null;
                    }
                    esiaBindActivity.setResult(-1, new Intent().putExtra("EXTRA_TASK_ID", ((c0) d0Var).a));
                    esiaBindActivity.j().x(esiaBindActivity.e, y.a, null);
                }
                esiaBindActivity.finish();
                return Unit.a;
            case 22:
                Throwable th = (Throwable) obj;
                th.getClass();
                EsiaBindActivity esiaBindActivity2 = (EsiaBindActivity) this.receiver;
                int i7 = EsiaBindActivity.h;
                esiaBindActivity2.h(th);
                return Unit.a;
            case 23:
                String str5 = (String) obj;
                str5.getClass();
                ((com.yandex.passport.internal.serialization.b) this.receiver).getClass();
                int R = StringsKt.R(str5, ':', 0, false);
                if (R < 1 || R == str5.length() - 1) {
                    return null;
                }
                String substring = str5.substring(0, R);
                try {
                    long parseLong = Long.parseLong(str5.substring(R + 1));
                    if (parseLong <= 0) {
                        return null;
                    }
                    try {
                        com.yandex.passport.common.core.a aVar5 = com.yandex.passport.common.core.b.b;
                        int parseInt = Integer.parseInt(substring);
                        aVar5.getClass();
                        bVar2 = com.yandex.passport.common.core.a.b(parseInt);
                    } catch (Exception unused) {
                        bVar2 = com.yandex.passport.common.core.b.c;
                    }
                    return new f(bVar2, parseLong);
                } catch (NumberFormatException unused2) {
                    return null;
                }
            case 24:
                x xVar = (x) obj;
                xVar.getClass();
                com.yandex.passport.internal.ui.bouncer.chooser.y yVar = (com.yandex.passport.internal.ui.bouncer.chooser.y) this.receiver;
                yVar.getClass();
                yVar.k.a(xVar);
                return Unit.a;
            case 25:
                Bundle bundle = (Bundle) obj;
                bundle.getClass();
                ((com.yandex.passport.internal.properties.b0) this.receiver).getClass();
                bundle.setClassLoader(p.class.getClassLoader());
                com.yandex.passport.internal.properties.c0 c0Var = (com.yandex.passport.internal.properties.c0) bundle.getParcelable("passport-set-current-account-properties");
                if (c0Var != null) {
                    return c0Var;
                }
                xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.c0.class));
                return null;
            case 26:
                Bundle bundle2 = (Bundle) obj;
                bundle2.getClass();
                ((q) this.receiver).getClass();
                bundle2.setClassLoader(p.class.getClassLoader());
                r rVar = (r) bundle2.getParcelable("passport-delete-account-properties");
                if (rVar != null) {
                    return rVar;
                }
                xq0.q(com.appsflyer.internal.k.m("Bundle has no ", r.class));
                return null;
            case 27:
                Bundle bundle3 = (Bundle) obj;
                bundle3.getClass();
                ((t) this.receiver).getClass();
                return t.a(bundle3);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                r0 r0Var = (r0) obj;
                r0Var.getClass();
                ((q0) this.receiver).G(r0Var);
                return Unit.a;
            default:
                Bundle bundle4 = (Bundle) obj;
                bundle4.getClass();
                ((t) this.receiver).getClass();
                return t.a(bundle4);
        }
    }
}
