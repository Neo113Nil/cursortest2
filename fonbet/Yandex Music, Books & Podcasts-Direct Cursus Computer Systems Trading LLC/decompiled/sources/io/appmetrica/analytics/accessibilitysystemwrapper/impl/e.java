package io.appmetrica.analytics.accessibilitysystemwrapper.impl;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.view.accessibility.AccessibilityManager;
import defpackage.c5b;
import defpackage.jrb;
import defpackage.k5r;
import io.appmetrica.analytics.accessibilitysystemwrapper.internal.AccessibilityServices;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class e implements b {
    public final Context a;

    public e(@NotNull Context context) {
        this.a = context;
    }

    public static List a(AccessibilityManager accessibilityManager, int i) {
        ServiceInfo serviceInfo;
        List list = (List) SystemServiceUtils.accessSystemServiceSafely(accessibilityManager, k5r.i(i, "getEnabledAccessibilityServiceList for feedbackType "), "AccessibilityManager", new jrb(accessibilityManager, i, 7));
        if (list == null) {
            return c5b.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = ((AccessibilityServiceInfo) it.next()).getResolveInfo();
            String str = (resolveInfo == null || (serviceInfo = resolveInfo.serviceInfo) == null) ? null : serviceInfo.name;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // io.appmetrica.analytics.accessibilitysystemwrapper.impl.b
    @NotNull
    public final AccessibilityServices a() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getSystemService(AccessibilityManager.class);
        return new AccessibilityServices(a(accessibilityManager, 4), a(accessibilityManager, 16), a(accessibilityManager, 2), a(accessibilityManager, 1), a(accessibilityManager, 8), a(accessibilityManager, 32));
    }

    public static final List a(AccessibilityManager accessibilityManager, int i, AccessibilityManager accessibilityManager2) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i);
    }
}
