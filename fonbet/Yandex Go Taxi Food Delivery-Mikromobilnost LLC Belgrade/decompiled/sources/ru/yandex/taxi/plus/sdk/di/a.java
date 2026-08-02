package ru.yandex.taxi.plus.sdk.di;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.okd0;
import defpackage.pey;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.un3;
import defpackage.w511;
import ru.yandex.taxi.plus.repository.c;
import ru.yandex.taxi.plus.repository.e;
import ru.yandex.taxi.plus.sdk.AuthorizationStateInteractor$startObserveAccountChange$$inlined$collectIn$1;

/* loaded from: classes9.dex */
public final class a implements q {
    public final /* synthetic */ b a;
    public final /* synthetic */ Lifecycle b;

    public a(b bVar, Lifecycle lifecycle) {
        this.a = bVar;
        this.b = lifecycle;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        b bVar = this.a;
        e eVar = bVar.g;
        un3 un3Var = bVar.f;
        switch (okd0.a[event.ordinal()]) {
            case 1:
            case 5:
            case 6:
            case 7:
                break;
            case 2:
                un3Var.e = tje.N(un3Var.c, null, null, new AuthorizationStateInteractor$startObserveAccountChange$$inlined$collectIn$1(un3Var.a.f, null, un3Var), 3);
                eVar.a();
                bVar.j = tje.N(bVar.c.b, null, null, new PlusSdkLifecycleInitializer$onStart$1(bVar, null), 3);
                break;
            case 3:
                pzt0 pzt0Var = un3Var.e;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                ike ikeVar = eVar.f;
                if (ikeVar != null) {
                    bvf0.j(ikeVar, null);
                }
                c cVar = bVar.d;
                cVar.a.d.remove(bVar.h);
                pzt0 pzt0Var2 = bVar.j;
                if (pzt0Var2 != null) {
                    pzt0Var2.a(null);
                }
                bVar.j = null;
                break;
            case 4:
                this.b.d(this);
                break;
            default:
                w511.b();
                break;
        }
    }
}
