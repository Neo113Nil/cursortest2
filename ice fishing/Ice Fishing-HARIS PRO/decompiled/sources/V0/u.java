package V0;

import android.view.View;
import android.widget.AdapterView;
import androidx.fragment.app.ListFragment;
import m.E0;
import m.N;
import m.Q;

/* loaded from: classes.dex */
public final class u implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1353b;

    public /* synthetic */ u(int i, Object obj) {
        this.f1352a = i;
        this.f1353b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        switch (this.f1352a) {
            case 0:
                w wVar = (w) this.f1353b;
                if (i < 0) {
                    E0 e02 = wVar.e;
                    item = !e02.f3828z.isShowing() ? null : e02.f3808c.getSelectedItem();
                } else {
                    item = wVar.getAdapter().getItem(i);
                }
                w.a(wVar, item);
                AdapterView.OnItemClickListener onItemClickListener = wVar.getOnItemClickListener();
                E0 e03 = wVar.e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = e03.f3828z.isShowing() ? e03.f3808c.getSelectedView() : null;
                        i = !e03.f3828z.isShowing() ? -1 : e03.f3808c.getSelectedItemPosition();
                        j = !e03.f3828z.isShowing() ? Long.MIN_VALUE : e03.f3808c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(e03.f3808c, view, i, j);
                }
                e03.dismiss();
                break;
            case 1:
                ((ListFragment) this.f1353b).getClass();
                break;
            default:
                N n2 = (N) this.f1353b;
                n2.f3859G.setSelection(i);
                Q q2 = n2.f3859G;
                if (q2.getOnItemClickListener() != null) {
                    q2.performItemClick(view, i, n2.f3856D.getItemId(i));
                }
                n2.dismiss();
                break;
        }
    }
}
