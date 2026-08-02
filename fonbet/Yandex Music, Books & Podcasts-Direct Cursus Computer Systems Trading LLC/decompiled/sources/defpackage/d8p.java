package defpackage;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.material.search.SearchView;

/* loaded from: classes3.dex */
public final /* synthetic */ class d8p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ d8p(SearchView searchView, int i) {
        this.a = i;
        this.b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pqv j;
        pqv j2;
        switch (this.a) {
            case 0:
                SearchView searchView = this.b;
                EditText editText = searchView.k;
                if (editText.requestFocus()) {
                    editText.sendAccessibilityEvent(8);
                }
                if (searchView.A && (j = wdu.j(editText)) != null) {
                    j.a.m0(8);
                    break;
                } else {
                    ((InputMethodManager) editText.getContext().getSystemService(InputMethodManager.class)).showSoftInput(editText, 1);
                    break;
                }
                break;
            case 1:
                this.b.h();
                break;
            case 2:
                SearchView searchView2 = this.b;
                EditText editText2 = searchView2.k;
                editText2.clearFocus();
                if (searchView2.A && (j2 = wdu.j(editText2)) != null) {
                    j2.a.b0(8);
                    break;
                } else {
                    InputMethodManager inputMethodManager = (InputMethodManager) editText2.getContext().getSystemService(InputMethodManager.class);
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(editText2.getWindowToken(), 0);
                        break;
                    }
                }
                break;
            default:
                this.b.f();
                break;
        }
    }
}
