package h;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class T implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f3204a;

    public T(SearchView searchView) {
        this.f3204a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        SearchView searchView = this.f3204a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f2141K;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z2);
        }
    }
}
