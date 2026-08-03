package ec;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2152g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Serializable f2153h;

    public a(HashMap hashMap) {
        this.f2153h = hashMap;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [oc.a, pc.k] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f2152g) {
            case 0:
                ((k) this.f2153h).invoke();
                return;
            default:
                Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                HashMap hashMap = (HashMap) this.f2153h;
                for (String str : hashMap.keySet()) {
                    buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
                }
                String uri = buildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + uri);
                        }
                        httpURLConnection.disconnect();
                        return;
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (IOException e10) {
                    e = e10;
                    Log.w("HttpUrlPinger", "Error while pinging URL: " + uri + ". " + e.getMessage(), e);
                    return;
                } catch (IndexOutOfBoundsException e11) {
                    Log.w("HttpUrlPinger", "Error while parsing ping URL: " + uri + ". " + e11.getMessage(), e11);
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                    Log.w("HttpUrlPinger", "Error while pinging URL: " + uri + ". " + e.getMessage(), e);
                    return;
                } finally {
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(oc.a aVar) {
        this.f2153h = (k) aVar;
    }
}
