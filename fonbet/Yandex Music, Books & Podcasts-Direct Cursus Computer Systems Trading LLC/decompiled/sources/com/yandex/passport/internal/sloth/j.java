package com.yandex.passport.internal.sloth;

import android.net.Uri;
import defpackage.r1w;
import defpackage.x97;

/* loaded from: classes4.dex */
public final class j {
    public final com.yandex.passport.internal.network.d a;

    public j(com.yandex.passport.internal.network.d dVar) {
        dVar.getClass();
        this.a = dVar;
    }

    public final String a(com.yandex.passport.common.core.b bVar, long j) {
        bVar.getClass();
        com.yandex.passport.internal.network.h hVar = (com.yandex.passport.internal.network.h) this.a;
        hVar.getClass();
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        Uri build = Uri.parse(com.yandex.passport.internal.network.d.a(hVar, bVar, j)).buildUpon().appendEncodedPath("iframe").appendEncodedPath("personal").appendEncodedPath("delete-account").build();
        build.getClass();
        aVar.getClass();
        String uri = build.toString();
        uri.getClass();
        return uri;
    }

    public final String b(com.yandex.passport.common.core.b bVar, long j) {
        bVar.getClass();
        com.yandex.passport.internal.network.h hVar = (com.yandex.passport.internal.network.h) this.a;
        hVar.getClass();
        Uri.Builder buildUpon = Uri.parse(hVar.g(bVar, Long.valueOf(j), null)).buildUpon();
        buildUpon.getClass();
        com.yandex.passport.internal.network.h.c(buildUpon, ((com.yandex.passport.data.models.t) x97.D(kotlin.coroutines.g.a, new r1w(hVar, null, 13))).a);
        Uri build = buildUpon.appendQueryParameter("backpath", hVar.j(bVar, j, false)).build();
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        build.getClass();
        aVar.getClass();
        String uri = build.toString();
        uri.getClass();
        return uri;
    }

    public final String c(com.yandex.passport.common.core.b bVar, Long l) {
        bVar.getClass();
        return ((com.yandex.passport.internal.network.h) this.a).m(bVar, l);
    }

    public final String d(com.yandex.passport.common.core.b bVar, long j) {
        bVar.getClass();
        com.yandex.passport.internal.network.h hVar = (com.yandex.passport.internal.network.h) this.a;
        hVar.getClass();
        Uri.Builder buildUpon = Uri.parse(hVar.g(bVar, Long.valueOf(j), null)).buildUpon();
        buildUpon.getClass();
        com.yandex.passport.internal.network.h.c(buildUpon, ((com.yandex.passport.data.models.t) x97.D(kotlin.coroutines.g.a, new r1w(hVar, null, 13))).b);
        Uri build = buildUpon.appendQueryParameter("retpath", hVar.j(bVar, j, true)).appendQueryParameter("backpath", hVar.j(bVar, j, false)).build();
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        build.getClass();
        aVar.getClass();
        String uri = build.toString();
        uri.getClass();
        return uri;
    }

    public final String e(com.yandex.passport.common.core.b bVar, long j) {
        bVar.getClass();
        com.yandex.passport.internal.network.h hVar = (com.yandex.passport.internal.network.h) this.a;
        hVar.getClass();
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        Uri build = Uri.parse(com.yandex.passport.internal.network.d.a(hVar, bVar, j)).buildUpon().appendEncodedPath("account-manager").appendEncodedPath("plus-devices").build();
        build.getClass();
        aVar.getClass();
        String uri = build.toString();
        uri.getClass();
        return uri;
    }

    public final String f(com.yandex.passport.common.core.b bVar, long j) {
        bVar.getClass();
        com.yandex.passport.internal.network.h hVar = (com.yandex.passport.internal.network.h) this.a;
        hVar.getClass();
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        Uri build = Uri.parse(hVar.g(bVar, Long.valueOf(j), null)).buildUpon().appendEncodedPath("pwl-yandex").appendEncodedPath("am").appendEncodedPath("webauthn").appendEncodedPath("reg").build();
        build.getClass();
        aVar.getClass();
        String uri = build.toString();
        uri.getClass();
        return uri;
    }

    public final String g(com.yandex.passport.common.core.b bVar) {
        bVar.getClass();
        com.yandex.passport.internal.network.h hVar = (com.yandex.passport.internal.network.h) this.a;
        hVar.getClass();
        Uri build = Uri.parse(com.yandex.passport.internal.network.d.a(hVar, bVar, 0L)).buildUpon().appendPath("account-manager").appendPath("ebs-age-confirm").build();
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        build.getClass();
        aVar.getClass();
        String uri = build.toString();
        uri.getClass();
        return uri;
    }
}
