package io.appmetrica.analytics.impl;

import android.content.Context;
import com.google.android.gms.location.DeviceOrientationRequest;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class Lo implements Nq {
    public static final long d = DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
    public final Context a;
    public final PermissionExtractor b;
    public final CachedDataProvider.CachedData c;

    public Lo(Context context) {
        long j = d;
        this.c = new CachedDataProvider.CachedData(j, j, "sim-info");
        this.a = context;
        this.b = Jb.k().j();
    }

    public final Go b() {
        return new Go((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "phone", "getting SimMcc", "TelephonyManager", new Ho()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "phone", "getting SimMnc", "TelephonyManager", new Io()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new Ko(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "phone", "getting SimOperatorName", "TelephonyManager", new Jo()));
    }

    @Override // io.appmetrica.analytics.impl.Nq
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized List<Go> a() {
        List<Go> list;
        try {
            List<Go> list2 = (List) this.c.getData();
            if (list2 != null) {
                boolean isEmpty = list2.isEmpty();
                list = list2;
                if (isEmpty) {
                    list = list2;
                    if (this.c.shouldUpdateData()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (Jb.I.u.a().o.d) {
                if (AndroidUtils.isApiAchieved(23)) {
                    if (this.b.hasPermission(this.a, "android.permission.READ_PHONE_STATE")) {
                        arrayList.addAll(Mo.a(this.a));
                    }
                    if (arrayList.size() == 0) {
                        arrayList.add(b());
                    }
                } else {
                    arrayList.add(b());
                }
            }
            this.c.setData(arrayList);
            list = arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }
}
