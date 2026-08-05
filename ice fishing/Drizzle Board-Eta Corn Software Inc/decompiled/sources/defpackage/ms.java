package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ms extends fe {
    public cs OxcuoDLp;
    public final int lDXGDhIF;
    public bs sjUBp5pO;
    public final int ygLcUYwZ;

    public ms(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.ygLcUYwZ = 21;
            this.lDXGDhIF = 22;
        } else {
            this.ygLcUYwZ = 22;
            this.lDXGDhIF = 21;
        }
    }

    @Override // defpackage.fe, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        vr vrVar;
        int i;
        int pointToPosition;
        int i2;
        if (this.sjUBp5pO != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                vrVar = (vr) headerViewListAdapter.getWrappedAdapter();
            } else {
                vrVar = (vr) adapter;
                i = 0;
            }
            cs item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= vrVar.getCount()) ? null : vrVar.getItem(i2);
            cs csVar = this.OxcuoDLp;
            if (csVar != item) {
                yr yrVar = vrVar.qoPGr6Ce;
                if (csVar != null) {
                    this.sjUBp5pO.Qr9iLBAD(yrVar, csVar);
                }
                this.OxcuoDLp = item;
                if (item != null) {
                    this.sjUBp5pO.eVhOlqcC(yrVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.ygLcUYwZ) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.lDXGDhIF) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (vr) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (vr) adapter).qoPGr6Ce.MdtA4re8(false);
        return true;
    }

    public void setHoverListener(bs bsVar) {
        this.sjUBp5pO = bsVar;
    }

    @Override // defpackage.fe, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
