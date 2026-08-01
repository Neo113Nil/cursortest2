package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import l.C0226j;
import l.MenuC0229m;

/* loaded from: classes.dex */
public final class I0 extends C0276r0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f3834m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3835n;

    /* renamed from: o, reason: collision with root package name */
    public F0 f3836o;

    /* renamed from: p, reason: collision with root package name */
    public l.o f3837p;

    public I0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f3834m = 21;
            this.f3835n = 22;
        } else {
            this.f3834m = 22;
            this.f3835n = 21;
        }
    }

    @Override // m.C0276r0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0226j c0226j;
        int i;
        int pointToPosition;
        int i2;
        if (this.f3836o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c0226j = (C0226j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0226j = (C0226j) adapter;
                i = 0;
            }
            l.o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c0226j.getCount()) ? null : c0226j.getItem(i2);
            l.o oVar = this.f3837p;
            if (oVar != item) {
                MenuC0229m menuC0229m = c0226j.f3703a;
                if (oVar != null) {
                    this.f3836o.e(menuC0229m, oVar);
                }
                this.f3837p = item;
                if (item != null) {
                    this.f3836o.i(menuC0229m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f3834m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f3835n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0226j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0226j) adapter).f3703a.c(false);
        return true;
    }

    public void setHoverListener(F0 f02) {
        this.f3836o = f02;
    }

    @Override // m.C0276r0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
