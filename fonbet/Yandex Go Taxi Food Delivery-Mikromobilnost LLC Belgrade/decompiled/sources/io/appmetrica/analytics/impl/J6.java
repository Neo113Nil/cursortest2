package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* loaded from: classes9.dex */
public final class J6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Ba ba;
        Bundle readBundle = parcel.readBundle(ResultReceiverC0904z7.class.getClassLoader());
        if (readBundle.containsKey("CounterReport.Source")) {
            int i = readBundle.getInt("CounterReport.Source");
            Ba[] values = Ba.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    ba = Ba.NATIVE;
                    break;
                }
                ba = values[i2];
                if (ba.a == i) {
                    break;
                }
                i2++;
            }
        } else {
            ba = null;
        }
        K6 k6 = new K6("", "", 0);
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        k6.d = readBundle.getInt("CounterReport.Type", -1);
        k6.e = readBundle.getInt("CounterReport.CustomType");
        k6.b = StringUtils.ifIsNullToDef(readBundle.getString("CounterReport.Value"), "");
        k6.c = readBundle.getString("CounterReport.Environment");
        k6.a = readBundle.getString("CounterReport.Event");
        k6.f = K6.a(readBundle);
        k6.g = readBundle.getInt("CounterReport.TRUNCATED");
        k6.h = readBundle.getString("CounterReport.ProfileID");
        k6.i = readBundle.getLong("CounterReport.CreationElapsedRealtime");
        k6.j = readBundle.getLong("CounterReport.CreationTimestamp");
        k6.k = EnumC0821wb.a(Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus")));
        k6.l = ba;
        k6.m = readBundle.getBundle("CounterReport.Payload");
        k6.n = readBundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(readBundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        k6.o = readBundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(readBundle.getInt("CounterReport.OpenId")) : null;
        k6.p = CollectionUtils.bundleToMap(readBundle.getBundle("CounterReport.Extras"));
        return k6;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new K6[i];
    }
}
