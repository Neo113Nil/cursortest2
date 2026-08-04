package com.gamericefishpro.space.wa;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.u6.s;
import com.gamericefishpro.space.v8.c0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = com.gamericefishpro.space.z8.c.a;
        c0.i("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static h a(Context context) {
        com.gamericefishpro.space.u6.c cVar = new com.gamericefishpro.space.u6.c();
        c0.g(context);
        Resources resources = context.getResources();
        cVar.d = resources;
        cVar.e = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        String strJ = cVar.j("google_app_id");
        if (TextUtils.isEmpty(strJ)) {
            return null;
        }
        return new h(strJ, cVar.j("google_api_key"), cVar.j("firebase_database_url"), cVar.j("ga_trackingId"), cVar.j("gcm_defaultSenderId"), cVar.j("google_storage_bucket"), cVar.j("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return c0.j(this.b, hVar.b) && c0.j(this.a, hVar.a) && c0.j(this.c, hVar.c) && c0.j(this.d, hVar.d) && c0.j(this.e, hVar.e) && c0.j(this.f, hVar.f) && c0.j(this.g, hVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        s sVar = new s(this);
        sVar.c(this.b, "applicationId");
        sVar.c(this.a, "apiKey");
        sVar.c(this.c, "databaseUrl");
        sVar.c(this.e, "gcmSenderId");
        sVar.c(this.f, "storageBucket");
        sVar.c(this.g, "projectId");
        return sVar.toString();
    }
}
