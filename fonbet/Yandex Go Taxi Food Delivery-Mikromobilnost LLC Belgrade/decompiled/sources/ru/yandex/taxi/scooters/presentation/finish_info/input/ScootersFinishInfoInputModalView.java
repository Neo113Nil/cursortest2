package ru.yandex.taxi.scooters.presentation.finish_info.input;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.ajl0;
import defpackage.c230;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.e230;
import defpackage.ehn0;
import defpackage.nmn0;
import defpackage.ny61;
import defpackage.pfh0;
import defpackage.qrh0;
import defpackage.tls;
import defpackage.xd2;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.scooters.presentation.finish_info.input.ScootersFinishInfoInputModalView;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001b\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/scooters/presentation/finish_info/input/ScootersFinishInfoInputModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lnmn0;", "Landroid/content/Context;", "context", "", "currentText", "Lkotlin/Function1;", "Lzy11;", "onInputFinished", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ltls;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lnmn0;", "onAttachedToWindow", "()V", "", "contentTop", "onModalViewAppear", "(I)V", "onModalViewDisappear", "Ljava/lang/String;", "Ltls;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersFinishInfoInputModalView extends SlideableBindingModalView<nmn0> {
    public static final int $stable = 8;
    private final String currentText;
    private final tls onInputFinished;

    public ScootersFinishInfoInputModalView(Context context, String str, tls tlsVar) {
        super(context);
        this.currentText = str;
        this.onInputFinished = tlsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(ScootersFinishInfoInputModalView scootersFinishInfoInputModalView) {
        return scootersFinishInfoInputModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ScootersFinishInfoInputModalView scootersFinishInfoInputModalView) {
        scootersFinishInfoInputModalView.onInputFinished.invoke(String.valueOf(scootersFinishInfoInputModalView.getBinding().b.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1$1(ScootersFinishInfoInputModalView scootersFinishInfoInputModalView, nmn0 nmn0Var) {
        scootersFinishInfoInputModalView.onInputFinished.invoke(String.valueOf(nmn0Var.b.getText()));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public nmn0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(qrh0.scooters_finish_info_input_modal_view, parent, false);
        int i = pfh0.comment_input;
        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) cma1.O(i, inflate);
        if (listItemInputComponent != null) {
            i = pfh0.comment_input_title;
            if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                i = pfh0.done_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    return new nmn0((GoLinearLayout) inflate, listItemInputComponent, buttonComponent);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new ehn0(4, this), true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final int i = 0;
        setOnTouchOutsideListener(new Runnable(this) { // from class: mmn0
            public final /* synthetic */ ScootersFinishInfoInputModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ScootersFinishInfoInputModalView scootersFinishInfoInputModalView = this.b;
                switch (i2) {
                    case 0:
                        ScootersFinishInfoInputModalView.onAttachedToWindow$lambda$0(scootersFinishInfoInputModalView);
                        break;
                    default:
                        scootersFinishInfoInputModalView.onBackPressed();
                        break;
                }
            }
        });
        nmn0 binding = getBinding();
        final int i2 = 1;
        binding.b.setOnKeyboardCloseListener(new Runnable(this) { // from class: mmn0
            public final /* synthetic */ ScootersFinishInfoInputModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ScootersFinishInfoInputModalView scootersFinishInfoInputModalView = this.b;
                switch (i22) {
                    case 0:
                        ScootersFinishInfoInputModalView.onAttachedToWindow$lambda$0(scootersFinishInfoInputModalView);
                        break;
                    default:
                        scootersFinishInfoInputModalView.onBackPressed();
                        break;
                }
            }
        });
        KeyboardAwareRobotoEditText input = binding.b.getInput();
        input.setText(this.currentText);
        input.setCursorVisible(true);
        input.setSelection(this.currentText.length());
        binding.c.setDebounceClickListener(new ajl0(22, this, binding));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        KeyboardAwareRobotoEditText input = getBinding().b.getInput();
        input.requestFocus();
        input.sendAccessibilityEvent(8);
        input.post(new xd2(input, 1));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        KeyboardAwareRobotoEditText input = getBinding().b.getInput();
        if (input != null) {
            input.post(new ce0(input, 15));
        }
        super.onModalViewDisappear();
    }
}
