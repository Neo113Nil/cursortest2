package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f1292f;

    public c(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f1292f = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f1292f;
        if (searchAutoComplete.f1209k) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f1209k = false;
        }
    }
}
