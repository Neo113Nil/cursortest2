package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q0 extends e0 {

    /* renamed from: t, reason: collision with root package name */
    public final int f4429t;

    /* renamed from: u, reason: collision with root package name */
    public final int f4430u;

    /* renamed from: v, reason: collision with root package name */
    public p0 f4431v;

    /* renamed from: w, reason: collision with root package name */
    public l.i f4432w;

    public q0(Context context, boolean z10) {
        super(context, z10);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f4429t = 21;
            this.f4430u = 22;
        } else {
            this.f4429t = 22;
            this.f4430u = 21;
        }
    }

    @Override // m.e0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.f fVar;
        int i10;
        int pointToPosition;
        int i11;
        if (this.f4431v != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i10 = headerViewListAdapter.getHeadersCount();
                fVar = (l.f) headerViewListAdapter.getWrappedAdapter();
            } else {
                fVar = (l.f) adapter;
                i10 = 0;
            }
            l.i item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i11 = pointToPosition - i10) < 0 || i11 >= fVar.getCount()) ? null : fVar.getItem(i11);
            l.i iVar = this.f4432w;
            if (iVar != item) {
                l.h hVar = fVar.f3683g;
                if (iVar != null) {
                    this.f4431v.g(hVar, iVar);
                }
                this.f4432w = item;
                if (item != null) {
                    this.f4431v.e(hVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.f4429t) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i10 != this.f4430u) {
            return super.onKeyDown(i10, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (l.f) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (l.f) adapter).f3683g.c(false);
        return true;
    }

    public void setHoverListener(p0 p0Var) {
        this.f4431v = p0Var;
    }

    @Override // m.e0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
