package J3;

import android.view.View;
import android.widget.AdapterView;
import m.B0;
import m.L;
import m.O;

/* loaded from: classes2.dex */
public final class w implements AdapterView.OnItemClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1564n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1565u;

    public /* synthetic */ w(int i, Object obj) {
        this.f1564n = i;
        this.f1565u = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j6) {
        Object item;
        switch (this.f1564n) {
            case 0:
                y yVar = (y) this.f1565u;
                if (i < 0) {
                    B0 b02 = yVar.f1574x;
                    item = !b02.f39053S.isShowing() ? null : b02.f39056v.getSelectedItem();
                } else {
                    item = yVar.getAdapter().getItem(i);
                }
                y.a(yVar, item);
                AdapterView.OnItemClickListener onItemClickListener = yVar.getOnItemClickListener();
                B0 b03 = yVar.f1574x;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = b03.f39053S.isShowing() ? b03.f39056v.getSelectedView() : null;
                        i = !b03.f39053S.isShowing() ? -1 : b03.f39056v.getSelectedItemPosition();
                        j6 = !b03.f39053S.isShowing() ? Long.MIN_VALUE : b03.f39056v.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(b03.f39056v, view, i, j6);
                }
                b03.dismiss();
                break;
            default:
                L l9 = (L) this.f1565u;
                l9.f39103Z.setSelection(i);
                O o4 = l9.f39103Z;
                if (o4.getOnItemClickListener() != null) {
                    o4.performItemClick(view, i, l9.f39101W.getItemId(i));
                }
                l9.dismiss();
                break;
        }
    }
}
