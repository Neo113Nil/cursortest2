package ru.yandex.logistics.care.ui;

import defpackage.hq8;
import defpackage.nt8;
import defpackage.pt8;
import defpackage.sls;
import defpackage.tje;
import defpackage.zy11;

/* loaded from: classes4.dex */
public final class e implements sls {
    public final /* synthetic */ pt8 a;

    public e(pt8 pt8Var) {
        this.a = pt8Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        n nVar = ((nt8) this.a).a;
        nVar.e.k(hq8.b);
        tje.N(nVar.d, null, null, new PhotoProcessingDelegate$retryFailedPhotos$1(nVar, null), 3);
        return zy11.a;
    }
}
