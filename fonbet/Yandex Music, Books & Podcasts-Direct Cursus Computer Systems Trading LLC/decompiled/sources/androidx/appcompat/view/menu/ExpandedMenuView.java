package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.gxh;
import defpackage.hxh;
import defpackage.lum;
import defpackage.nyh;
import defpackage.rxh;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements gxh, nyh, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public hxh a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        lum W = lum.W(context, attributeSet, b, i);
        TypedArray typedArray = (TypedArray) W.b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(W.M(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(W.M(1));
        }
        W.f0();
    }

    @Override // defpackage.gxh
    public final boolean a(rxh rxhVar) {
        return this.a.q(rxhVar, null, 0);
    }

    @Override // defpackage.nyh
    public final void b(hxh hxhVar) {
        this.a = hxhVar;
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
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((rxh) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
