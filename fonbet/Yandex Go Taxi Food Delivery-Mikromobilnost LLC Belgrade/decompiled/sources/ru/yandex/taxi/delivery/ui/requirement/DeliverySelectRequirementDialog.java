package ru.yandex.taxi.delivery.ui.requirement;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.bpi;
import defpackage.cma1;
import defpackage.deh0;
import defpackage.h60;
import defpackage.hqh0;
import defpackage.ny61;
import defpackage.sls;
import defpackage.voi;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.requirements.ui.selector.usual.UsualOptionSelectorView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.dialog.BaseDialog;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/yandex/taxi/delivery/ui/requirement/DeliverySelectRequirementDialog;", "Lru/yandex/taxi/widget/dialog/BaseDialog;", "Landroid/app/Activity;", "activity", "Lbpi;", "args", "Lru/yandex/taxi/requirements/ui/selector/usual/UsualOptionSelectorView;", "selectorView", "<init>", "(Landroid/app/Activity;Lbpi;Lru/yandex/taxi/requirements/ui/selector/usual/UsualOptionSelectorView;)V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "getCustomView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lzy11;", "onViewCreated", "()V", "Lkotlin/Function0;", "listener", "setBackButtonClickListener", "(Lsls;)V", "setNextButtonClickListener", "", "isEnable", "setNextButtonEnable", "(Z)V", "Lbpi;", "Lru/yandex/taxi/requirements/ui/selector/usual/UsualOptionSelectorView;", "Lvoi;", "binding", "Lvoi;", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliverySelectRequirementDialog extends BaseDialog<DeliverySelectRequirementDialog> {
    private final bpi args;
    private voi binding;
    private final UsualOptionSelectorView selectorView;

    public DeliverySelectRequirementDialog(Activity activity, bpi bpiVar, UsualOptionSelectorView usualOptionSelectorView) {
        super(activity);
        this.args = bpiVar;
        this.selectorView = usualOptionSelectorView;
    }

    @Override // ru.yandex.taxi.widget.dialog.BaseDialog
    public View getCustomView(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(hqh0.delivery_select_requirement_dialog, parent, false);
        int i = deh0.back;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = deh0.container;
            FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
            if (frameLayout != null) {
                i = deh0.header;
                LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                if (linearLayout != null) {
                    i = deh0.next;
                    ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent2 != null) {
                        i = deh0.subtitle;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView != null) {
                            i = deh0.title;
                            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                            if (listItemComponent != null) {
                                LinearLayout linearLayout2 = (LinearLayout) inflate;
                                this.binding = new voi(linearLayout2, buttonComponent, frameLayout, linearLayout, buttonComponent2, robotoTextView, listItemComponent);
                                return linearLayout2;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.dialog.BaseDialog
    public void onViewCreated() {
        voi voiVar = this.binding;
        if (voiVar == null) {
            voiVar = null;
        }
        voiVar.g.setTitle(this.args.a);
        voi voiVar2 = this.binding;
        if (voiVar2 == null) {
            voiVar2 = null;
        }
        voiVar2.f.setText(this.args.b);
        voi voiVar3 = this.binding;
        if (voiVar3 == null) {
            voiVar3 = null;
        }
        LinearLayout linearLayout = voiVar3.d;
        bpi bpiVar = this.args;
        linearLayout.setContentDescription(bpiVar.a + ". " + bpiVar.b);
        voi voiVar4 = this.binding;
        if (voiVar4 == null) {
            voiVar4 = null;
        }
        voiVar4.e.setEnabled(this.args.d);
        voi voiVar5 = this.binding;
        (voiVar5 != null ? voiVar5 : null).c.addView(this.selectorView);
    }

    public final void setBackButtonClickListener(sls listener) {
        voi voiVar = this.binding;
        if (voiVar == null) {
            voiVar = null;
        }
        voiVar.b.setDebounceClickListener(new h60(22, listener));
    }

    public final void setNextButtonClickListener(sls listener) {
        voi voiVar = this.binding;
        if (voiVar == null) {
            voiVar = null;
        }
        voiVar.e.setDebounceClickListener(new h60(21, listener));
    }

    public final void setNextButtonEnable(boolean isEnable) {
        voi voiVar = this.binding;
        if (voiVar == null) {
            voiVar = null;
        }
        voiVar.e.setEnabled(isEnable);
    }
}
