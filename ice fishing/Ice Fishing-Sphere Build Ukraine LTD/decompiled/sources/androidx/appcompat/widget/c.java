package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f1300e;

    public c(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f1300e = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f1300e;
        if (searchAutoComplete.f1217j) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f1217j = false;
        }
    }
}
