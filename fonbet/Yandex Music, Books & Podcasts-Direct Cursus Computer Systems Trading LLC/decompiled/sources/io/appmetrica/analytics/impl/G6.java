package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* loaded from: classes5.dex */
public final class G6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        EnumC0688ua enumC0688ua;
        Bundle readBundle = parcel.readBundle(ResultReceiverC0685u7.class.getClassLoader());
        if (readBundle.containsKey("CounterReport.Source")) {
            int i = readBundle.getInt("CounterReport.Source");
            EnumC0688ua[] values = EnumC0688ua.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC0688ua = EnumC0688ua.NATIVE;
                    break;
                }
                enumC0688ua = values[i2];
                if (enumC0688ua.a == i) {
                    break;
                }
                i2++;
            }
        } else {
            enumC0688ua = null;
        }
        H6 h6 = new H6("", "", 0);
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        h6.d = readBundle.getInt("CounterReport.Type", -1);
        h6.e = readBundle.getInt("CounterReport.CustomType");
        h6.b = StringUtils.ifIsNullToDef(readBundle.getString("CounterReport.Value"), "");
        h6.c = readBundle.getString("CounterReport.Environment");
        h6.a = readBundle.getString("CounterReport.Event");
        h6.f = H6.a(readBundle);
        h6.g = readBundle.getInt("CounterReport.TRUNCATED");
        h6.h = readBundle.getString("CounterReport.ProfileID");
        h6.i = readBundle.getLong("CounterReport.CreationElapsedRealtime");
        h6.j = readBundle.getLong("CounterReport.CreationTimestamp");
        h6.k = EnumC0458mb.a(Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus")));
        h6.l = enumC0688ua;
        h6.m = readBundle.getBundle("CounterReport.Payload");
        h6.n = readBundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(readBundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        h6.o = readBundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(readBundle.getInt("CounterReport.OpenId")) : null;
        h6.p = CollectionUtils.bundleToMap(readBundle.getBundle("CounterReport.Extras"));
        return h6;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new H6[i];
    }
}
