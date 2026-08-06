package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.combinations.level.experts.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class jv0 extends ViewGroup {
    public final ArrayList AvO7iQsrTN;
    public final ArrayList EljAMC1QTz;
    public final int OOA6hdeuvCS;
    public final d encWxUiV2;
    public int mOu10nynGul;

    public jv0(Context context) {
        super(context);
        this.OOA6hdeuvCS = 5;
        ArrayList arrayList = new ArrayList();
        this.EljAMC1QTz = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.AvO7iQsrTN = arrayList2;
        this.encWxUiV2 = new d(16);
        setClipChildren(false);
        kv0 kv0Var = new kv0(context);
        addView(kv0Var);
        arrayList.add(kv0Var);
        arrayList2.add(kv0Var);
        this.mOu10nynGul = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
