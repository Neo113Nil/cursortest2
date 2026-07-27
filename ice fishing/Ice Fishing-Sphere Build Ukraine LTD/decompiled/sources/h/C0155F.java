package h;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: h.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155F implements AdapterView.OnItemSelectedListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2093f;

    public /* synthetic */ C0155F(int i2, Object obj) {
        this.f2092e = i2;
        this.f2093f = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        L l2;
        switch (this.f2092e) {
            case 0:
                if (i2 != -1 && (l2 = ((J) this.f2093f).f2102g) != null) {
                    l2.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f2093f).m(i2);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i2 = this.f2092e;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
