package com.yandex.passport.common.network;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.j66;
import defpackage.ouj;
import defpackage.qdb;
import defpackage.t9f;
import defpackage.up6;
import defpackage.vhp;
import java.lang.annotation.Annotation;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bP\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bS¨\u0006T"}, d2 = {"Lcom/yandex/passport/common/network/BackendError;", "", "<init>", "(Ljava/lang/String;I)V", "", "toString", "()Ljava/lang/String;", "Companion", "com/yandex/passport/common/network/a", "ACCESS_DENIED", "ACCOUNT_AUTH_PASSED", "ACCOUNT_DISABLED", "ACCOUNT_DISABLED_ON_DELETION", "ACCOUNT_INVALID_TYPE", "ACCOUNT_NOT_FOUND", "AVATAR_SIZE_EMPTY", "AUTHORIZATION_INVALID", "AUTHORIZATION_PENDING", "BACKEND_BLACKBOX_FAILED", "BACKEND_BLACKBOX_PERMANENT_ERROR", "BACKEND_YASMS_FAILED", "BACKEND_DATABASE_FAILED", "BACKEND_REDIS_FAILED", "BLACKBOX_INVALID_PARAMS", "CONSUMER_EMPTY", "CONSUMER_INVALID", "COOKIE_EMPTY", "EXCEPTION_UNHANDLED", "HOST_EMPTY", "HOST_INVALID", "IP_EMPTY", "OAUTH_TOKEN_INVALID", "YANDEX_TOKEN_INVALID", "REQUEST_CREDENTIALS_ALL_MISSING", "REQUEST_CREDENTIALS_SEVERAL_PRESENT", "REQUEST_NOT_FOUND", "SESSIONID_EMPTY", "SESSIONID_INVALID", "SESSIONID_NO_UID", "SSLSESSION_REQUIRED", "TYPE_EMPTY", "TYPE_INVALID", "RETPATH_EMPTY", "RETPATH_INVALID", "SCHEME_EMPTY", "USERAGENT_EMPTY", "TRACK_ID_EMPTY", "TRACK_ID_INVALID", "TRACK_NOT_FOUND", "TRACK_ID_INVALID_ERROR1", "TRACK_UNKNOWN_ERROR", "NODE_UNKNOWN_ERROR", "PASSWORD_EMPTY", "LOGIN_EMPTY", "PASSWORD_NOT_MATCHED", "PHONE_IS_BANK_PHONENUMBER_ALIAS", "FAMILY_NOT_EXIST", "FAMILY_IS_NOT_A_MEMBER", "FAMILY_NOT_ALLOWED_TO_MANAGE_CHILD", "CAPTCHA_REQUIRED", "RFC_OTD_INVALID", "OTD_EMPTY", "ACTION_REQUIRED_EXTERNAL_OR_NATIVE", "ACTION_NATIVE", "PHONE_NUMBER_ALREADY_CONFIRMED_ERROR", "SMS_LIMIT_EXCEEDED", "CODE_EMPTY", "CODE_INVALID", "CONFIRMATIONS_LIMIT_EXCEEDED", "TOO_MANY_TRACKS", "TRACKS_NOT_FOUND", "NUMBER_FOR_PICTURE_CHALLENGE_NEEDED", "WRONG_LOCATION", "DEVICE_MAX_COUNT", "SERVICE_REQUIRED", "BRAND_REQUIRED", "BRAND_NOT_FOUND", "BILLING_OPTIONS_EMPTY", "BLACKBOX_EXPIRED_TOKEN", "UNAUTHORIZED_CLIENT", "INVALID_REQUEST", "INVALID_GRANT", "BAD_VERIFICATION_CODE", "ERROR_403", "passport-common_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vhp
/* loaded from: classes4.dex */
public final class BackendError {
    private static final /* synthetic */ qdb $ENTRIES;
    private static final /* synthetic */ BackendError[] $VALUES;

