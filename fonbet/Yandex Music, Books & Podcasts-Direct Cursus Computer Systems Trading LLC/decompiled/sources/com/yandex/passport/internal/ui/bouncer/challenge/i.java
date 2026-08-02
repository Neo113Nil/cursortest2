package com.yandex.passport.internal.ui.bouncer.challenge;

/* loaded from: classes4.dex */
public final class i implements k {
    public final n a;

    public i(n nVar) {
        this.a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.a.equals(((i) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a.a);
    }

    public final String toString() {
        return "ChallengeFinished(challengeResult=" + this.a + ')';
    }
}
