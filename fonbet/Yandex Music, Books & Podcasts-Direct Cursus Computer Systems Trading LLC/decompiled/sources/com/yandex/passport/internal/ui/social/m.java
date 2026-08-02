package com.yandex.passport.internal.ui.social;

import android.content.Intent;

/* loaded from: classes4.dex */
public final class m extends n {
    public final Intent a;

    public m(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.a.equals(((m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Native(nativeSocialIntent=" + this.a + ')';
    }
}
