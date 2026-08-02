package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.poll;

import defpackage.b801;
import defpackage.bvf0;
import defpackage.fzw;
import defpackage.ike;
import defpackage.itq;
import defpackage.mth;
import defpackage.st2;
import defpackage.tpr;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;

/* loaded from: classes5.dex */
public final class c implements b801 {
    public final String a;
    public final itq b;
    public final ru.yandex.taxi.logistics.sdk.tracking.domain.impl.b c;
    public final e d;
    public final ike e;
    public final n f;
    public final String g = "poll-key";

    public c(String str, itq itqVar, ru.yandex.taxi.logistics.sdk.tracking.domain.impl.b bVar, e eVar, st2 st2Var) {
        this.a = str;
        this.b = itqVar;
        this.c = bVar;
        this.d = eVar;
        this.e = bvf0.a(st2Var.b);
        this.f = new n(new fzw(19, new k(new n(new mth(bVar.c, 6), new PollStateHolder$widgetModelFlow$1(this, null)), new PollStateHolder$widgetModelFlow$2(this, null)), this), new PollStateHolder$widgetModelFlow$4(2, null));
    }

    @Override // defpackage.b801
    public final tpr a() {
        return this.f;
    }

    @Override // defpackage.b801
    public final String getKey() {
        return this.g;
    }
}
