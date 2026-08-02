package com.yandex.plus.pay.repository.api.model.user;

import defpackage.dfi;

/* loaded from: classes5.dex */
public final class a {
    public final String a;

    public a(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a.equals(((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("UserAvatarInfo(avatarUrl="), this.a, ')');
    }
}
