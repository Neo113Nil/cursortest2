package com.yandex.passport.internal.ui.challenge;

import defpackage.dkj;
import defpackage.gm5;
import defpackage.hld;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 {
    public final dkj a;
    public final gm5 b;
    public final String c;
    public final String d;
    public final boolean e;

    public c0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = new dkj();
        this.b = hld.j();
        this.c = str;
        this.d = str2;
        this.e = true;
    }

    public final void a(String str) {
        str.getClass();
        str.getClass();
        this.b.U(Boolean.valueOf(Intrinsics.d(com.yandex.passport.common.url.b.j(str, "status"), "ok") || com.yandex.passport.common.url.b.j(str, "status") == null));
    }
}
