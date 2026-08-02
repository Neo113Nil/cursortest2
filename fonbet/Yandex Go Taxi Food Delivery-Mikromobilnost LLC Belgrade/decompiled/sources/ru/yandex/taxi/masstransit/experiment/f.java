package ru.yandex.taxi.masstransit.experiment;

import defpackage.cvu0;
import defpackage.q0l0;
import defpackage.su30;
import defpackage.tbo;
import defpackage.ubo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment;

/* loaded from: classes6.dex */
public final class f {
    public final boolean a;
    public final String b;
    public final String c;
    public final Long d;
    public final LinkedHashMap e;
    public final ArrayList f;
    public final q0l0 g;
    public final String h;
    public final String i;
    public final TransportOnSummaryExperiment.g j;
    public final long k;
    public final TransportOnSummaryExperiment.d l;

    public f(boolean z, String str, String str2, Long l, LinkedHashMap linkedHashMap, ArrayList arrayList, q0l0 q0l0Var, String str3, String str4, TransportOnSummaryExperiment.g gVar, long j, TransportOnSummaryExperiment.d dVar) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = l;
        this.e = linkedHashMap;
        this.f = arrayList;
        this.g = q0l0Var;
        this.h = str3;
        this.i = str4;
        this.j = gVar;
        this.k = j;
        this.l = dVar;
    }

    public final String a(su30 su30Var) {
        ubo uboVar = su30Var.g;
        tbo tboVar = uboVar.a;
        tbo tboVar2 = uboVar.b;
        String str = su30Var.f.b;
        return cvu0.v(cvu0.v(cvu0.v(this.h, "$SOURCE_POINT$", tboVar.a, false), "$DESTINATION_POINT$", tboVar2.a, false), "$ARRIVING_TIME$", String.valueOf(str), false);
    }
}
