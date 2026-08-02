package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.b;
import com.yandex.go.payments.cards.ui.TransportCardWidgetView;
import com.yandex.go.payments.paymentlist.ui.PaymentOptionState;
import com.yandex.go.trusted_contacts.data.entities.network.EditContactNameConfigDto;
import defpackage.gq4;
import defpackage.iq4;
import defpackage.tls;
import defpackage.vp4;
import kotlin.collections.a;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.buttons.ButtonTrailView;

/* loaded from: classes13.dex */
public final class vp4 extends wys {
    public static final /* synthetic */ int V = 0;
    public static final /* synthetic */ int W = 0;
    public static final /* synthetic */ int Z = 0;
    public static final /* synthetic */ int a0 = 0;
    public static final /* synthetic */ int b0 = 0;
    public final /* synthetic */ int R;
    public final ViewGroup S;
    public final Object T;
    public Object U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp4(ViewGroup viewGroup, Object obj, Object obj2, int i) {
        super(viewGroup);
        this.R = i;
        this.S = viewGroup;
        this.T = obj;
        this.U = obj2;
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.R) {
            case 4:
                return false;
            default:
                return super.X();
        }
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        switch (this.R) {
            case 2:
                super.applyTheme(themeType);
                tkr0 tkr0Var = (tkr0) this.U;
                if (tkr0Var != null) {
                    c0(tkr0Var);
                    break;
                }
                break;
            case 3:
            default:
                super.applyTheme(themeType);
                break;
            case 4:
                super.applyTheme(themeType);
                ez4 ez4Var = (ez4) this.U;
                if (ez4Var != null) {
                    boolean z = ez4Var.d;
                    ListItemComponent listItemComponent = (ListItemComponent) this.S;
                    if (!z) {
                        listItemComponent.clearTrailView();
                        break;
                    } else {
                        listItemComponent.setClickableTrailImage(dzg0.ic_trash);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.R;
        Object obj2 = this.T;
        final int i2 = 1;
        final int i3 = 0;
        ViewGroup viewGroup = this.S;
        switch (i) {
            case 0:
                final iq4 iq4Var = (iq4) obj;
                ListItemComponent listItemComponent = (ListItemComponent) viewGroup;
                listItemComponent.setTitle(iq4Var.b);
                listItemComponent.setSubtitle(iq4Var.c);
                boolean z = iq4Var.e;
                listItemComponent.setContentAlpha(z ? 1.0f : 0.5f);
                listItemComponent.setEnabled(z);
                ((g1a0) this.U).b(listItemComponent.getLeadImageView(), iq4Var.i);
                listItemComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.payments.sbp.ui.home.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        tls tlsVar = (tls) vp4.this.T;
                        iq4 iq4Var2 = iq4Var;
                        ((SbpHomeModalView$sbpHomeBanksAdapter$1) tlsVar).invoke(new gq4(iq4Var2.b, iq4Var2.a, iq4Var2.f));
                    }
                });
                if (!iq4Var.h) {
                    listItemComponent.setDividers(DividerPosition.NONE, DividerType.NONE);
                    break;
                } else {
                    listItemComponent.setDividers(DividerPosition.BOTTOM, DividerType.ICON_MARGIN);
                    break;
                }
            case 1:
                ngz0 ngz0Var = (ngz0) obj;
                ListItemComponent listItemComponent2 = (ListItemComponent) viewGroup;
                boolean z2 = ngz0Var.g;
                View view = this.a;
                int d = z2 ? c.d(utg0.payment_methods_item_horizontal_padding, view) : c.h(0, view);
                listItemComponent2.setPadding(d, 0, d, 0);
                listItemComponent2.setTitleContentDescription(null);
                listItemComponent2.setSubtitleContentDescription(null);
                listItemComponent2.setUseAutoAccessibilityDelegate(true);
                b.p(listItemComponent2, null);
                listItemComponent2.setDebounceClickListener(new yo90(5, this, ngz0Var));
                listItemComponent2.setTrailContainerClickListener(null);
                listItemComponent2.setTrailContentDescription(null);
                Context context = listItemComponent2.getContext();
                if (ngz0Var.e) {
                    listItemComponent2.setTitle(kyh0.state_bar_active_taxis);
                    listItemComponent2.setDefaultMinHeight();
                    int m = ngz0Var.m();
                    listItemComponent2.setSubtitle(m == 0 ? c.G(kyh0.payment_method_list_tips_not_selected, view) : listItemComponent2.getContext().getString(kyh0.tip_percent_format, Integer.valueOf(m)));
                    listItemComponent2.setLeadImage(c.k(y2h0.ic_payment_methods_tips, view));
                    int i4 = dzg0.chevron_next;
                    z750 navigationIconParams = listItemComponent2.getNavigationIconParams();
                    navigationIconParams.d = i4;
                    navigationIconParams.a();
                    listItemComponent2.setTrailMode(2);
                    listItemComponent2.setLeadColor(null);
                } else {
                    listItemComponent2.setAutoMinHeight();
                    ((g1a0) ((z0a0) obj2)).b(listItemComponent2.getLeadImageView(), ngz0Var.h);
                    listItemComponent2.setTitle(ngz0Var.c);
                    CharSequence charSequence = ngz0Var.c().a;
                    if (charSequence != null) {
                        listItemComponent2.setSubtitle(charSequence);
                        listItemComponent2.setSubtitleTextColor(ngz0Var.c().b);
                        listItemComponent2.showSubtitle();
                    } else {
                        listItemComponent2.hideSubtitle();
                    }
                    int i5 = dzg0.component_trail_navigation_elevator;
                    z750 navigationIconParams2 = listItemComponent2.getNavigationIconParams();
                    navigationIconParams2.d = i5;
                    navigationIconParams2.a();
                    listItemComponent2.setTrailMode(2);
                    listItemComponent2.setTrailTextStyle(1);
                    listItemComponent2.setTrailCompanionText(context.getString(kyh0.tip_percent_format, Integer.valueOf(ngz0Var.m())));
                }
                boolean z3 = ngz0Var.b;
                if (z3) {
                    listItemComponent2.setContentAlpha(1.0f);
                } else {
                    listItemComponent2.setContentAlpha(0.5f);
                    b.p(listItemComponent2, new AccessibilityDelegateCompat());
                }
                listItemComponent2.setEnabled(z3);
                break;
            case 2:
                tkr0 tkr0Var = (tkr0) obj;
                ListItemComponent listItemComponent3 = (ListItemComponent) viewGroup;
                listItemComponent3.setTitle(tkr0Var.a.b);
                listItemComponent3.setSubtitle(tkr0Var.a.c);
                c0(tkr0Var);
                this.U = tkr0Var;
                break;
            case 3:
                y011 y011Var = (y011) obj;
                d111 d111Var = y011Var.b;
                TransportCardWidgetView transportCardWidgetView = (TransportCardWidgetView) viewGroup;
                transportCardWidgetView.clearStatusDescription();
                b111 b111Var = d111Var.m;
                if (b111Var != null) {
                    String str = b111Var.b;
                    transportCardWidgetView.setStatusDescriptionMessage(b111Var, str != null ? new zr01(6, this, str) : null);
                }
                ((g1a0) ((z0a0) obj2)).c(transportCardWidgetView.getLeadView(), d111Var);
                ImageView leadView = transportCardWidgetView.getLeadView();
                int i6 = f111.a[d111Var.i().ordinal()];
                if (i6 != 1) {
                    if (i6 != 2) {
                        w511.b();
                        break;
                    } else {
                        r4 = 0.5f;
                    }
                }
                leadView.setAlpha(r4);
                transportCardWidgetView.setTitle(y011Var.g);
                transportCardWidgetView.setSubtitle(y011Var.m().a, y011Var.m().b);
                transportCardWidgetView.setCheckable(true);
                transportCardWidgetView.setCheckedState(y011Var.c() == PaymentOptionState.SELECTED);
                ButtonTrailView trailButton = transportCardWidgetView.getTrailButton();
                trailButton.setCheckBoxVisible(true);
                trailButton.setButtonVisibility(false);
                final c111 c111Var = (c111) a.R(d111Var.f());
                final c111 c111Var2 = (c111) a.S(1, d111Var.f());
                if (c111Var == null && c111Var2 == null) {
                    transportCardWidgetView.setBottomActionsContainerVisibility(false);
                } else {
                    if (c111Var2 != null) {
                        ButtonComponent mainButton = transportCardWidgetView.getMainButton();
                        Runnable runnable = new Runnable(this) { // from class: e111
                            public final /* synthetic */ vp4 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i7 = i3;
                                c111 c111Var3 = c111Var2;
                                vp4 vp4Var = this.b;
                                switch (i7) {
                                    case 0:
                                        ((hba0) vp4Var.U).N3(c111Var3);
                                        break;
                                    default:
                                        ((hba0) vp4Var.U).N3(c111Var3);
                                        break;
                                }
                            }
                        };
                        mainButton.setText(c111Var2.c());
                        mainButton.setDebounceClickListener(runnable);
                    } else {
                        transportCardWidgetView.setMainButtonVisibility(false);
                    }
                    if (c111Var != null) {
                        ButtonComponent secondaryButton = transportCardWidgetView.getSecondaryButton();
                        Runnable runnable2 = new Runnable(this) { // from class: e111
                            public final /* synthetic */ vp4 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i7 = i2;
                                c111 c111Var3 = c111Var;
                                vp4 vp4Var = this.b;
                                switch (i7) {
                                    case 0:
                                        ((hba0) vp4Var.U).N3(c111Var3);
                                        break;
                                    default:
                                        ((hba0) vp4Var.U).N3(c111Var3);
                                        break;
                                }
                            }
                        };
                        secondaryButton.setText(c111Var.c());
                        secondaryButton.setDebounceClickListener(runnable2);
                    } else {
                        transportCardWidgetView.setSecondaryButtonVisibility(false);
                    }
                }
                if (f111.b[y011Var.c().ordinal()] == 1) {
                    transportCardWidgetView.setOnClickListener(null);
                    transportCardWidgetView.setOnLongClickListener(null);
                    transportCardWidgetView.setClickable(false);
                    transportCardWidgetView.setLongClickable(false);
                } else {
                    c.z(new zr01(7, this, y011Var), transportCardWidgetView);
                    transportCardWidgetView.setClickable(true);
                }
                transportCardWidgetView.setActivated(true);
                if (y011Var.e) {
                    transportCardWidgetView.setEnabledState();
                } else {
                    transportCardWidgetView.setDisabledState();
                }
                transportCardWidgetView.setDividers(DividerPosition.BOTTOM, y011Var.d);
                break;
            default:
                ez4 ez4Var = (ez4) obj;
                ListItemComponent listItemComponent4 = (ListItemComponent) viewGroup;
                listItemComponent4.setTitle(ez4Var.b);
                listItemComponent4.setSubtitle(ez4Var.c);
                boolean z4 = ez4Var.d;
                if (z4) {
                    listItemComponent4.setClickableTrailImage(dzg0.ic_trash);
                } else {
                    listItemComponent4.clearTrailView();
                }
                if (z4) {
                    listItemComponent4.getTrailImageView().setOnClickListener(new y7z0(11, this, ez4Var));
                }
                this.U = ez4Var;
                break;
        }
    }

    public void c0(tkr0 tkr0Var) {
        ListItemComponent listItemComponent = (ListItemComponent) this.S;
        EditContactNameConfigDto editContactNameConfigDto = tkr0Var.b;
        if (editContactNameConfigDto == null) {
            listItemComponent.clearTrailView();
            return;
        }
        listItemComponent.setClickableTrailImage(f1h0.ic_edit_20);
        listItemComponent.getTrailImageView().setOnClickListener(new nl(16, this, tkr0Var, editContactNameConfigDto));
        listItemComponent.getTrailImageView().setContentDescription(listItemComponent.getContext().getString(kyh0.common_edit));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp4(ListItemComponent listItemComponent, cms cmsVar, int i) {
        super(listItemComponent);
        this.R = i;
        this.S = listItemComponent;
        this.T = cmsVar;
    }
}
