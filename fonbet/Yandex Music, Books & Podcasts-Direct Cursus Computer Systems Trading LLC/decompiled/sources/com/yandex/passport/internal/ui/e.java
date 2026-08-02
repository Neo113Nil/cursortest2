package com.yandex.passport.internal.ui;

import com.yandex.passport.R;
import defpackage.f1d;
import defpackage.ouj;
import defpackage.xy0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class e {
    public static final Pattern d = Pattern.compile("backend\\..*_failed");
    public final xy0 a;
    public final ArrayList b;
    public final ArrayList c;

    static {
        new HashSet(Arrays.asList("invalidid", "track_id.invalid", "track.not_found", "unknowntrack", "unknownnode"));
    }

    public e() {
        xy0 xy0Var = new xy0(0);
        this.a = xy0Var;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        xy0Var.put("unknown server response", Integer.valueOf(R.string.passport_error_unknown_server_response));
        xy0Var.put("network error", Integer.valueOf(R.string.passport_error_network_fail));
        xy0Var.put("unknown error", Integer.valueOf(R.string.passport_error_unknown));
        xy0Var.put("account.disabled", Integer.valueOf(R.string.passport_error_account_disabled));
        xy0Var.put("account.disabled_on_deletion", Integer.valueOf(R.string.passport_error_account_disabled));
        xy0Var.put("track_id.invalid", Integer.valueOf(R.string.passport_error_unknown));
        xy0Var.put("track.invalid_state", Integer.valueOf(R.string.passport_error_unknown));
        xy0Var.put("code.invalid", Integer.valueOf(R.string.passport_error_code_incorrect));
        xy0Var.put("confirmations_limit.exceeded", Integer.valueOf(R.string.passport_error_code_limit_exceeded));
        xy0Var.put("code.empty", Integer.valueOf(R.string.passport_error_code_empty));
        xy0Var.put("webam.failed", Integer.valueOf(R.string.passport_error_unknown));
        xy0Var.put("oauth_token.invalid", Integer.valueOf(R.string.passport_account_not_authorized_default_message));
        xy0Var.put("sms_limit.exceeded", Integer.valueOf(R.string.passport_reg_error_sms_send_limit_exceeded));
        arrayList.add("network error");
        arrayList.add("unknown server response");
        arrayList.add("unknown error");
        arrayList.add("null.blackboxfailed");
        ouj.A("track_id.invalid", "track.invalid", "track.invalid_state", "track_id.empty", arrayList2);
        ouj.A("track.not_found", "firstname.invalid", "lastname.invalid", "account.global_logout", arrayList2);
        arrayList2.add("webam.failed");
    }

    public f a(Throwable th) {
        return new f(th instanceof com.yandex.passport.data.exceptions.h ? th.getMessage() : th instanceof JSONException ? "unknown server response" : th instanceof IOException ? "network error" : "unknown error", th);
    }

    public final int b(String str) {
        Integer num = (Integer) this.a.get(str);
        if (num != null) {
            return num.intValue();
        }
        String g = f1d.g("Unknown error description=", str);
        if (this.b.contains(str) || d.matcher(str).find()) {
            com.yandex.passport.legacy.a.e(6, g, null);
        } else {
            com.yandex.passport.legacy.a.d(new Exception(g));
        }
        return R.string.passport_error_unknown;
    }
}
