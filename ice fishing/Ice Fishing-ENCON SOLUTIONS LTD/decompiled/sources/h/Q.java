package h;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class Q implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f3201a;

    public Q(SearchView searchView) {
        this.f3201a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        SearchView searchView = this.f3201a;
        Editable text = searchView.f2157p.getText();
        searchView.f2152d0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.t(!isEmpty);
        int i5 = 8;
        if (searchView.f2151c0 && !searchView.f2144S && isEmpty) {
            searchView.f2161u.setVisibility(8);
            i5 = 0;
        }
        searchView.f2163w.setVisibility(i5);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
