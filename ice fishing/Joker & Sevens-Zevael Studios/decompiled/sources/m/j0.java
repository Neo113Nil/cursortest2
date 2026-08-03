package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4360g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4361h;

    public /* synthetic */ j0(int i10, Object obj) {
        this.f4360g = i10;
        this.f4361h = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j3) {
        q0 q0Var;
        switch (this.f4360g) {
            case 0:
                if (i10 != -1 && (q0Var = ((o0) this.f4361h).f4402i) != null) {
                    q0Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f4361h).m(i10);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i10 = this.f4360g;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
