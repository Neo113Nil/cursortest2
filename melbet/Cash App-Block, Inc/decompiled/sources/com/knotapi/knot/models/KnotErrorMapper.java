package com.knotapi.knot.models;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class KnotErrorMapper {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static KnotError map(String str) {
        try {
            String optString = new JSONObject(str).optString("errorCode", "Internal_Error");
            switch (optString.hashCode()) {
                case -2006660986:
                    if (optString.equals("Client_ID_Not_Found")) {
                        return KnotError.INVALID_CLIENT_ID;
                    }
                    break;
                case -1878152761:
                    if (optString.equals("INVALID_LOGO_ID")) {
                        return KnotError.INVALID_LOGO_ID;
                    }
                    break;
                case -1693047731:
                    if (optString.equals("Session_Not_Found")) {
                        return KnotError.INVALID_SESSION;
                    }
                    break;
                case 296974834:
                    if (optString.equals("INVALID_CARD_NAME")) {
                        return KnotError.INVALID_CARD_NAME;
                    }
                    break;
                case 605589961:
                    if (optString.equals("MERCHANT_ID_NOT_FOUND")) {
                        return KnotError.MERCHANT_ID_NOT_FOUND;
                    }
                    break;
                case 756623932:
                    if (optString.equals("Session_Expired")) {
                        return KnotError.EXPIRED_SESSION;
                    }
                    break;
                case 1535754724:
                    if (optString.equals("INVALID_CUSTOMER_NAME")) {
                        return KnotError.INVALID_CUSTOMER_NAME;
                    }
                    break;
            }
            return KnotError.INTERNAL_ERROR;
        } catch (JSONException unused) {
            return KnotError.INTERNAL_ERROR;
        }
    }
}
