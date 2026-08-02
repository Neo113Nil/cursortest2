package com.yandex.plus.core.templating.render;

import android.net.Uri;
import defpackage.q5b;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class b0 implements a {
    public final com.yandex.plus.core.templating.parser.b a;

    public b0(com.yandex.plus.core.templating.parser.b bVar) {
        bVar.getClass();
        this.a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (r0 != null) goto L33;
     */
    @Override // com.yandex.plus.core.templating.render.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair b(Object obj) {
        Object e0Var;
        Object obj2;
        Uri uri = (Uri) obj;
        uri.getClass();
        String uri2 = uri.toString();
        uri2.getClass();
        com.yandex.plus.core.templating.parser.b bVar = this.a;
        bVar.getClass();
        ArrayList r = ((com.yandex.plus.bdui.plus.content.controller.f) bVar).r(uri2);
        if (!r.isEmpty() && !r.isEmpty()) {
            Iterator it = r.iterator();
            while (it.hasNext()) {
                if (!(((com.yandex.plus.core.templating.template.d) it.next()) instanceof com.yandex.plus.core.templating.template.b)) {
                    e0Var = new d0(r);
                    break;
                }
            }
        }
        e0Var = new e0(uri2);
        ArrayList arrayList = e0Var instanceof d0 ? ((d0) e0Var).a : null;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (obj3 instanceof com.yandex.plus.core.templating.template.c) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((com.yandex.plus.core.templating.template.c) it2.next()).a);
            }
            obj2 = CollectionsKt.A0(arrayList3);
        }
        obj2 = q5b.a;
        return new Pair(obj2, e0Var);
    }
}
