package ru.yandex.taxi.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.UpdateAppearance;
import android.view.ContextThemeWrapper;
import defpackage.b64;
import defpackage.bdc;
import defpackage.bvf0;
import defpackage.cdc;
import defpackage.cvu0;
import defpackage.eja1;
import defpackage.evu0;
import defpackage.eyu0;
import defpackage.hhs0;
import defpackage.j73;
import defpackage.jb7;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.kdc;
import defpackage.kgx;
import defpackage.loj;
import defpackage.ny61;
import defpackage.o8s;
import defpackage.pav;
import defpackage.pdc;
import defpackage.q5z;
import defpackage.qvx0;
import defpackage.r820;
import defpackage.s8o;
import defpackage.th5;
import defpackage.tje;
import defpackage.ufu;
import defpackage.up11;
import defpackage.uwx0;
import defpackage.wuj0;
import defpackage.x8s;
import defpackage.xng0;
import defpackage.z1u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.TextMetaStyle;
import ru.yandex.taxi.common_models.net.o;
import ru.yandex.taxi.common_models.net.y;
import ru.yandex.taxi.plus.design.gradient.span.CashbackContainerSpan;
import ru.yandex.taxi.plus.design.gradient.span.CashbackSpan;
import ru.yandex.taxi.utils.AbsoluteSizeSpanFix;
import ru.yandex.taxi.utils.ForegroundColorSpanFix;
import ru.yandex.taxi.utils.StrikethroughSpanFix;
import ru.yandex.taxi.utils.StyleSpanFix;
import ru.yandex.taxi.utils.StyledTypefaceSpan;
import ru.yandex.taxi.utils.URLSpanFix;
import ru.yandex.taxi.utils.UnderlineSpanFix;

/* loaded from: classes10.dex */
public final class c {
    public static final /* synthetic */ kgx[] g = {new PropertyReference1Impl("context", 0, "getContext()Landroid/view/ContextThemeWrapper;", c.class)};
    public final pav a;
    public final uwx0 b;
    public final z1u c;
    public final pdc d;
    public final r820 e;
    public final jb7 f;

    public c(pav pavVar, Context context, uwx0 uwx0Var, z1u z1uVar, pdc pdcVar, r820 r820Var, eyu0 eyu0Var) {
        this.a = pavVar;
        this.b = uwx0Var;
        this.c = z1uVar;
        this.d = pdcVar;
        this.e = r820Var;
        this.f = new jb7(eyu0Var.a.a(eyu0Var.b.getThemeType()).b, context, eyu0Var);
    }

