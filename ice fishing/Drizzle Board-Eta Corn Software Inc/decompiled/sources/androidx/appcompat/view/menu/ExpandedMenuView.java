package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.cs;
import defpackage.f0;
import defpackage.rs;
import defpackage.xr;
import defpackage.yr;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements xr, rs, AdapterView.OnItemClickListener {
    public static final int[] MdtA4re8 = {R.attr.background, R.attr.divider};
    public yr NCTxEWno;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        f0 Mq3SeTnW = f0.Mq3SeTnW(context, attributeSet, MdtA4re8, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) Mq3SeTnW.MdtA4re8;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(Mq3SeTnW.OxcuoDLp(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(Mq3SeTnW.OxcuoDLp(1));
        }
        Mq3SeTnW.SgZGMMPL();
    }

    @Override // defpackage.rs
    public final void NCTxEWno(yr yrVar) {
        this.NCTxEWno = yrVar;
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
        qoPGr6Ce((cs) getAdapter().getItem(i));
    }

    @Override // defpackage.xr
    public final boolean qoPGr6Ce(cs csVar) {
        return this.NCTxEWno.OxcuoDLp(csVar, null, 0);
    }
}
