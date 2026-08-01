package m;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: m.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288x0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E0 f4056a;

    public C0288x0(E0 e02) {
        this.f4056a = e02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C0276r0 c0276r0;
        if (i == -1 || (c0276r0 = this.f4056a.f3808c) == null) {
            return;
        }
        c0276r0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
