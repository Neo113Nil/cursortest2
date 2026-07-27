package h;

import O2.C0360j;
import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: h.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4545e implements AdapterView.OnItemClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C4547g f37871n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0360j f37872u;

    public C4545e(C0360j c0360j, C4547g c4547g) {
        this.f37872u = c0360j;
        this.f37871n = c4547g;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j6) {
        C0360j c0360j = this.f37872u;
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) c0360j.f2247C;
        C4547g c4547g = this.f37871n;
        onClickListener.onClick(c4547g.f37874b, i);
        if (c0360j.f2248n) {
            return;
        }
        c4547g.f37874b.dismiss();
    }
}
