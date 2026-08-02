package l;

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
public abstract class u implements InterfaceC4652C, y, AdapterView.OnItemClickListener {

    /* renamed from: n, reason: collision with root package name */
    public Rect f38795n;

    public static int l(ListAdapter listAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i4 = 0;
        int i6 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = listAdapter.getItemViewType(i9);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i9, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
        }
        return i4;
    }

    public static boolean t(m mVar) {
        int size = mVar.f38752y.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = mVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // l.y
    public final boolean c(o oVar) {
        return false;
    }

    @Override // l.y
    public final boolean j(o oVar) {
        return false;
    }

    public abstract void k(m mVar);

    public abstract void m(View view);

    public abstract void n(boolean z6);

    public abstract void o(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j6) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C4664j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C4664j) listAdapter).f38724a.q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC4661g) ? 0 : 4);
    }

    public abstract void p(int i);

    public abstract void q(PopupWindow.OnDismissListener onDismissListener);

    public abstract void r(boolean z6);

    public abstract void s(int i);

    @Override // l.y
    public final void h(Context context, m mVar) {
    }
}
