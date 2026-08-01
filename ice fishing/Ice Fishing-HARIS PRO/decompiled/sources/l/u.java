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
public abstract class u implements InterfaceC0214C, y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f3769a;

    public static int p(ListAdapter listAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean x(MenuC0229m menuC0229m) {
        int size = menuC0229m.f3713f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuC0229m.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // l.y
    public final void d(Context context, MenuC0229m menuC0229m) {
    }

    @Override // l.y
    public final int f() {
        return 0;
    }

    @Override // l.y
    public final boolean i(o oVar) {
        return false;
    }

    @Override // l.y
    public final boolean k(o oVar) {
        return false;
    }

    public abstract void o(MenuC0229m menuC0229m);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0226j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0226j) listAdapter).f3703a.q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC0223g) ? 0 : 4);
    }

    public abstract void q(View view);

    public abstract void r(boolean z2);

    public abstract void s(int i);

    public abstract void t(int i);

    public abstract void u(PopupWindow.OnDismissListener onDismissListener);

    public abstract void v(boolean z2);

    public abstract void w(int i);
}
