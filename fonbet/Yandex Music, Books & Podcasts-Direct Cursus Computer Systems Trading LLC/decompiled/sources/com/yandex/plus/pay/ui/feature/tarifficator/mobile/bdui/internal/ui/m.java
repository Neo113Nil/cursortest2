package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class m implements n {

    @NotNull
    public static final Parcelable.Creator<m> CREATOR = new l(0);
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.h a;

    public m(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.h hVar) {
        hVar.getClass();
        this.a = hVar;
    }

    @Override // com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.n
    public final UUID F() {
        return this.a.a;
    }

    @Override // com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.n
    public final Map V() {
        return this.a.c;
    }

    @Override // com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.n
    public final Set Z() {
        return this.a.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.a, ((m) obj).a);
    }

    @Override // com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.n
    public final String getEventSessionId() {
        return this.a.f.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Paywall(args=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
    }
}
