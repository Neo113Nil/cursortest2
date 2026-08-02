package ru.yandex.taxi.sdc.presentation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.bd;
import defpackage.bkh0;
import defpackage.cma1;
import defpackage.ed;
import defpackage.evu0;
import defpackage.fd;
import defpackage.hc;
import defpackage.jc;
import defpackage.kc;
import defpackage.nc;
import defpackage.ny61;
import defpackage.nzc;
import defpackage.pco;
import defpackage.qco;
import defpackage.r7h0;
import defpackage.tls;
import defpackage.wk1;
import defpackage.x3h0;
import defpackage.y130;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.sdc.presentation.AcceptEulaDialogV2;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BO\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/yandex/taxi/sdc/presentation/AcceptEulaDialogV2;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Led;", "analytics", "Lbd;", "acceptance", "Lqco;", ConfigConstants.CONFIG, "Lpco;", "callback", "Lkotlin/Function1;", "", "Lzy11;", "onShowWebViewListener", "<init>", "(Landroid/content/Context;Led;Lbd;Lqco;Lpco;Ltls;)V", "Lwk1;", "agreementPoint", "addAgreementPointView", "(Lwk1;)V", "Ly130;", "insetsType", "()Ly130;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "contentView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/ViewGroup;", "parent", "", "zOrder", "show", "(Landroid/view/ViewGroup;F)V", "onDismissManually", "()V", "Led;", "Lbd;", "Lqco;", "Lpco;", "Ltls;", "Lnc;", "binding", "Lnc;", "Lru/yandex/taxi/design/ButtonComponent;", "completeButton", "Lru/yandex/taxi/design/ButtonComponent;", "Lru/yandex/taxi/design/ListItemSwitchComponent;", "acceptAll", "Lru/yandex/taxi/design/ListItemSwitchComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "completeRulesView", "Lru/yandex/taxi/design/ListItemComponent;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AcceptEulaDialogV2 extends ModalView {
    private final ListItemSwitchComponent acceptAll;
    private final bd acceptance;
    private final ed analytics;
    private final nc binding;
    private final pco callback;
    private final ButtonComponent completeButton;
    private final ListItemComponent completeRulesView;
    private final qco config;
    private final tls onShowWebViewListener;

    public AcceptEulaDialogV2(Context context, ed edVar, bd bdVar, qco qcoVar, pco pcoVar, tls tlsVar) {
        super(context);
        View O;
        String str;
        String str2;
        this.analytics = edVar;
        this.acceptance = bdVar;
        this.config = qcoVar;
        this.callback = pcoVar;
        this.onShowWebViewListener = tlsVar;
        LayoutInflater.from(context).inflate(bkh0.accept_eula_modal_view_v2, this);
        int i = r7h0.accept_all;
        ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) cma1.O(i, this);
        if (listItemSwitchComponent != null) {
            i = r7h0.agreement_text_content;
            ListTextComponent listTextComponent = (ListTextComponent) cma1.O(i, this);
            if (listTextComponent != null) {
                i = r7h0.agreement_title;
                ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, this);
                if (listTitleComponent != null) {
                    i = r7h0.bottom_content;
                    if (((LinearLayout) cma1.O(i, this)) != null) {
                        i = r7h0.complete_button;
                        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, this);
                        if (buttonComponent != null) {
                            i = r7h0.complete_rules_view;
                            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, this);
                            if (listItemComponent != null) {
                                i = r7h0.content;
                                ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, this);
                                if (constraintLayout != null) {
                                    i = r7h0.eula_discard;
                                    ImageButton imageButton = (ImageButton) cma1.O(i, this);
                                    if (imageButton != null) {
                                        i = r7h0.eula_scroll_view;
                                        if (((NestedScrollViewAdvanced) cma1.O(i, this)) != null && (O = cma1.O((i = r7h0.linear_view), this)) != null) {
                                            i = r7h0.scrollable_top_content;
                                            LinearLayout linearLayout = (LinearLayout) cma1.O(i, this);
                                            if (linearLayout != null) {
                                                this.binding = new nc(this, listItemSwitchComponent, listTextComponent, listTitleComponent, buttonComponent, listItemComponent, constraintLayout, imageButton, O, linearLayout);
                                                this.completeButton = buttonComponent;
                                                this.acceptAll = listItemSwitchComponent;
                                                this.completeRulesView = listItemComponent;
                                                String str3 = qcoVar.d;
                                                String str4 = qcoVar.c;
                                                final int i2 = 0;
                                                if (!evu0.J(str3)) {
                                                    listTitleComponent.setTitle(qcoVar.d);
                                                    listTitleComponent.setVisibility(0);
                                                }
                                                if (!evu0.J(str4)) {
                                                    listTextComponent.setText(str4);
                                                    listTextComponent.setVisibility(0);
                                                }
                                                Iterator it = qcoVar.f.iterator();
                                                while (it.hasNext()) {
                                                    addAgreementPointView((wk1) it.next());
                                                }
                                                nzc nzcVar = this.config.e;
                                                if (nzcVar != null && (str = nzcVar.b) != null && !evu0.J(str) && (str2 = nzcVar.a) != null && !evu0.J(str2)) {
                                                    this.completeRulesView.setTitle(str);
                                                    this.completeRulesView.setDebounceClickListener(new hc(i2, this, nzcVar));
                                                    this.completeRulesView.setVisibility(0);
                                                }
                                                this.acceptAll.setTitle(this.config.a);
                                                this.acceptAll.setOnCheckedListener(new kc(i2, this.completeButton));
                                                this.acceptAll.setDebounceClickListener(new Runnable(this) { // from class: ic
                                                    public final /* synthetic */ AcceptEulaDialogV2 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i3 = i2;
                                                        AcceptEulaDialogV2 acceptEulaDialogV2 = this.b;
                                                        switch (i3) {
                                                            case 0:
                                                                AcceptEulaDialogV2._init_$lambda$1(acceptEulaDialogV2);
                                                                break;
                                                            default:
                                                                AcceptEulaDialogV2._init_$lambda$2(acceptEulaDialogV2);
                                                                break;
                                                        }
                                                    }
                                                });
                                                this.completeButton.setText(this.config.b);
                                                final int i3 = 1;
                                                this.completeButton.setDebounceClickListener(new Runnable(this) { // from class: ic
                                                    public final /* synthetic */ AcceptEulaDialogV2 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i32 = i3;
                                                        AcceptEulaDialogV2 acceptEulaDialogV2 = this.b;
                                                        switch (i32) {
                                                            case 0:
                                                                AcceptEulaDialogV2._init_$lambda$1(acceptEulaDialogV2);
                                                                break;
                                                            default:
                                                                AcceptEulaDialogV2._init_$lambda$2(acceptEulaDialogV2);
                                                                break;
                                                        }
                                                    }
                                                });
                                                this.binding.c.setVisibility(this.acceptance.k ? 0 : 8);
                                                c.z(new jc(this, i2), this.binding.c);
                                                setDismissOnTouchOutside(false);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(AcceptEulaDialogV2 acceptEulaDialogV2, nzc nzcVar) {
        acceptEulaDialogV2.onShowWebViewListener.invoke(nzcVar.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AcceptEulaDialogV2 acceptEulaDialogV2) {
        acceptEulaDialogV2.acceptAll.setCheckedWithAnimation(!acceptEulaDialogV2.completeButton.isEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(AcceptEulaDialogV2 acceptEulaDialogV2) {
        acceptEulaDialogV2.dismiss();
        acceptEulaDialogV2.callback.n();
        ((fd) acceptEulaDialogV2.analytics).d(acceptEulaDialogV2.acceptance, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$3(AcceptEulaDialogV2 acceptEulaDialogV2) {
        acceptEulaDialogV2.dismiss();
        acceptEulaDialogV2.callback.o();
        ((fd) acceptEulaDialogV2.analytics).e(acceptEulaDialogV2.acceptance);
        return zy11.a;
    }

    private final void addAgreementPointView(wk1 agreementPoint) {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        if (agreementPoint.b) {
            listItemComponent.setLeadImage(x3h0.ic_agreement_point);
        }
        listItemComponent.setTitle(agreementPoint.a);
        this.binding.e.addView(listItemComponent, new FrameLayout.LayoutParams(-1, -2));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(1, new jc(this, 1));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        this.callback.o();
        super.onDismissManually();
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void show(ViewGroup parent, float zOrder) {
        super.show(parent, zOrder);
        ((fd) this.analytics).g(this.acceptance);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public ConstraintLayout getContentView() {
        return this.binding.b;
    }
}
