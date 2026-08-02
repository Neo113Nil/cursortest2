package androidx.fragment.app;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class FragmentTransition {
    public static final FragmentTransitionCompat21 PLATFORM_IMPL = new FragmentTransitionCompat21();
    public static final FragmentTransitionImpl SUPPORT_IMPL;

    static {
        FragmentTransitionImpl fragmentTransitionImpl = null;
        try {
            fragmentTransitionImpl = (FragmentTransitionImpl) FragmentTransitionSupport.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        SUPPORT_IMPL = fragmentTransitionImpl;
    }

    public static final void callSharedElementStartEnd(Fragment fragment, Fragment fragment2, boolean z, ArrayMap arrayMap) {
        fragment.getClass();
        fragment2.getClass();
        if ((z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(arrayMap.size);
            Iterator it = ((ArrayMap.EntrySet) arrayMap.entrySet()).iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(arrayMap.size);
            Iterator it2 = ((ArrayMap.EntrySet) arrayMap.entrySet()).iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
        }
    }

    public static final String findKeyForValue(ArrayMap arrayMap, String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((ArrayMap.EntrySet) arrayMap.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (Intrinsics.areEqual(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add((String) ((Map.Entry) it2.next()).getKey());
        }
        return (String) CollectionsKt.firstOrNull((List) arrayList);
    }

    public static final void setViewVisibility(int i, ArrayList arrayList) {
        arrayList.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
