package io.appmetrica.analytics.impl;

import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.rr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0692rr {
    public static final C0606or a(Throwable th, C0204b0 c0204b0, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        C0317er a = th != null ? AbstractC0346fr.a(th, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Yo((StackTraceElement) it.next()));
            }
        }
        return new C0606or(a, c0204b0, arrayList, null, null, null, str, bool);
    }
}
