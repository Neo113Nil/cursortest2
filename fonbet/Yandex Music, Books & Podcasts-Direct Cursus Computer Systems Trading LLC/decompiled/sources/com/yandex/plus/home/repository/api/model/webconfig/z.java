package com.yandex.plus.home.repository.api.model.webconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.w4;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class z implements Parcelable {
    public static final arf[] h;
    public final List a;
    public final boolean b;
    public final v c;
    public final x d;
    public final y e;
    public final String f;
    public final u g;

    @NotNull
    public static final w Companion = new w();

    @NotNull
    public static final Parcelable.Creator<z> CREATOR = new com.yandex.plus.home.repository.api.model.panel.c(24);

    static {
        bwf bwfVar = bwf.b;
        h = new arf[]{btf.a(bwfVar, new w4(29)), null, btf.a(bwfVar, new q(0)), btf.a(bwfVar, new q(1)), btf.a(bwfVar, new q(2)), null, null};
    }

    public /* synthetic */ z(int i, List list, boolean z, v vVar, x xVar, y yVar, String str, u uVar) {
        if (127 != (i & 127)) {
            u7g.V(i, 127, r.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = z;
        this.c = vVar;
        this.d = xVar;
        this.e = yVar;
        this.f = str;
        this.g = uVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.a, zVar.a) && this.b == zVar.b && this.c == zVar.c && this.d == zVar.d && this.e == zVar.e && Intrinsics.d(this.f, zVar.f) && Intrinsics.d(this.g, zVar.g);
    }

    public final int hashCode() {
        int c = k5r.c((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31, 31, this.f);
        u uVar = this.g;
        return c + (uVar == null ? 0 : uVar.hashCode());
    }

    public final String toString() {
        return "Subscription(features=" + this.a + ", isSilentPaymentEnabled=" + this.b + ", buttonType=" + this.c + ", paymentMethod=" + this.d + ", widgetType=" + this.e + ", targetId=" + this.f + ", acquisitionParams=" + this.g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeStringList(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d.name());
        parcel.writeString(this.e.name());
        parcel.writeString(this.f);
        u uVar = this.g;
        if (uVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uVar.writeToParcel(parcel, i);
        }
    }

    public z(List list, boolean z, v vVar, x xVar, y yVar, String str, u uVar) {
        list.getClass();
        vVar.getClass();
        xVar.getClass();
        yVar.getClass();
        str.getClass();
        this.a = list;
        this.b = z;
        this.c = vVar;
        this.d = xVar;
        this.e = yVar;
        this.f = str;
        this.g = uVar;
    }
}
