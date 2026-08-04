package com.gamericefishpro.space.d;

import android.content.Context;
import android.os.Bundle;
import com.gamericefishpro.space.ei.e0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f {
    public final /* synthetic */ k a;

    public /* synthetic */ f(k kVar) {
        this.a = kVar;
    }

    public final void a(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k kVar = this.a;
        Bundle bundleF = ((com.gamericefishpro.space.u6.s) kVar.v.e).f("android:support:activity-result");
        if (bundleF != null) {
            j jVar = kVar.A;
            LinkedHashMap linkedHashMap = jVar.b;
            LinkedHashMap linkedHashMap2 = jVar.a;
            Bundle bundle = jVar.g;
            ArrayList<Integer> integerArrayList = bundleF.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleF.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleF.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                jVar.d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleF.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        e0.b(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                Intrinsics.checkNotNullExpressionValue(num2, "get(...)");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                jVar.b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }
}
