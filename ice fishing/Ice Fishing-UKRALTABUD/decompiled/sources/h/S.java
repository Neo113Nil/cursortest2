package h;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class S implements TextWatcher {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SearchView f2134f;

    public S(SearchView searchView) {
        this.f2134f = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        SearchView searchView = this.f2134f;
        Editable text = searchView.f1201u.getText();
        searchView.f1195d0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.t(!isEmpty);
        int i5 = 8;
        if (searchView.f1194c0 && !searchView.f1188S && isEmpty) {
            searchView.f1206z.setVisibility(8);
            i5 = 0;
        }
        searchView.f1171B.setVisibility(i5);
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
