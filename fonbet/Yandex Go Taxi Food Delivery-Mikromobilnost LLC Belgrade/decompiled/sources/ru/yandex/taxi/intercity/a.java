package ru.yandex.taxi.intercity;

import defpackage.qu;
import defpackage.sy60;

/* loaded from: classes5.dex */
public final class a implements sy60 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ b b;

    public a(boolean z, b bVar) {
        this.a = z;
        this.b = bVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.b.r(new qu(9));
    }

    public final void n1(String str) {
        boolean z = this.a;
        b bVar = this.b;
        if (z) {
            bVar.E.a(IntercityToSummaryNavigationSource.INTERCITY_DISCOVERY_SCREEN, null, str, new IntercityRouterImpl$startDiscovery$1$onShowSummary$1(0, bVar, b.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0));
        } else {
            bVar.r(new qu(9));
        }
    }
}
