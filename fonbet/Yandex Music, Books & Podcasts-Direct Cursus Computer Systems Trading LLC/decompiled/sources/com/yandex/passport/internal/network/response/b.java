package com.yandex.passport.internal.network.response;

import com.yandex.passport.api.w1;
import com.yandex.passport.data.network.token.i;

/* loaded from: classes4.dex */
public enum b {
    PASSWORD("password", null),
    /* JADX INFO: Fake field, exist only in values array */
    MAGIC_LINK("magic_link", null),
    /* JADX INFO: Fake field, exist only in values array */
    OTP("otp", null),
    SMS_CODE("sms_code", null),
    /* JADX INFO: Fake field, exist only in values array */
    SOCIAL_VKONTAKTE("social_vk", w1.a),
    /* JADX INFO: Fake field, exist only in values array */
    SOCIAL_FACEBOOK("social_fb", w1.b),
    /* JADX INFO: Fake field, exist only in values array */
    SOCIAL_TWITTER("social_tw", w1.c),
    /* JADX INFO: Fake field, exist only in values array */
    SOCIAL_MAILRU("social_mr", w1.e),
    /* JADX INFO: Fake field, exist only in values array */
    SOCIAL_GOOGLE("social_gg", w1.f),
    /* JADX INFO: Fake field, exist only in values array */
    SOCIAL_ODNOKLASSNIKI("social_ok", w1.d),
    /* JADX INFO: Fake field, exist only in values array */
    NEO_PHONISH_RESTORE("neo_phonish_restore", null);

    public static final i d = new i(18);
    public final String a;
    public final w1 b;
    public final boolean c;

    b(String str, w1 w1Var) {
        this.a = str;
        this.b = w1Var;
        this.c = w1Var != null;
    }
}
