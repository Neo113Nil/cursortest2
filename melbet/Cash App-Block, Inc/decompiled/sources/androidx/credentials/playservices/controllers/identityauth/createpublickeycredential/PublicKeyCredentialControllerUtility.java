package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import android.util.Base64;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.domerrors.InvalidStateError;
import androidx.credentials.exceptions.domerrors.NotAllowedError;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class PublicKeyCredentialControllerUtility {
    public static final LinkedHashMap orderedErrorCodeToExceptions;

    public abstract class Companion {
        public static byte[] getChallenge(JSONObject jSONObject) {
            LinkedHashMap linkedHashMap = PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
            String optString = jSONObject.optString("challenge", "");
            optString.getClass();
            if (optString.length() == 0) {
                throw new JSONException("Challenge not found in request or is unexpectedly empty");
            }
            byte[] decode = Base64.decode(optString, 11);
            decode.getClass();
            return decode;
        }
    }

    static {
        Pair[] pairArr = {new Pair(ErrorCode.UNKNOWN_ERR, new DataError(24)), new Pair(ErrorCode.ABORT_ERR, new DataError(1)), new Pair(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new DataError(14)), new Pair(ErrorCode.CONSTRAINT_ERR, new DataError(2)), new Pair(ErrorCode.DATA_ERR, new DataError(0)), new Pair(ErrorCode.INVALID_STATE_ERR, new InvalidStateError()), new Pair(ErrorCode.ENCODING_ERR, new DataError(4)), new Pair(ErrorCode.NETWORK_ERR, new DataError(11)), new Pair(ErrorCode.NOT_ALLOWED_ERR, new NotAllowedError()), new Pair(ErrorCode.NOT_SUPPORTED_ERR, new DataError(15)), new Pair(ErrorCode.SECURITY_ERR, new DataError(20)), new Pair(ErrorCode.TIMEOUT_ERR, new DataError(22))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(12));
        MapsKt__MapsKt.putAll(linkedHashMap, pairArr);
        orderedErrorCodeToExceptions = linkedHashMap;
    }
}
