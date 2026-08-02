package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes11.dex */
public final class s091 implements Runnable {
    public static final ngz c = new ngz("RevokeAccessOperation", new String[0]);
    public final String a;
    public final x8u0 b;

    public s091(String str) {
        cvw.i(str);
        this.a = str;
        this.b = new x8u0(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ngz ngzVar = c;
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                Log.e(ngzVar.c, ngzVar.a("Unable to revoke access!", new Object[0]));
            }
            String str = "Response Code: " + responseCode;
            Object[] objArr = new Object[0];
            if (ngzVar.b <= 3) {
                ngzVar.a(str, objArr);
            }
        } catch (IOException e) {
            Log.e(ngzVar.c, ngzVar.a("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]));
        } catch (Exception e2) {
            Log.e(ngzVar.c, ngzVar.a("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]));
        }
        this.b.a(status);
    }
}
