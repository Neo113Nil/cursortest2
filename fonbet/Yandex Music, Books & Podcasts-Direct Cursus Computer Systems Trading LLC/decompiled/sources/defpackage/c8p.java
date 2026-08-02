package defpackage;

import android.view.View;
import com.google.android.material.search.SearchView;

/* loaded from: classes3.dex */
public final /* synthetic */ class c8p implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ c8p(SearchView searchView, int i) {
        this.a = i;
        this.b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        SearchView searchView = this.b;
        switch (i) {
            case 0:
                searchView.k.setText("");
                searchView.f();
                break;
            case 1:
                int i2 = SearchView.E;
                searchView.h();
                break;
            default:
                int i3 = SearchView.E;
                searchView.c();
                break;
        }
    }
}
