package com.yandex.passport.api.exception;

/* loaded from: classes4.dex */
public final class i extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i) {
        super("Wrong value for Service or Brand");
        switch (i) {
            case 3:
                super("Login failed");
                break;
            default:
                break;
        }
    }
}
