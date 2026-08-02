package ru.cprocsp.NGate.tools;

import ru.CryptoPro.JCP.Util.GetProperty;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes4.dex */
public interface Constants extends ACSPConstants {
    public static final String EXT_CLIENT_AUTH = "1.3.6.1.5.5.7.3.2";
    public static final String HEADER_SEPARATOR = "\r\n\r\n";
    public static final String INTENT_CLIENT_UPDATE_URL = "clientUpdateURL";
    public static final int INTENT_CONTAINER_ID = 4101;
    public static final int INTENT_LICENSE_ID = 4103;
    public static final int INTENT_LOG_ID = 4100;
    public static final String INTENT_PARAM_AUTH_TYPE = "authType";
    public static final String INTENT_PARAM_CALLER_MESSAGE = "callerMessage";
    public static final String INTENT_PARAM_CANCEL_AUTH = "cancel_auth";
    public static final String INTENT_PARAM_ENTERED_LOGIN = "enteredLogin";
    public static final String INTENT_PARAM_ENTERED_PASSWORD_LOGIN = "enteredPasswordLogin";
    public static final String INTENT_PARAM_REQUIRE_AUTH_DATA = "requireAuthData";
    public static final String INTENT_PARAM_REQUIRE_PERMISSION = "requirePermission";
    public static final String INTENT_PARAM_RESPONSE_AUTH_DATA = "responseAuthData";
    public static final String INTENT_PARAM_RESPONSE_CODE = "responseCode";
    public static final String INTENT_PARAM_SERVER_ALIAS = "serverAlias";
    public static final String INTENT_PARAM_SERVER_CERT = "server_cert";
    public static final String INTENT_PARAM_SERVER_ID = "serverId";
    public static final String INTENT_PARAM_TITLE_ID = "titleId";
    public static final int INTENT_SETTINGS_ID = 4102;
    public static final int INTENT_STORE_ID = 4099;
    public static final int INTENT_VPN_ID = 4098;
    public static final String LINE_SEPARATOR = "\r\n";
    public static final String PREF_NAME = "NGate";
    public static final String RESTRICTION_KEY_ALWAYS_ON = "alwaysOn";
    public static final String RESTRICTION_KEY_CRLs = "CRLs";
    public static final String RESTRICTION_KEY_INTERMEDIATE_CERTS = "IntermediateCerts";
    public static final String RESTRICTION_KEY_MAX_RETRY_PERIOD = "maxRetryPeriod";
    public static final String RESTRICTION_KEY_ROOT_CERTS = "RootCerts";
    public static final String RESTRICTION_KEY_VALUE_CRL = "valueCRL";
    public static final String RESTRICTION_KEY_VALUE_INTERMEDIATE_CERT = "valueIntermediateCert";
    public static final String RESTRICTION_KEY_VALUE_ROOT_CERT = "valueRootCert";
    public static final int RESULT_CHECK_ERROR_BAD_PASSWORD = 1001;
    public static final int RESULT_CHECK_ERROR_BASE = 1000;
    public static final int RESULT_CHECK_ERROR_CARRIER_NOT_FOUND = 1009;
    public static final int RESULT_CHECK_ERROR_EXPIRED_CERT = 1007;
    public static final int RESULT_CHECK_ERROR_INVALID_CERT = 1005;
    public static final int RESULT_CHECK_ERROR_KEY_NOT_FOUND = 1008;
    public static final int RESULT_CHECK_ERROR_NO_CERT = 1002;
    public static final int RESULT_CHECK_ERROR_NO_DATA = 1006;
    public static final int RESULT_CHECK_ERROR_NO_POLICY = 1003;
    public static final int RESULT_CHECK_ERROR_OK = 1280;
    public static final int RESULT_CHECK_ERROR_OTHER = 1004;
    public static final int RESULT_ERROR_EXISTS = 1000;
    public static final int RESULT_ERROR_NOT_BOUND = 1002;
    public static final int RESULT_ERROR_NOT_EXISTS = 1001;
    public static final int RESULT_IS_BOUND = 1003;
    public static final String RUTOKEN = "rutoken";
    public static final String TAG = "NGate";
    public static final String VPN_CONFIGURATION_FRAGMENT_KEY = "VpnConfigurationFragmentKey";
    public static final int VPN_ERROR = 4;
    public static final int VPN_EXIT = 5;
    public static final int VPN_SENDER_CONNECT = 81;
    public static final int VPN_SENDER_NO_MATTER = 80;
    public static final int VPN_SERVER_CERTIFICATE_ERROR = 120;
    public static final int VPN_SERVER_CERTIFICATE_OK = 119;
    public static final int VPN_STARTED = 1;
    public static final int VPN_STARTING = 0;
    public static final int VPN_STOPPED = 2;
    public static final int VPN_STOPPING = 6;
    public static final int VPN_TRAFFIC = 121;
    public static final String DEFAULT_USER_AGENT = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
    public static final String USER_AGENT = GetProperty.getStringProperty("http.agent", DEFAULT_USER_AGENT);

    static boolean isAllowedToSave(int i) {
        return (i == 120 || i == 119 || i == 121) ? false : true;
    }

    static boolean isAllowedToStart(int i) {
        return i == 2 || i == 5;
    }

    static boolean isAllowedToStartSavedVpnOnBoot(int i, int i2) {
        return (i == 0 || i == 1 || i == 4) && i2 == 81;
    }

    static boolean isAllowedToStop(int i) {
        return i == 0 || i == 1 || i == 4;
    }

    static boolean isDeniedToChange(int i) {
        return i == 0 || i == 1 || i == 6 || i == 4;
    }

    static boolean isStopping(int i) {
        return i == 6 || i == 2 || i == 5;
    }

    static boolean isWorking(int i) {
        return i == 0 || i == 1;
    }
}
