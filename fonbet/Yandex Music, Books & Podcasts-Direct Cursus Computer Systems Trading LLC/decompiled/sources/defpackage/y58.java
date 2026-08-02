package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import ru.yandex.music.R;
import ru.yandex.music.catalog.juicybottommenu.JuicyBottomSheetFrameLayout;

/* loaded from: classes5.dex */
public final class y58 {
    public static final /* synthetic */ s9f[] n = {new yxm(y58.class, "dialogContent", "getDialogContent()Landroid/view/View;", 0), f1d.c(ern.a, y58.class, "icon", "getIcon()Landroid/widget/ImageView;", 0), new yxm(y58.class, "title", "getTitle()Landroid/widget/TextView;", 0), new yxm(y58.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0), new yxm(y58.class, "detailsButton", "getDetailsButton()Landroid/widget/Button;", 0), new yxm(y58.class, "cancelButton", "getCancelButton()Landroid/widget/Button;", 0), new yxm(y58.class, "continueButton", "getContinueButton()Landroid/widget/Button;", 0), new yxm(y58.class, "loadingPlaceholderContainer", "getLoadingPlaceholderContainer()Landroid/view/View;", 0), new yxm(y58.class, "loadingProgressBar", "getLoadingProgressBar()Landroid/view/View;", 0)};
    public final qxp a;
    public final View b;
    public final q13 c;
    public final q13 d;
    public final q13 e;
    public final q13 f;
    public final q13 g;
    public final q13 h;
    public final q13 i;
    public final q13 j;
    public final q13 k;
    public AlphaAnimation l;
    public g58 m;

    public y58(LayoutInflater layoutInflater, JuicyBottomSheetFrameLayout juicyBottomSheetFrameLayout, qxp qxpVar) {
        layoutInflater.getClass();
        juicyBottomSheetFrameLayout.getClass();
        this.a = qxpVar;
        final int i = 1;
        View inflate = layoutInflater.inflate(R.layout.juicy_disclaimer_dialog, (ViewGroup) juicyBottomSheetFrameLayout, true);
        inflate.getClass();
        this.b = inflate;
        this.c = new q13(new ql(inflate, 21));
        this.d = new q13(new ql(inflate, 22));
        this.e = new q13(new ql(inflate, 23));
        this.f = new q13(new ql(inflate, 24));
        q13 q13Var = new q13(new ql(inflate, 25));
        this.g = q13Var;
        q13 q13Var2 = new q13(new ql(inflate, 26));
        this.h = q13Var2;
        q13 q13Var3 = new q13(new ql(inflate, 27));
        this.i = q13Var3;
        this.j = new q13(new ql(inflate, 28));
        this.k = new q13(new ql(inflate, 29));
        s9f[] s9fVarArr = n;
        final int i2 = 0;
        ((Button) q13Var.a(s9fVarArr[4])).setOnClickListener(new View.OnClickListener(this) { // from class: x58
            public final /* synthetic */ y58 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        y58 y58Var = this.b;
                        g58 g58Var = y58Var.m;
                        if (g58Var != null) {
                            qxp qxpVar2 = y58Var.a;
                            String str = g58Var.b;
                            str.getClass();
                            i58 i58Var = (i58) qxpVar2.a;
                            Context context = i58Var.getContext();
                            context.getClass();
                            w1g.y(context, str, true);
                            i58Var.dismissAllowingStateLoss();
                            break;
                        }
                        break;
                    case 1:
                        ((i58) this.b.a.a).dismissAllowingStateLoss();
                        break;
                    default:
                        ((i58) this.b.a.a).D(false);
                        break;
                }
            }
        });
        ((Button) q13Var2.a(s9fVarArr[5])).setOnClickListener(new View.OnClickListener(this) { // from class: x58
            public final /* synthetic */ y58 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        y58 y58Var = this.b;
                        g58 g58Var = y58Var.m;
                        if (g58Var != null) {
                            qxp qxpVar2 = y58Var.a;
                            String str = g58Var.b;
                            str.getClass();
                            i58 i58Var = (i58) qxpVar2.a;
                            Context context = i58Var.getContext();
                            context.getClass();
                            w1g.y(context, str, true);
                            i58Var.dismissAllowingStateLoss();
                            break;
                        }
                        break;
                    case 1:
                        ((i58) this.b.a.a).dismissAllowingStateLoss();
                        break;
                    default:
                        ((i58) this.b.a.a).D(false);
                        break;
                }
            }
        });
        final int i3 = 2;
        ((Button) q13Var3.a(s9fVarArr[6])).setOnClickListener(new View.OnClickListener(this) { // from class: x58
            public final /* synthetic */ y58 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        y58 y58Var = this.b;
                        g58 g58Var = y58Var.m;
                        if (g58Var != null) {
                            qxp qxpVar2 = y58Var.a;
                            String str = g58Var.b;
                            str.getClass();
                            i58 i58Var = (i58) qxpVar2.a;
                            Context context = i58Var.getContext();
                            context.getClass();
                            w1g.y(context, str, true);
                            i58Var.dismissAllowingStateLoss();
                            break;
                        }
                        break;
                    case 1:
                        ((i58) this.b.a.a).dismissAllowingStateLoss();
                        break;
                    default:
                        ((i58) this.b.a.a).D(false);
                        break;
                }
            }
        });
    }

    public final View a() {
        return (View) this.j.a(n[7]);
    }

    public final void b(boolean z, boolean z2) {
        s9f[] s9fVarArr = n;
        ((View) this.c.a(s9fVarArr[0])).setVisibility(!z ? 0 : 8);
        if (z) {
            a().setVisibility(0);
            ((View) this.k.a(s9fVarArr[8])).setVisibility(z2 ? 0 : 8);
        } else {
            if (a().getVisibility() == 4) {
                return;
            }
            AlphaAnimation alphaAnimation = this.l;
            if (alphaAnimation == null || alphaAnimation.hasEnded()) {
                this.l = cb0.C(a());
            }
        }
    }
}
