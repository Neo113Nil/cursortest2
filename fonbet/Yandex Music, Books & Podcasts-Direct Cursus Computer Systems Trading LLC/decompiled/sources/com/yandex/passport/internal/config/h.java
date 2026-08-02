package com.yandex.passport.internal.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.yandex.passport.data.network.q5;
import defpackage.b6e;
import defpackage.btf;
import defpackage.jyr;

/* loaded from: classes4.dex */
public final class h {
    public final Context a;
    public final jyr b;

    public h(Context context) {
        context.getClass();
        this.a = context;
        this.b = btf.b(new com.yandex.passport.internal.common.e(2, this));
    }

    public static String c(com.yandex.passport.common.core.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return "tib.passport.yandex.net";
        }
        if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
            return "tib-test.passport.yandex.net";
        }
        b6e.s();
        return null;
    }

    public final Uri a(com.yandex.passport.common.core.b bVar) {
        Uri parse;
        bVar.getClass();
        try {
            String string = ((SharedPreferences) this.b.getValue()).getString(com.yandex.plus.core.locale.b.r(bVar, "backend_uri_template"), null);
            if (string != null && (parse = Uri.parse(string)) != null) {
                return parse;
            }
            Uri build = new Uri.Builder().scheme("https").authority(c(bVar)).path("/1/bundle/biometrics/ebs").build();
            build.getClass();
            return build;
        } catch (Exception unused) {
            Uri build2 = new Uri.Builder().scheme("https").authority(c(bVar)).path("/1/bundle/biometrics/ebs").build();
            build2.getClass();
            return build2;
        }
    }

    public final String b(com.yandex.passport.common.core.b bVar) {
        bVar.getClass();
        String string = ((SharedPreferences) this.b.getValue()).getString(com.yandex.plus.core.locale.b.r(bVar, "bio_collecting_type"), null);
        return string == null ? "face_only_with_webinterface_age" : string;
    }

    public final String d(com.yandex.passport.common.core.b bVar) {
        bVar.getClass();
        String string = ((SharedPreferences) this.b.getValue()).getString(com.yandex.plus.core.locale.b.r(bVar, "ebs_uri_template"), null);
        if (string != null) {
            return string;
        }
        int ordinal = bVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return "https://gost.ebs.ru/api/v3/verifications/%s/upload";
        }
        if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
            return "https://int.ebs.ru:8896/api/v3/verifications/%s/upload";
        }
        b6e.s();
        return null;
    }

    public final Uri e(com.yandex.passport.common.core.b bVar) {
        Uri parse;
        bVar.getClass();
        try {
            String string = ((SharedPreferences) this.b.getValue()).getString(com.yandex.plus.core.locale.b.r(bVar, "tib_uri"), null);
            if (string != null && (parse = Uri.parse(string)) != null) {
                return parse;
            }
            Uri build = new Uri.Builder().scheme("https").authority(c(bVar)).path("/servlets/api/v2").build();
            build.getClass();
            return build;
        } catch (Exception unused) {
            Uri build2 = new Uri.Builder().scheme("https").authority(c(bVar)).path("/servlets/api/v2").build();
            build2.getClass();
            return build2;
        }
    }

    public final void f(com.yandex.passport.common.core.b bVar, q5 q5Var) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.b.getValue();
        sharedPreferences.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (q5Var == null) {
            edit.clear();
        } else {
            edit.putString(com.yandex.plus.core.locale.b.r(bVar, "bio_collecting_type"), q5Var.a);
            edit.putString(com.yandex.plus.core.locale.b.r(bVar, "tib_uri"), q5Var.b);
            edit.putString(com.yandex.plus.core.locale.b.r(bVar, "backend_uri_template"), q5Var.c);
            edit.putString(com.yandex.plus.core.locale.b.r(bVar, "ebs_uri_template"), q5Var.d);
        }
        edit.commit();
    }
}
