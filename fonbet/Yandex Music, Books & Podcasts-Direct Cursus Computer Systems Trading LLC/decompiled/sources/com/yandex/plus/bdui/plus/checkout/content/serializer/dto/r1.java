package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.plus.pay.api.exception.PlusPayApiException;
import com.yandex.plus.pay.api.exception.PlusPayNetworkException;
import com.yandex.plus.pay.api.exception.PlusPayParseException;
import com.yandex.plus.pay.api.exception.PlusPayUnauthorizedException;
import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import defpackage.a4g;
import defpackage.a7f;
import defpackage.b0o;
import defpackage.b6e;
import defpackage.bd8;
import defpackage.cg6;
import defpackage.d0o;
import defpackage.e5b;
import defpackage.e7o;
import defpackage.ern;
import defpackage.f1d;
import defpackage.gld;
import defpackage.h0o;
import defpackage.jhp;
import defpackage.jj4;
import defpackage.jwj;
import defpackage.kwj;
import defpackage.nm6;
import defpackage.ouj;
import defpackage.pv9;
import defpackage.q7g;
import defpackage.qgg;
import defpackage.r7f;
import defpackage.r7o;
import defpackage.so6;
import defpackage.szb;
import defpackage.t75;
import defpackage.t7o;
import defpackage.tah;
import defpackage.tf6;
import defpackage.tlm;
import defpackage.twh;
import defpackage.uah;
import defpackage.v75;
import defpackage.vct;
import defpackage.wj9;
import defpackage.wop;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.xzb;
import defpackage.yhn;
import defpackage.z7o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class r1 {
    public static final Object A(a7f a7fVar) {
        int peek = a7fVar.peek();
        int D = ouj.D(peek);
        if (D == 0) {
            ArrayList n = tlm.n(a7fVar);
            while (a7fVar.hasNext()) {
                n.add(A(a7fVar));
            }
            a7fVar.l();
            return n;
        }
        if (D == 2) {
            a7fVar.j();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (a7fVar.hasNext()) {
                linkedHashMap.put(a7fVar.L(), A(a7fVar));
            }
            a7fVar.p();
            return linkedHashMap;
        }
        switch (D) {
            case 5:
                break;
            case 6:
            case 7:
                try {
                    try {
                        try {
                            break;
                        } catch (Exception unused) {
                            return Double.valueOf(a7fVar.nextDouble());
                        }
                    } catch (Exception unused2) {
                        return a7fVar.y0();
                    }
                } catch (Exception unused3) {
                    return Long.valueOf(a7fVar.nextLong());
                }
            case 8:
                break;
            case 9:
                a7fVar.u0();
                break;
            default:
                e7o.f("unknown token ".concat(f1d.v(peek)));
                break;
        }
        return null;
    }

    public static final Object B(ArrayList arrayList, Map map) {
        map.getClass();
        if (arrayList.isEmpty()) {
            throw new com.yandex.plus.core.templating.data.a("Template is empty!", null);
        }
        if (arrayList.size() != 1) {
            return C(arrayList, map);
        }
        com.yandex.plus.core.templating.template.d dVar = (com.yandex.plus.core.templating.template.d) arrayList.get(0);
        if (dVar instanceof com.yandex.plus.core.templating.template.b) {
            return ((com.yandex.plus.core.templating.template.b) dVar).a;
        }
        if (!(dVar instanceof com.yandex.plus.core.templating.template.c)) {
            b6e.s();
            return null;
        }
        String str = ((com.yandex.plus.core.templating.template.c) dVar).a;
        Object obj = map.get(str);
        if (obj != null) {
            return obj;
        }
        throw new com.yandex.plus.core.templating.data.a(str);
    }

    public static final String C(ArrayList arrayList, Map map) {
        map.getClass();
        return CollectionsKt.X(arrayList, "", null, null, new com.yandex.plus.bdui.templating.render.b(1, map), 30);
    }

    public static final com.yandex.plus.core.gradient.api.d D(com.yandex.plus.core.strings.a aVar) {
        Object aVar2;
        aVar.getClass();
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            return new com.yandex.plus.core.gradient.api.d(1, new com.yandex.plus.core.gradient.impl.b(com.yandex.plus.core.gradient.api.a.b, com.yandex.plus.core.gradient.api.a.d, 90.0f));
        }
        if (ordinal != 1) {
            b6e.s();
            return null;
        }
        Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
        com.yandex.plus.core.gradient.impl.b bVar = new com.yandex.plus.core.gradient.impl.b(com.yandex.plus.core.gradient.api.a.c, com.yandex.plus.core.gradient.api.a.f, 56.31f);
        com.yandex.plus.core.gradient.impl.b bVar2 = new com.yandex.plus.core.gradient.impl.b(com.yandex.plus.core.gradient.api.a.a, com.yandex.plus.core.gradient.api.a.e, 56.31f);
        if (Build.VERSION.SDK_INT >= 28) {
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_OVER;
            aVar2 = new com.yandex.passport.internal.flags.experiments.p(bVar, bVar2);
        } else {
            aVar2 = new com.yandex.plus.core.gradient.impl.a(bVar, bVar2);
        }
        return new com.yandex.plus.core.gradient.api.d(1, aVar2);
    }

    public static final void E(View view, View.OnClickListener onClickListener) {
        view.getClass();
        view.setOnClickListener(onClickListener != null ? new com.yandex.plus.home.common.utils.h(onClickListener) : null);
        if (onClickListener == null) {
            view.setClickable(false);
        }
    }

    public static final void F(TextView textView, CharSequence charSequence) {
        boolean z;
        textView.getClass();
        if (charSequence != null) {
            textView.setText(charSequence);
            z = true;
        } else {
            z = false;
        }
        textView.setVisibility(z ? 0 : 8);
    }

    public static final void G(View view) {
        view.getClass();
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
    }

    public static final String H(Collection collection) {
        collection.getClass();
        return CollectionsKt.X(collection, ";", null, null, new com.yandex.plus.home.feature.webviews.internal.webview.e(10), 30);
    }

    public static final com.yandex.plus.core.network.request.b I(d0o d0oVar) {
        com.yandex.plus.core.network.content.a aVar;
        twh b;
        d0oVar.getClass();
        Uri parse = Uri.parse(d0oVar.a.i);
        parse.getClass();
        com.yandex.plus.core.insets.d D = u.D(d0oVar.c);
        com.yandex.plus.core.network.request.a aVar2 = com.yandex.plus.core.network.request.a.b;
        String str = d0oVar.b;
        str.getClass();
        com.yandex.plus.core.network.request.a aVar3 = com.yandex.plus.core.network.request.a.b;
        if (!str.equals(aVar3.a)) {
            aVar3 = com.yandex.plus.core.network.request.a.c;
            if (!str.equals(aVar3.a)) {
                aVar3 = new com.yandex.plus.core.network.request.a(str);
            }
        }
        com.yandex.plus.core.network.request.a aVar4 = aVar3;
        h0o h0oVar = d0oVar.d;
        if (h0oVar == null || (b = h0oVar.b()) == null) {
            aVar = com.yandex.plus.core.network.content.a.d;
        } else {
            com.yandex.plus.core.network.content.a aVar5 = com.yandex.plus.core.network.content.a.b;
            String str2 = b.a;
            str2.getClass();
            aVar = com.yandex.plus.core.network.content.a.b;
            if (!str2.equals(aVar.a)) {
                aVar = com.yandex.plus.core.network.content.a.c;
                if (!str2.equals(aVar.a)) {
                    aVar = new com.yandex.plus.core.network.content.a(str2);
                }
            }
        }
        return new com.yandex.plus.core.network.request.b(parse, D, aVar4, aVar, d0oVar.d);
    }

    public static final d0o J(com.yandex.plus.core.network.request.b bVar) {
        bVar.getClass();
        b0o b0oVar = new b0o();
        String uri = bVar.a.toString();
        uri.getClass();
        b0oVar.g(uri);
        com.yandex.plus.core.insets.d dVar = bVar.b;
        pv9 pv9Var = new pv9(9);
        u.c(pv9Var, dVar);
        b0oVar.c = pv9Var.r().m();
        b0oVar.e(bVar.c.a, (h0o) bVar.e);
        return b0oVar.b();
    }

    public static final q7g K(Object obj) {
        return obj == null ? jwj.f : new kwj(obj);
    }

    public static final com.yandex.plus.core.data.common.k L(q qVar) {
        qVar.getClass();
        if (qVar instanceof g) {
            return new com.yandex.plus.core.data.common.f(z(((g) qVar).a.a));
        }
        if (qVar instanceof j) {
            j jVar = (j) qVar;
            List list = jVar.b;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(z(((c) it.next()).a.a)));
            }
            ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(((c) it2.next()).b));
            }
            return new com.yandex.plus.core.data.common.j(t75.c(new com.yandex.plus.core.data.common.o(arrayList, arrayList2, jVar.a)));
        }
        if (!(qVar instanceof m)) {
            if (qVar instanceof p) {
                return new com.yandex.plus.core.data.common.f(z(((p) qVar).a));
            }
            b6e.s();
            return null;
        }
        m mVar = (m) qVar;
        List list2 = mVar.b;
        x xVar = mVar.c;
        x xVar2 = mVar.d;
        List list3 = list2;
        ArrayList arrayList3 = new ArrayList(v75.o(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Integer.valueOf(z(((c) it3.next()).a.a)));
        }
        ArrayList arrayList4 = new ArrayList(v75.o(list3, 10));
        Iterator it4 = list3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(Double.valueOf(((c) it4.next()).b));
        }
        return new com.yandex.plus.core.data.common.j(t75.c(new com.yandex.plus.core.data.common.r(arrayList3, arrayList4, new Pair(Double.valueOf(xVar2.a), Double.valueOf(xVar2.b)), new Pair(Double.valueOf(xVar.a), Double.valueOf(xVar.b)))));
    }

    public static final com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g0 M(com.yandex.plus.home.feature.webviews.internalapi.subscription.p pVar) {
        if (pVar instanceof com.yandex.plus.home.feature.webviews.internalapi.subscription.o) {
            return com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g0.b;
        }
        if (pVar instanceof com.yandex.plus.home.feature.webviews.internalapi.subscription.l) {
            return com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g0.c;
        }
        if (pVar instanceof com.yandex.plus.home.feature.webviews.internalapi.subscription.i) {
            return com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g0.d;
        }
        if (pVar instanceof com.yandex.plus.home.feature.webviews.internalapi.subscription.c) {
            return com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g0.e;
        }
        if (pVar instanceof com.yandex.plus.home.feature.webviews.internalapi.subscription.f) {
            return com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.g0.f;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object N(View view, com.yandex.passport.internal.ui.sloth.q qVar, cg6 cg6Var) {
        com.yandex.plus.home.common.utils.o oVar;
        int i;
        if (cg6Var instanceof com.yandex.plus.home.common.utils.o) {
            oVar = (com.yandex.plus.home.common.utils.o) cg6Var;
            int i2 = oVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.l = i2 - Integer.MIN_VALUE;
                Object obj = oVar.k;
                Object obj2 = nm6.a;
                i = oVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    oVar.j = view;
                    oVar.l = 1;
                    if (qVar.invoke(view, oVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    view = oVar.j;
                    qgg.h0(obj);
                }
                view.requestLayout();
                view.invalidate();
                return Unit.a;
            }
        }
        oVar = new com.yandex.plus.home.common.utils.o(cg6Var);
        Object obj3 = oVar.k;
        Object obj22 = nm6.a;
        i = oVar.l;
        if (i != 0) {
        }
        view.requestLayout();
        view.invalidate();
        return Unit.a;
    }

    public static final void O(View view, com.yandex.plus.pay.ui.core.mobile.haptic.a aVar) {
        int i;
        view.getClass();
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            i = Build.VERSION.SDK_INT >= 30 ? 16 : 6;
        } else if (ordinal == 1) {
            i = Build.VERSION.SDK_INT >= 30 ? 17 : 0;
        } else if (ordinal != 2) {
            b6e.s();
            return;
        } else if (Build.VERSION.SDK_INT < 27) {
            return;
        } else {
            i = 3;
        }
        view.performHapticFeedback(i);
    }

    public static final void P(View view, int i, int i2, int i3, int i4) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            jj4.j("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(i, i2, i3, i4);
        view.setLayoutParams(marginLayoutParams);
    }

    public static /* synthetic */ void Q(int i, int i2, int i3, View view) {
        if ((i3 & 1) != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i4 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        P(view, i, i4, marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0, i2);
    }

    public static final Object R(com.yandex.plus.core.benchmark.x xVar, String str, Function1 function1) {
        com.yandex.plus.core.benchmark.c cVar = (com.yandex.plus.core.benchmark.c) xVar;
        com.yandex.plus.core.benchmark.l b = cVar.b(str);
        b.c();
        Object invoke = function1.invoke(b);
        b.d();
        cVar.c(b, null);
        return invoke;
    }

    public static com.yandex.plus.pay.inapp.google.common.internal.operation.h S(com.yandex.plus.home.internal.di.y yVar, com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        return new com.yandex.plus.pay.inapp.google.common.internal.operation.h(yVar, bVar);
    }

    public static final Object T(View view, AttributeSet attributeSet, int[] iArr, int i, int i2, Function1 function1) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, iArr, i, i2);
        obtainStyledAttributes.getClass();
        try {
            return function1.invoke(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static final com.yandex.plus.pay.api.exception.a U(Throwable th) {
        th.getClass();
        if (th instanceof com.yandex.plus.pay.api.exception.a) {
            return (com.yandex.plus.pay.api.exception.a) th;
        }
        if (!(th instanceof com.yandex.plus.core.graphql.exception.a)) {
            return new PlusPayUnexpectedException(th);
        }
        com.yandex.plus.core.graphql.exception.a aVar = (com.yandex.plus.core.graphql.exception.a) th;
        if (aVar instanceof com.yandex.plus.core.graphql.exception.b) {
            com.yandex.plus.core.graphql.exception.b bVar = (com.yandex.plus.core.graphql.exception.b) aVar;
            int i = bVar.a;
            if (i == 401) {
                String message = bVar.getMessage();
                return new PlusPayUnauthorizedException(new com.yandex.plus.home.common.network.g(i, message != null ? message : ""));
            }
            String message2 = bVar.getMessage();
            return new PlusPayApiException(new com.yandex.plus.home.common.network.c(i, message2 != null ? message2 : ""));
        }
        if (aVar instanceof com.yandex.plus.core.graphql.exception.c) {
            return new PlusPayNetworkException(new com.yandex.plus.home.common.network.d(aVar));
        }
        if (aVar instanceof com.yandex.plus.core.graphql.exception.d) {
            return new PlusPayParseException(new com.yandex.plus.home.common.network.e(aVar));
        }
        if (aVar instanceof com.yandex.plus.core.graphql.exception.e) {
            return new PlusPayNetworkException(new com.yandex.plus.home.common.network.h(aVar));
        }
        b6e.s();
        return null;
    }

    public static final void V(r7f r7fVar, Object obj) {
        if (obj == null) {
            r7fVar.B0();
            return;
        }
        if (obj instanceof Boolean) {
            r7fVar.J(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Byte) {
            r7fVar.u(((Number) obj).byteValue());
            return;
        }
        if (obj instanceof Short) {
            r7fVar.u(((Number) obj).shortValue());
            return;
        }
        if (obj instanceof Integer) {
            r7fVar.u(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            r7fVar.t(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            r7fVar.y(((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            r7fVar.y(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof String) {
            r7fVar.m0((String) obj);
            return;
        }
        if (obj instanceof Object[]) {
            r7fVar.m();
            for (Object obj2 : (Object[]) obj) {
                V(r7fVar, obj2);
            }
            r7fVar.l();
            return;
        }
        if (!(obj instanceof Collection)) {
            if (obj instanceof Map) {
                W(r7fVar, (Map) obj);
            }
        } else {
            r7fVar.m();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                V(r7fVar, it.next());
            }
            r7fVar.l();
        }
    }

    public static final void W(r7f r7fVar, Map map) {
        r7fVar.j();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            try {
                r7fVar.Z(String.valueOf(key));
                V(r7fVar, value);
            } catch (Throwable th) {
                System.out.println(th);
            }
        }
        r7fVar.p();
    }

    public static final Map a(com.yandex.plus.bdui.shared.b bVar) {
        bVar.getClass();
        com.yandex.plus.bdui.plus.shared.a aVar = (com.yandex.plus.bdui.plus.shared.a) bVar.e(ern.a(com.yandex.plus.bdui.plus.shared.a.class));
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public static final com.yandex.plus.divkit.api.a b(xzb xzbVar, szb szbVar, JSONObject jSONObject, szb szbVar2, String str, boolean z) {
        if (szbVar == null) {
            return null;
        }
        Uri uri = (Uri) szbVar.a(xzbVar);
        if (!z || uri != ((Uri) vct.e.b)) {
            return new com.yandex.plus.divkit.api.a(uri, jSONObject, (String) szbVar2.a(xzbVar), str);
        }
        Object b = szbVar.b();
        throw new com.yandex.plus.divkit.api.b(b instanceof String ? (String) b : null);
    }

    public static final void c(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, Integer num, Function0 function0) {
        charSequence.getClass();
        Object[] objArr = {new com.yandex.plus.home.common.utils.i(function0, true), num != null ? new ForegroundColorSpan(num.intValue()) : null};
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(charSequence);
        Iterator it = xz0.w(objArr).iterator();
        while (it.hasNext()) {
            spannableStringBuilder.setSpan(it.next(), length, spannableStringBuilder.length(), 33);
        }
    }

    public static final Collection d(Object obj) {
        Collection collection = obj instanceof Collection ? (Collection) obj : null;
        if (collection != null) {
            return collection;
        }
        Object[] objArr = obj instanceof Object[] ? (Object[]) obj : null;
        List X = objArr != null ? xz0.X(objArr) : null;
        if (X != null) {
            return X;
        }
        Sequence sequence = obj instanceof Sequence ? (Sequence) obj : null;
        return sequence != null ? jhp.k(sequence) : null;
    }

    public static final Object e(ConcurrentMap concurrentMap, Object obj, Function1 function1) {
        concurrentMap.getClass();
        Object computeIfAbsent = concurrentMap.computeIfAbsent(obj, new so6(4, function1));
        computeIfAbsent.getClass();
        return computeIfAbsent;
    }

    public static final tf6 f(View view, CoroutineContext coroutineContext) {
        view.getClass();
        coroutineContext.getClass();
        tf6 e = gld.e(coroutineContext.plus(a4g.n()));
        view.addOnAttachStateChangeListener(new com.yandex.plus.home.r(1, e));
        return e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(com.yandex.plus.pay.inapp.google.common.internal.operation.h hVar, Unit unit, cg6 cg6Var) {
        com.yandex.plus.pay.inapp.google.common.internal.operation.a aVar;
        int i;
        com.yandex.plus.pay.inapp.google.common.internal.operation.d dVar;
        if (cg6Var instanceof com.yandex.plus.pay.inapp.google.common.internal.operation.a) {
            aVar = (com.yandex.plus.pay.inapp.google.common.internal.operation.a) cg6Var;
            int i2 = aVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.k = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                Object obj2 = nm6.a;
                i = aVar.k;
                if (i != 0) {
                    qgg.h0(obj);
                    aVar.k = 1;
                    obj = hVar.g(unit, aVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.plus.pay.inapp.google.common.internal.operation.c cVar = (com.yandex.plus.pay.inapp.google.common.internal.operation.c) obj;
                com.yandex.plus.pay.inapp.google.common.internal.operation.e eVar = cVar.b;
                dVar = eVar.a;
                if (dVar != com.yandex.plus.pay.inapp.google.common.internal.operation.d.a) {
                    Object obj3 = cVar.a;
                    if (obj3 != null) {
                        return obj3;
                    }
                    xq0.x("Data must be set when code is OK");
                    return null;
                }
                String str = eVar.b;
                switch (dVar.ordinal()) {
                    case 1:
                    case 2:
                        throw new com.yandex.plus.pay.inapp.internal.error.c("Connection error", null);
                    case 3:
                    case 4:
                        throw new com.yandex.plus.pay.inapp.internal.error.a("In-app billing is unavailable", null);
                    case 5:
                        throw new com.yandex.plus.pay.inapp.internal.error.f("Item is unavailable for purchase", null);
                    case 6:
                    case 7:
                        throw new com.yandex.plus.pay.inapp.internal.error.i(str);
                    case 8:
                        throw new com.yandex.plus.pay.inapp.internal.error.e("Item is already owned by current store user", null);
                    case 9:
                        throw new com.yandex.plus.pay.inapp.internal.error.b("User cancelled the operation", null);
                    case 10:
                        throw new com.yandex.plus.pay.inapp.internal.error.i(str);
                    case 11:
                        throw new com.yandex.plus.pay.inapp.internal.error.h("Purchase state is unspecified", null);
                    case 12:
                        throw new com.yandex.plus.pay.inapp.internal.error.g("Payment declined due to insufficient funds", null);
                    default:
                        throw new com.yandex.plus.pay.inapp.internal.error.i(str);
                }
            }
        }
        aVar = new com.yandex.plus.pay.inapp.google.common.internal.operation.a(cg6Var);
        Object obj4 = aVar.j;
        Object obj22 = nm6.a;
        i = aVar.k;
        if (i != 0) {
        }
        com.yandex.plus.pay.inapp.google.common.internal.operation.c cVar2 = (com.yandex.plus.pay.inapp.google.common.internal.operation.c) obj4;
        com.yandex.plus.pay.inapp.google.common.internal.operation.e eVar2 = cVar2.b;
        dVar = eVar2.a;
        if (dVar != com.yandex.plus.pay.inapp.google.common.internal.operation.d.a) {
        }
    }

    public static final Map h(List list, boolean z) {
        list.getClass();
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return e5bVar;
        }
        List list2 = list;
        Iterator it = list2.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map) it.next()).size();
        }
        HashMap hashMap = new HashMap(i);
        if (z) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                hashMap.putAll((Map) it2.next());
            }
        } else {
            Iterator it3 = CollectionsKt.j0(list2).iterator();
            while (it3.hasNext()) {
                hashMap.putAll((Map) it3.next());
            }
        }
        return hashMap;
    }

    public static final int i(int i, View view) {
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        return com.yandex.plus.home.common.utils.a.a(context, i);
    }

    public static final int j(int i, View view) {
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        return com.yandex.plus.home.common.utils.a.b(context, i);
    }

    public static final int k(int i, View view) {
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        return com.yandex.plus.home.common.utils.a.d(context, i);
    }

    public static final boolean l(com.yandex.plus.core.featureflags.g gVar) {
        gVar.getClass();
        return Intrinsics.d(gVar.getValue(), Boolean.TRUE);
    }

    public static final String m(int i, View view) {
        view.getClass();
        String string = view.getContext().getString(i);
        string.getClass();
        return string;
    }

    public static ColorStateList n(int i, int i2) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{i, i2});
    }

    public static com.yandex.plus.home.feature.panel.internalapi.analytics.a o() {
        return (com.yandex.plus.home.feature.panel.internalapi.analytics.a) com.yandex.plus.home.feature.panel.internalapi.analytics.a.e.getValue();
    }

    public static final View p(ViewGroup viewGroup, int i, boolean z) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, z);
        Context context = viewGroup.getContext();
        context.getClass();
        if (com.yandex.plus.home.common.utils.a.j(context)) {
            inflate.setLayoutDirection(1);
        }
        inflate.getClass();
        return inflate;
    }

    public static final boolean q(View view) {
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        return com.yandex.plus.home.common.utils.a.j(context);
    }

    public static final void r(com.yandex.plus.pay.log.impl.b bVar, com.yandex.plus.pay.ui.common.api.b bVar2, String str) {
        bVar.getClass();
        com.yandex.plus.pay.ui.common.api.log.c cVar = new com.yandex.plus.pay.ui.common.api.log.c(str, bVar);
        bVar2.getLifecycle().a(cVar);
        androidx.fragment.app.y supportFragmentManager = bVar2.getSupportFragmentManager();
        supportFragmentManager.q.add(new com.yandex.plus.pay.ui.common.api.log.d(0, cVar));
    }

    public static final String s(bd8 bd8Var, xzb xzbVar) {
        bd8Var.getClass();
        if (xzbVar == null) {
            return "DivAction(unknown_resolver)";
        }
        String str = (String) bd8Var.c.a(xzbVar);
        szb szbVar = bd8Var.k;
        return "DivAction(logId=" + str + ", url=" + (szbVar != null ? (Uri) szbVar.a(xzbVar) : null) + ')';
    }

    public static final String t(wj9 wj9Var, xzb xzbVar) {
        xzbVar.getClass();
        String str = (String) wj9Var.a().a(xzbVar);
        szb url = wj9Var.getUrl();
        return "DivSightAction(logId=" + str + ", url=" + (url != null ? (Uri) url.a(xzbVar) : null) + ')';
    }

    public static final ArrayList u(Map map, Function2 function2) {
        Object invoke;
        map.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Pair pair = null;
            if (value != null && (invoke = function2.invoke(key, value)) != null) {
                pair = new Pair(key, invoke);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return arrayList;
    }

    public static final LinkedHashMap v(Pair... pairArr) {
        ArrayList arrayList = new ArrayList();
        for (Pair pair : pairArr) {
            if (pair.b != null) {
                arrayList.add(pair);
            }
        }
        int a = tah.a(v75.o(arrayList, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            Object obj = pair2.a;
            Object obj2 = pair2.b;
            obj2.getClass();
            linkedHashMap.put(obj, obj2);
        }
        return linkedHashMap;
    }

    public static final Map w(Map map, Map map2, boolean z) {
        map2.getClass();
        if (map == null) {
            return map2;
        }
        LinkedHashSet i = wop.i(map.keySet(), map2.keySet());
        ArrayList arrayList = new ArrayList();
        for (Object obj : i) {
            Object obj2 = map.get(obj);
            Object obj3 = map2.get(obj);
            if (obj2 != null && obj3 != null) {
                obj2 = x(obj2, obj3, z);
            } else if (obj2 == null) {
                obj2 = obj3;
            }
            Pair pair = obj2 != null ? new Pair(obj, obj2) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return uah.n(arrayList);
    }

    public static final Object x(Object obj, Object obj2, boolean z) {
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            Collection d = d(obj);
            Collection d2 = d(obj2);
            if (d == null || d2 == null) {
                return z ? obj2 : obj;
            }
            ArrayList g0 = CollectionsKt.g0(d, d2);
            return ((obj instanceof Set) || (obj2 instanceof Set)) ? CollectionsKt.A0(g0) : g0;
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        LinkedHashSet i = wop.i(map.keySet(), map2.keySet());
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : i) {
            Object obj4 = map.get(obj3);
            Object obj5 = map2.get(obj3);
            if (obj4 != null && obj5 != null) {
                obj4 = x(obj4, obj5, z);
            } else if (obj4 == null) {
                obj4 = obj5;
            }
            Pair pair = obj4 != null ? new Pair(obj3, obj4) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return uah.n(arrayList);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:5|(3:17|18|(1:10)(2:12|13))|7|8|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r2 = com.yandex.plus.core.analytics.logging.b.a;
        r4 = "Parsing color error, color = ".concat(r4);
        r3 = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, r2, r4, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer y(String str) {
        int i;
        if (str != null && !str.toString().trim().isEmpty()) {
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.charAt(0) != '#') {
                try {
                    i = Color.parseColor("#".concat(upperCase));
                } catch (IllegalArgumentException unused) {
                }
                if (i == Integer.MIN_VALUE) {
                    return null;
                }
                return Integer.valueOf(i);
            }
            i = Color.parseColor(upperCase);
            if (i == Integer.MIN_VALUE) {
            }
        }
        i = Integer.MIN_VALUE;
        if (i == Integer.MIN_VALUE) {
        }
    }

    public static final int z(String str) {
        Object t7oVar;
        List split$default;
        try {
            r7o r7oVar = z7o.b;
            split$default = StringsKt__StringsKt.split$default(StringsKt.a0(StringsKt.Y(new Regex("\\s").replace(str, ""), "rgba("), ")"), new String[]{StringUtils.COMMA}, false, 0, 6, null);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (split$default.size() != 4) {
            throw new IllegalArgumentException(("Invalid RGBA format: " + str).toString());
        }
        t7oVar = Integer.valueOf(Color.argb(yhn.d(Integer.parseInt((String) split$default.get(3)), 0, KotlinVersion.MAX_COMPONENT_VALUE), yhn.d(Integer.parseInt((String) split$default.get(0)), 0, KotlinVersion.MAX_COMPONENT_VALUE), yhn.d(Integer.parseInt((String) split$default.get(1)), 0, KotlinVersion.MAX_COMPONENT_VALUE), yhn.d(Integer.parseInt((String) split$default.get(2)), 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return ((Number) t7oVar).intValue();
        }
        throw new IllegalArgumentException(f1d.g("Couldn't parse RGBA color: ", str), a);
    }
}
