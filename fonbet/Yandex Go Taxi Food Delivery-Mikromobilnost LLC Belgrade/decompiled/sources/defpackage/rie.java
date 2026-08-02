package defpackage;

import android.content.UriMatcher;
import android.net.Uri;

/* loaded from: classes8.dex */
public final class rie implements qie {
    public final String a;
    public final String b;
    public final mzz c;
    public final UriMatcher d;

    public rie(b03 b03Var) {
        String applicationId = b03Var.getApplicationId();
        this.a = applicationId;
        this.b = oyr.p("content://", applicationId, "/");
        this.c = new mzz(64);
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.d = uriMatcher;
        uriMatcher.addURI(applicationId, "excluded_parks", 17);
        uriMatcher.addURI(applicationId, "geofences_v2", 25);
        uriMatcher.addURI(applicationId, "orderchat", 26);
        uriMatcher.addURI(applicationId, "orderchat_pending", 27);
        uriMatcher.addURI(applicationId, "geofences_bans", 28);
        uriMatcher.addURI(applicationId, "brandings", 29);
        uriMatcher.addURI(applicationId, "zero_km", 30);
    }

    public final Uri a(String str) {
        Uri uri;
        synchronized (this.c) {
            uri = (Uri) this.c.c(str);
            if (uri == null) {
                uri = Uri.parse(this.b + str);
                this.c.d(str, uri);
            }
        }
        return uri;
    }
}
