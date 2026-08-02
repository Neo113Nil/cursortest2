package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.jj4;
import defpackage.u75;
import defpackage.v75;
import defpackage.z75;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.x8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0773x8 implements ServiceComponentsInitializer {
    public final List a = u75.h("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint", "io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint", "io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(@NotNull Context context) {
        C0779xe c0779xe = C0747wb.I.s;
        List list = this.a;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0338i6((String) it.next()));
        }
        Object[] array = arrayList.toArray(new C0338i6[0]);
        if (array == null) {
            jj4.j("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return;
        }
        C0338i6[] c0338i6Arr = (C0338i6[]) array;
        C0338i6[] c0338i6Arr2 = (C0338i6[]) Arrays.copyOf(c0338i6Arr, c0338i6Arr.length);
        synchronized (c0779xe) {
            z75.u(c0779xe.a, c0338i6Arr2);
        }
    }
}
