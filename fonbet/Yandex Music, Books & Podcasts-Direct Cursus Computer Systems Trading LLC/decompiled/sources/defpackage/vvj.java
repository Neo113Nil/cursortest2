package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.insets.ProtectionLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class vvj extends FrameLayout {
    public static final /* synthetic */ s9f[] e = {new yxm(vvj.class, "composeView", "getComposeView()Landroidx/compose/ui/platform/ComposeView;", 0), f1d.c(ern.a, vvj.class, "divView", "getDivView()Landroid/widget/FrameLayout;", 0), new yxm(vvj.class, "protectionView", "getProtectionView()Landroidx/core/view/insets/ProtectionLayout;", 0)};
    public final q13 a;
    public final q13 b;
    public gc8 c;
    public final q13 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvj(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = new q13(new uvj(this, 0));
        this.b = new q13(new uvj(this, 1));
        this.d = new q13(new uvj(this, 2));
        View.inflate(context, R.layout.div_paywall_screen, this);
    }

    private final ComposeView getComposeView() {
        return (ComposeView) this.a.a(e[0]);
    }

    private final FrameLayout getDivView() {
        return (FrameLayout) this.b.a(e[1]);
    }

    private final ProtectionLayout getProtectionView() {
        return (ProtectionLayout) this.d.a(e[2]);
    }

    public final void a(sd6 sd6Var, rvj rvjVar, dzf dzfVar, vb8 vb8Var, qy2 qy2Var) {
        sd6Var.getClass();
        dzfVar.getClass();
        if (sd6Var.equals(md6.a)) {
            getDivView().setVisibility(8);
            getDivView().removeAllViews();
            getComposeView().setVisibility(0);
            getComposeView().setContent(new wn5(new ovj(rvjVar, 2, (byte) 0), -24893750, true));
            return;
        }
        if (!(sd6Var instanceof od6)) {
            if (!sd6Var.equals(qd6.a)) {
                b6e.s();
                return;
            }
            getDivView().setVisibility(8);
            getDivView().removeAllViews();
            ComposeView composeView = getComposeView();
            composeView.setVisibility(0);
            composeView.setContent(xp3.d);
            return;
        }
        if (getDivView().getChildCount() == 0) {
            getComposeView().setVisibility(8);
            getDivView().setVisibility(0);
            FrameLayout divView = getDivView();
            gc8 gc8Var = new gc8(vb8Var, null, 0, 6, null);
            cu8 cu8Var = ((od6) sd6Var).a;
            qy2Var.a(cu8Var.b.toString(), "OptionPaywallView");
            sk3.T(gc8Var, cu8Var.b, new dw8("paywall-option"), dzfVar, pd.M());
            this.c = gc8Var;
            divView.addView(gc8Var);
        }
        gc8 gc8Var2 = this.c;
        String str = ((od6) sd6Var).b;
        if (gc8Var2 == null) {
            return;
        }
        gc8Var2.post(new zvh(10, gc8Var2, str));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getProtectionView().setProtections(t75.c(new fod(getResources().getColor(R.color.bg_primary_night, getContext().getTheme()))));
    }

    public /* synthetic */ vvj(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
