package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.DeviceService;
import com.yandex.passport.data.exceptions.h;
import com.yandex.passport.data.exceptions.i;
import com.yandex.passport.data.exceptions.l;
import com.yandex.passport.internal.entities.e;
import com.yandex.passport.internal.network.a;
import com.yandex.passport.internal.network.client.g;
import com.yandex.passport.internal.network.response.c;
import com.yandex.plus.pay.ui.core.b;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class cb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ cb(g gVar, String str, String str2) {
        this.a = 11;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [z58] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        switch (this.a) {
            case 0:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                String str = this.b;
                if (str != null) {
                    wfp.k(jfpVar, str);
                }
                String str2 = this.c;
                if (str2 != null) {
                    wfp.s(jfpVar, str2);
                }
                return Unit.a;
            case 1:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.q(jfpVar2, 0);
                wfp.s(jfpVar2, this.b);
                wfp.k(jfpVar2, this.c);
                return Unit.a;
            case 2:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.k(jfpVar3, this.b + ", " + this.c);
                return Unit.a;
            case 3:
                String str3 = this.b;
                String str4 = this.c;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("SELECT * FROM disclaimers WHERE id = ? AND type = ?");
                try {
                    D0.E(1, str3);
                    D0.E(2, str4);
                    int v = s7g.v(D0, "_id");
                    int v2 = s7g.v(D0, ConnectableDevice.KEY_ID);
                    int v3 = s7g.v(D0, "type");
                    int v4 = s7g.v(D0, "reason");
                    int v5 = s7g.v(D0, "title");
                    int v6 = s7g.v(D0, DeviceService.KEY_DESC);
                    int v7 = s7g.v(D0, "detailsText");
                    int v8 = s7g.v(D0, "detailsUrl");
                    if (D0.q()) {
                        r11 = new z58(D0.getLong(v), D0.x0(v2), D0.x0(v3), D0.isNull(v4) ? null : D0.x0(v4), D0.isNull(v5) ? null : D0.x0(v5), D0.isNull(v6) ? null : D0.x0(v6), D0.isNull(v7) ? null : D0.x0(v7), D0.isNull(v8) ? null : D0.x0(v8));
                    }
                    return r11;
                } finally {
                }
            case 4:
                String str5 = this.b;
                String str6 = this.c;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("DELETE FROM downloadedPlaylists WHERE userUid = ? AND kind = ?");
                try {
                    D0.E(1, str5);
                    D0.E(2, str6);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 5:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.q(jfpVar4, 0);
                String str7 = this.b;
                if (str7 == null) {
                    str7 = "";
                }
                wfp.s(jfpVar4, str7);
                String str8 = this.c;
                wfp.k(jfpVar4, str8 != null ? str8 : "");
                return Unit.a;
            case 6:
                String str9 = this.b;
                String str10 = this.c;
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                D0 = xjoVar3.D0("SELECT _id FROM playlist WHERE uid=? AND original_id=?");
                try {
                    D0.E(1, str9);
                    D0.E(2, str10);
                    Long l = null;
                    if (D0.q() && !D0.isNull(0)) {
                        l = Long.valueOf(D0.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 7:
                String str11 = this.b;
                String str12 = this.c;
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                D0 = xjoVar4.D0("DELETE FROM pre_save_operation WHERE pre_save_id = ? AND type = ?");
                try {
                    D0.E(1, str11);
                    D0.E(2, str12);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 8:
                jfp jfpVar5 = (jfp) obj;
                jfpVar5.getClass();
                wfp.q(jfpVar5, 0);
                wfp.k(jfpVar5, this.b);
                wfp.s(jfpVar5, this.c);
                return Unit.a;
            case 9:
                jfp jfpVar6 = (jfp) obj;
                jfpVar6.getClass();
                wfp.q(jfpVar6, 2);
                wfp.k(jfpVar6, this.b);
                wfp.s(jfpVar6, this.c);
                return Unit.a;
            case 10:
                jfp jfpVar7 = (jfp) obj;
                jfpVar7.getClass();
                wfp.q(jfpVar7, 0);
                String str13 = this.b;
                if (str13 == null) {
                    str13 = "";
                }
                wfp.s(jfpVar7, str13);
                String str14 = this.c;
                wfp.k(jfpVar7, str14 != null ? str14 : "");
                return Unit.a;
            default:
                l3o l3oVar = (l3o) obj;
                l3oVar.getClass();
                String c = a.c(l3oVar);
                JSONObject jSONObject = new JSONObject(c);
                String string = jSONObject.getString("status");
                if ("ok".equals(string)) {
                    String string2 = jSONObject.getString("x_token");
                    if (string2 == null || string2.length() <= 0 || string2.equals("-")) {
                        string2 = null;
                    }
                    com.yandex.passport.common.account.a aVar = new com.yandex.passport.common.account.a(string2);
                    jSONObject.remove("x_token");
                    String x = b.x("access_token", jSONObject);
                    e eVar = x != null ? new e(x, this.c) : null;
                    jSONObject.remove("access_token");
                    return new c(aVar, b.s((int) (System.currentTimeMillis() / 1000), c), eVar);
                }
                ArrayList e = a.e(jSONObject);
                String x2 = b.x("state", jSONObject);
                String optString = jSONObject.optString("captcha_image_url");
                if (e == null || e.size() <= 0) {
                    throw new h(string);
                }
                boolean contains = e.contains("captcha.required");
                String str15 = this.b;
                if (contains) {
                    throw new com.yandex.passport.data.exceptions.b(optString, str15);
                }
                if ("rfc_totp".equals(x2)) {
                    throw new l((String) e.get(0), str15);
                }
                if (e.contains("rfc_otp.invalid") || e.contains("otp.empty")) {
                    throw new i((String) e.get(0), str15);
                }
                throw new h((String) e.get(0));
        }
    }

    public /* synthetic */ cb(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
