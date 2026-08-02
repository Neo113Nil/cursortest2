package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import l.C4664j;

/* loaded from: classes.dex */
public final class F0 extends C4719p0 {

    /* renamed from: F, reason: collision with root package name */
    public final int f39068F;

    /* renamed from: G, reason: collision with root package name */
    public final int f39069G;

    /* renamed from: H, reason: collision with root package name */
    public C0 f39070H;

    /* renamed from: I, reason: collision with root package name */
    public l.o f39071I;

    public F0(Context context, boolean z6) {
        super(context, z6);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f39068F = 21;
            this.f39069G = 22;
        } else {
            this.f39068F = 22;
            this.f39069G = 21;
        }
    }

    @Override // m.C4719p0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C4664j c4664j;
        int i;
        int pointToPosition;
        int i4;
        if (this.f39070H != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c4664j = (C4664j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c4664j = (C4664j) adapter;
                i = 0;
            }
            l.o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i4 = pointToPosition - i) < 0 || i4 >= c4664j.getCount()) ? null : c4664j.getItem(i4);
            l.o oVar = this.f39071I;
            if (oVar != item) {
                l.m mVar = c4664j.f38724a;
                if (oVar != null) {
                    this.f39070H.c(mVar, oVar);
                }
                this.f39071I = item;
                if (item != null) {
                    this.f39070H.p(mVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f39068F) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f39069G) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C4664j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C4664j) adapter).f38724a.c(false);
        return true;
    }

    public void setHoverListener(C0 c02) {
        this.f39070H = c02;
    }

    @Override // m.C4719p0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
