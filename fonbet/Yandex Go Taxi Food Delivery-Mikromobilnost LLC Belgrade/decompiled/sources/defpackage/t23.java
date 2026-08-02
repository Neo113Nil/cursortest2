package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import defpackage.np31;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class t23 {
    public final LinkedHashMap a = new LinkedHashMap();

    public static final class a implements s23 {
        public boolean a;
        public final LinkedHashSet b = new LinkedHashSet(2);

        public final int a() {
            LinkedHashSet linkedHashSet = this.b;
            if (!linkedHashSet.isEmpty()) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = Integer.valueOf(((Number) next).intValue() | ((Number) it.next()).intValue());
                    }
                    return ((Number) next).intValue();
                }
                w511.x("Empty collection can't be reduced.");
            }
            return 0;
        }

        public final void b() {
            this.b.add(2);
        }

        public final void c() {
            this.b.add(1);
        }
    }

    public final void a(final View view) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.a.entrySet()) {
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
            w511.x("Empty collection can't be reduced.");
            return;
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = Integer.valueOf(((Number) next).intValue() | ((Number) it2.next()).intValue());
        }
        int intValue = ((Number) next).intValue();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((b33) entry2.getKey()).a(view), entry2.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(gw00.d(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), Integer.valueOf(((a) entry3.getValue()).a()));
        }
        u23 u23Var = new u23(linkedHashMap3, intValue);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            WindowInsets windowInsets = ir31.a;
            if (Build.VERSION.SDK_INT < 30) {
                hr31 hr31Var = new hr31();
                view2.setTag(vih0.tag_compat_insets_dispatch, hr31Var);
                view2.setOnApplyWindowInsetsListener(hr31Var);
                ir31.b = true;
            }
        }
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(view, u23Var);
        if (!linkedHashMap.isEmpty()) {
            Iterator it3 = linkedHashMap.entrySet().iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((a) ((Map.Entry) it3.next()).getValue()).a) {
                        b.u(view, new v23(view, intValue));
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (view.isAttachedToWindow()) {
            np31.c(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.plus.core.insets.ApplyInsetsScopeImpl$commit$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view3) {
                    view.removeOnAttachStateChangeListener(this);
                    View view4 = view;
                    WeakHashMap weakHashMap2 = b.a;
                    np31.c(view4);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view3) {
                }
            });
        }
    }
}
