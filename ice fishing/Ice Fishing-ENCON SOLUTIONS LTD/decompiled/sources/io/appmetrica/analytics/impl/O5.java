package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* loaded from: classes.dex */
public final class O5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        EnumC0583m9 enumC0583m9;
        Bundle readBundle = parcel.readBundle(B6.class.getClassLoader());
        if (readBundle.containsKey("CounterReport.Source")) {
            int i2 = readBundle.getInt("CounterReport.Source");
            EnumC0583m9[] values = EnumC0583m9.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    enumC0583m9 = EnumC0583m9.NATIVE;
                    break;
                }
                enumC0583m9 = values[i3];
                if (enumC0583m9.f6510a == i2) {
                    break;
                }
                i3++;
            }
        } else {
            enumC0583m9 = null;
        }
        P5 p5 = new P5("", "", 0);
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        p5.f4907d = readBundle.getInt("CounterReport.Type", -1);
        p5.f4908e = readBundle.getInt("CounterReport.CustomType");
        p5.f4905b = StringUtils.ifIsNullToDef(readBundle.getString("CounterReport.Value"), "");
        p5.f4906c = readBundle.getString("CounterReport.Environment");
        p5.f4904a = readBundle.getString("CounterReport.Event");
        p5.f4909f = P5.a(readBundle);
        p5.f4910g = readBundle.getInt("CounterReport.TRUNCATED");
        p5.f4911h = readBundle.getString("CounterReport.ProfileID");
        p5.f4912i = readBundle.getLong("CounterReport.CreationElapsedRealtime");
        p5.f4913j = readBundle.getLong("CounterReport.CreationTimestamp");
        p5.f4914k = EnumC0352da.a(Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus")));
        p5.f4915l = enumC0583m9;
        p5.f4916m = readBundle.getBundle("CounterReport.Payload");
        p5.f4917n = readBundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(readBundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        p5.f4918o = readBundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(readBundle.getInt("CounterReport.OpenId")) : null;
        p5.f4919p = CollectionUtils.bundleToMap(readBundle.getBundle("CounterReport.Extras"));
        return p5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        return new P5[i2];
    }
}
