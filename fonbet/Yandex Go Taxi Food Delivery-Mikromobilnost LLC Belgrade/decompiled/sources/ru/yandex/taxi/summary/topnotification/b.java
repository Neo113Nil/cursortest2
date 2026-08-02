package ru.yandex.taxi.summary.topnotification;

import defpackage.jqr;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.k;

/* loaded from: classes6.dex */
public abstract class b {
    public final tt2 a;

    public b(tt2 tt2Var) {
        this.a = tt2Var;
    }

    public abstract a a();

    public abstract tpr b();

    public final tpr c() {
        k kVar = new k(com.yandex.go.coroutines.b.d(new jqr(b(), new NotificationInteractor$viewModelFlow$1(this, null), 3), new NotificationInteractor$viewModelFlow$2(this, null)), new NotificationInteractor$viewModelFlow$3(this, null));
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return e.F(kVar, o400.a);
    }
}
