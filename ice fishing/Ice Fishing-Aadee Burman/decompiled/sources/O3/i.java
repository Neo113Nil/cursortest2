package O3;

import P2.w;
import S0.s;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2991bm;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f2358a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2359b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2360c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2361d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2362e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2363f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2364g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = T2.c.f3088a;
        w.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f2359b = str;
        this.f2358a = str2;
        this.f2360c = str3;
        this.f2361d = str4;
        this.f2362e = str5;
        this.f2363f = str6;
        this.f2364g = str7;
    }

    public static i a(Context context) {
        C2991bm c2991bm = new C2991bm(context, 4);
        String P8 = c2991bm.P("google_app_id");
        if (TextUtils.isEmpty(P8)) {
            return null;
        }
        return new i(P8, c2991bm.P("google_api_key"), c2991bm.P("firebase_database_url"), c2991bm.P("ga_trackingId"), c2991bm.P("gcm_defaultSenderId"), c2991bm.P("google_storage_bucket"), c2991bm.P("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return w.l(this.f2359b, iVar.f2359b) && w.l(this.f2358a, iVar.f2358a) && w.l(this.f2360c, iVar.f2360c) && w.l(this.f2361d, iVar.f2361d) && w.l(this.f2362e, iVar.f2362e) && w.l(this.f2363f, iVar.f2363f) && w.l(this.f2364g, iVar.f2364g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2359b, this.f2358a, this.f2360c, this.f2361d, this.f2362e, this.f2363f, this.f2364g});
    }

    public final String toString() {
        s sVar = new s(this);
        sVar.f(this.f2359b, "applicationId");
        sVar.f(this.f2358a, "apiKey");
        sVar.f(this.f2360c, "databaseUrl");
        sVar.f(this.f2362e, "gcmSenderId");
        sVar.f(this.f2363f, "storageBucket");
        sVar.f(this.f2364g, "projectId");
        return sVar.toString();
    }
}
