package com.yandex.passport.internal.usecase.ui;

import android.net.Uri;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.wis;
import defpackage.x7j;
import defpackage.z7o;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.network.r b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.network.r rVar) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        rVar.getClass();
        this.b = rVar;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        Object t7oVar;
        Uri.Builder appendQueryParameter;
        i0 i0Var = (i0) obj;
        try {
            r7o r7oVar = z7o.b;
            com.yandex.passport.internal.network.r rVar = this.b;
            com.yandex.passport.common.core.f fVar = i0Var.d;
            String str = i0Var.a;
            com.yandex.passport.sloth.data.g gVar = i0Var.b;
            Uri a = rVar.a(fVar.b, i0Var.c);
            if (gVar instanceof com.yandex.passport.sloth.data.c) {
                appendQueryParameter = a.buildUpon().appendQueryParameter("used_tracks", str);
            } else if (Intrinsics.d(gVar, com.yandex.passport.sloth.data.e.a)) {
                appendQueryParameter = a.buildUpon().appendQueryParameter("open_popup", "not_me");
            } else if (Intrinsics.d(gVar, com.yandex.passport.sloth.data.d.a)) {
                appendQueryParameter = a.buildUpon().appendQueryParameter("open_popup", "source_of_entry");
            } else if (Intrinsics.d(gVar, com.yandex.passport.sloth.data.b.a)) {
                appendQueryParameter = a.buildUpon().appendPath("number").appendQueryParameter("used_tracks", str);
            } else {
                if (!(gVar instanceof com.yandex.passport.sloth.data.f)) {
                    throw new x7j();
                }
                appendQueryParameter = a.buildUpon().appendPath("selector").appendQueryParameter("selected_picture", String.valueOf(((com.yandex.passport.sloth.data.f) gVar).a));
            }
            Uri build = appendQueryParameter.build();
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "picture Uri: " + build, 8);
            }
            com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
            build.getClass();
            aVar.getClass();
            String uri = build.toString();
            uri.getClass();
            t7oVar = new com.yandex.passport.common.url.b(uri);
        } catch (wis e) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar3 = z7o.b;
            t7oVar = new t7o(th);
        }
        return new z7o(t7oVar);
    }
}
