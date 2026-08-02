package ru.yandex.taxi.superapp;

import defpackage.ck7;
import defpackage.gcn;
import defpackage.nnu0;
import defpackage.s2p;
import defpackage.tje;
import defpackage.tse;
import defpackage.v6z;

/* loaded from: classes5.dex */
public final class r {
    public final tse a;
    public final ru.yandex.taxi.stories.domain.b b;
    public final s2p c;

    public r(tse tseVar, ru.yandex.taxi.stories.domain.b bVar, s2p s2pVar) {
        this.a = tseVar;
        this.b = bVar;
        this.c = s2pVar;
    }

    public final void a(nnu0 nnu0Var, gcn gcnVar) {
        String str = nnu0Var.a;
        v6z v6zVar = nnu0Var.b;
        Double valueOf = v6zVar != null ? Double.valueOf(v6zVar.a) : null;
        Double valueOf2 = v6zVar != null ? Double.valueOf(v6zVar.b) : null;
        if (str == null) {
            gcnVar.a(new ck7(new IllegalStateException("screenName is null")));
        } else {
            tje.N(this.a, null, null, new SuperAppStoriesDelegate$requestStories$1(this, valueOf, valueOf2, str, gcnVar, null), 3);
        }
    }
}
