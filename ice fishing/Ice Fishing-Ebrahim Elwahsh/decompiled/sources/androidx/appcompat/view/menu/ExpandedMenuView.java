package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import l.k;
import l.l;
import l.n;
import l.z;
import m.Q0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements k, z, AdapterView.OnItemClickListener {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f4598u = {R.attr.background, R.attr.divider};

    /* renamed from: n, reason: collision with root package name */
    public l f4599n;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        Q0 p6 = Q0.p(context, attributeSet, f4598u, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) p6.f39326c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(p6.g(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(p6.g(1));
        }
        p6.q();
    }

    @Override // l.k
    public final boolean a(n nVar) {
        return this.f4599n.q(nVar, null, 0);
    }

    @Override // l.z
    public final void c(l lVar) {
        this.f4599n = lVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j9) {
        a((n) getAdapter().getItem(i));
    }
}
