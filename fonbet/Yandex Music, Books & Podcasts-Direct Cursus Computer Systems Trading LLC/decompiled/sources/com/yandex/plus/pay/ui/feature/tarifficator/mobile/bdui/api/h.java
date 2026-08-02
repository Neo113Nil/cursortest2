package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.repository.api.model.offers.w0;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.su4;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class h implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<h> CREATOR = new w0(20);
    public final UUID a;
    public final g b;
    public final Map c;
    public final Set d;
    public final boolean e;
    public final com.yandex.plus.pay.api.analytics.c f;

    public h(UUID uuid, g gVar, Map map, Set set, boolean z, com.yandex.plus.pay.api.analytics.c cVar) {
        uuid.getClass();
        gVar.getClass();
        map.getClass();
        set.getClass();
        cVar.getClass();
        this.a = uuid;
        this.b = gVar;
        this.c = map;
        this.d = set;
        this.e = z;
        this.f = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.a, hVar.a) && Intrinsics.d(this.b, hVar.b) && Intrinsics.d(this.c, hVar.c) && Intrinsics.d(this.d, hVar.d) && this.e == hVar.e && Intrinsics.d(this.f, hVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + k5r.e(su4.f(this.d, f1d.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31, this.e);
    }

    public final String toString() {
        return "PlusTarifficatorMobileBduiPaywallArguments(purchaseSessionId=" + this.a + ", offerContext=" + this.b + ", externalCallerPayload=" + this.c + ", screensToSkip=" + this.d + ", fallbackIfStartFailed=" + this.e + ", analyticsParams=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.a);
        this.b.writeToParcel(parcel, i);
        Iterator s = com.appsflyer.internal.k.s(this.c, parcel);
        while (s.hasNext()) {
            Map.Entry entry = (Map.Entry) s.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        Set set = this.d;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(((p) it.next()).name());
        }
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeParcelable(this.f, i);
    }
}
