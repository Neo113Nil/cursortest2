package com.yandex.passport.internal.usecase.ui;

import defpackage.w4i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e1 {
    public final com.yandex.passport.internal.ui.domik.d a;
    public final com.yandex.passport.internal.ui.domik.relogin.b b;
    public final com.yandex.passport.internal.ui.challenge.vpn.c c;
    public final com.yandex.passport.internal.ui.challenge.vpn.c d;
    public final w4i e;

    public e1(com.yandex.passport.internal.ui.domik.d dVar, com.yandex.passport.internal.ui.domik.relogin.b bVar, com.yandex.passport.internal.ui.challenge.vpn.c cVar, com.yandex.passport.internal.ui.challenge.vpn.c cVar2, w4i w4iVar) {
        dVar.getClass();
        this.a = dVar;
        this.b = bVar;
        this.c = cVar;
        this.d = cVar2;
        this.e = w4iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Intrinsics.d(this.a, e1Var.a) && this.b.equals(e1Var.b) && this.c.equals(e1Var.c) && this.d.equals(e1Var.d) && this.e.equals(e1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 961)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Params(authTrack=" + this.a + ", previewsTrackId=null, onCanAuthorizeBySms=" + this.b + ", onCanRegister=" + this.c + ", onSocialAuth=" + this.d + ", onError=" + this.e + ')';
    }
}
