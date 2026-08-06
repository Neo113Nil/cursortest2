package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class y51 extends android.view.ViewGroup {
    public final defpackage.n80 P05cfTpS5W5L;
    public final java.util.ArrayList QiMR8OkAhezm;
    public final int WDYagTQQm9ns;
    public int e6mdH7fiFuta;
    public final java.util.ArrayList oh71FJcDz6S2;

    public y51(android.content.Context context) {
        super(context);
        this.WDYagTQQm9ns = 5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.oh71FJcDz6S2 = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.QiMR8OkAhezm = arrayList2;
        this.P05cfTpS5W5L = new defpackage.n80(26);
        setClipChildren(false);
        defpackage.z51 z51Var = new defpackage.z51(context);
        addView(z51Var);
        arrayList.add(z51Var);
        arrayList2.add(z51Var);
        this.e6mdH7fiFuta = 1;
        setTag(com.ice.fishing.wolberta.R.id.hide_in_inspector_tag, java.lang.Boolean.TRUE);
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