    @NotNull
    private static final arf $cachedSerializer$delegate;

    @NotNull
    public static final a Companion;
    public static final BackendError ACCESS_DENIED = new BackendError("ACCESS_DENIED", 0);
    public static final BackendError ACCOUNT_AUTH_PASSED = new BackendError("ACCOUNT_AUTH_PASSED", 1);
    public static final BackendError ACCOUNT_DISABLED = new BackendError("ACCOUNT_DISABLED", 2);
    public static final BackendError ACCOUNT_DISABLED_ON_DELETION = new BackendError("ACCOUNT_DISABLED_ON_DELETION", 3);
    public static final BackendError ACCOUNT_INVALID_TYPE = new BackendError("ACCOUNT_INVALID_TYPE", 4);
    public static final BackendError ACCOUNT_NOT_FOUND = new BackendError("ACCOUNT_NOT_FOUND", 5);
    public static final BackendError AVATAR_SIZE_EMPTY = new BackendError("AVATAR_SIZE_EMPTY", 6);
    public static final BackendError AUTHORIZATION_INVALID = new BackendError("AUTHORIZATION_INVALID", 7);
    public static final BackendError AUTHORIZATION_PENDING = new BackendError("AUTHORIZATION_PENDING", 8);
    public static final BackendError BACKEND_BLACKBOX_FAILED = new BackendError("BACKEND_BLACKBOX_FAILED", 9);
    public static final BackendError BACKEND_BLACKBOX_PERMANENT_ERROR = new BackendError("BACKEND_BLACKBOX_PERMANENT_ERROR", 10);
    public static final BackendError BACKEND_YASMS_FAILED = new BackendError("BACKEND_YASMS_FAILED", 11);
    public static final BackendError BACKEND_DATABASE_FAILED = new BackendError("BACKEND_DATABASE_FAILED", 12);
    public static final BackendError BACKEND_REDIS_FAILED = new BackendError("BACKEND_REDIS_FAILED", 13);
    public static final BackendError BLACKBOX_INVALID_PARAMS = new BackendError("BLACKBOX_INVALID_PARAMS", 14);
    public static final BackendError CONSUMER_EMPTY = new BackendError("CONSUMER_EMPTY", 15);
    public static final BackendError CONSUMER_INVALID = new BackendError("CONSUMER_INVALID", 16);
    public static final BackendError COOKIE_EMPTY = new BackendError("COOKIE_EMPTY", 17);
    public static final BackendError EXCEPTION_UNHANDLED = new BackendError("EXCEPTION_UNHANDLED", 18);
    public static final BackendError HOST_EMPTY = new BackendError("HOST_EMPTY", 19);
    public static final BackendError HOST_INVALID = new BackendError("HOST_INVALID", 20);
    public static final BackendError IP_EMPTY = new BackendError("IP_EMPTY", 21);
    public static final BackendError OAUTH_TOKEN_INVALID = new BackendError("OAUTH_TOKEN_INVALID", 22);
    public static final BackendError YANDEX_TOKEN_INVALID = new BackendError("YANDEX_TOKEN_INVALID", 23);
    public static final BackendError REQUEST_CREDENTIALS_ALL_MISSING = new BackendError("REQUEST_CREDENTIALS_ALL_MISSING", 24);
    public static final BackendError REQUEST_CREDENTIALS_SEVERAL_PRESENT = new BackendError("REQUEST_CREDENTIALS_SEVERAL_PRESENT", 25);
    public static final BackendError REQUEST_NOT_FOUND = new BackendError("REQUEST_NOT_FOUND", 26);
    public static final BackendError SESSIONID_EMPTY = new BackendError("SESSIONID_EMPTY", 27);
    public static final BackendError SESSIONID_INVALID = new BackendError("SESSIONID_INVALID", 28);
    public static final BackendError SESSIONID_NO_UID = new BackendError("SESSIONID_NO_UID", 29);
    public static final BackendError SSLSESSION_REQUIRED = new BackendError("SSLSESSION_REQUIRED", 30);
    public static final BackendError TYPE_EMPTY = new BackendError("TYPE_EMPTY", 31);
    public static final BackendError TYPE_INVALID = new BackendError("TYPE_INVALID", 32);
    public static final BackendError RETPATH_EMPTY = new BackendError("RETPATH_EMPTY", 33);
    public static final BackendError RETPATH_INVALID = new BackendError("RETPATH_INVALID", 34);
    public static final BackendError SCHEME_EMPTY = new BackendError("SCHEME_EMPTY", 35);
    public static final BackendError USERAGENT_EMPTY = new BackendError("USERAGENT_EMPTY", 36);
    public static final BackendError TRACK_ID_EMPTY = new BackendError("TRACK_ID_EMPTY", 37);
    public static final BackendError TRACK_ID_INVALID = new BackendError("TRACK_ID_INVALID", 38);
    public static final BackendError TRACK_NOT_FOUND = new BackendError("TRACK_NOT_FOUND", 39);
    public static final BackendError TRACK_ID_INVALID_ERROR1 = new BackendError("TRACK_ID_INVALID_ERROR1", 40);
    public static final BackendError TRACK_UNKNOWN_ERROR = new BackendError("TRACK_UNKNOWN_ERROR", 41);
    public static final BackendError NODE_UNKNOWN_ERROR = new BackendError("NODE_UNKNOWN_ERROR", 42);
    public static final BackendError PASSWORD_EMPTY = new BackendError("PASSWORD_EMPTY", 43);
    public static final BackendError LOGIN_EMPTY = new BackendError("LOGIN_EMPTY", 44);
    public static final BackendError PASSWORD_NOT_MATCHED = new BackendError("PASSWORD_NOT_MATCHED", 45);
    public static final BackendError PHONE_IS_BANK_PHONENUMBER_ALIAS = new BackendError("PHONE_IS_BANK_PHONENUMBER_ALIAS", 46);
    public static final BackendError FAMILY_NOT_EXIST = new BackendError("FAMILY_NOT_EXIST", 47);
    public static final BackendError FAMILY_IS_NOT_A_MEMBER = new BackendError("FAMILY_IS_NOT_A_MEMBER", 48);
    public static final BackendError FAMILY_NOT_ALLOWED_TO_MANAGE_CHILD = new BackendError("FAMILY_NOT_ALLOWED_TO_MANAGE_CHILD", 49);
    public static final BackendError CAPTCHA_REQUIRED = new BackendError("CAPTCHA_REQUIRED", 50);
    public static final BackendError RFC_OTD_INVALID = new BackendError("RFC_OTD_INVALID", 51);
    public static final BackendError OTD_EMPTY = new BackendError("OTD_EMPTY", 52);
    public static final BackendError ACTION_REQUIRED_EXTERNAL_OR_NATIVE = new BackendError("ACTION_REQUIRED_EXTERNAL_OR_NATIVE", 53);
    public static final BackendError ACTION_NATIVE = new BackendError("ACTION_NATIVE", 54);
    public static final BackendError PHONE_NUMBER_ALREADY_CONFIRMED_ERROR = new BackendError("PHONE_NUMBER_ALREADY_CONFIRMED_ERROR", 55);
    public static final BackendError SMS_LIMIT_EXCEEDED = new BackendError("SMS_LIMIT_EXCEEDED", 56);
    public static final BackendError CODE_EMPTY = new BackendError("CODE_EMPTY", 57);
    public static final BackendError CODE_INVALID = new BackendError("CODE_INVALID", 58);
    public static final BackendError CONFIRMATIONS_LIMIT_EXCEEDED = new BackendError("CONFIRMATIONS_LIMIT_EXCEEDED", 59);
    public static final BackendError TOO_MANY_TRACKS = new BackendError("TOO_MANY_TRACKS", 60);
    public static final BackendError TRACKS_NOT_FOUND = new BackendError("TRACKS_NOT_FOUND", 61);
    public static final BackendError NUMBER_FOR_PICTURE_CHALLENGE_NEEDED = new BackendError("NUMBER_FOR_PICTURE_CHALLENGE_NEEDED", 62);
    public static final BackendError WRONG_LOCATION = new BackendError("WRONG_LOCATION", 63);
    public static final BackendError DEVICE_MAX_COUNT = new BackendError("DEVICE_MAX_COUNT", 64);
    public static final BackendError SERVICE_REQUIRED = new BackendError("SERVICE_REQUIRED", 65);
    public static final BackendError BRAND_REQUIRED = new BackendError("BRAND_REQUIRED", 66);
    public static final BackendError BRAND_NOT_FOUND = new BackendError("BRAND_NOT_FOUND", 67);
    public static final BackendError BILLING_OPTIONS_EMPTY = new BackendError("BILLING_OPTIONS_EMPTY", 68);
    public static final BackendError BLACKBOX_EXPIRED_TOKEN = new BackendError("BLACKBOX_EXPIRED_TOKEN", 69);
    public static final BackendError UNAUTHORIZED_CLIENT = new BackendError("UNAUTHORIZED_CLIENT", 70);
    public static final BackendError INVALID_REQUEST = new BackendError("INVALID_REQUEST", 71);
    public static final BackendError INVALID_GRANT = new BackendError("INVALID_GRANT", 72);
    public static final BackendError BAD_VERIFICATION_CODE = new BackendError("BAD_VERIFICATION_CODE", 73);
    public static final BackendError ERROR_403 = new BackendError("ERROR_403", 74);

