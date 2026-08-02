package ru.yandex.taxi.am;

import defpackage.lm;
import defpackage.pz40;
import defpackage.tpr;

/* loaded from: classes9.dex */
public final class i {
    public final g a;
    public final lm b;

    public i(g gVar, lm lmVar) {
        this.a = gVar;
        this.b = lmVar;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.m0(this.a.a(), (pz40) this.b.b.getValue(), new AccountTypeInfoInteractorImpl$accountTypeFlow$1(3, null)));
    }
}
