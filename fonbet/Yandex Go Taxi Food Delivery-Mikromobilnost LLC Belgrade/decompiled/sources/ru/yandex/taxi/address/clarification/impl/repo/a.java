package ru.yandex.taxi.address.clarification.impl.repo;

import defpackage.bc1;
import defpackage.bvf0;
import defpackage.cq0;
import defpackage.e2t;
import defpackage.eq0;
import defpackage.fe61;
import defpackage.ffx;
import defpackage.fp0;
import defpackage.fq0;
import defpackage.g2t;
import defpackage.gp0;
import defpackage.h73;
import defpackage.hq0;
import defpackage.jl40;
import defpackage.qu;
import defpackage.qv10;
import defpackage.tb1;
import defpackage.tje;
import defpackage.tse;
import defpackage.wp0;
import defpackage.xp0;
import defpackage.yw01;
import defpackage.zb1;
import defpackage.zzs;
import java.util.List;
import kotlin.sequences.b;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.clarification.UpdateReason;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes9.dex */
public final class a {
    public final i a;
    public final hq0 b;
    public final tb1 c;
    public String e;
    public final n0 g;
    public final r0 h;
    public final n0 i;
    public zzs j;
    public g2t k;
    public zb1 l;
    public boolean m;
    public boolean n;
    public xp0 d = wp0.b;
    public final r0 f = bvf0.c(Boolean.FALSE);

    public a(tse tseVar, e2t e2tVar, i iVar, hq0 hq0Var, tb1 tb1Var) {
        this.a = iVar;
        this.b = hq0Var;
        this.c = tb1Var;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.g = ffx.b(0, 1, bufferOverflow);
        this.h = bvf0.c(bc1.g);
        this.i = ffx.b(0, 1, bufferOverflow);
        this.l = zb1.c;
        this.m = true;
        tje.N(tseVar, null, null, new AddressAdjustmentRepositoryImpl$1(e2tVar, this, null), 3);
    }

    public final void a(g2t g2tVar, zb1 zb1Var, UpdateReason updateReason) {
        a aVar;
        bc1 bc1Var;
        if (g2tVar == null) {
            return;
        }
        List list = g2tVar.a.a.k;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            aVar = this;
            bc1Var = bc1.g;
        } else {
            aVar = this;
            bc1Var = (bc1) b.j(new yw01(b.g(new yw01(b.g(b.l(new h73(1, list), new qu(2)), eq0.a), new qu(3)), fq0.a), new cq0(zb1Var, g2tVar.b, aVar, g2tVar, updateReason, 0)));
            if (bc1Var == null) {
                bc1Var = bc1.g;
            }
        }
        aVar.j = ((Boolean) e.d(aVar.f).a.getValue()).booleanValue() ? bc1Var.b() : !jl40.l(bc1Var.b(), aVar.j) ? null : aVar.j;
        aVar.h.l(bc1Var);
    }

    public final void b(boolean z) {
        qv10.B(z, this.f, null);
        zzs b = ((bc1) e.d(this.h).a.getValue()).b();
        if (b != null) {
            this.j = b;
        }
    }

    public final boolean c(gp0 gp0Var) {
        boolean z = gp0Var instanceof fp0;
        n0 n0Var = this.g;
        if (z) {
            fp0 fp0Var = (fp0) gp0Var;
            if (jl40.l(this.j, fp0Var.a()) || ((Number) n0Var.j().getValue()).intValue() == 0) {
                return false;
            }
            this.j = fp0Var.a();
        }
        return n0Var.g(gp0Var);
    }

    public final void d(String str, String str2) {
        hq0 hq0Var = this.b;
        if (str == null) {
            hq0Var.a = null;
        } else {
            hq0Var.a = new fe61(str, str2, this.c.b);
        }
    }
}
