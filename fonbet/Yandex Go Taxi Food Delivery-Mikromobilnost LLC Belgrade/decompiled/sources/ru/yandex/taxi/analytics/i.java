package ru.yandex.taxi.analytics;

import defpackage.hst;
import defpackage.jst;
import defpackage.ou;
import defpackage.w3j0;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes9.dex */
public final class i extends w3j0 {
    public final String b;
    public final String c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ j f;

    public i(j jVar, String str, String str2) {
        this.f = jVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.w3j0
    public final w3j0 j(boolean z) {
        if (z) {
            j jVar = this.f;
            CopyOnWriteArraySet copyOnWriteArraySet = jVar.o;
            String str = this.b;
            if (copyOnWriteArraySet.contains(str)) {
                return this;
            }
            jVar.o.add(str);
        }
        this.d = true;
        hst hstVar = jst.e;
        return this;
    }

    @Override // defpackage.w3j0
    public final w3j0 l() {
        this.e = true;
        return this;
    }

    @Override // defpackage.w3j0
    public final void m() {
        j.m(this.f, this.b, this.a, this.c, this.d, this.e, null, 32);
    }

    public final void n() {
        j jVar = this.f;
        ou ouVar = new ou(1, this, jVar);
        q qVar = jVar.m;
        qVar.getClass();
        qVar.a(new MetricaWrapper$reportRtmEvent$1(ouVar, qVar, this.b, null));
    }
}
