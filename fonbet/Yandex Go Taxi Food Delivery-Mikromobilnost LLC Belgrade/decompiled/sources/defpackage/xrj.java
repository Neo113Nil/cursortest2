package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Locale;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final class xrj extends trj {
    public final pav O;
    public final dqj P;
    public final dqj Q;
    public final ListItemComponent R;
    public g18 S;
    public final BadgeView T;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xrj(ViewGroup viewGroup, pav pavVar, dqj dqjVar, dqj dqjVar2) {
        super(r0);
        View f = oo31.f(viewGroup, dvh0.promocode_exisitng_coupon_item, viewGroup, false);
        this.O = pavVar;
        this.P = dqjVar;
        this.Q = dqjVar2;
        ListItemComponent listItemComponent = (ListItemComponent) f.findViewById(y6h0.active_promo_code_layout);
        this.R = listItemComponent;
        BadgeView badgeView = new BadgeView(viewGroup.getContext(), null, 0, 6, null);
        badgeView.setVisibility(8);
        badgeView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        badgeView.setMinimumWidth(tje.u(56, f.getContext()));
        badgeView.setTextSize(tje.r(mrg0.component_text_size_body, f.getContext()));
        badgeView.setTextTypeface(5, 1);
        badgeView.setTextColor(f.getContext().getColor(mqg0.component_white));
        badgeView.setTintColor(f.getContext().getColor(xqg0.charge_color_red));
        badgeView.setShape(BadgeView.Shape.STICKER);
        xw31.C(16, badgeView);
        this.T = badgeView;
        listItemComponent.trailFrame.addView(badgeView, 0);
        listItemComponent.setDividers(DividerPosition.TOP, DividerType.ICON_MARGIN);
    }

    @Override // defpackage.trj
    public final void W(fqj fqjVar) {
        final hqj hqjVar = (hqj) fqjVar;
        boolean z = hqjVar.h;
        CharSequence charSequence = hqjVar.d;
        ListItemComponent listItemComponent = this.R;
        if (z) {
            listItemComponent.setClickable(false);
        } else {
            listItemComponent.setDebounceClickListener(new Runnable(this) { // from class: wrj
                public final /* synthetic */ xrj b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i = r3;
                    hqj hqjVar2 = hqjVar;
                    xrj xrjVar = this.b;
                    switch (i) {
                        case 0:
                            xrjVar.P.invoke(hqjVar2.a);
                            break;
                        default:
                            xrjVar.Q.invoke(hqjVar2.a);
                            break;
                    }
                }
            });
        }
        String str = hqjVar.f;
        if (str != null) {
            nac nacVar = (nac) this.O.a(listItemComponent.getLeadImageView());
            nacVar.e(m3h0.ic_promo_code_default);
            this.S = nacVar.c(str);
        } else {
            listItemComponent.setLeadImage(m3h0.ic_promo_code_default);
        }
        if (z) {
            listItemComponent.setClickableTrailImage(dzg0.ic_delete_item);
            listItemComponent.getTrailImageView().setContentDescription(listItemComponent.getContext().getString(kyh0.promocode_remove));
            final int i = 1;
            listItemComponent.getTrailImageView().setDebounceClickListener(new Runnable(this) { // from class: wrj
                public final /* synthetic */ xrj b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    hqj hqjVar2 = hqjVar;
                    xrj xrjVar = this.b;
                    switch (i2) {
                        case 0:
                            xrjVar.P.invoke(hqjVar2.a);
                            break;
                        default:
                            xrjVar.Q.invoke(hqjVar2.a);
                            break;
                    }
                }
            });
            ViewGroup viewGroup = (ViewGroup) listItemComponent.getTrailImageView().getParent();
            c.D(viewGroup.getLayoutParams().width, listItemComponent.getHeight(), viewGroup);
            xw31.C(16, viewGroup);
        } else {
            listItemComponent.setTrailMode(0);
        }
        listItemComponent.setTitle(hqjVar.b);
        listItemComponent.setSubtitle(hqjVar.c);
        int i2 = hqjVar.g ? mqg0.component_red_normal : mqg0.component_gray_300;
        View view = this.a;
        listItemComponent.setSubtitleTextColor(c.a(i2, view));
        if (z || !hqjVar.e) {
            listItemComponent.clearTrailText();
        } else {
            listItemComponent.setTrailCompanionText(listItemComponent.getContext().getString(kyh0.active_coupon).toLowerCase(Locale.getDefault()));
        }
        int i3 = (charSequence == null || charSequence.length() == 0) ? 8 : 0;
        BadgeView badgeView = this.T;
        badgeView.setVisibility(i3);
        badgeView.setText(charSequence);
        xw31.F(badgeView, null, null, Integer.valueOf(z ? 0 : tje.u(12, view.getContext())), null);
        badgeView.setLayoutParams(badgeView.getLayoutParams());
    }

    @Override // defpackage.trj
    public final void X() {
        this.R.clearTrailView();
        ((FrameLayout) this.N).setOnClickListener(null);
        g18 g18Var = this.S;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.S = null;
    }
}
