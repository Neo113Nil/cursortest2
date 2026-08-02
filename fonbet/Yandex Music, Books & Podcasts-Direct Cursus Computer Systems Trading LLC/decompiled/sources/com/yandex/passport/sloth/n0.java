package com.yandex.passport.sloth;

import android.net.Uri;
import defpackage.b6;
import defpackage.dfi;
import defpackage.tah;
import defpackage.uah;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class n0 extends b6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p pVar, boolean z, String str, Long l) {
        super(16, r0.OPEN_EXTERNAL_URL, uah.e(new Pair("url", Uri.parse(pVar.a).buildUpon().clearQuery().build().toString()), new Pair("uid", String.valueOf(l)), new Pair("success", String.valueOf(z)), new Pair("browser_package_name", String.valueOf(str)), new Pair("is_auth_url_required", String.valueOf(pVar.b)), new Pair("is_web_view_closed", String.valueOf(pVar.c))));
        pVar.getClass();
    }

    public n0(u0 u0Var, String str) {
        super(16, r0.PHONE_NUMBER_HINT, uah.e(new Pair("state", u0Var.a), new Pair("throwable_message", String.valueOf(str))));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n0(String str, Pair... pairArr) {
        super(16, r0, r4);
        Map map;
        r0 r0Var = r0.ERROR;
        Map b = tah.b(new Pair("ui_error", str));
        b.getClass();
        if (b.isEmpty()) {
            map = uah.p(pairArr);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(b);
            uah.k(linkedHashMap, pairArr);
            map = linkedHashMap;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(String str, int i) {
        super(16, r0.BLOCKER_URL, dfi.n("blocked_url", String.valueOf(str != null ? Uri.parse(str).buildUpon().clearQuery().build() : null)));
        switch (i) {
            case 3:
                super(16, r0.ERROR, dfi.n("error", str));
                break;
            case 7:
                super(16, r0.FALLBACK, dfi.n("reason", str));
                break;
            case 20:
                str.getClass();
                super(16, r0.UI_WISH, dfi.n("ui_wish", str));
                break;
            default:
                break;
        }
    }
}
