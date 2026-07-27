package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import l.C4653j;

/* loaded from: classes.dex */
public final class F0 extends C4706p0 {

    /* renamed from: F, reason: collision with root package name */
    public final int f39000F;

    /* renamed from: G, reason: collision with root package name */
    public final int f39001G;

    /* renamed from: H, reason: collision with root package name */
    public C0 f39002H;

    /* renamed from: I, reason: collision with root package name */
    public l.o f39003I;

    public F0(Context context, boolean z3) {
        super(context, z3);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f39000F = 21;
            this.f39001G = 22;
        } else {
            this.f39000F = 22;
            this.f39001G = 21;
        }
    }

    @Override // m.C4706p0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C4653j c4653j;
        int i;
        int pointToPosition;
        int i6;
        if (this.f39002H != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c4653j = (C4653j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c4653j = (C4653j) adapter;
                i = 0;
            }
            l.o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i6 = pointToPosition - i) < 0 || i6 >= c4653j.getCount()) ? null : c4653j.getItem(i6);
            l.o oVar = this.f39003I;
            if (oVar != item) {
                l.m mVar = c4653j.f38797a;
                if (oVar != null) {
                    this.f39002H.c(mVar, oVar);
                }
                this.f39003I = item;
                if (item != null) {
                    this.f39002H.l(mVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f39000F) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f39001G) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C4653j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C4653j) adapter).f38797a.c(false);
        return true;
    }

    public void setHoverListener(C0 c02) {
        this.f39002H = c02;
    }

    @Override // m.C4706p0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
