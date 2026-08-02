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
public final class p implements Parcelable {
    public final k a;
    public final o b;
    public final com.yandex.plus.core.data.common.c c;
    public final com.yandex.plus.core.data.common.v d;

    @NotNull
    public static final h Companion = new h();

    @NotNull
    public static final Parcelable.Creator<p> CREATOR = new com.yandex.plus.home.repository.api.model.panel.c(20);
    public static final arf[] e = {null, null, null, btf.a(bwf.b, new w4(28))};

    public /* synthetic */ p(int i, k kVar, o oVar, com.yandex.plus.core.data.common.c cVar, com.yandex.plus.core.data.common.v vVar) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, g.a.getDescriptor());
            throw null;
        }
        this.a = kVar;
        this.b = oVar;
        this.c = cVar;
        this.d = vVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.a, pVar.a) && Intrinsics.d(this.b, pVar.b) && Intrinsics.d(this.c, pVar.c) && Intrinsics.d(this.d, pVar.d);
    }

    public final int hashCode() {
        k kVar = this.a;
        int hashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        o oVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (oVar != null ? oVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "PayInfo(legalInfo=" + this.a + ", oneClickLegalInfo=" + this.b + ", textColor=" + this.c + ", backgroundColor=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        k kVar = this.a;
        if (kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kVar.writeToParcel(parcel, i);
        }
        o oVar = this.b;
        if (oVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oVar.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }

    public p(k kVar, o oVar, com.yandex.plus.core.data.common.c cVar, com.yandex.plus.core.data.common.v vVar) {
        cVar.getClass();
        vVar.getClass();
        this.a = kVar;
        this.b = oVar;
        this.c = cVar;
        this.d = vVar;
    }
}
