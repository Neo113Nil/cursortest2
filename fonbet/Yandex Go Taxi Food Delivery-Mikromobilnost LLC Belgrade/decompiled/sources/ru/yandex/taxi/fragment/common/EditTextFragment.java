package ru.yandex.taxi.fragment.common;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import defpackage.ce0;
import defpackage.jcs;
import defpackage.uhm;
import kotlin.Metadata;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.widget.dialog.BaseDialog;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u001b\u0010\u0010\u001a\u00020\u00072\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/fragment/common/EditTextFragment;", "T", "Ljcs;", "F", "Lru/yandex/taxi/fragment/YandexTaxiFragment;", "<init>", "()V", "Lzy11;", "startShowKeyboardRunnable", "showKeyboard", "onStart", "onStop", "hideKeyboard", "onDialogDismissed", "Lru/yandex/taxi/widget/dialog/BaseDialog;", "dialog", "showDialog", "(Lru/yandex/taxi/widget/dialog/BaseDialog;)V", "Ljava/lang/Runnable;", "showKeyboardRunnable", "Ljava/lang/Runnable;", "Landroid/widget/EditText;", "getAutofocusView", "()Landroid/widget/EditText;", "autofocusView", "fragment"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EditTextFragment<T, F extends jcs> extends YandexTaxiFragment<T, F> {
    private final Runnable showKeyboardRunnable = new uhm(13, this);

    /* JADX INFO: Access modifiers changed from: private */
    public final void showKeyboard() {
        EditText autofocusView;
        FragmentActivity activity = getActivity();
        if (activity == null || (autofocusView = getAutofocusView()) == null || !autofocusView.requestFocus()) {
            return;
        }
        ((InputMethodManager) activity.getSystemService("input_method")).showSoftInput(autofocusView.findFocus(), 1);
    }

    private final void startShowKeyboardRunnable() {
        EditText autofocusView = getAutofocusView();
        View view = getView();
        if (autofocusView == null || view == null) {
            return;
        }
        view.postDelayed(this.showKeyboardRunnable, 300L);
        autofocusView.selectAll();
    }

    public abstract EditText getAutofocusView();

    public final void hideKeyboard() {
        View currentFocus = requireActivity().getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.removeCallbacks(this.showKeyboardRunnable);
            currentFocus.post(new ce0(currentFocus, 15));
        }
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment
    public void onDialogDismissed() {
        super.onDialogDismissed();
        startShowKeyboardRunnable();
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (hasDialog()) {
            return;
        }
        startShowKeyboardRunnable();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        hideKeyboard();
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment
    public void showDialog(BaseDialog<?> dialog) {
        super.showDialog(dialog);
        hideKeyboard();
    }
}
