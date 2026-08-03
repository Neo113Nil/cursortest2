package i0;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l extends ViewGroup {

    /* renamed from: g, reason: collision with root package name */
    public final int f2974g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2975h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2976i;

    /* renamed from: j, reason: collision with root package name */
    public final x4.c f2977j;

    /* renamed from: k, reason: collision with root package name */
    public int f2978k;

    public l(Context context) {
        super(context);
        this.f2974g = 5;
        ArrayList arrayList = new ArrayList();
        this.f2975h = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f2976i = arrayList2;
        this.f2977j = new x4.c(4);
        setClipChildren(false);
        n nVar = new n(context);
        addView(nVar);
        arrayList.add(nVar);
        arrayList2.add(nVar);
        this.f2978k = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final n a(m mVar) {
        x4.c cVar = this.f2977j;
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f8290g;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) cVar.f8290g;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) cVar.f8291h;
        n nVar = (n) linkedHashMap.get(mVar);
        if (nVar != null) {
            return nVar;
        }
        ArrayList arrayList = this.f2976i;
        pc.j.e(arrayList, "<this>");
        n nVar2 = (n) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (nVar2 == null) {
            int i10 = this.f2978k;
            ArrayList arrayList2 = this.f2975h;
            if (i10 > bc.n.K(arrayList2)) {
                nVar2 = new n(getContext());
                addView(nVar2);
                arrayList2.add(nVar2);
            } else {
                nVar2 = (n) arrayList2.get(this.f2978k);
                m mVar2 = (m) linkedHashMap3.get(nVar2);
                if (mVar2 != null) {
                    mVar2.S();
                    n nVar3 = (n) linkedHashMap2.get(mVar2);
                    if (nVar3 != null) {
                    }
                    linkedHashMap2.remove(mVar2);
                    nVar2.c();
                }
            }
            int i11 = this.f2978k;
            if (i11 < this.f2974g - 1) {
                this.f2978k = i11 + 1;
            } else {
                this.f2978k = 0;
            }
        }
        linkedHashMap2.put(mVar, nVar2);
        linkedHashMap3.put(nVar2, mVar);
        return nVar2;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
