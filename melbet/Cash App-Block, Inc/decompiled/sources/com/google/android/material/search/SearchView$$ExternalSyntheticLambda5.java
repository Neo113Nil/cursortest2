package com.google.android.material.search;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsControllerCompat;

/* loaded from: classes4.dex */
public final /* synthetic */ class SearchView$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SearchView f$0;

    public /* synthetic */ SearchView$$ExternalSyntheticLambda5(SearchView searchView, int i) {
        this.$r8$classId = i;
        this.f$0 = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WindowInsetsControllerCompat windowInsetsController;
        int i = this.$r8$classId;
        SearchView searchView = this.f$0;
        switch (i) {
            case 0:
                searchView.show();
                break;
            case 1:
                EditText editText = searchView.editText;
                if (editText.requestFocus()) {
                    editText.sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 2:
                EditText editText2 = searchView.editText;
                if (editText2.requestFocus()) {
                    editText2.sendAccessibilityEvent(8);
                }
                if (searchView.useWindowInsetsController && (windowInsetsController = ViewCompat.getWindowInsetsController(editText2)) != null) {
                    windowInsetsController.mImpl.show(8);
                    break;
                } else {
                    ((InputMethodManager) editText2.getContext().getSystemService(InputMethodManager.class)).showSoftInput(editText2, 1);
                    break;
                }
            default:
                searchView.requestFocusAndShowKeyboardIfNeeded();
                break;
        }
    }
}
