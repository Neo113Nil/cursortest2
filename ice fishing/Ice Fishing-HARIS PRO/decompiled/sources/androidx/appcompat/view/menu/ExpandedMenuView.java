package androidx.appcompat.view.menu;

import M0.h;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import l.InterfaceC0212A;
import l.InterfaceC0228l;
import l.MenuC0229m;
import l.o;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0228l, InterfaceC0212A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1754b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public MenuC0229m f1755a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        h i = h.i(context, attributeSet, f1754b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) i.f617c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(i.c(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(i.c(1));
        }
        i.l();
    }

    @Override // l.InterfaceC0212A
    public final void a(MenuC0229m menuC0229m) {
        this.f1755a = menuC0229m;
    }

    @Override // l.InterfaceC0228l
    public final boolean b(o oVar) {
        return this.f1755a.q(oVar, null, 0);
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
        b((o) getAdapter().getItem(i));
    }
}
