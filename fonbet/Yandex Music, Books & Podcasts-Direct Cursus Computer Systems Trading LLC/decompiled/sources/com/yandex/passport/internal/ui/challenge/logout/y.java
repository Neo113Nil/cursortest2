package com.yandex.passport.internal.ui.challenge.logout;

/* loaded from: classes4.dex */
public final class y implements c0 {
    public final l a;

    public y(l lVar) {
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.a.equals(((y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChallengeData(challengeData=" + this.a + ')';
    }
}
