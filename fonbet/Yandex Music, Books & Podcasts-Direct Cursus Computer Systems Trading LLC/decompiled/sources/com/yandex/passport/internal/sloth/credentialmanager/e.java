package com.yandex.passport.internal.sloth.credentialmanager;

import com.yandex.auth.LegacyAccountType;

/* loaded from: classes4.dex */
public enum e {
    AutoLogin("autologin"),
    Native("native_login"),
    Login(LegacyAccountType.STRING_LOGIN);

    public final String a;

    e(String str) {
        this.a = str;
    }
}
