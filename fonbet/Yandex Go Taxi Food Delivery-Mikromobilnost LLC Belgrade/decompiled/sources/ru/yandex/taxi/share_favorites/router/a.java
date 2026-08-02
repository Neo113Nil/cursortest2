package ru.yandex.taxi.share_favorites.router;

import defpackage.h55;
import defpackage.qgn0;
import defpackage.tje;
import defpackage.tjr0;
import defpackage.z8n0;

/* loaded from: classes6.dex */
public final class a extends h55 {
    public final z8n0 D;
    public final qgn0 E;

    public a(z8n0 z8n0Var, qgn0 qgn0Var) {
        super(null);
        this.D = z8n0Var;
        this.E = qgn0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new ShareFavoritesRouter$onLaunch$1(this, (tjr0) obj, null), 3);
    }
}
