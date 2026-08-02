package defpackage;

import android.util.Log;
import com.connectsdk.etc.helper.HttpMessage;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public final class czw implements Runnable {
    public static final t7e c = new t7e("RevokeAccessOperation", new String[0]);
    public final String a;
    public final vgr b;

    public czw(String str) {
        y1g.C(str);
        this.a = str;
        this.b = new vgr(null, 0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        t7e t7eVar = c;
        Status status = Status.g;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.a).openConnection();
            httpURLConnection.setRequestProperty(HttpMessage.CONTENT_TYPE_HEADER, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e(t7eVar.b, t7eVar.c.concat("Unable to revoke access!"));
            }
            t7eVar.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            Log.e(t7eVar.b, t7eVar.c.concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e2) {
            Log.e(t7eVar.b, t7eVar.c.concat("Exception when revoking access: ".concat(String.valueOf(e2.toString()))));
        }
        this.b.g(status);
    }
}
