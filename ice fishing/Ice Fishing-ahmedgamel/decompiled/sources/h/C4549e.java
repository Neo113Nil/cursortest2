package h;

import Q2.C0365j;
import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: h.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4549e implements AdapterView.OnItemClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C4551g f37897n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0365j f37898u;

    public C4549e(C0365j c0365j, C4551g c4551g) {
        this.f37898u = c0365j;
        this.f37897n = c4551g;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j6) {
        C0365j c0365j = this.f37898u;
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) c0365j.f2565C;
        C4551g c4551g = this.f37897n;
        onClickListener.onClick(c4551g.f37900b, i);
        if (c0365j.f2566n) {
            return;
        }
        c4551g.f37900b.dismiss();
    }
}
