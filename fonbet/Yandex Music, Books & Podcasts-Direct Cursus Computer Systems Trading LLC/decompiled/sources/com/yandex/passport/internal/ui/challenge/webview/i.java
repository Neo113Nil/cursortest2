package com.yandex.passport.internal.ui.challenge.webview;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {
    public final String a;
    public final String b;
    public final boolean c;

    public i(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.a, iVar.a) && Intrinsics.d(this.b, iVar.b) && this.c == iVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChallengeWebViewParams(startUrl=");
        com.appsflyer.internal.k.y(sb, this.a, ", returnUrl=");
        com.appsflyer.internal.k.y(sb, this.b, ", shouldClearCookies=false, shouldLockOrientation=");
        return dfi.j(sb, this.c, ')');
    }
}
