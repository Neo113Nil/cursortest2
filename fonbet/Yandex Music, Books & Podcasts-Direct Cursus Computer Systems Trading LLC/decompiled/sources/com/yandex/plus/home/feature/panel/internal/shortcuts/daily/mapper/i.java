package com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.yandex.passport.internal.core.accounts.r;
import com.yandex.passport.internal.ui.bouncer.roundabout.k;
import defpackage.cg6;
import defpackage.jhp;
import defpackage.jyr;
import defpackage.kcc;
import defpackage.lcc;
import defpackage.nm6;
import defpackage.o7t;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z75;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;

/* loaded from: classes5.dex */
public final class i {
    public final kotlinx.coroutines.a a;
    public final SpannableStringBuilder b;

    public i(String str, kotlinx.coroutines.a aVar) {
        str.getClass();
        aVar.getClass();
        this.a = aVar;
        this.b = new SpannableStringBuilder(str);
    }

    public final lcc a(String str) {
        return new lcc(new o7t(Regex.c(new Regex(str), this.b), new com.yandex.plus.bdui.plus.webview.navigation.a(22)), true, new com.yandex.plus.bdui.plus.webview.navigation.a(23));
    }

    public final void b(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            z75.t(arrayList, jhp.k(new o7t(a(fVar.a), new k(23, fVar))));
        }
        for (Pair pair : CollectionsKt.j0(CollectionsKt.o0(arrayList, new r(6)))) {
            f fVar2 = (f) pair.a;
            int intValue = ((Number) pair.b).intValue();
            int length = fVar2.a.length() + intValue;
            boolean z = fVar2.d;
            boolean z2 = fVar2.e;
            StyleSpan styleSpan = new StyleSpan((z && z2) ? 3 : z ? 1 : z2 ? 2 : 0);
            SpannableStringBuilder spannableStringBuilder = this.b;
            spannableStringBuilder.setSpan(styleSpan, intValue, length, 34);
            Integer num = fVar2.c;
            if (num != null) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), intValue, length, 34);
            }
            spannableStringBuilder.replace(intValue, length, (CharSequence) fVar2.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper.i, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0055 -> B:10:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, com.yandex.plus.core.imageloader.b bVar, cg6 cg6Var) {
        g gVar;
        int i;
        Iterator it;
        int i2;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i3 = gVar.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.s = i3 - Integer.MIN_VALUE;
                Object obj = gVar.q;
                nm6 nm6Var = nm6.a;
                i = gVar.s;
                if (i != 0) {
                    qgg.h0(obj);
                    it = list.iterator();
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = gVar.p;
                    int i5 = gVar.o;
                    int i6 = gVar.n;
                    ?? r5 = gVar.m;
                    e eVar = gVar.l;
                    Iterator it2 = gVar.k;
                    com.yandex.plus.core.imageloader.b bVar2 = gVar.j;
                    qgg.h0(obj);
                    int i7 = i4;
                    it = it2;
                    e eVar2 = eVar;
                    kcc kccVar = r5;
                    g gVar2 = gVar;
                    int i8 = i5;
                    com.yandex.plus.core.imageloader.b bVar3 = bVar2;
                    while (kccVar.hasNext()) {
                        int intValue = ((Number) kccVar.next()).intValue();
                        gVar2.getClass();
                        gVar2.j = bVar3;
                        gVar2.k = it;
                        gVar2.l = eVar2;
                        gVar2.m = kccVar;
                        gVar2.n = i6;
                        gVar2.o = i8;
                        gVar2.p = i7;
                        gVar2.s = 1;
                        if (d(eVar2, bVar3, intValue, gVar2) == nm6Var) {
                            return nm6Var;
                        }
                    }
                    bVar = bVar3;
                    i2 = i6;
                    gVar = gVar2;
                    if (it.hasNext()) {
                        e eVar3 = (e) it.next();
                        kccVar = new kcc(a(eVar3.a));
                        gVar2 = gVar;
                        eVar2 = eVar3;
                        i8 = 0;
                        i6 = i2;
                        bVar3 = bVar;
                        i7 = 0;
                        while (kccVar.hasNext()) {
                        }
                        bVar = bVar3;
                        i2 = i6;
                        gVar = gVar2;
                        if (it.hasNext()) {
                            return this;
                        }
                    }
                }
            }
        }
        gVar = new g(this, cg6Var);
        Object obj2 = gVar.q;
        nm6 nm6Var2 = nm6.a;
        i = gVar.s;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(e eVar, com.yandex.plus.core.imageloader.b bVar, int i, cg6 cg6Var) {
        h hVar;
        int i2;
        int length;
        Object V;
        Throwable th;
        t7o t7oVar;
        wis e;
        Throwable a;
        Drawable drawable;
        try {
            if (cg6Var instanceof h) {
                hVar = (h) cg6Var;
                int i3 = hVar.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    hVar.o = i3 - Integer.MIN_VALUE;
                    Object obj = hVar.m;
                    nm6 nm6Var = nm6.a;
                    i2 = hVar.o;
                    Object[] objArr = 0;
                    if (i2 != 0) {
                        qgg.h0(obj);
                        length = eVar.a.length() + i;
                        try {
                            r7o r7oVar = z7o.b;
                            kotlinx.coroutines.a aVar = this.a;
                            com.yandex.plus.bdui.ui.b bVar2 = new com.yandex.plus.bdui.ui.b(bVar, eVar, objArr == true ? 1 : 0, 15);
                            hVar.j = eVar;
                            hVar.k = i;
                            hVar.l = length;
                            hVar.o = 1;
                            V = x97.V(aVar, bVar2, hVar);
                            if (V == nm6Var) {
                                return nm6Var;
                            }
                        } catch (wis e2) {
                            e = e2;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            V = t7oVar;
                            a = z7o.a(V);
                            if (a != null) {
                            }
                            drawable = (Drawable) (V instanceof t7o ? null : V);
                            SpannableStringBuilder spannableStringBuilder = this.b;
                            if (drawable == null) {
                            }
                            return Unit.a;
                        } catch (Throwable th2) {
                            th = th2;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            V = t7oVar;
                            a = z7o.a(V);
                            if (a != null) {
                            }
                            drawable = (Drawable) (V instanceof t7o ? null : V);
                            SpannableStringBuilder spannableStringBuilder2 = this.b;
                            if (drawable == null) {
                            }
                            return Unit.a;
                        }
                    } else {
                        if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i4 = hVar.l;
                        i = hVar.k;
                        e eVar2 = hVar.j;
                        try {
                            qgg.h0(obj);
                            length = i4;
                            eVar = eVar2;
                            V = obj;
                        } catch (wis e3) {
                            length = i4;
                            eVar = eVar2;
                            e = e3;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            V = t7oVar;
                            a = z7o.a(V);
                            if (a != null) {
                            }
                            drawable = (Drawable) (V instanceof t7o ? null : V);
                            SpannableStringBuilder spannableStringBuilder22 = this.b;
                            if (drawable == null) {
                            }
                            return Unit.a;
                        } catch (Throwable th3) {
                            length = i4;
                            eVar = eVar2;
                            th = th3;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            V = t7oVar;
                            a = z7o.a(V);
                            if (a != null) {
                            }
                            drawable = (Drawable) (V instanceof t7o ? null : V);
                            SpannableStringBuilder spannableStringBuilder222 = this.b;
                            if (drawable == null) {
                            }
                            return Unit.a;
                        }
                    }
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(V);
                    if (a != null) {
                        com.yandex.plus.core.analytics.logging.b bVar3 = com.yandex.plus.core.analytics.logging.b.b;
                        String str = "Failed to load image from " + eVar.b;
                        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar3, str, a);
                    }
                    drawable = (Drawable) (V instanceof t7o ? null : V);
                    SpannableStringBuilder spannableStringBuilder2222 = this.b;
                    if (drawable == null) {
                        spannableStringBuilder2222.setSpan(new com.yandex.plus.home.common.utils.spantext.a(drawable), i, length, 34);
                    } else {
                        spannableStringBuilder2222.replace(i, length, (CharSequence) eVar.c);
                    }
                    return Unit.a;
                }
            }
            if (i2 != 0) {
            }
            r7o r7oVar42 = z7o.b;
            a = z7o.a(V);
            if (a != null) {
            }
            drawable = (Drawable) (V instanceof t7o ? null : V);
            SpannableStringBuilder spannableStringBuilder22222 = this.b;
            if (drawable == null) {
            }
            return Unit.a;
        } catch (CancellationException e4) {
            throw e4;
        }
        hVar = new h(this, cg6Var);
        Object obj2 = hVar.m;
        nm6 nm6Var2 = nm6.a;
        i2 = hVar.o;
        Object[] objArr2 = 0;
    }
}
