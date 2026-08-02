package com.yandex.passport.internal.config.template;

import com.yandex.passport.data.models.s;
import com.yandex.passport.data.network.b6;
import defpackage.c5b;
import defpackage.t75;
import defpackage.u75;
import defpackage.wb7;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public final class g {
    public final wb7 a;

    public g(wb7 wb7Var) {
        wb7Var.getClass();
        this.a = wb7Var;
    }

    public static s a() {
        return new s(t75.c("passport"), u75.h(new Pair("mode", "embeddedauth"), new Pair(Constants.KEY_ACTION, "change_default")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        r8 = kotlin.text.StringsKt__StringsKt.split$default(r8, new java.lang.String[]{"&"}, false, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = kotlin.text.StringsKt__StringsKt.split$default(r0, new java.lang.String[]{"/"}, false, 0, 6, null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [c5b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f b(b6 b6Var) {
        ?? r3;
        ?? r0;
        List split$default;
        List split$default2;
        List split$default3;
        String str = b6Var.a;
        if (str == null || split$default3 == null) {
            r3 = c5b.a;
        } else {
            r3 = new ArrayList();
            for (Object obj : split$default3) {
                if (((String) obj).length() > 0) {
                    r3.add(obj);
                }
            }
        }
        String str2 = b6Var.b;
        if (str2 == null || split$default == null) {
            r0 = c5b.a;
        } else {
            r0 = new ArrayList();
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                split$default2 = StringsKt__StringsKt.split$default((String) it.next(), new String[]{"="}, false, 0, 6, null);
                if (split$default2.size() != 2) {
                    split$default2 = null;
                }
                Pair pair = split$default2 != null ? new Pair(split$default2.get(0), split$default2.get(1)) : null;
                if (pair != null) {
                    r0.add(pair);
                }
            }
        }
        return new f(r3, r0);
    }
}
