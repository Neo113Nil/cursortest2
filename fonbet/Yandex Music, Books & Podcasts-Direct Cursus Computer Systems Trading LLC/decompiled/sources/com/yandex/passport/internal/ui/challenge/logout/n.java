package com.yandex.passport.internal.ui.challenge.logout;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n {
    public final l a;
    public final Throwable b;
    public final Boolean c;
    public final com.yandex.passport.internal.ui.challenge.webview.i d;

    public n(l lVar, Throwable th, Boolean bool, com.yandex.passport.internal.ui.challenge.webview.i iVar) {
        this.a = lVar;
        this.b = th;
        this.c = bool;
        this.d = iVar;
    }

    public static n a(n nVar, l lVar, Throwable th, Boolean bool, com.yandex.passport.internal.ui.challenge.webview.i iVar, int i) {
        if ((i & 1) != 0) {
            lVar = nVar.a;
        }
        if ((i & 2) != 0) {
            th = nVar.b;
        }
        if ((i & 4) != 0) {
            bool = nVar.c;
        }
        if ((i & 8) != 0) {
            iVar = nVar.d;
        }
        nVar.getClass();
        return new n(lVar, th, bool, iVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.a, nVar.a) && Intrinsics.d(this.b, nVar.b) && Intrinsics.d(this.c, nVar.c) && Intrinsics.d(this.d, nVar.d);
    }

    public final int hashCode() {
        l lVar = this.a;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        Throwable th = this.b;
        int hashCode2 = (hashCode + (th == null ? 0 : th.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        com.yandex.passport.internal.ui.challenge.webview.i iVar = this.d;
        return hashCode3 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        return "State(challengeData=" + this.a + ", error=" + this.b + ", isChallengePassed=" + this.c + ", webViewParams=" + this.d + ')';
    }
}
