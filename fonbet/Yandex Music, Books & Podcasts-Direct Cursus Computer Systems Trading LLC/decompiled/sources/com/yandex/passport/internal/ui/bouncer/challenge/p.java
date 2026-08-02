package com.yandex.passport.internal.ui.bouncer.challenge;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p {
    public final n a;
    public final com.yandex.passport.internal.ui.challenge.webview.i b;

    public p(n nVar, com.yandex.passport.internal.ui.challenge.webview.i iVar) {
        this.a = nVar;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.a, pVar.a) && Intrinsics.d(this.b, pVar.b);
    }

    public final int hashCode() {
        n nVar = this.a;
        int hashCode = (nVar == null ? 0 : Boolean.hashCode(nVar.a)) * 31;
        com.yandex.passport.internal.ui.challenge.webview.i iVar = this.b;
        return hashCode + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        return "State(challengeResult=" + this.a + ", webViewParams=" + this.b + ')';
    }
}
