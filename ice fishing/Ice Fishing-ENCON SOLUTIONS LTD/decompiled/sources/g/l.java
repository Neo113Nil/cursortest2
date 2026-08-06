package g;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class l implements r, p, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f3097a;

    public static int m(ListAdapter listAdapter, Context context, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i3 = 0;
        int i4 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = listAdapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i5, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    public static boolean u(j jVar) {
        int size = jVar.f3056f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = jVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // g.p
    public final boolean f(k kVar) {
        return false;
    }

    @Override // g.p
    public final boolean g(k kVar) {
        return false;
    }

    public abstract void l(j jVar);

    public abstract void n(View view);

    public abstract void o(boolean z2);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (h) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (h) listAdapter).f3044a.p((MenuItem) listAdapter.getItem(i2), this, !(this instanceof g) ? 0 : 4);
    }

    public abstract void p(int i2);

    public abstract void q(int i2);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z2);

    public abstract void t(int i2);

    @Override // g.p
    public final void k(Context context, j jVar) {
    }
}
