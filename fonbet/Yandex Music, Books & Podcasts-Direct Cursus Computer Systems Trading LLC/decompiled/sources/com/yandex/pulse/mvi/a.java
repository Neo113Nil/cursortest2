package com.yandex.pulse.mvi;

import defpackage.e4i;
import defpackage.eai;
import defpackage.fai;
import defpackage.n7b;
import defpackage.qzc;
import defpackage.tzb;
import defpackage.zqr;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements zqr {
    public final /* synthetic */ eai a;
    public final /* synthetic */ fai b;
    public final /* synthetic */ long c;

    public /* synthetic */ a(eai eaiVar, fai faiVar, long j) {
        this.a = eaiVar;
        this.b = faiVar;
        this.c = j;
    }

    @Override // defpackage.zqr
    public final Object get() {
        eai eaiVar = this.a;
        tzb tzbVar = eaiVar.q;
        qzc qzcVar = eaiVar.s;
        fai faiVar = this.b;
        Map map = (Map) faiVar.k.get();
        zqr zqrVar = faiVar.m;
        Set set = (Set) zqrVar.get();
        long j = this.c;
        return new n7b(new e4i[]{new TotalScoreCalculator(tzbVar, qzcVar, map, set, j), eaiVar.i ? new TotalScoreCalculator(eaiVar.q, eaiVar.t, (Map) faiVar.l.get(), (Set) zqrVar.get(), j) : null});
    }
}
