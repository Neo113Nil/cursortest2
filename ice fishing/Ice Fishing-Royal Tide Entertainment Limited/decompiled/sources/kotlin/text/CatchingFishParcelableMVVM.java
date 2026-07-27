package kotlin.text;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class CatchingFishParcelableMVVM extends CatchingFishAndroidX {
    public final TextInputLayout CatchingFishReduxKtor;

    public CatchingFishParcelableMVVM(TextInputLayout textInputLayout) {
        this.CatchingFishReduxKtor = textInputLayout;
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final void CatchingFishDaggerWebsocket(View view, AccessibilityEvent accessibilityEvent) {
        super.CatchingFishDaggerWebsocket(view, accessibilityEvent);
        this.CatchingFishReduxKtor.CatchingFishWorkManager.CatchingFishSnackbar().CatchingFishAnimationMockk(accessibilityEvent);
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final void CatchingFishReduxKtor(View view, CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit) {
        AccessibilityNodeInfo accessibilityNodeInfo = catchingFishViewJUnitJUnit.CatchingFishParcelableFAB;
        this.CatchingFishParcelableFAB.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.CatchingFishReduxKtor;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.CatchingFishWebSocketMockk;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        CatchingFishViewMVIMVIToast catchingFishViewMVIMVIToast = textInputLayout.CatchingFishDaggerWebsocket;
        CatchingFishDataStoreBundle catchingFishDataStoreBundle = catchingFishViewMVIMVIToast.CatchingFishDaggerWebsocket;
        if (catchingFishDataStoreBundle.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(catchingFishDataStoreBundle);
            accessibilityNodeInfo.setTraversalAfter(catchingFishDataStoreBundle);
        } else {
            accessibilityNodeInfo.setTraversalAfter(catchingFishViewMVIMVIToast.CatchingFishViewModelScope);
        }
        if (!isEmpty) {
            catchingFishViewJUnitJUnit.CatchingFishCloudMessaging(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            catchingFishViewJUnitJUnit.CatchingFishCloudMessaging(charSequence);
            if (!z && placeholderText != null) {
                catchingFishViewJUnitJUnit.CatchingFishCloudMessaging(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            catchingFishViewJUnitJUnit.CatchingFishCloudMessaging(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                if (!isEmpty) {
                    charSequence = ((Object) text) + ", " + charSequence;
                }
                catchingFishViewJUnitJUnit.CatchingFishCloudMessaging(charSequence);
            } else if (i >= 26) {
                accessibilityNodeInfo.setHintText(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                catchingFishViewJUnitJUnit.CatchingFishViewModelFAB(4, isEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        CatchingFishDataStoreBundle catchingFishDataStoreBundle2 = textInputLayout.CatchingFishUnitTesting.CatchingFishGsonAppCompat;
        if (catchingFishDataStoreBundle2 != null) {
            accessibilityNodeInfo.setLabelFor(catchingFishDataStoreBundle2);
        }
        textInputLayout.CatchingFishWorkManager.CatchingFishSnackbar().CatchingFishUnitTesting(catchingFishViewJUnitJUnit);
    }
}
