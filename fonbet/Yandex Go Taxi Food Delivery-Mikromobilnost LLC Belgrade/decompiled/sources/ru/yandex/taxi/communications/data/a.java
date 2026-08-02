package ru.yandex.taxi.communications.data;

import defpackage.bvf0;
import defpackage.cne0;
import defpackage.cvw;
import defpackage.dne0;
import defpackage.ffx;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jtq0;
import defpackage.mdh;
import defpackage.qhw0;
import defpackage.qv10;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wf7;
import java.util.Calendar;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class a {
    public final jtq0 a;
    public final tt2 b;
    public final cne0 c;
    public final ike d;
    public final n0 e;
    public final tpr f;

    public a(dne0 dne0Var, jtq0 jtq0Var, tt2 tt2Var) {
        this.a = jtq0Var;
        this.b = tt2Var;
        this.c = dne0Var.a("communication_show_policy_preferences");
        qhw0 a = jl40.a();
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.d = bvf0.a(cvw.U(a, mdh.b));
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.e = b;
        this.f = e.p(e.c(b), 5L);
    }

    public static final int a(a aVar, String str) {
        cne0 cne0Var = aVar.c;
        long j = cne0Var.j("perf_last_usage" + str, 0L);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (wf7.e(aVar.a.b(null), calendar)) {
            return qv10.d("perf_daily_usage", str, cne0Var, 0);
        }
        return 0;
    }

    public final Object b(String str, ContinuationImpl continuationImpl) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new CommunicationShowPolicyRepositoryImpl$getShownCount$2(this, str, null), continuationImpl);
    }

    public final void c(String str) {
        tje.N(this.d, null, null, new CommunicationShowPolicyRepositoryImpl$incrementShowCount$1(this, str, null), 3);
    }

    public final void d(String str) {
        tje.N(this.d, null, null, new CommunicationShowPolicyRepositoryImpl$incrementUsageCount$1(this, str, null), 3);
    }
}