    private static final /* synthetic */ BackendError[] $values() {
        return new BackendError[]{ACCESS_DENIED, ACCOUNT_AUTH_PASSED, ACCOUNT_DISABLED, ACCOUNT_DISABLED_ON_DELETION, ACCOUNT_INVALID_TYPE, ACCOUNT_NOT_FOUND, AVATAR_SIZE_EMPTY, AUTHORIZATION_INVALID, AUTHORIZATION_PENDING, BACKEND_BLACKBOX_FAILED, BACKEND_BLACKBOX_PERMANENT_ERROR, BACKEND_YASMS_FAILED, BACKEND_DATABASE_FAILED, BACKEND_REDIS_FAILED, BLACKBOX_INVALID_PARAMS, CONSUMER_EMPTY, CONSUMER_INVALID, COOKIE_EMPTY, EXCEPTION_UNHANDLED, HOST_EMPTY, HOST_INVALID, IP_EMPTY, OAUTH_TOKEN_INVALID, YANDEX_TOKEN_INVALID, REQUEST_CREDENTIALS_ALL_MISSING, REQUEST_CREDENTIALS_SEVERAL_PRESENT, REQUEST_NOT_FOUND, SESSIONID_EMPTY, SESSIONID_INVALID, SESSIONID_NO_UID, SSLSESSION_REQUIRED, TYPE_EMPTY, TYPE_INVALID, RETPATH_EMPTY, RETPATH_INVALID, SCHEME_EMPTY, USERAGENT_EMPTY, TRACK_ID_EMPTY, TRACK_ID_INVALID, TRACK_NOT_FOUND, TRACK_ID_INVALID_ERROR1, TRACK_UNKNOWN_ERROR, NODE_UNKNOWN_ERROR, PASSWORD_EMPTY, LOGIN_EMPTY, PASSWORD_NOT_MATCHED, PHONE_IS_BANK_PHONENUMBER_ALIAS, FAMILY_NOT_EXIST, FAMILY_IS_NOT_A_MEMBER, FAMILY_NOT_ALLOWED_TO_MANAGE_CHILD, CAPTCHA_REQUIRED, RFC_OTD_INVALID, OTD_EMPTY, ACTION_REQUIRED_EXTERNAL_OR_NATIVE, ACTION_NATIVE, PHONE_NUMBER_ALREADY_CONFIRMED_ERROR, SMS_LIMIT_EXCEEDED, CODE_EMPTY, CODE_INVALID, CONFIRMATIONS_LIMIT_EXCEEDED, TOO_MANY_TRACKS, TRACKS_NOT_FOUND, NUMBER_FOR_PICTURE_CHALLENGE_NEEDED, WRONG_LOCATION, DEVICE_MAX_COUNT, SERVICE_REQUIRED, BRAND_REQUIRED, BRAND_NOT_FOUND, BILLING_OPTIONS_EMPTY, BLACKBOX_EXPIRED_TOKEN, UNAUTHORIZED_CLIENT, INVALID_REQUEST, INVALID_GRANT, BAD_VERIFICATION_CODE, ERROR_403};
    }

