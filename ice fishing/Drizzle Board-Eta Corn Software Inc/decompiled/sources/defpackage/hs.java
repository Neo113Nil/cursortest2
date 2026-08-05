package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class hs implements o70, ps, AdapterView.OnItemClickListener {
    public Rect NCTxEWno;

    public static int lDXGDhIF(ListAdapter listAdapter, Context context, int i) {
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

    public abstract void Ey6iv0m0(PopupWindow.OnDismissListener onDismissListener);

    public abstract void I5GHvsYW(boolean z);

    public abstract void KlHjfFWx(int i);

    @Override // defpackage.ps
    public final boolean MdtA4re8(cs csVar) {
        return false;
    }

    public abstract void OxcuoDLp(boolean z);

    public abstract void RXQxj5Oe(int i);

    public abstract void amk52bBQ(int i);

    @Override // defpackage.ps
    public final boolean b2ZJblxo(cs csVar) {
        return false;
    }

    @Override // defpackage.ps
    public final int getId() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (vr) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (vr) listAdapter).qoPGr6Ce.OxcuoDLp((MenuItem) listAdapter.getItem(i), this, !(this instanceof z3) ? 0 : 4);
    }

    public abstract void sjUBp5pO(View view);

    public abstract void ygLcUYwZ(yr yrVar);

    @Override // defpackage.ps
    public final void Qr9iLBAD(Context context, yr yrVar) {
    }
}
