package F3;

import android.view.View;
import android.widget.AdapterView;
import m.B0;
import m.L;
import m.O;

/* loaded from: classes2.dex */
public final class w implements AdapterView.OnItemClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1121n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1122u;

    public /* synthetic */ w(int i, Object obj) {
        this.f1121n = i;
        this.f1122u = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j9) {
        Object item;
        switch (this.f1121n) {
            case 0:
                y yVar = (y) this.f1122u;
                if (i < 0) {
                    B0 b02 = yVar.f1131x;
                    item = !b02.f39252S.isShowing() ? null : b02.f39255v.getSelectedItem();
                } else {
                    item = yVar.getAdapter().getItem(i);
                }
                y.a(yVar, item);
                AdapterView.OnItemClickListener onItemClickListener = yVar.getOnItemClickListener();
                B0 b03 = yVar.f1131x;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = b03.f39252S.isShowing() ? b03.f39255v.getSelectedView() : null;
                        i = !b03.f39252S.isShowing() ? -1 : b03.f39255v.getSelectedItemPosition();
                        j9 = !b03.f39252S.isShowing() ? Long.MIN_VALUE : b03.f39255v.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(b03.f39255v, view, i, j9);
                }
                b03.dismiss();
                break;
            default:
                L l9 = (L) this.f1122u;
                l9.f39302Z.setSelection(i);
                O o9 = l9.f39302Z;
                if (o9.getOnItemClickListener() != null) {
                    o9.performItemClick(view, i, l9.f39300W.getItemId(i));
                }
                l9.dismiss();
                break;
        }
    }
}
