package app.cash.redwood.lazylayout.view;

import android.content.Context;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.ChangeListener;
import app.cash.redwood.widget.Widget;

/* loaded from: classes3.dex */
public final class ViewRefreshableLazyList implements ChangeListener, Widget {
    public final ViewLazyList delegate;
    public final SwipeRefreshLayout swipeRefreshLayout;

    public ViewRefreshableLazyList(Context context) {
        ViewLazyList viewLazyList = new ViewLazyList(context);
        this.delegate = viewLazyList;
        SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(context);
        this.swipeRefreshLayout = swipeRefreshLayout;
        swipeRefreshLayout.addView(viewLazyList.recyclerView);
        swipeRefreshLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.delegate.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.swipeRefreshLayout;
    }

    @Override // app.cash.redwood.widget.ChangeListener
    public final void onEndChanges() {
        this.delegate.onEndChanges();
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        modifier.getClass();
        ViewLazyList viewLazyList = this.delegate;
        viewLazyList.getClass();
        viewLazyList.modifier = modifier;
    }
}
