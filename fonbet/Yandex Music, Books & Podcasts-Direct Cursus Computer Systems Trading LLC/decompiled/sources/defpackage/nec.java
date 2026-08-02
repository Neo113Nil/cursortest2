package defpackage;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class nec {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public nec(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = flr.a;
        y1g.I("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static nec a(Context context) {
        rjp rjpVar = new rjp(context, 5);
        String d = rjpVar.d("google_app_id");
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        return new nec(d, rjpVar.d("google_api_key"), rjpVar.d("firebase_database_url"), rjpVar.d("ga_trackingId"), rjpVar.d("gcm_defaultSenderId"), rjpVar.d("google_storage_bucket"), rjpVar.d("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nec)) {
            return false;
        }
        nec necVar = (nec) obj;
        return ldg.s(this.b, necVar.b) && ldg.s(this.a, necVar.a) && ldg.s(this.c, necVar.c) && ldg.s(this.d, necVar.d) && ldg.s(this.e, necVar.e) && ldg.s(this.f, necVar.f) && ldg.s(this.g, necVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        md7 md7Var = new md7(this);
        md7Var.a(this.b, "applicationId");
        md7Var.a(this.a, Constants.KEY_API_KEY);
        md7Var.a(this.c, "databaseUrl");
        md7Var.a(this.e, "gcmSenderId");
        md7Var.a(this.f, "storageBucket");
        md7Var.a(this.g, "projectId");
        return md7Var.toString();
    }
}
