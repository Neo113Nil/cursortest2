package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.places.internal.zznv;

/* loaded from: classes4.dex */
public final class zzl implements View.OnFocusChangeListener {
    public final /* synthetic */ int $r8$classId;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                try {
                    InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
                    if (inputMethodManager == null) {
                        return;
                    }
                    if (z) {
                        inputMethodManager.showSoftInput(view, 1);
                        return;
                    } else {
                        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                        return;
                    }
                } catch (Error | RuntimeException e) {
                    zznv.zzb(e);
                    throw e;
                }
            default:
                try {
                    InputMethodManager inputMethodManager2 = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
                    if (inputMethodManager2 == null) {
                        return;
                    }
                    if (z) {
                        inputMethodManager2.showSoftInput(view, 1);
                        return;
                    } else {
                        inputMethodManager2.hideSoftInputFromWindow(view.getWindowToken(), 0);
                        return;
                    }
                } catch (Error | RuntimeException e2) {
                    zznv.zzb(e2);
                    throw e2;
                }
        }
    }
}
