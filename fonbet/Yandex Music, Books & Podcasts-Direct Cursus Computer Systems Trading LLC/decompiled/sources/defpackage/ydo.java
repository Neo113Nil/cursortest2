package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class ydo extends ViewGroup {
    public final int a;
    public final ArrayList b;
    public final ArrayList c;
    public final aeo d;
    public int e;

    public ydo(@NotNull Context context) {
        super(context);
        this.a = 5;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.d = new aeo(0);
        setClipChildren(false);
        beo beoVar = new beo(context);
        addView(beoVar);
        arrayList.add(beoVar);
        arrayList2.add(beoVar);
        this.e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final beo a(zdo zdoVar) {
        aeo aeoVar = this.d;
        LinkedHashMap linkedHashMap = aeoVar.a;
        LinkedHashMap linkedHashMap2 = aeoVar.a;
        LinkedHashMap linkedHashMap3 = aeoVar.b;
        beo beoVar = (beo) linkedHashMap.get(zdoVar);
        if (beoVar != null) {
            return beoVar;
        }
        ArrayList arrayList = this.c;
        arrayList.getClass();
        beo beoVar2 = (beo) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (beoVar2 == null) {
            int i = this.e;
            ArrayList arrayList2 = this.b;
            if (i > u75.g(arrayList2)) {
                beoVar2 = new beo(getContext());
                addView(beoVar2);
                arrayList2.add(beoVar2);
            } else {
                beoVar2 = (beo) arrayList2.get(this.e);
                zdo zdoVar2 = (zdo) linkedHashMap3.get(beoVar2);
                if (zdoVar2 != null) {
                    zdoVar2.a0();
                    beo beoVar3 = (beo) linkedHashMap2.get(zdoVar2);
                    if (beoVar3 != null) {
                    }
                    linkedHashMap2.remove(zdoVar2);
                    beoVar2.c();
                }
            }
            int i2 = this.e;
            if (i2 < this.a - 1) {
                this.e = i2 + 1;
            } else {
                this.e = 0;
            }
        }
        linkedHashMap2.put(zdoVar, beoVar2);
        linkedHashMap3.put(beoVar2, zdoVar);
        return beoVar2;
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
