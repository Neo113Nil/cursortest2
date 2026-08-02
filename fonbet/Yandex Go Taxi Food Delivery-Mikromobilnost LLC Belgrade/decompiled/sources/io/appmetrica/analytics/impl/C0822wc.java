package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.wc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0822wc implements Parcelable {
    public static final Parcelable.Creator<C0822wc> CREATOR = new C0793vc();
    public final ResultReceiver a;
    public final List b;
    public final HashMap c;
    public final boolean d;

    public C0822wc(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(ResultReceiverC0904z7.class.getClassLoader());
        if (readBundle == null) {
            this.c = new HashMap();
            return;
        }
        this.a = (ResultReceiver) readBundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
        this.b = readBundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
        this.c = AbstractC0230bq.a(readBundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
        this.d = readBundle.getBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.a);
        if (this.b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.b));
        }
        HashMap hashMap = this.c;
        if (hashMap != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", AbstractC0230bq.a((Map) hashMap));
        }
        bundle.putBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration", this.d);
        parcel.writeBundle(bundle);
    }

    public C0822wc(ResultReceiverC0904z7 resultReceiverC0904z7, List list, Map map, boolean z) {
        HashMap hashMap;
        this.b = list;
        this.a = resultReceiverC0904z7;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        this.c = hashMap;
        this.d = z;
    }
}
