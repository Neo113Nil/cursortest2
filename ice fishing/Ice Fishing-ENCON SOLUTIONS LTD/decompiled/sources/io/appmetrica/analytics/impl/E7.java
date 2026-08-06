package io.appmetrica.analytics.impl;

import android.content.Context;
import i1.AbstractC0253j;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class E7 implements ServiceComponentsInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final List f4348a = AbstractC0253j.B("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint", "io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint", "io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(Context context) {
        Sc sc = C0610na.f6575I.f6601s;
        List list = this.f4348a;
        ArrayList arrayList = new ArrayList(i1.k.E(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0683q5((String) it.next()));
        }
        Object[] array = arrayList.toArray(new C0683q5[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        C0683q5[] c0683q5Arr = (C0683q5[]) array;
        Rc[] rcArr = (Rc[]) Arrays.copyOf(c0683q5Arr, c0683q5Arr.length);
        synchronized (sc) {
            i1.o.F(sc.f5054a, rcArr);
        }
        C0610na.f6575I.f6601s.a(new Ue(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}
