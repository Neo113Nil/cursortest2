package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import kotlin.Pair;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class ddu extends op2 {
    public static final /* synthetic */ int o = 0;
    public adu i;
    public final jyr j = btf.b(new cdu(this, 0));
    public final jyr k = btf.b(new cdu(this, 3));
    public final jyr l = btf.b(new cdu(this, 2));
    public final jyr m = btf.b(wjp.x0);
    public final jyr n = btf.b(new cdu(this, 1));

    public static final void A(ddu dduVar, boolean z) {
        ConstraintLayout G = dduVar.G();
        q6c q6cVar = q6c.d;
        l8t.a(G, n7w.R(q6cVar) ? (n8t) dduVar.l.getValue() : (n8t) dduVar.m.getValue());
        M(dduVar.G());
        f96 f96Var = new f96();
        f96Var.f(dduVar.G());
        if (z) {
            f96Var.t(R.id.exit_fragment_container, 0);
            FrameLayout H = dduVar.H();
            if (H != null) {
                f96Var.t(H.getId(), 8);
            }
            if (n7w.R(q6cVar)) {
                View E = dduVar.E();
                if (E != null) {
                    f96Var.t(E.getId(), 0);
                }
            } else {
                dduVar.J(f96Var);
                f96Var.t(R.id.content_layout, 8);
            }
        } else {
            f96Var.t(R.id.exit_fragment_container, 8);
            dduVar.J(f96Var);
            if (!n7w.R(q6cVar)) {
                f96Var.t(R.id.content_layout, 0);
            }
        }
        f96Var.b(dduVar.G());
    }

    public static final void B(ddu dduVar, boolean z) {
        ConstraintLayout G = dduVar.G();
        q6c q6cVar = q6c.d;
        l8t.a(G, n7w.R(q6cVar) ? (n8t) dduVar.k.getValue() : (n8t) dduVar.m.getValue());
        f96 f96Var = new f96();
        f96Var.f(dduVar.G());
        f96Var.t(R.id.exit_fragment_container, 8);
        if (z) {
            FrameLayout H = dduVar.H();
            if (H != null) {
                f96Var.t(H.getId(), 0);
            }
            if (n7w.R(q6cVar)) {
                View E = dduVar.E();
                if (E != null) {
                    f96Var.t(E.getId(), 0);
                }
            } else {
                dduVar.J(f96Var);
                f96Var.t(R.id.content_layout, 8);
            }
        } else {
            FrameLayout H2 = dduVar.H();
            if (H2 != null) {
                f96Var.t(H2.getId(), 8);
            }
            dduVar.J(f96Var);
            if (!n7w.R(q6cVar)) {
                f96Var.t(R.id.content_layout, 0);
            }
        }
        f96Var.b(dduVar.G());
    }

    public static void L(ddu dduVar, boolean z, ConstraintLayout constraintLayout) {
        dduVar.getClass();
        constraintLayout.getClass();
        M(dduVar.G());
        f96 f96Var = new f96();
        f96Var.f(constraintLayout);
        if (z) {
            f96Var.e(R.id.snackBarLayout, 4);
            f96Var.h(R.id.snackBarLayout, 3, 0, 3, (int) (16 * Resources.getSystem().getDisplayMetrics().density));
            constraintLayout.postDelayed(new xlr(18, dduVar, constraintLayout), 6000L);
        } else {
            f96Var.e(R.id.snackBarLayout, 3);
            f96Var.g(R.id.snackBarLayout, 4, 0, 3);
        }
        f96Var.b(constraintLayout);
        l8t.a(constraintLayout, null);
    }

    public static void M(ConstraintLayout constraintLayout) {
        kcc kccVar = new kcc(new lcc(new wz0(8, constraintLayout), true, zyt.v0));
        while (kccVar.hasNext()) {
            ((View) kccVar.next()).setId(View.generateViewId());
        }
    }

    public abstract u8q C();

    public final adu D() {
        adu aduVar = this.i;
        if (aduVar != null) {
            return aduVar;
        }
        jj4.j("Binding is not initialized");
        return null;
    }

    public abstract View E();

    public abstract TextView F();

    public abstract ConstraintLayout G();

    public FrameLayout H() {
        return null;
    }

    public abstract ImageView I();

    public final void J(f96 f96Var) {
        View E = E();
        if (E != null) {
            f96Var.t(E.getId(), 8);
        }
    }

    public final void K() {
        o tpbVar;
        voi voiVar;
        View E = E();
        if (E != null) {
            E.setOnClickListener(null);
        }
        b3i b3iVar = new b3i(19);
        if (!n7w.R(q6c.e) || !n7w.R(q6c.j)) {
            b3iVar = null;
        }
        if (b3iVar != null) {
            Intent intent = getIntent();
            boolean B = qdq.B(intent != null ? Boolean.valueOf(intent.getBooleanExtra("com.yandex.payment.sdk.ui.network.extra.PAYMENT_CONTEXT", false)) : null);
            tpbVar = new i27();
            tpbVar.setArguments(cxb.K(new Pair("isPaymentContext", Boolean.valueOf(B))));
        } else {
            Intent intent2 = getIntent();
            boolean B2 = qdq.B(intent2 != null ? Boolean.valueOf(intent2.getBooleanExtra("com.yandex.payment.sdk.ui.network.extra.PAYMENT_CONTEXT", false)) : null);
            tpbVar = new tpb();
            tpbVar.setArguments(cxb.K(new Pair("isPaymentContext", Boolean.valueOf(B2))));
        }
        s(tpbVar, false, R.id.exit_fragment_container);
        boolean R = n7w.R(q6c.d);
        jyr jyrVar = this.n;
        int i = -1;
        if (R) {
            ((LinearLayout) jyrVar.getValue()).getLayoutParams().height = -1;
            G().getLayoutParams().height = -1;
            ImageView I = I();
            if (I != null) {
                I.setVisibility(8);
            }
            ((LinearLayout) jyrVar.getValue()).setBackgroundResource(R.drawable.paymentsdk_bg_full);
        } else {
            ImageView I2 = I();
            if (I2 != null) {
                I2.setVisibility(0);
            }
            ((LinearLayout) jyrVar.getValue()).setBackgroundResource(R.drawable.paymentsdk_bg_panel);
        }
        if (n7w.R(q6c.v)) {
            TextView F = F();
            if (F != null) {
                F.setVisibility(8);
                F.setGravity(17);
                F.setTextAlignment(4);
                Object obj = uah.q(((wm) l().d.get()).b).get("api_instance_id");
                if (obj == null) {
                    obj = "";
                }
                String str = (String) obj;
                Object obj2 = uah.q(((wm) l().d.get()).b).get("uid");
                String str2 = (String) (obj2 != null ? obj2 : "");
                F.setOnClickListener(new fq2(10, F, str));
                Resources.Theme theme = getTheme();
                theme.getClass();
                boolean A = ocg.A(theme, R.attr.paymentsdk_is_light_theme, true);
                Context context = F.getContext();
                int i2 = R.color.paymentsdk_white;
                F.setTextColor(context.getColor(A ? R.color.paymentsdk_textSecondaryLight : R.color.paymentsdk_white));
                Context context2 = F.getContext();
                if (!A) {
                    i2 = R.color.paymentsdk_onyx;
                }
                F.setBackgroundColor(context2.getColor(i2));
                F.setText("[NDA] PaymentSDK 6.26.1 UID: " + str2 + "\n " + str);
                ConstraintLayout G = G();
                G.setPadding(G.getPaddingLeft(), G.getPaddingTop(), G.getPaddingRight(), F.getResources().getDimensionPixelSize(R.dimen.paymentsdk_debug_view_height));
                F.setVisibility(0);
            }
        } else {
            ConstraintLayout G2 = G();
            G2.setPadding(G2.getPaddingLeft(), G2.getPaddingTop(), G2.getPaddingRight(), 0);
            TextView F2 = F();
            if (F2 != null) {
                F2.setVisibility(8);
            }
        }
        ViewGroup.LayoutParams layoutParams = G().getLayoutParams();
        if (getResources().getDisplayMetrics().widthPixels >= getResources().getDimensionPixelSize(R.dimen.paymentsdk_large_screen_width_threshold)) {
            zov zovVar = l().a().v;
            int i3 = zovVar == null ? -1 : bdu.a[zovVar.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    Resources resources = getResources();
                    resources.getClass();
                    i = resources.getDimensionPixelSize(R.dimen.paymentsdk_large_screen_compact_width);
                } else if (i3 != 2) {
                    b6e.s();
                    return;
                }
            }
        }
        layoutParams.width = i;
        u8q C = C();
        if (C == null || (voiVar = C.l) == null) {
            return;
        }
        voiVar.f(this, new di6(new hxo(22, this), 5));
    }

    public final void N() {
        o eyfVar;
        FrameLayout H = H();
        if (H != null) {
            int id = H.getId();
            b3i b3iVar = new b3i(19);
            if (!n7w.R(q6c.e) || !n7w.R(q6c.k)) {
                b3iVar = null;
            }
            if (b3iVar != null) {
                eyfVar = new o27();
            } else {
                eyfVar = new eyf();
                eyfVar.setArguments(cxb.K(new Pair("ARG_TYPE", byf.a)));
            }
            s(eyfVar, false, id);
        }
    }
}
