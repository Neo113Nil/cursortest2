package com.yandex.passport.internal.push;

import android.os.Bundle;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.qa;
import defpackage.xq0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public final class i0 {
    public final com.yandex.passport.internal.report.reporters.w0 a;

    public i0(com.yandex.passport.internal.report.reporters.w0 w0Var) {
        w0Var.getClass();
        this.a = w0Var;
    }

    public static ArrayList b(Bundle bundle) {
        List split$default;
        String string = bundle.getString("2fa_pictures_am");
        if (string == null) {
            xq0.q("missing key 2fa_pictures_am");
            return null;
        }
        split$default = StringsKt__StringsKt.split$default(string, new String[]{StringUtils.COMMA}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        return arrayList;
    }

    public static long c(Bundle bundle) {
        String string = bundle.getString("timestamp");
        return string != null ? TimeUnit.SECONDS.toMillis(Long.parseLong(string)) : new Date().getTime();
    }

    public final h0 a(Bundle bundle) {
        boolean z;
        boolean z2;
        Long l;
        bundle.getClass();
        try {
            if (bundle.getString("webview_url") == null) {
                throw new IllegalStateException("missing key or value for key webview_url");
            }
            String string = bundle.getString("platform");
            String string2 = bundle.getString("passp_am_proto");
            float parseFloat = string2 != null ? Float.parseFloat(string2) : -1.0f;
            String string3 = bundle.getString("push_service");
            String string4 = bundle.getString("event_name");
            long c = c(bundle);
            String string5 = bundle.getString("uid");
            if (string5 == null) {
                throw new IllegalStateException("missing key uid");
            }
            long parseLong = Long.parseLong(string5);
            String string6 = bundle.getString("push_id");
            String string7 = bundle.getString("min_am_version");
            String string8 = bundle.getString("title");
            String string9 = bundle.getString("body");
            boolean parseBoolean = Boolean.parseBoolean(bundle.getString("is_silent"));
            String string10 = bundle.getString("subtitle");
            String string11 = bundle.getString("webview_url");
            if (string11 == null) {
                throw new IllegalStateException("missing key webview_url");
            }
            boolean parseBoolean2 = Boolean.parseBoolean(bundle.getString("require_web_auth"));
            String string12 = bundle.getString("body_include_code");
            String string13 = bundle.getString("track_id");
            boolean parseBoolean3 = Boolean.parseBoolean(bundle.getString("show_code_in_notification"));
            String string14 = bundle.getString("push_expire_at");
            if (string14 != null) {
                z = parseBoolean;
                z2 = parseBoolean3;
                l = Long.valueOf(TimeUnit.SECONDS.toMillis(Long.parseLong(string14)));
            } else {
                z = parseBoolean;
                z2 = parseBoolean3;
                l = null;
            }
            String string15 = bundle.getString("push_type");
            com.yandex.passport.sloth.data.h hVar = string15 != null ? string15.equals("notification") ? com.yandex.passport.sloth.data.h.a : string15.equals("data") ? com.yandex.passport.sloth.data.h.b : com.yandex.passport.sloth.data.h.c : com.yandex.passport.sloth.data.h.c;
            String string16 = bundle.getString("open_in_browser");
            Boolean valueOf = string16 != null ? Boolean.valueOf(Boolean.parseBoolean(string16)) : null;
            String string17 = bundle.getString("require_web_auth_with_uid");
            return new h0(string, parseFloat, string3, string4, c, parseLong, string6, string8, string9, string10, string7, Boolean.valueOf(z), string11, Boolean.valueOf(parseBoolean2), string12, string13, Boolean.valueOf(z2), l, hVar, valueOf, string17 != null ? Boolean.valueOf(Boolean.parseBoolean(string17)) : null);
        } catch (Throwable th) {
            com.yandex.passport.internal.report.reporters.w0 w0Var = this.a;
            w0Var.getClass();
            w0Var.n(qa.d, new ff("push_payload", 17, false), new ff(th));
            throw th;
        }
    }
}
