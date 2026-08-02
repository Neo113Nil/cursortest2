package ru.yandex.taxi.router;

import defpackage.tpr;
import defpackage.wjm;
import defpackage.z3y0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class g implements z3y0 {
    public final /* synthetic */ f a;
    public final /* synthetic */ wjm b;

    public g(f fVar, wjm wjmVar) {
        this.a = fVar;
        this.b = wjmVar;
    }

    @Override // defpackage.z3y0
    public final tpr a() {
        return new m0(this.a, (r0) this.b.x, new LiveLocationOptionsPopupRouter$show$1$dataFlow$1(3, null));
    }
}
