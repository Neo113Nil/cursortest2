package m;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: m.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4765v0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ B0 f39528n;

    public C4765v0(B0 b02) {
        this.f39528n = b02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j9) {
        C4754p0 c4754p0;
        if (i == -1 || (c4754p0 = this.f39528n.f39255v) == null) {
            return;
        }
        c4754p0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
