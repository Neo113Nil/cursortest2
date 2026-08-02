package ru.yandex.taxi.surge.dialog.selector;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.bmb0;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.fcl0;
import defpackage.nlq0;
import defpackage.ny61;
import defpackage.olq0;
import defpackage.qdb1;
import defpackage.r3k0;
import defpackage.sls;
import defpackage.tlq0;
import defpackage.tls;
import defpackage.yrh0;
import defpackage.zfh0;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.wheel.PickerView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/surge/dialog/selector/SelectorModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lolq0;", "Landroid/content/Context;", "context", "Ltlq0;", "params", "Lkotlin/Function0;", "Lzy11;", "onClose", "Lkotlin/Function1;", "", "onSelected", "<init>", "(Landroid/content/Context;Ltlq0;Lsls;Ltls;)V", "render", "(Ltlq0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lolq0;", "onAttachedToWindow", "()V", "Ltls;", "Lbmb0;", "currentItem", "Lbmb0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectorModalView extends SlideableBindingModalView<olq0> {
    private bmb0 currentItem;
    private final tls onSelected;

    public SelectorModalView(Context context, tlq0 tlq0Var, sls slsVar, tls tlsVar) {
        super(context);
        this.onSelected = tlsVar;
        this.currentItem = tlq0Var.e;
        qdb1.c(this, new fcl0(18, slsVar));
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        render(tlq0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(SelectorModalView selectorModalView) {
        selectorModalView.getBinding().e.performAccessibilityAction(64, null);
    }

    private final void render(tlq0 params) {
        olq0 binding = getBinding();
        ListHeaderComponent listHeaderComponent = binding.e;
        ButtonComponent buttonComponent = binding.b;
        ListTextComponent listTextComponent = binding.d;
        PickerView pickerView = binding.c;
        CharSequence charSequence = params.a;
        CharSequence charSequence2 = params.b;
        listHeaderComponent.setTitle(charSequence);
        int i = 8;
        int i2 = 0;
        binding.e.setVisibility(!evu0.J(params.a) ? 0 : 8);
        listTextComponent.setText(charSequence2);
        listTextComponent.setVisibility(!evu0.J(charSequence2) ? 0 : 8);
        pickerView.setPicker(params.d);
        pickerView.updateMode(true);
        pickerView.setOnOptionsSelectListener(new r3k0(i, this, params));
        pickerView.selectItem(zy11.a, params.e);
        buttonComponent.setText(params.c);
        buttonComponent.setDebounceClickListener(new nlq0(this, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0$0(SelectorModalView selectorModalView, tlq0 tlq0Var, int i, int i2, int i3, boolean z) {
        Object a = tlq0Var.d.b(i).a(i2);
        bmb0 bmb0Var = a instanceof bmb0 ? (bmb0) a : null;
        if (bmb0Var == null) {
            bmb0Var = new bmb0("", "");
        }
        selectorModalView.currentItem = bmb0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0$1(SelectorModalView selectorModalView) {
        selectorModalView.onSelected.invoke(selectorModalView.currentItem.b);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public olq0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(yrh0.selector_modal_view, parent, false);
        int i = zfh0.done_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = zfh0.picker;
            PickerView pickerView = (PickerView) cma1.O(i, inflate);
            if (pickerView != null) {
                i = zfh0.subtitle;
                ListTextComponent listTextComponent = (ListTextComponent) cma1.O(i, inflate);
                if (listTextComponent != null) {
                    i = zfh0.title;
                    ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                    if (listHeaderComponent != null) {
                        return new olq0((LinearLayout) inflate, buttonComponent, pickerView, listTextComponent, listHeaderComponent);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new nlq0(this, 1));
    }
}
