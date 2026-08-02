package com.yandex.plus.core.data.pay;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.btf;
import defpackage.bwf;
import defpackage.t9f;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class p implements l {

    @NotNull
    public static final p INSTANCE = new p();

    @NotNull
    public static final Parcelable.Creator<p> CREATOR = new com.yandex.plus.core.benchmark.g(18);
    public static final /* synthetic */ Object a = btf.a(bwf.b, new com.yandex.plus.bdui.plus.shared.serializer.d(22));

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
