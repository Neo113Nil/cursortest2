package com.yandex.plus.pay.api.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import com.yandex.plus.pay.adapter.api.b0;
import defpackage.dfi;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class d implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new b0(4);
    public final String a;
    public final String b;
    public final String c;
    public final Map d;

    public d(String str, String str2, String str3, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder("PlusPayPaymentAnalyticsParams(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        return dfi.i(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Iterator s = k.s(this.d, parcel);
        while (s.hasNext()) {
            Map.Entry entry = (Map.Entry) s.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
