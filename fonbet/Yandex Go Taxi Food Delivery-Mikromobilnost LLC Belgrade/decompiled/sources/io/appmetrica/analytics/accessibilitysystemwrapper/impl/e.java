package io.appmetrica.analytics.accessibilitysystemwrapper.impl;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.view.accessibility.AccessibilityManager;
import defpackage.oyr;
import io.appmetrica.analytics.accessibilitysystemwrapper.impl.e;
import io.appmetrica.analytics.accessibilitysystemwrapper.internal.AccessibilityServices;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class e implements b {
    public final Context a;

    public e(Context context) {
        this.a = context;
    }

    public static List a(final AccessibilityManager accessibilityManager, final int i) {
        ServiceInfo serviceInfo;
        List list = (List) SystemServiceUtils.accessSystemServiceSafely(accessibilityManager, oyr.i(i, "getEnabledAccessibilityServiceList for feedbackType "), "AccessibilityManager", new FunctionWithThrowable() { // from class: f271
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            /* renamed from: apply */
            public final Object mo489apply(Object obj) {
                return e.a(accessibilityManager, i, (AccessibilityManager) obj);
            }
        });
        if (list == null) {
            return EmptyList.a;
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
    public final AccessibilityServices a() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getSystemService(AccessibilityManager.class);
        return new AccessibilityServices(a(accessibilityManager, 4), a(accessibilityManager, 16), a(accessibilityManager, 2), a(accessibilityManager, 1), a(accessibilityManager, 8), a(accessibilityManager, 32));
    }

    public static final List a(AccessibilityManager accessibilityManager, int i, AccessibilityManager accessibilityManager2) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i);
    }
}
