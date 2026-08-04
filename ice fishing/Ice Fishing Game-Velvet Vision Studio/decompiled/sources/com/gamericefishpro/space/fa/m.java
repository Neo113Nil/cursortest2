package com.gamericefishpro.space.fa;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d4.d0;
import com.gamericefishpro.space.d4.l0;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Comparator {
    public static final /* synthetic */ m b = new m(2);
    public final /* synthetic */ int a;

    public /* synthetic */ m(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                return ((com.gamericefishpro.space.i3.f) obj).e - ((com.gamericefishpro.space.i3.f) obj2).e;
            case 2:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 3:
                Field field = l0.a;
                float f = d0.f((View) obj);
                float f2 = d0.f((View) obj2);
                if (f > f2) {
                    return -1;
                }
                return f < f2 ? 1 : 0;
            case 4:
                com.gamericefishpro.space.r5.k kVar = (com.gamericefishpro.space.r5.k) obj;
                com.gamericefishpro.space.r5.k kVar2 = (com.gamericefishpro.space.r5.k) obj2;
                RecyclerView recyclerView = kVar.d;
                if ((recyclerView == null) == (kVar2.d == null)) {
                    boolean z = kVar.a;
                    if (z == kVar2.a) {
                        int i = kVar2.b - kVar.b;
                        if (i != 0) {
                            return i;
                        }
                        int i2 = kVar.c - kVar2.c;
                        if (i2 != 0) {
                            return i2;
                        }
                        return 0;
                    }
                    if (!z) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return com.gamericefishpro.space.rh.a.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return com.gamericefishpro.space.rh.a.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return com.gamericefishpro.space.rh.a.a(((com.gamericefishpro.space.y5.f) obj).a, ((com.gamericefishpro.space.y5.f) obj2).a);
            default:
                return com.gamericefishpro.space.rh.a.a(((com.gamericefishpro.space.y5.h) obj).a, ((com.gamericefishpro.space.y5.h) obj2).a);
        }
    }
}
