package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData$UgcLiveStatus;

/* loaded from: classes3.dex */
public final class a2j implements lke {
    public final ile a;
    public final nke b;
    public final lm4 c;
    public final List d;
    public final AtomicBoolean e;
    public final jyr f;
    public final jyr g;

    public a2j(ile ileVar, nke nkeVar) {
        ileVar.getClass();
        this.a = ileVar;
        this.b = nkeVar;
        this.c = ern.a(a2j.class);
        final int i = 0;
        final int i2 = 1;
        this.d = u75.h(vke.a, wke.a);
        this.e = new AtomicBoolean(false);
        this.f = btf.b(new Function0(this) { // from class: z1j
            public final /* synthetic */ a2j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new i7j(this.b.a.a);
                    default:
                        return new eke(this.b.b.a(), new gke(UgcLiveVideoData$UgcLiveStatus.OFFLINE));
                }
            }
        });
        this.g = btf.b(new Function0(this) { // from class: z1j
            public final /* synthetic */ a2j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new i7j(this.b.a.a);
                    default:
                        return new eke(this.b.b.a(), new gke(UgcLiveVideoData$UgcLiveStatus.OFFLINE));
                }
            }
        });
    }

    @Override // defpackage.lke
    public final void b(int i, hq5 hq5Var) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1890873587);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = gld.R(g.a, oq5Var);
                oq5Var.k0(K);
            }
            mm6 mm6Var = (mm6) K;
            boolean f = oq5Var.f(mm6Var);
            Object K2 = oq5Var.K();
            if (f || K2 == kjnVar) {
                K2 = new w6j(mm6Var, this.a, (eke) this.g.getValue());
                oq5Var.k0(K2);
            }
            ezf.c((w6j) K2, null, oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(this, i, 13);
        }
    }

    @Override // defpackage.lke
    public final float c(jx7 jx7Var) {
        jx7Var.getClass();
        return jx7Var.p(v7g.z(34)) + 10 + 4;
    }

    @Override // defpackage.lke
    public final List d() {
        return this.d;
    }

    @Override // defpackage.lke
    public final void e(boolean z) {
        jyr jyrVar = this.g;
        if (z) {
            ((eke) jyrVar.getValue()).b();
        } else {
            ((eke) jyrVar.getValue()).a();
        }
    }

    @Override // defpackage.lke
    public final lm4 g() {
        return this.c;
    }

    @Override // defpackage.lke
    public final String getTag() {
        return UgcLiveVideoData$UgcLiveStatus.OFFLINE;
    }

    @Override // defpackage.lke
    public final vdr getVisibility() {
        return ((i7j) this.f.getValue()).b;
    }

    @Override // defpackage.lke
    public final void start() {
        if (this.e.compareAndSet(false, true)) {
            i7j i7jVar = (i7j) this.f.getValue();
            i7jVar.getClass();
            i7jVar.a = gld.e(dm6.b());
            pjc b0 = zsd.b0(new kvh(((z66) i7jVar.c.getValue()).c(), 13));
            msa msaVar = nsa.b;
            ox6.B(zsd.Y(b0, yd5.M(1, ssa.SECONDS)), i7jVar.a, new fmi(9, i7jVar));
        }
    }
}
