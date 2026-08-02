package com.yandex.plus.pay.adapter.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class u implements d0 {
    public final f0 a;

    @NotNull
    public static final t Companion = new t();

    @NotNull
    public static final Parcelable.Creator<u> CREATOR = new com.yandex.plus.home.repository.api.model.panel.c(26);
    public static final arf[] b = {btf.a(bwf.b, new com.yandex.plus.home.repository.api.model.webconfig.q(6))};

    public /* synthetic */ u(int i, f0 f0Var) {
        if (1 == (i & 1)) {
            this.a = f0Var;
        } else {
            u7g.V(i, 1, s.a.getDescriptor());
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
        return (obj instanceof u) && this.a == ((u) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Backend(kind=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
    }

    public u(f0 f0Var) {
        f0Var.getClass();
        this.a = f0Var;
    }
}
