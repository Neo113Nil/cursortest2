package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.nl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621nl implements InterfaceC0726rn {

    /* renamed from: d, reason: collision with root package name */
    public static final long f6631d = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: a, reason: collision with root package name */
    public final Context f6632a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f6633b;

    /* renamed from: c, reason: collision with root package name */
    public final CachedDataProvider.CachedData f6634c;

    public C0621nl(Context context) {
        long j2 = f6631d;
        this.f6634c = new CachedDataProvider.CachedData(j2, j2, "sim-info");
        this.f6632a = context;
        this.f6633b = C0610na.k().j();
    }

    public final C0491il b() {
        return new C0491il((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f6632a, "phone", "getting SimMcc", "TelephonyManager", new C0517jl()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f6632a, "phone", "getting SimMnc", "TelephonyManager", new C0543kl()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f6632a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C0595ml(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f6632a, "phone", "getting SimOperatorName", "TelephonyManager", new C0569ll()));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0726rn
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized List<C0491il> a() {
        List<C0491il> list;
        try {
            List<C0491il> list2 = (List) this.f6634c.getData();
            if (list2 != null) {
                boolean isEmpty = list2.isEmpty();
                list = list2;
                if (isEmpty) {
                    list = list2;
                    if (this.f6634c.shouldUpdateData()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (C0610na.f6575I.f6602u.b().f6015n.f6417d) {
                if (AndroidUtils.isApiAchieved(23)) {
                    if (this.f6633b.hasPermission(this.f6632a, "android.permission.READ_PHONE_STATE")) {
                        arrayList.addAll(C0647ol.a(this.f6632a));
                    }
                    if (arrayList.size() == 0) {
                        arrayList.add(b());
                    }
                } else {
                    arrayList.add(b());
                }
            }
            this.f6634c.setData(arrayList);
            list = arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }
}
