package defpackage;

import android.content.Context;
import com.yandex.go.places.map.ui.overlay.b;
import com.yandex.go.places.organization.card.impl.ui.card.map.overlay.a;
import com.yandex.go.places.organization.card.impl.ui.card.map.overlay.c;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.mapkit.map.VisibleRegion;
import defpackage.gh00;
import defpackage.tje;
import defpackage.vf80;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes13.dex */
public final class vf80 extends b {
    public final c A;
    public final i3y B;
    public final i3y C;
    public final i3y D;
    public final dew E;
    public final uf80 F;
    public final bw20 G;
    public final a H;
    public final Context y;
    public final a3v z;

    /* JADX WARN: Type inference failed for: r1v10, types: [com.yandex.go.places.organization.card.impl.ui.card.map.overlay.a] */
    public vf80(Context context, a3v a3vVar, h3y h3yVar, com.yandex.go.places.map.ui.overlay.a aVar, c cVar, final ah00 ah00Var) {
        super(ah00Var, h3yVar, aVar);
        this.y = context;
        this.z = a3vVar;
        this.A = cVar;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: tf80
            public final /* synthetic */ vf80 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i2 = i;
                vf80 vf80Var = this.b;
                switch (i2) {
                    case 0:
                        r = tje.r(mrg0.go_design_m_space, vf80Var.y);
                        break;
                    case 1:
                        r = tje.r(mrg0.go_design_l_space, vf80Var.y);
                        break;
                    default:
                        r = tje.r(fug0.discovery_organization_anchor_height, vf80Var.y);
                        break;
                }
                return Integer.valueOf(r);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.B = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 1;
        this.C = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: tf80
            public final /* synthetic */ vf80 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i22 = i2;
                vf80 vf80Var = this.b;
                switch (i22) {
                    case 0:
                        r = tje.r(mrg0.go_design_m_space, vf80Var.y);
                        break;
                    case 1:
                        r = tje.r(mrg0.go_design_l_space, vf80Var.y);
                        break;
                    default:
                        r = tje.r(fug0.discovery_organization_anchor_height, vf80Var.y);
                        break;
                }
                return Integer.valueOf(r);
            }
        });
        final int i3 = 2;
        this.D = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: tf80
            public final /* synthetic */ vf80 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int r;
                int i22 = i3;
                vf80 vf80Var = this.b;
                switch (i22) {
                    case 0:
                        r = tje.r(mrg0.go_design_m_space, vf80Var.y);
                        break;
                    case 1:
                        r = tje.r(mrg0.go_design_l_space, vf80Var.y);
                        break;
                    default:
                        r = tje.r(fug0.discovery_organization_anchor_height, vf80Var.y);
                        break;
                }
                return Integer.valueOf(r);
            }
        });
        this.E = new dew();
        this.F = new uf80(this);
        this.G = new bw20(i2, this);
        this.H = new hr7() { // from class: com.yandex.go.places.organization.card.impl.ui.card.map.overlay.a
            @Override // defpackage.hr7
            public final void h(CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
                if (cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    c cVar2 = vf80.this.A;
                    VisibleRegion a = ((gh00) ah00Var).e.a();
                    cVar2.L = true;
                    tje.N(cVar2.Jg(), null, null, new OrganizationCardMapPresenter$updateCurrentBBox$1(a, cVar2, null), 3);
                }
            }
        };
    }

    @Override // com.yandex.go.places.map.ui.overlay.b
    public final void Ig() {
        i3y i3yVar = this.B;
        this.z.q3(vf80.class, ((Number) i3yVar.getValue()).intValue(), ((Number) this.C.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue(), ((Number) this.D.getValue()).intValue());
        this.A.Bg(this.E);
        gh00 gh00Var = (gh00) ((ah00) this.b);
        gh00Var.d(this.F);
        gh00Var.c(this.G);
        gh00Var.q(new ub60(20, this));
    }
}