    static {
        BackendError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = j66.Q($values);
        Companion = new a();
        $cachedSerializer$delegate = btf.a(bwf.b, new com.yandex.passport.api.exception.l(1));
    }

    private BackendError(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ t9f _init_$_anonymous_() {
        return up6.q("com.yandex.passport.common.network.BackendError", values(), new String[]{"access.denied", "account.auth_passed", "account.disabled", "account.disabled_on_deletion", "account.invalid_type", "account.not_found", "avatar_size.empty", "authorization.invalid", "authorization_pending", "backend.blackbox_failed", "backend.blackbox_permanent_error", "backend.yasms_failed", "backend.database_failed", "backend.redis_failed", "blackbox.invalid_params", "consumer.empty", "consumer.invalid", "cookie.empty", "exception.unhandled", "host.empty", "host.invalid", "ip.empty", "oauth_token.invalid", "yandex_token.invalid", "request.credentials_all_missing", "request.credentials_several_present", "request.not_found", "sessionid.empty", "sessionid.invalid", "sessionid.no_uid", "sslsession.required", "type.empty", "type.invalid", "retpath.empty", "retpath.invalid", "scheme.empty", "useragent.empty", "track_id.empty", "track_id.invalid", "track.not_found", "invalidid", "unknowntrack", "unknownnode", "password.empty", "login.empty", "password.not_matched", "phone.is_bank_phonenumber_alias", "family.does_not_exist", "family.is_not_a_member", "family.not_allowed_to_manage_child", "captcha.required", "rfc_otp.invalid", "otp.empty", "action.required_external_or_native", "action.required_native", "phone.confirmed", "sms_limit.exceeded", "code.empty", "code.invalid", "confirmations_limit.exceeded", "tracks.found_multiple", "tracks.not_found", "number_for_pictures.is_needed", "x_wrong_location", "device.max_count", "service.required", "brand.required", "brand.not_found_exception", "billing_options.empty", "blackbox.expired_token", "unauthorized_client", "invalid_request", "invalid_grant", "bad_verification_code", "403"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
    }

    @NotNull
    public static qdb getEntries() {
        return $ENTRIES;
    }

    public static BackendError valueOf(String str) {
        return (BackendError) Enum.valueOf(BackendError.class, str);
    }

    public static BackendError[] values() {
        return (BackendError[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        switch (b.a[ordinal()]) {
            case 1:
                return "oauth_token.invalid";
            case 2:
                return "track_id.empty";
            case 3:
                return "track_id.invalid";
            case 4:
                return "rfc_otp.invalid";
            case 5:
                return "avatar_size.empty";
            case 6:
                return "authorization_pending";
            case 7:
                return "sms_limit.exceeded";
            case 8:
                return "confirmations_limit.exceeded";
            case 9:
                return "tracks.found_multiple";
            default:
                String name = name();
                Locale locale = Locale.US;
                String s = ouj.s(locale, name, locale);
                int S = StringsKt.S(s, '_', 0, 2);
                return S < 0 ? s : StringsKt.c0(s, S, S + 1, String.valueOf('.')).toString();
        }
    }
}
