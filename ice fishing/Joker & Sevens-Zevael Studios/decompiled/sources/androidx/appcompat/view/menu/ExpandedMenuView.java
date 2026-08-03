package androidx.appcompat.view.menu;

import a5.c;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import l.g;
import l.i;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements g, AdapterView.OnItemClickListener {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f363g = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        c C = c.C(context, attributeSet, f363g, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) C.f261g;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(C.v(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(C.v(1));
        }
        C.F();
    }

    @Override // l.g
    public final boolean a(i iVar) {
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
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        throw null;
    }
}
