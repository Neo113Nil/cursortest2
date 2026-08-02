package com.plaid.internal;

import android.net.Network;
import com.plaid.internal.AbstractC0321w7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes5.dex */
public final class J {
    public final C0184h4 a(String str, Network network) {
        str.getClass();
        network.getClass();
        try {
            URLConnection openConnection = network.openConnection(new URL(str));
            if (openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod("POST");
            C0184h4 c0184h4 = new C0184h4(httpURLConnection.getResponseCode(), a(httpURLConnection));
            httpURLConnection.disconnect();
            return c0184h4;
        } catch (AbstractC0321w7.d e) {
            throw e;
        } catch (Exception e2) {
            throw new AbstractC0321w7.c(e2);
        }
    }

    public static String a(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        String str = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return str;
            }
            str = str.concat(readLine);
        }
    }
}
