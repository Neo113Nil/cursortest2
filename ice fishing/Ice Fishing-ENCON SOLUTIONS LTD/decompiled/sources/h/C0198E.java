package h;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: h.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198E implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3151b;

    public /* synthetic */ C0198E(int i2, Object obj) {
        this.f3150a = i2;
        this.f3151b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        C0204K c0204k;
        switch (this.f3150a) {
            case 0:
                if (i2 != -1 && (c0204k = ((AbstractC0202I) this.f3151b).f3160c) != null) {
                    c0204k.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f3151b).m(i2);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i2 = this.f3150a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
