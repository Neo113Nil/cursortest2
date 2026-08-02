package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.x0;
import com.yandex.div.core.expression.variables.a;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.widget.payment.method.c;
import com.yandex.go.payments.domain.m0;
import com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerView;
import com.yandex.go.vault.flexsdk.descriptors.widget.view.b;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

/* loaded from: classes12.dex */
public final class t8a0 extends v0x {
    public final /* synthetic */ int c;
    public final Object d;
    public final pdh e;

    public t8a0(boj0 boj0Var) {
        this.c = 0;
        this.d = boj0Var;
        this.e = new kul(1);
    }

    @Override // defpackage.v0x
    public final void b(x0 x0Var, u0x u0xVar) {
        switch (this.c) {
            case 0:
                ((c) x0Var).c((s8a0) u0xVar);
                break;
            case 1:
                break;
            default:
                p431 p431Var = (p431) x0Var;
                p431Var.getClass();
                l431 l431Var = ((k431) u0xVar).c;
                if (l431Var != null) {
                    p431Var.R.bind(l431Var);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.v0x
    public final x0 d(ViewGroup viewGroup) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                boj0 boj0Var = (boj0) obj;
                boj0Var.getClass();
                return new c(new ListItemComponent(viewGroup.getContext(), null, 0, 6, null), (m0) boj0Var.w, (z0a0) boj0Var.x, (dpw) ((yvf0) boj0Var.c).get(), (pdc) boj0Var.y, (a) boj0Var.z, (oep0) boj0Var.b);
            case 1:
                Context context = viewGroup.getContext();
                ((m0n0) obj).getClass();
                GoFrameLayout goFrameLayout = new GoFrameLayout(context, null, 0, 0, 14, null);
                goFrameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
                View circularProgressBar = new CircularProgressBar(context, null, 0, 6, null);
                circularProgressBar.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                circularProgressBar.setLayoutParams(layoutParams);
                goFrameLayout.addView(circularProgressBar);
                return new g0n0(goFrameLayout);
            default:
                a201 a201Var = (a201) obj;
                a201Var.getClass();
                return new p431(new VaultsPagerView(viewGroup.getContext(), (b) a201Var.b, (String) a201Var.c));
        }
    }

    @Override // defpackage.v0x
    public final pdh e() {
        switch (this.c) {
            case 0:
                return (kul) this.e;
            case 1:
                return this.e;
            default:
                return (kul) this.e;
        }
    }

    @Override // defpackage.v0x
    public final /* bridge */ /* synthetic */ void h(x0 x0Var) {
        switch (this.c) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
    }

    public t8a0(a201 a201Var) {
        this.c = 2;
        this.d = a201Var;
        this.e = new kul(2);
    }

    public t8a0(m0n0 m0n0Var) {
        this.c = 1;
        this.d = m0n0Var;
        this.e = new pdh();
    }
}
