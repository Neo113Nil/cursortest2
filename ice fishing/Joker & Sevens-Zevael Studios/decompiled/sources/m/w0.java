package m;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w0 implements TextWatcher {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SearchView f4491g;

    public w0(SearchView searchView) {
        this.f4491g = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        SearchView searchView = this.f4491g;
        Editable text = searchView.f449v.getText();
        searchView.f442e0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.t(!isEmpty);
        int i13 = 8;
        if (searchView.f441d0 && !searchView.T && isEmpty) {
            searchView.A.setVisibility(8);
            i13 = 0;
        }
        searchView.C.setVisibility(i13);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
