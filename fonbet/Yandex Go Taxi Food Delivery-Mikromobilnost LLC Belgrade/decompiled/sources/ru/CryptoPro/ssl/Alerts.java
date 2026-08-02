package ru.CryptoPro.ssl;

import defpackage.oyr;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;

/* loaded from: classes4.dex */
public final class Alerts {
    public static final byte alert_access_denied = 49;
    public static final byte alert_bad_certificate = 42;
    public static final byte alert_bad_certificate_hash_value = 114;
    public static final byte alert_bad_certificate_status_response = 113;
    public static final byte alert_bad_record_mac = 20;
    public static final byte alert_certificate_expired = 45;
    public static final byte alert_certificate_revoked = 44;
    public static final byte alert_certificate_unknown = 46;
    public static final byte alert_certificate_unobtainable = 111;
    public static final byte alert_close_notify = 0;
    public static final byte alert_decode_error = 50;
    public static final byte alert_decompression_failure = 30;
    public static final byte alert_decrypt_error = 51;
    public static final byte alert_decryption_failed = 21;
    public static final byte alert_export_restriction = 60;
    public static final byte alert_fatal = 2;
    public static final byte alert_handshake_failure = 40;
    public static final byte alert_illegal_parameter = 47;
    public static final byte alert_insufficient_security = 71;
    public static final byte alert_internal_error = 80;
    public static final byte alert_no_application_protocol = 120;
    public static final byte alert_no_certificate = 41;
    public static final byte alert_no_renegotiation = 100;
    public static final byte alert_protocol_version = 70;
    public static final byte alert_record_overflow = 22;
    public static final byte alert_unexpected_message = 10;
    public static final byte alert_unknown_ca = 48;
    public static final byte alert_unrecognized_name = 112;
    public static final byte alert_unsupported_certificate = 43;
    public static final byte alert_unsupported_extension = 110;
    public static final byte alert_user_canceled = 90;
    public static final byte alert_warning = 1;

    public static String alertDescription(byte b) {
        if (b == 0) {
            return "close_notify";
        }
        if (b == 10) {
            return "unexpected_message";
        }
        if (b == 30) {
            return "decompression_failure";
        }
        if (b == 60) {
            return "export_restriction";
        }
        if (b == 80) {
            return "internal_error";
        }
        if (b == 90) {
            return "user_canceled";
        }
        if (b == 100) {
            return "no_renegotiation";
        }
        if (b == 120) {
            return "no_application_protocol";
        }
        if (b == 70) {
            return CommonUrlParts.PROTOCOL_VERSION;
        }
        if (b == 71) {
            return "insufficient_security";
        }
        switch (b) {
            case 20:
                return "bad_record_mac";
            case 21:
                return "decryption_failed";
            case 22:
                return "record_overflow";
            default:
                switch (b) {
                    case 40:
                        return "handshake_failure";
                    case 41:
                        return "no_certificate";
                    case 42:
                        return "bad_certificate";
                    case 43:
                        return "unsupported_certificate";
                    case 44:
                        return "certificate_revoked";
                    case 45:
                        return "certificate_expired";
                    case 46:
                        return "certificate_unknown";
                    case 47:
                        return "illegal_parameter";
                    case 48:
                        return "unknown_ca";
                    case 49:
                        return EbsException.ACCESS_DENIED_ERROR_CODE;
                    case 50:
                        return "decode_error";
                    case SAFETY_TIPS_VALUE:
                        return "decrypt_error";
                    default:
                        switch (b) {
                            case 110:
                                return "unsupported_extension";
                            case 111:
                                return "certificate_unobtainable";
                            case 112:
                                return "unrecognized_name";
                            case 113:
                                return "bad_certificate_status_response";
                            case 114:
                                return "bad_certificate_hash_value";
                            default:
                                return oyr.m(b & 255, ">", new StringBuilder("<UNKNOWN ALERT: "));
                        }
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SSLException getSSLException(byte b, Throwable th, String str) {
        SSLException sSLHandshakeException;
        if (str == null) {
            str = th != null ? th.toString() : "";
        }
        if (b != 48 && b != 49 && b != 51 && b != 60 && b != 71 && b != 120) {
            switch (b) {
                default:
                    switch (b) {
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                            break;
                        default:
                            sSLHandshakeException = new SSLException(str);
                            break;
                    }
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                    sSLHandshakeException = new SSLHandshakeException(str);
                    break;
            }
            if (th != null) {
                sSLHandshakeException.initCause(th);
            }
            return sSLHandshakeException;
        }
        sSLHandshakeException = new SSLHandshakeException(str);
        if (th != null) {
        }
        return sSLHandshakeException;
    }

    public static SSLException getSSLException(byte b, String str) {
        return getSSLException(b, null, str);
    }
}
