package com.gamericefishpro.space.n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends w0 {
    public final int F;
    public final int G;
    public j1 H;
    public com.gamericefishpro.space.m.j I;

    public m1(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.F = 21;
            this.G = 22;
        } else {
            this.F = 22;
            this.G = 21;
        }
    }

    @Override // com.gamericefishpro.space.n.w0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        com.gamericefishpro.space.m.g gVar;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.H != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                gVar = (com.gamericefishpro.space.m.g) headerViewListAdapter.getWrappedAdapter();
            } else {
                gVar = (com.gamericefishpro.space.m.g) adapter;
                headersCount = 0;
            }
            com.gamericefishpro.space.m.j jVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= gVar.getCount()) ? null : gVar.getItem(i);
            com.gamericefishpro.space.m.j jVar = this.I;
            if (jVar != jVarB) {
                com.gamericefishpro.space.m.i iVar = gVar.a;
                if (jVar != null) {
                    this.H.k(iVar, jVar);
                }
                this.I = jVarB;
                if (jVarB != null) {
                    this.H.f(iVar, jVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.F) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.G) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (com.gamericefishpro.space.m.g) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (com.gamericefishpro.space.m.g) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(j1 j1Var) {
        this.H = j1Var;
    }

    @Override // com.gamericefishpro.space.n.w0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
