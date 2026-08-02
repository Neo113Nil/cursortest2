package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public class dyh extends nra {
    public final int m;
    public final int n;
    public pxh o;
    public rxh p;

    public dyh(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.m = 21;
            this.n = 22;
        } else {
            this.m = 22;
            this.n = 21;
        }
    }

    @Override // defpackage.nra, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        dxh dxhVar;
        int i;
        int pointToPosition;
        int i2;
        if (this.o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                dxhVar = (dxh) headerViewListAdapter.getWrappedAdapter();
            } else {
                dxhVar = (dxh) adapter;
                i = 0;
            }
            rxh item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= dxhVar.getCount()) ? null : dxhVar.getItem(i2);
            rxh rxhVar = this.p;
            if (rxhVar != item) {
                hxh hxhVar = dxhVar.a;
                if (rxhVar != null) {
                    this.o.c(hxhVar, rxhVar);
                }
                this.p = item;
                if (item != null) {
                    this.o.m(hxhVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (dxh) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (dxh) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(pxh pxhVar) {
        this.o = pxhVar;
    }

    @Override // defpackage.nra, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
