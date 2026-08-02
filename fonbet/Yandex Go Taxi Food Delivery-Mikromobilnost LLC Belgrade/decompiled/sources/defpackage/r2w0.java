package defpackage;

import com.yandex.go.mainscreen.superapp.orders.domain.h;
import com.yandex.go.mainscreen.superapp.orders.presentation.ui.SuperAppMainScreenOrdersPresenter$onStart$$inlined$collectLatestIn$1;
import com.yandex.go.mainscreen.superapp.orders.presentation.ui.SuperAppMainScreenOrdersPresenter$onStart$$inlined$flatMapLatest$1;
import defpackage.ate0;
import defpackage.l601;
import defpackage.pu6;
import defpackage.qhq0;
import defpackage.r2w0;
import defpackage.tje;
import defpackage.tls;
import defpackage.w201;
import defpackage.zy11;
import java.util.List;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes.dex */
public final class r2w0 extends qc5 {
    public final tt2 A;
    public final va90 B;
    public final kmr C;
    public final geu0 D;
    public final h E;
    public final ehw0 F;
    public final v9s0 G;
    public pzt0 H;
    public final n0 I;
    public w601 J;
    public List K;
    public final i3y L;

    public r2w0(ney neyVar, tt2 tt2Var, va90 va90Var, kmr kmrVar, geu0 geu0Var, h hVar, ehw0 ehw0Var, v9s0 v9s0Var) {
        super(q2w0.class, neyVar);
        this.A = tt2Var;
        this.B = va90Var;
        this.C = kmrVar;
        this.D = geu0Var;
        this.E = hVar;
        this.F = ehw0Var;
        this.G = v9s0Var;
        this.I = ffx.b(1, 0, BufferOverflow.DROP_OLDEST);
        this.K = EmptyList.a;
        this.L = a.a(new sls() { // from class: com.yandex.go.mainscreen.superapp.orders.presentation.ui.a
            @Override // defpackage.sls
            public final Object invoke() {
                final r2w0 r2w0Var = r2w0.this;
                return r2w0Var.F.a(new SuperAppMainScreenOrdersPresenter$uiActionInteractor$2$1(r2w0Var, r2w0.class, "mainScope", "getMainScope()Lkotlinx/coroutines/CoroutineScope;", 0), new qhq0(19, r2w0Var), l601.a, new ate0(21, r2w0Var), new tls() { // from class: com.yandex.go.mainscreen.superapp.orders.presentation.ui.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        w201 w201Var = (w201) obj;
                        boolean z = w201Var instanceof pu6;
                        r2w0 r2w0Var2 = r2w0.this;
                        if (z) {
                            tje.N(r2w0Var2.Jg(), null, null, new SuperAppMainScreenOrdersPresenter$uiActionInteractor$2$4$1(r2w0Var2, w201Var, null), 3);
                        } else {
                            r2w0Var2.B.g(w201Var);
                        }
                        return zy11.a;
                    }
                });
            }
        });
    }

    @Override // defpackage.qc5
    public final void Lg() {
        pzt0 pzt0Var = this.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // defpackage.qc5
    public final void onStart() {
        pzt0 pzt0Var = this.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.H = tje.N(Jg(), null, null, new SuperAppMainScreenOrdersPresenter$onStart$$inlined$collectLatestIn$1(e.X(e.t(this.I), new SuperAppMainScreenOrdersPresenter$onStart$$inlined$flatMapLatest$1(null, this)), null, this), 3);
    }
}
