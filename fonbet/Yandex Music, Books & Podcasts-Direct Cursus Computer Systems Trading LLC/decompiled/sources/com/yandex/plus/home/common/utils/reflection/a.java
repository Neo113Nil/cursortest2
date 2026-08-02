package com.yandex.plus.home.common.utils.reflection;

import defpackage.ern;
import defpackage.f9f;
import defpackage.leu;
import defpackage.u75;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public abstract class a {
    public static final Set a;

    static {
        List h = u75.h(ern.a(Boolean.TYPE), ern.a(Character.class), ern.a(Byte.TYPE), ern.a(Short.TYPE), ern.a(Integer.class), ern.a(Long.TYPE), ern.a(Float.TYPE), ern.a(Double.TYPE), ern.a(Void.class));
        ArrayList arrayList = new ArrayList(v75.o(h, 10));
        Iterator it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(leu.Q((f9f) it.next()));
        }
        a = CollectionsKt.A0(arrayList);
    }
}
