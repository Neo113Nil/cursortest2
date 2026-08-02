package Q3;

import R2.w;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C3067cm;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f2674a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2675b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2676c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2677d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2678e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2679f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2680g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = V2.c.f3404a;
        w.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f2675b = str;
        this.f2674a = str2;
        this.f2676c = str3;
        this.f2677d = str4;
        this.f2678e = str5;
        this.f2679f = str6;
        this.f2680g = str7;
    }

    public static i a(Context context) {
        S0.c cVar = new S0.c(context);
        String j6 = cVar.j("google_app_id");
        if (TextUtils.isEmpty(j6)) {
            return null;
        }
        return new i(j6, cVar.j("google_api_key"), cVar.j("firebase_database_url"), cVar.j("ga_trackingId"), cVar.j("gcm_defaultSenderId"), cVar.j("google_storage_bucket"), cVar.j("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return w.l(this.f2675b, iVar.f2675b) && w.l(this.f2674a, iVar.f2674a) && w.l(this.f2676c, iVar.f2676c) && w.l(this.f2677d, iVar.f2677d) && w.l(this.f2678e, iVar.f2678e) && w.l(this.f2679f, iVar.f2679f) && w.l(this.f2680g, iVar.f2680g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2675b, this.f2674a, this.f2676c, this.f2677d, this.f2678e, this.f2679f, this.f2680g});
    }

    public final String toString() {
        C3067cm c3067cm = new C3067cm(this);
        c3067cm.B(this.f2675b, "applicationId");
        c3067cm.B(this.f2674a, "apiKey");
        c3067cm.B(this.f2676c, "databaseUrl");
        c3067cm.B(this.f2678e, "gcmSenderId");
        c3067cm.B(this.f2679f, "storageBucket");
        c3067cm.B(this.f2680g, "projectId");
        return c3067cm.toString();
    }
}
