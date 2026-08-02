package com.yandex.passport.internal.ui.account_upgrade;

import com.yandex.passport.sloth.data.m;

/* loaded from: classes4.dex */
public final class h implements i {
    public final m a;

    public h(m mVar) {
        this.a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.a.equals(((h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StartSloth(slothParams=" + this.a + ')';
    }
}
