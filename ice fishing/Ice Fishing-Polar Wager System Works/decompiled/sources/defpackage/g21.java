package defpackage;

/* loaded from: classes.dex */
public final class g21 extends android.view.ViewGroup {
    public final java.util.ArrayList AARZUJiTa;
    public final defpackage.F7NU4MC0GW EXtogiMhuM;
    public final int adDC3e2L;
    public int riuEU0zW4;
    public final java.util.ArrayList xiZrDbcSW0;

    public g21(android.content.Context context) {
        super(context);
        this.adDC3e2L = 5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.xiZrDbcSW0 = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.AARZUJiTa = arrayList2;
        this.EXtogiMhuM = new defpackage.F7NU4MC0GW(21);
        setClipChildren(false);
        defpackage.h21 h21Var = new defpackage.h21(context);
        addView(h21Var);
        arrayList.add(h21Var);
        arrayList2.add(h21Var);
        this.riuEU0zW4 = 1;
        setTag(com.combinations.spin.balbi.R.id.hide_in_inspector_tag, java.lang.Boolean.TRUE);
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
