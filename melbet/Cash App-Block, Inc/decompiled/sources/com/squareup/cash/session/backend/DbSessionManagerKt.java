package com.squareup.cash.session.backend;

import android.os.Bundle;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreatePasswordResponse;
import androidx.credentials.CreatePublicKeyCredentialResponse;
import androidx.credentials.internal.FrameworkClassParsingException;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.franklin.common.SessionStatus;
import kotlin.collections.EmptyList;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class DbSessionManagerKt {
    public static CreateCredentialResponse createFrom(Bundle bundle, String str) {
        str.getClass();
        bundle.getClass();
        try {
            int hashCode = str.hashCode();
            if (hashCode != -1678407252) {
                if (hashCode != -543568185) {
                    if (hashCode == -95037569 && str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                            string2.getClass();
                            return new CreatePublicKeyCredentialResponse(bundle, string2);
                        } catch (Exception unused) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                } else if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return new CreatePasswordResponse(bundle, "android.credentials.TYPE_PASSWORD_CREDENTIAL");
                }
                throw new FrameworkClassParsingException();
            }
            if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                try {
                    String string3 = bundle.getString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON");
                    string3.getClass();
                    new Bundle().putString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON", string3);
                    CreatePasswordResponse createPasswordResponse = new CreatePasswordResponse();
                    if (string3.length() != 0) {
                        try {
                            new JSONObject(string3);
                            return createPasswordResponse;
                        } catch (Exception unused2) {
                        }
                    }
                    throw new IllegalArgumentException("responseJson must not be empty, and must be a valid JSON");
                } catch (Exception unused3) {
                    throw new FrameworkClassParsingException();
                }
            }
            throw new FrameworkClassParsingException();
        } catch (FrameworkClassParsingException unused4) {
            CreatePasswordResponse createPasswordResponse2 = new CreatePasswordResponse();
            if (str.length() > 0) {
                return createPasswordResponse2;
            }
            a$$ExternalSyntheticBUOutline0.m$3("type should not be empty");
            return null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.InitiateSingleUsePayment.deepLinkSpecs;
    }

    public static final Session getSession(com.squareup.cash.db.Session session) {
        session.getClass();
        String str = session.session_token;
        SessionStatus sessionStatus = toSessionStatus(session.session_status);
        if (str == null || sessionStatus == null) {
            return null;
        }
        return new Session(str, sessionStatus);
    }

    public static final SessionState toSessionState(com.squareup.cash.db.Session session) {
        session.getClass();
        String str = session.app_token;
        SessionStatus sessionStatus = toSessionStatus(session.session_status);
        String str2 = session.session_token;
        Session session2 = (str2 == null || sessionStatus == null) ? null : new Session(str2, sessionStatus);
        String str3 = session.account_token;
        String str4 = session.target_account_token;
        if (str == null || session2 == null) {
            return new NotInitiatedState(str);
        }
        String str5 = session2.token;
        return (session2.status != SessionStatus.FULL || str3 == null) ? new InitiatedState(str, str5) : str4 != null ? new SwitchingState(str, str5, str4) : new AuthenticatedState(str, str5, str3);
    }

    public static final SessionStatus toSessionStatus(Long l) {
        if (l != null && l.longValue() == 1) {
            return SessionStatus.PARTIAL;
        }
        if (l != null && l.longValue() == 2) {
            return SessionStatus.FULL;
        }
        if (l != null && l.longValue() == 3) {
            return SessionStatus.ANONYMOUS;
        }
        return null;
    }
}
