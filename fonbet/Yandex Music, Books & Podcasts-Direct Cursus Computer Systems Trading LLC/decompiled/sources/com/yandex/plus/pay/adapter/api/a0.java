package com.yandex.plus.pay.adapter.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.btf;
import defpackage.bwf;
import defpackage.t9f;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class a0 implements d0 {

    @NotNull
    public static final a0 INSTANCE = new a0();

    @NotNull
    public static final Parcelable.Creator<a0> CREATOR = new com.yandex.plus.home.repository.api.model.panel.c(29);
    public static final /* synthetic */ Object a = btf.a(bwf.b, new com.yandex.plus.home.repository.api.model.webconfig.q(8));

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @NotNull
    public final t9f serializer() {
        return (t9f) a.getValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
