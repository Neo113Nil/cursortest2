package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.widget.TextView;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.ekr;
import defpackage.kp0;
import defpackage.leu;
import defpackage.lm4;
import defpackage.pv9;
import defpackage.r7o;
import defpackage.t6e;
import defpackage.t7o;
import defpackage.uh;
import defpackage.uop;
import defpackage.v75;
import defpackage.web;
import defpackage.wop;
import defpackage.x6e;
import defpackage.xzb;
import defpackage.z7o;
import defpackage.zvd;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class u {
    public static final void B(AttributeSet attributeSet, TypedArray typedArray, String str, int i, int i2, com.yandex.plus.plaquesdk.utils.a aVar, com.yandex.plus.plaquesdk.utils.a aVar2) {
        int resourceId;
        int k;
        int k2;
        typedArray.getClass();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", str);
        boolean z = attributeValue != null && kotlin.text.c.v(attributeValue, "?", false);
        if (z && (k2 = k(attributeSet, "http://schemas.android.com/apk/res-auto", str)) != 0) {
            aVar.a(Integer.valueOf(k2));
            return;
        }
        if (StringsKt.M(str, "android:", false) && (k = k(attributeSet, "http://schemas.android.com/apk/res/android", kotlin.text.c.r(str, "android:", "", false))) != 0) {
            aVar.a(Integer.valueOf(k));
        } else if (z || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            aVar.a(Integer.valueOf(i2));
        } else {
            aVar2.a(Integer.valueOf(resourceId));
        }
    }

    public static final void C(TextView textView, boolean z) {
        Drawable drawable;
        textView.getClass();
        if (z) {
            Context context = textView.getContext();
            context.getClass();
            drawable = com.yandex.plus.home.common.utils.a.e(context, R.drawable.plus_sdk_panel_ic_arrow_forward);
        } else {
            drawable = null;
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }

    public static final com.yandex.plus.core.insets.d D(zvd zvdVar) {
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(1);
        ekr.a.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        int size = zvdVar.size();
        for (int i = 0; i < size; i++) {
            treeSet.add(zvdVar.g(i));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        unmodifiableSet.getClass();
        for (String str : unmodifiableSet) {
            List r = zvdVar.r(str);
            com.yandex.plus.core.network.header.b bVar = null;
            if (r.isEmpty()) {
                r = null;
            }
            if (r != null) {
                ReentrantLock reentrantLock = com.yandex.plus.core.network.header.d.a;
                com.yandex.plus.core.network.header.b bVar2 = new com.yandex.plus.core.network.header.b(str, com.yandex.plus.core.network.header.a.a);
                ConcurrentHashMap concurrentHashMap = com.yandex.plus.core.network.header.d.b;
                com.yandex.plus.core.network.header.b bVar3 = (com.yandex.plus.core.network.header.b) concurrentHashMap.get(bVar2.a());
                com.yandex.plus.core.network.header.a aVar = bVar2.b;
                if (bVar3 == null || bVar3.b.compareTo(aVar) < 0) {
                    bVar3 = null;
                }
                if (bVar3 != null) {
                    bVar2 = bVar3;
                } else {
                    ReentrantLock reentrantLock2 = com.yandex.plus.core.network.header.d.a;
                    reentrantLock2.lock();
                    try {
                        com.yandex.plus.core.network.header.b bVar4 = (com.yandex.plus.core.network.header.b) concurrentHashMap.get(bVar2.a());
                        if (bVar4 != null && bVar4.b.compareTo(aVar) >= 0) {
                            bVar = bVar4;
                        }
                        if (bVar != null) {
                            reentrantLock2.unlock();
                            bVar2 = bVar;
                        } else {
                            concurrentHashMap.put(bVar2.a(), bVar2);
                        }
                    } finally {
                        reentrantLock2.unlock();
                    }
                }
                List list = r;
                if (!list.isEmpty()) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new com.yandex.plus.core.network.header.c(bVar2, (String) it.next()));
                    }
                    Iterable A0 = CollectionsKt.A0(arrayList);
                    LinkedHashMap linkedHashMap = dVar.b;
                    Set set = (Set) linkedHashMap.get(bVar2);
                    if (set != null) {
                        A0 = wop.i(set, A0);
                    }
                    linkedHashMap.put(bVar2, A0);
                }
            }
        }
        return dVar;
    }

    public static final com.yandex.plus.core.data.pay.t E(com.yandex.plus.paymentsdk.internal.method.d dVar, String str) {
        dVar.getClass();
        str.getClass();
        if (dVar instanceof com.yandex.plus.paymentsdk.internal.method.c) {
            return new com.yandex.plus.core.data.pay.s(str, ((com.yandex.plus.paymentsdk.internal.method.c) dVar).a);
        }
        if (dVar instanceof com.yandex.plus.paymentsdk.internal.method.b) {
            com.yandex.plus.paymentsdk.internal.method.b bVar = (com.yandex.plus.paymentsdk.internal.method.b) dVar;
            return new com.yandex.plus.core.data.pay.k(bVar.b, bVar.a, bVar.c, bVar.d, bVar.e);
        }
        if (dVar instanceof com.yandex.plus.paymentsdk.internal.method.a) {
            return com.yandex.plus.core.data.pay.h.INSTANCE;
        }
        b6e.s();
        return null;
    }

    public static final com.yandex.plus.core.data.common.y F(t tVar) {
        return new com.yandex.plus.core.data.common.y(tVar != null ? tVar.a : null, tVar != null ? tVar.b : null);
    }

    public static final SpannedString G(com.yandex.plus.log.api.a aVar, Context context) {
        int i;
        aVar.getClass();
        context.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            i = R.color.pay_sdk_log_verbose_color;
        } else if (ordinal == 1) {
            i = R.color.pay_sdk_log_debug_color;
        } else if (ordinal == 2) {
            i = R.color.pay_sdk_log_info_color;
        } else if (ordinal == 3) {
            i = R.color.pay_sdk_log_warning_color;
        } else if (ordinal == 4) {
            i = R.color.pay_sdk_log_error_color;
        } else {
            if (ordinal != 5) {
                b6e.s();
                return null;
            }
            i = R.color.pay_sdk_log_assert_color;
        }
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(context.getColor(i));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) aVar.name());
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return new SpannedString(spannableStringBuilder);
    }

    public static final Set H(Object obj) {
        obj.getClass();
        Set set = obj instanceof Set ? (Set) obj : null;
        if (set == null) {
            return null;
        }
        Set set2 = set;
        ArrayList arrayList = new ArrayList(v75.o(set2, 10));
        for (Object obj2 : set2) {
            obj2.getClass();
            arrayList.add((String) obj2);
        }
        return CollectionsKt.A0(arrayList);
    }

    public static final RippleDrawable I(Drawable drawable, int i, float f, float f2, float f3, float f4) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        valueOf.getClass();
        return new RippleDrawable(valueOf, drawable, (f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 0.0f) ? null : new ShapeDrawable(a(f, f2, f3, f4)));
    }

    public static /* synthetic */ RippleDrawable J(Drawable drawable, int i, float f, float f2, float f3, float f4, int i2) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            f4 = 0.0f;
        }
        return I(drawable, i, f, f2, f3, f4);
    }

    public static final com.yandex.plus.divkit.impl.n K(xzb xzbVar, com.yandex.plus.log.api.b bVar, String str) {
        xzbVar.getClass();
        bVar.getClass();
        return new com.yandex.plus.divkit.impl.n(xzbVar, new com.yandex.plus.bdui.plus.webview.navigation.a(16), new com.yandex.plus.bdui.content.b(13, bVar, str));
    }

    public static RoundRectShape a(float f, float f2, float f3, float f4) {
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        return new RoundRectShape(fArr, new RectF(), fArr);
    }

    public static final String b(com.yandex.plus.pay.api.log.c cVar) {
        return cVar.a() + '.' + cVar.getName();
    }

    public static final void c(pv9 pv9Var, com.yandex.plus.core.insets.d dVar) {
        Set set;
        for (com.yandex.plus.core.network.header.b bVar : dVar.b.keySet()) {
            dVar.getClass();
            bVar.getClass();
            Set set2 = (Set) dVar.b.get(bVar);
            if (set2 != null) {
                Set set3 = set2;
                ArrayList arrayList = new ArrayList(v75.o(set3, 10));
                Iterator it = set3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.yandex.plus.core.network.header.c) it.next()).b);
                }
                set = CollectionsKt.A0(arrayList);
            } else {
                set = null;
            }
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    pv9Var.e(bVar.a, (String) it2.next());
                }
            }
        }
    }

    public static final boolean d(Region region, View view, Rect rect) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                if (!t(view)) {
                    if (view.getGlobalVisibleRect(rect)) {
                        return region.op(rect, Region.Op.UNION);
                    }
                    return false;
                }
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                boolean z = false;
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    childAt.getClass();
                    z = d(region, childAt, rect) || z;
                }
                return z;
            }
            if ((!view.getClass().equals(View.class) || !t(view)) && view.getGlobalVisibleRect(rect)) {
                return region.op(rect, Region.Op.UNION);
            }
        }
        return false;
    }

    public static final com.yandex.plus.core.data.pay.d e(com.yandex.plus.domain.auth.api.e eVar) {
        eVar.getClass();
        Long id = eVar.getId();
        String e = eVar.e();
        com.yandex.plus.domain.auth.api.b bVar = eVar instanceof com.yandex.plus.domain.auth.api.b ? (com.yandex.plus.domain.auth.api.b) eVar : null;
        return new com.yandex.plus.core.data.pay.d(e, id, bVar != null ? bVar.d : null);
    }

    public static final void f(kp0 kp0Var) {
        kp0Var.getClass();
        List list = kp0Var.d;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                throw com.yandex.plus.bdui.flex.ui.a.K((web) CollectionsKt.Q(list));
            }
        }
    }

    public static final com.yandex.plus.core.featureflags.g g(lm4 lm4Var, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = (com.yandex.plus.core.featureflags.g) i(lm4Var, function0, function02, function03, function04, function05);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        com.yandex.plus.core.featureflags.g gVar = (com.yandex.plus.core.featureflags.g) (t7oVar instanceof t7o ? null : t7oVar);
        Throwable a = z7o.a(t7oVar);
        if (gVar != null && a == null) {
            return gVar;
        }
        throw new IllegalArgumentException("Feature flags can only be of Boolean, String, Set<String>, Int or Float type and can not be of " + lm4Var + " type!", a);
    }

    public static final com.yandex.plus.core.featureflags.t h(lm4 lm4Var, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = (com.yandex.plus.core.featureflags.t) i(lm4Var, function0, function02, function03, function04, function05);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        com.yandex.plus.core.featureflags.t tVar = (com.yandex.plus.core.featureflags.t) (t7oVar instanceof t7o ? null : t7oVar);
        Throwable a = z7o.a(t7oVar);
        if (tVar != null && a == null) {
            return tVar;
        }
        throw new IllegalArgumentException("Feature flags can only be of Boolean, String, Set<String>, Int or Float type and can not be of " + lm4Var + " type!", a);
    }

    public static final Object i(lm4 lm4Var, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05) {
        Class Q = leu.Q(lm4Var);
        if (Boolean.class.isAssignableFrom(Q)) {
            return function0.invoke();
        }
        if (String.class.isAssignableFrom(Q)) {
            return function02.invoke();
        }
        if (Set.class.isAssignableFrom(Q)) {
            return function03.invoke();
        }
        if (Integer.class.isAssignableFrom(Q)) {
            return function04.invoke();
        }
        if (Float.class.isAssignableFrom(Q)) {
            return function05.invoke();
        }
        return null;
    }

    public static final Set j(Object obj) {
        obj.getClass();
        if (obj instanceof com.yandex.plus.core.templating.render.z) {
            return uop.b(obj);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, obj, com.yandex.plus.core.reflect.b.class, "isUserSpaceClass", "isUserSpaceClass(Ljava/lang/Object;Ljava/lang/String;)Z", 1, 5);
        ConcurrentHashMap concurrentHashMap = com.yandex.plus.core.reflect.b.a;
        com.yandex.plus.core.reflect.b.h(obj, null, linkedHashSet, new LinkedHashSet(), aVar, 0);
        return linkedHashSet;
    }

    public static int k(AttributeSet attributeSet, String str, String str2) {
        String attributeValue = attributeSet.getAttributeValue(str, str2);
        if (attributeValue == null || !kotlin.text.c.v(attributeValue, "?", false)) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(kotlin.text.c.r(attributeValue, "?", "", false));
        valueOf.getClass();
        return valueOf.intValue();
    }

    public static final List l(kp0 kp0Var) {
        kp0Var.getClass();
        x6e x6eVar = (x6e) kp0Var.f.d(x6e.c);
        if (x6eVar != null) {
            return x6eVar.b;
        }
        return null;
    }

    public static final String n(List list) {
        Object obj;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((t6e) obj).a, "X-Request-Id")) {
                break;
            }
        }
        t6e t6eVar = (t6e) obj;
        if (t6eVar != null) {
            return t6eVar.b;
        }
        return null;
    }

    public static final web o(kp0 kp0Var) {
        kp0Var.getClass();
        List list = kp0Var.d;
        if (list != null) {
            return (web) CollectionsKt.firstOrNull(list);
        }
        return null;
    }

    public static final String p(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((t6e) obj).a, "X-Yandex-Plus-SessionId")) {
                break;
            }
        }
        t6e t6eVar = (t6e) obj;
        if (t6eVar != null) {
            return t6eVar.b;
        }
        return null;
    }

    public static final com.yandex.plus.home.feature.webviews.internalapi.toolbar.b q(com.yandex.plus.home.feature.webviews.internal.webview.f fVar) {
        fVar.getClass();
        WebBackForwardList i = fVar.i();
        boolean z = i.getCurrentIndex() > 0;
        WebHistoryItem currentItem = i.getCurrentItem();
        return new com.yandex.plus.home.feature.webviews.internalapi.toolbar.b(fVar.j(), currentItem != null ? currentItem.getTitle() : null, z);
    }

    public static final boolean r(Context context, com.yandex.plus.ui.core.theme.a aVar) {
        aVar.getClass();
        context.getClass();
        if (aVar != com.yandex.plus.ui.core.theme.a.a) {
            return aVar == com.yandex.plus.ui.core.theme.a.c && com.yandex.plus.home.common.utils.a.i(context);
        }
        return true;
    }

    public static final boolean s(Object obj) {
        obj.getClass();
        Set set = obj instanceof Set ? (Set) obj : null;
        if (set == null) {
            return false;
        }
        Set set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return true;
        }
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof String)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean t(View view) {
        if (view.getAlpha() == 0.0f || view.getBackground() == null) {
            return true;
        }
        Drawable background = view.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        return colorDrawable != null && colorDrawable.getAlpha() == 0;
    }

    public static final String v(String str) {
        String Y = StringsKt.Y(str, "#");
        if (Y.length() > 0) {
            return Y;
        }
        return null;
    }

    public static final String w(String str) {
        str.getClass();
        String u0 = StringsKt.u0(str, '/');
        if (u0.length() > 0) {
            return u0;
        }
        return null;
    }

    public static final String x(String str) {
        String Y = StringsKt.Y(str, "?");
        if (Y.length() > 0) {
            return Y;
        }
        return null;
    }

    public static final String y(String str) {
        if (str == null || StringsKt.U(str)) {
            str = null;
        }
        return str == null ? "no_value" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.LinkedHashMap] */
    public static final Serializable z(String str) {
        Object t7oVar;
        Object t7oVar2;
        Object t7oVar3;
        str.getClass();
        Serializable p0 = StringsKt.p0(str);
        if (p0 != null || (p0 = StringsKt.r0(10, str)) != null || (p0 = kotlin.text.b.h(str)) != null) {
            return p0;
        }
        try {
            r7o r7oVar = z7o.b;
            t7oVar = com.yandex.plus.bdui.flex.ui.a.z(str);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        ?? r0 = (Integer) t7oVar;
        if (r0 == 0) {
            try {
                t7oVar2 = new JSONArray(str);
            } catch (Throwable th2) {
                r7o r7oVar3 = z7o.b;
                t7oVar2 = new t7o(th2);
            }
            if (t7oVar2 instanceof t7o) {
                t7oVar2 = null;
            }
            JSONArray jSONArray = (JSONArray) t7oVar2;
            r0 = jSONArray != null ? com.yandex.plus.bdui.flex.ui.a.L(jSONArray) : 0;
            if (r0 == 0) {
                try {
                    t7oVar3 = new JSONObject(str);
                } catch (Throwable th3) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar3 = new t7o(th3);
                }
                if (t7oVar3 instanceof t7o) {
                    t7oVar3 = null;
                }
                JSONObject jSONObject = (JSONObject) t7oVar3;
                String M = jSONObject != null ? com.yandex.plus.bdui.flex.ui.a.M(jSONObject) : null;
                if (M != null) {
                    str = M;
                }
                return str;
            }
        }
        str = r0;
        return str;
    }

    public abstract Object A(String[] strArr, Continuation continuation);

    public abstract Object m(String str, Continuation continuation);

    public abstract Object u(uh uhVar, Object obj, cg6 cg6Var);
}
