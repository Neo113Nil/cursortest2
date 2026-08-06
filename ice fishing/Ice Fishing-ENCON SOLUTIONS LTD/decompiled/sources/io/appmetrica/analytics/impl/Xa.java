package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Xa implements Parcelable {
    public static final Parcelable.Creator<Xa> CREATOR = new Wa();

    /* renamed from: a, reason: collision with root package name */
    public final ResultReceiver f5386a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5387b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5388c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5389d;

    public Xa(B6 b6, List list, Map map, boolean z2) {
        this.f5387b = list;
        this.f5386a = b6;
        this.f5388c = map == null ? new HashMap() : new HashMap(map);
        this.f5389d = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f5386a);
        if (this.f5387b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f5387b));
        }
        HashMap hashMap = this.f5388c;
        if (hashMap != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", Fm.a((Map) hashMap));
        }
        bundle.putBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration", this.f5389d);
        parcel.writeBundle(bundle);
    }

    public Xa(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(B6.class.getClassLoader());
        if (readBundle != null) {
            this.f5386a = (ResultReceiver) readBundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f5387b = readBundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f5388c = Fm.a(readBundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            this.f5389d = readBundle.getBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration");
            return;
        }
        this.f5388c = new HashMap();
    }
}
