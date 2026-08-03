package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b1 implements AdapterView.OnItemClickListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SearchView f4275g;

    public b1(SearchView searchView) {
        this.f4275g = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        this.f4275g.l(i10);
    }
}
