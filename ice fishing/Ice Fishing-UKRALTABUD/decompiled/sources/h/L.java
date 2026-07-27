package h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import g.C0148h;

/* loaded from: classes.dex */
public final class L extends AbstractC0150A {

    /* renamed from: s, reason: collision with root package name */
    public final int f2112s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2113t;

    /* renamed from: u, reason: collision with root package name */
    public K f2114u;

    /* renamed from: v, reason: collision with root package name */
    public g.k f2115v;

    public L(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2112s = 21;
            this.f2113t = 22;
        } else {
            this.f2112s = 22;
            this.f2113t = 21;
        }
    }

    @Override // h.AbstractC0150A, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0148h c0148h;
        int i2;
        int pointToPosition;
        int i3;
        if (this.f2114u != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i2 = headerViewListAdapter.getHeadersCount();
                c0148h = (C0148h) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0148h = (C0148h) adapter;
                i2 = 0;
            }
            g.k item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i3 = pointToPosition - i2) < 0 || i3 >= c0148h.getCount()) ? null : c0148h.getItem(i3);
            g.k kVar = this.f2115v;
            if (kVar != item) {
                g.j jVar = c0148h.f1957f;
                if (kVar != null) {
                    this.f2114u.b(jVar, kVar);
                }
                this.f2115v = item;
                if (item != null) {
                    this.f2114u.q(jVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f2112s) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f2113t) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ((C0148h) getAdapter()).f1957f.c(false);
        return true;
    }

    public void setHoverListener(K k2) {
        this.f2114u = k2;
    }

    @Override // h.AbstractC0150A, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
