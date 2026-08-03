package i7;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Arrays;
import org.fortheloss.st.R;
import p6.u;
import x4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f3245a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3246b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3247c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3248d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3249e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3250f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3251g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = t6.c.f6539a;
        u.i("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f3246b = str;
        this.f3245a = str2;
        this.f3247c = str3;
        this.f3248d = str4;
        this.f3249e = str5;
        this.f3250f = str6;
        this.f3251g = str7;
    }

    public static i a(Context context) {
        x4.c cVar = new x4.c();
        u.g(context);
        Resources resources = context.getResources();
        cVar.f8290g = resources;
        cVar.f8291h = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        String e10 = cVar.e("google_app_id");
        if (TextUtils.isEmpty(e10)) {
            return null;
        }
        return new i(e10, cVar.e("google_api_key"), cVar.e("firebase_database_url"), cVar.e("ga_trackingId"), cVar.e("gcm_defaultSenderId"), cVar.e("google_storage_bucket"), cVar.e("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return u.j(this.f3246b, iVar.f3246b) && u.j(this.f3245a, iVar.f3245a) && u.j(this.f3247c, iVar.f3247c) && u.j(this.f3248d, iVar.f3248d) && u.j(this.f3249e, iVar.f3249e) && u.j(this.f3250f, iVar.f3250f) && u.j(this.f3251g, iVar.f3251g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3246b, this.f3245a, this.f3247c, this.f3248d, this.f3249e, this.f3250f, this.f3251g});
    }

    public final String toString() {
        s sVar = new s(this);
        sVar.b(this.f3246b, "applicationId");
        sVar.b(this.f3245a, "apiKey");
        sVar.b(this.f3247c, "databaseUrl");
        sVar.b(this.f3249e, "gcmSenderId");
        sVar.b(this.f3250f, "storageBucket");
        sVar.b(this.f3251g, "projectId");
        return sVar.toString();
    }
}
