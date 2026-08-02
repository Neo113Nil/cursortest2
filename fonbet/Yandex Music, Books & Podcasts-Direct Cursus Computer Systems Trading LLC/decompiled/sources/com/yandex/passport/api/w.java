package com.yandex.passport.api;

/* loaded from: classes4.dex */
public final class w {
    public final com.yandex.passport.internal.entities.m a;

    public w(com.yandex.passport.internal.entities.m mVar) {
        this.a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.a.equals(((w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PassportAuthorizeQrResult(passportLoginResult=" + this.a + ')';
    }
}
