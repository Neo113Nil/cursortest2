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
public final class z7s extends FrameLayout {
    public static final /* synthetic */ s9f[] e = {new yxm(z7s.class, "composeView", "getComposeView()Landroidx/compose/ui/platform/ComposeView;", 0), f1d.c(ern.a, z7s.class, "divView", "getDivView()Landroid/widget/FrameLayout;", 0), new yxm(z7s.class, "protectionView", "getProtectionView()Landroidx/core/view/insets/ProtectionLayout;", 0)};
    public final q13 a;
    public final q13 b;
    public gc8 c;
    public final q13 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7s(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = new q13(new y7s(this, 0));
        this.b = new q13(new y7s(this, 1));
        this.d = new q13(new y7s(this, 2));
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

    public final void a(rd6 rd6Var, p7s p7sVar, vb8 vb8Var, dzf dzfVar, qy2 qy2Var) {
        rd6Var.getClass();
        dzfVar.getClass();
        qy2Var.getClass();
        if (rd6Var.equals(ld6.a)) {
            getDivView().setVisibility(8);
            getDivView().removeAllViews();
            this.c = null;
            getComposeView().setVisibility(0);
            getComposeView().setContent(new wn5(new x7s(p7sVar, 0), 341198450, true));
            return;
        }
        if (!(rd6Var instanceof nd6)) {
            if (!rd6Var.equals(pd6.a)) {
                b6e.s();
                return;
            }
            getDivView().setVisibility(8);
            getDivView().removeAllViews();
            this.c = null;
            ComposeView composeView = getComposeView();
            composeView.setVisibility(0);
            composeView.setContent(xv.f);
            return;
        }
        if (getDivView().getChildCount() == 0) {
            getComposeView().setVisibility(8);
            getDivView().setVisibility(0);
            gc8 gc8Var = new gc8(vb8Var, null, 0, 6, null);
            bu8 bu8Var = ((nd6) rd6Var).a;
            qy2Var.b = String.valueOf(bu8Var.a);
            qy2Var.c = "TariffPaywallView";
            sk3.T(gc8Var, bu8Var.b, new dw8("paywall-tariff"), dzfVar, pd.M());
            this.c = gc8Var;
            getDivView().addView(this.c);
        }
        gc8 gc8Var2 = this.c;
        if (gc8Var2 != null) {
            gc8Var2.N("is_skippable", String.valueOf(((nd6) rd6Var).b));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getProtectionView().setProtections(t75.c(new fod(getResources().getColor(R.color.bg_primary_night, getContext().getTheme()))));
    }

    public /* synthetic */ z7s(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
