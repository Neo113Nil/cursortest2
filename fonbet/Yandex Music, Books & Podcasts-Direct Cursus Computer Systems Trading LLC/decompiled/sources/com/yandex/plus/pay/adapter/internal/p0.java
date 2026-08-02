package com.yandex.plus.pay.adapter.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class p0 implements com.yandex.plus.pay.adapter.api.d {
    public final PlusPayLegalInfo.Item.Text a;

    @NotNull
    public static final n0 Companion = new n0();

    @NotNull
    public static final Parcelable.Creator<p0> CREATOR = new o0();

    public /* synthetic */ p0(int i, PlusPayLegalInfo.Item.Text text) {
        if (1 == (i & 1)) {
            this.a = text;
        } else {
            u7g.V(i, 1, m0.a.getDescriptor());
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && Intrinsics.d(this.a, ((p0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LegalInfoItemTextImpl(actualItem=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
    }

    public p0(PlusPayLegalInfo.Item.Text text) {
        text.getClass();
        this.a = text;
    }
}
