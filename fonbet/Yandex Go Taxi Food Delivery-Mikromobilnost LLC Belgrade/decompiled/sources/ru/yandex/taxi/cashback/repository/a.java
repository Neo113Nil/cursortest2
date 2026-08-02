package ru.yandex.taxi.cashback.repository;

import defpackage.alc0;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.j73;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;

/* loaded from: classes9.dex */
public final class a {
    public static final Set d = j73.f0(new String[]{"order_feedback", "taxi_feedback", "feed_taxi_feedback"});
    public static final Set e = j73.f0(new String[]{"order_info", "taxi_search", "taxi_on_the_way", "taxi_driving", "taxi_waiting", "taxi_transporting", "taxi_scheduling", "feed_taxi_scheduling", "feed_taxi_search", "feed_taxi_driving", "feed_taxi_waiting", "feed_taxi_transporting"});
    public static final Set f = j73.f0(new String[]{"", "#none#", "menu", "create_business_account", "web_house_of_plus"});
    public final alc0 a;
    public final hit b;
    public final tt2 c;

    public a(alc0 alc0Var, hit hitVar, tt2 tt2Var) {
        this.a = alc0Var;
        this.b = hitVar;
        this.c = tt2Var;
    }

    public final void a(ConcurrentLinkedDeque concurrentLinkedDeque) {
        hbp0 hbp0Var = this.b.a;
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(hbp0Var, mdh.b, null, new PlaqueCurrentScreenChangedInteractor$onScreenChanged$1(this, concurrentLinkedDeque, null), 2);
    }
}
