package com.fillr.core.utilities;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import bo.app.ng$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;
import timber.log.Timber;

/* loaded from: classes4.dex */
public abstract class ConnectionUtil {
    public static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String calculateSignature(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
            byte[] doFinal = mac.doFinal(str.getBytes());
            char[] cArr = DIGITS_LOWER;
            char[] cArr2 = new char[doFinal.length << 1];
            int i = 0;
            for (byte b : doFinal) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b & 240) >>> 4];
                i += 2;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception e) {
            Log.w("PayloadSigningUtil", e.getMessage() + "");
            return "";
        }
    }

    public static String getMappingRequestMessage(JSONObject jSONObject) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("fields");
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getJSONObject(i).getString("pop_id"));
            }
            Collections.sort(arrayList, new ng$$ExternalSyntheticLambda0(25));
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            return sb.toString();
        } catch (Exception unused) {
            Timber.Forest.e("Error calculating hmac", new Object[0]);
            return "";
        }
    }

    public static boolean isConnected(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }
}
