package androidx.appcompat.view.menu;

import I0.b;
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

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2050a = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        b H2 = b.H(context, attributeSet, f2050a, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) H2.f722c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(H2.A(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(H2.A(1));
        }
        H2.K();
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