    public static void b(StringBuilder sb, List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar instanceof FormattedText.h) {
                FormattedText.h hVar = (FormattedText.h) oVar;
                String str = hVar.a;
                List list2 = hVar.f;
                jsq0 jsq0Var = hVar.e;
                if (evu0.J(str)) {
                    sb.append(str);
                } else {
                    StringBuilder sb2 = new StringBuilder(b64.k("([*_~])", evu0.k0(str).toString(), "\\\\$1"));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (hVar.c == FormattedText.FontWeight.BOLD) {
                        linkedHashMap.put("**", "**");
                    }
                    if (hVar.b == FormattedText.FontStyle.ITALIC) {
                        linkedHashMap.put("*", "*");
                    }
                    if (jsq0Var.contains(FormattedText.TextDecoration.UNDERLINE) || list2.contains(y.INSTANCE)) {
                        linkedHashMap.put("<u>", "</u>");
                    }
                    if (!jsq0Var.contains(FormattedText.TextDecoration.LINE_THROUGH)) {
                        List list3 = list2;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                if (((FormattedText.b) it2.next()) instanceof FormattedText.f) {
                                }
                            }
                        }
                        linkedHashMap.forEach(new th5(6, new loj(28, sb2)));
                        sb.append((CharSequence) sb2);
                    }
                    linkedHashMap.put("~~", "~~");
                    linkedHashMap.forEach(new th5(6, new loj(28, sb2)));
                    sb.append((CharSequence) sb2);
                }
            } else if (oVar instanceof FormattedText.a) {
                b(sb, ((FormattedText.a) oVar).b, map);
            }
        }
    }

    public static Object e(c cVar, FormattedText formattedText, Map map, boolean z, Continuation continuation, int i) {
        if ((i & 2) != 0) {
            map = kotlin.collections.b.f();
        }
        Map map2 = map;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 16) != 0 ? false : z;
        cVar.getClass();
        return bvf0.n(new FormattedTextConverter$awaitConvert$2(cVar, formattedText, true, z3, z2, map2, null), continuation);
    }

    public static SpannableStringBuilder f(c cVar, FormattedText formattedText, boolean z, Map map, int i) {
        boolean z2 = (i & 2) != 0 ? true : z;
        boolean z3 = (i & 4) == 0;
        if ((i & 8) != 0) {
            map = kotlin.collections.b.f();
        }
        cVar.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        cVar.d(spannableStringBuilder, formattedText.a, z2, z3, map);
        return spannableStringBuilder;
    }

    public static /* synthetic */ Object i(c cVar, FormattedText formattedText, Map map, Continuation continuation, int i) {
        if ((i & 2) != 0) {
            map = kotlin.collections.b.f();
        }
        return cVar.h(formattedText, map, true, continuation);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    public final void a(android.text.SpannableStringBuilder r21, defpackage.tse r22, java.util.List r23, boolean r24, boolean r25, boolean r26, java.util.Map r27) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.yandex.taxi.widget.c.a(android.text.SpannableStringBuilder, tse, java.util.List, boolean, boolean, boolean, java.util.Map):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e5, code lost:
    
        if (r5 != null) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0241 A[LOOP:3: B:79:0x023b->B:81:0x0241, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fa  */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v3, types: [ru.yandex.taxi.widget.OutlineSpan] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(SpannableStringBuilder spannableStringBuilder, FormattedText.h hVar, boolean z, URLSpanFix uRLSpanFix, boolean z2, Map map) {
        int i;
        kdc cdcVar;
        kdc kdcVar;
        hhs0 a;
        Integer num;
        Integer q;
        FormattedText.FontWeight fontWeight;
        FormattedText.FontStyle fontStyle;
        UpdateAppearance styledTypefaceSpan;
        List list;
        UnderlineSpanFix underlineSpanFix;
        UnderlineSpanFix underlineSpanFix2;
        Object strikethroughSpanFix;
        Object obj;
        String str;
        Object obj2;
        Object foregroundColorSpanFix;
        Float f;
        Iterator it;
        Object obj3;
        Object obj4;
        UpdateAppearance updateAppearance;
        Typeface b;
        int length = spannableStringBuilder.length();
        String str2 = hVar.a;
        jsq0 jsq0Var = hVar.e;
        List list2 = hVar.f;
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            str2 = cvu0.v(str2, (String) entry.getKey(), (String) entry.getValue(), false);
        }
        spannableStringBuilder.append(str2);
        String str3 = hVar.g;
        pdc pdcVar = this.d;
        DefaultConstructorMarker defaultConstructorMarker = null;
        defaultConstructorMarker = null;
        if (z2) {
            cdcVar = ((ufu) pdcVar).i(str3);
        } else {
            Integer S = q5z.S(str3);
            cdcVar = S != null ? new cdc(S.intValue()) : null;
        }
        String str4 = hVar.j;
        if (str4 != null) {
            if (z2) {
                kdcVar = ((ufu) pdcVar).i(str4);
            } else {
                Integer S2 = q5z.S(str4);
                if (S2 != null) {
                    kdcVar = new cdc(S2.intValue());
                }
            }
            TextMetaStyle textMetaStyle = hVar.i;
            a = textMetaStyle == null ? this.e.a(textMetaStyle) : null;
            if (a != null || (num = a.t()) == null) {
                num = hVar.d;
            }
            AbsoluteSizeSpanFix absoluteSizeSpanFix = num == null ? new AbsoluteSizeSpanFix(num.intValue(), true) : null;
            q = a == null ? a.q() : null;
            fontWeight = hVar.c;
            fontStyle = hVar.b;
            int i2 = 2;
            if (q != null || (b = wuj0.b(q.intValue(), g())) == null) {
                if (fontWeight == null || z) {
                    int[] iArr = up11.a;
                    if (fontWeight == null) {
                        fontWeight = FormattedText.FontWeight.REGULAR;
                    }
                    styledTypefaceSpan = new StyledTypefaceSpan(eja1.w(x8s.b(fontWeight), x8s.a(fontStyle)), x8s.a(fontStyle));
                } else {
                    if (fontStyle == FormattedText.FontStyle.NORMAL) {
                        fontStyle = null;
                    }
                    if (fontStyle != null) {
                        updateAppearance = new StyleSpanFix(x8s.a(fontStyle));
                    } else {
                        styledTypefaceSpan = null;
                    }
                }
                list = list2;
                if (list.isEmpty()) {
                    if (jsq0Var.contains(FormattedText.TextDecoration.UNDERLINE)) {
                        underlineSpanFix = new UnderlineSpanFix();
                        underlineSpanFix2 = underlineSpanFix;
                    }
                    underlineSpanFix2 = null;
                } else {
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj4 = null;
                            break;
                        } else {
                            obj4 = it3.next();
                            if (((FormattedText.b) obj4) instanceof y) {
                                break;
                            }
                        }
                    }
                    if ((obj4 instanceof y ? (y) obj4 : null) != null) {
                        underlineSpanFix = new UnderlineSpanFix();
                        underlineSpanFix2 = underlineSpanFix;
                    }
                    underlineSpanFix2 = null;
                }
                if (list.isEmpty()) {
                    if (jsq0Var.contains(FormattedText.TextDecoration.LINE_THROUGH)) {
                        strikethroughSpanFix = new StrikethroughSpanFix();
                        obj = strikethroughSpanFix;
                    }
                    obj = null;
                } else {
                    Iterator it4 = list2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj3 = null;
                            break;
                        } else {
                            obj3 = it4.next();
                            if (((FormattedText.b) obj3) instanceof FormattedText.f) {
                                break;
                            }
                        }
                    }
                    FormattedText.f fVar = obj3 instanceof FormattedText.f ? (FormattedText.f) obj3 : null;
                    FormattedText.LineThroughStyle lineThroughStyle = fVar != null ? fVar.a : null;
                    int i3 = lineThroughStyle == null ? -1 : o8s.a[lineThroughStyle.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            strikethroughSpanFix = new DiagonallyStrikethroughSpan(g(), s8o.m(((ufu) pdcVar).h(new bdc(xng0.textMain), fVar.b), g()), s8o.m(cdcVar == null ? new bdc(xng0.textMain) : cdcVar, g()));
                        }
                        obj = null;
                    } else {
                        strikethroughSpanFix = new StrikethroughSpanFix();
                    }
                    obj = strikethroughSpanFix;
                }
                str = hVar.h;
                if (str != null) {
                    this.b.getClass();
                    foregroundColorSpanFix = str.equals("plus") ? new CashbackSpan() : null;
                }
                if (cdcVar == null) {
                    obj2 = null;
                    f = hVar.k;
                    if (cdcVar != null) {
                        defaultConstructorMarker = new OutlineSpan(s8o.m(cdcVar, g()), s8o.m(kdcVar, g()), tje.x(g(), f == null ? f.floatValue() : 0.5f));
                    }
                    it = ((ArrayList) j73.A(new Object[]{uRLSpanFix, absoluteSizeSpanFix, styledTypefaceSpan, underlineSpanFix2, obj, obj2, defaultConstructorMarker})).iterator();
                    while (it.hasNext()) {
                    }
                    return;
                }
                foregroundColorSpanFix = new ForegroundColorSpanFix(s8o.m(cdcVar, g()));
                obj2 = foregroundColorSpanFix;
                f = hVar.k;
                if (cdcVar != null && kdcVar != null) {
                    defaultConstructorMarker = new OutlineSpan(s8o.m(cdcVar, g()), s8o.m(kdcVar, g()), tje.x(g(), f == null ? f.floatValue() : 0.5f));
                }
                it = ((ArrayList) j73.A(new Object[]{uRLSpanFix, absoluteSizeSpanFix, styledTypefaceSpan, underlineSpanFix2, obj, obj2, defaultConstructorMarker})).iterator();
                while (it.hasNext()) {
                    spannableStringBuilder.setSpan(it.next(), length, spannableStringBuilder.length(), 33);
                }
                return;
            }
            updateAppearance = new StyledTypefaceSpan(b, i, i2, defaultConstructorMarker);
            styledTypefaceSpan = updateAppearance;
            list = list2;
            if (list.isEmpty()) {
            }
            if (list.isEmpty()) {
            }
            str = hVar.h;
            if (str != null) {
            }
            if (cdcVar == null) {
            }
        }
        kdcVar = null;
        TextMetaStyle textMetaStyle2 = hVar.i;
        if (textMetaStyle2 == null) {
        }
        if (a != null) {
        }
        num = hVar.d;
        if (num == null) {
        }
        if (a == null) {
        }
        fontWeight = hVar.c;
        fontStyle = hVar.b;
        int i22 = 2;
        if (q != null) {
        }
        if (fontWeight == null) {
        }
        int[] iArr2 = up11.a;
        if (fontWeight == null) {
        }
        styledTypefaceSpan = new StyledTypefaceSpan(eja1.w(x8s.b(fontWeight), x8s.a(fontStyle)), x8s.a(fontStyle));
        list = list2;
        if (list.isEmpty()) {
        }
        if (list.isEmpty()) {
        }
        str = hVar.h;
        if (str != null) {
        }
        if (cdcVar == null) {
        }
    }

    public final void d(SpannableStringBuilder spannableStringBuilder, List list, boolean z, boolean z2, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((o) obj) instanceof ru.yandex.taxi.common_models.net.a)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar instanceof FormattedText.h) {
                c(spannableStringBuilder, (FormattedText.h) oVar, z2, null, z, map);
            } else if (oVar instanceof FormattedText.g) {
                FormattedText.g gVar = (FormattedText.g) oVar;
                c(spannableStringBuilder, gVar.b, z2, new URLSpanFix(gVar.a), z, map);
            } else if (oVar instanceof FormattedText.a) {
                FormattedText.a aVar = (FormattedText.a) oVar;
                int length = spannableStringBuilder.length();
                d(spannableStringBuilder, aVar.b, z, z2, map);
                FormattedText.c cVar = aVar.a;
                ((qvx0) this.c).getClass();
                CashbackContainerSpan cashbackContainerSpan = (cVar != null && jl40.l(cVar.getA(), "plus")) ? new CashbackContainerSpan() : null;
                if (cashbackContainerSpan != null) {
                    spannableStringBuilder.setSpan(cashbackContainerSpan, length, spannableStringBuilder.length(), 33);
                }
            }
        }
    }

    public final ContextThemeWrapper g() {
        return (ContextThemeWrapper) this.f.getValue(this, g[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(FormattedText formattedText, Map map, boolean z, Continuation continuation) {
        FormattedTextConverter$safeConvert$1 formattedTextConverter$safeConvert$1;
        int i;
        boolean z2;
        FormattedText formattedText2;
        boolean z3;
        Map map2;
        Map map3;
        boolean z4;
        boolean z5;
        try {
            if (continuation instanceof FormattedTextConverter$safeConvert$1) {
                formattedTextConverter$safeConvert$1 = (FormattedTextConverter$safeConvert$1) continuation;
                int i2 = formattedTextConverter$safeConvert$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    formattedTextConverter$safeConvert$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = formattedTextConverter$safeConvert$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = formattedTextConverter$safeConvert$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        z2 = false;
                        try {
                            formattedTextConverter$safeConvert$1.L$0 = formattedText;
                            formattedTextConverter$safeConvert$1.L$1 = map;
                            formattedTextConverter$safeConvert$1.Z$0 = false;
                            formattedTextConverter$safeConvert$1.Z$1 = z;
                            formattedTextConverter$safeConvert$1.Z$2 = false;
                            formattedTextConverter$safeConvert$1.label = 1;
                            obj = bvf0.n(new FormattedTextConverter$awaitConvert$2(this, formattedText, z, false, false, map, null), formattedTextConverter$safeConvert$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            formattedText2 = formattedText;
                            map3 = map;
                            z4 = false;
                            z5 = false;
                        } catch (Throwable unused) {
                            formattedText2 = formattedText;
                            z3 = false;
                            map2 = map;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            d(spannableStringBuilder, formattedText2.a, z3, z2, map2);
                            return spannableStringBuilder;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z4 = formattedTextConverter$safeConvert$1.Z$2;
                        z5 = formattedTextConverter$safeConvert$1.Z$0;
                        map3 = (Map) formattedTextConverter$safeConvert$1.L$1;
                        formattedText2 = (FormattedText) formattedTextConverter$safeConvert$1.L$0;
                        try {
                            kotlin.b.b(obj);
                        } catch (Throwable unused2) {
                            z2 = z4;
                            map2 = map3;
                            z3 = z5;
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                            d(spannableStringBuilder2, formattedText2.a, z3, z2, map2);
                            return spannableStringBuilder2;
                        }
                    }
                    return (CharSequence) obj;
                }
            }
            if (i != 0) {
            }
            return (CharSequence) obj;
        } catch (CancellationException e) {
            throw e;
        }
        formattedTextConverter$safeConvert$1 = new FormattedTextConverter$safeConvert$1(this, continuation);
        Object obj2 = formattedTextConverter$safeConvert$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formattedTextConverter$safeConvert$1.label;
    }
}
