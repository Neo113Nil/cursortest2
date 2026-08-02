package defpackage;

import android.view.View;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.search.SearchView;

/* loaded from: classes3.dex */
public final /* synthetic */ class e8p implements xhu, jpj {
    public final /* synthetic */ SearchView a;

    public /* synthetic */ e8p(SearchView searchView) {
        this.a = searchView;
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        SearchView.a(this.a, kqvVar);
        return kqvVar;
    }

    @Override // defpackage.xhu
    public kqv h(View view, kqv kqvVar, weg wegVar) {
        MaterialToolbar materialToolbar = this.a.g;
        boolean z = materialToolbar.getLayoutDirection() == 1;
        int i = z ? wegVar.c : wegVar.a;
        int i2 = z ? wegVar.a : wegVar.c;
        zne g = kqvVar.a.g(647);
        materialToolbar.setPadding(i + g.a, wegVar.b, i2 + g.c, wegVar.d);
        return kqvVar;
    }
}
