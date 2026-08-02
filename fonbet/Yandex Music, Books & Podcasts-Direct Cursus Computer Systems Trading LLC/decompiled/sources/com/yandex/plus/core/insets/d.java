package com.yandex.plus.core.insets;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.passport.internal.ui.bouncer.roundabout.n;
import defpackage.ldu;
import defpackage.ndu;
import defpackage.neu;
import defpackage.oeu;
import defpackage.qq6;
import defpackage.tah;
import defpackage.v75;
import defpackage.wdu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class d implements com.yandex.plus.core.animation.a {
    public final /* synthetic */ int a;
    public final LinkedHashMap b;

    public d(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new LinkedHashMap();
                break;
            case 2:
                this.b = new LinkedHashMap();
                break;
            case 3:
                this.b = new LinkedHashMap();
                break;
            default:
                this.b = new LinkedHashMap();
                break;
        }
    }

    public String a() {
        LinkedHashMap linkedHashMap = this.b;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            arrayList.add(((String) key) + '=' + ((String) entry.getValue()));
        }
        return CollectionsKt.X(arrayList, "&", null, null, null, 62);
    }

    public void b(View view) {
        view.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            if (((a) entry.getValue()).a() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((a) ((Map.Entry) it.next()).getValue()).a()));
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            qq6.d("Empty collection can't be reduced.");
            return;
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = Integer.valueOf(((Number) next).intValue() | ((Number) it2.next()).intValue());
        }
        int intValue = ((Number) next).intValue();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((k) entry2.getKey()).a(view), entry2.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(tah.a(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), Integer.valueOf(((a) entry3.getValue()).a()));
        }
        b bVar = new b(linkedHashMap3, intValue);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            WindowInsets windowInsets = oeu.a;
            if (Build.VERSION.SDK_INT < 30) {
                neu neuVar = new neu();
                view2.setTag(R.id.tag_compat_insets_dispatch, neuVar);
                view2.setOnApplyWindowInsetsListener(neuVar);
                oeu.b = true;
            }
        }
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(view, bVar);
        if (!linkedHashMap.isEmpty()) {
            Iterator it3 = linkedHashMap.entrySet().iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((a) ((Map.Entry) it3.next()).getValue()).a) {
                        wdu.t(view, new c(view, intValue));
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (view.isAttachedToWindow()) {
            ldu.c(view);
        } else {
            view.addOnAttachStateChangeListener(new n(3, view, view));
        }
    }

    @Override // com.yandex.plus.core.animation.a
    public void h(ViewGroup viewGroup) {
        LinkedHashMap linkedHashMap = this.b;
        viewGroup.removeView((View) linkedHashMap.remove(viewGroup));
        Context context = viewGroup.getContext();
        context.getClass();
        com.yandex.plus.home.animation.d dVar = new com.yandex.plus.home.animation.d(context);
        viewGroup.addView(dVar);
        linkedHashMap.put(viewGroup, dVar);
    }

    @Override // com.yandex.plus.core.animation.a
    public void m(ViewGroup viewGroup) {
        viewGroup.getClass();
        viewGroup.removeView((View) this.b.remove(viewGroup));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0023 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        ArrayList arrayList;
        List n0;
        switch (this.a) {
            case 1:
                LinkedHashMap linkedHashMap = this.b;
                List<com.yandex.plus.core.network.header.b> n02 = CollectionsKt.n0(linkedHashMap.keySet());
                ArrayList arrayList2 = new ArrayList();
                for (com.yandex.plus.core.network.header.b bVar : n02) {
                    Set set = (Set) linkedHashMap.get(bVar);
                    ArrayList arrayList3 = null;
                    if (set != null) {
                        if (set.isEmpty()) {
                            set = null;
                        }
                        if (set != null) {
                            Set set2 = set;
                            arrayList = new ArrayList(v75.o(set2, 10));
                            Iterator it = set2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((com.yandex.plus.core.network.header.c) it.next()).b);
                            }
                            if (arrayList != null && (n0 = CollectionsKt.n0(arrayList)) != null) {
                                List<String> list = n0;
                                arrayList3 = new ArrayList(v75.o(list, 10));
                                for (String str : list) {
                                    bVar.getClass();
                                    str.getClass();
                                    if (bVar.b == com.yandex.plus.core.network.header.a.b) {
                                        str = "(hidden)";
                                    }
                                    arrayList3.add(bVar + ": " + str);
                                }
                            }
                            if (arrayList3 == null) {
                                arrayList2.add(arrayList3);
                            }
                        }
                    }
                    arrayList = null;
                    if (arrayList != null) {
                        List<String> list2 = n0;
                        arrayList3 = new ArrayList(v75.o(list2, 10));
                        while (r4.hasNext()) {
                        }
                    }
                    if (arrayList3 == null) {
                    }
                }
                return CollectionsKt.X(v75.p(arrayList2), StringUtil.LF, null, null, null, 62);
            default:
                return super.toString();
        }
    }
}
