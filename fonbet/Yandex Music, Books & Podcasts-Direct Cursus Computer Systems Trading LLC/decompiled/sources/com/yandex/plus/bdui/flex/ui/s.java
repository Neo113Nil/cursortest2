package com.yandex.plus.bdui.flex.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.text.style.UpdateAppearance;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.serializer.h2;
import com.yandex.plus.home.feature.webviews.internal.uri.u;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.a4g;
import defpackage.b6e;
import defpackage.btf;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.e3o;
import defpackage.eno;
import defpackage.ezc;
import defpackage.f1d;
import defpackage.gld;
import defpackage.h8e;
import defpackage.hrg;
import defpackage.huw;
import defpackage.jyr;
import defpackage.l1j;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.q5b;
import defpackage.qgg;
import defpackage.qxe;
import defpackage.r0w;
import defpackage.r2f;
import defpackage.r7o;
import defpackage.s9f;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.tpi;
import defpackage.tqn;
import defpackage.u13;
import defpackage.u75;
import defpackage.uf6;
import defpackage.ujd;
import defpackage.v75;
import defpackage.vdr;
import defpackage.vqn;
import defpackage.wdu;
import defpackage.wop;
import defpackage.wqn;
import defpackage.wxm;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.xz0;
import defpackage.y2x;
import defpackage.ydr;
import defpackage.z7o;
import defpackage.zne;
import defpackage.zt3;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class s implements com.yandex.plus.home.feature.panel.internalapi.c, com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.a {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;

    public s(List list, List list2, vdr vdrVar, kotlinx.coroutines.a aVar, com.yandex.plus.home.feature.webviews.internal.container.t tVar, com.yandex.passport.sloth.ui.c cVar, com.yandex.passport.internal.core.accounts.h hVar, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a aVar2, com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a aVar3, zne zneVar) {
        list.getClass();
        list2.getClass();
        vdrVar.getClass();
        aVar.getClass();
        zneVar.getClass();
        this.b = vdrVar;
        this.c = tVar;
        this.d = cVar;
        this.e = gld.e(aVar.plus(a4g.n()));
        List<com.yandex.plus.core.debug.panel.api.data.b> list3 = list;
        ArrayList arrayList = new ArrayList(v75.o(list3, 10));
        for (com.yandex.plus.core.debug.panel.api.data.b bVar : list3) {
            bVar.getClass();
            com.yandex.plus.core.debug.panel.api.data.a aVar4 = bVar.a;
            arrayList.add(new com.yandex.plus.core.debug.panel.internal.model.ui.f(aVar4.name(), aVar4.name() + '\n' + bVar.b));
        }
        this.a = arrayList;
        List list4 = list2;
        ArrayList arrayList2 = new ArrayList(v75.o(list4, 10));
        Iterator it = list4.iterator();
        if (it.hasNext()) {
            throw hrg.j(it);
        }
        this.f = arrayList2;
        this.g = ydr.a(new com.yandex.plus.core.debug.panel.internal.presentation.state.b(arrayList, arrayList2));
    }

    public static final void a(s sVar, View view) {
        try {
            r7o r7oVar = z7o.b;
            view.getViewTreeObserver().addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener) ((SparseArray) sVar.a).get(view.getId()));
            view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) ((SparseArray) sVar.f).get(view.getId()));
        } catch (Throwable unused) {
            r7o r7oVar2 = z7o.b;
        }
    }

    public static final void b(s sVar, View view) {
        SparseArray sparseArray = (SparseArray) sVar.d;
        int id = view.getId();
        Object obj = sparseArray.get(id);
        if (obj != null) {
            sparseArray.remove(id);
        } else {
            obj = null;
        }
        r2f r2fVar = (r2f) obj;
        if (r2fVar != null) {
            r2fVar.g(null);
        }
        SparseArray sparseArray2 = (SparseArray) sVar.e;
        int id2 = view.getId();
        Object obj2 = sparseArray2.get(id2);
        if (obj2 != null) {
            sparseArray2.remove(id2);
        } else {
            obj2 = null;
        }
        r2f r2fVar2 = (r2f) obj2;
        if (r2fVar2 != null) {
            r2fVar2.g(null);
        }
    }

    public static final void c(s sVar, View view, boolean z) {
        SparseArray sparseArray = (SparseArray) sVar.d;
        if (sparseArray.get(view.getId()) != null) {
            return;
        }
        sparseArray.put(view.getId(), x97.y((tf6) sVar.c, null, null, new com.yandex.plus.home.feature.panel.internalapi.d(sVar, view, z, (Continuation) null), 3));
    }

    public static final void d(s sVar, View view) {
        try {
            r7o r7oVar = z7o.b;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            SparseArray sparseArray = (SparseArray) sVar.a;
            int id = view.getId();
            Object obj = sparseArray.get(id);
            Object obj2 = null;
            if (obj != null) {
                sparseArray.remove(id);
            } else {
                obj = null;
            }
            viewTreeObserver.removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener) obj);
            SparseArray sparseArray2 = (SparseArray) sVar.f;
            int id2 = view.getId();
            Object obj3 = sparseArray2.get(id2);
            if (obj3 != null) {
                sparseArray2.remove(id2);
                obj2 = obj3;
            }
            viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) obj2);
        } catch (Throwable unused) {
            r7o r7oVar2 = z7o.b;
        }
    }

    public static void g(Uri.Builder builder, tpi tpiVar) {
        Object[] objArr = tpiVar.b;
        Object[] objArr2 = tpiVar.c;
        long[] jArr = tpiVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        String str = (String) objArr[i4];
                        for (String str2 : (Set) objArr2[i4]) {
                            if (str2.length() > 0 || !str2.equalsIgnoreCase("null")) {
                                builder.appendQueryParameter(str, str2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static void h(Uri.Builder builder, Uri uri) {
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        queryParameterNames.getClass();
        for (String str : queryParameterNames) {
            List<String> queryParameters = uri.getQueryParameters(str);
            queryParameters.getClass();
            Iterator<T> it = queryParameters.iterator();
            while (it.hasNext()) {
                builder.appendQueryParameter(str, (String) it.next());
            }
        }
    }

    public static String l() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        str2.getClass();
        str.getClass();
        if (kotlin.text.c.v(str2, str, false)) {
            if (str2.length() <= 0) {
                return str2;
            }
            StringBuilder sb = new StringBuilder();
            String valueOf = String.valueOf(str2.charAt(0));
            valueOf.getClass();
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            sb.append((Object) upperCase);
            sb.append(str2.substring(1));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        if (str.length() > 0) {
            StringBuilder sb3 = new StringBuilder();
            String valueOf2 = String.valueOf(str.charAt(0));
            valueOf2.getClass();
            String upperCase2 = valueOf2.toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            sb3.append((Object) upperCase2);
            sb3.append(str.substring(1));
            str = sb3.toString();
        }
        sb2.append(str);
        sb2.append(' ');
        sb2.append(str2);
        return sb2.toString();
    }

    public static boolean p(Uri uri) {
        return kotlin.text.c.o(uri.getScheme(), "http", true) || kotlin.text.c.o(uri.getScheme(), "https", true);
    }

    public Uri A(com.yandex.plus.home.feature.webviews.internal.uri.j jVar) {
        Uri uri;
        String str;
        String str2 = (String) this.f;
        jVar.getClass();
        if (jVar instanceof com.yandex.plus.home.feature.webviews.internal.uri.b) {
            com.yandex.plus.home.feature.webviews.internal.uri.b bVar = (com.yandex.plus.home.feature.webviews.internal.uri.b) jVar;
            Uri.Builder authority = new Uri.Builder().scheme(str2).authority("plus-home-sdk");
            boolean z = bVar.b;
            Uri uri2 = bVar.a;
            Uri.Builder path = authority.path(z ? "buyplus" : "home");
            path.getClass();
            h(path, uri2);
            String str3 = bVar.c;
            if (str3 != null) {
                path.appendQueryParameter(Constants.KEY_MESSAGE, str3);
            }
            uri = path.fragment(uri2.getFragment()).build();
            uri.getClass();
        } else {
            String str4 = "ONLY_ARROW";
            String str5 = "card";
            if (jVar instanceof com.yandex.plus.home.feature.webviews.internal.uri.f) {
                com.yandex.plus.home.feature.webviews.internal.uri.f fVar = (com.yandex.plus.home.feature.webviews.internal.uri.f) jVar;
                Uri.Builder path2 = new Uri.Builder().scheme(str2).authority("plus-home-sdk").path("smart-webview");
                path2.getClass();
                Uri uri3 = fVar.a;
                Boolean bool = fVar.k;
                String uri4 = uri3.toString();
                if (uri4 != null) {
                    path2.appendQueryParameter("url", uri4);
                }
                com.yandex.plus.home.feature.webviews.internal.uri.i iVar = fVar.b;
                int i = iVar == null ? -1 : u.a[iVar.ordinal()];
                if (i == -1) {
                    str5 = null;
                } else if (i != 1) {
                    if (i != 2) {
                        b6e.s();
                        return null;
                    }
                    str5 = "full";
                }
                if (str5 != null) {
                    path2.appendQueryParameter("openFormat", str5);
                }
                com.yandex.plus.home.feature.webviews.internal.uri.d dVar = fVar.c;
                int i2 = dVar == null ? -1 : u.b[dVar.ordinal()];
                if (i2 == -1) {
                    str = null;
                } else if (i2 == 1) {
                    str = "fixed";
                } else {
                    if (i2 != 2) {
                        b6e.s();
                        return null;
                    }
                    str = "percent";
                }
                if (str != null) {
                    path2.appendQueryParameter("modalHeightType", str);
                }
                Integer num = fVar.d;
                String num2 = num != null ? num.toString() : null;
                if (num2 != null) {
                    path2.appendQueryParameter("modalHeightValue", num2);
                }
                String str6 = fVar.e;
                if (str6 != null) {
                    path2.appendQueryParameter("plus-smart-broadcast-id", str6);
                }
                Integer num3 = fVar.f;
                String num4 = num3 != null ? num3.toString() : null;
                if (num4 != null) {
                    path2.appendQueryParameter("shadowAlpha", num4);
                }
                Boolean bool2 = fVar.g;
                String bool3 = bool2 != null ? bool2.toString() : null;
                if (bool3 != null) {
                    path2.appendQueryParameter("disableClose", bool3);
                }
                Boolean bool4 = fVar.h;
                String bool5 = bool4 != null ? bool4.toString() : null;
                if (bool5 != null) {
                    path2.appendQueryParameter("showNavBar", bool5);
                }
                Boolean bool6 = fVar.i;
                String bool7 = bool6 != null ? bool6.toString() : null;
                if (bool7 != null) {
                    path2.appendQueryParameter("showDash", bool7);
                }
                Boolean bool8 = fVar.j;
                Boolean bool9 = Boolean.TRUE;
                if (Intrinsics.d(bool8, bool9) && Intrinsics.d(bool, bool9)) {
                    str4 = "CROSS_AND_ARROW";
                } else if (!Intrinsics.d(bool, bool9)) {
                    str4 = null;
                }
                if (str4 != null) {
                    path2.appendQueryParameter("navBarType", str4);
                }
                String str7 = fVar.l;
                if (str7 != null) {
                    path2.appendQueryParameter(Constants.KEY_MESSAGE, str7);
                }
                uri = path2.build();
                uri.getClass();
            } else if (jVar instanceof com.yandex.plus.home.feature.webviews.internal.uri.g) {
                com.yandex.plus.home.feature.webviews.internal.uri.g gVar = (com.yandex.plus.home.feature.webviews.internal.uri.g) jVar;
                Uri.Builder path3 = new Uri.Builder().scheme(str2).authority("plus-home-sdk").path("story");
                path3.getClass();
                String str8 = gVar.c;
                Uri uri5 = gVar.a;
                if (str8 != null) {
                    path3.appendQueryParameter(Constants.KEY_MESSAGE, str8);
                }
                h(path3, uri5);
                uri = path3.fragment(uri5.getFragment()).build();
                uri.getClass();
            } else if (jVar instanceof com.yandex.plus.home.feature.webviews.internal.uri.e) {
                com.yandex.plus.home.feature.webviews.internal.uri.e eVar = (com.yandex.plus.home.feature.webviews.internal.uri.e) jVar;
                Uri.Builder path4 = new Uri.Builder().scheme(str2).authority("plus-home-sdk").path("simple-webview");
                path4.getClass();
                Uri uri6 = eVar.a;
                Boolean bool10 = eVar.g;
                String uri7 = uri6.toString();
                if (uri7 != null) {
                    path4.appendQueryParameter("url", uri7);
                }
                path4.appendQueryParameter("plusSdkOpenType", eVar.b ? "out" : "in");
                com.yandex.plus.home.feature.webviews.internal.uri.i iVar2 = eVar.c;
                int i3 = iVar2 == null ? -1 : u.a[iVar2.ordinal()];
                if (i3 == -1) {
                    str5 = null;
                } else if (i3 != 1) {
                    if (i3 != 2) {
                        b6e.s();
                        return null;
                    }
                    str5 = "full";
                }
                if (str5 != null) {
                    path4.appendQueryParameter("openFormat", str5);
                }
                Boolean bool11 = eVar.d;
                String bool12 = bool11 != null ? bool11.toString() : null;
                if (bool12 != null) {
                    path4.appendQueryParameter("showNavBar", bool12);
                }
                Boolean bool13 = eVar.e;
                String bool14 = bool13 != null ? bool13.toString() : null;
                if (bool14 != null) {
                    path4.appendQueryParameter("showDash", bool14);
                }
                Boolean bool15 = eVar.f;
                Boolean bool16 = Boolean.TRUE;
                if (Intrinsics.d(bool15, bool16) && Intrinsics.d(bool10, bool16)) {
                    str4 = "CROSS_AND_ARROW";
                } else if (!Intrinsics.d(bool10, bool16)) {
                    str4 = null;
                }
                if (str4 != null) {
                    path4.appendQueryParameter("navBarType", str4);
                }
                uri = path4.appendQueryParameter("plusSdkNeedAuth", String.valueOf(eVar.h)).build();
                uri.getClass();
            } else if (jVar instanceof com.yandex.plus.home.feature.webviews.internal.uri.a) {
                uri = new Uri.Builder().scheme(str2).authority("plus-home-sdk").path("debug-panel").build();
                uri.getClass();
            } else if (jVar instanceof com.yandex.plus.home.feature.webviews.internal.uri.c) {
                uri = ((com.yandex.plus.home.feature.webviews.internal.uri.c) jVar).a;
            } else {
                if (!(jVar instanceof com.yandex.plus.home.feature.webviews.internal.uri.h)) {
                    b6e.s();
                    return null;
                }
                uri = ((com.yandex.plus.home.feature.webviews.internal.uri.h) jVar).a;
            }
        }
        com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) this.a;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        if (bVar2.b(aVar)) {
            bVar2.c(aVar, "DeeplinkParserImpl", "unparse(" + jVar + "): " + uri);
        }
        return uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void B() {
        com.yandex.plus.core.debug.panel.api.data.d dVar;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        ReentrantLock reentrantLock = com.yandex.plus.core.analytics.logging.f.b;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList(com.yandex.plus.core.analytics.logging.f.c);
            reentrantLock.unlock();
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
                com.yandex.plus.core.analytics.logging.c cVar = (com.yandex.plus.core.analytics.logging.c) next;
                String upperCase = cVar.d.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                switch (upperCase.hashCode()) {
                    case 2251950:
                        if (upperCase.equals("INFO")) {
                            dVar = com.yandex.plus.core.debug.panel.api.data.d.c;
                            break;
                        }
                        dVar = com.yandex.plus.core.debug.panel.api.data.d.f;
                        break;
                    case 2656902:
                        if (upperCase.equals("WARN")) {
                            dVar = com.yandex.plus.core.debug.panel.api.data.d.d;
                            break;
                        }
                        dVar = com.yandex.plus.core.debug.panel.api.data.d.f;
                        break;
                    case 64921139:
                        if (upperCase.equals("DEBUG")) {
                            dVar = com.yandex.plus.core.debug.panel.api.data.d.b;
                            break;
                        }
                        dVar = com.yandex.plus.core.debug.panel.api.data.d.f;
                        break;
                    case 66247144:
                        if (upperCase.equals("ERROR")) {
                            dVar = com.yandex.plus.core.debug.panel.api.data.d.e;
                            break;
                        }
                        dVar = com.yandex.plus.core.debug.panel.api.data.d.f;
                        break;
                    case 1069090146:
                        if (upperCase.equals("VERBOSE")) {
                            dVar = com.yandex.plus.core.debug.panel.api.data.d.a;
                            break;
                        }
                        dVar = com.yandex.plus.core.debug.panel.api.data.d.f;
                        break;
                    default:
                        dVar = com.yandex.plus.core.debug.panel.api.data.d.f;
                        break;
                }
                arrayList2.add(new com.yandex.plus.core.debug.panel.api.data.c(String.valueOf(i), new com.yandex.plus.core.debug.panel.api.data.e(cVar.a, cVar.b, cVar.c, dVar, cVar.e, cVar.f, cVar.g, cVar.h, cVar.i, cVar.j)));
                i = i2;
            }
            xdr xdrVar = (xdr) this.g;
            xdrVar.getClass();
            xdrVar.m(null, arrayList2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if (f(r7, ((com.yandex.plus.plaquesdk.plaque.api.models.f) r8).a, (com.yandex.plus.plaquesdk.plaque.api.models.f) r8, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(SpannableStringBuilder spannableStringBuilder, com.yandex.plus.plaquesdk.plaque.api.models.g gVar, cg6 cg6Var) {
        com.yandex.plus.plaquesdk.widget.b bVar;
        int i;
        int length;
        Iterator it;
        int i2;
        if (cg6Var instanceof com.yandex.plus.plaquesdk.widget.b) {
            bVar = (com.yandex.plus.plaquesdk.widget.b) cg6Var;
            int i3 = bVar.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.q = i3 - Integer.MIN_VALUE;
                Object obj = bVar.o;
                Object obj2 = nm6.a;
                i = bVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    if (gVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.i) {
                        i(spannableStringBuilder, (com.yandex.plus.plaquesdk.plaque.api.models.i) gVar, null);
                    } else if (gVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.f) {
                        bVar.j = null;
                        bVar.k = null;
                        bVar.q = 1;
                    } else if (gVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.h) {
                        com.yandex.plus.plaquesdk.plaque.api.models.h hVar = (com.yandex.plus.plaquesdk.plaque.api.models.h) gVar;
                        i(spannableStringBuilder, hVar.b, new URLSpan(hVar.a));
                    } else {
                        if (!(gVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.b)) {
                            b6e.s();
                            return null;
                        }
                        length = spannableStringBuilder.length();
                        it = ((com.yandex.plus.plaquesdk.plaque.api.models.b) gVar).b.iterator();
                        i2 = 0;
                        while (it.hasNext()) {
                        }
                        com.yandex.plus.home.plaque.repository.graphql.formatter.b bVar2 = (com.yandex.plus.home.plaque.repository.graphql.formatter.b) this.d;
                        ((com.yandex.plus.plaquesdk.plaque.api.models.b) gVar).getClass();
                        bVar2.getClass();
                    }
                    return Unit.a;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                if (i != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = bVar.n;
                int i5 = bVar.m;
                it = bVar.l;
                com.yandex.plus.plaquesdk.plaque.api.models.g gVar2 = bVar.k;
                SpannableStringBuilder spannableStringBuilder2 = bVar.j;
                qgg.h0(obj);
                length = i5;
                gVar = gVar2;
                i2 = i4;
                spannableStringBuilder = spannableStringBuilder2;
                while (it.hasNext()) {
                    com.yandex.plus.plaquesdk.plaque.api.models.g gVar3 = (com.yandex.plus.plaquesdk.plaque.api.models.g) it.next();
                    bVar.j = spannableStringBuilder;
                    bVar.k = gVar;
                    bVar.l = it;
                    bVar.m = length;
                    bVar.n = i2;
                    bVar.q = 3;
                    if (e(spannableStringBuilder, gVar3, bVar) == obj2) {
                        return obj2;
                    }
                }
                com.yandex.plus.home.plaque.repository.graphql.formatter.b bVar22 = (com.yandex.plus.home.plaque.repository.graphql.formatter.b) this.d;
                ((com.yandex.plus.plaquesdk.plaque.api.models.b) gVar).getClass();
                bVar22.getClass();
                return Unit.a;
            }
        }
        bVar = new com.yandex.plus.plaquesdk.widget.b(this, cg6Var);
        Object obj3 = bVar.o;
        Object obj22 = nm6.a;
        i = bVar.q;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:50|51))(3:52|53|(1:55))|12|13|(9:15|(1:(1:38)(1:(1:40)(1:41)))(1:18)|19|(1:21)(1:36)|22|(1:24)|25|(2:27|(1:(1:30)(2:31|32))(1:34))|35)|42|(2:44|(1:46))|47|48))|62|6|7|(0)(0)|12|13|(0)|42|(0)|47|48|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0038, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0068, code lost:
    
        r11 = defpackage.z7o.b;
        r11 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0036, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0067, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0034, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x005f, code lost:
    
        r11 = defpackage.z7o.b;
        r11 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(SpannableStringBuilder spannableStringBuilder, String str, com.yandex.plus.plaquesdk.plaque.api.models.f fVar, cg6 cg6Var) {
        com.yandex.plus.plaquesdk.widget.c cVar;
        Object obj;
        int i;
        Throwable a;
        u13 u13Var = (u13) this.f;
        uf6 uf6Var = (uf6) this.g;
        if (cg6Var instanceof com.yandex.plus.plaquesdk.widget.c) {
            cVar = (com.yandex.plus.plaquesdk.widget.c) cg6Var;
            int i2 = cVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.n = i2 - Integer.MIN_VALUE;
                obj = cVar.l;
                nm6 nm6Var = nm6.a;
                i = cVar.n;
                int i3 = 1;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.bdui.plus.content.controller.f b = ((com.yandex.plus.coil.b) ((com.yandex.plus.core.imageloader.b) this.b)).b(str);
                    cVar.j = fVar;
                    cVar.k = spannableStringBuilder;
                    cVar.n = 1;
                    obj = b.w(cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    spannableStringBuilder = cVar.k;
                    fVar = cVar.j;
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                if (!(obj instanceof t7o)) {
                    Drawable drawable = (Drawable) obj;
                    Integer valueOf = Integer.valueOf(fVar.d);
                    uf6Var.setTheme(u13Var.e());
                    Resources resources = uf6Var.getResources();
                    resources.getClass();
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    displayMetrics.getClass();
                    int intValue = new Integer(com.yandex.plus.core.android.extensions.e.c(valueOf, displayMetrics).intValue()).intValue();
                    Integer valueOf2 = Integer.valueOf(fVar.e);
                    uf6Var.setTheme(u13Var.e());
                    Resources resources2 = uf6Var.getResources();
                    resources2.getClass();
                    DisplayMetrics displayMetrics2 = resources2.getDisplayMetrics();
                    displayMetrics2.getClass();
                    int intValue2 = new Integer(com.yandex.plus.core.android.extensions.e.c(valueOf2, displayMetrics2).intValue()).intValue();
                    if (intValue > 0 && intValue2 > 0) {
                        drawable.setBounds(0, 0, intValue, intValue2);
                    } else if (intValue > 0) {
                        drawable.setBounds(0, 0, intValue, (drawable.getIntrinsicHeight() * intValue) / drawable.getIntrinsicWidth());
                    } else if (intValue2 > 0) {
                        drawable.setBounds(0, 0, (drawable.getIntrinsicWidth() * intValue2) / drawable.getIntrinsicHeight(), intValue2);
                    } else {
                        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    }
                    com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar = (com.yandex.plus.home.plaque.plugin.internal.proxy.a) this.e;
                    String str2 = fVar.c;
                    Integer p = aVar.p(str2 != null ? StringsKt.Y(str2, "#") : null);
                    if (p != null) {
                        drawable.setTint(p.intValue());
                    }
                    int ordinal = fVar.b.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            i3 = 2;
                        } else {
                            if (ordinal != 2) {
                                b6e.s();
                                return null;
                            }
                            i3 = 0;
                        }
                    }
                    spannableStringBuilder.append(StringUtil.SPACE, new com.yandex.plus.home.common.utils.spantext.b(drawable, i3, fVar.f, 8), 33);
                }
                a = z7o.a(obj);
                if (a != null) {
                    com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.a;
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                    if (bVar.b(aVar2)) {
                        bVar.a(aVar2, "FormattedTextConverter", "appendImage error", a);
                    }
                }
                return Unit.a;
            }
        }
        cVar = new com.yandex.plus.plaquesdk.widget.c(this, cg6Var);
        obj = cVar.l;
        nm6 nm6Var2 = nm6.a;
        i = cVar.n;
        int i32 = 1;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        if (!(obj instanceof t7o)) {
        }
        a = z7o.a(obj);
        if (a != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b A[LOOP:2: B:52:0x0125->B:54:0x012b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(SpannableStringBuilder spannableStringBuilder, com.yandex.plus.plaquesdk.plaque.api.models.i iVar, URLSpan uRLSpan) {
        int i;
        Typeface a;
        UnderlineSpan underlineSpan;
        StrikethroughSpan strikethroughSpan;
        String str;
        URLSpan uRLSpan2;
        UpdateAppearance foregroundColorSpan;
        Iterator it;
        int length = spannableStringBuilder.length();
        String str2 = iVar.a;
        List list = iVar.e;
        List list2 = iVar.f;
        spannableStringBuilder.append((CharSequence) str2);
        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar = (com.yandex.plus.home.plaque.plugin.internal.proxy.a) this.e;
        String str3 = iVar.g;
        Integer p = aVar.p(str3 != null ? StringsKt.Y(str3, "#") : null);
        Integer num = iVar.d;
        AbsoluteSizeSpan absoluteSizeSpan = num != null ? new AbsoluteSizeSpan(num.intValue(), true) : null;
        uf6 uf6Var = (uf6) this.g;
        uf6Var.setTheme(((u13) this.f).e());
        com.yandex.plus.plaquesdk.plaque.api.models.d dVar = iVar.c;
        int ordinal = iVar.b.ordinal();
        if (ordinal == 0) {
            i = 0;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            i = 2;
        }
        switch (dVar == null ? -1 : com.yandex.plus.home.plaque.plugin.internal.defaults.b.a[dVar.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
                a = e3o.a(uf6Var, R.font.ys_text_regular);
                break;
            case 0:
            default:
                b6e.s();
                return;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                a = e3o.a(uf6Var, R.font.ys_text_medium);
                break;
        }
        Typeface create = Typeface.create(a, i);
        create.getClass();
        com.yandex.plus.plaquesdk.utils.b bVar = new com.yandex.plus.plaquesdk.utils.b(create, i);
        List list3 = list2;
        if (!list3.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (it2.next() != null) {
                    l1j.f();
                    return;
                }
            }
        } else if (list.contains(com.yandex.plus.plaquesdk.plaque.api.models.j.a)) {
            underlineSpan = new UnderlineSpan();
            if (list3.isEmpty()) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (it3.next() != null) {
                        l1j.f();
                        return;
                    }
                }
            } else if (list.contains(com.yandex.plus.plaquesdk.plaque.api.models.j.b)) {
                strikethroughSpan = new StrikethroughSpan();
                str = iVar.h;
                if (str != null) {
                    ((com.yandex.plus.home.plaque.repository.graphql.formatter.c) this.c).getClass();
                    UpdateAppearance aVar2 = str.equals("plus") ? new com.yandex.plus.home.plaque.repository.graphql.formatter.a() : null;
                    if (aVar2 != null) {
                        uRLSpan2 = uRLSpan;
                        foregroundColorSpan = aVar2;
                        it = ((ArrayList) xz0.w(new Object[]{uRLSpan2, absoluteSizeSpan, bVar, underlineSpan, strikethroughSpan, foregroundColorSpan})).iterator();
                        while (it.hasNext()) {
                            spannableStringBuilder.setSpan(it.next(), length, spannableStringBuilder.length(), 33);
                        }
                    }
                }
                uRLSpan2 = uRLSpan;
                foregroundColorSpan = p != null ? new ForegroundColorSpan(p.intValue()) : null;
                it = ((ArrayList) xz0.w(new Object[]{uRLSpan2, absoluteSizeSpan, bVar, underlineSpan, strikethroughSpan, foregroundColorSpan})).iterator();
                while (it.hasNext()) {
                }
            }
            strikethroughSpan = null;
            str = iVar.h;
            if (str != null) {
            }
            uRLSpan2 = uRLSpan;
            foregroundColorSpan = p != null ? new ForegroundColorSpan(p.intValue()) : null;
            it = ((ArrayList) xz0.w(new Object[]{uRLSpan2, absoluteSizeSpan, bVar, underlineSpan, strikethroughSpan, foregroundColorSpan})).iterator();
            while (it.hasNext()) {
            }
        }
        underlineSpan = null;
        if (list3.isEmpty()) {
        }
        strikethroughSpan = null;
        str = iVar.h;
        if (str != null) {
        }
        uRLSpan2 = uRLSpan;
        foregroundColorSpan = p != null ? new ForegroundColorSpan(p.intValue()) : null;
        it = ((ArrayList) xz0.w(new Object[]{uRLSpan2, absoluteSizeSpan, bVar, underlineSpan, strikethroughSpan, foregroundColorSpan})).iterator();
        while (it.hasNext()) {
        }
    }

    public void j(com.yandex.plus.home.dailyquests.feature.internal.model.j jVar, View.OnClickListener onClickListener) {
        FrameLayout frameLayout;
        View view;
        char c;
        jyr jyrVar = (jyr) this.f;
        jyr jyrVar2 = (jyr) this.a;
        FrameLayout frameLayout2 = (FrameLayout) this.b;
        jVar.getClass();
        if (jVar instanceof com.yandex.plus.home.dailyquests.feature.internal.model.h) {
            com.yandex.plus.home.dailyquests.feature.internal.ui.states.b bVar = (com.yandex.plus.home.dailyquests.feature.internal.ui.states.b) jyrVar2.getValue();
            com.yandex.plus.home.dailyquests.feature.internal.model.h hVar = (com.yandex.plus.home.dailyquests.feature.internal.model.h) jVar;
            View view2 = bVar.a;
            com.yandex.plus.bdui.plus.content.controller.f fVar = bVar.j;
            com.yandex.plus.bdui.plus.content.controller.f fVar2 = bVar.e;
            com.yandex.plus.bdui.plus.content.controller.f fVar3 = bVar.c;
            com.yandex.plus.bdui.plus.content.controller.f fVar4 = bVar.i;
            com.yandex.plus.bdui.plus.content.controller.f fVar5 = bVar.h;
            com.yandex.plus.bdui.plus.content.controller.f fVar6 = bVar.g;
            com.yandex.plus.bdui.plus.content.controller.f fVar7 = bVar.d;
            com.yandex.plus.home.dailyquests.feature.internal.model.g gVar = hVar.b;
            SpannedString spannedString = gVar.b;
            String str = gVar.a;
            frameLayout = frameLayout2;
            if (spannedString == null && str == null) {
                ((LinearLayoutCompat) fVar3.g(com.yandex.plus.home.dailyquests.feature.internal.ui.states.b.k[1])).setVisibility(8);
                c = '\b';
            } else {
                s9f[] s9fVarArr = com.yandex.plus.home.dailyquests.feature.internal.ui.states.b.k;
                c = '\b';
                ((LinearLayoutCompat) fVar3.g(s9fVarArr[1])).setVisibility(0);
                ((TextView) fVar7.g(s9fVarArr[2])).setVisibility(str != null ? 0 : 8);
                ((TextView) fVar7.g(s9fVarArr[2])).setText(str);
                boolean z = spannedString == null || StringsKt.U(spannedString);
                int j = r1.j(!z ? R.attr.plus_sdk_daily_quests_chain_on_background : R.attr.plus_sdk_daily_quests_chain_background, view2);
                ((TextView) fVar2.g(s9fVarArr[3])).setText(spannedString);
                ((TextView) fVar2.g(s9fVarArr[3])).setVisibility(!z ? 0 : 8);
                ((TextView) fVar7.g(s9fVarArr[2])).setBackgroundTintList(ColorStateList.valueOf(j));
            }
            com.yandex.plus.home.dailyquests.feature.internal.model.c cVar = hVar.c;
            com.yandex.plus.bdui.plus.content.controller.f fVar8 = bVar.b;
            s9f[] s9fVarArr2 = com.yandex.plus.home.dailyquests.feature.internal.ui.states.b.k;
            ImageView imageView = (ImageView) fVar8.g(s9fVarArr2[0]);
            Drawable drawable = cVar.a;
            String str2 = cVar.d;
            imageView.setImageDrawable(drawable);
            ((TextView) bVar.f.g(s9fVarArr2[4])).setText(cVar.b);
            com.yandex.plus.home.dailyquests.feature.internal.model.f fVar9 = cVar.c;
            if (fVar9 instanceof com.yandex.plus.home.dailyquests.feature.internal.model.e) {
                ((LinearProgressIndicator) fVar6.g(s9fVarArr2[5])).setVisibility(0);
                ((TextView) fVar5.g(s9fVarArr2[6])).setVisibility(0);
                ((TextView) fVar4.g(s9fVarArr2[7])).setVisibility(4);
                com.yandex.plus.home.dailyquests.feature.internal.model.e eVar = (com.yandex.plus.home.dailyquests.feature.internal.model.e) fVar9;
                ((LinearProgressIndicator) fVar6.g(s9fVarArr2[5])).a(eVar.a, true);
                ((TextView) fVar5.g(s9fVarArr2[6])).setText(eVar.b);
            } else {
                if (!(fVar9 instanceof com.yandex.plus.home.dailyquests.feature.internal.model.d)) {
                    b6e.s();
                    return;
                }
                ((LinearProgressIndicator) fVar6.g(s9fVarArr2[5])).setVisibility(4);
                ((TextView) fVar5.g(s9fVarArr2[6])).setVisibility(4);
                ((TextView) fVar4.g(s9fVarArr2[7])).setVisibility(0);
                ((TextView) fVar4.g(s9fVarArr2[7])).setText(((com.yandex.plus.home.dailyquests.feature.internal.model.d) fVar9).a);
            }
            ((TextView) fVar.g(s9fVarArr2[c])).setVisibility(str2 != null ? 0 : 4);
            ((TextView) fVar.g(s9fVarArr2[c])).setText(str2);
            r1.E(bVar.a, onClickListener);
            view2.setContentDescription(hVar.d);
            view = ((com.yandex.plus.home.dailyquests.feature.internal.ui.states.b) jyrVar2.getValue()).a;
        } else {
            frameLayout = frameLayout2;
            if (jVar instanceof com.yandex.plus.home.dailyquests.feature.internal.model.a) {
                com.yandex.plus.home.dailyquests.feature.internal.ui.states.a aVar = (com.yandex.plus.home.dailyquests.feature.internal.ui.states.a) jyrVar.getValue();
                com.yandex.plus.home.dailyquests.feature.internal.model.a aVar2 = (com.yandex.plus.home.dailyquests.feature.internal.model.a) jVar;
                aVar.getClass();
                View view3 = aVar.a;
                com.yandex.plus.bdui.plus.content.controller.f fVar10 = aVar.b;
                s9f[] s9fVarArr3 = com.yandex.plus.home.dailyquests.feature.internal.ui.states.a.f;
                ((ImageView) fVar10.g(s9fVarArr3[0])).setImageDrawable(aVar2.a);
                ((ImageView) aVar.c.g(s9fVarArr3[1])).setImageDrawable(aVar2.b);
                ((TextView) aVar.d.g(s9fVarArr3[2])).setText(aVar2.c);
                ((TextView) aVar.e.g(s9fVarArr3[3])).setText(aVar2.d);
                r1.E(view3, onClickListener);
                view3.setContentDescription(aVar2.e);
                view = ((com.yandex.plus.home.dailyquests.feature.internal.ui.states.a) jyrVar.getValue()).a;
            } else if (jVar.equals(com.yandex.plus.home.dailyquests.feature.internal.model.i.a)) {
                view = ((com.yandex.plus.home.dailyquests.feature.internal.ui.states.c) ((jyr) this.g).getValue()).a;
            } else {
                if (!jVar.equals(com.yandex.plus.home.dailyquests.feature.internal.model.b.a)) {
                    b6e.s();
                    return;
                }
                view = null;
            }
        }
        if (((xdr) this.d).getValue().getClass() != jVar.getClass()) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view != null) {
                frameLayout.addView(view);
            }
            xdr xdrVar = (xdr) this.c;
            xdrVar.getClass();
            xdrVar.m(null, jVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(com.yandex.plus.plaquesdk.plaque.api.models.l lVar, cg6 cg6Var) {
        com.yandex.plus.plaquesdk.widget.d dVar;
        int i;
        Iterator it;
        SpannableStringBuilder spannableStringBuilder;
        if (cg6Var instanceof com.yandex.plus.plaquesdk.widget.d) {
            dVar = (com.yandex.plus.plaquesdk.widget.d) cg6Var;
            int i2 = dVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.n = i2 - Integer.MIN_VALUE;
                Object obj = dVar.l;
                Object obj2 = nm6.a;
                i = dVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (lVar.a.isEmpty()) {
                        return "";
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    it = lVar.a.iterator();
                    spannableStringBuilder = spannableStringBuilder2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = dVar.k;
                    spannableStringBuilder = dVar.j;
                    qgg.h0(obj);
                }
                while (it.hasNext()) {
                    com.yandex.plus.plaquesdk.plaque.api.models.g gVar = (com.yandex.plus.plaquesdk.plaque.api.models.g) it.next();
                    dVar.j = spannableStringBuilder;
                    dVar.k = it;
                    dVar.n = 1;
                    if (e(spannableStringBuilder, gVar, dVar) == obj2) {
                        return obj2;
                    }
                }
                return SpannedString.valueOf(spannableStringBuilder);
            }
        }
        dVar = new com.yandex.plus.plaquesdk.widget.d(this, cg6Var);
        Object obj3 = dVar.l;
        Object obj22 = nm6.a;
        i = dVar.n;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x023f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, com.yandex.passport.internal.entities.j, com.yandex.plus.bdui.action.h, com.yandex.plus.bdui.m, com.yandex.plus.bdui.plus.content.r, com.yandex.plus.bdui.s, java.util.Collection, tf6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(Context context, com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.action.h hVar, com.yandex.plus.bdui.s sVar, com.yandex.plus.bdui.plus.content.r rVar, Collection collection, com.yandex.passport.internal.entities.j jVar, tf6 tf6Var, cg6 cg6Var) {
        com.yandex.plus.bdui.plus.webview.l lVar;
        Object obj;
        int i;
        int i2;
        com.yandex.plus.webview.api.insets.c cVar;
        Context context2;
        com.yandex.passport.internal.entities.j jVar2;
        tf6 tf6Var2;
        Object obj2;
        com.yandex.plus.bdui.s sVar2;
        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar;
        final com.yandex.plus.bdui.action.h hVar2;
        com.yandex.plus.bdui.plus.content.r rVar2;
        Object obj3;
        final com.yandex.plus.bdui.m mVar2;
        Collection collection2;
        Object obj4;
        com.yandex.plus.bdui.s sVar3;
        com.yandex.plus.webview.api.insets.c cVar2;
        Collection collection3;
        int ordinal;
        com.yandex.plus.webview.api.g gVar;
        final com.yandex.plus.webview.api.g gVar2;
        Context context3;
        com.yandex.plus.webview.api.insets.c cVar3;
        Object q;
        WebViewContainer webViewContainer;
        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar2 = (com.yandex.plus.home.plaque.plugin.internal.proxy.a) this.d;
        Object obj5 = this.a;
        com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) obj5;
        if (cg6Var instanceof com.yandex.plus.bdui.plus.webview.l) {
            lVar = (com.yandex.plus.bdui.plus.webview.l) cg6Var;
            int i3 = lVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lVar.u = i3 - Integer.MIN_VALUE;
                com.yandex.plus.bdui.plus.webview.l lVar2 = lVar;
                Object obj6 = lVar2.s;
                obj = nm6.a;
                i = lVar2.u;
                if (i != 0) {
                    i2 = 2;
                    cVar = null;
                    qgg.h0(obj6);
                    String a = rVar.a.a();
                    context2 = context;
                    lVar2.j = context2;
                    lVar2.k = mVar;
                    lVar2.l = hVar;
                    lVar2.m = sVar;
                    lVar2.n = rVar;
                    lVar2.o = collection;
                    jVar2 = jVar;
                    lVar2.p = jVar2;
                    tf6Var2 = tf6Var;
                    lVar2.q = tf6Var2;
                    lVar2.u = 1;
                    Object q2 = aVar2.q(a, lVar2);
                    if (q2 != obj) {
                        obj2 = obj5;
                        sVar2 = sVar;
                        aVar = aVar2;
                        hVar2 = hVar;
                        rVar2 = rVar;
                        obj3 = q2;
                        mVar2 = mVar;
                        collection2 = collection;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    webViewContainer = lVar2.r;
                    Collection collection4 = lVar2.o;
                    qgg.h0(obj6);
                    q = ((z7o) obj6).a;
                    r7o r7oVar = z7o.b;
                    return q instanceof t7o ? new Pair(webViewContainer, (com.yandex.plus.webview.core.d) q) : q;
                }
                tf6 tf6Var3 = lVar2.q;
                com.yandex.passport.internal.entities.j jVar3 = lVar2.p;
                collection2 = lVar2.o;
                rVar2 = lVar2.n;
                com.yandex.plus.bdui.s sVar4 = lVar2.m;
                com.yandex.plus.bdui.action.h hVar3 = lVar2.l;
                cVar = null;
                com.yandex.plus.bdui.m mVar3 = lVar2.k;
                i2 = 2;
                Context context4 = lVar2.j;
                qgg.h0(obj6);
                tf6Var2 = tf6Var3;
                obj3 = ((z7o) obj6).a;
                mVar2 = mVar3;
                obj2 = obj5;
                sVar2 = sVar4;
                aVar = aVar2;
                hVar2 = hVar3;
                jVar2 = jVar3;
                context2 = context4;
                r7o r7oVar2 = z7o.b;
                obj4 = obj3;
                if (!(obj3 instanceof t7o)) {
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar3)) {
                        sVar3 = sVar2;
                        bVar.c(aVar3, "DefaultWebViewProvider", "Inject auth cookie succeeded");
                        if (z7o.a(obj4) != null) {
                            com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.d;
                            if (bVar.b(aVar4)) {
                                bVar.c(aVar4, "DefaultWebViewProvider", "Inject auth cookie failed, continuing without cookie");
                            }
                        }
                        String uri = rVar2.a.c().toString();
                        uri.getClass();
                        if (collection2 != null) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = collection2.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                Iterator it2 = it;
                                if (next instanceof com.yandex.plus.webview.api.contract.h) {
                                    arrayList.add(next);
                                }
                                it = it2;
                            }
                            com.yandex.plus.webview.api.contract.h hVar4 = (com.yandex.plus.webview.api.contract.h) CollectionsKt.firstOrNull(arrayList);
                            if (hVar4 != null) {
                                cVar2 = hVar4.a;
                                Map map = rVar2.h;
                                if (cVar2 != null) {
                                    collection3 = collection2;
                                    com.yandex.plus.webview.api.insets.a aVar5 = com.yandex.plus.webview.api.insets.a.a;
                                    cVar2 = new com.yandex.plus.webview.api.insets.c(aVar5, aVar5, false);
                                } else {
                                    collection3 = collection2;
                                }
                                context2.getClass();
                                com.yandex.plus.webview.internal.contract.impl.insets.b bVar2 = new com.yandex.plus.webview.internal.contract.impl.insets.b(context2, cVar2);
                                com.yandex.plus.bdui.plus.webview.a aVar6 = new com.yandex.plus.bdui.plus.webview.a(mVar2, hVar2, map, bVar);
                                com.yandex.plus.bdui.plus.webview.b bVar3 = new com.yandex.plus.bdui.plus.webview.b((com.yandex.plus.bdui.plus.auth.a) this.c, aVar, new r0w(24, this), (tf6) this.g, (com.yandex.plus.log.api.b) obj2);
                                com.yandex.plus.bdui.plus.webview.p pVar = new com.yandex.plus.bdui.plus.webview.p((com.yandex.plus.bdui.plus.analytics.c) this.e, bVar);
                                com.yandex.plus.webview.api.contract.d[] dVarArr = new com.yandex.plus.webview.api.contract.d[6];
                                dVarArr[0] = bVar2;
                                dVarArr[1] = aVar6;
                                dVarArr[i2] = bVar3;
                                dVarArr[3] = pVar;
                                dVarArr[4] = cVar;
                                dVarArr[5] = cVar;
                                List w = xz0.w(dVarArr);
                                ordinal = rVar2.e.d.b.ordinal();
                                if (ordinal != 0) {
                                    gVar = com.yandex.plus.webview.api.e.a;
                                } else {
                                    if (ordinal == 1) {
                                        com.yandex.plus.bdui.plus.webview.o oVar = new com.yandex.plus.bdui.plus.webview.o(bVar);
                                        Context context5 = context2;
                                        gVar2 = new com.yandex.plus.webview.api.f(oVar);
                                        context3 = context5;
                                        cVar3 = oVar;
                                        final ArrayList g0 = CollectionsKt.g0(CollectionsKt.g0(w, u75.i(cVar3)), collection3 != null ? collection3 : c5b.a);
                                        final WebViewContainer webViewContainer2 = new WebViewContainer(context3, null, 0, 0, 14, null);
                                        final com.yandex.plus.bdui.plus.content.r rVar3 = rVar2;
                                        final h8e h8eVar = new h8e();
                                        final com.yandex.plus.bdui.s sVar5 = sVar3;
                                        final com.yandex.passport.internal.entities.j jVar4 = jVar2;
                                        final tf6 tf6Var4 = tf6Var2;
                                        Function0 function0 = new Function0() { // from class: com.yandex.plus.bdui.plus.webview.d
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                com.yandex.plus.bdui.plus.content.r rVar4 = rVar3;
                                                com.yandex.plus.bdui.plus.content.n nVar = rVar4.a;
                                                com.yandex.plus.bdui.plus.content.l lVar3 = rVar4.e;
                                                Map map2 = rVar4.f;
                                                Map map3 = rVar4.g;
                                                com.yandex.plus.bdui.flex.ui.s sVar6 = com.yandex.plus.bdui.flex.ui.s.this;
                                                com.yandex.plus.log.api.b bVar4 = (com.yandex.plus.log.api.b) sVar6.a;
                                                s sVar7 = new s(nVar, new h2(1, new com.yandex.plus.bdui.plus.webview.validator.b(map2), com.yandex.plus.bdui.plus.webview.validator.b.class, "matchUri", "matchUri(Landroid/net/Uri;)Lcom/yandex/plus/bdui/action/Action;", 0, 26), new h2(1, new com.yandex.plus.bdui.plus.webview.validator.a(map3), com.yandex.plus.bdui.plus.webview.validator.a.class, "matchUri", "matchUri(Landroid/net/Uri;)Lcom/yandex/plus/bdui/action/Action;", 0, 27), lVar3.c, new com.yandex.plus.bdui.flex.ui.content.c(28), new com.yandex.passport.internal.ui.bouncer.o(28, mVar2, hVar2), bVar4);
                                                mm6 mm6Var = tf6Var4;
                                                com.yandex.passport.internal.entities.j jVar5 = jVar4;
                                                h8e h8eVar2 = h8eVar;
                                                h hVar5 = new h(sVar7, new huw(mm6Var, sVar6, rVar4, jVar5, h8eVar2, 3));
                                                com.yandex.plus.home.plaque.plugin.internal.proxy.a h = com.yandex.plus.bdui.plus.analytics.b.h(g0);
                                                com.yandex.plus.pay.ui.core.internal.di.g gVar3 = (com.yandex.plus.pay.ui.core.internal.di.g) sVar6.b;
                                                String uri2 = nVar.c().toString();
                                                uri2.getClass();
                                                com.yandex.plus.webview.api.c cVar4 = new com.yandex.plus.webview.api.c(webViewContainer2, h, gVar3.a(sVar5 + '(' + uri2 + ')'), false, (kotlinx.coroutines.a) sVar6.f, bVar4);
                                                cVar4.n = lVar3.d.a;
                                                cVar4.o = h8eVar2;
                                                cVar4.p = gVar2;
                                                cVar4.h = hVar5;
                                                cVar4.i = false;
                                                return cVar4.a();
                                            }
                                        };
                                        ?? r1 = cVar;
                                        lVar2.j = r1;
                                        lVar2.k = r1;
                                        lVar2.l = r1;
                                        lVar2.m = r1;
                                        lVar2.n = r1;
                                        lVar2.o = r1;
                                        lVar2.p = r1;
                                        lVar2.q = r1;
                                        lVar2.r = webViewContainer2;
                                        lVar2.u = 2;
                                        q = q(rVar3, uri, null, jVar4, h8eVar, function0, lVar2);
                                        if (q != obj) {
                                            webViewContainer = webViewContainer2;
                                            r7o r7oVar3 = z7o.b;
                                            if (q instanceof t7o) {
                                            }
                                        }
                                        return obj;
                                    }
                                    if (ordinal != i2) {
                                        b6e.s();
                                        return cVar;
                                    }
                                    gVar = com.yandex.plus.webview.api.d.a;
                                }
                                context3 = context2;
                                gVar2 = gVar;
                                cVar3 = cVar;
                                final ArrayList g02 = CollectionsKt.g0(CollectionsKt.g0(w, u75.i(cVar3)), collection3 != null ? collection3 : c5b.a);
                                final WebViewContainer webViewContainer22 = new WebViewContainer(context3, null, 0, 0, 14, null);
                                final com.yandex.plus.bdui.plus.content.r rVar32 = rVar2;
                                final h8e h8eVar2 = new h8e();
                                final com.yandex.plus.bdui.s sVar52 = sVar3;
                                final com.yandex.passport.internal.entities.j jVar42 = jVar2;
                                final mm6 tf6Var42 = tf6Var2;
                                Function0 function02 = new Function0() { // from class: com.yandex.plus.bdui.plus.webview.d
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        com.yandex.plus.bdui.plus.content.r rVar4 = rVar32;
                                        com.yandex.plus.bdui.plus.content.n nVar = rVar4.a;
                                        com.yandex.plus.bdui.plus.content.l lVar3 = rVar4.e;
                                        Map map2 = rVar4.f;
                                        Map map3 = rVar4.g;
                                        com.yandex.plus.bdui.flex.ui.s sVar6 = com.yandex.plus.bdui.flex.ui.s.this;
                                        com.yandex.plus.log.api.b bVar4 = (com.yandex.plus.log.api.b) sVar6.a;
                                        s sVar7 = new s(nVar, new h2(1, new com.yandex.plus.bdui.plus.webview.validator.b(map2), com.yandex.plus.bdui.plus.webview.validator.b.class, "matchUri", "matchUri(Landroid/net/Uri;)Lcom/yandex/plus/bdui/action/Action;", 0, 26), new h2(1, new com.yandex.plus.bdui.plus.webview.validator.a(map3), com.yandex.plus.bdui.plus.webview.validator.a.class, "matchUri", "matchUri(Landroid/net/Uri;)Lcom/yandex/plus/bdui/action/Action;", 0, 27), lVar3.c, new com.yandex.plus.bdui.flex.ui.content.c(28), new com.yandex.passport.internal.ui.bouncer.o(28, mVar2, hVar2), bVar4);
                                        mm6 mm6Var = tf6Var42;
                                        com.yandex.passport.internal.entities.j jVar5 = jVar42;
                                        h8e h8eVar22 = h8eVar2;
                                        h hVar5 = new h(sVar7, new huw(mm6Var, sVar6, rVar4, jVar5, h8eVar22, 3));
                                        com.yandex.plus.home.plaque.plugin.internal.proxy.a h = com.yandex.plus.bdui.plus.analytics.b.h(g02);
                                        com.yandex.plus.pay.ui.core.internal.di.g gVar3 = (com.yandex.plus.pay.ui.core.internal.di.g) sVar6.b;
                                        String uri2 = nVar.c().toString();
                                        uri2.getClass();
                                        com.yandex.plus.webview.api.c cVar4 = new com.yandex.plus.webview.api.c(webViewContainer22, h, gVar3.a(sVar52 + '(' + uri2 + ')'), false, (kotlinx.coroutines.a) sVar6.f, bVar4);
                                        cVar4.n = lVar3.d.a;
                                        cVar4.o = h8eVar22;
                                        cVar4.p = gVar2;
                                        cVar4.h = hVar5;
                                        cVar4.i = false;
                                        return cVar4.a();
                                    }
                                };
                                ?? r12 = cVar;
                                lVar2.j = r12;
                                lVar2.k = r12;
                                lVar2.l = r12;
                                lVar2.m = r12;
                                lVar2.n = r12;
                                lVar2.o = r12;
                                lVar2.p = r12;
                                lVar2.q = r12;
                                lVar2.r = webViewContainer22;
                                lVar2.u = 2;
                                q = q(rVar32, uri, null, jVar42, h8eVar2, function02, lVar2);
                                if (q != obj) {
                                }
                                return obj;
                            }
                        }
                        cVar2 = cVar;
                        Map map2 = rVar2.h;
                        if (cVar2 != null) {
                        }
                        context2.getClass();
                        com.yandex.plus.webview.internal.contract.impl.insets.b bVar22 = new com.yandex.plus.webview.internal.contract.impl.insets.b(context2, cVar2);
                        com.yandex.plus.bdui.plus.webview.a aVar62 = new com.yandex.plus.bdui.plus.webview.a(mVar2, hVar2, map2, bVar);
                        com.yandex.plus.bdui.plus.webview.b bVar32 = new com.yandex.plus.bdui.plus.webview.b((com.yandex.plus.bdui.plus.auth.a) this.c, aVar, new r0w(24, this), (tf6) this.g, (com.yandex.plus.log.api.b) obj2);
                        com.yandex.plus.bdui.plus.webview.p pVar2 = new com.yandex.plus.bdui.plus.webview.p((com.yandex.plus.bdui.plus.analytics.c) this.e, bVar);
                        com.yandex.plus.webview.api.contract.d[] dVarArr2 = new com.yandex.plus.webview.api.contract.d[6];
                        dVarArr2[0] = bVar22;
                        dVarArr2[1] = aVar62;
                        dVarArr2[i2] = bVar32;
                        dVarArr2[3] = pVar2;
                        dVarArr2[4] = cVar;
                        dVarArr2[5] = cVar;
                        List w2 = xz0.w(dVarArr2);
                        ordinal = rVar2.e.d.b.ordinal();
                        if (ordinal != 0) {
                        }
                        context3 = context2;
                        gVar2 = gVar;
                        cVar3 = cVar;
                        final ArrayList g022 = CollectionsKt.g0(CollectionsKt.g0(w2, u75.i(cVar3)), collection3 != null ? collection3 : c5b.a);
                        final WebViewContainer webViewContainer222 = new WebViewContainer(context3, null, 0, 0, 14, null);
                        final com.yandex.plus.bdui.plus.content.r rVar322 = rVar2;
                        final h8e h8eVar22 = new h8e();
                        final com.yandex.plus.bdui.s sVar522 = sVar3;
                        final com.yandex.passport.internal.entities.j jVar422 = jVar2;
                        final mm6 tf6Var422 = tf6Var2;
                        Function0 function022 = new Function0() { // from class: com.yandex.plus.bdui.plus.webview.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                com.yandex.plus.bdui.plus.content.r rVar4 = rVar322;
                                com.yandex.plus.bdui.plus.content.n nVar = rVar4.a;
                                com.yandex.plus.bdui.plus.content.l lVar3 = rVar4.e;
                                Map map22 = rVar4.f;
                                Map map3 = rVar4.g;
                                com.yandex.plus.bdui.flex.ui.s sVar6 = com.yandex.plus.bdui.flex.ui.s.this;
                                com.yandex.plus.log.api.b bVar4 = (com.yandex.plus.log.api.b) sVar6.a;
                                s sVar7 = new s(nVar, new h2(1, new com.yandex.plus.bdui.plus.webview.validator.b(map22), com.yandex.plus.bdui.plus.webview.validator.b.class, "matchUri", "matchUri(Landroid/net/Uri;)Lcom/yandex/plus/bdui/action/Action;", 0, 26), new h2(1, new com.yandex.plus.bdui.plus.webview.validator.a(map3), com.yandex.plus.bdui.plus.webview.validator.a.class, "matchUri", "matchUri(Landroid/net/Uri;)Lcom/yandex/plus/bdui/action/Action;", 0, 27), lVar3.c, new com.yandex.plus.bdui.flex.ui.content.c(28), new com.yandex.passport.internal.ui.bouncer.o(28, mVar2, hVar2), bVar4);
                                mm6 mm6Var = tf6Var422;
                                com.yandex.passport.internal.entities.j jVar5 = jVar422;
                                h8e h8eVar222 = h8eVar22;
                                h hVar5 = new h(sVar7, new huw(mm6Var, sVar6, rVar4, jVar5, h8eVar222, 3));
                                com.yandex.plus.home.plaque.plugin.internal.proxy.a h = com.yandex.plus.bdui.plus.analytics.b.h(g022);
                                com.yandex.plus.pay.ui.core.internal.di.g gVar3 = (com.yandex.plus.pay.ui.core.internal.di.g) sVar6.b;
                                String uri2 = nVar.c().toString();
                                uri2.getClass();
                                com.yandex.plus.webview.api.c cVar4 = new com.yandex.plus.webview.api.c(webViewContainer222, h, gVar3.a(sVar522 + '(' + uri2 + ')'), false, (kotlinx.coroutines.a) sVar6.f, bVar4);
                                cVar4.n = lVar3.d.a;
                                cVar4.o = h8eVar222;
                                cVar4.p = gVar2;
                                cVar4.h = hVar5;
                                cVar4.i = false;
                                return cVar4.a();
                            }
                        };
                        ?? r122 = cVar;
                        lVar2.j = r122;
                        lVar2.k = r122;
                        lVar2.l = r122;
                        lVar2.m = r122;
                        lVar2.n = r122;
                        lVar2.o = r122;
                        lVar2.p = r122;
                        lVar2.q = r122;
                        lVar2.r = webViewContainer222;
                        lVar2.u = 2;
                        q = q(rVar322, uri, null, jVar422, h8eVar22, function022, lVar2);
                        if (q != obj) {
                        }
                        return obj;
                    }
                }
                sVar3 = sVar2;
                if (z7o.a(obj4) != null) {
                }
                String uri2 = rVar2.a.c().toString();
                uri2.getClass();
                if (collection2 != null) {
                }
                cVar2 = cVar;
                Map map22 = rVar2.h;
                if (cVar2 != null) {
                }
                context2.getClass();
                com.yandex.plus.webview.internal.contract.impl.insets.b bVar222 = new com.yandex.plus.webview.internal.contract.impl.insets.b(context2, cVar2);
                com.yandex.plus.bdui.plus.webview.a aVar622 = new com.yandex.plus.bdui.plus.webview.a(mVar2, hVar2, map22, bVar);
                com.yandex.plus.bdui.plus.webview.b bVar322 = new com.yandex.plus.bdui.plus.webview.b((com.yandex.plus.bdui.plus.auth.a) this.c, aVar, new r0w(24, this), (tf6) this.g, (com.yandex.plus.log.api.b) obj2);
                com.yandex.plus.bdui.plus.webview.p pVar22 = new com.yandex.plus.bdui.plus.webview.p((com.yandex.plus.bdui.plus.analytics.c) this.e, bVar);
                com.yandex.plus.webview.api.contract.d[] dVarArr22 = new com.yandex.plus.webview.api.contract.d[6];
                dVarArr22[0] = bVar222;
                dVarArr22[1] = aVar622;
                dVarArr22[i2] = bVar322;
                dVarArr22[3] = pVar22;
                dVarArr22[4] = cVar;
                dVarArr22[5] = cVar;
                List w22 = xz0.w(dVarArr22);
                ordinal = rVar2.e.d.b.ordinal();
                if (ordinal != 0) {
                }
                context3 = context2;
                gVar2 = gVar;
                cVar3 = cVar;
                final ArrayList g0222 = CollectionsKt.g0(CollectionsKt.g0(w22, u75.i(cVar3)), collection3 != null ? collection3 : c5b.a);
                final WebViewContainer webViewContainer2222 = new WebViewContainer(context3, null, 0, 0, 14, null);
                final com.yandex.plus.bdui.plus.content.r rVar3222 = rVar2;
                final h8e h8eVar222 = new h8e();
                final com.yandex.plus.bdui.s sVar5222 = sVar3;
                final com.yandex.passport.internal.entities.j jVar4222 = jVar2;
                final mm6 tf6Var4222 = tf6Var2;
                Function0 function0222 = new Function0() { // from class: com.yandex.plus.bdui.plus.webview.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        com.yandex.plus.bdui.plus.content.r rVar4 = rVar3222;
                        com.yandex.plus.bdui.plus.content.n nVar = rVar4.a;
                        com.yandex.plus.bdui.plus.content.l lVar3 = rVar4.e;
                        Map map222 = rVar4.f;
                        Map map3 = rVar4.g;
                        com.yandex.plus.bdui.flex.ui.s sVar6 = com.yandex.plus.bdui.flex.ui.s.this;
                        com.yandex.plus.log.api.b bVar4 = (com.yandex.plus.log.api.b) sVar6.a;
                        s sVar7 = new s(nVar, new h2(1, new com.yandex.plus.bdui.plus.webview.validator.b(map222), com.yandex.plus.bdui.plus.webview.validator.b.class, "matchUri", "matchUri(Landroid/net/Uri;)Lcom/yandex/plus/bdui/action/Action;", 0, 26), new h2(1, new com.yandex.plus.bdui.plus.webview.validator.a(map3), com.yandex.plus.bdui.plus.webview.validator.a.class, "matchUri", "matchUri(Landroid/net/Uri;)Lcom/yandex/plus/bdui/action/Action;", 0, 27), lVar3.c, new com.yandex.plus.bdui.flex.ui.content.c(28), new com.yandex.passport.internal.ui.bouncer.o(28, mVar2, hVar2), bVar4);
                        mm6 mm6Var = tf6Var4222;
                        com.yandex.passport.internal.entities.j jVar5 = jVar4222;
                        h8e h8eVar2222 = h8eVar222;
                        h hVar5 = new h(sVar7, new huw(mm6Var, sVar6, rVar4, jVar5, h8eVar2222, 3));
                        com.yandex.plus.home.plaque.plugin.internal.proxy.a h = com.yandex.plus.bdui.plus.analytics.b.h(g0222);
                        com.yandex.plus.pay.ui.core.internal.di.g gVar3 = (com.yandex.plus.pay.ui.core.internal.di.g) sVar6.b;
                        String uri22 = nVar.c().toString();
                        uri22.getClass();
                        com.yandex.plus.webview.api.c cVar4 = new com.yandex.plus.webview.api.c(webViewContainer2222, h, gVar3.a(sVar5222 + '(' + uri22 + ')'), false, (kotlinx.coroutines.a) sVar6.f, bVar4);
                        cVar4.n = lVar3.d.a;
                        cVar4.o = h8eVar2222;
                        cVar4.p = gVar2;
                        cVar4.h = hVar5;
                        cVar4.i = false;
                        return cVar4.a();
                    }
                };
                ?? r1222 = cVar;
                lVar2.j = r1222;
                lVar2.k = r1222;
                lVar2.l = r1222;
                lVar2.m = r1222;
                lVar2.n = r1222;
                lVar2.o = r1222;
                lVar2.p = r1222;
                lVar2.q = r1222;
                lVar2.r = webViewContainer2222;
                lVar2.u = 2;
                q = q(rVar3222, uri2, null, jVar4222, h8eVar222, function0222, lVar2);
                if (q != obj) {
                }
                return obj;
            }
        }
        lVar = new com.yandex.plus.bdui.plus.webview.l(this, cg6Var);
        com.yandex.plus.bdui.plus.webview.l lVar22 = lVar;
        Object obj62 = lVar22.s;
        obj = nm6.a;
        i = lVar22.u;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        obj4 = obj3;
        if (!(obj3 instanceof t7o)) {
        }
        sVar3 = sVar2;
        if (z7o.a(obj4) != null) {
        }
        String uri22 = rVar2.a.c().toString();
        uri22.getClass();
        if (collection2 != null) {
        }
        cVar2 = cVar;
        Map map222 = rVar2.h;
        if (cVar2 != null) {
        }
        context2.getClass();
        com.yandex.plus.webview.internal.contract.impl.insets.b bVar2222 = new com.yandex.plus.webview.internal.contract.impl.insets.b(context2, cVar2);
        com.yandex.plus.bdui.plus.webview.a aVar6222 = new com.yandex.plus.bdui.plus.webview.a(mVar2, hVar2, map222, bVar);
        com.yandex.plus.bdui.plus.webview.b bVar3222 = new com.yandex.plus.bdui.plus.webview.b((com.yandex.plus.bdui.plus.auth.a) this.c, aVar, new r0w(24, this), (tf6) this.g, (com.yandex.plus.log.api.b) obj2);
        com.yandex.plus.bdui.plus.webview.p pVar222 = new com.yandex.plus.bdui.plus.webview.p((com.yandex.plus.bdui.plus.analytics.c) this.e, bVar);
        com.yandex.plus.webview.api.contract.d[] dVarArr222 = new com.yandex.plus.webview.api.contract.d[6];
        dVarArr222[0] = bVar2222;
        dVarArr222[1] = aVar6222;
        dVarArr222[i2] = bVar3222;
        dVarArr222[3] = pVar222;
        dVarArr222[4] = cVar;
        dVarArr222[5] = cVar;
        List w222 = xz0.w(dVarArr222);
        ordinal = rVar2.e.d.b.ordinal();
        if (ordinal != 0) {
        }
        context3 = context2;
        gVar2 = gVar;
        cVar3 = cVar;
        final ArrayList g02222 = CollectionsKt.g0(CollectionsKt.g0(w222, u75.i(cVar3)), collection3 != null ? collection3 : c5b.a);
        final WebViewContainer webViewContainer22222 = new WebViewContainer(context3, null, 0, 0, 14, null);
        final com.yandex.plus.bdui.plus.content.r rVar32222 = rVar2;
        final h8e h8eVar2222 = new h8e();
        final com.yandex.plus.bdui.s sVar52222 = sVar3;
        final com.yandex.passport.internal.entities.j jVar42222 = jVar2;
        final mm6 tf6Var42222 = tf6Var2;
        Function0 function02222 = new Function0() { // from class: com.yandex.plus.bdui.plus.webview.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                com.yandex.plus.bdui.plus.content.r rVar4 = rVar32222;
                com.yandex.plus.bdui.plus.content.n nVar = rVar4.a;
                com.yandex.plus.bdui.plus.content.l lVar3 = rVar4.e;
                Map map2222 = rVar4.f;
                Map map3 = rVar4.g;
                com.yandex.plus.bdui.flex.ui.s sVar6 = com.yandex.plus.bdui.flex.ui.s.this;
                com.yandex.plus.log.api.b bVar4 = (com.yandex.plus.log.api.b) sVar6.a;
                s sVar7 = new s(nVar, new h2(1, new com.yandex.plus.bdui.plus.webview.validator.b(map2222), com.yandex.plus.bdui.plus.webview.validator.b.class, "matchUri", "matchUri(Landroid/net/Uri;)Lcom/yandex/plus/bdui/action/Action;", 0, 26), new h2(1, new com.yandex.plus.bdui.plus.webview.validator.a(map3), com.yandex.plus.bdui.plus.webview.validator.a.class, "matchUri", "matchUri(Landroid/net/Uri;)Lcom/yandex/plus/bdui/action/Action;", 0, 27), lVar3.c, new com.yandex.plus.bdui.flex.ui.content.c(28), new com.yandex.passport.internal.ui.bouncer.o(28, mVar2, hVar2), bVar4);
                mm6 mm6Var = tf6Var42222;
                com.yandex.passport.internal.entities.j jVar5 = jVar42222;
                h8e h8eVar22222 = h8eVar2222;
                h hVar5 = new h(sVar7, new huw(mm6Var, sVar6, rVar4, jVar5, h8eVar22222, 3));
                com.yandex.plus.home.plaque.plugin.internal.proxy.a h = com.yandex.plus.bdui.plus.analytics.b.h(g02222);
                com.yandex.plus.pay.ui.core.internal.di.g gVar3 = (com.yandex.plus.pay.ui.core.internal.di.g) sVar6.b;
                String uri222 = nVar.c().toString();
                uri222.getClass();
                com.yandex.plus.webview.api.c cVar4 = new com.yandex.plus.webview.api.c(webViewContainer22222, h, gVar3.a(sVar52222 + '(' + uri222 + ')'), false, (kotlinx.coroutines.a) sVar6.f, bVar4);
                cVar4.n = lVar3.d.a;
                cVar4.o = h8eVar22222;
                cVar4.p = gVar2;
                cVar4.h = hVar5;
                cVar4.i = false;
                return cVar4.a();
            }
        };
        ?? r12222 = cVar;
        lVar22.j = r12222;
        lVar22.k = r12222;
        lVar22.l = r12222;
        lVar22.m = r12222;
        lVar22.n = r12222;
        lVar22.o = r12222;
        lVar22.p = r12222;
        lVar22.q = r12222;
        lVar22.r = webViewContainer22222;
        lVar22.u = 2;
        q = q(rVar32222, uri22, null, jVar42222, h8eVar2222, function02222, lVar22);
        if (q != obj) {
        }
        return obj;
    }

    public boolean n(Uri uri, String str) {
        if (kotlin.text.c.o(uri.getScheme(), (String) this.f, true) && kotlin.text.c.o(uri.getAuthority(), "plus-home-sdk", true)) {
            List<String> pathSegments = uri.getPathSegments();
            pathSegments.getClass();
            if (kotlin.text.c.o((String) CollectionsKt.firstOrNull(pathSegments), str, false)) {
                return true;
            }
        }
        return false;
    }

    public boolean o(Uri uri) {
        Set<String> set = (Set) this.b;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (String str : set) {
            String host = uri.getHost();
            if (host != null && StringsKt.M(host, str, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(com.yandex.plus.bdui.plus.content.r rVar, String str, Map map, com.yandex.passport.internal.entities.j jVar, h8e h8eVar, Function0 function0, cg6 cg6Var) {
        com.yandex.plus.bdui.plus.webview.m mVar;
        Object obj;
        Object obj2;
        int i;
        com.yandex.plus.bdui.plus.content.r rVar2;
        String str2;
        com.yandex.passport.internal.entities.j jVar2;
        com.yandex.plus.bdui.plus.webview.g a;
        String i2;
        String str3 = str;
        com.yandex.passport.internal.entities.j jVar3 = jVar;
        h8e h8eVar2 = h8eVar;
        com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.a;
        if (cg6Var instanceof com.yandex.plus.bdui.plus.webview.m) {
            mVar = (com.yandex.plus.bdui.plus.webview.m) cg6Var;
            int i3 = mVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mVar.p = i3 - Integer.MIN_VALUE;
                obj = mVar.n;
                obj2 = nm6.a;
                i = mVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar)) {
                        bVar.c(aVar, "DefaultWebViewProvider", "Loading started; url = " + str3);
                    }
                    jVar3.getClass();
                    str3.getClass();
                    com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) jVar3.e;
                    if (bVar2.b(aVar)) {
                        bVar2.c(aVar, "UrlLoadingListener", "loadWebView(); WebView loading started; url = ".concat(str3));
                    }
                    t tVar = (t) jVar3.c;
                    if (tVar != null) {
                        com.yandex.passport.internal.entities.j jVar4 = tVar.a;
                        com.yandex.plus.bdui.flex.utils.c cVar = (com.yandex.plus.bdui.flex.utils.c) jVar4.a;
                        com.yandex.plus.bdui.flex.utils.c cVar2 = (com.yandex.plus.bdui.flex.utils.c) jVar4.a;
                        com.yandex.passport.internal.flags.experiments.p pVar = (com.yandex.passport.internal.flags.experiments.p) jVar4.d;
                        View view = pVar != null ? (View) pVar.d : null;
                        if (view != null && cVar2.indexOfChild(view) < 0) {
                            cVar2.a(cVar2.getChildCount(), view);
                        }
                        cVar2.removeViewInLayout((View) jVar4.b);
                        cVar.requestLayout();
                        cVar.invalidate();
                    }
                    mVar.j = rVar;
                    mVar.k = str3;
                    mVar.l = jVar3;
                    mVar.m = h8eVar2;
                    mVar.p = 1;
                    zt3 zt3Var = new zt3(1, qxe.b(mVar));
                    zt3Var.s();
                    h8eVar2.getClass();
                    h8eVar2.a = new com.yandex.passport.internal.ui.bouncer.o(29, new tqn(), zt3Var);
                    ((com.yandex.plus.webview.core.d) function0.invoke()).n(str3, map == null ? null : map);
                    Object q = zt3Var.q();
                    if (q != obj2) {
                        rVar2 = rVar;
                        obj = q;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jVar2 = mVar.l;
                    str2 = mVar.k;
                    qgg.h0(obj);
                    com.yandex.plus.bdui.plus.webview.k kVar = (com.yandex.plus.bdui.plus.webview.k) obj;
                    a = kVar.a();
                    if (!(a instanceof com.yandex.plus.bdui.plus.webview.f)) {
                        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                        if (bVar.b(aVar2)) {
                            bVar.c(aVar2, "DefaultWebViewProvider", "WebView loading succeeded");
                        }
                        jVar2.getClass();
                        str2.getClass();
                        com.yandex.plus.log.api.b bVar3 = (com.yandex.plus.log.api.b) jVar2.e;
                        if (bVar3.b(aVar2)) {
                            bVar3.c(aVar2, "UrlLoadingListener", "loadWebView(); WebView loading done; url = ".concat(str2));
                        }
                        t tVar2 = (t) jVar2.c;
                        if (tVar2 != null) {
                            com.yandex.passport.internal.entities.j jVar5 = tVar2.a;
                            com.yandex.plus.bdui.flex.utils.c cVar3 = (com.yandex.plus.bdui.flex.utils.c) jVar5.a;
                            jVar5.Q();
                            jVar5.w();
                            cVar3.requestLayout();
                            cVar3.invalidate();
                        }
                        r7o r7oVar = z7o.b;
                        return ((com.yandex.plus.bdui.plus.webview.f) a).a;
                    }
                    if (!(a instanceof com.yandex.plus.bdui.plus.webview.e)) {
                        b6e.s();
                        return null;
                    }
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.d;
                    if (bVar.b(aVar3)) {
                        if (kVar instanceof com.yandex.plus.bdui.plus.webview.i) {
                            i2 = "WebView loading failed!";
                        } else {
                            if (!(kVar instanceof com.yandex.plus.bdui.plus.webview.j)) {
                                b6e.s();
                                return null;
                            }
                            i2 = f1d.i(new StringBuilder("WebView loading failed after "), ((com.yandex.plus.bdui.plus.webview.j) kVar).b, " retries!");
                        }
                        bVar.c(aVar3, "DefaultWebViewProvider", i2);
                    }
                    Exception exc = ((com.yandex.plus.bdui.plus.webview.e) a).b;
                    jVar2.getClass();
                    str2.getClass();
                    com.yandex.plus.log.api.b bVar4 = (com.yandex.plus.log.api.b) jVar2.e;
                    com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.e;
                    if (bVar4.b(aVar4)) {
                        bVar4.a(aVar4, "UrlLoadingListener", "loadWebView(); WebView loading failed! url = ".concat(str2), exc);
                    }
                    t tVar3 = (t) jVar2.c;
                    if (tVar3 != null) {
                        com.yandex.passport.internal.entities.j jVar6 = tVar3.a;
                        com.yandex.plus.bdui.flex.utils.c cVar4 = (com.yandex.plus.bdui.flex.utils.c) jVar6.a;
                        jVar6.Q();
                        jVar6.w();
                        cVar4.requestLayout();
                        cVar4.invalidate();
                    }
                    ((ujd) jVar2.d).invoke((com.yandex.plus.bdui.action.h) jVar2.a, (com.yandex.plus.bdui.content.d) jVar2.b, (t) jVar2.c, str2, exc);
                    r7o r7oVar2 = z7o.b;
                    return new t7o(exc);
                }
                h8e h8eVar3 = mVar.m;
                jVar3 = mVar.l;
                String str4 = mVar.k;
                rVar2 = mVar.j;
                qgg.h0(obj);
                h8eVar2 = h8eVar3;
                str3 = str4;
                mVar.j = null;
                mVar.k = str3;
                mVar.l = jVar3;
                mVar.m = null;
                mVar.p = 2;
                obj = x(rVar2, (com.yandex.plus.bdui.plus.webview.g) obj, h8eVar2, mVar);
                if (obj != obj2) {
                    com.yandex.passport.internal.entities.j jVar7 = jVar3;
                    str2 = str3;
                    jVar2 = jVar7;
                    com.yandex.plus.bdui.plus.webview.k kVar2 = (com.yandex.plus.bdui.plus.webview.k) obj;
                    a = kVar2.a();
                    if (!(a instanceof com.yandex.plus.bdui.plus.webview.f)) {
                    }
                }
                return obj2;
            }
        }
        mVar = new com.yandex.plus.bdui.plus.webview.m(this, cg6Var);
        obj = mVar.n;
        obj2 = nm6.a;
        i = mVar.p;
        if (i != 0) {
        }
        mVar.j = null;
        mVar.k = str3;
        mVar.l = jVar3;
        mVar.m = null;
        mVar.p = 2;
        obj = x(rVar2, (com.yandex.plus.bdui.plus.webview.g) obj, h8eVar2, mVar);
        if (obj != obj2) {
        }
        return obj2;
    }

    public Object r(Uri uri) {
        Object t7oVar;
        com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.a;
        uri.getClass();
        try {
            r7o r7oVar = z7o.b;
            t7oVar = z(uri);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (!(t7oVar instanceof t7o)) {
            try {
                t7oVar = s((Uri) t7oVar);
            } catch (Throwable th2) {
                r7o r7oVar3 = z7o.b;
                t7oVar = new t7o(th2);
            }
        }
        if (z7o.a(t7oVar) != null) {
            try {
                t7oVar = s(uri);
            } catch (Throwable th3) {
                r7o r7oVar4 = z7o.b;
                t7oVar = new t7o(th3);
            }
        }
        if (!(t7oVar instanceof t7o)) {
            com.yandex.plus.home.feature.webviews.internal.uri.j jVar = (com.yandex.plus.home.feature.webviews.internal.uri.j) t7oVar;
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
            if (bVar.b(aVar)) {
                bVar.c(aVar, "DeeplinkParserImpl", "parse(" + uri + "): " + jVar);
            }
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
            if (bVar.b(aVar2)) {
                bVar.a(aVar2, "DeeplinkParserImpl", "parse(" + uri + "): null", a);
            }
        }
        return t7oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.yandex.plus.home.feature.webviews.internal.uri.j s(Uri uri) {
        int i;
        Uri uri2;
        int length;
        com.yandex.plus.home.feature.webviews.internal.uri.i iVar;
        com.yandex.plus.home.feature.webviews.internal.uri.d dVar;
        Integer num;
        Integer num2;
        Boolean bool;
        Set set;
        Boolean bool2;
        Set set2;
        Boolean bool3;
        Set set3;
        Boolean bool4;
        Boolean bool5;
        String fragment;
        Boolean bool6;
        String fragment2;
        int i2;
        Set<String> queryParameterNames;
        Object obj;
        String str = (String) this.f;
        if (!uri.isAbsolute()) {
            xq0.q("Uri is not absolute!");
            return null;
        }
        if (!uri.isHierarchical()) {
            if (kotlin.text.c.o(uri.getScheme(), "mailto", true)) {
                return new com.yandex.plus.home.feature.webviews.internal.uri.c(uri);
            }
            xq0.q("Opaque uri is unsupported!");
            return null;
        }
        tpi tpiVar = new tpi();
        tpi tpiVar2 = new tpi();
        Set<String> queryParameterNames2 = uri.getQueryParameterNames();
        queryParameterNames2.getClass();
        Iterator<T> it = queryParameterNames2.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            List<String> queryParameters = uri.getQueryParameters(str2);
            queryParameters.getClass();
            Object A0 = CollectionsKt.A0(queryParameters);
            str2.getClass();
            if (kotlin.text.c.v(str2, "get_", false)) {
                tpiVar2.m(str2, A0);
            } else {
                tpiVar.m(str2, A0);
            }
        }
        Set set4 = (Set) tpiVar.k("url");
        if (set4 == null) {
            set4 = (Set) tpiVar2.k("get_url");
        }
        if (set4 != null) {
            Iterator it2 = set4.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                Uri parse = Uri.parse((String) obj);
                if (parse.isHierarchical() && parse.isAbsolute() && p(parse)) {
                    break;
                }
            }
            String str3 = (String) obj;
            if (str3 != null) {
                uri2 = Uri.parse(str3);
                if (uri2 != null && (queryParameterNames = uri2.getQueryParameterNames()) != null) {
                    for (String str4 : queryParameterNames) {
                        List<String> queryParameters2 = uri2.getQueryParameters(str4);
                        str4.getClass();
                        if (kotlin.text.c.v(str4, "get_", false)) {
                            Set set5 = (Set) tpiVar2.g(str4);
                            if (set5 == null) {
                                set5 = q5b.a;
                            }
                            queryParameters2.getClass();
                            tpiVar2.m(str4, wop.i(set5, queryParameters2));
                        } else {
                            Set set6 = (Set) tpiVar.g(str4);
                            if (set6 == null) {
                                set6 = q5b.a;
                            }
                            queryParameters2.getClass();
                            tpiVar.m(str4, wop.i(set6, queryParameters2));
                        }
                    }
                }
                Object[] objArr = tpiVar2.b;
                Object[] objArr2 = tpiVar2.c;
                long[] jArr = tpiVar2.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        long[] jArr2 = jArr;
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = i;
                            while (i6 < i5) {
                                if ((j & 255) < 128) {
                                    int i7 = (i3 << 3) + i6;
                                    Object obj2 = objArr[i7];
                                    Object obj3 = (Set) objArr2[i7];
                                    i2 = i4;
                                    tpiVar.m(StringsKt.Y((String) obj2, "get_"), obj3);
                                } else {
                                    i2 = i4;
                                }
                                j >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                        jArr = jArr2;
                        i = 0;
                    }
                }
                if (!o(uri)) {
                    return new com.yandex.plus.home.feature.webviews.internal.uri.h(uri);
                }
                if (uri2 != null && o(uri2)) {
                    return new com.yandex.plus.home.feature.webviews.internal.uri.h(uri2);
                }
                if (n(uri, "home")) {
                    return t(uri, tpiVar, false, uri2);
                }
                if (n(uri, "buyplus")) {
                    return t(uri, tpiVar, true, uri2);
                }
                if (!n(uri, "smart-webview")) {
                    Iterable iterable = (Set) tpiVar.k("plus-sdk-smart-webview-enabled");
                    if (iterable == null) {
                        iterable = q5b.a;
                    }
                    Iterable iterable2 = iterable;
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it3 = iterable2.iterator();
                        while (it3.hasNext()) {
                            if (Boolean.parseBoolean((String) it3.next())) {
                            }
                        }
                    }
                    if (!n(uri, "story")) {
                        if (n(uri, "debug-panel")) {
                            return com.yandex.plus.home.feature.webviews.internal.uri.a.a;
                        }
                        if (n(uri, "simple-webview")) {
                            if (uri2 != null) {
                                return u(uri, tpiVar, uri2);
                            }
                            xq0.x("Can't map to simple, url is absent!");
                            return null;
                        }
                        if (!p(uri)) {
                            return (kotlin.text.c.o(uri.getScheme(), str, true) && kotlin.text.c.o(uri.getAuthority(), "plus-home-sdk", true)) ? t(uri, tpiVar, false, uri2) : new com.yandex.plus.home.feature.webviews.internal.uri.h(uri);
                        }
                        Uri build = new Uri.Builder().scheme(str).authority("plus-home-sdk").path("simple-webview").appendQueryParameter("url", uri.toString()).build();
                        build.getClass();
                        return u(build, tpiVar, uri);
                    }
                    Set set7 = (Set) tpiVar.g("shortcut-id");
                    String str5 = set7 != null ? (String) CollectionsKt.R(set7) : null;
                    if (str5 == null) {
                        xq0.x("Story deeplink has no query parameter shortcut-id!");
                        return null;
                    }
                    Set set8 = (Set) tpiVar.k(Constants.KEY_MESSAGE);
                    String str6 = set8 != null ? (String) CollectionsKt.R(set8) : null;
                    Uri.Builder clearQuery = (uri2 == null ? (Uri) this.d : uri2).buildUpon().clearQuery();
                    clearQuery.getClass();
                    g(clearQuery, tpiVar);
                    if (uri2 == null || (fragment2 = uri2.getFragment()) == null) {
                        fragment2 = uri.getFragment();
                    }
                    Uri build2 = clearQuery.fragment(fragment2).build();
                    build2.getClass();
                    return new com.yandex.plus.home.feature.webviews.internal.uri.g(build2, str5, str6);
                }
                if (uri2 == null) {
                    xq0.x("Can't parse to smart, url is absent!");
                    return null;
                }
                Set<String> set9 = (Set) tpiVar.k("openFormat");
                if (set9 != null) {
                    for (String str7 : set9) {
                        com.yandex.plus.home.feature.webviews.internal.uri.i iVar2 = kotlin.text.c.o(str7, "full", true) ? com.yandex.plus.home.feature.webviews.internal.uri.i.b : kotlin.text.c.o(str7, "card", true) ? com.yandex.plus.home.feature.webviews.internal.uri.i.a : null;
                        if (iVar2 != null) {
                            iVar = iVar2;
                            break;
                        }
                    }
                }
                iVar = null;
                Set<String> set10 = (Set) tpiVar.k("modalHeightType");
                if (set10 != null) {
                    for (String str8 : set10) {
                        com.yandex.plus.home.feature.webviews.internal.uri.d dVar2 = kotlin.text.c.o(str8, "fixed", true) ? com.yandex.plus.home.feature.webviews.internal.uri.d.b : kotlin.text.c.o(str8, "percent", true) ? com.yandex.plus.home.feature.webviews.internal.uri.d.a : null;
                        if (dVar2 != null) {
                            dVar = dVar2;
                            break;
                        }
                    }
                }
                dVar = null;
                Set set11 = (Set) tpiVar.k("modalHeightValue");
                if (set11 != null) {
                    Iterator it4 = set11.iterator();
                    while (it4.hasNext()) {
                        Integer intOrNull = StringsKt.toIntOrNull((String) it4.next());
                        if (intOrNull != null) {
                            num = intOrNull;
                            break;
                        }
                    }
                }
                num = null;
                Set set12 = (Set) tpiVar.k("plus-smart-broadcast-id");
                String str9 = set12 != null ? (String) CollectionsKt.R(set12) : null;
                Set set13 = (Set) tpiVar.k("shadowAlpha");
                if (set13 != null) {
                    Iterator it5 = set13.iterator();
                    while (it5.hasNext()) {
                        Integer intOrNull2 = StringsKt.toIntOrNull((String) it5.next());
                        if (intOrNull2 != null) {
                            num2 = intOrNull2;
                            break;
                        }
                    }
                }
                num2 = null;
                Set set14 = (Set) tpiVar.k("disableClose");
                if (set14 != null) {
                    Iterator it6 = set14.iterator();
                    if (it6.hasNext()) {
                        bool = Boolean.valueOf(Boolean.parseBoolean((String) it6.next()));
                        set = (Set) tpiVar.k("showNavBar");
                        if (set != null) {
                            Iterator it7 = set.iterator();
                            if (it7.hasNext()) {
                                bool2 = Boolean.valueOf(Boolean.parseBoolean((String) it7.next()));
                                set2 = (Set) tpiVar.k("showDash");
                                if (set2 != null) {
                                    Iterator it8 = set2.iterator();
                                    if (it8.hasNext()) {
                                        bool3 = Boolean.valueOf(Boolean.parseBoolean((String) it8.next()));
                                        set3 = (Set) tpiVar.k("navBarType");
                                        if (set3 != null) {
                                            Iterator it9 = set3.iterator();
                                            if (it9.hasNext()) {
                                                bool4 = Boolean.valueOf(kotlin.text.c.o((String) it9.next(), "CROSS_AND_ARROW", true));
                                                if (set3 != null) {
                                                    Iterator it10 = set3.iterator();
                                                    if (it10.hasNext()) {
                                                        String str10 = (String) it10.next();
                                                        bool6 = Boolean.valueOf(kotlin.text.c.o(str10, "CROSS_AND_ARROW", true) || kotlin.text.c.o(str10, "ONLY_ARROW", true));
                                                    } else {
                                                        bool6 = null;
                                                    }
                                                    bool5 = bool6;
                                                } else {
                                                    bool5 = null;
                                                }
                                                Set set15 = (Set) tpiVar.k(Constants.KEY_MESSAGE);
                                                String str11 = set15 != null ? (String) CollectionsKt.R(set15) : null;
                                                Uri.Builder clearQuery2 = uri2.buildUpon().clearQuery();
                                                clearQuery2.getClass();
                                                g(clearQuery2, tpiVar);
                                                fragment = uri2.getFragment();
                                                if (fragment == null) {
                                                    fragment = uri.getFragment();
                                                }
                                                Uri build3 = clearQuery2.fragment(fragment).build();
                                                build3.getClass();
                                                return new com.yandex.plus.home.feature.webviews.internal.uri.f(build3, iVar, dVar, num, str9, num2, bool, bool2, bool3, bool4, bool5, str11);
                                            }
                                        }
                                        bool4 = null;
                                        if (set3 != null) {
                                        }
                                        Set set152 = (Set) tpiVar.k(Constants.KEY_MESSAGE);
                                        if (set152 != null) {
                                        }
                                        Uri.Builder clearQuery22 = uri2.buildUpon().clearQuery();
                                        clearQuery22.getClass();
                                        g(clearQuery22, tpiVar);
                                        fragment = uri2.getFragment();
                                        if (fragment == null) {
                                        }
                                        Uri build32 = clearQuery22.fragment(fragment).build();
                                        build32.getClass();
                                        return new com.yandex.plus.home.feature.webviews.internal.uri.f(build32, iVar, dVar, num, str9, num2, bool, bool2, bool3, bool4, bool5, str11);
                                    }
                                }
                                bool3 = null;
                                set3 = (Set) tpiVar.k("navBarType");
                                if (set3 != null) {
                                }
                                bool4 = null;
                                if (set3 != null) {
                                }
                                Set set1522 = (Set) tpiVar.k(Constants.KEY_MESSAGE);
                                if (set1522 != null) {
                                }
                                Uri.Builder clearQuery222 = uri2.buildUpon().clearQuery();
                                clearQuery222.getClass();
                                g(clearQuery222, tpiVar);
                                fragment = uri2.getFragment();
                                if (fragment == null) {
                                }
                                Uri build322 = clearQuery222.fragment(fragment).build();
                                build322.getClass();
                                return new com.yandex.plus.home.feature.webviews.internal.uri.f(build322, iVar, dVar, num, str9, num2, bool, bool2, bool3, bool4, bool5, str11);
                            }
                        }
                        bool2 = null;
                        set2 = (Set) tpiVar.k("showDash");
                        if (set2 != null) {
                        }
                        bool3 = null;
                        set3 = (Set) tpiVar.k("navBarType");
                        if (set3 != null) {
                        }
                        bool4 = null;
                        if (set3 != null) {
                        }
                        Set set15222 = (Set) tpiVar.k(Constants.KEY_MESSAGE);
                        if (set15222 != null) {
                        }
                        Uri.Builder clearQuery2222 = uri2.buildUpon().clearQuery();
                        clearQuery2222.getClass();
                        g(clearQuery2222, tpiVar);
                        fragment = uri2.getFragment();
                        if (fragment == null) {
                        }
                        Uri build3222 = clearQuery2222.fragment(fragment).build();
                        build3222.getClass();
                        return new com.yandex.plus.home.feature.webviews.internal.uri.f(build3222, iVar, dVar, num, str9, num2, bool, bool2, bool3, bool4, bool5, str11);
                    }
                }
                bool = null;
                set = (Set) tpiVar.k("showNavBar");
                if (set != null) {
                }
                bool2 = null;
                set2 = (Set) tpiVar.k("showDash");
                if (set2 != null) {
                }
                bool3 = null;
                set3 = (Set) tpiVar.k("navBarType");
                if (set3 != null) {
                }
                bool4 = null;
                if (set3 != null) {
                }
                Set set152222 = (Set) tpiVar.k(Constants.KEY_MESSAGE);
                if (set152222 != null) {
                }
                Uri.Builder clearQuery22222 = uri2.buildUpon().clearQuery();
                clearQuery22222.getClass();
                g(clearQuery22222, tpiVar);
                fragment = uri2.getFragment();
                if (fragment == null) {
                }
                Uri build32222 = clearQuery22222.fragment(fragment).build();
                build32222.getClass();
                return new com.yandex.plus.home.feature.webviews.internal.uri.f(build32222, iVar, dVar, num, str9, num2, bool, bool2, bool3, bool4, bool5, str11);
            }
        }
        uri2 = null;
        if (uri2 != null) {
            while (r11.hasNext()) {
            }
        }
        Object[] objArr3 = tpiVar2.b;
        Object[] objArr22 = tpiVar2.c;
        long[] jArr3 = tpiVar2.a;
        length = jArr3.length - 2;
        if (length >= 0) {
        }
        if (!o(uri)) {
        }
    }

    public com.yandex.plus.home.feature.webviews.internal.uri.b t(Uri uri, tpi tpiVar, boolean z, Uri uri2) {
        Uri.Builder buildUpon;
        Uri.Builder clearQuery;
        Set set = (Set) tpiVar.k(Constants.KEY_MESSAGE);
        String str = null;
        String str2 = set != null ? (String) CollectionsKt.R(set) : null;
        Uri.Builder scheme = ((Uri) this.c).buildUpon().scheme("https");
        scheme.getClass();
        if (uri2 != null && (buildUpon = uri2.buildUpon()) != null && (clearQuery = buildUpon.clearQuery()) != null) {
            str = clearQuery.toString();
        }
        if (str != null) {
            scheme.appendQueryParameter("url", str);
        }
        g(scheme, tpiVar);
        Uri build = scheme.fragment(uri.getFragment()).build();
        build.getClass();
        return new com.yandex.plus.home.feature.webviews.internal.uri.b(build, z, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.yandex.plus.home.feature.webviews.internal.uri.e u(Uri uri, tpi tpiVar, Uri uri2) {
        com.yandex.plus.home.feature.webviews.internal.uri.i iVar;
        Boolean bool;
        Set set;
        Boolean bool2;
        Set set2;
        Boolean bool3;
        Boolean bool4;
        Set set3;
        boolean z;
        Iterable iterable;
        Iterable iterable2;
        Iterator it;
        Uri uri3;
        boolean z2;
        String fragment;
        Boolean bool5;
        Set<String> set4 = (Set) tpiVar.k("openFormat");
        if (set4 != null) {
            for (String str : set4) {
                com.yandex.plus.home.feature.webviews.internal.uri.i iVar2 = kotlin.text.c.o(str, "full", true) ? com.yandex.plus.home.feature.webviews.internal.uri.i.b : kotlin.text.c.o(str, "card", true) ? com.yandex.plus.home.feature.webviews.internal.uri.i.a : null;
                if (iVar2 != null) {
                    iVar = iVar2;
                    break;
                }
            }
        }
        iVar = null;
        Set set5 = (Set) tpiVar.k("showNavBar");
        if (set5 != null) {
            Iterator it2 = set5.iterator();
            if (it2.hasNext()) {
                bool = Boolean.valueOf(Boolean.parseBoolean((String) it2.next()));
                set = (Set) tpiVar.k("showDash");
                if (set != null) {
                    Iterator it3 = set.iterator();
                    if (it3.hasNext()) {
                        bool2 = Boolean.valueOf(Boolean.parseBoolean((String) it3.next()));
                        set2 = (Set) tpiVar.k("navBarType");
                        if (set2 != null) {
                            Iterator it4 = set2.iterator();
                            if (it4.hasNext()) {
                                bool3 = Boolean.valueOf(kotlin.text.c.o((String) it4.next(), "CROSS_AND_ARROW", true));
                                if (set2 == null) {
                                    Iterator it5 = set2.iterator();
                                    if (it5.hasNext()) {
                                        String str2 = (String) it5.next();
                                        bool5 = Boolean.valueOf(kotlin.text.c.o(str2, "CROSS_AND_ARROW", true) || kotlin.text.c.o(str2, "ONLY_ARROW", true));
                                    } else {
                                        bool5 = null;
                                    }
                                    bool4 = bool5;
                                } else {
                                    bool4 = null;
                                }
                                set3 = (Set) tpiVar.g("plusSdkNeedAuth");
                                if (set3 != null) {
                                    Iterator it6 = set3.iterator();
                                    Boolean valueOf = it6.hasNext() ? Boolean.valueOf(Boolean.parseBoolean((String) it6.next())) : null;
                                    if (valueOf != null) {
                                        z = valueOf.booleanValue();
                                        iterable = (Set) tpiVar.k("plusSdkOpenType");
                                        if (iterable == null) {
                                            iterable = q5b.a;
                                        }
                                        iterable2 = iterable;
                                        if ((iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                            it = iterable2.iterator();
                                            while (it.hasNext()) {
                                                if (kotlin.text.c.o((String) it.next(), "out", true)) {
                                                    uri3 = uri2;
                                                    break;
                                                }
                                            }
                                        }
                                        uri3 = uri2;
                                        if (!o(uri3)) {
                                            z2 = false;
                                            Uri.Builder clearQuery = uri3.buildUpon().clearQuery();
                                            clearQuery.getClass();
                                            g(clearQuery, tpiVar);
                                            fragment = uri3.getFragment();
                                            if (fragment == null) {
                                                fragment = uri.getFragment();
                                            }
                                            Uri build = clearQuery.fragment(fragment).build();
                                            build.getClass();
                                            return new com.yandex.plus.home.feature.webviews.internal.uri.e(build, z2, iVar, bool, bool2, bool3, bool4, z);
                                        }
                                        z2 = true;
                                        Uri.Builder clearQuery2 = uri3.buildUpon().clearQuery();
                                        clearQuery2.getClass();
                                        g(clearQuery2, tpiVar);
                                        fragment = uri3.getFragment();
                                        if (fragment == null) {
                                        }
                                        Uri build2 = clearQuery2.fragment(fragment).build();
                                        build2.getClass();
                                        return new com.yandex.plus.home.feature.webviews.internal.uri.e(build2, z2, iVar, bool, bool2, bool3, bool4, z);
                                    }
                                }
                                z = true;
                                iterable = (Set) tpiVar.k("plusSdkOpenType");
                                if (iterable == null) {
                                }
                                iterable2 = iterable;
                                if (iterable2 instanceof Collection) {
                                }
                                it = iterable2.iterator();
                                while (it.hasNext()) {
                                }
                                uri3 = uri2;
                                if (!o(uri3)) {
                                }
                                z2 = true;
                                Uri.Builder clearQuery22 = uri3.buildUpon().clearQuery();
                                clearQuery22.getClass();
                                g(clearQuery22, tpiVar);
                                fragment = uri3.getFragment();
                                if (fragment == null) {
                                }
                                Uri build22 = clearQuery22.fragment(fragment).build();
                                build22.getClass();
                                return new com.yandex.plus.home.feature.webviews.internal.uri.e(build22, z2, iVar, bool, bool2, bool3, bool4, z);
                            }
                        }
                        bool3 = null;
                        if (set2 == null) {
                        }
                        set3 = (Set) tpiVar.g("plusSdkNeedAuth");
                        if (set3 != null) {
                        }
                        z = true;
                        iterable = (Set) tpiVar.k("plusSdkOpenType");
                        if (iterable == null) {
                        }
                        iterable2 = iterable;
                        if (iterable2 instanceof Collection) {
                        }
                        it = iterable2.iterator();
                        while (it.hasNext()) {
                        }
                        uri3 = uri2;
                        if (!o(uri3)) {
                        }
                        z2 = true;
                        Uri.Builder clearQuery222 = uri3.buildUpon().clearQuery();
                        clearQuery222.getClass();
                        g(clearQuery222, tpiVar);
                        fragment = uri3.getFragment();
                        if (fragment == null) {
                        }
                        Uri build222 = clearQuery222.fragment(fragment).build();
                        build222.getClass();
                        return new com.yandex.plus.home.feature.webviews.internal.uri.e(build222, z2, iVar, bool, bool2, bool3, bool4, z);
                    }
                }
                bool2 = null;
                set2 = (Set) tpiVar.k("navBarType");
                if (set2 != null) {
                }
                bool3 = null;
                if (set2 == null) {
                }
                set3 = (Set) tpiVar.g("plusSdkNeedAuth");
                if (set3 != null) {
                }
                z = true;
                iterable = (Set) tpiVar.k("plusSdkOpenType");
                if (iterable == null) {
                }
                iterable2 = iterable;
                if (iterable2 instanceof Collection) {
                }
                it = iterable2.iterator();
                while (it.hasNext()) {
                }
                uri3 = uri2;
                if (!o(uri3)) {
                }
                z2 = true;
                Uri.Builder clearQuery2222 = uri3.buildUpon().clearQuery();
                clearQuery2222.getClass();
                g(clearQuery2222, tpiVar);
                fragment = uri3.getFragment();
                if (fragment == null) {
                }
                Uri build2222 = clearQuery2222.fragment(fragment).build();
                build2222.getClass();
                return new com.yandex.plus.home.feature.webviews.internal.uri.e(build2222, z2, iVar, bool, bool2, bool3, bool4, z);
            }
        }
        bool = null;
        set = (Set) tpiVar.k("showDash");
        if (set != null) {
        }
        bool2 = null;
        set2 = (Set) tpiVar.k("navBarType");
        if (set2 != null) {
        }
        bool3 = null;
        if (set2 == null) {
        }
        set3 = (Set) tpiVar.g("plusSdkNeedAuth");
        if (set3 != null) {
        }
        z = true;
        iterable = (Set) tpiVar.k("plusSdkOpenType");
        if (iterable == null) {
        }
        iterable2 = iterable;
        if (iterable2 instanceof Collection) {
        }
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        uri3 = uri2;
        if (!o(uri3)) {
        }
        z2 = true;
        Uri.Builder clearQuery22222 = uri3.buildUpon().clearQuery();
        clearQuery22222.getClass();
        g(clearQuery22222, tpiVar);
        fragment = uri3.getFragment();
        if (fragment == null) {
        }
        Uri build22222 = clearQuery22222.fragment(fragment).build();
        build22222.getClass();
        return new com.yandex.plus.home.feature.webviews.internal.uri.e(build22222, z2, iVar, bool, bool2, bool3, bool4, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(Object obj, com.yandex.plus.bdui.shared.b bVar, cg6 cg6Var) {
        q qVar;
        int i;
        Object w;
        Throwable a;
        String str = (String) this.f;
        com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) this.a;
        if (cg6Var instanceof q) {
            qVar = (q) cg6Var;
            int i2 = qVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = qVar.j;
                Object obj3 = nm6.a;
                i = qVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.plus.bdui.flex.utils.d a2 = com.yandex.plus.bdui.flex.utils.g.a(bVar, obj);
                    if (a2.c.isEmpty() && a2.d.isEmpty()) {
                        return bVar;
                    }
                    qVar.l = 1;
                    w = w(a2, qVar);
                    if (w == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                    w = ((z7o) obj2).a;
                }
                r7o r7oVar = z7o.b;
                if (!(w instanceof t7o)) {
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                    if (bVar2.b(aVar)) {
                        bVar2.c(aVar, str, "Rendering succeded");
                    }
                }
                a = z7o.a(w);
                if (a != null) {
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                    if (bVar2.b(aVar2)) {
                        bVar2.a(aVar2, str, "Rendering failed!", a);
                    }
                }
                qgg.h0(w);
                return ((com.yandex.plus.bdui.flex.utils.d) w).b;
            }
        }
        qVar = new q(this, cg6Var);
        Object obj22 = qVar.j;
        Object obj32 = nm6.a;
        i = qVar.l;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        if (!(w instanceof t7o)) {
        }
        a = z7o.a(w);
        if (a != null) {
        }
        qgg.h0(w);
        return ((com.yandex.plus.bdui.flex.utils.d) w).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object w(com.yandex.plus.bdui.flex.utils.d dVar, cg6 cg6Var) {
        r rVar;
        int i;
        if (cg6Var instanceof r) {
            rVar = (r) cg6Var;
            int i2 = rVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.l = i2 - Integer.MIN_VALUE;
                Object obj = rVar.j;
                nm6 nm6Var = nm6.a;
                i = rVar.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return ((z7o) obj).a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.a;
                String str = (String) this.f;
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                if (bVar.b(aVar)) {
                    bVar.c(aVar, str, "Renderables found, rendering...");
                }
                com.yandex.plus.bdui.flex.utils.g gVar = (com.yandex.plus.bdui.flex.utils.g) this.b;
                rVar.l = 1;
                Object b = gVar.b(dVar, rVar);
                return b == nm6Var ? nm6Var : b;
            }
        }
        rVar = new r(this, cg6Var);
        Object obj2 = rVar.j;
        nm6 nm6Var2 = nm6.a;
        i = rVar.l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0142, code lost:
    
        if (r2 != r4) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0142 -> B:11:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(com.yandex.plus.bdui.plus.content.r rVar, com.yandex.plus.bdui.plus.webview.g gVar, h8e h8eVar, cg6 cg6Var) {
        com.yandex.plus.bdui.plus.webview.n nVar;
        int i;
        com.yandex.plus.bdui.plus.content.r rVar2;
        long j;
        xqn xqnVar;
        com.yandex.plus.bdui.plus.webview.n nVar2;
        vqn vqnVar;
        wqn wqnVar;
        h8e h8eVar2;
        com.yandex.plus.bdui.plus.content.r rVar3;
        h8e h8eVar3;
        wqn wqnVar2;
        long j2;
        xqn xqnVar2;
        vqn vqnVar2;
        char c;
        com.yandex.plus.log.api.b bVar;
        com.yandex.plus.log.api.a aVar;
        long j3;
        if (cg6Var instanceof com.yandex.plus.bdui.plus.webview.n) {
            nVar = (com.yandex.plus.bdui.plus.webview.n) cg6Var;
            int i2 = nVar.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.r = i2 - Integer.MIN_VALUE;
                Object obj = nVar.p;
                nm6 nm6Var = nm6.a;
                i = nVar.r;
                int i3 = 1;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.bdui.plus.webview.e eVar = gVar instanceof com.yandex.plus.bdui.plus.webview.e ? (com.yandex.plus.bdui.plus.webview.e) gVar : null;
                    if ((eVar != null ? eVar.c : null) != null) {
                        rVar2 = rVar;
                        com.yandex.plus.bdui.plus.content.l lVar = rVar2.e;
                        if (lVar.a > 0) {
                            wqn wqnVar3 = new wqn();
                            com.yandex.plus.bdui.plus.content.q qVar = lVar.b;
                            long j4 = qVar.a;
                            if (j4 < 0) {
                                j4 = 0;
                            }
                            wqnVar3.a = j4;
                            long j5 = qVar.b;
                            j = j5 >= 0 ? j5 : 0L;
                            xqn xqnVar3 = new xqn();
                            xqnVar3.a = eVar;
                            xqnVar = xqnVar3;
                            nVar2 = nVar;
                            vqnVar = new vqn();
                            wqnVar = wqnVar3;
                            h8eVar2 = h8eVar;
                            vqnVar.a += i3;
                            bVar = (com.yandex.plus.log.api.b) this.a;
                            aVar = com.yandex.plus.log.api.a.d;
                            if (bVar.b(aVar)) {
                            }
                            j3 = wqnVar.a;
                            nVar2.j = rVar2;
                            nVar2.k = h8eVar2;
                            nVar2.l = wqnVar;
                            nVar2.m = xqnVar;
                            nVar2.n = vqnVar;
                            nVar2.o = j;
                            nVar2.r = 1;
                            if (y2x.o(j3, nVar2) != nm6Var) {
                            }
                            return nm6Var;
                        }
                    }
                    return new com.yandex.plus.bdui.plus.webview.i(gVar);
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = nVar.o;
                    vqnVar2 = nVar.n;
                    xqnVar2 = nVar.m;
                    wqnVar2 = nVar.l;
                    h8eVar3 = nVar.k;
                    rVar3 = nVar.j;
                    qgg.h0(obj);
                    c = 2;
                    com.yandex.plus.bdui.plus.webview.n nVar3 = nVar;
                    vqnVar = vqnVar2;
                    h8eVar2 = h8eVar3;
                    long j6 = j2;
                    nVar2 = nVar3;
                    xqnVar = xqnVar2;
                    rVar2 = rVar3;
                    j = j6;
                    com.yandex.plus.bdui.plus.webview.g gVar2 = (com.yandex.plus.bdui.plus.webview.g) obj;
                    com.yandex.plus.bdui.plus.webview.e eVar2 = gVar2 instanceof com.yandex.plus.bdui.plus.webview.e ? (com.yandex.plus.bdui.plus.webview.e) gVar2 : null;
                    xqnVar.a = eVar2;
                    if ((eVar2 != null ? eVar2.c : null) == null || vqnVar.a >= rVar2.e.a) {
                        return new com.yandex.plus.bdui.plus.webview.j(gVar2, vqnVar.a);
                    }
                    wqnVar = wqnVar2;
                    vqnVar.a += i3;
                    bVar = (com.yandex.plus.log.api.b) this.a;
                    aVar = com.yandex.plus.log.api.a.d;
                    if (bVar.b(aVar)) {
                        StringBuilder sb = new StringBuilder("WebView loading failed! Retry ");
                        sb.append(vqnVar.a);
                        sb.append(" after delay ");
                        bVar.c(aVar, "DefaultWebViewProvider", hrg.m(wqnVar.a, " msecs", sb));
                    }
                    j3 = wqnVar.a;
                    nVar2.j = rVar2;
                    nVar2.k = h8eVar2;
                    nVar2.l = wqnVar;
                    nVar2.m = xqnVar;
                    nVar2.n = vqnVar;
                    nVar2.o = j;
                    nVar2.r = 1;
                    if (y2x.o(j3, nVar2) != nm6Var) {
                        wqnVar2 = wqnVar;
                        long j7 = j;
                        h8eVar3 = h8eVar2;
                        vqnVar2 = vqnVar;
                        rVar3 = rVar2;
                        nVar = nVar2;
                        xqnVar2 = xqnVar;
                        j2 = j7;
                        wqnVar2.a += j2;
                        nVar.j = rVar3;
                        nVar.k = h8eVar3;
                        nVar.l = wqnVar2;
                        nVar.m = xqnVar2;
                        nVar.n = vqnVar2;
                        nVar.o = j2;
                        c = 2;
                        nVar.r = 2;
                        i3 = 1;
                        zt3 zt3Var = new zt3(1, qxe.b(nVar));
                        zt3Var.s();
                        h8eVar3.getClass();
                        h8eVar3.a = new com.yandex.passport.internal.ui.bouncer.o(29, new tqn(), zt3Var);
                        Object obj2 = xqnVar2.a;
                        obj2.getClass();
                        Function0 function0 = ((com.yandex.plus.bdui.plus.webview.e) obj2).c;
                        function0.getClass();
                        function0.invoke();
                        obj = zt3Var.q();
                        nm6 nm6Var2 = nm6.a;
                    }
                    return nm6Var;
                }
                j2 = nVar.o;
                vqnVar2 = nVar.n;
                xqnVar2 = nVar.m;
                wqnVar2 = nVar.l;
                h8eVar3 = nVar.k;
                rVar3 = nVar.j;
                qgg.h0(obj);
                wqnVar2.a += j2;
                nVar.j = rVar3;
                nVar.k = h8eVar3;
                nVar.l = wqnVar2;
                nVar.m = xqnVar2;
                nVar.n = vqnVar2;
                nVar.o = j2;
                c = 2;
                nVar.r = 2;
                i3 = 1;
                zt3 zt3Var2 = new zt3(1, qxe.b(nVar));
                zt3Var2.s();
                h8eVar3.getClass();
                h8eVar3.a = new com.yandex.passport.internal.ui.bouncer.o(29, new tqn(), zt3Var2);
                Object obj22 = xqnVar2.a;
                obj22.getClass();
                Function0 function02 = ((com.yandex.plus.bdui.plus.webview.e) obj22).c;
                function02.getClass();
                function02.invoke();
                obj = zt3Var2.q();
                nm6 nm6Var22 = nm6.a;
            }
        }
        nVar = new com.yandex.plus.bdui.plus.webview.n(this, cg6Var);
        Object obj3 = nVar.p;
        nm6 nm6Var3 = nm6.a;
        i = nVar.r;
        int i32 = 1;
        if (i != 0) {
        }
    }

    public eno y(View view, boolean z) {
        SparseArray sparseArray = (SparseArray) this.g;
        view.getClass();
        com.yandex.plus.core.analytics.logging.d dVar = (com.yandex.plus.core.analytics.logging.d) this.b;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        Continuation continuation = null;
        if (dVar.b(aVar)) {
            dVar.a(aVar, "PlusViewAwarenessDetectorImpl", "startDetecting() view=" + view, null);
        }
        r1.G(view);
        Object obj = sparseArray.get(view.getId());
        Object obj2 = obj;
        if (obj == null) {
            com.yandex.plus.home.common.utils.flow.b bVar = new com.yandex.plus.home.common.utils.flow.b();
            if (view.isAttachedToWindow()) {
                sparseArray.put(view.getId(), bVar);
                d(this, view);
                b(this, view);
                ((SparseArray) this.a).put(view.getId(), new com.yandex.plus.home.feature.panel.internalapi.f(this, view, z));
                ((SparseArray) this.f).put(view.getId(), new com.yandex.plus.home.feature.panel.internalapi.g(this, view, z));
                a(this, view);
            } else {
                view.addOnAttachStateChangeListener(new com.yandex.plus.home.feature.panel.internalapi.e(view, this, bVar, z));
            }
            if (view.isAttachedToWindow()) {
                view.addOnAttachStateChangeListener(new com.yandex.passport.internal.ui.bouncer.roundabout.n(5, view, this));
                obj2 = bVar;
            } else {
                d(this, view);
                b(this, view);
                sparseArray.remove(view.getId());
                obj2 = bVar;
            }
        }
        return new eno(new com.yandex.plus.bdui.ui.b((com.yandex.plus.home.common.utils.flow.b) obj2, continuation, 7));
    }

    public Uri z(Uri uri) {
        if (!p(uri)) {
            xq0.x("Weblink is already deeplink!");
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        pathSegments.getClass();
        String str = (String) CollectionsKt.firstOrNull(pathSegments);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme((String) this.f).authority("plus-home-sdk").appendQueryParameter("url", uri.buildUpon().build().toString());
        if (kotlin.text.c.o(str, "story", true)) {
            Uri build = appendQueryParameter.path("story").build();
            build.getClass();
            return build;
        }
        if (kotlin.text.c.o(str, "smart-webview", true) || uri.getBooleanQueryParameter("plus-sdk-smart-webview-enabled", false)) {
            Uri build2 = appendQueryParameter.path("smart-webview").build();
            build2.getClass();
            return build2;
        }
        if (kotlin.text.c.o(str, "simple-webview", true)) {
            Uri build3 = appendQueryParameter.path("simple-webview").build();
            build3.getClass();
            return build3;
        }
        if (!kotlin.text.c.o(str, "debug-panel", true)) {
            xq0.q("Can't wrap weblink into deeplink!");
            return null;
        }
        Uri build4 = appendQueryParameter.path("debug-panel").build();
        build4.getClass();
        return build4;
    }

    public s(String str, com.yandex.plus.core.analytics.logging.d dVar, Set set, Uri uri, Uri uri2) {
        str.getClass();
        dVar.getClass();
        set.getClass();
        uri.getClass();
        uri2.getClass();
        this.f = str;
        this.a = dVar;
        this.b = set;
        this.c = uri;
        this.d = uri2;
        this.e = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(6, this));
        this.g = com.yandex.plus.home.feature.webviews.internal.uri.a.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(com.yandex.plus.bdui.flex.utils.g gVar, pyc pycVar, Function2 function2, pyc pycVar2, com.yandex.plus.log.api.b bVar, String str) {
        bVar.getClass();
        this.b = gVar;
        this.c = pycVar;
        this.d = (ezc) function2;
        this.e = (ezc) pycVar2;
        this.a = bVar;
        this.f = str;
    }

    public s(Context context) {
        context.getClass();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setBackgroundColor(r1.j(R.attr.plus_sdk_daily_quests_background, frameLayout));
        WeakHashMap weakHashMap = wdu.a;
        final int i = 2;
        frameLayout.setImportantForAccessibility(2);
        this.b = frameLayout;
        xdr a = ydr.a(com.yandex.plus.home.dailyquests.feature.internal.model.b.a);
        this.c = a;
        this.d = a;
        this.e = LayoutInflater.from(context);
        final int i2 = 0;
        this.a = btf.b(new Function0(this) { // from class: com.yandex.plus.home.dailyquests.feature.internal.ui.a
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        LayoutInflater layoutInflater = (LayoutInflater) this.b.e;
                        layoutInflater.getClass();
                        return new com.yandex.plus.home.dailyquests.feature.internal.ui.states.b(layoutInflater);
                    case 1:
                        LayoutInflater layoutInflater2 = (LayoutInflater) this.b.e;
                        layoutInflater2.getClass();
                        return new com.yandex.plus.home.dailyquests.feature.internal.ui.states.a(layoutInflater2);
                    default:
                        LayoutInflater layoutInflater3 = (LayoutInflater) this.b.e;
                        layoutInflater3.getClass();
                        return new com.yandex.plus.home.dailyquests.feature.internal.ui.states.c(layoutInflater3);
                }
            }
        });
        final int i3 = 1;
        this.f = btf.b(new Function0(this) { // from class: com.yandex.plus.home.dailyquests.feature.internal.ui.a
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        LayoutInflater layoutInflater = (LayoutInflater) this.b.e;
                        layoutInflater.getClass();
                        return new com.yandex.plus.home.dailyquests.feature.internal.ui.states.b(layoutInflater);
                    case 1:
                        LayoutInflater layoutInflater2 = (LayoutInflater) this.b.e;
                        layoutInflater2.getClass();
                        return new com.yandex.plus.home.dailyquests.feature.internal.ui.states.a(layoutInflater2);
                    default:
                        LayoutInflater layoutInflater3 = (LayoutInflater) this.b.e;
                        layoutInflater3.getClass();
                        return new com.yandex.plus.home.dailyquests.feature.internal.ui.states.c(layoutInflater3);
                }
            }
        });
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.home.dailyquests.feature.internal.ui.a
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        LayoutInflater layoutInflater = (LayoutInflater) this.b.e;
                        layoutInflater.getClass();
                        return new com.yandex.plus.home.dailyquests.feature.internal.ui.states.b(layoutInflater);
                    case 1:
                        LayoutInflater layoutInflater2 = (LayoutInflater) this.b.e;
                        layoutInflater2.getClass();
                        return new com.yandex.plus.home.dailyquests.feature.internal.ui.states.a(layoutInflater2);
                    default:
                        LayoutInflater layoutInflater3 = (LayoutInflater) this.b.e;
                        layoutInflater3.getClass();
                        return new com.yandex.plus.home.dailyquests.feature.internal.ui.states.c(layoutInflater3);
                }
            }
        });
    }

    public s(Context context, com.yandex.plus.home.auth.f fVar, com.yandex.plus.metrica.utils.i iVar, com.yandex.passport.sloth.ui.c cVar, kotlinx.coroutines.a aVar, com.yandex.plus.core.config.a aVar2) {
        fVar.getClass();
        iVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.b = context;
        this.c = fVar;
        this.d = iVar;
        this.e = cVar;
        this.a = aVar;
        this.f = aVar2;
        this.g = ydr.a(c5b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(Function0 function0, com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.acquisition.adapter.internal.controller.b bVar, wxm wxmVar, com.yandex.passport.internal.ui.bouncer.model.middleware.o oVar, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, y yVar) {
        bVar.getClass();
        aVar.getClass();
        yVar.getClass();
        this.d = (ezc) function0;
        this.b = fVar;
        this.c = bVar;
        this.e = wxmVar;
        this.a = oVar;
        this.f = aVar;
        this.g = yVar;
    }

    public s(kotlinx.coroutines.a aVar, com.yandex.plus.core.analytics.logging.d dVar) {
        aVar.getClass();
        this.b = dVar;
        this.c = gld.e(kotlin.coroutines.e.c(a4g.n(), aVar));
        this.d = new SparseArray();
        this.e = new SparseArray();
        this.a = new SparseArray();
        this.f = new SparseArray();
        this.g = new SparseArray();
    }

    public s(com.yandex.plus.pay.ui.core.internal.di.g gVar, com.yandex.plus.bdui.plus.auth.a aVar, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar2, com.yandex.plus.bdui.plus.analytics.c cVar, kotlinx.coroutines.a aVar3, tf6 tf6Var, com.yandex.plus.log.api.b bVar) {
        gVar.getClass();
        cVar.getClass();
        aVar3.getClass();
        bVar.getClass();
        this.b = gVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = cVar;
        this.f = aVar3;
        this.g = tf6Var;
        this.a = bVar;
    }

    public s(com.yandex.plus.core.imageloader.b bVar, Context context, com.yandex.plus.home.plaque.repository.graphql.formatter.c cVar, com.yandex.plus.home.plaque.repository.graphql.formatter.b bVar2, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, u13 u13Var, com.yandex.plus.home.plaque.animator.internal.utils.a aVar2, com.yandex.plus.log.api.b bVar3) {
        cVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        this.b = bVar;
        this.c = cVar;
        this.d = bVar2;
        this.e = aVar;
        this.f = u13Var;
        this.a = bVar3;
        this.g = new uf6(context, u13Var.e());
    }
}
