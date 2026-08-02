package ru.yandex.taxi.maas.impl.ride.metropick;

import defpackage.ad5;
import defpackage.ao40;
import defpackage.atd0;
import defpackage.bo40;
import defpackage.co40;
import defpackage.hdu;
import defpackage.i3y;
import defpackage.ik50;
import defpackage.j7u0;
import defpackage.jl40;
import defpackage.khb1;
import defpackage.kyh0;
import defpackage.kzi;
import defpackage.mk50;
import defpackage.n100;
import defpackage.nhb1;
import defpackage.o100;
import defpackage.on2;
import defpackage.p100;
import defpackage.p7b1;
import defpackage.pzt0;
import defpackage.r1s;
import defpackage.sb2;
import defpackage.sho;
import defpackage.svd0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.w511;
import defpackage.wjm;
import defpackage.x3;
import defpackage.xyz;
import defpackage.y9y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$CloseReasonV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$TransportTypeV2;
import ru.yandex.taxi.maas.api.analytics.MultiTransportErrorAnalytics$ErrorButton;
import ru.yandex.taxi.maas.api.analytics.MultiTransportErrorAnalytics$ErrorCloseReason;
import ru.yandex.taxi.maas.api.analytics.MultiTransportErrorAnalytics$ErrorCode;

/* loaded from: classes5.dex */
public final class a extends ad5 {
    public final r1s A;
    public final y9y0 B;
    public final atd0 C;
    public final svd0 D;
    public final i3y E;
    public final x3 F;
    public final wjm G;
    public final hdu H;
    public nhb1 I;
    public ik50 J;
    public j7u0 K;
    public pzt0 L;
    public final on2 x;
    public final mk50 y;
    public final tt2 z;

    public a(on2 on2Var, mk50 mk50Var, tt2 tt2Var, r1s r1sVar, y9y0 y9y0Var, atd0 atd0Var, svd0 svd0Var) {
        super(n100.class);
        this.x = on2Var;
        this.y = mk50Var;
        this.z = tt2Var;
        this.A = r1sVar;
        this.B = y9y0Var;
        this.C = atd0Var;
        this.D = svd0Var;
        this.E = kotlin.a.a(new xyz(2, this));
        this.F = p7b1.d(kzi.a, y9y0Var);
        this.G = new wjm(this);
        this.H = new hdu(this);
        this.I = p100.b;
        this.J = ik50.d;
    }

    public static final void Kg(a aVar, ik50 ik50Var) {
        aVar.getClass();
        if (ik50Var.a.isEmpty()) {
            MultiTransportErrorAnalytics$ErrorCode multiTransportErrorAnalytics$ErrorCode = MultiTransportErrorAnalytics$ErrorCode.NoStations;
            aVar.I = new o100(multiTransportErrorAnalytics$ErrorCode);
            aVar.J = ik50Var;
            aVar.H.q(multiTransportErrorAnalytics$ErrorCode);
            ((n100) aVar.Dg()).S3(kyh0.maas_metro_error_title, kyh0.maas_metro_unavailability_error, false);
            return;
        }
        aVar.I = p100.b;
        aVar.J = ik50Var;
        wjm wjmVar = aVar.G;
        r1s r1sVar = (r1s) wjmVar.b;
        a aVar2 = (a) wjmVar.x;
        bo40 bo40Var = (bo40) r1sVar.c;
        MultiTransportChooseStationCardAnalytics$OpenReasonV2 j = ((n100) aVar2.Dg()).j();
        MultiTransportChooseStationCardAnalytics$TransportTypeV2 multiTransportChooseStationCardAnalytics$TransportTypeV2 = (MultiTransportChooseStationCardAnalytics$TransportTypeV2) wjmVar.w;
        List list = aVar2.J.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(khb1.f((j7u0) it.next()));
        }
        j7u0 j7u0Var = (j7u0) wjmVar.c;
        ao40 ao40Var = j7u0Var != null ? new ao40(j7u0Var.c, j7u0Var.b) : null;
        bo40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", j.getEventValue());
        hashMap.put("type", multiTransportChooseStationCardAnalytics$TransportTypeV2.getEventValue());
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ao40) it2.next()).c);
        }
        hashMap.put("available_stations", arrayList2);
        if (ao40Var != null) {
            hashMap.put("selected_station", ao40Var.c);
        }
        bo40Var.a.a("MultiTransportChooseStationCard.Shown", hashMap, 2, new HashMap());
        ((n100) aVar.Dg()).Af(ik50Var);
    }

    public final void Lg(MultiTransportChooseStationCardAnalytics$CloseReasonV2 multiTransportChooseStationCardAnalytics$CloseReasonV2) {
        nhb1 nhb1Var = this.I;
        if (jl40.l(nhb1Var, p100.b)) {
            this.G.t(multiTransportChooseStationCardAnalytics$CloseReasonV2);
        } else if (nhb1Var instanceof o100) {
            MultiTransportChooseStationCardAnalytics$CloseReasonV2 multiTransportChooseStationCardAnalytics$CloseReasonV22 = MultiTransportChooseStationCardAnalytics$CloseReasonV2.CloseButton;
            hdu hduVar = this.H;
            if (multiTransportChooseStationCardAnalytics$CloseReasonV2 == multiTransportChooseStationCardAnalytics$CloseReasonV22) {
                hduVar.r(MultiTransportErrorAnalytics$ErrorButton.Close, ((o100) this.I).a);
            }
            MultiTransportErrorAnalytics$ErrorCode multiTransportErrorAnalytics$ErrorCode = ((o100) this.I).a;
            co40 co40Var = (co40) ((r1s) hduVar.a).w;
            List g = hduVar.g();
            for (MultiTransportErrorAnalytics$ErrorCloseReason multiTransportErrorAnalytics$ErrorCloseReason : MultiTransportErrorAnalytics$ErrorCloseReason.a()) {
                if (jl40.l(multiTransportErrorAnalytics$ErrorCloseReason.getEventValue(), multiTransportChooseStationCardAnalytics$CloseReasonV2.getEventValue())) {
                    co40Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("button_list", g);
                    hashMap.put("error_code", multiTransportErrorAnalytics$ErrorCode.getEventValue());
                    hashMap.put("close_reason", multiTransportErrorAnalytics$ErrorCloseReason.getEventValue());
                    HashMap hashMap2 = new HashMap();
                    Regex regex = sho.a;
                    co40Var.a.a(sb2.q("MultiTransportErrorClosed", hashMap), hashMap, 1, hashMap2);
                }
            }
            w511.i("Collection contains no element matching the predicate.");
            return;
        }
        this.F.cancel();
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ((n100) Dg()).close();
    }

    public final void Mg() {
        this.I = p100.a;
        ((n100) Dg()).showLoading();
        tje.N(Jg(), null, null, new MaasMetroPickPresenter$requestMetro$1(this, null), 3);
    }
}
