package androidx.appcompat.view.menu;

import L.C0051b;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import g.i;
import g.k;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements i, AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1088f = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0051b E2 = C0051b.E(context, attributeSet, f1088f, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) E2.f602g;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(E2.x(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(E2.x(1));
        }
        E2.H();
    }

    @Override // g.i
    public final boolean a(k kVar) {
        throw null;
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
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        throw null;
    }
}
