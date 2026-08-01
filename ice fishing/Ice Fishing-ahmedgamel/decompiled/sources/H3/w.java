package H3;

import android.view.View;
import android.widget.AdapterView;
import m.B0;
import m.L;
import m.O;

/* loaded from: classes2.dex */
public final class w implements AdapterView.OnItemClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1208n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1209u;

    public /* synthetic */ w(int i, Object obj) {
        this.f1208n = i;
        this.f1209u = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j6) {
        Object item;
        switch (this.f1208n) {
            case 0:
                y yVar = (y) this.f1209u;
                if (i < 0) {
                    B0 b02 = yVar.f1218x;
                    item = !b02.f38985S.isShowing() ? null : b02.f38988v.getSelectedItem();
                } else {
                    item = yVar.getAdapter().getItem(i);
                }
                y.a(yVar, item);
                AdapterView.OnItemClickListener onItemClickListener = yVar.getOnItemClickListener();
                B0 b03 = yVar.f1218x;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = b03.f38985S.isShowing() ? b03.f38988v.getSelectedView() : null;
                        i = !b03.f38985S.isShowing() ? -1 : b03.f38988v.getSelectedItemPosition();
                        j6 = !b03.f38985S.isShowing() ? Long.MIN_VALUE : b03.f38988v.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(b03.f38988v, view, i, j6);
                }
                b03.dismiss();
                break;
            default:
                L l9 = (L) this.f1209u;
                l9.f39035Z.setSelection(i);
                O o6 = l9.f39035Z;
                if (o6.getOnItemClickListener() != null) {
                    o6.performItemClick(view, i, l9.f39033W.getItemId(i));
                }
                l9.dismiss();
                break;
        }
    }
}
