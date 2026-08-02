package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import defpackage.pvi;
import java.util.Collection;
import java.util.List;
import ru.yandex.taxi.delivery.ui.form.DeliveryFormModalView;
import ru.yandex.taxi.delivery.ui.requirement.DeliveryRequirementView;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.scroll.ShadowScrollIndicator;

/* loaded from: classes5.dex */
public final class rai implements wai {
    public final mai a;
    public final /* synthetic */ DeliveryFormModalView b;

    public rai(DeliveryFormModalView deliveryFormModalView, mai maiVar) {
        this.b = deliveryFormModalView;
        this.a = maiVar;
    }

    @Override // defpackage.wai
    public final void K4(mji0 mji0Var) {
        pvi binding;
        pvi binding2;
        mki mkiVar;
        pvi binding3;
        pvi binding4;
        pvi binding5;
        pvi binding6;
        pvi binding7;
        pvi binding8;
        List<hai> list = mji0Var.a;
        boolean z = list instanceof Collection;
        final DeliveryFormModalView deliveryFormModalView = this.b;
        if (!z || !list.isEmpty()) {
            for (hai haiVar : list) {
                if ((haiVar instanceof twh) || (haiVar instanceof xmi)) {
                    binding = deliveryFormModalView.getBinding();
                    binding.h.setEnabled(false);
                    binding2 = deliveryFormModalView.getBinding();
                    binding2.b.setVisibility(0);
                    break;
                }
            }
        }
        binding5 = deliveryFormModalView.getBinding();
        binding5.h.setEnabled(true);
        binding6 = deliveryFormModalView.getBinding();
        ShadowScrollIndicator shadowScrollIndicator = binding6.h;
        binding7 = deliveryFormModalView.getBinding();
        shadowScrollIndicator.setScrollView(binding7.g);
        binding8 = deliveryFormModalView.getBinding();
        binding8.b.setVisibility(8);
        mkiVar = deliveryFormModalView.blocksAdapter;
        mkiVar.submitList(mji0Var.a, null);
        binding3 = deliveryFormModalView.getBinding();
        if (binding3.c.getChildCount() == 0) {
            binding4 = deliveryFormModalView.getBinding();
            binding4.c.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.yandex.taxi.delivery.ui.form.DeliveryFormModalView$DeliveryFormMvpViewImpl$renderBlocks$2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    pvi binding9;
                    pvi binding10;
                    pvi binding11;
                    pvi binding12;
                    binding9 = DeliveryFormModalView.this.getBinding();
                    if (binding9.c.getChildCount() > 0) {
                        binding11 = DeliveryFormModalView.this.getBinding();
                        binding11.c.getChildAt(0).performAccessibilityAction(64, null);
                        binding12 = DeliveryFormModalView.this.getBinding();
                        binding12.c.getChildAt(0).sendAccessibilityEvent(8);
                    }
                    binding10 = DeliveryFormModalView.this.getBinding();
                    binding10.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
    }

    @Override // defpackage.wai
    public final void V4(zlj0 zlj0Var) {
        DeliveryRequirementView deliveryRequirementView;
        deliveryRequirementView = this.b.requirementView;
        if (zlj0Var == null) {
            deliveryRequirementView.setOnClickListener(null);
            deliveryRequirementView.setVisibility(8);
        } else {
            deliveryRequirementView.bindModel(zlj0Var);
            c.z(new bmh(11, zlj0Var, this), deliveryRequirementView);
            deliveryRequirementView.setVisibility(0);
        }
    }

    @Override // defpackage.wai
    public final void close() {
        this.b.dismiss();
    }

    @Override // defpackage.wai
    public final void hd() {
        this.b.requestFocus();
    }

    @Override // defpackage.wai
    public final void hideKeyboard() {
        pvi binding;
        pvi binding2;
        DeliveryFormModalView deliveryFormModalView = this.b;
        binding = deliveryFormModalView.getBinding();
        View findFocus = binding.c.findFocus();
        if (findFocus == null) {
            binding2 = deliveryFormModalView.getBinding();
            findFocus = binding2.c;
        }
        ((InputMethodManager) deliveryFormModalView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(findFocus.getWindowToken(), 0);
    }

    @Override // defpackage.wai
    public final void l8(pbi pbiVar) {
        pvi binding;
        pvi binding2;
        pvi binding3;
        pvi binding4;
        pvi binding5;
        pvi binding6;
        pvi binding7;
        pvi binding8;
        pvi binding9;
        pvi binding10;
        pvi binding11;
        pvi binding12;
        DeliveryFormModalView deliveryFormModalView = this.b;
        binding = deliveryFormModalView.getBinding();
        binding.e.setSubtitle(pbiVar.b);
        binding2 = deliveryFormModalView.getBinding();
        binding2.e.setTitle(pbiVar.a);
        binding3 = deliveryFormModalView.getBinding();
        binding3.e.setVisibility(0);
        if (pbiVar.d) {
            binding10 = deliveryFormModalView.getBinding();
            binding10.e.setRoundedBackground(qje.t(xng0.controlMain, deliveryFormModalView.getContext()));
            Boolean bool = tp11.a;
            binding11 = deliveryFormModalView.getBinding();
            tp11.b(3, binding11.e.title());
            binding12 = deliveryFormModalView.getBinding();
            binding12.e.setDebounceClickListener(new uxh(9, this));
        } else {
            binding4 = deliveryFormModalView.getBinding();
            binding4.e.setRoundedBackground(qje.t(xng0.controlMinor, deliveryFormModalView.getContext()));
            Boolean bool2 = tp11.a;
            binding5 = deliveryFormModalView.getBinding();
            tp11.b(0, binding5.e.title());
            binding6 = deliveryFormModalView.getBinding();
            binding6.e.setDebounceClickListener(null);
        }
        binding7 = deliveryFormModalView.getBinding();
        boolean isInProgressAnimation = binding7.e.isInProgressAnimation();
        boolean z = pbiVar.c;
        if (isInProgressAnimation != z) {
            if (z) {
                binding9 = deliveryFormModalView.getBinding();
                binding9.e.startProgressAnimation();
            } else {
                binding8 = deliveryFormModalView.getBinding();
                binding8.e.stopProgressAnimation();
            }
        }
    }

    @Override // defpackage.wai
    public final void scrollToPosition(int i) {
        pvi binding;
        binding = this.b.getBinding();
        binding.c.scrollToPosition(i);
    }
}
