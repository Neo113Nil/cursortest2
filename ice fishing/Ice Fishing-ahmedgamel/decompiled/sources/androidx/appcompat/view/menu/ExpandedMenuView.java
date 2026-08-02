package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import l.InterfaceC4650A;
import l.l;
import l.m;
import l.o;
import l4.g;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements l, InterfaceC4650A, AdapterView.OnItemClickListener {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f4451u = {R.attr.background, R.attr.divider};

    /* renamed from: n, reason: collision with root package name */
    public m f4452n;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        g s9 = g.s(context, attributeSet, f4451u, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) s9.f38917v;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(s9.i(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(s9.i(1));
        }
        s9.t();
    }

    @Override // l.l
    public final boolean a(o oVar) {
        return this.f4452n.q(oVar, null, 0);
    }

    @Override // l.InterfaceC4650A
    public final void c(m mVar) {
        this.f4452n = mVar;
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
    public final void onItemClick(AdapterView adapterView, View view, int i, long j6) {
        a((o) getAdapter().getItem(i));
    }
}
