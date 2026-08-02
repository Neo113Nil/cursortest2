package com.yandex.passport.internal.ui.challenge.changecurrent;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r {
    public final p a;
    public final Throwable b;
    public final String c;
    public final Boolean d;
    public final com.yandex.passport.internal.ui.challenge.webview.i e;

    public r(p pVar, Throwable th, String str, Boolean bool, com.yandex.passport.internal.ui.challenge.webview.i iVar) {
        this.a = pVar;
        this.b = th;
        this.c = str;
        this.d = bool;
        this.e = iVar;
    }

    public static r a(r rVar, p pVar, Throwable th, Boolean bool, com.yandex.passport.internal.ui.challenge.webview.i iVar, int i) {
        if ((i & 1) != 0) {
            pVar = rVar.a;
        }
        p pVar2 = pVar;
        if ((i & 2) != 0) {
            th = rVar.b;
        }
        Throwable th2 = th;
        String str = (i & 4) != 0 ? rVar.c : null;
        if ((i & 8) != 0) {
            bool = rVar.d;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            iVar = rVar.e;
        }
        rVar.getClass();
        return new r(pVar2, th2, str, bool2, iVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.a, rVar.a) && Intrinsics.d(this.b, rVar.b) && Intrinsics.d(this.c, rVar.c) && Intrinsics.d(this.d, rVar.d) && Intrinsics.d(this.e, rVar.e);
    }

    public final int hashCode() {
        p pVar = this.a;
        int hashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        Throwable th = this.b;
        int hashCode2 = (hashCode + (th == null ? 0 : th.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        com.yandex.passport.internal.ui.challenge.webview.i iVar = this.e;
        return hashCode4 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        return "State(challengeData=" + this.a + ", error=" + this.b + ", webError=" + this.c + ", isChallengePassed=" + this.d + ", webViewParams=" + this.e + ')';
    }
}
