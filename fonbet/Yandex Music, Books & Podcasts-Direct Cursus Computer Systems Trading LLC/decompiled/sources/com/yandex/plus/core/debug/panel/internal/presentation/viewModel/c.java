package com.yandex.plus.core.debug.panel.internal.presentation.viewModel;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StyleSpan;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.debug.panel.internal.model.log.e;
import com.yandex.plus.core.debug.panel.internal.model.log.g;
import com.yandex.plus.core.debug.panel.internal.model.log.h;
import com.yandex.plus.core.debug.panel.internal.model.log.i;
import com.yandex.plus.core.debug.panel.internal.model.log.j;
import com.yandex.plus.core.debug.panel.internal.model.log.k;
import com.yandex.plus.core.debug.panel.internal.model.ui.d;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.ev6;
import defpackage.fkn;
import defpackage.jyr;
import defpackage.lbq;
import defpackage.ow1;
import defpackage.t75;
import defpackage.tf6;
import defpackage.u75;
import defpackage.v75;
import defpackage.xdr;
import defpackage.xz0;
import defpackage.ydr;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class c {
    public final com.yandex.plus.core.debug.panel.internal.presentation.state.c a;
    public final tf6 b;
    public final f c;
    public final com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a d;
    public final com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a e;
    public final com.yandex.plus.core.debug.panel.api.a f;
    public final Function0 g;
    public final ArrayList h;
    public final xdr i;
    public final xdr j;
    public final b k;
    public final xdr l;
    public int m;
    public final xdr n;
    public final xdr o;
    public final xdr p;
    public final fkn q;

    public c(com.yandex.plus.core.debug.panel.internal.presentation.state.c cVar, tf6 tf6Var, f fVar, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a aVar, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a aVar2, com.yandex.plus.core.debug.panel.api.a aVar3, Function0 function0) {
        cVar.getClass();
        fVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        function0.getClass();
        this.a = cVar;
        this.b = tf6Var;
        this.c = fVar;
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
        this.g = function0;
        this.h = new ArrayList();
        c5b c5bVar = c5b.a;
        this.i = ydr.a(c5bVar);
        xdr a = ydr.a(c5bVar);
        this.j = a;
        this.k = new b(0, a);
        Continuation continuation = null;
        this.l = ydr.a(null);
        this.m = -1;
        com.yandex.plus.core.debug.panel.internal.model.log.f.b.getClass();
        List h = u75.h(com.yandex.plus.core.debug.panel.internal.model.log.f.VERBOSE, com.yandex.plus.core.debug.panel.internal.model.log.f.DEBUG, com.yandex.plus.core.debug.panel.internal.model.log.f.INFO, com.yandex.plus.core.debug.panel.internal.model.log.f.WARN, com.yandex.plus.core.debug.panel.internal.model.log.f.ERROR, com.yandex.plus.core.debug.panel.internal.model.log.f.UNSPECIFIED);
        ArrayList arrayList = new ArrayList(v75.o(h, 10));
        Iterator it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(new e((com.yandex.plus.core.debug.panel.internal.model.log.f) it.next(), true));
        }
        this.n = ydr.a(arrayList);
        com.yandex.plus.core.debug.panel.internal.model.log.f.b.getClass();
        List h2 = u75.h(com.yandex.plus.core.debug.panel.internal.model.log.f.TIMESTAMP, com.yandex.plus.core.debug.panel.internal.model.log.f.TAG, com.yandex.plus.core.debug.panel.internal.model.log.f.LEVEL, com.yandex.plus.core.debug.panel.internal.model.log.f.RAW_LEVEL, com.yandex.plus.core.debug.panel.internal.model.log.f.MESSAGE, com.yandex.plus.core.debug.panel.internal.model.log.f.LOCATION, com.yandex.plus.core.debug.panel.internal.model.log.f.FUNCTION, com.yandex.plus.core.debug.panel.internal.model.log.f.THREAD, com.yandex.plus.core.debug.panel.internal.model.log.f.THREAD_SEQUENCE);
        ArrayList arrayList2 = new ArrayList(v75.o(h2, 10));
        Iterator it2 = h2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new e((com.yandex.plus.core.debug.panel.internal.model.log.f) it2.next(), true));
        }
        this.o = ydr.a(arrayList2);
        xdr a2 = ydr.a(null);
        this.p = a2;
        this.q = zsd.F0(zsd.Q(this.i, this.k, a2, new ev6(this, continuation, 3)), this.b, lbq.b, new com.yandex.plus.core.debug.panel.internal.presentation.state.e(c5b.a, 0, false, null));
        com.yandex.plus.bdui.flex.ui.a.i(this.a.a, this.b, new ow1(this, continuation, 12));
    }

    public final void a() {
        d dVar;
        int i;
        i iVar;
        Iterable iterable = (Iterable) this.a.a.getValue();
        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
        for (Iterator it = iterable.iterator(); it.hasNext(); it = it) {
            com.yandex.plus.core.debug.panel.api.data.c cVar = (com.yandex.plus.core.debug.panel.api.data.c) it.next();
            this.e.getClass();
            cVar.getClass();
            com.yandex.plus.core.debug.panel.api.data.e eVar = cVar.b;
            h hVar = new h(R.string.plus_sdk_debug_panel_log_session_id, eVar.a);
            h hVar2 = new h(R.string.plus_sdk_debug_panel_timestamp, eVar.b);
            h hVar3 = new h(R.string.plus_sdk_debug_panel_tag, eVar.c);
            int ordinal = eVar.d.ordinal();
            if (ordinal == 0) {
                iVar = i.a;
            } else if (ordinal == 1) {
                iVar = i.b;
            } else if (ordinal == 2) {
                iVar = i.c;
            } else if (ordinal == 3) {
                iVar = i.d;
            } else if (ordinal == 4) {
                iVar = i.e;
            } else {
                if (ordinal != 5) {
                    b6e.s();
                    return;
                }
                iVar = i.f;
            }
            j jVar = new j(hVar, hVar2, hVar3, new h(R.string.plus_sdk_debug_panel_level, iVar), new h(R.string.plus_sdk_debug_panel_raw_level, eVar.e), new h(R.string.plus_sdk_debug_panel_message, eVar.f), new h(R.string.plus_sdk_debug_panel_location, eVar.g), new h(R.string.plus_sdk_debug_panel_function, eVar.h), new h(R.string.plus_sdk_debug_panel_thread, eVar.i), new h(R.string.plus_sdk_debug_panel_thread_sequence, eVar.j));
            String str = cVar.a;
            arrayList.add(new k(str, str, jVar));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar = (k) it2.next();
            j jVar2 = kVar.c;
            ArrayList g0 = CollectionsKt.g0((Collection) this.o.getValue(), (Iterable) this.n.getValue());
            this.d.getClass();
            h hVar4 = jVar2.b;
            h hVar5 = jVar2.d;
            List w = xz0.w(new h[]{com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a.a(com.yandex.plus.core.debug.panel.internal.model.log.f.TIMESTAMP, g0) ? hVar4 : null, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a.a(com.yandex.plus.core.debug.panel.internal.model.log.f.TAG, g0) ? jVar2.c : null, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a.a(com.yandex.plus.core.debug.panel.internal.model.log.f.LEVEL, g0) ? hVar5 : null, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a.a(com.yandex.plus.core.debug.panel.internal.model.log.f.RAW_LEVEL, g0) ? jVar2.e : null, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a.a(com.yandex.plus.core.debug.panel.internal.model.log.f.MESSAGE, g0) ? jVar2.f : null, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a.a(com.yandex.plus.core.debug.panel.internal.model.log.f.LOCATION, g0) ? jVar2.g : null, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a.a(com.yandex.plus.core.debug.panel.internal.model.log.f.FUNCTION, g0) ? jVar2.h : null, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a.a(com.yandex.plus.core.debug.panel.internal.model.log.f.THREAD, g0) ? jVar2.i : null, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a.a(com.yandex.plus.core.debug.panel.internal.model.log.f.THREAD_SEQUENCE, g0) ? jVar2.j : null});
            if (((ArrayList) w).isEmpty()) {
                w = c5b.a;
            } else if (!((ArrayList) xz0.w(new i[]{com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a.a(com.yandex.plus.core.debug.panel.internal.model.log.f.VERBOSE, g0) ? i.a : null, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a.a(com.yandex.plus.core.debug.panel.internal.model.log.f.DEBUG, g0) ? i.b : null, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a.a(com.yandex.plus.core.debug.panel.internal.model.log.f.INFO, g0) ? i.c : null, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a.a(com.yandex.plus.core.debug.panel.internal.model.log.f.WARN, g0) ? i.d : null, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a.a(com.yandex.plus.core.debug.panel.internal.model.log.f.ERROR, g0) ? i.e : null, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a.a(com.yandex.plus.core.debug.panel.internal.model.log.f.UNSPECIFIED, g0) ? i.f : null})).contains(hVar5.b)) {
                w = c5b.a;
            }
            if (w.isEmpty()) {
                w = null;
            }
            if (w != null) {
                String str2 = kVar.a;
                Context context = ((com.yandex.plus.core.debug.panel.internal.utils.resource.a) this.c.c).a;
                str2.getClass();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i2 = 0;
                for (Object obj : w) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        u75.n();
                        throw null;
                    }
                    h hVar6 = (h) obj;
                    int i4 = hVar6.a;
                    Object obj2 = hVar6.b;
                    String string = context.getString(i4);
                    string.getClass();
                    StyleSpan styleSpan = new StyleSpan(1);
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) string.concat(": "));
                    spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
                    if (obj2 instanceof i) {
                        i iVar2 = (i) obj2;
                        int ordinal2 = iVar2.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 == 1) {
                                i = R.color.home_sdk_semantic_text_status_neutral;
                            } else if (ordinal2 == 2) {
                                i = R.color.home_sdk_semantic_text_status_success;
                            } else if (ordinal2 == 3) {
                                i = R.color.home_sdk_semantic_text_status_warning;
                            } else if (ordinal2 == 4) {
                                i = R.color.home_sdk_semantic_text_status_alert;
                            } else if (ordinal2 != 5) {
                                b6e.s();
                                return;
                            }
                            context.getClass();
                            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(com.yandex.plus.home.common.utils.a.a(context, i));
                            int length2 = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) iVar2.name());
                            spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 17);
                        }
                        i = R.color.home_sdk_semantic_text_secondary;
                        context.getClass();
                        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(com.yandex.plus.home.common.utils.a.a(context, i));
                        int length22 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) iVar2.name());
                        spannableStringBuilder.setSpan(foregroundColorSpan2, length22, spannableStringBuilder.length(), 17);
                    } else {
                        spannableStringBuilder.append((CharSequence) String.valueOf(obj2));
                    }
                    if (i2 < w.size() - 1) {
                        spannableStringBuilder.append((CharSequence) StringUtil.LF);
                    }
                    i2 = i3;
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(new SpannedString(spannableStringBuilder));
                int i5 = 0;
                while (i5 < spannableStringBuilder2.length()) {
                    int S = StringsKt.S(spannableStringBuilder2, '\n', i5, 4);
                    Integer valueOf = Integer.valueOf(S);
                    if (S == -1) {
                        valueOf = null;
                    }
                    int intValue = valueOf != null ? valueOf.intValue() : spannableStringBuilder2.length();
                    spannableStringBuilder2.setSpan(new LeadingMarginSpan.Standard(0, 200), i5, intValue, 33);
                    i5 = intValue + 1;
                }
                dVar = new d(str2, new SpannedString(spannableStringBuilder2));
            } else {
                dVar = null;
            }
            if (dVar != null) {
                arrayList2.add(dVar);
            }
        }
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        xdr xdrVar = this.i;
        xdrVar.getClass();
        xdrVar.m(null, arrayList2);
    }

    public final void b() {
        xdr xdrVar;
        Object value;
        List list = (List) this.j.getValue();
        boolean isEmpty = list.isEmpty();
        f fVar = this.c;
        ArrayList arrayList = this.h;
        if (!isEmpty) {
            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    u75.n();
                    throw null;
                }
                d dVar = (d) next;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list) {
                    if (((g) obj).a == i) {
                        arrayList3.add(obj);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    fVar.getClass();
                    dVar.getClass();
                    SpannedString spannedString = dVar.b;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) spannedString);
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        g gVar = (g) it2.next();
                        int i3 = gVar.b;
                        int i4 = gVar.c;
                        Context context = ((com.yandex.plus.core.debug.panel.internal.utils.resource.a) fVar.c).a;
                        context.getClass();
                        spannableStringBuilder.setSpan(new BackgroundColorSpan(com.yandex.plus.home.common.utils.a.a(context, R.color.plus_sdk_match_highlight)), i3, i4, 17);
                    }
                    dVar = d.a(dVar, new SpannedString(spannableStringBuilder));
                }
                arrayList2.add(dVar);
                i = i2;
            }
            arrayList = arrayList2;
        }
        do {
            xdrVar = this.i;
            value = xdrVar.getValue();
        } while (!xdrVar.k(value, arrayList.isEmpty() ? t75.c((d) ((jyr) fVar.b).getValue()) : arrayList));
    }

    public final void c() {
        this.i.l(CollectionsKt.w0(this.h));
        this.j.l(c5b.a);
        this.l.l(null);
        this.m = -1;
    }

    public final void d(int i) {
        xdr xdrVar;
        Object value;
        com.yandex.plus.core.debug.panel.internal.model.log.a aVar;
        g gVar;
        com.yandex.plus.core.debug.panel.internal.model.log.a aVar2;
        g gVar2;
        List list = (List) this.j.getValue();
        do {
            xdrVar = this.l;
            value = xdrVar.getValue();
            if (list.isEmpty()) {
                aVar = null;
            } else {
                int i2 = this.m;
                Object obj = (i2 < 0 || i2 >= list.size()) ? (g) CollectionsKt.Q(list) : list.get(i2);
                this.m = i;
                aVar = new com.yandex.plus.core.debug.panel.internal.model.log.a((g) obj, (g) list.get(i));
            }
        } while (!xdrVar.k(value, aVar));
        xdr xdrVar2 = this.i;
        ArrayList y0 = CollectionsKt.y0((Collection) xdrVar2.getValue());
        com.yandex.plus.core.debug.panel.internal.model.log.a aVar3 = (com.yandex.plus.core.debug.panel.internal.model.log.a) xdrVar.getValue();
        if (aVar3 == null || (gVar = aVar3.a) == null || (aVar2 = (com.yandex.plus.core.debug.panel.internal.model.log.a) xdrVar.getValue()) == null || (gVar2 = aVar2.b) == null) {
            return;
        }
        int i3 = gVar.a;
        d dVar = (d) y0.get(i3);
        f fVar = this.c;
        d h = fVar.h(dVar, gVar, false);
        int i4 = gVar2.a;
        d h2 = fVar.h(i3 != i4 ? (d) y0.get(i4) : h, gVar2, true);
        if (i3 != i4) {
            y0.set(i3, h);
        }
        y0.set(i4, h2);
        xdrVar2.m(null, y0);
    }
}
