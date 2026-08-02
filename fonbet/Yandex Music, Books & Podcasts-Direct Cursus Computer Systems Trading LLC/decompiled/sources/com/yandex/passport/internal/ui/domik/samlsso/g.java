package com.yandex.passport.internal.ui.domik.samlsso;

import android.net.Uri;
import com.yandex.passport.internal.network.client.h;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.ui.util.q;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class g extends com.yandex.passport.internal.ui.domik.base.b {
    public final l r;
    public final h s;
    public final com.yandex.passport.internal.usecase.authorize.c t;
    public final f u;
    public Uri v;
    public com.yandex.passport.internal.ui.domik.d w;
    public final q x;
    public final q y;

    public g(l lVar, com.yandex.passport.internal.f fVar, h hVar, com.yandex.passport.internal.usecase.authorize.c cVar, f fVar2) {
        lVar.getClass();
        fVar.getClass();
        hVar.getClass();
        cVar.getClass();
        this.r = lVar;
        this.s = hVar;
        this.t = cVar;
        this.u = fVar2;
        this.x = new q();
        this.y = new q();
        new Locale(fVar.a());
    }
}
