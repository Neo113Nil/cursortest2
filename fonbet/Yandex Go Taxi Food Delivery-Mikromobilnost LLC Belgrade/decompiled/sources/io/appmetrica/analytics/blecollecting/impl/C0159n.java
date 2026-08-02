package io.appmetrica.analytics.blecollecting.impl;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.scc;
import io.appmetrica.analytics.blewrapper.internal.result.BleData;
import io.appmetrica.analytics.blewrapper.internal.result.BleScanResult;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.blecollecting.impl.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0159n {
    public final SharedPreferences a;
    public final List b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0159n(Context context, G g) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("io.appmetrica.analytics.blecollecting.DATA_SHARED_PREFERENCES_NAME", 0);
        this.a = sharedPreferences;
        int i = 1;
        int i2 = 64;
        DefaultConstructorMarker defaultConstructorMarker = null;
        F f = null;
        this.b = scc.g(new C0146a(context, g.a(), g.b(), g.d(), new C0147b(null, i, 0 == true ? 1 : 0), sharedPreferences, f, i2, defaultConstructorMarker), new K(context, g.a(), g.c(), g.d(), new C0147b(0 == true ? 1 : 0, i, 0 == true ? 1 : 0), sharedPreferences, f, i2, defaultConstructorMarker));
    }

    public final void a(BleScanResult bleScanResult, long j) {
        List<BleData> data = bleScanResult.getData();
        Integer num = bleScanResult.getCom.google.android.gms.fido.u2f.api.common.ErrorResponseData.JSON_ERROR_CODE java.lang.String();
        if (data.isEmpty() && num != null) {
            long j2 = this.a.getLong("reportIndex", 0L);
            SharedPreferences.Editor edit = this.a.edit();
            edit.putLong("reportIndex", 1 + j2);
            edit.apply();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((J) it.next()).a(num.intValue(), j, j2);
            }
            return;
        }
        for (BleData bleData : data) {
            long j3 = this.a.getLong("reportIndex", 0L);
            SharedPreferences.Editor edit2 = this.a.edit();
            edit2.putLong("reportIndex", j3 + 1);
            edit2.apply();
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                ((J) it2.next()).a(bleData, j, j3);
            }
        }
    }
}
