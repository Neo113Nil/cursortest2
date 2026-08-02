package com.anythink.basead.f.e.a;

import android.net.Uri;
import com.anythink.basead.d.e;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        if (r2 == null) goto L32;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0045: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:32:0x0044 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e a(x xVar, w wVar, String str) {
        Throwable th;
        x xVar2;
        w wVar2;
        String str2;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        int responseCode;
        HttpURLConnection httpURLConnection3 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setConnectTimeout(30000);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                } catch (Exception e9) {
                    e = e9;
                    xVar2 = xVar;
                    wVar2 = wVar;
                    str2 = str;
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection3 = httpURLConnection2;
                if (httpURLConnection3 != null) {
                    throw th;
                }
                httpURLConnection3.disconnect();
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
            xVar2 = xVar;
            wVar2 = wVar;
            str2 = str;
            httpURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            if (httpURLConnection3 != null) {
            }
        }
        if (responseCode != 200) {
            xVar2 = xVar;
            wVar2 = wVar;
            str2 = str;
            try {
                com.anythink.core.common.u.e.a(xVar2, wVar2, wVar.H(), str2, String.valueOf(responseCode), "");
            } catch (Exception e11) {
                e = e11;
                com.anythink.core.common.u.e.a(xVar2, wVar2, wVar2.H(), str2, "", e.getMessage());
            }
            httpURLConnection.disconnect();
            return null;
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            sb.append(readLine);
        }
        JSONObject optJSONObject = new JSONObject(sb.toString()).optJSONObject("data");
        e eVar = new e(optJSONObject.optString("dstlink"), "", optJSONObject.optString(com.anythink.expressad.a.f18392M));
        bufferedReader.close();
        inputStreamReader.close();
        if (inputStream != null) {
            inputStream.close();
        }
        httpURLConnection.disconnect();
        return eVar;
    }

    public static String a(String str) {
        try {
            return Uri.parse(str).getQueryParameter("qz_gdt");
        } catch (Throwable unused) {
            return null;
        }
    }
}
