package com.yandex.passport.data.network.token;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.api.y1;
import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.data.network.h6;
import com.yandex.passport.data.network.n5;
import com.yandex.passport.data.network.t5;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.e7o;
import defpackage.g4i;
import defpackage.hrg;
import defpackage.l3o;
import defpackage.ldg;
import defpackage.tah;
import defpackage.v75;
import defpackage.ydr;
import defpackage.zhp;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class i implements com.yandex.passport.data.network.core.e, com.yandex.passport.data.network.core.f {
    public final /* synthetic */ int a;

    public i(com.yandex.plus.acquisition.sdk.pay.impl.b bVar, com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.d dVar) {
        this.a = 28;
        dVar.getClass();
        ydr.a(null);
    }

    public static int c(String str, String str2) {
        str.getClass();
        str2.getClass();
        com.yandex.passport.common.network.n m = m(str);
        com.yandex.passport.common.network.n m2 = m(str2);
        ArrayList arrayList = (ArrayList) m.b;
        List list = (List) m.c;
        ArrayList arrayList2 = (ArrayList) m2.b;
        List list2 = (List) m2.c;
        int d = d(arrayList, arrayList2);
        if (d != 0) {
            return d;
        }
        if (list.isEmpty() && list2.isEmpty()) {
            return 0;
        }
        if (!list.isEmpty() && list2.isEmpty()) {
            return -1;
        }
        if (!list.isEmpty() || list2.isEmpty()) {
            return d(list, list2);
        }
        return 1;
    }

    public static int d(List list, List list2) {
        int compareTo;
        int max = Math.max(list.size(), list2.size());
        if (max >= 0) {
            int i = 0;
            while (true) {
                Comparable comparable = (Comparable) CollectionsKt.S(list, i);
                Comparable comparable2 = (Comparable) CollectionsKt.S(list2, i);
                if (comparable != null && comparable2 != null && (compareTo = comparable.compareTo(comparable2)) != 0) {
                    return compareTo;
                }
                if (comparable != null && comparable2 == null) {
                    return 1;
                }
                if (comparable == null && comparable2 != null) {
                    return -1;
                }
                if (i == max) {
                    break;
                }
                i++;
            }
        }
        return 0;
    }

    public static Intent e(com.yandex.passport.api.k0 k0Var, Context context, y1 y1Var, com.yandex.passport.internal.ui.webview.webcases.a0 a0Var, Bundle bundle) {
        int i = WebViewActivity.h;
        k0Var.getClass();
        context.getClass();
        y1Var.getClass();
        a0Var.getClass();
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        intent.putExtra("environment", k0Var.d());
        intent.putExtra("web-case", a0Var.ordinal());
        intent.putExtra("web-case-data", bundle);
        intent.putExtra("show-debug-overlay", false);
        intent.putExtra("passport-theme", y1Var.ordinal());
        Intent addFlags = intent.addFlags(SQLiteDatabase.OPEN_FULLMUTEX);
        addFlags.getClass();
        return addFlags;
    }

    public static com.yandex.passport.internal.flags.experiments.j f(String str) {
        str.getClass();
        com.yandex.passport.internal.flags.experiments.j jVar = com.yandex.passport.internal.flags.experiments.j.b;
        if (str.equals("=")) {
            return jVar;
        }
        com.yandex.passport.internal.flags.experiments.j jVar2 = com.yandex.passport.internal.flags.experiments.j.c;
        if (str.equals("<=")) {
            return jVar2;
        }
        com.yandex.passport.internal.flags.experiments.j jVar3 = com.yandex.passport.internal.flags.experiments.j.d;
        if (str.equals(">=")) {
            return jVar3;
        }
        com.yandex.passport.internal.flags.experiments.j jVar4 = com.yandex.passport.internal.flags.experiments.j.e;
        str.equals("!=");
        return jVar4;
    }

    public static com.yandex.passport.internal.stash.b h(String str) {
        str.getClass();
        for (com.yandex.passport.internal.stash.b bVar : com.yandex.passport.internal.stash.b.values()) {
            if (Intrinsics.d(bVar.a, str)) {
                return bVar;
            }
        }
        return null;
    }

    public static com.yandex.passport.internal.database.auth_cookie.e i(String str, List list) {
        Object obj;
        Object obj2;
        list.getClass();
        str.getClass();
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.d(((com.yandex.passport.internal.database.auth_cookie.e) obj2).c, str)) {
                break;
            }
        }
        com.yandex.passport.internal.database.auth_cookie.e eVar = (com.yandex.passport.internal.database.auth_cookie.e) obj2;
        if (eVar != null) {
            return eVar;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (StringsKt.U(((com.yandex.passport.internal.database.auth_cookie.e) next).c)) {
                obj = next;
                break;
            }
        }
        return (com.yandex.passport.internal.database.auth_cookie.e) obj;
    }

    public static Throwable j(i iVar, Throwable th, String str, Exception exc, com.yandex.passport.api.exception.j jVar, com.yandex.passport.api.exception.p pVar, com.yandex.passport.api.exception.j jVar2, int i) {
        if ((i & 2) != 0) {
            str = "-1";
        }
        if ((i & 4) != 0) {
            exc = new com.yandex.passport.api.exception.p(th);
        }
        if ((i & 8) != 0) {
            jVar = new com.yandex.passport.api.exception.t(th);
        }
        Throwable th2 = pVar;
        if ((i & 16) != 0) {
            th2 = new com.yandex.passport.api.exception.a();
        }
        Throwable th3 = jVar2;
        if ((i & 32) != 0) {
            th3 = new com.yandex.passport.api.exception.p(th);
        }
        iVar.getClass();
        str.getClass();
        if (th instanceof com.yandex.passport.data.exceptions.j) {
            return new com.yandex.passport.api.exception.t(hrg.q("The specified trackId '", str, "' is invalid."));
        }
        if (th instanceof com.yandex.passport.internal.core.accounts.o) {
            return new com.yandex.passport.api.exception.t(th);
        }
        if (th instanceof com.yandex.passport.api.exception.d) {
            return new com.yandex.passport.api.exception.d(String.valueOf(th.getMessage()));
        }
        if (!(th instanceof com.yandex.passport.internal.link_auth.c)) {
            return ((th instanceof IOException) || (th instanceof JSONException) || (th instanceof zhp)) ? new com.yandex.passport.api.exception.p(th) : th instanceof com.yandex.passport.data.exceptions.a ? exc : th instanceof com.yandex.passport.data.exceptions.m ? jVar : th instanceof com.yandex.passport.common.exception.a ? th2 : th instanceof com.yandex.passport.data.exceptions.h ? th3 : th instanceof com.yandex.passport.data.exceptions.e ? new com.yandex.passport.api.exception.i(0) : th;
        }
        com.yandex.passport.api.exception.s sVar = ((com.yandex.passport.internal.link_auth.c) th).a;
        sVar.getClass();
        return new com.yandex.passport.api.exception.h(sVar.name());
    }

    public static com.yandex.passport.data.models.a k(List list) {
        com.yandex.passport.data.models.j jVar;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = ((n5) obj).a;
            if (str == null || str.equals(ConstantDeviceInfo.APP_PLATFORM)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n5 n5Var = (n5) it.next();
            h6 h6Var = n5Var.b;
            com.yandex.passport.data.models.y l = h6Var != null ? l(h6Var) : null;
            h6 h6Var2 = n5Var.c;
            com.yandex.passport.data.models.b bVar = new com.yandex.passport.data.models.b(l, h6Var2 != null ? l(h6Var2) : null, n5Var.d);
            Map map = n5Var.e;
            LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                t5 t5Var = (t5) entry.getValue();
                Set set = t5Var.a;
                if (set != null) {
                    jVar = new com.yandex.passport.data.models.j(com.yandex.passport.data.models.i.a, set);
                } else {
                    Set set2 = t5Var.b;
                    if (set2 == null) {
                        b6e.l(t5Var, "unknown rule for filter parameter ");
                        return null;
                    }
                    jVar = new com.yandex.passport.data.models.j(com.yandex.passport.data.models.i.b, set2);
                }
                linkedHashMap.put(key, jVar);
            }
            arrayList2.add(new com.yandex.passport.data.models.f(bVar, linkedHashMap));
        }
        return new com.yandex.passport.data.models.a(arrayList2);
    }

    public static com.yandex.passport.data.models.y l(h6 h6Var) {
        String str = h6Var.b;
        if (str != null) {
            return new com.yandex.passport.data.models.y(com.yandex.passport.data.models.x.a, str);
        }
        String str2 = h6Var.a;
        if (str2 != null) {
            return new com.yandex.passport.data.models.y(com.yandex.passport.data.models.x.b, str2);
        }
        b6e.l(h6Var, "unknown rule for version ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [c5b] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static com.yandex.passport.common.network.n m(String str) {
        List split$default;
        List split$default2;
        List split$default3;
        ?? r0;
        List split$default4;
        com.yandex.passport.internal.filter.x wVar;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"+"}, false, 2, 2, null);
        split$default2 = StringsKt__StringsKt.split$default((String) split$default.get(0), new String[]{"-"}, false, 2, 2, null);
        split$default3 = StringsKt__StringsKt.split$default((String) split$default2.get(0), new String[]{"."}, false, 0, 6, null);
        List list = split$default3;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            e7o.e();
            return null;
        }
        if (split$default2.size() <= 1) {
            split$default2 = null;
        }
        if (split$default2 != null) {
            split$default4 = StringsKt__StringsKt.split$default((String) split$default2.get(1), new String[]{"."}, false, 0, 6, null);
            List<String> list2 = split$default4;
            r0 = new ArrayList(v75.o(list2, 10));
            for (String str2 : list2) {
                try {
                    wVar = new com.yandex.passport.internal.filter.v(Integer.parseInt(str2));
                } catch (Exception unused) {
                    str2.getClass();
                    wVar = new com.yandex.passport.internal.filter.w(str2);
                }
                r0.add(wVar);
            }
        } else {
            r0 = c5b.a;
        }
        return new com.yandex.passport.common.network.n(arrayList, (List) r0);
    }

    @Override // com.yandex.passport.data.network.core.f
    public Object a(Object obj, com.yandex.passport.common.network.i iVar) {
        String str = null;
        switch (this.a) {
            case 1:
                ((g) obj).getClass();
                iVar.getClass();
                if (iVar instanceof com.yandex.passport.common.network.h) {
                    String str2 = ((l) ((com.yandex.passport.common.network.h) iVar).a).b;
                    if (str2 != null && str2.length() > 0 && !str2.equals("-")) {
                        str = str2;
                    }
                    return new com.yandex.passport.common.account.a(str);
                }
                if (!(iVar instanceof com.yandex.passport.common.network.f)) {
                    b6e.s();
                    return null;
                }
                com.yandex.passport.common.network.x xVar = (com.yandex.passport.common.network.x) ((com.yandex.passport.common.network.f) iVar).a;
                List list = xVar.b;
                List<BackendError> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (BackendError backendError : list2) {
                        if (backendError == BackendError.INVALID_GRANT || backendError == BackendError.SESSIONID_INVALID) {
                            String obj2 = list.toString();
                            String str3 = xVar.c;
                            throw new com.yandex.passport.data.exceptions.m(obj2, str3 != null ? str3 : "");
                        }
                    }
                }
                BackendError backendError2 = xVar.a;
                if (backendError2 != null) {
                    com.yandex.plus.core.locale.b.v(backendError2);
                    throw null;
                }
                Iterator it = list2.iterator();
                if (!it.hasNext()) {
                    b6e.l(list, "Internal error: Can't throw exception for error list ");
                    return null;
                }
                BackendError backendError3 = (BackendError) it.next();
                com.yandex.passport.common.network.a aVar = BackendError.Companion;
                com.yandex.plus.core.locale.b.v(backendError3);
                throw null;
            case 2:
            case 4:
            default:
                ((i0) obj).getClass();
                iVar.getClass();
                return com.yandex.plus.core.network.api.utils.a.U(iVar);
            case 3:
                ((n) obj).getClass();
                iVar.getClass();
                if (iVar instanceof com.yandex.passport.common.network.h) {
                    String str4 = ((r) ((com.yandex.passport.common.network.h) iVar).a).a;
                    if (str4 != null && str4.length() > 0 && !str4.equals("-")) {
                        str = str4;
                    }
                    return new com.yandex.passport.common.account.a(str);
                }
                if (!(iVar instanceof com.yandex.passport.common.network.f)) {
                    b6e.s();
                    return null;
                }
                com.yandex.passport.common.network.d0 d0Var = (com.yandex.passport.common.network.d0) ((com.yandex.passport.common.network.f) iVar).a;
                BackendError backendError4 = d0Var.a;
                if (backendError4 != BackendError.INVALID_GRANT) {
                    com.yandex.plus.core.locale.b.v(backendError4);
                    throw null;
                }
                String backendError5 = d0Var.a.toString();
                String str5 = d0Var.b;
                throw new com.yandex.passport.data.exceptions.m(backendError5, str5 != null ? str5 : "");
            case 5:
                ((t) obj).getClass();
                iVar.getClass();
                if (iVar instanceof com.yandex.passport.common.network.h) {
                    String str6 = ((x) ((com.yandex.passport.common.network.h) iVar).a).b;
                    if (str6 != null && str6.length() > 0 && !str6.equals("-")) {
                        str = str6;
                    }
                    return new com.yandex.passport.common.account.a(str);
                }
                if (!(iVar instanceof com.yandex.passport.common.network.f)) {
                    b6e.s();
                    return null;
                }
                com.yandex.passport.common.network.a0 a0Var = (com.yandex.passport.common.network.a0) ((com.yandex.passport.common.network.f) iVar).a;
                a0Var.getClass();
                throw new com.yandex.passport.data.exceptions.h(a0Var.b + ' ' + a0Var.c);
            case 6:
                ((c0) obj).getClass();
                iVar.getClass();
                return com.yandex.plus.core.network.api.utils.a.U(iVar);
        }
    }

    public void b(View view) {
        view.getClass();
        TextView textView = (TextView) view;
        textView.setTextSize(14.0f);
        ldg.K(textView, R.color.passport_error_slab_text_primary);
        ldg.J(textView, ru.yandex.music.R.font.ya_regular);
        textView.setLineSpacing(TypedValue.applyDimension(2, 1, g4i.a), textView.getLineSpacingMultiplier());
    }

    @Override // com.yandex.passport.data.network.core.e
    public com.yandex.passport.common.network.i g(l3o l3oVar) {
        int i = this.a;
        l3oVar.getClass();
        switch (i) {
            case 0:
                return (com.yandex.passport.common.network.i) com.yandex.passport.data.network.core.q.a.b(new com.yandex.passport.common.network.j(l.Companion.serializer(), com.yandex.passport.common.network.x.Companion.serializer(), 2), com.yandex.plus.pay.ui.core.b.q(l3oVar));
            case 1:
            default:
                return (com.yandex.passport.common.network.i) com.yandex.passport.data.network.core.q.a.b(new com.yandex.passport.common.network.j(x.Companion.serializer(), com.yandex.passport.common.network.a0.Companion.serializer(), 0), com.yandex.plus.pay.ui.core.b.q(l3oVar));
            case 2:
                return (com.yandex.passport.common.network.i) com.yandex.passport.data.network.core.q.a.b(new com.yandex.passport.common.network.j(r.Companion.serializer(), com.yandex.passport.common.network.d0.Companion.serializer(), 1), com.yandex.plus.pay.ui.core.b.q(l3oVar));
        }
    }

    public i(com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a aVar) {
        this.a = 29;
    }

    public /* synthetic */ i(int i) {
        this.a = i;
    }
}
