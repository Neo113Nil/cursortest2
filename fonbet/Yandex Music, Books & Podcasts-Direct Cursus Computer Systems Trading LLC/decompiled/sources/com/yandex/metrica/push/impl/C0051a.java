package com.yandex.metrica.push.impl;

import android.content.Context;
import defpackage.u75;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* renamed from: com.yandex.metrica.push.impl.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0051a {
    private static final List<InterfaceC0057d> a = u75.h(new C0053b(), new C0061f());

    public static final int a() {
        Integer num;
        List<InterfaceC0057d> list = a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            try {
                num = Integer.valueOf(((InterfaceC0057d) it.next()).a());
            } catch (Throwable unused) {
                num = null;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        Integer num2 = (Integer) CollectionsKt.firstOrNull(arrayList);
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    public static final String b() {
        String str;
        List<InterfaceC0057d> list = a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            try {
                str = ((InterfaceC0057d) it.next()).b();
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        String str2 = (String) CollectionsKt.firstOrNull(arrayList);
        return str2 != null ? str2 : "";
    }

    public static final boolean c() {
        boolean z;
        List<InterfaceC0057d> list = a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            try {
                z = ((InterfaceC0057d) it.next()).d();
            } catch (Throwable unused) {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static final void d() {
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0057d) it.next()).c();
            } catch (Throwable unused) {
            }
        }
    }

    public static final void a(int i, String str, String str2, Map<String, String> map) {
        str.getClass();
        str2.getClass();
        map.getClass();
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0057d) it.next()).a(i, str, str2, map);
            } catch (Throwable unused) {
            }
        }
    }

    public static final InterfaceC0059e a(Context context, String str) {
        Object obj;
        InterfaceC0059e a2;
        context.getClass();
        str.getClass();
        Iterator<T> it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            try {
                ((InterfaceC0057d) obj).d();
                break;
            } catch (Throwable unused) {
            }
        }
        InterfaceC0057d interfaceC0057d = (InterfaceC0057d) obj;
        return (interfaceC0057d == null || (a2 = interfaceC0057d.a(context, str)) == null) ? new C0065h() : a2;
    }
}
