package com.gamericefishpro.space.o8;

import android.net.Uri;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ei.l;
import java.io.IOException;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Thread {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Serializable e;

    public c(b bVar, HashMap map) {
        this.e = map;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.gamericefishpro.space.ei.l, kotlin.jvm.functions.Function0] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                HashMap map = (HashMap) this.e;
                for (String str : map.keySet()) {
                    builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
                }
                String string = builderBuildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb = new StringBuilder(String.valueOf(responseCode).length() + 54 + String.valueOf(string).length());
                            sb.append("Received non-success response code ");
                            sb.append(responseCode);
                            sb.append(" from pinging URL: ");
                            sb.append(string);
                            Log.w("HttpUrlPinger", sb.toString());
                            break;
                        }
                        return;
                    } finally {
                        httpURLConnection.disconnect();
                    }
                } catch (IOException e) {
                    e = e;
                    String message = e.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + String.valueOf(string).length() + 27);
                    sb2.append("Error while pinging URL: ");
                    sb2.append(string);
                    sb2.append(". ");
                    sb2.append(message);
                    Log.w("HttpUrlPinger", sb2.toString(), e);
                    return;
                } catch (IndexOutOfBoundsException e2) {
                    String message2 = e2.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(string).length() + 32);
                    sb3.append("Error while parsing ping URL: ");
                    sb3.append(string);
                    sb3.append(". ");
                    sb3.append(message2);
                    Log.w("HttpUrlPinger", sb3.toString(), e2);
                    return;
                } catch (RuntimeException e3) {
                    e = e3;
                    String message3 = e.getMessage();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(message3).length() + String.valueOf(string).length() + 27);
                    sb4.append("Error while pinging URL: ");
                    sb4.append(string);
                    sb4.append(". ");
                    sb4.append(message3);
                    Log.w("HttpUrlPinger", sb4.toString(), e);
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            default:
                ((l) this.e).invoke();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Function0 function0) {
        this.e = (l) function0;
    }
}
