package com.yandex.passport.internal.ui.challenge.delete;

/* loaded from: classes4.dex */
public final class v implements w {
    public final com.yandex.passport.sloth.data.m a;

    public v(com.yandex.passport.sloth.data.m mVar) {
        this.a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.a.equals(((v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Sloth(slothParams=" + this.a + ')';
    }
}
