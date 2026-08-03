package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f484g;

    public c(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f484g = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f484g;
        if (searchAutoComplete.f456l) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f456l = false;
        }
    }
}
