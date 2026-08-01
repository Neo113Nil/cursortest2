package h;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0164e f3177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0161b f3178b;

    public C0160a(C0161b c0161b, C0164e c0164e) {
        this.f3178b = c0161b;
        this.f3177a = c0164e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0161b c0161b = this.f3178b;
        DialogInterface.OnClickListener onClickListener = c0161b.f3185h;
        C0164e c0164e = this.f3177a;
        onClickListener.onClick(c0164e.f3188b, i);
        if (c0161b.i) {
            return;
        }
        c0164e.f3188b.dismiss();
    }
}
