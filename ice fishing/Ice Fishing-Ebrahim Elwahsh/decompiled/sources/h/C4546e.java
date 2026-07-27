package h;

import N2.C0324j;
import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: h.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4546e implements AdapterView.OnItemClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C4549h f38084n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0324j f38085u;

    public C4546e(C0324j c0324j, C4549h c4549h) {
        this.f38085u = c0324j;
        this.f38084n = c4549h;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j9) {
        C0324j c0324j = this.f38085u;
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) c0324j.f2064C;
        C4549h c4549h = this.f38084n;
        onClickListener.onClick(c4549h.f38089b, i);
        if (c0324j.f2065n) {
            return;
        }
        c4549h.f38089b.dismiss();
    }
}
