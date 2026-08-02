package ru.yandex.taxi.map_common.style.source;

import defpackage.bt00;
import defpackage.bvf0;
import defpackage.ffx;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.qc20;
import defpackage.qv00;
import defpackage.sjh;
import defpackage.ss00;
import defpackage.td7;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vs00;
import defpackage.wl0;
import defpackage.wnt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class e implements bt00 {
    public final wnt a;
    public final tt2 b;
    public final ss00 c;
    public final qv00 d;
    public final td7 e;
    public final vs00 f;
    public final qc20 g;
    public final r0 h = bvf0.c("");
    public final n0 i = ffx.b(1, 1, BufferOverflow.DROP_OLDEST);

    public e(wnt wntVar, tt2 tt2Var, ss00 ss00Var, qv00 qv00Var, td7 td7Var, vs00 vs00Var, qc20 qc20Var) {
        this.a = wntVar;
        this.b = tt2Var;
        this.c = ss00Var;
        this.d = qv00Var;
        this.e = td7Var;
        this.f = vs00Var;
        this.g = qc20Var;
    }

    public final Object a(SuspendLambda suspendLambda) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new MapStylesRepositoryImpl$cachedMapStyle$2(this, "default", null), suspendLambda);
    }

    public final void b() {
        r0 r0Var = this.h;
        r0Var.getClass();
        r0Var.m(null, "");
    }

    public final void c(int i, String str) {
        if (i == 0) {
            ny61.r("styleIndex = 0 is reserved to main style, use another positive value");
        } else if (i < 0) {
            ny61.r("styleIndex can not be negative. Use another positive value.");
        } else {
            this.i.g(new wl0(i, str));
        }
    }

    public final void d(String str) {
        this.h.l(str);
    }
}
