package ru.yandex.taxi.preorder.tollroad.data;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.bvf0;
import defpackage.d0l0;
import defpackage.grz0;
import defpackage.h5l0;
import defpackage.hit;
import defpackage.in91;
import defpackage.jqr;
import defpackage.ktj0;
import defpackage.moz0;
import defpackage.ntj0;
import defpackage.prz0;
import defpackage.qv10;
import defpackage.srz0;
import defpackage.w511;
import defpackage.wiq0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadSetReason;

/* loaded from: classes9.dex */
public final class e {
    public final prz0 a;
    public final moz0 b;
    public final r0 c;
    public final r0 d;
    public final r0 e;
    public final r0 f;
    public final r0 g;
    public final r0 h;
    public final r0 i;
    public final r0 j;
    public d0l0 k;
    public volatile boolean l;

    public e(wiq0 wiq0Var, prz0 prz0Var, hit hitVar, moz0 moz0Var) {
        this.a = prz0Var;
        this.b = moz0Var;
        kotlinx.coroutines.flow.e.H(hitVar.a, new jqr(((k) wiq0Var).j.b(), new TollRoadsRepositoryImpl$1(this, null), 3));
        this.c = bvf0.c(0);
        this.d = bvf0.c(0);
        this.e = bvf0.c(ntj0.a);
        this.f = bvf0.c(grz0.c);
        Boolean bool = Boolean.FALSE;
        this.g = bvf0.c(bool);
        this.h = bvf0.c(bool);
        moz0Var.a(false, TollRoadSetReason.INIT);
        r0 c = bvf0.c(RoadRestriction.NONE);
        this.i = c;
        this.j = c;
        d0l0.Companion.getClass();
        this.k = h5l0.a;
    }

    public final List a() {
        ntj0 ntj0Var = (ntj0) this.e.getValue();
        ntj0Var.getClass();
        return ntj0Var instanceof ktj0 ? (List) ((ktj0) ntj0Var).b : EmptyList.a;
    }

    public final RoadRestriction b() {
        return (RoadRestriction) this.i.getValue();
    }

    public final boolean c() {
        return (b() == RoadRestriction.TOLL_ONLY) || (a().size() == 1 && (this.l || f())) || a().isEmpty();
    }

    public final void d(ntj0 ntj0Var) {
        ntj0Var.getClass();
        this.l = (ntj0Var instanceof ktj0) && in91.c((List) ((ktj0) ntj0Var).b);
        r0 r0Var = this.e;
        r0Var.getClass();
        r0Var.m(null, ntj0Var);
    }

    public final void e(boolean z, TollRoadSetReason tollRoadSetReason) {
        boolean z2;
        this.b.a(z, tollRoadSetReason);
        qv10.B(z, this.g, null);
        switch (srz0.a[tollRoadSetReason.ordinal()]) {
            case 1:
            case 2:
                z2 = true;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                z2 = false;
                break;
            default:
                w511.b();
                return;
        }
        qv10.B(z2, this.h, null);
    }

    public final boolean f() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }
}
