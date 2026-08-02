package com.yandex.metrica.push.impl;

import android.content.Context;
import defpackage.u75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: com.yandex.metrica.push.impl.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0067i {
    private static final List<InterfaceC0073l> a = u75.h(new C0071k(), new C0075m());

    public static final String a(Context context) {
        String str;
        context.getClass();
        List<InterfaceC0073l> list = a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            try {
                str = ((InterfaceC0073l) it.next()).b(context);
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return (String) CollectionsKt.firstOrNull(arrayList);
    }

    public static final String b(Context context) {
        String str;
        context.getClass();
        List<InterfaceC0073l> list = a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            try {
                str = ((InterfaceC0073l) it.next()).a(context);
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return (String) CollectionsKt.firstOrNull(arrayList);
    }

    public static final C0069j a() {
        C0069j c0069j;
        List<InterfaceC0073l> list = a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            try {
                c0069j = ((InterfaceC0073l) it.next()).a();
            } catch (Throwable unused) {
                c0069j = null;
            }
            if (c0069j != null) {
                arrayList.add(c0069j);
            }
        }
        return (C0069j) CollectionsKt.firstOrNull(arrayList);
    }
}
