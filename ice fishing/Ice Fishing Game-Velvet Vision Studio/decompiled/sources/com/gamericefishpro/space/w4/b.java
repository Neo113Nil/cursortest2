package com.gamericefishpro.space.w4;

import android.view.ViewGroup;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.ka.a0;
import com.gamericefishpro.space.ph.c0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;

    public b(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.a = container;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final b a(ViewGroup container, a0 fragmentManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        com.gamericefishpro.space.u4.f factory = (com.gamericefishpro.space.u4.f) fragmentManager.i;
        Intrinsics.checkNotNullExpressionValue(factory, "fragmentManager.specialEffectsControllerFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof b) {
            return (b) tag;
        }
        factory.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        b bVar = new b(container);
        Intrinsics.checkNotNullExpressionValue(bVar, "factory.createController(container)");
        container.setTag(R.id.special_effects_controller_view_tag, bVar);
        return bVar;
    }

    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) arrayList.get(i);
            oVar.getClass();
            if (!oVar.a) {
                oVar.a = true;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            ((o) obj).getClass();
            c0.l(arrayList2, null);
        }
        List listL = CollectionsKt.L(CollectionsKt.O(arrayList2));
        int size3 = listL.size();
        for (int i3 = 0; i3 < size3; i3++) {
            n nVar = (n) listL.get(i3);
            nVar.getClass();
            ViewGroup container = this.a;
            Intrinsics.checkNotNullParameter(container, "container");
            if (!nVar.a) {
                nVar.b(container);
            }
            nVar.a = true;
        }
    }
}
