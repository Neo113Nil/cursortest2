package ru.yandex.taxi.logistics.postcard.presentation;

import defpackage.h3y;
import defpackage.lz60;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes9.dex */
public final class d implements lz60 {
    public final tse a;
    public final h3y b;

    public d(tse tseVar, h3y h3yVar) {
        this.a = tseVar;
        this.b = h3yVar;
    }

    @Override // defpackage.lz60
    public final void g() {
        tje.N(this.a, null, null, new PostcardLCPListener$onLargestContentfulPaint$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "PostcardLCPListener";
    }
}
