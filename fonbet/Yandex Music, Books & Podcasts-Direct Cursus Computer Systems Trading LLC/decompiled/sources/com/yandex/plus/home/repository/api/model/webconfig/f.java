package com.yandex.plus.home.repository.api.model.webconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.w4;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class f implements Parcelable {
    public static final arf[] e;
    public final String a;
    public final String b;
    public final com.yandex.plus.core.data.common.v c;
    public final com.yandex.plus.core.data.common.v d;

    @NotNull
    public static final e Companion = new e();

    @NotNull
    public static final Parcelable.Creator<f> CREATOR = new com.yandex.plus.home.repository.api.model.panel.c(19);

    static {
        bwf bwfVar = bwf.b;
        e = new arf[]{null, null, btf.a(bwfVar, new w4(26)), btf.a(bwfVar, new w4(27))};
    }

    public /* synthetic */ f(int i, String str, String str2, com.yandex.plus.core.data.common.v vVar, com.yandex.plus.core.data.common.v vVar2) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, d.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = vVar;
        this.d = vVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.a, fVar.a) && Intrinsics.d(this.b, fVar.b) && Intrinsics.d(this.c, fVar.c) && Intrinsics.d(this.d, fVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int f = com.appsflyer.internal.k.f(this.c, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        com.yandex.plus.core.data.common.v vVar = this.d;
        return f + (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "PayButton(trialText=" + this.a + ", noTrialText=" + this.b + ", textColor=" + this.c + ", backgroundColor=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }

    public f(String str, String str2, com.yandex.plus.core.data.common.v vVar, com.yandex.plus.core.data.common.v vVar2) {
        vVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = vVar;
        this.d = vVar2;
    }
}
