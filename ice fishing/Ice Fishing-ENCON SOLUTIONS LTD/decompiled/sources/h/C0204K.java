package h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: h.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204K extends AbstractC0229z {

    /* renamed from: n, reason: collision with root package name */
    public final int f3179n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3180o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC0203J f3181p;

    /* renamed from: q, reason: collision with root package name */
    public g.k f3182q;

    public C0204K(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f3179n = 21;
            this.f3180o = 22;
        } else {
            this.f3179n = 22;
            this.f3180o = 21;
        }
    }

    @Override // h.AbstractC0229z, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        g.h hVar;
        int i2;
        int pointToPosition;
        int i3;
        if (this.f3181p != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i2 = headerViewListAdapter.getHeadersCount();
                hVar = (g.h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (g.h) adapter;
                i2 = 0;
            }
            g.k item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i3 = pointToPosition - i2) < 0 || i3 >= hVar.getCount()) ? null : hVar.getItem(i3);
            g.k kVar = this.f3182q;
            if (kVar != item) {
                g.j jVar = hVar.f3044a;
                if (kVar != null) {
                    this.f3181p.b(jVar, kVar);
                }
                this.f3182q = item;
                if (item != null) {
                    this.f3181p.d(jVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f3179n) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f3180o) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ((g.h) getAdapter()).f3044a.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0203J interfaceC0203J) {
        this.f3181p = interfaceC0203J;
    }

    @Override // h.AbstractC0229z, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
