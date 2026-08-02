package com.squareup.cash.sheet;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.domerrors.InvalidStateError;
import androidx.credentials.exceptions.domerrors.NotAllowedError;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class RealSheetStateKt {
    public static GetCredentialException createFrom(String str, String str2) {
        Exception access$generateException;
        str.getClass();
        try {
            GetPublicKeyCredentialDomException getPublicKeyCredentialDomException = new GetPublicKeyCredentialDomException(new DataError(24), null);
            if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(1), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(2), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(3), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(0), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(4), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(5), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(6), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(7), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(8), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(9), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new InvalidStateError(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(10), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(11), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(12), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new NotAllowedError(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(13), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(14), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(15), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(16), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(17), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(18), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(19), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(20), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(21), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(22), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(23), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(24), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                access$generateException = PinnedKt.access$generateException(new DataError(25), str2, getPublicKeyCredentialDomException);
            } else {
                if (!str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new FrameworkClassParsingException();
                }
                access$generateException = PinnedKt.access$generateException(new DataError(26), str2, getPublicKeyCredentialDomException);
            }
            return (GetCredentialException) access$generateException;
        } catch (FrameworkClassParsingException unused) {
            return new GetCredentialCustomException(str2, str);
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.NoOperation.deepLinkSpecs;
    }

    public static final Float getOffsetOrNull(AnchoredDraggableState anchoredDraggableState) {
        anchoredDraggableState.getClass();
        float floatValue = anchoredDraggableState.offset$delegate.getFloatValue();
        Float valueOf = Float.valueOf(floatValue);
        if (Math.abs(floatValue) <= Float.MAX_VALUE) {
            return valueOf;
        }
        return null;
    }
}
