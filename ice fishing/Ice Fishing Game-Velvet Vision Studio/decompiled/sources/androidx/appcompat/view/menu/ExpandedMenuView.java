package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.gamericefishpro.space.a8.c;
import com.gamericefishpro.space.m.h;
import com.gamericefishpro.space.m.j;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements h, AdapterView.OnItemClickListener {
    public static final int[] d = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        c cVarT = c.t(context, attributeSet, d, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) cVarT.i;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(cVarT.l(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(cVarT.l(1));
        }
        cVarT.u();
    }

    @Override // com.gamericefishpro.space.m.h
    public final boolean b(j jVar) {
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
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        throw null;
    }
}
