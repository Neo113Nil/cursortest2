package ru.yandex.taxi.maas.impl.ride.exitchoice;

import defpackage.c100;
import defpackage.lmo;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.maas.impl.ride.exitchoice.MaasExitChooseModalView;

/* loaded from: classes5.dex */
public final class c implements c100 {
    public final MultiTransportChooseStationCardAnalytics$OpenReasonV2 a;
    public final ArrayList b;
    public final /* synthetic */ MaasExitChooseModalView c;

    public c(MaasExitChooseModalView maasExitChooseModalView, MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2, ArrayList arrayList) {
        this.c = maasExitChooseModalView;
        this.a = multiTransportChooseStationCardAnalytics$OpenReasonV2;
        this.b = arrayList;
    }

    @Override // defpackage.c100
    public final void Sf() {
        MaasExitChooseModalView.a aVar;
        aVar = this.c.listener;
        aVar.q0();
    }

    @Override // defpackage.c100
    public final void close() {
        MaasExitChooseModalView.a aVar;
        aVar = this.c.listener;
        aVar.onBackClick();
    }

    @Override // defpackage.c100
    public final MultiTransportChooseStationCardAnalytics$OpenReasonV2 j() {
        return this.a;
    }

    @Override // defpackage.c100
    public final List pe() {
        return this.b;
    }

    @Override // defpackage.c100
    public final void s(lmo lmoVar) {
        MaasExitChooseModalView.a aVar;
        aVar = this.c.listener;
        aVar.s(lmoVar);
    }
}
