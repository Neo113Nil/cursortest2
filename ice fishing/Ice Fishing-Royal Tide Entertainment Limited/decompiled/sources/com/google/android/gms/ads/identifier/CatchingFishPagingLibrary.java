package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class CatchingFishPagingLibrary extends Thread {
    public final /* synthetic */ HashMap CatchingFishReduxKtor;

    public CatchingFishPagingLibrary(HashMap hashMap) {
        this.CatchingFishReduxKtor = hashMap;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap hashMap = this.CatchingFishReduxKtor;
        for (String str : hashMap.keySet()) {
            buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    new StringBuilder(String.valueOf(uri).length() + 65);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            e = e;
            String message = e.getMessage();
            new StringBuilder(String.valueOf(message).length() + String.valueOf(uri).length() + 27);
        } catch (IndexOutOfBoundsException e2) {
            String message2 = e2.getMessage();
            new StringBuilder(String.valueOf(message2).length() + String.valueOf(uri).length() + 32);
        } catch (RuntimeException e3) {
            e = e3;
            String message3 = e.getMessage();
            new StringBuilder(String.valueOf(message3).length() + String.valueOf(uri).length() + 27);
        } catch (Throwable th) {
            throw th;
        }
    }
}
