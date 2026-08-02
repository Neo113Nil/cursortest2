package com.yandex.plus.bdui.flex.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Patterns;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.app.n0;
import com.yandex.plus.home.common.network.NetworkResponse;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.i3;
import com.yandex.plus.pay.api.exception.PlusPayApiException;
import com.yandex.plus.pay.api.exception.PlusPayNetworkException;
import com.yandex.plus.pay.api.exception.PlusPayParseException;
import com.yandex.plus.pay.api.exception.PlusPaySslException;
import com.yandex.plus.pay.api.exception.PlusPayUnauthorizedException;
import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.clc;
import defpackage.d4t;
import defpackage.dp0;
import defpackage.ep0;
import defpackage.f9f;
import defpackage.fp0;
import defpackage.h0o;
import defpackage.hi3;
import defpackage.hp0;
import defpackage.hrg;
import defpackage.ikn;
import defpackage.ip0;
import defpackage.jqi;
import defpackage.kcc;
import defpackage.lcc;
import defpackage.lxe;
import defpackage.mjm;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.nuj;
import defpackage.o3o;
import defpackage.oi3;
import defpackage.ouj;
import defpackage.pjc;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.r0w;
import defpackage.r7o;
import defpackage.rar;
import defpackage.s6n;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.tkc;
import defpackage.uz2;
import defpackage.v75;
import defpackage.vqn;
import defpackage.w3f;
import defpackage.w90;
import defpackage.wdu;
import defpackage.web;
import defpackage.wz0;
import defpackage.x0q;
import defpackage.x3f;
import defpackage.x97;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.y0q;
import defpackage.yct;
import defpackage.yjc;
import defpackage.z7o;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a {
    public static final Integer A(String str) {
        Object t7oVar;
        int parseColor;
        str.getClass();
        try {
            r7o r7oVar = z7o.b;
            if (str.length() == 9) {
                parseColor = Color.parseColor(str.charAt(0) + str.substring(7, 9) + str.substring(1, 7));
            } else {
                parseColor = Color.parseColor(str);
            }
            t7oVar = Integer.valueOf(parseColor);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        return (Integer) t7oVar;
    }

    public static final String B(String str) {
        return ouj.k('\"', "\"", str);
    }

    public static final com.yandex.plus.pay.ui.tarifficator.api.e C(com.yandex.plus.pay.ui.core.internal.a aVar) {
        aVar.getClass();
        com.yandex.plus.pay.ui.tarifficator.api.e eVar = aVar.a;
        if (eVar != null) {
            return eVar;
        }
        xq0.x("Tarifficator UI scenario must be initialized using:\nPlusPayUI.getProvider {\n    ...\n    withTarifficator(tarifficator)\n}");
        return null;
    }

    public static final void D(TextView textView, com.yandex.plus.core.theme.c cVar, Function1 function1) {
        textView.getClass();
        cVar.getClass();
        if (cVar instanceof com.yandex.plus.core.theme.a) {
            textView.getPaint().setShader(null);
            int i = ((com.yandex.plus.core.theme.a) cVar).a;
            textView.setTextColor(i);
            function1.invoke(Integer.valueOf(i));
            return;
        }
        if (!(cVar instanceof com.yandex.plus.core.theme.b)) {
            b6e.s();
            return;
        }
        if (textView.getVisibility() == 0) {
            Rect rect = new Rect();
            textView.getPaint().getTextBounds(textView.getText().toString(), 0, textView.getText().length(), rect);
            com.yandex.plus.core.gradient.api.e eVar = ((com.yandex.plus.core.theme.b) cVar).a;
            eVar.setBounds(rect);
            textView.getPaint().setShader(eVar.a());
        }
    }

    public static final String F(String str, JSONObject jSONObject) {
        Object t7oVar;
        jSONObject.getClass();
        try {
            r7o r7oVar = z7o.b;
            t7oVar = jSONObject.getString(str);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        return (String) t7oVar;
    }

    public static final com.yandex.plus.pay.inapp.google.common.internal.operation.e G(uz2 uz2Var) {
        com.yandex.plus.pay.inapp.google.common.internal.operation.d dVar;
        uz2Var.getClass();
        int i = uz2Var.a;
        if (i != 12) {
            switch (i) {
                case -1:
                    dVar = com.yandex.plus.pay.inapp.google.common.internal.operation.d.c;
                    break;
                case 0:
                    dVar = com.yandex.plus.pay.inapp.google.common.internal.operation.d.a;
                    break;
                case 1:
                    dVar = com.yandex.plus.pay.inapp.google.common.internal.operation.d.j;
                    break;
                case 2:
                    dVar = com.yandex.plus.pay.inapp.google.common.internal.operation.d.e;
                    break;
                case 3:
                    dVar = com.yandex.plus.pay.inapp.google.common.internal.operation.d.d;
                    break;
                case 4:
                    dVar = com.yandex.plus.pay.inapp.google.common.internal.operation.d.f;
                    break;
                case 5:
                    dVar = com.yandex.plus.pay.inapp.google.common.internal.operation.d.g;
                    break;
                case 6:
                    dVar = com.yandex.plus.pay.inapp.google.common.internal.operation.d.h;
                    break;
                case 7:
                    dVar = com.yandex.plus.pay.inapp.google.common.internal.operation.d.i;
                    break;
                default:
                    dVar = com.yandex.plus.pay.inapp.google.common.internal.operation.d.l;
                    break;
            }
        } else {
            dVar = com.yandex.plus.pay.inapp.google.common.internal.operation.d.b;
        }
        String str = uz2Var.b;
        str.getClass();
        return new com.yandex.plus.pay.inapp.google.common.internal.operation.e(dVar, str);
    }

    public static final String H(h0o h0oVar) {
        Object t7oVar;
        h0oVar.getClass();
        try {
            r7o r7oVar = z7o.b;
            hi3 hi3Var = new hi3();
            h0oVar.d(hi3Var);
            t7oVar = hi3Var.G0();
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        return (String) t7oVar;
    }

    public static final String I(o3o o3oVar) {
        Object t7oVar;
        o3oVar.getClass();
        try {
            r7o r7oVar = z7o.b;
            ikn peek = o3oVar.z().peek();
            hi3 hi3Var = peek.b;
            hi3Var.o0(peek.a);
            t7oVar = hi3Var.G0();
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        return (String) t7oVar;
    }

    public static final com.yandex.plus.core.graphql.exception.a J(ep0 ep0Var, String str) {
        str.getClass();
        if (!(ep0Var instanceof fp0)) {
            return ep0Var instanceof hp0 ? new com.yandex.plus.core.graphql.exception.c("Network exception for operation: ".concat(str), ep0Var) : ep0Var instanceof ip0 ? new com.yandex.plus.core.graphql.exception.d("Parse exception for operation: ".concat(str), ep0Var) : new com.yandex.plus.core.graphql.exception.e(ep0Var.getMessage(), ep0Var);
        }
        fp0 fp0Var = (fp0) ep0Var;
        return new com.yandex.plus.core.graphql.exception.b("Http exception for operation: ".concat(str), fp0Var, fp0Var.a);
    }

    public static final com.yandex.plus.core.graphql.exception.a K(web webVar) {
        Object obj;
        String obj2;
        Integer intOrNull;
        webVar.getClass();
        Map map = webVar.e;
        String str = webVar.a;
        return (map == null || (obj = map.get("status")) == null || (obj2 = obj.toString()) == null || (intOrNull = StringsKt.toIntOrNull(obj2)) == null) ? new com.yandex.plus.core.graphql.exception.e(str, null) : new com.yandex.plus.core.graphql.exception.b(str, null, intOrNull.intValue());
    }

    public static final ArrayList L(JSONArray jSONArray) {
        Object p;
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (opt != null && (p = p(opt)) != null) {
                arrayList.add(p);
            }
        }
        return arrayList;
    }

    public static final LinkedHashMap M(JSONObject jSONObject) {
        jSONObject.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                next.getClass();
                Object p = p(opt);
                if (p != null) {
                    linkedHashMap.put(next, p);
                }
            }
        }
        return linkedHashMap;
    }

    public static final String N(com.yandex.plus.pay.api.google.model.c cVar) {
        w3f w3fVar = x3f.d;
        w3fVar.getClass();
        byte[] bytes = w3fVar.c(com.yandex.plus.pay.api.google.model.c.Companion.serializer(), cVar).getBytes(Charsets.UTF_8);
        bytes.getClass();
        String encodeToString = Base64.encodeToString(bytes, 2);
        encodeToString.getClass();
        return encodeToString;
    }

    public static final int O(i3 i3Var) {
        i3Var.getClass();
        int ordinal = i3Var.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return 0;
        }
        if (ordinal == 2) {
            return 3;
        }
        if (ordinal == 3 || ordinal == 4) {
            return 1;
        }
        b6e.s();
        return 0;
    }

    public static x0q a() {
        return y0q.a(0, Integer.MAX_VALUE, oi3.a);
    }

    public static final com.yandex.plus.adapter.auth.api.c b(com.yandex.plus.core.config.a aVar) {
        aVar.getClass();
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return com.yandex.plus.adapter.auth.api.c.a;
        }
        if (ordinal == 1) {
            return com.yandex.plus.adapter.auth.api.c.b;
        }
        b6e.s();
        return null;
    }

    public static final com.yandex.plus.adapter.auth.api.g c(com.yandex.plus.ui.core.theme.a aVar) {
        aVar.getClass();
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return com.yandex.plus.adapter.auth.api.g.b;
        }
        if (ordinal == 1) {
            return com.yandex.plus.adapter.auth.api.g.a;
        }
        if (ordinal == 2) {
            return com.yandex.plus.adapter.auth.api.g.c;
        }
        b6e.s();
        return null;
    }

    public static final Object d(dp0 dp0Var, jqi jqiVar, cg6 cg6Var) {
        return e(jqiVar, new w90(dp0Var, jqiVar, null, 22), cg6Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(1:29))|12|13|(1:15)(2:17|(2:19|20)(2:21|22))))|36|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        r6 = defpackage.z7o.b;
        r6 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0047, code lost:
    
        r6 = defpackage.z7o.b;
        r6 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(nuj nujVar, Function1 function1, cg6 cg6Var) {
        com.yandex.plus.core.graphql.internal.a aVar;
        int i;
        Throwable a;
        if (cg6Var instanceof com.yandex.plus.core.graphql.internal.a) {
            aVar = (com.yandex.plus.core.graphql.internal.a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.k;
                Object obj2 = nm6.a;
                i = aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    aVar.j = nujVar;
                    aVar.l = 1;
                    obj = function1.invoke(aVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nujVar = aVar.j;
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj);
                if (a != null) {
                    return obj;
                }
                if (a instanceof ep0) {
                    throw J((ep0) a, nujVar.name());
                }
                throw new com.yandex.plus.core.graphql.exception.e(a.getMessage(), a);
            }
        }
        aVar = new com.yandex.plus.core.graphql.internal.a(cg6Var);
        Object obj3 = aVar.k;
        Object obj22 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj3);
        if (a != null) {
        }
    }

    public static final Object f(dp0 dp0Var, s6n s6nVar, cg6 cg6Var) {
        return e(s6nVar, new w90(dp0Var, s6nVar, null, 23), cg6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(com.yandex.passport.sloth.ui.dependencies.m mVar, Function1 function1, cg6 cg6Var) {
        com.yandex.plus.core.data.pay.g gVar;
        int i;
        if (cg6Var instanceof com.yandex.plus.core.data.pay.g) {
            gVar = (com.yandex.plus.core.data.pay.g) cg6Var;
            int i2 = gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = gVar.k;
                nm6 nm6Var = nm6.a;
                i = gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.core.data.pay.f fVar = new com.yandex.plus.core.data.pay.f(new clc(mVar.t(), new d4t(2, 13, null), 4), 0);
                    com.yandex.plus.bdui.q qVar = new com.yandex.plus.bdui.q(2, function1, lxe.class, "suspendConversion0", "awaitTerminalState$suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/yandex/plus/core/data/pay/PlusSelectPaymentMethodState$NonTerminal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 12);
                    gVar.j = mVar;
                    gVar.l = 1;
                    if (zsd.O(fVar, qVar, gVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mVar = gVar.j;
                    qgg.h0(obj);
                }
                Object value = mVar.t().a.getValue();
                value.getClass();
                return (com.yandex.plus.core.data.pay.t) value;
            }
        }
        gVar = new com.yandex.plus.core.data.pay.g(cg6Var);
        Object obj2 = gVar.k;
        nm6 nm6Var2 = nm6.a;
        i = gVar.l;
        if (i != 0) {
        }
        Object value2 = mVar.t().a.getValue();
        value2.getClass();
        return (com.yandex.plus.core.data.pay.t) value2;
    }

    public static String h(String str) {
        Locale locale = Locale.ROOT;
        locale.getClass();
        if (str.length() <= 0) {
            return str;
        }
        return ((Object) CharsKt.e(str.charAt(0), locale)) + str.substring(1);
    }

    public static final void i(pjc pjcVar, mm6 mm6Var, pyc pycVar) {
        pjcVar.getClass();
        x97.y(mm6Var, null, null, new yjc(pjcVar, pycVar, null, 2), 3);
    }

    public static final rar j(pjc pjcVar, mm6 mm6Var, Function2 function2) {
        pjcVar.getClass();
        mm6Var.getClass();
        return x97.y(mm6Var, null, null, new tkc(pjcVar, function2, null, 3), 3);
    }

    public static final void k(pjc pjcVar, mm6 mm6Var, pyc pycVar) {
        pjcVar.getClass();
        pycVar.getClass();
        x97.y(mm6Var, null, null, new com.yandex.plus.home.api.prefetch.j(pjcVar, pycVar, (Continuation) null, 4), 3);
    }

    public static final void l(pjc pjcVar, tf6 tf6Var, Function2 function2) {
        pjcVar.getClass();
        tf6Var.getClass();
        x97.y(tf6Var, null, null, new tkc(pjcVar, function2, null, 4), 3);
    }

    public static final void m(ViewGroup viewGroup, ArrayList arrayList) {
        Pair pair;
        viewGroup.getClass();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.getClass();
            if (childAt.getVisibility() != 0) {
                pair = new Pair(null, Boolean.TRUE);
            } else {
                WeakHashMap weakHashMap = wdu.a;
                int importantForAccessibility = childAt.getImportantForAccessibility();
                if (importantForAccessibility == 0 || importantForAccessibility == 1) {
                    int i2 = Build.VERSION.SDK_INT;
                    AccessibilityNodeInfo a = i2 >= 30 ? com.yandex.plus.plaquesdk.widget.accessibility.b.a(childAt) : AccessibilityNodeInfo.obtain(childAt);
                    childAt.onInitializeAccessibilityNodeInfo(a);
                    if (a.isClickable() || !a.isEnabled()) {
                        a.getClass();
                        if (i2 < 33) {
                            a.recycle();
                        }
                        pair = new Pair(null, Boolean.TRUE);
                    } else {
                        CharSequence contentDescription = a.getContentDescription();
                        if (TextUtils.isEmpty(contentDescription)) {
                            CharSequence text = a.getText();
                            if (i2 < 33) {
                                a.recycle();
                            }
                            pair = new Pair(text, Boolean.FALSE);
                        } else {
                            if (i2 < 33) {
                                a.recycle();
                            }
                            pair = new Pair(contentDescription, Boolean.TRUE);
                        }
                    }
                } else {
                    pair = new Pair(null, Boolean.TRUE);
                }
            }
            CharSequence charSequence = (CharSequence) pair.a;
            boolean booleanValue = ((Boolean) pair.b).booleanValue();
            if (charSequence != null && charSequence.length() != 0) {
                arrayList.add(charSequence);
            }
            if (!booleanValue && (childAt instanceof ViewGroup)) {
                m((ViewGroup) childAt, arrayList);
            }
        }
    }

    public static final int n(Context context, int i) {
        context.getClass();
        context.getClass();
        Resources.Theme theme = context.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static b o(com.yandex.plus.bdui.m mVar, f9f f9fVar, com.yandex.plus.bdui.ui.c cVar, Function2 function2, com.yandex.plus.core.reflect.c cVar2, com.yandex.plus.bdui.flex.factory.e eVar, com.yandex.plus.bdui.plus.content.controller.f fVar, o oVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, pyc pycVar, Function2 function22, pyc pycVar2, kotlinx.coroutines.a aVar, tf6 tf6Var, com.yandex.plus.log.api.b bVar, String str, String str2) {
        f9fVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        aVar.getClass();
        bVar.getClass();
        return new b(mVar, f9fVar, cVar, function2, new com.yandex.passport.internal.ui.bouncer.o(21, cVar2, mVar), oVar, new s(new com.yandex.plus.bdui.flex.utils.g(eVar, fVar, bVar, str, str2), pycVar, function22, pycVar2, bVar, str), function1, function12, function13, function14, function15, aVar, tf6Var, bVar, str);
    }

    public static final Object p(Object obj) {
        return obj instanceof JSONArray ? L((JSONArray) obj) : obj instanceof JSONObject ? M((JSONObject) obj) : obj;
    }

    public static final float q(View view) {
        view.getClass();
        float f = 0.0f;
        if (view.getVisibility() != 0 || view.getAlpha() == 0.0f || view.getRootView() == null || view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0) {
            return 0.0f;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        if (i > displayMetrics.widthPixels || i2 > displayMetrics.heightPixels) {
            return 0.0f;
        }
        Rect rect = new Rect(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
        Rect rect2 = new Rect();
        Region region = new Region(rect);
        region.op(view.getRootView().getLeft(), view.getRootView().getTop(), view.getRootView().getRight(), view.getRootView().getBottom(), Region.Op.INTERSECT);
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        vqn vqnVar = new vqn();
        vqnVar.a = viewGroup != null ? viewGroup.indexOfChild(view) : -1;
        while (viewGroup != null) {
            if (viewGroup.getVisibility() != 0) {
                return 0.0f;
            }
            viewGroup.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            region.op(viewGroup.getPaddingLeft() + i3, viewGroup.getPaddingTop() + i4, (viewGroup.getMeasuredWidth() + i3) - viewGroup.getPaddingRight(), (viewGroup.getMeasuredHeight() + i4) - viewGroup.getPaddingBottom(), Region.Op.INTERSECT);
            kcc kccVar = new kcc(new lcc(new wz0(2, new wz0(8, viewGroup)), true, new mjm(22, new r0w(26, vqnVar))));
            while (kccVar.hasNext()) {
                IndexedValue indexedValue = (IndexedValue) kccVar.next();
                indexedValue.getClass();
                if (((View) indexedValue.b).getGlobalVisibleRect(rect2)) {
                    region.op(rect2, Region.Op.DIFFERENCE);
                }
            }
            ViewParent parent2 = viewGroup.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            vqnVar.a = viewGroup2 != null ? viewGroup2.indexOfChild(viewGroup) : -1;
            viewGroup = viewGroup2;
        }
        while (new RegionIterator(region).next(new Rect())) {
            f += r1.height() * r1.width();
        }
        return f / (rect.height() * rect.width());
    }

    public static final com.yandex.plus.pay.common.api.utils.b r(NetworkResponse networkResponse, Function2 function2) {
        Throwable plusPayApiException;
        networkResponse.getClass();
        if (networkResponse instanceof com.yandex.plus.home.common.network.b) {
            com.yandex.plus.home.common.network.b bVar = (com.yandex.plus.home.common.network.b) networkResponse;
            return new com.yandex.plus.pay.common.api.utils.b(bVar.a, bVar.b);
        }
        if (!(networkResponse instanceof com.yandex.plus.home.common.network.a)) {
            b6e.s();
            return null;
        }
        com.yandex.plus.home.common.network.a aVar = (com.yandex.plus.home.common.network.a) networkResponse;
        n0 n0Var = aVar.a;
        n0Var.getClass();
        if (n0Var instanceof com.yandex.plus.home.common.network.c) {
            plusPayApiException = new PlusPayApiException((com.yandex.plus.home.common.network.c) n0Var);
        } else if (n0Var instanceof com.yandex.plus.home.common.network.g) {
            plusPayApiException = new PlusPayUnauthorizedException((com.yandex.plus.home.common.network.g) n0Var);
        } else if (n0Var instanceof com.yandex.plus.home.common.network.e) {
            plusPayApiException = new PlusPayParseException((com.yandex.plus.home.common.network.e) n0Var);
        } else if (n0Var instanceof com.yandex.plus.home.common.network.f) {
            plusPayApiException = new PlusPaySslException((com.yandex.plus.home.common.network.f) n0Var);
        } else if (n0Var instanceof com.yandex.plus.home.common.network.d) {
            plusPayApiException = new PlusPayNetworkException(n0Var);
        } else {
            if (!(n0Var instanceof com.yandex.plus.home.common.network.h)) {
                b6e.s();
                return null;
            }
            plusPayApiException = new PlusPayUnexpectedException(((com.yandex.plus.home.common.network.h) n0Var).b);
        }
        function2.invoke(aVar.b, plusPayApiException);
        throw plusPayApiException;
    }

    public static final com.yandex.plus.pay.ui.api.feature.payment.g t(Throwable th) {
        if (!(th instanceof PlusPayApiException) && !(th instanceof PlusPayParseException) && !(th instanceof PlusPaySslException)) {
            if (th instanceof PlusPayUnauthorizedException) {
                return com.yandex.plus.pay.ui.api.feature.payment.e.a;
            }
            if (th instanceof PlusPayNetworkException) {
                return com.yandex.plus.pay.ui.api.feature.payment.b.a;
            }
        }
        return com.yandex.plus.pay.ui.api.feature.payment.f.a;
    }

    public static final com.yandex.plus.bdui.plus.templating.render.g u(com.yandex.plus.core.templating.render.a aVar, com.yandex.plus.core.templating.parser.b bVar, Object obj, LinkedHashSet linkedHashSet) {
        bVar.getClass();
        obj.getClass();
        if (obj instanceof String) {
            ArrayList r = ((com.yandex.plus.bdui.plus.content.controller.f) bVar).r((String) obj);
            if (!r.isEmpty() && !r.isEmpty()) {
                Iterator it = r.iterator();
                while (it.hasNext()) {
                    if (!(((com.yandex.plus.core.templating.template.d) it.next()) instanceof com.yandex.plus.core.templating.template.b)) {
                        linkedHashSet.addAll(com.yandex.plus.core.templating.render.a.a(r));
                        return new com.yandex.plus.bdui.plus.templating.render.e(r);
                    }
                }
            }
            return new com.yandex.plus.bdui.plus.templating.render.f(obj);
        }
        if (obj instanceof Object[]) {
            List w = xz0.w((Object[]) obj);
            ArrayList arrayList = new ArrayList(v75.o(w, 10));
            Iterator it2 = w.iterator();
            while (it2.hasNext()) {
                arrayList.add(u(aVar, bVar, it2.next(), linkedHashSet));
            }
            return new com.yandex.plus.bdui.plus.templating.render.c(arrayList);
        }
        if (obj instanceof Collection) {
            ArrayList O = CollectionsKt.O((Iterable) obj);
            ArrayList arrayList2 = new ArrayList(v75.o(O, 10));
            Iterator it3 = O.iterator();
            while (it3.hasNext()) {
                arrayList2.add(u(aVar, bVar, it3.next(), linkedHashSet));
            }
            return new com.yandex.plus.bdui.plus.templating.render.c(arrayList2);
        }
        if (!(obj instanceof Map)) {
            return new com.yandex.plus.bdui.plus.templating.render.f(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Pair pair = (!(key instanceof String) || value == null) ? null : new Pair(key, u(aVar, bVar, value, linkedHashSet));
            if (pair != null) {
                arrayList3.add(pair);
            }
        }
        return new com.yandex.plus.bdui.plus.templating.render.d(arrayList3);
    }

    public static final com.yandex.plus.core.templating.template.j v(com.yandex.plus.core.templating.template.l lVar, com.yandex.plus.core.templating.parser.b bVar, Object obj, com.yandex.plus.log.api.b bVar2, Function1 function1) {
        com.yandex.plus.core.templating.template.i eVar;
        Class cls = lVar.b;
        yct yctVar = lVar.c;
        bVar.getClass();
        bVar2.getClass();
        if (obj == null) {
            if (!yctVar.a()) {
                xq0.x("Null value is not acceptable for non-nullable templateable!");
                return null;
            }
            eVar = new com.yandex.plus.core.templating.template.h(null);
        } else if (!cls.isAssignableFrom(String.class)) {
            Class<?> cls2 = obj.getClass();
            if (cls.isAssignableFrom(cls2)) {
                eVar = new com.yandex.plus.core.templating.template.h(obj);
            } else {
                if (!(obj instanceof String)) {
                    ConcurrentHashMap concurrentHashMap = com.yandex.plus.core.reflect.b.a;
                    throw new IllegalArgumentException("Incompatible value type " + com.yandex.plus.core.reflect.b.b(cls2.getClass()) + " for templateable type " + com.yandex.plus.core.reflect.b.b(cls.getClass()) + '!');
                }
                String str = (String) obj;
                ArrayList r = ((com.yandex.plus.bdui.plus.content.controller.f) bVar).r(str);
                Object firstOrNull = CollectionsKt.firstOrNull(r);
                String str2 = firstOrNull instanceof com.yandex.plus.core.templating.template.c ? ((com.yandex.plus.core.templating.template.c) firstOrNull).a : null;
                if (r.size() != 1 || str2 == null) {
                    xq0.x(hrg.q("Invalid template \"", str, "\" for templateable!"));
                    return null;
                }
                eVar = new com.yandex.plus.core.templating.template.e(cls, yctVar.a(), function1, str2);
            }
        } else if (obj instanceof String) {
            ArrayList r2 = ((com.yandex.plus.bdui.plus.content.controller.f) bVar).r((String) obj);
            if (!r2.isEmpty() && !r2.isEmpty()) {
                Iterator it = r2.iterator();
                while (it.hasNext()) {
                    if (!(((com.yandex.plus.core.templating.template.d) it.next()) instanceof com.yandex.plus.core.templating.template.b)) {
                        eVar = new com.yandex.plus.core.templating.template.f(cls, yctVar.a(), r2);
                        break;
                    }
                }
            }
            eVar = new com.yandex.plus.core.templating.template.h(obj);
        } else {
            eVar = new com.yandex.plus.core.templating.template.h(obj.toString());
        }
        return new com.yandex.plus.core.templating.template.j(lVar.a, eVar, bVar2);
    }

    public static final Integer w(String str, JSONObject jSONObject) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        return (Integer) t7oVar;
    }

    public static final boolean x(String str) {
        str.getClass();
        return !Patterns.WEB_URL.matcher(str).matches();
    }

    public static final boolean y(com.yandex.plus.pay.api.feature.inapp.restore.e eVar) {
        eVar.getClass();
        if (eVar instanceof com.yandex.plus.pay.api.feature.inapp.restore.d) {
            return false;
        }
        if ((eVar instanceof com.yandex.plus.pay.api.feature.inapp.restore.c) || (eVar instanceof com.yandex.plus.pay.api.feature.inapp.restore.b)) {
            return true;
        }
        b6e.s();
        return false;
    }

    public static final Integer z(String str) {
        String str2;
        Object t7oVar;
        str.getClass();
        String obj = StringsKt.t0(str).toString();
        if (obj.length() == 0 || obj.charAt(0) != '#') {
            return null;
        }
        int length = obj.length();
        if (length == 4) {
            char charAt = obj.charAt(1);
            char charAt2 = obj.charAt(2);
            char charAt3 = obj.charAt(3);
            str2 = "ff" + charAt + charAt + charAt2 + charAt2 + charAt3 + charAt3;
        } else if (length != 5) {
            str2 = length != 7 ? length != 9 ? null : obj.substring(1) : "ff".concat(obj.substring(1));
        } else {
            char charAt4 = obj.charAt(1);
            char charAt5 = obj.charAt(2);
            char charAt6 = obj.charAt(3);
            char charAt7 = obj.charAt(4);
            StringBuilder sb = new StringBuilder();
            sb.append(charAt4);
            sb.append(charAt4);
            sb.append(charAt5);
            sb.append(charAt5);
            sb.append(charAt6);
            sb.append(charAt6);
            sb.append(charAt7);
            sb.append(charAt7);
            str2 = sb.toString();
        }
        if (str2 != null) {
            Long r0 = StringsKt.r0(16, str2);
            Integer valueOf = r0 != null ? Integer.valueOf((int) r0.longValue()) : null;
            if (valueOf != null) {
                return valueOf;
            }
        }
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Integer.valueOf(Color.parseColor(obj));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        return (Integer) (t7oVar instanceof t7o ? null : t7oVar);
    }
}
