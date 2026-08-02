package ru.yandex.taxi.address.entrances.ui.v1;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.b;
import defpackage.bbe0;
import defpackage.cbe0;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.cph0;
import defpackage.dcc0;
import defpackage.e230;
import defpackage.ej1;
import defpackage.evu0;
import defpackage.k7d0;
import defpackage.kyh0;
import defpackage.nbe0;
import defpackage.nju;
import defpackage.pw0;
import defpackage.qu;
import defpackage.r0d0;
import defpackage.rp31;
import defpackage.sls;
import defpackage.t1w;
import defpackage.w130;
import defpackage.xd2;
import defpackage.xw31;
import defpackage.y4a0;
import defpackage.ych0;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.utils.BaseTextWatcher;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001cB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b \u0010\rJ\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0014¢\u0006\u0004\b,\u0010\u000fJ\u000f\u0010-\u001a\u00020\u000bH\u0014¢\u0006\u0004\b-\u0010\u000fJ\u000f\u0010.\u001a\u00020)H\u0014¢\u0006\u0004\b.\u0010+J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020!H\u0016¢\u0006\u0004\b0\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0016\u00102\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00104R\u0014\u00105\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lru/yandex/taxi/address/entrances/ui/v1/PorchNumberInputModalView;", "Lru/yandex/taxi/widget/ModalView;", "Lcbe0;", "Landroid/content/Context;", "context", "Lnbe0;", "presenter", "<init>", "(Landroid/content/Context;Lnbe0;)V", "", "porchNumber", "Lzy11;", "onPorchNumberChanged", "(Ljava/lang/String;)V", "onKeyboardShown", "()V", "doneClicked", "Lt1w;", "insets", "onInsetsChanged", "(Lt1w;)V", "", "translationY", "animateLayoutInput", "(F)V", "Le230;", "insetsType", "()Le230;", "Lbbe0;", "porchNumberInputListener", "setPorchNumberInputListener", "(Lbbe0;)V", "setInitialPorchNumber", "", "hasWindowFocus", "onWindowFocusChanged", "(Z)V", "", "contentTop", "onModalViewAppear", "(I)V", "Landroid/view/View;", "getFocusedForAccessibilityViewOnAppear", "()Landroid/view/View;", "onAttachedToWindow", "onDetachedFromWindow", "contentView", "isEnabled", "setLetterEnabled", "Lnbe0;", "keyboardIsShown", "Z", "Lbbe0;", "inputLayout", "Landroid/view/View;", "Landroid/widget/TextView;", "done", "Landroid/widget/TextView;", "hint", "Lru/yandex/taxi/widget/KeyboardAwareRobotoEditText;", "input", "Lru/yandex/taxi/widget/KeyboardAwareRobotoEditText;", "Lru/yandex/taxi/utils/BaseTextWatcher;", "inputWatcher", "Lru/yandex/taxi/utils/BaseTextWatcher;", "entrances"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PorchNumberInputModalView extends ModalView implements cbe0 {
    public static final int $stable = 8;
    private final TextView done;
    private final TextView hint;
    private final KeyboardAwareRobotoEditText input;
    private final View inputLayout;
    private final BaseTextWatcher inputWatcher;
    private boolean keyboardIsShown;
    private bbe0 porchNumberInputListener;
    private final nbe0 presenter;

    public PorchNumberInputModalView(Context context, nbe0 nbe0Var) {
        super(context);
        this.presenter = nbe0Var;
        c.q(this, cph0.porch_number_layout, true);
        int i = ych0.input_layout;
        WeakHashMap weakHashMap = b.a;
        this.inputLayout = (View) rp31.d(this, i);
        TextView textView = (TextView) ((View) rp31.d(this, ych0.done));
        this.done = textView;
        this.hint = (TextView) ((View) rp31.d(this, ych0.porch_hint));
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = (KeyboardAwareRobotoEditText) ((View) rp31.d(this, ych0.input));
        this.input = keyboardAwareRobotoEditText;
        c.z(new r0d0(14, this), textView);
        this.inputWatcher = new BaseTextWatcher() { // from class: ru.yandex.taxi.address.entrances.ui.v1.PorchNumberInputModalView.2
            @Override // ru.yandex.taxi.utils.BaseTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                PorchNumberInputModalView.this.onPorchNumberChanged(s.toString());
            }
        };
        keyboardAwareRobotoEditText.setOnCloseListener(new pw0(6, this));
        keyboardAwareRobotoEditText.requestFocus();
        setAnimateOnAppearing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(PorchNumberInputModalView porchNumberInputModalView) {
        porchNumberInputModalView.doneClicked();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(PorchNumberInputModalView porchNumberInputModalView) {
        bbe0 bbe0Var = porchNumberInputModalView.porchNumberInputListener;
        if (bbe0Var != null) {
            ((ej1) ((y4a0) bbe0Var).c).r(new qu(9));
        }
        porchNumberInputModalView.dismiss();
    }

    private final void animateLayoutInput(float translationY) {
        bbe0 bbe0Var;
        cma1.h(translationY, this.inputLayout);
        if (!isEnabled() || (bbe0Var = this.porchNumberInputListener) == null) {
            return;
        }
        ((sls) ((y4a0) bbe0Var).b).invoke();
    }

    private final void doneClicked() {
        bbe0 bbe0Var = this.porchNumberInputListener;
        if (bbe0Var != null) {
            ((ej1) ((y4a0) bbe0Var).c).r(new dcc0(String.valueOf(this.input.getText()), 5));
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(PorchNumberInputModalView porchNumberInputModalView, t1w t1wVar) {
        porchNumberInputModalView.onInsetsChanged(t1wVar);
        return zy11.a;
    }

    private final void onInsetsChanged(t1w insets) {
        float f = insets.g;
        if (this.inputLayout.getHeight() > 0) {
            animateLayoutInput(-f);
        } else {
            xw31.c(this.inputLayout, new nju(this, 1, f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onInsetsChanged$lambda$0(PorchNumberInputModalView porchNumberInputModalView, float f) {
        porchNumberInputModalView.animateLayoutInput(-f);
    }

    private final void onKeyboardShown() {
        if (this.keyboardIsShown) {
            return;
        }
        bbe0 bbe0Var = this.porchNumberInputListener;
        if (bbe0Var != null) {
            ((sls) ((y4a0) bbe0Var).b).invoke();
        }
        this.keyboardIsShown = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPorchNumberChanged(String porchNumber) {
        if (porchNumber == null || evu0.J(porchNumber)) {
            this.hint.setVisibility(0);
            this.done.setText(kyh0.common_close);
        } else {
            this.hint.setVisibility(4);
            this.done.setText(kyh0.common_done);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContent() {
        return this.inputLayout;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public View getFocusedForAccessibilityViewOnAppear() {
        return this.input;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new k7d0(13, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.input.addTextChangedListener(this.inputWatcher);
        nbe0 nbe0Var = this.presenter;
        nbe0Var.Bg(this);
        setLetterEnabled(((Boolean) nbe0Var.w.a.b()).booleanValue());
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.input.removeTextChangedListener(this.inputWatcher);
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.input;
        if (keyboardAwareRobotoEditText != null) {
            keyboardAwareRobotoEditText.post(new ce0(keyboardAwareRobotoEditText, 15));
        }
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        this.input.requestFocus();
        onKeyboardShown();
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.input;
        if (keyboardAwareRobotoEditText == null) {
            return;
        }
        keyboardAwareRobotoEditText.post(new xd2(keyboardAwareRobotoEditText, 1));
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        if (hasWindowFocus && isFocused()) {
            post(new xd2(this, 1));
        }
        requestFocus();
    }

    public final void setInitialPorchNumber(String porchNumber) {
        onPorchNumberChanged(porchNumber);
        this.input.setText(porchNumber);
    }

    @Override // defpackage.cbe0
    public void setLetterEnabled(boolean isEnabled) {
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.input;
        if (isEnabled) {
            keyboardAwareRobotoEditText.setInputType(4096);
        } else {
            keyboardAwareRobotoEditText.setInputType(2);
        }
    }

    public final void setPorchNumberInputListener(bbe0 porchNumberInputListener) {
        this.porchNumberInputListener = porchNumberInputListener;
    }
}
