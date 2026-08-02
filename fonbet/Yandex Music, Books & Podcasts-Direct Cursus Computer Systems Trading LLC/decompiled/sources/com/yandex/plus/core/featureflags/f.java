package com.yandex.plus.core.featureflags;

import defpackage.uah;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public final class f implements s {
    public final a a;

    public f(a aVar) {
        this.a = aVar;
    }

    public static Map g(Set set) {
        List split$default;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            split$default = StringsKt__StringsKt.split$default((String) it.next(), new String[]{"="}, false, 2, 2, null);
            Pair pair = (split$default.size() < 2 || StringsKt.U((CharSequence) split$default.get(0)) || ((CharSequence) split$default.get(1)).length() <= 0) ? null : new Pair(split$default.get(0), split$default.get(1));
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return uah.n(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        r5 = kotlin.text.StringsKt__StringsKt.split$default(r5, new java.lang.String[]{io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA}, false, 0, 6, null);
     */
    @Override // com.yandex.plus.core.featureflags.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Set a(String str) {
        List<String> split$default;
        Set f = f();
        if (f == null || (r5 = (String) g(f).get(str)) == null || split$default == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : split$default) {
            if (str2.length() == 0) {
                str2 = null;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        return CollectionsKt.A0(arrayList);
    }

    @Override // com.yandex.plus.core.featureflags.s
    public final Float b(String str) {
        String str2;
        Set f = f();
        if (f == null || (str2 = (String) g(f).get(str)) == null) {
            return null;
        }
        return kotlin.text.b.i(str2);
    }

    @Override // com.yandex.plus.core.featureflags.s
    public final Boolean c(String str) {
        Set f = f();
        if (f == null) {
            return null;
        }
        if (f.contains(str)) {
            return Boolean.TRUE;
        }
        String str2 = (String) g(f).get(str);
        if (str2 != null) {
            return StringsKt.p0(str2);
        }
        return null;
    }

    @Override // com.yandex.plus.core.featureflags.s
    public final String d(String str) {
        Set f = f();
        if (f == null) {
            return null;
        }
        return (String) g(f).get(str);
    }

    @Override // com.yandex.plus.core.featureflags.s
    public final Integer e(String str) {
        String str2;
        Set f = f();
        if (f == null || (str2 = (String) g(f).get(str)) == null) {
            return null;
        }
        return StringsKt.toIntOrNull(str2);
    }

    public final Set f() {
        w wVar = this.a.b.d;
        if (wVar != null) {
            return wVar.get().a;
        }
        return null;
    }
}
