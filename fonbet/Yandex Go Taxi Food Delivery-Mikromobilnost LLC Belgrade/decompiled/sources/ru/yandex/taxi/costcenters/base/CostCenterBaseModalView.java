package ru.yandex.taxi.costcenters.base;

import android.content.Context;
import defpackage.c230;
import defpackage.d1;
import defpackage.e230;
import defpackage.ewe;
import defpackage.mqg0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH$¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000f2\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0018\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/costcenters/base/CostCenterBaseModalView;", "Lru/yandex/taxi/widget/ModalView;", "Lewe;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Le230;", "insetsType", "()Le230;", "Lru/yandex/taxi/design/ButtonComponent;", "doneButton", "()Lru/yandex/taxi/design/ButtonComponent;", "", "isEnabled", "Lzy11;", "enableDoneButton", "(Z)V", "Ljava/lang/Runnable;", "onAnimationEnd", "dismissInternal", "(Ljava/lang/Runnable;)V", "", "buttonText", "setButtonText", "(I)V", "", "(Ljava/lang/CharSequence;)V", "onModalDismiss", "Ljava/lang/Runnable;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CostCenterBaseModalView extends ModalView implements ewe {
    private Runnable onModalDismiss;

    public CostCenterBaseModalView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissInternal$lambda$0(Runnable runnable, Runnable runnable2, CostCenterBaseModalView costCenterBaseModalView) {
        runnable.run();
        runnable2.run();
        costCenterBaseModalView.onModalDismiss = null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void dismissInternal(Runnable onAnimationEnd) {
        Runnable runnable = this.onModalDismiss;
        if (runnable != null) {
            onAnimationEnd = new d1(24, onAnimationEnd, runnable, this);
        }
        super.dismissInternal(onAnimationEnd);
    }

    /* renamed from: doneButton */
    public abstract ButtonComponent getDoneButton();

    @Override // defpackage.ewe
    public void enableDoneButton(boolean isEnabled) {
        getDoneButton().setEnabled(isEnabled);
        getDoneButton().setButtonBackground(getContext().getColor(isEnabled ? mqg0.component_accent_color : mqg0.component_gray_100));
        getDoneButton().setButtonTitleColor(getContext().getColor(isEnabled ? mqg0.accent_background_text_color : mqg0.component_black));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(true);
    }

    public void setButtonText(int buttonText) {
        getDoneButton().setText(buttonText);
    }

    @Override // defpackage.ewe
    public abstract /* synthetic */ void setTitle(String str);

    @Override // defpackage.ewe
    public void setButtonText(CharSequence buttonText) {
        getDoneButton().setText(buttonText);
    }
}
